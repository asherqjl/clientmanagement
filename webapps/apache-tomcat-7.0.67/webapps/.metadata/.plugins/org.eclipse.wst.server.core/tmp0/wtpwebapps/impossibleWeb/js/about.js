
$(document).ready(function()
		{

	$('#UpdateButton').click(function() 
			{
		var MSG = CKEDITOR.instances["Message"].getData();
		var dataString = 'about='+ MSG;
		// about is the parameter to pass through other pages


		$.ajax({
			type: "POST",
			url: "InsertAbout",
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
