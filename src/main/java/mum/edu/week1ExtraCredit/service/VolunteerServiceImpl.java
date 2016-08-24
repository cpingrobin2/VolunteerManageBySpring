package mum.edu.week1ExtraCredit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.week1ExtraCredit.dao.IVolunteerDAO;
import mum.edu.week1ExtraCredit.domain.Volunteer;
@Service
@Transactional
public class VolunteerServiceImpl implements IVolunteerService {
	@Autowired
    private IVolunteerDAO volunteerDAO ;
	@Override
	public void AddVolunteer(Volunteer volunteer) {
		// TODO Auto-generated method stub
		volunteerDAO.AddVolunteer(volunteer);
	}

}
