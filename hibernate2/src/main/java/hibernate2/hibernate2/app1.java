package hibernate2.hibernate2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class app1 {
	public static void main(String[] args) {
		Session session=hibernate2config.getSessionFactory().openSession();
		Transaction tran=session.beginTransaction();
		model m=new model(1,"asit");
		model m1=new model(2,"asit1");
		model m2=new model(3,"asit2");
		//m.setName("asit3");
		session.save(m);
		session.save(m1);
		session.save(m2);
		System.out.println("update value");
		m.setName("asit4");
		session.saveOrUpdate(m);
		tran.commit();
		session.close();
		
				
	}

}
