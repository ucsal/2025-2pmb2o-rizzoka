package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {

	Map<CustomerType, DiscountPolicy> politicas = new HashMap<>();

	public DiscountCalculator(Map<CustomerType, DiscountPolicy> politicas) {
		this.politicas = politicas;
	}

	public DiscountCalculator() {
		this.politicas.put(CustomerType.REGULAR, new RegularPolicy());
		this.politicas.put(CustomerType.PREMIUM, new PremiumPolicy());
		this.politicas.put(CustomerType.PARTNER, new PartnerPolicy());
	}

	public double apply(double amount, CustomerType type) {
		return politicas.get(type).apply(amount);
	}
}
