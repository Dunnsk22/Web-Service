function getAllStaff(inputField, resultRegion) {
	var baseAddress = "find-all-staff";
	var data = "format=" + getValue(inputField);
	var address = baseAddress + "?" + data;
	ajaxResult(address, resultRegion);
}

function getStaffMember(firstname, lastname, format, resultRegion) {
	var baseAddress = "find-staff-member";
	var data = "format=" + getValue(format) + "&firstname="
			+ getValue(firstname) + "&lastname=" + getValue(lastname);
	var address = baseAddress + "?" + data;
	ajaxResult(address, resultRegion);
}
