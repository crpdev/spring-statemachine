package com.crpdev.spring.statemachine.config.actions;

import com.crpdev.spring.statemachine.domain.PaymentEvent;
import com.crpdev.spring.statemachine.domain.PaymentState;
import com.crpdev.spring.statemachine.services.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.config.actions
 **/
@Component
@Slf4j
public class PreAuthAction implements Action<PaymentState, PaymentEvent> {

    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {
           log.debug("<<< Pre Auth was Called for >>> " + stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER));
            if (new Random().nextInt(10) < 8) {
                log.debug("<<< Pre Auth Approved >>>");
                stateContext.getStateMachine().sendEvent(MessageBuilder.withPayload(PaymentEvent.PRE_AUTH_APPROVED)
                        .setHeader(PaymentServiceImpl.PAYMENT_ID_HEADER, stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER))
                        .build());
            } else {
                log.debug("<<< Pre Auth Declined >>>");
                stateContext.getStateMachine().sendEvent(MessageBuilder.withPayload(PaymentEvent.PRE_AUTH_DECLINED)
                        .setHeader(PaymentServiceImpl.PAYMENT_ID_HEADER, stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER))
                        .build());
            }
    }
}
