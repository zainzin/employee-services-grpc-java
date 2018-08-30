package com.github.zainzin.server;

import com.github.zainzin.messages.EmployeeServicesGrpc;
import com.github.zainzin.messages.Messages;
import com.github.zainzin.server.repository.EmployeeRepository;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class EmployeeServicesImpl extends EmployeeServicesGrpc.EmployeeServicesImplBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServerInit.class);
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void getByBadgeNumber(Messages.GetByBadgeNumberRequest request, StreamObserver<Messages.EmployeeResponse> responseObserver) {
        int badgeNumber = request.getBadgeNumber();
        Messages.Employee employee = employeeRepository.getEmployeeByBadge(badgeNumber);
        if (employee != null) {
            Messages.EmployeeResponse response = Messages
                    .EmployeeResponse
                    .newBuilder()
                    .setEmployee(employee)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(Status.NOT_FOUND.
                    withDescription("Employee was not found")
                    .asException());
        }
    }

    @Override
    public void getAll(Messages.GetAllrequest request, StreamObserver<Messages.EmployeeResponse> responseObserver) {
        List<Messages.Employee> allEmployees = employeeRepository.getAllEmployees();
        for (Messages.Employee e : allEmployees) {
            responseObserver.onNext(Messages.EmployeeResponse.newBuilder().setEmployee(e).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void saveEmployee(Messages.EmployeeRequest request, StreamObserver<Messages.EmployeeResponse> responseObserver) {
        employeeRepository.saveEmployee(request.getEmployee());
        Messages.EmployeeResponse response = Messages
                .EmployeeResponse
                .newBuilder()
                .setEmployee(request.getEmployee())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Messages.EmployeeRequest> saveAll(StreamObserver<Messages.EmployeeResponse> responseObserver) {
        return new StreamObserver<Messages.EmployeeRequest>() {
            @Override
            public void onNext(Messages.EmployeeRequest employeeRequest) {
                LOGGER.info("SAVE ALL");
                employeeRepository.saveEmployee(employeeRequest.getEmployee());
                Messages.EmployeeResponse response = Messages.EmployeeResponse.newBuilder().setEmployee(employeeRequest.getEmployee()).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                LOGGER.info(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                LOGGER.info("COMPLETED");
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Messages.AddPhotoRequest> addPhoto(StreamObserver<Messages.AddPhotoResponse> responseObserver) {
        return new StreamObserver<Messages.AddPhotoRequest>() {
            private ByteString result;
            @Override
            public void onNext(Messages.AddPhotoRequest addPhotoRequest) {
                if (result == null) {
                    result = addPhotoRequest.getData();
                } else {
                    result = result.concat(addPhotoRequest.getData());
                }
                LOGGER.info("Received Message with " + addPhotoRequest.getData().size() + " bytes");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                LOGGER.info("Total bytes received: " + result.size());
                try (FileOutputStream fos = new FileOutputStream("./Test.png")) {
                    fos.write(result.toByteArray());
                } catch (IOException e) {
                    responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage()).asException());
                    e.printStackTrace();
                }
                responseObserver.onNext(Messages.AddPhotoResponse.newBuilder().setIsSuccess(true).build());
                responseObserver.onCompleted();
            }
        };
    }
}
