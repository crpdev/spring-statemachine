package com.crpdev.spring.statemachine.repository;

import com.crpdev.spring.statemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajapandian
 * Date: 30/08/20
 * Project: spring-statemachine
 * Package: com.crpdev.spring.statemachine.repository
 **/
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
