package mum.edu.week1ExtraCredit.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import mum.edu.week1ExtraCredit.domain.Beneficiary;
import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Resource;
import mum.edu.week1ExtraCredit.domain.Task;
import mum.edu.week1ExtraCredit.domain.User;
import mum.edu.week1ExtraCredit.domain.Volunteer;



/**
 * @author Chao Ping
 *
 */
public class HibernateUtilFactory {
private static final SessionFactory sessionFactory;
	
	static{
		try {
			
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Beneficiary.class);
			configuration.addAnnotatedClass(Project.class);
			configuration.addAnnotatedClass(Resource.class);
			configuration.addAnnotatedClass(Task.class);
			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(Volunteer.class);
			configuration.configure();
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			
		} catch (Throwable e) {
			
			e.printStackTrace();	
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
