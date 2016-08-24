package mum.edu.week1ExtraCredit.dao;

import java.util.List;

import mum.edu.week1ExtraCredit.domain.Task;

public interface ITaskDAO {
	public void addTask(Task task);
	public List<Task> getTasksByProjectId(int projectId);
}
