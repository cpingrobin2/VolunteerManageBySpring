package mum.edu.week1ExtraCredit.dao;

import java.util.List;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Status;

public interface IProjectDAO {
	public void AddProject(Project project);

	public List<Project> getProjectByStatus(Status status);

	public Project getProjectById(int projectId);

	public List<Project> getAllProjects();
}
