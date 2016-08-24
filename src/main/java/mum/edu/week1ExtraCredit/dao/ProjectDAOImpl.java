package mum.edu.week1ExtraCredit.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Status;
import mum.edu.week1ExtraCredit.factory.HibernateUtilFactory;
@Repository
public class ProjectDAOImpl implements IProjectDAO {
	@Override
	public void AddProject(Project project) {

		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.persist(project);
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}

	}

	@Override
	public List<Project> getProjectByStatus(Status status) {
		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Project> projects = new ArrayList<Project>();
		try {
			tx = session.beginTransaction();
			Query projectQuery = session.createQuery("FROM Project p WHERE p.status = :status");
			projectQuery.setParameter("status", status);

			projects = projectQuery.list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		return projects;
	}

	@Override
	public Project getProjectById(int projectId) {
		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Project project = session.get(Project.class, projectId);
			tx.commit();
			return project;
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Project> getAllProjects() {
		Session session = HibernateUtilFactory.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Project> projects = new ArrayList<Project>();
		try {
			tx = session.beginTransaction();
			Query projectQuery = session.createQuery("FROM Project p");

			projects = projectQuery.list();
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		return projects;
	}

}
