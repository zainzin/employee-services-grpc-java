package com.github.zainzin.client;

import com.github.zainzin.messages.EmployeeServicesGrpc;
import com.github.zainzin.messages.Messages;
import com.google.protobuf.ByteString;
import com.sun.xml.internal.ws.util.MetadataUtil;
import io.grpc.*;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

import javax.net.ssl.SSLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException, SSLException {
        int port;
        final String PORT = System.getenv("port");
        if (PORT == null || PORT.matches("\\w")) {
            port = 9000;
        } else {
            port = Integer.parseInt(PORT);
        }

        SslContext sslContext = GrpcSslContexts
                .forClient()
                .trustManager(new File("E:\\workspace\\Java\\employee-services-grpc\\src\\main\\resources\\keys\\cert.pem"))
                .build();

        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", port)
                .sslContext(sslContext)
                .build();

        EmployeeServicesGrpc.EmployeeServicesBlockingStub blockingStub = EmployeeServicesGrpc.newBlockingStub(channel);
        EmployeeServicesGrpc.EmployeeServicesStub employeeServicesStub = EmployeeServicesGrpc.newStub(channel);

        // saveEmployee(blockingStub);

        // getAllEmployees(blockingStub);
        int badgeNumber = 1001;
        // getByBadgeNumber(badgeNumber, blockingStub);

        // List<Messages.Employee> employeeList = new ArrayList<>();
        // saveAllEmployee(employeeList, employeeServicesStub);
        uploadPhoto(badgeNumber, employeeServicesStub);
        channel.awaitTermination(2000, TimeUnit.SECONDS);

    }

    private static void saveAllEmployee(List<Messages.Employee> employeeList, EmployeeServicesGrpc.EmployeeServicesStub employeeServicesStub) {
        StreamObserver<Messages.EmployeeRequest> employeeRequestStreamObserver =  employeeServicesStub.saveAll(new StreamObserver<Messages.EmployeeResponse>() {
            @Override
            public void onNext(Messages.EmployeeResponse employeeResponse) {
                System.out.println(employeeResponse.getEmployee());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("COMPLETED");
            }
        });
        for (Messages.Employee emp : employeeList) {
            Messages.EmployeeRequest employeeRequest = Messages.EmployeeRequest.newBuilder().setEmployee(emp).build();
            employeeRequestStreamObserver.onNext(employeeRequest);
        }
        employeeRequestStreamObserver.onCompleted();
    }

    private static void getAllEmployees(EmployeeServicesGrpc.EmployeeServicesBlockingStub blockingStub) {
        Iterator<Messages.EmployeeResponse> all = blockingStub.getAll(Messages.GetAllrequest.newBuilder().build());
        all.forEachRemaining(e -> {
            System.out.println(e.getEmployee());
        });
    }

    private static void getByBadgeNumber(int badgeNumber, EmployeeServicesGrpc.EmployeeServicesBlockingStub blockingStub) {
        Messages.GetByBadgeNumberRequest request = Messages
                .GetByBadgeNumberRequest
                .newBuilder()
                .setBadgeNumber(badgeNumber)
                .build();
        Messages.EmployeeResponse response = blockingStub.getByBadgeNumber(request);
        Messages.Employee employee = response.getEmployee();
        System.out.println(employee.toString());
    }

    private static void uploadPhoto(int badgeNumber, EmployeeServicesGrpc.EmployeeServicesStub employeeServicesStub) {
        Metadata headers = new Metadata();
        Metadata.Key<String> badgeNumberKey = Metadata.Key.of("badgenumber", Metadata.ASCII_STRING_MARSHALLER);
        headers.put(badgeNumberKey, String.valueOf(badgeNumber));

        employeeServicesStub = MetadataUtils.attachHeaders(employeeServicesStub, headers);

        StreamObserver<Messages.AddPhotoRequest> addPhotoRequestStreamObserver = employeeServicesStub.addPhoto(new StreamObserver<Messages.AddPhotoResponse>() {
            @Override
            public void onNext(Messages.AddPhotoResponse addPhotoResponse) {
                System.out.println(addPhotoResponse.getIsSuccess());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("DONE");
            }
        });

        try {
            String path = System.getProperty("user.dir").concat("/src/main/resources/grpc_square.png");
            FileInputStream fileInputStream = new FileInputStream(path);

            while (true) {
                byte[] bytes = new byte[64 * 1024];
                int bytesRead = fileInputStream.read(bytes);

                if (bytesRead == -1) {
                    break;
                }

                if (bytesRead < bytes.length) {
                    byte[] newBytes = new byte[bytesRead];
                    System.arraycopy(bytes, 0, newBytes, 0, bytesRead);
                    bytes = newBytes;
                }

                Messages.AddPhotoRequest addPhotoRequest = Messages.AddPhotoRequest.newBuilder().setData(ByteString.copyFrom(bytes)).build();
                addPhotoRequestStreamObserver.onNext(addPhotoRequest);
            }
            addPhotoRequestStreamObserver.onCompleted();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveEmployee(Messages.Employee employee, EmployeeServicesGrpc.EmployeeServicesBlockingStub blockingStub) {
        Messages.EmployeeRequest req = Messages.EmployeeRequest.newBuilder().setEmployee(employee).build();
        Messages.EmployeeResponse response1 = blockingStub.saveEmployee(req);
        System.out.println(response1.getEmployee());
    }
}
