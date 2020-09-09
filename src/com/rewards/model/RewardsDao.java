package com.rewards.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.rewards.dto.CustomerRewardsDTO;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT new com.rewards.dto(e.name, e.name, e.email, e.address) "
			+ "FROM Order O OUTER JOIN Customers e where e.order_id = o.order_id where c.customer_id = "+ customerId +" and orderDate >= "+orderDate)
	List<CustomerRewardsDTO> fetchCustomerOrderDeptDataLeftJoin(String customerId, String orderDate);

}
