package com.revature.trms.models_dtos;

public class EmpMessage {
    //Persists messages between employees
    //Many--One Map

    private String empEmailSender;
    private String empEmailReceiver;

    private String messageContent;
}
