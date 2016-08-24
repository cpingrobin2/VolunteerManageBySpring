package mum.edu.week1ExtraCredit.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import mum.edu.week1ExtraCredit.domain.Task;
import mum.edu.week1ExtraCredit.factory.HibernateUtilFactory;
@Repository
public class TaskDAOImpl implements ITaskDAO {
	@Override
	public void addTask(Task task) {

		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.persist(task);
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		}
	}

	@Override
	public List<Task> getTasksByProjectId(int projectId) {
		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Task> tasks = new ArrayList<Task>();
		try {
			tx = session.beginTransaction();
			Query tasktQuery = session.createQuery("FROM Task p WHERE p.project.id = :id");
			tasktQuery.setParameter("id", projectId);

			tasks = tasktQuery.list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		}
		return tasks;
	}

}
