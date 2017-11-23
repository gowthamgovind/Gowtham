package org.grocery.stock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grocery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemSolution {
	public static void main(String[] args) throws IOException {
	
		        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				SessionFactory sf = new Configuration().configure().buildSessionFactory();
				Session session = sf.openSession();
				Item item = session.get(Item.class,1);
				System.out.println(item.getId());
				System.out.println(item.getName());
				System.out.println(item.getQuantity());
				System.out.println(item.getPrice());
				session.beginTransaction();
				session.delete(item);
				session.getTransaction().commit();
				System.out.println("deleted");
				
				
				
				
				
}}
