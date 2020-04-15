package com.myspace.studentsphysicalactivityprocess.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ActivityJavaUtils {

	
	public boolean isActivityDateValid() {
		return activityDateValid;
	}


	public void setActivityDateValid(boolean activityDateValid) {
		this.activityDateValid = activityDateValid;
	}

	public String activityDate;
	public boolean activityDateValid;
	public boolean activityAllowed;
	public boolean activityTypeAllowed;
	public String activityDescription;
	public String activityName;
	
	
	public boolean validateActivityType(String activityName) {
		
		if(activityName != null && activityName.equalsIgnoreCase("Soccer")) {
			this.setActivityTypeAllowed(true);
		}else if(activityName != null && activityName.equalsIgnoreCase("basketball")) {
			this.setActivityTypeAllowed(true);
		}else{
			this.setActivityTypeAllowed(false);
		}
		return isActivityTypeAllowed();
	}
	
	
	public boolean validateDate(String activityDate) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		
		try {
			sdf.parse(activityDate);
			this.setActivityDateValid(true);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.setActivityDateValid(false);
		}
		
		return this.isActivityDateValid();
	}	
	
	public String getActivityDate() {
		return activityDate;
	}
	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}
	public boolean isActivityAllowed() {
		return activityAllowed;
	}
	public void setActivityAllowed(boolean activityAllowed) {
		this.activityAllowed = activityAllowed;
	}
	public String getActivityDescription() {
		return activityDescription;
	}
	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public boolean isActivityTypeAllowed() {
		return activityTypeAllowed;
	}

	public void setActivityTypeAllowed(boolean activityTypeAllowed) {
		this.activityTypeAllowed = activityTypeAllowed;
	}
	
	
	
}
