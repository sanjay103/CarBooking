import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ds.supercar.model.places.Branch;


public class Test {

	public static void main(String[] args) {
		/*Configuration config=new Configuration().configure("com/ds/supercar/resources/mappings/locations/branch.hbm.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		*/
		
		Configuration config=new Configuration().configure("com/ds/supercar/resources/mappings/locations/hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Branch branch=new Branch();
		branch.setBranceid(1);
		branch.setName("SBI");
		branch.setFaxnumber("abc12309");
		branch.setContact("bangalore nagwaia");
		
		System.out.println(session.save(branch));
		tx.commit();
	}
}
