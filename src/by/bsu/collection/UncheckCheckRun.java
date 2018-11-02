package by.bsu.collection;

import java.util.ArrayList;

public class UncheckCheckRun {
	public static void main(String[] args) {
		ArrayList raw = new ArrayList() { // сырая коллекция - raw type

			{// логический блок анонимного класса
				add(new Order(231, 12.f));
				add(new Item(23154, 120.f, "Xerox"));
				add(new Order(217, 1.7f));
			}
		};
			Order or1 = (Order) raw.get(0);
			Item or2 = (Item) raw.get(1);
			Order or3 = (Order) raw.get(2);
			for (Object ob : raw) {
				System.out.println("raw " + ob);
			}

			ArrayList<Order> orders = new ArrayList<Order>() {
				{
					add(new Order(231, 12.f));
					add(new Order(231, 2.9f));
					add(new Order(217, 1.7f));
					//add(new Order(23154, 120.f, "Xerox"));
				}
			};	
			
		};
	}

