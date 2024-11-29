package com.example.common.core.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author arcli
 */
@Getter
@Setter
public class BizException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}