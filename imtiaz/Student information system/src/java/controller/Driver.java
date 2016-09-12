package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.DepartAndBatches;
import beans.Master;
import beans.Students;

public class Driver {

	public static void main(String[] args) {
		
		//create bean objects
		//bean 1
		Master master = new Master();
		master.setDepart("Computer System Engineering");
		master.setMasterKey("computer");
		//bean 2
		DepartAndBatches departAndBatches = new DepartAndBatches();
		departAndBatches.setBatch("13");
		departAndBatches.setDepart("computer system");
		//bean 3
		Students st = new Students();
		st.setBatch("13");
		st.setCaste("wassan");
		st.setCnic("4420582182812");
		st.setDepartment("computer system");
		st.setRollNum("13_CS_19");
		st.setFatherName("Sobdar");
		st.setFtContactNum("03001230123");
		st.setGender("male");
		st.setName("Imtiaz Ali");
		st.setPassword("computer");
		st.setPermAdd("Sanghar");
		st.setStContactNum("030023123223");
		st.setStEmail("wassanimtiaz@outlook.com");
		st.setTempAdd("Mallir cantt karachi");
		
		
		//configure cfg xml file
		Configuration cf = new Configuration();
		cf.configure("xmlFiles/hibernate.cfg.xml");
		
		//build session factory
		SessionFactory sf = cf.buildSessionFactory();
		//get session object
		Session session = sf.openSession();
		//get Transaction object
		Transaction tr=session.beginTransaction();
		
		//begin transaction
		//save beans
		session.save(st);
		tr.begin();
		tr.commit();
		session.evict(st);
	
		Transaction tran=session.beginTransaction();
		
		session.save(master);
		tran.begin();
		tran.commit();
		session.evict(master);
//		
		Transaction trans=session.beginTransaction();
		
		session.save(departAndBatches);
		trans.begin();
		trans.commit();
		session.evict(departAndBatches);
		
		session.close();
		sf.close();
	}//end of main method..

}//end of class
