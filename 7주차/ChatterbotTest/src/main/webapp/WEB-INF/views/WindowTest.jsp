<HTML>
	<HEAD>
		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		<script src="dialog.js"></script>
		<link rel="stylesheet" href="mystyle.css" />
		<script>
			$(function(){
				//power_button 누르면 윈도우 창 생성
				$( "#power_button" ).click(function() {
					$( "#windows" ).dialog();
				});

				//start_button 누를때마다 새로운 explorer 생성
				$("#start_button").click(function(){
					$("#windows").dialog().appendDiv("explorer");
				});

			});
		</script>

	</HEAD>
	<BODY>
		<input type="button" id="power_button" value="Power"></input>

		<div id="windows">
			<input type="button" id="start_button"></input>
		</div>
	</BODY>
</HTML>