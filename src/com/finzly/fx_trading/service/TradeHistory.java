package com.finzly.fx_trading.service;

import java.util.LinkedHashMap;

import com.finzly.fx_trading.model.UserData;

public class TradeHistory {

	public void showTradeHistory(LinkedHashMap<Long, UserData> history) {

		if (!history.isEmpty()) {
			System.out.printf("%s %15s %23s %16s %25s\n", "TradeNo", "CurrencyPair", "CustomerName", "Amount", "Rate");
			for (UserData obj : history.values()) {
				System.out.format("%2s %15s %28s %20s %20s\n", obj.getTradingNo(), obj.getDetails().getCurrencyPair(),
						obj.getName(), CurrencyConverter.currencyConverter(obj), obj.getDetails().getRate());
			}

		} else
			System.out.println("You haven't done any Trading..");
	}
}
