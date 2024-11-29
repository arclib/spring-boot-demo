package com.example.common.core.exception;

/**
 * @author arcli
 */
public interface BaseExceptionInterface {

	/**
     * 异常码
     * @param : 
     * @return String
     */
    String getErrorCode();

	/**
     * 异常消息描述
     * @param : 
     * @return String
     */
    String getErrorMessage();
}