package mum.edu.week1ExtraCredit.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import mum.edu.week1ExtraCredit.domain.Volunteer;
import mum.edu.week1ExtraCredit.factory.HibernateUtilFactory;
@Repository
public class VolunteerDAOImpl implements IVolunteerDAO {
	@Override
	public void AddVolunteer(Volunteer volunteer) {

		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.persist(volunteer);
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}

	}
}
