package org.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dummy.emp.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		{
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int i=3;
			while(i>=0){
				
		session.beginTransaction();
			System.out.println("name");
			String name = String.valueOf(bf.readLine());
			System.out.println("enter the phno");
			long phno = Long.valueOf(bf.readLine());
			System.out.println("enter the id");
			int empid = Integer.valueOf(bf.readLine());
			System.out.println("emailid");
			String emailid = String.valueOf(bf.readLine());
			Emp emp = new Emp(empid, phno, name, emailid);
			System.out.println("name:" + emp.getName() + "\n id:" + emp.getEmpid() + "\nphno:" + emp.getPhno()
					+ "\nemailid:" + emp.getEmailid());
			session.save(emp);
			session.getTransaction().commit();
			i--;
			}
			session.close();
		}
	}
}
