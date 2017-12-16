package com.hdp.springdemo.model;

/**
 * Created by Tony Huang on 12/15/2017.
 */
public class Error {
    private String  errorCode;
    private String message;

    public String getCode() {
        return errorCode;
    }

    public void setCode(String statusCode) {
        this.errorCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
