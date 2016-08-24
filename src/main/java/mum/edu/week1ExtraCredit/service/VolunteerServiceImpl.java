package mum.edu.week1ExtraCredit.service;

import mum.edu.week1ExtraCredit.dao.IVolunteerDAO;
import mum.edu.week1ExtraCredit.dao.VolunteerDAOImpl;
import mum.edu.week1ExtraCredit.domain.Volunteer;

public class VolunteerServiceImpl implements IVolunteerService {
    IVolunteerDAO volunteerDAO = new VolunteerDAOImpl();
	@Override
	public void AddVolunteer(Volunteer volunteer) {
		// TODO Auto-generated method stub
		volunteerDAO.AddVolunteer(volunteer);
	}

}
