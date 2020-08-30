package com.crpdev.spring.statemachine.config.guards;

import com.crpdev.spring.statemachine.domain.PaymentEvent;
import com.crpdev.spring.statemachine.domain.PaymentState;
import com.crpdev.spring.statemachine.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.config.guards
 **/
@Component
public class PaymentGuard implements Guard<PaymentState, PaymentEvent> {
    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> stateContext) {
        return stateContext.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}
