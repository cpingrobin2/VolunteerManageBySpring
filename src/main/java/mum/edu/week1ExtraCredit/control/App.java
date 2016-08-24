package mum.edu.week1ExtraCredit.control;

import java.util.List;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Resource;
import mum.edu.week1ExtraCredit.domain.Status;
import mum.edu.week1ExtraCredit.domain.Task;
import mum.edu.week1ExtraCredit.domain.UserRole;
import mum.edu.week1ExtraCredit.domain.Volunteer;
import mum.edu.week1ExtraCredit.service.IProjectService;
import mum.edu.week1ExtraCredit.service.ITaskService;
import mum.edu.week1ExtraCredit.service.IVolunteerService;
import mum.edu.week1ExtraCredit.service.ProjectServiceImpl;
import mum.edu.week1ExtraCredit.service.TaskServiceImpl;
import mum.edu.week1ExtraCredit.service.VolunteerServiceImpl;

/**
 * @author Chao Ping
 *
 */
public class App {

	public static void main(String[] args) throws Exception {

		IProjectService projectService = new ProjectServiceImpl();

		List<Project> projects = projectService.getAllProjects();

		Project project = projectService.getProjectById(2);

		addTask(project);

	}

	public static void addProject() {
		IProjectService projectService = new ProjectServiceImpl();
		Project project = new Project();
		project.setProjectName("project one");
		project.setDescription("project one description");
		project.setStartDate("08/11/2012");
		project.setEndDate("07/10/2016");

		project.setStatus(Status.DELAYED);

		try {
			projectService.AddProject(project);
			System.out.println("Add Project");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void populateProjects() {
		IProjectService projectService = new ProjectServiceImpl();
		try {
			List<Project> projects = projectService.getAllProjects();
			for (Project project : projects) {
				System.out.println("Project Name" + project.getProjectName());
				for (Task task : project.getTasks()) {
					System.out.println("Task Name" + task.getTaskName());
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addTask(Project project) {
		ITaskService taskService = new TaskServiceImpl();

		Task task = new Task();
		task.setTaskName("task one");
		task.setStartDate("11/11/2015");
		task.setEndDate("12/11/2016");
		Resource resource = new Resource();
		resource.setId(1);
		resource.setDescription("resource one");

		Resource resource2 = new Resource();
		resource2.setId(2);
		resource2.setDescription("resource two");

		task.addResource(resource);
		task.addResource(resource2);

		task.setStatus(Status.INPROGRESS);
		project.addTask(task);

		try {
			taskService.addTask(task);
			System.out.println("Add Task");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void addVolunteer() {
		IVolunteerService volunteerService = new VolunteerServiceImpl();
		Volunteer volunteer = new Volunteer();
		volunteer.setFirstName("King");
		volunteer.setLastName("Ping");
		volunteer.setDescription("volunteer description");
		volunteer.setUserRole(UserRole.VOLUNTEER);
		try {
			volunteerService.AddVolunteer(volunteer);
			System.out.println("Add Volunteer");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
