//student Number : ATE/6100/14

package com.shopwave.shopwave_starter.repository;

import com.shopwave.shopwave_starter.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
