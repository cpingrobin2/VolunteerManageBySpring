package mum.edu.week1ExtraCredit.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import mum.edu.week1ExtraCredit.domain.Project;
import mum.edu.week1ExtraCredit.service.IProjectService;

@Controller
public class AppController {
	@Autowired
	IProjectService projectService;

	@RequestMapping(value = "/getAllProjects")
	public String home(ModelMap modelMap) {
		List<Project> projects = projectService.getAllProjects();
		modelMap.addAttribute("projects", projects);
		return "main/index";
	}

}
