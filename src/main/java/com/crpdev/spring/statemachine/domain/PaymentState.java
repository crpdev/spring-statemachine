package com.crpdev.spring.statemachine.domain;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.domain
 **/
public enum PaymentState {
    NEW, PRE_AUTH, PRE_AUTH_ERROR, AUTH, AUTH_ERROR
}
