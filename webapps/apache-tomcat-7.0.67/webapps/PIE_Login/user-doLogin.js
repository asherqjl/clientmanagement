$("#error").hide()
if ( localStorage.getItem['userRemeberedEmail'] != null ){
	var email =  localStorage.getItem['userRemeberedEmail']
	var pass = localStorage.getItem['userRemeberedPass']
	
	document.getElementById("inputEmail").value = email
	document.getElementById("inputPassword").value = pass
}

	
function doLogin() {
	
	var password = document.getElementById("inputPassword").value
	var email = document.getElementById("inputEmail").value
	var remembered = document.getElementById("inputRemember").checked 	
	var url = "https://piedev-rpmaps.rhcloud.com/servlets/login";	
	var xmlhttp = new XMLHttpRequest();
	var headers = "userEmail=" + email + "&userPassword=" + sha256(password) + "&platformID=" + 1;
	xmlhttp.open("POST", url , true);	
	xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
 
	xmlhttp.onreadystatechange=function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {					
			if (remembered){
				localStorage.setItem("userRemeberedEmail",email);
				localStorage.setItem("userRemeberedPass",password);
			}
			loginFunction(xmlhttp.responseText);
		} 
	}
	xmlhttp.send(headers);	

}	
	
function loginFunction(response) {

    var dataReturn = JSON.parse(response);

	if(dataReturn.result == 'SUCCESS'){
		//localStorage				
		localStorage.setItem("userID",dataReturn.user.userID);
		localStorage.setItem("userFirstName",dataReturn.user.userFirstName);
		localStorage.setItem("userMobile",dataReturn.user.userMobile);
		localStorage.setItem("userEmail",dataReturn.user.userEmail);
		localStorage.setItem("userType",dataReturn.user.userType);
		localStorage.setItem("userLastName",dataReturn.user.userLastName);
		if (dataReturn.user.userType == 'STAFF'){
			localStorage.setItem("staffTitle",dataReturn.user.staffTitle);
			localStorage.setItem("staffIsSchoolAdmin",dataReturn.user.staffIsSchoolAdmin);
			localStorage.setItem("schoolName",dataReturn.user.schoolName);
		
		}
		localStorage.setItem("userFirstNameName",dataReturn.user.userFirstName);		
		window.location.href = "account.html";
	} else{		
		$("#error-message").html(dataReturn.message);
		$("#error").hide(0);
		$("#error").show(100);
	}
}
