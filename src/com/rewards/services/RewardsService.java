package com.rewards.services;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import com.rewards.model.Customer;
import com.rewards.model.Order;
import com.rewards.model.RewardsDao;

// All the rewards logic goes here 
@Service
public class RewardsService {
	
	private RewardsDao rewardsDao;

	public Customer calcuateRewardPoints(String customerId, Integer month)
	{
		

		Date today = new Date();
		Calendar cal = new GregorianCalendar();
		cal.setTime(today);
		cal.add(Calendar.DAY_OF_MONTH, -90);
		Date today90 = cal.getTime();
		// Obtain all orders for past 90 days
		Customer customerDetails = rewardsDao.fetchCustomerOrderDeptDataLeftJoin(customerId, today90);

		int rewardsPoints = 0; totalRewards = 0;

		while(orderDetailsIterator.hasNext()) {
			Order orderObj = orderDetailsIterator.next();
			
			Double orderTotal = orderObj.getOrderTotal();
			Date orderDate = orderObj.getOrderDate();
			cal.setTime(orderDate);
			int orderMonth = cal.get(Calendar.MONTH);
			
			if(orderMonth == month) {
			// for each order for that customer obtain ordertotal. 
			if(orderTotal > 50 && orderTotal < 100) {
				// 1 reward point
				rewardsPoints = (orderTotal - 50);
			} else if (orderTotal > 100) {
				rewardPoints = ((orderTotal- 100) *2) + (orderTotal - 50);
			}
				totalRewards = totalRewards + rewardPoints;
			
			}

		}
		customerDetails.setRewardPoints(totalRewards);
	
		
		return customerDetails;
	}
	
}
