package com.example.demo.model;

public class LoginResultModel {
    Boolean success;
    String failureReason;

    public Boolean getSuccess(){
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFailureReason(){
        return failureReason;
    }

    public void setFailureReason(String failureReason){
        this.failureReason=failureReason;
    }
}
