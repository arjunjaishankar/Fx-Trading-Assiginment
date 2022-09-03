package com.finzly.fx_trading.view;

import java.util.Scanner;

import com.finzly.fx_trading.model.CurrencyPair;
import com.finzly.fx_trading.model.TradingDetails;
import com.finzly.fx_trading.model.UserData;

public class GetTradingData {

	Scanner input;
	private String customerName;
	private double amount;
	private String currencyPair;
	private String defaultCurrencyPair;
	private UserData userData;

	public GetTradingData() {
		input = new Scanner(System.in);
	}

	public UserData getTradingDetails(UserData userData) {
		this.userData = userData;
		System.out.print("\nEnter Customer Name :");
		customerName = input.nextLine().trim();
		this.userData.setName(customerName);

		initializeTradingData();

		System.out.print("\nEnter Currency Pair : ");
		checkCurrencyPair();

		System.out.print("\nEnter amount : ");
		checkTransactionAmount();

		return userData;
	}

	private void checkTransactionAmount() {
		amount = input.nextDouble();
		while (amount <= 0) {
			System.out.println("Enter correct amount.");
			amount = input.nextDouble();
		}
		userData.setAmount(amount);

	}

	private void initializeTradingData() {
		TradingDetails obj = new TradingDetails(CurrencyPair.USDINR, 2, 66.00f);
		userData.setDetails(obj);
	}

	private void checkCurrencyPair() {
		currencyPair = input.nextLine().trim();
		defaultCurrencyPair = userData.getDetails().getCurrencyPair().toString();
		while (!(defaultCurrencyPair.equalsIgnoreCase(currencyPair))) {
			System.out.println("\nCurrently USD to INR transaction is allowed" + "\nEnter "
					+ userData.getDetails().getCurrencyPair() + " to go further..");
			currencyPair = input.nextLine().trim();
		}
	}
}
