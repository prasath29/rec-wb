function validate() {  
	var result = "";	
	result += validateName(); 	
	result += validateEmail();
	result += validatePassword();
	result += validatePhone();
	
	if (result == "") return true;
	
	alert("Validation Result:\n\n" + result);
	return false;	
}

function validateName() {
	var name = document.getElementsByName("name")[0].value;
	if ( name.trim()=="" || name.length <= 3 )
		return "Name should be at least three characters.\n";	
	return "";
}

function validatePassword() {
	var password = valueOf("password");
	var retype = valueOf("retype_password");
	
	if (password.length <= 6) 
		return "Password should be at least 6 characters.\n";
	
	if (password != retype) 
		return "Passwords do not match.\n";	
	return "";
}

function validateEmail() {
	var email = valueOf("email");
	var retype = valueOf("retype_email");
	
	if (email.indexOf('@') == -1) 
		return "Email should be a valid address.\n";
	
	if (email != retype)
		return "Email addresses do not match.\n";
	return "";	
}
function validatePhone()
{
    var phone = document.getElementById("myPhone").value;
    var phone1 = /^[\d\.\-]+$/;
    if(!phone1.test(phone) || phone.length <10)
       return "Phone Number is invalid"
	else
	  return "";	
}
function valueOf(name) {
	return document.getElementsByName(name)[0].value;
}