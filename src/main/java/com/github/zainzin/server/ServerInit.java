package com.github.zainzin.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class ServerInit {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServerInit.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        int port;
        final String PORT = System.getenv("port");
        if (PORT == null || PORT.matches("\\w")) {
            port = 9000;
        } else {
            port = Integer.parseInt(PORT);
        }
        File sslKeyFile = new File(System.getProperty("user.dir").concat("/src/main/resources/keys/key.pem"));
        File sslCertFile = new File(System.getProperty("user.dir").concat("/src/main/resources/keys/cert.pem"));
        Server server = ServerBuilder
                .forPort(port)
                .useTransportSecurity(sslCertFile, sslKeyFile)
                .addService(new EmployeeServicesImpl())
                .build();

        server.start();
        LOGGER.info(String.format("Server started on port: %d", port));

        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));
        server.awaitTermination();
    }
}
