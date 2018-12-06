package harryhiber;
import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import java.lang.*;
import java.io.IOException;
import java.sql.*;
import java.util.*;


 public class hiberharry {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

	/*	Class.forName("oracle.jdbc.OracleDriver");

		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@orcl11g.thbs.india.com:1521:ORAC11G", "veera_p",
				"thbs123");*/
		
		
		
		Configuration cobj=new Configuration();
		cobj.configure("hibernate.cfg.xml");
		SessionFactory sfact=cobj.buildSessionFactory();
		Session ses=sfact.openSession();
	
		Criteria cr=ses.createCriteria(objcre.class);		
		
		hiberharry11 o= new hiberharry11();
		Scanner sc = new Scanner(System.in);
		
while(true) {System.out.println();System.out.println();System.out.println();
	System.out.println(" 1 for inserting records\n 2 for getting members of one house\n 3 for count of alive in each group\n 4 for family members of harry \n 5 for faculty who died\n 0 for exit");

	List al;
	Iterator i;
	
	int n= sc.nextInt();
	sc.nextLine();
	switch(n) {
	case 1:  o.insert(ses);break;
	case 2:   al= o.house(cr);
	        	
	i=al.iterator();
	while(i.hasNext()) {
		System.out.println(((objcre)i.next()).getName());
		}
	
	
	break;
	case 3:al=  o.groupby(cr);
	
	 i= al.iterator ();
	 while(i.hasNext()) {
		
		 Object o1 []=(Object[])i.next();
		 
	   System.out.println(o1[0]+"   "+o1[1]);
	 }

 break;
	case 4: al= o.family(cr);
	
	i=al.iterator();
	while(i.hasNext()) {
		System.out.println(((objcre)i.next()));
	}	
       break;
	case 5: al= o.orderby(cr);
	
	i=al.iterator();
	while(i.hasNext()) {
		System.out.println((objcre)i.next());
	}
	break;
	case 0:  System.exit(0);break;
	default: System.out.println("enter correct no");break;
	}
}		

	}

}
