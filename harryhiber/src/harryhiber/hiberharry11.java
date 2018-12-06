package harryhiber;
import java.util.*;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class hiberharry11 {
	String name, house, role, status, dies;
	Scanner sc = new Scanner(System.in);
	
	void insert(Session ses) throws SQLException {
	        System.out.println("give no of records to enter");
		  int n=sc.nextInt();sc.nextLine();
	  for (int i = 1; i <=n; i++) { 
		  System.out.println("enter " + i +" record(name,house,role,status,dies)");
	  name = sc.nextLine().toString(); 
	  house = sc.nextLine();
      role = sc.nextLine();
      status = sc.nextLine();
      dies = sc.nextLine();	  
	       
      objcre o1=new objcre ();
     o1.setName(name);
     o1.setDies(dies);o1.setHouse(house);o1.setStatus(status);o1.setRole(role);      
      
      ses.save(o1);
      Transaction t= ses.beginTransaction();
   t.commit();
    }
}	
	  List house(Criteria cr) throws SQLException { 
		  System.out.println("which house u want");
		  String s=sc.nextLine(); 
		  
		  List l2= cr.add(Restrictions.eq("house",s) ).list();
	  return l2;
}
	 
	
	  List groupby(Criteria cr) throws SQLException,ClassNotFoundException,IOException
	  { 
		 // Projection pro1=Projections.property("house");
		  Projection pro2=Projections.count("dies");
		  Projection pro3=Projections.groupProperty("house");
		  ProjectionList pl=Projections.projectionList();
		  //pl.add(pro1);
		  pl.add(pro2); pl.add(pro3);
		  List l= cr.setProjection(pl).add(Restrictions.eq("dies","gd")).list();
		  return l;
	  }
	 
	
 List family(Criteria cr) throws SQLException,IOException,ClassNotFoundException
	{
	 List l2= cr.add(Restrictions.eq("status","fam")).list();	 
	 return l2;
	}
	
 List orderby(Criteria cr) throws SQLException,IOException,ClassNotFoundException
{
	 List l2=cr.add(Restrictions.eq("status","frd")).add(Restrictions.eq("dies", "yes")).list();
	 return l2;
}
}
