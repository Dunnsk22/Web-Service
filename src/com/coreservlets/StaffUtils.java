package com.coreservlets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.coreservlets.StaffInfo;

import com.coreservlets.StaffInfo;

public class StaffUtils {
	private static Map<String, StaffInfo> sampleStaff;

	static {
		sampleStaff = new LinkedHashMap<String, StaffInfo>();
		sampleStaff.put("a1234", new StaffInfo(1, "James", "Gosling",
				"5 High Street, M15 4BA", "07573929485", "JG@me.com"));
		sampleStaff.put("a1235", new StaffInfo(2, "Jesse", "Garrett",
				"6 High Street, M15 4BA", "1618231123", "JG@msn.com"));
		sampleStaff.put("a1236", new StaffInfo(3, "Michael", "Bloomberg",
				"7 High Street, M15 4BA", "07123123123", "MB@hotmail.com"));
		sampleStaff.put("a1237", new StaffInfo(4, "Michael", "Jordan",
				"8 High Street, M15 4BA", "07496849035", "MJ@me.com"));
		sampleStaff.put("a1238", new StaffInfo(5, "Jon", "Bosak",
				"8 High Street, M15 4BA", "07865432578", "JB@me.com"));
		sampleStaff.put("a1239", new StaffInfo(6, "Alex", "Hughes",
				"25A Albert Street, ST8 4BA", "07703343573", "hughzy11@hotmail.com"));
		sampleStaff.put("a1240", new StaffInfo(6, "Aidan", "Oakes",
				"19 Princess Street, ST8 G7A", "01782445663", "aidy_oakes@hotmail.com"));
	}

	public static Map<String, StaffInfo> getSampleStaff() {
		return (sampleStaff);
	}

	public static List<StaffInfo> findAllStaff() {

		Map<String, StaffInfo> staffInfoMap = getSampleStaff();
		ArrayList<StaffInfo> staffList = new ArrayList<StaffInfo>();
		for (StaffInfo info : staffInfoMap.values()) {
			staffList.add(info);
		}
		return staffList;
	}

	public static List<StaffInfo> findAllStaffByName(String name) {

		Map<String, StaffInfo> staffInfoMap = getSampleStaff();
		ArrayList<StaffInfo> staffList = new ArrayList<StaffInfo>();
		for (StaffInfo c : staffInfoMap.values()) {
			staffList.add(c);
		}
		return staffList;
	}

	public static StaffInfo getCustomer(String id) {
		if (id == null) {
			id = "unknown";
		}
		return (sampleStaff.get(id.toLowerCase()));
	}

	public static List<StaffInfo> getNamedCustomer(String firstname, String lastname) {

		Map<String, StaffInfo> staffInfoMap = getSampleStaff();
		ArrayList<StaffInfo> staffList = new ArrayList<StaffInfo>();
		for (StaffInfo info : staffInfoMap.values()) {
			if (info.getForename().equalsIgnoreCase(firstname) && (info.getSurname().equalsIgnoreCase(lastname))) {
				staffList.add(info);
			}
		}
		return staffList;
	}
	
	public static StaffInfo getNamedCustomerByFirstOrSecondName(String firstName, String lastName) {
		Collection<StaffInfo> staff = getSampleCustomers().values();
		for (StaffInfo staffObject : staff) {
			if ((staffObject.getForename().equalsIgnoreCase(firstName))
					&& (staffObject.getSurname().equalsIgnoreCase(lastName))) {
				return staffObject;
			}
		}
		return (null);
	}
	
	  public static Map<String,StaffInfo> getSampleCustomers() {
		    return(sampleStaff);
		  }
}
