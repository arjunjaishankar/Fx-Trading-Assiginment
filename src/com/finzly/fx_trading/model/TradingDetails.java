package com.finzly.fx_trading.model;

public class TradingDetails {

	private CurrencyPair currencyPair;
	private int spotDays;
	private float rate;

	public TradingDetails(CurrencyPair currencyPair, int spotDays, float rate) {
		this.currencyPair = currencyPair;
		this.spotDays = spotDays;
		this.rate = rate;
	}

	public CurrencyPair getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(CurrencyPair currencyPair) {
		this.currencyPair = currencyPair;
	}

	public int getSpotDays() {
		return spotDays;
	}

	public void setSpotDays(int spotDays) {
		this.spotDays = spotDays;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

}
