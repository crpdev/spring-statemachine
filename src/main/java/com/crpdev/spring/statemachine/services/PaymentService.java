package com.crpdev.spring.statemachine.services;

import com.crpdev.spring.statemachine.domain.Payment;
import com.crpdev.spring.statemachine.domain.PaymentEvent;
import com.crpdev.spring.statemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.services
 **/
public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declinePayment(Long paymentId);
}
