package mum.edu.week1ExtraCredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.week1ExtraCredit.dao.ITaskDAO;
import mum.edu.week1ExtraCredit.domain.Task;
@Service
@Transactional
public class TaskServiceImpl implements ITaskService {
	@Autowired
    private ITaskDAO taskDAO;
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
