package com.crpdev.spring.statemachine.config.actions;

import com.crpdev.spring.statemachine.domain.PaymentEvent;
import com.crpdev.spring.statemachine.domain.PaymentState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.config.actions
 **/
@Slf4j
@Component
public class AuthApprovedAction implements Action<PaymentState, PaymentEvent> {

    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {
        log.debug("<<< Auth was approved and the transaction is complete >>>");
    }
}
