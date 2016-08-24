package mum.edu.week1ExtraCredit.service;

import java.util.List;

import mum.edu.week1ExtraCredit.domain.Task;

public interface ITaskService {
	public void addTask(Task task);
	public List<Task> getTasksByProjectId(int projectId);
}
