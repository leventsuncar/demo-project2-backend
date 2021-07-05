package com.demo2.core.utilities.results;

public class ErrorResult extends Result {

    public ErrorResult(boolean success) {
        super(false);
    }

    public ErrorResult(String message) {
        super(false, message);
    }
}
