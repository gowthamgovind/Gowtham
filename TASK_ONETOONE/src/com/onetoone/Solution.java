package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Author chetan = new Author();
		chetan.setAuthId(1);
		chetan.setEmailid("chetan@gmail.com");
		chetan.setGender("Male");
		chetan.setName("chetan");
		chetan.setWebUrl("chetan-val.com");
		
		EBook eb = new EBook();
		eb.setBookId(1);
		eb.setDownloadUrl("cheatan.bh6.in");
		eb.setEdition("Edition 1.01");
		eb.setIsbn("1283738123");
		eb.setPrice(1200);
		eb.setPublisher("Chetan");
		eb.setSizeInMb(3);
		eb.setTitle("two states");
		
		PaperBook pb = new PaperBook();
		pb.setBookId(2);
		pb.setEdition("Edition 2");
		pb.setInStock(10);
		pb.setIsbn("12319283");
		pb.setPrice(1560);
		pb.setPublisher("Stringer");
		pb.setShippingWeight(3.5f);
		pb.setTitle("Ruins");
		
		chetan.getBooks().add(eb);
		chetan.getBooks().add(pb);
		
		eb.getAut().add(chetan);
		pb.getAut().add(chetan);
		
		session.beginTransaction();
		session.save(eb);
		session.save(pb);
		session.save(chetan);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}