package com.finzly.fx_trading.view;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.finzly.fx_trading.model.UserData;
import com.finzly.fx_trading.service.BookTrade;
import com.finzly.fx_trading.service.TradeHistory;

public class DisplayTradingTasks {

	public void displayTradingTasks() {

		System.out.print("  Welcome to FX-Trading..");
		BookTrade bookTrade = new BookTrade();
		TradeHistory tradeHistoryObj = new TradeHistory();

		LinkedHashMap<Long, UserData> tradeHistory = new LinkedHashMap<>();

		Scanner input = new Scanner(System.in);
		loop: while (true) {
			try {
				System.out.println("\n  Book Trade - 1" + "\n  Print Trades - 2" + "\n  Exit - 3");
				System.out.print("\nEnter choice : ");
				int choice = input.nextInt();
				switch (choice) {
				case 1:
					tradeHistory = bookTrade.bookTrade(tradeHistory);
					break;
				case 2:
					tradeHistoryObj.showTradeHistory(tradeHistory);
					break;
				case 3:
					System.out.println("Do you really want to exit (y/n)");
					String exit = input.next().trim();
					if (exit.equalsIgnoreCase("YES") || exit.equalsIgnoreCase("Y")) {
						System.out.println("Bye - have a good day");
						break loop;
					}
					break;
				default:
					System.out.println("\nEnter Above mentioned Numbers..");
				}
			} catch (Exception e) {
				System.out.println("Something went wrong!!!\n Please enter valid input. ");
				displayTradingTasks();
			}
		}

	}
}
