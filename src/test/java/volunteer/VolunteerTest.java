package volunteer;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.domain.Status;
import mum.edu.week1ExtraCredit.service.IProjectService;
import mum.edu.week1ExtraCredit.service.ProjectServiceImpl;

public class VolunteerTest {

	private IProjectService projectService = new ProjectServiceImpl();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addProjectTest() throws Exception {
		List<Project> projects = projectService.getAllProjects();
		int a = projects.size();
		Project project = new Project();
		project.setProjectName("project one");
		project.setDescription("project one description");
		project.setStartDate("08/11/2012");
		project.setEndDate("07/10/2016");

		project.setStatus(Status.INPROGRESS);
		projectService.AddProject(project);

		List<Project> projects2 = projectService.getAllProjects();
		int b = projects2.size();

		assertEquals(a, b - 1);

	}

}
