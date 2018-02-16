package com.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static int choice,ch=1; 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		User us = new User();
		TwoWheeler tw = new TwoWheeler();
		FourWheeler fw = new FourWheeler();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User details:");
		System.out.println("Enter UserName:");
		us.setUserName(br.readLine());
		System.out.println("Enter Password:");
		us.setPassWord(br.readLine());
		System.out.println("Enter FullName:");
		us.setFullName(br.readLine());
		System.out.println("Enter EmailId:");
		us.setEmailId(br.readLine());
		System.out.println("Enter PhoneNo. :");
		us.setPhoneNumber(Long.valueOf(br.readLine()));
		session.save(us);
		while(ch==1){
		System.out.println("Enter Vehicle type:\n1. Two wheeler\t 2. Four Wheeler");
		choice=Integer.valueOf(br.readLine());
		if(choice==1){
		
		tw.setVehicleName(br.readLine());
		tw.setVehicleNumber(br.readLine());
		tw.setVehicleModel(br.readLine());
		tw.setSteeringHandle(br.readLine());
		tw.setUser(us);
		us.getVehicle().add(tw);
		session.save(tw);
		}
		else
		{
			fw.setUser(us);
			fw.setVehicleName(br.readLine());
			fw.setVehicleNumber(br.readLine());
			fw.setVehicleModel(br.readLine());
			fw.setSteeringWheel(br.readLine());
			us.getVehicle().add(fw);
			session.save(fw);
		}
		System.out.println("TO exit press '0' \t TO continue press '1'");
		ch=Integer.valueOf(br.readLine());
		}
		
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
