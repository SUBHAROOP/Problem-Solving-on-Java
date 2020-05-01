package com;

public class Sim {
	private int simId;
	private String customerName;
	private double balance;
	private double ratePerSecond;
	private String circle;

	/**
	 * @return the ratePerSecond
	 */
	public double getRatePerSecond() {
		return ratePerSecond;
	}

	/**
	 * @return the circle
	 */
	public String getCircle() {
		return circle;
	}

	/**
	 * @return the simId
	 */
	public int getSimId() {
		return simId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param circle the circle to set
	 */
	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Sim(int simId, String customerName, double balance, double ratePerSecond, String circle) {
		super();
		this.simId = simId;
		this.customerName = customerName;
		this.balance = balance;
		this.ratePerSecond = ratePerSecond;
		this.circle = circle;
	}

}
