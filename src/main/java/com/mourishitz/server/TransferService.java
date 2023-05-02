package com.mourishitz.server;

import com.mourishitz.models.TransferRequest;
import com.mourishitz.models.TransferResponse;
import com.mourishitz.models.TransferServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TransferService extends TransferServiceGrpc.TransferServiceImplBase {

    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return super.transfer(responseObserver);
    }
}
