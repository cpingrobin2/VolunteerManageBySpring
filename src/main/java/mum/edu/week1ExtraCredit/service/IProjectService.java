package mum.edu.week1ExtraCredit.service;

import java.util.List;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Status;

public interface IProjectService {
	public void AddProject(Project project);

	public List<Project> getProjectByStatus(Status status);

	public Project getProjectById(int projectId);

	public List<Project> getAllProjects();
}
