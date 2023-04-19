package spring_hibernate_cart1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_hibernate_cart1.dao.Cartdao;
import spring_hibernate_cart1.dto.Cart;
import spring_hibernate_cart1.dto.Config;
import spring_hibernate_cart1.dto.Items;

public class MainCart {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Cart cart = context.getBean("cart", Cart.class);
		
		Cartdao cartDao = context.getBean("cartdao", Cartdao.class);

//		
//		items.setName("shoe");
//		items.setManufacturer("puma");
//		items.setCost(2999);
//		items.setReview("good");
//		
//		List<Items>list = new ArrayList<Items>();
//		list.add(items);
//		
//		cart.setEmail("aks@");
//		cart.setPassword("wer");
//		cart.setList(list);
//		
//		cartDao.saveCart(cart);

		boolean mainexit = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.to add items to cart \n2.to update cart details\n3.to delete cart by id\n"
					+ "4.to get cart by id\n5.to get all cart\n6.to exit");
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter choice");
				System.out.println("1.to add items for new cart\n2.to additems for old cart");
				int cart_choice = sc.nextInt();
				List<Items> list = new ArrayList<Items>();
				if (cart_choice == 1) {

					System.out.println("enter cart details");
					System.out.println("enter mailid");
					cart.setEmail(sc.next());
					System.out.println("enter password");
					cart.setPassword(sc.next());

					boolean itemlist = true;
					do {
						Items items = context.getBean("items", Items.class);
						System.out.println("enter items details");
						System.out.println("enter item name");
						items.setName(sc.next());
						System.out.println("enter item price");
						items.setCost(sc.nextDouble());
						System.out.println("enter item manufacturer");
						items.setManufacturer(sc.next());
						System.out.println("enter item review");
						items.setReview(sc.next());
						list.add(items);
						System.out.println("enter 1 to add more items \nenter 2 to stop");
						int n = sc.nextInt();
						if (n == 2) {
							itemlist = false;
						}
					} while (itemlist);

					

					cart.setList(list);
					cartDao.saveCart(cart);
					System.out.println("inserted");
				} else {
					System.out.println("enter your cart id");
					int id = sc.nextInt();

					Items items = context.getBean("items", Items.class);
					System.out.println("enter new items details");
					System.out.println("enter item name");
					items.setName(sc.next());
					System.out.println("enter item price");
					items.setCost(sc.nextDouble());
					System.out.println("enter item manufacturer");
					items.setManufacturer(sc.next());
					System.out.println("enter item review");
					items.setReview(sc.next());

					list.add(items);

					cartDao.updateCartaddnewItems(id, list);

				}
				break;
			}
			case 2: {
				System.out.println("enter id update to email");
				int id = sc.nextInt();
				System.out.println("enter new name");
				String name = sc.next();

				cartDao.updateCart(id, name);

				break;
			}
			case 3: {
				System.out.println("enter id to delete");
				int id = sc.nextInt();

				cartDao.deleteCart(id);
				break;
			}
			case 4: {
				System.out.println("enter id to view your cart");
				int id = sc.nextInt();

				cartDao.getCartByid(id);
				break;
			}
			case 5: {

				cartDao.displayAllCart();
				break;
			}
			case 6: {
				mainexit = false;
				System.out.println("thank you");
				break;
			}
			}
		} while (mainexit);

	}
}
