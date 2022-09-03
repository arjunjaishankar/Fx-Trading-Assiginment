package com.finzly.fx_trading.service;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.finzly.fx_trading.model.UserData;
import com.finzly.fx_trading.view.GetTradingData;

public class BookTrade {

	static long tradeNo = 0;
	private String transferAmount;
	private String bookingChoice;
	private String getRate;

	public LinkedHashMap<Long, UserData> bookTrade(LinkedHashMap<Long, UserData> history) {

		UserData tradingData = new UserData();
		GetTradingData data = new GetTradingData();

		tradingData = data.getTradingDetails(tradingData);

		transferAmount = CurrencyConverter.currencyConverter(tradingData);

		Scanner input = new Scanner(System.in);

		System.out.println("\nDo you want to get Rate(Y/N)");
		getCurrentRate(input, tradingData);

		System.out.println("\nBook/Cancel this trade?");
		bookingChoice = input.next().trim();

		if (bookingChoice.equalsIgnoreCase("BOOk")) {
			tradeNo++;
			tradingData.setTradingNo(tradeNo);
			history.put(tradeNo, tradingData);
			System.out.println("\n Trade for " + tradingData.getDetails().getCurrencyPair()
					+ " has been booked with rate " + tradingData.getDetails().getRate() + " ,\n The amount of "
					+ transferAmount + " will  be transferred in " + tradingData.getDetails().getSpotDays()
					+ " working days to " + tradingData.getName());
		} else if (bookingChoice.equalsIgnoreCase("CANCEL")) {
			System.out.println("\nLast Trade is Canceled..");
		}
		return history;
	}

	private void getCurrentRate(Scanner input, UserData data) {
		getRate = input.next();
		if (getRate.equalsIgnoreCase("YES") || getRate.equalsIgnoreCase("Y"))
			System.out.println("\nYou are transfering INR " + transferAmount + " to " + data.getName());

	}
}
