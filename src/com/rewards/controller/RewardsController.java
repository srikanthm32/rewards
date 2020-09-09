package com.rewards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rewards.services.RewardsService;

import org.springframework.ui.ModelMap;


@Controller
@RequestMapping("/hello")
@RestController
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public CustomerRewardsDTO printHello(ModelMap model, @RequestParam String customerId ) {
		
		Date rewardsDate = new Date();
		cal.setTime(rewardsDate);
		int orderMonth = cal.get(Calendar.MONTH);
		Customer rewardPoints = rewardsService.calcuateRewardPoints(customerId,orderMonth);
		//model.addAttribute("rewardPoints", rewardPoints);
		
		CustomerRewardsDTO customerRewards = new CustomerRewardsDTO();
		customerRewards.setCustomerName(rewardPoints.getCustomerName());
		customerRewards.setCustomerRewardPoints(rewardPoints.getCustomerRewards().toString());
		customerRewards.setCustomerId(rewardPoints.getCustomerId());
		return "hello";
	}
}