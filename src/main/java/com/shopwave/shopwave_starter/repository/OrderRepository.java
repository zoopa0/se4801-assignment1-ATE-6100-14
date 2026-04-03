//student Number : ATE/6100/14

package com.shopwave.shopwave_starter.repository;

import com.shopwave.shopwave_starter.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
