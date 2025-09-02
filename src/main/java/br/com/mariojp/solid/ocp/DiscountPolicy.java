package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {
	public static double apply(double amount, double discount){
		return amount * discount;
	}
}
