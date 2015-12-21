package com.coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coreservlets.StaffInfo;
import com.coreservlets.StaffUtils;
import com.coreservlets.ResultUtils;

public class FindStaffByID extends HttpServlet {
	  
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String staffID = request.getParameter("staffID");
	StaffInfo staff = StaffUtils.getCustomer(staffID);
	
	String staffData;
	if (staff == null) {
	staffData = ResultUtils.makeErrorMessage("ID");
	} else {
	staffData = ResultUtils.makeBulletedList(staff);
	}
	PrintWriter out = response.getWriter();
	out.print(staffData);
	}
}

