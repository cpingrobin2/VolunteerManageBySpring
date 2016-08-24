package mum.edu.week1ExtraCredit.service;

import java.util.List;

import mum.edu.week1ExtraCredit.dao.ITaskDAO;
import mum.edu.week1ExtraCredit.dao.TaskDAOImpl;
import mum.edu.week1ExtraCredit.domain.Task;

public class TaskServiceImpl implements ITaskService {
    ITaskDAO taskDAO = new TaskDAOImpl();
	@Override
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskDAO.addTask(task);
	}

	@Override
	public List<Task> getTasksByProjectId(int projectId) {
		// TODO Auto-generated method stub
		return taskDAO.getTasksByProjectId(projectId);
	}

}
