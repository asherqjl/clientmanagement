
$(document).ready(function()
		{

	$('#UpdateAddress').click(function() 
	{
	var ADD = $("#cAddress").val();
	var dataString = 'aaa='+ MSG;
	var MSG = $("#Message").val();
	var dataString = 'aaa='+ MSG;
	// aaa is the parameter to pass through other pages
	

	$.ajax({
	type: "POST",
	url: "InsertMessage",
	data: dataString,
	cache: false,
	success: function(data)
	{
		$("#Message").val('');
	$("#content").prepend(data);
	$("#Message").focus();
	 }
	 });


    
	return false;
	});
	
		});
