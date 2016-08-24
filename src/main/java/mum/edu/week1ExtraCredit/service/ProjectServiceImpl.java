package mum.edu.week1ExtraCredit.service;

import java.util.List;

import mum.edu.week1ExtraCredit.dao.IProjectDAO;
import mum.edu.week1ExtraCredit.dao.ProjectDAOImpl;
import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Status;

public class ProjectServiceImpl implements IProjectService {
	IProjectDAO projectDAO = new ProjectDAOImpl();
	@Override
	public void AddProject(Project project) {
		// TODO Auto-generated method stub
		projectDAO.AddProject(project);
	}

	@Override
	public List<Project> getProjectByStatus(Status status) {
		// TODO Auto-generated method stub
		return projectDAO.getProjectByStatus(status);
	}

	@Override
	public Project getProjectById(int projectId) {
		// TODO Auto-generated method stub
		return projectDAO.getProjectById(projectId);
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectDAO.getAllProjects();
	}

}
