package project.emp;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends Train {

	public Solution(int tid, String tname, String ttype, int tcost) {
		super(tid, tname, ttype, tcost);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Train tr = new Train(123, "vaigai", "sleeper", 60000);

		System.out.println(tr.getTid());
		System.out.println(tr.getTname());
		System.out.println(tr.getTtype());

		System.out.println(tr.getTcost());
		session.save(tr);
		session.getTransaction().commit();
		session.close();

	}

}