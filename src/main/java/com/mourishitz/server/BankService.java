package com.mourishitz.server;

import com.mourishitz.models.Balance;
import com.mourishitz.models.BalanceCheckRequest;
import com.mourishitz.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase{

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver) {

        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder()
                .setAmount(AccountDatabase.getBalace(accountNumber))
                .build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }
}
