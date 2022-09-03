package com.finzly.fx_trading.model;

public class UserData {

	private long tradingNo;
	private String name;
	private double amount;
	private TradingDetails details;

	public UserData() {
	}

	public UserData(long tradingNo, String name, double amount, TradingDetails details) {
		this.tradingNo = tradingNo;
		this.name = name;
		this.amount = amount;
		this.details = details;
	}

	public long getTradingNo() {
		return tradingNo;
	}

	public void setTradingNo(long tradingNo) {
		this.tradingNo = tradingNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TradingDetails getDetails() {
		return details;
	}

	public void setDetails(TradingDetails details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "UserData [tradingNo=" + tradingNo + ", name=" + name + ", amount=" + amount + ", details=" + details
				+ "]";
	}
}
