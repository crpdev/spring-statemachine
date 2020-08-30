package com.crpdev.spring.statemachine.domain;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.domain
 **/
public enum PaymentEvent {
    PRE_AUTHORIZE, PRE_AUTH_APPROVED,PRE_AUTH_DECLINED, AUTHORIZE, AUTH_APPROVED, AUTH_DECLINED
}
