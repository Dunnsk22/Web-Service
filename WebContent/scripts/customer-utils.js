// Show the Customer whose id is given
// by the input element whose id is idField. 
// Put result in HTML entry that has id resultRegion.

function showCustomer1(idField, resultRegion) {
	var baseAddress = "find-staff-by-id";
	var data = "customerID=" + getValue(idField);
	var address = baseAddress + "?" + data;
	ajaxResult(address, resultRegion);
}

// Show the Customer whose first and last names are
// given by the firstNameField and lastNameField textfields.
// Put result in HTML entry that has id resultRegion.

function showCustomer3(firstNameField, lastNameField, resultRegion) {
	var baseAddress = "find-staff-by-name";
	var data = "firstName=" + getValue(firstNameField) + "&lastName="
			+ getValue(lastNameField);
	var address = baseAddress + "?" + data;
	ajaxResult(address, resultRegion);
}

function showCustomerFormats(firstNameField, lastNameField, resultRegion) {
	var baseAddress = "find-staff-by-name-xml";
	var data = "firstName=" + getValue(firstNameField) + "&lastName="
			+ getValue(lastNameField);
	var address = baseAddress + "?" + data;
	ajaxResult(address, resultRegion);
}