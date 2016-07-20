<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
#cw>span {
	display: block;
	line-height: 20px;
}

</style>

<script src="code.js"></script>
<script>
	function getWeatherCode(code) {
		for ( var i in weathercode) {
			if (code == weathercode[i].code) {
				return weathercode[i].text;
			}
		}
	}

	function startTime() {
		var today = new Date();
		var date = today.toLocaleDateString();
		;

		var h = today.getHours();
		var m = today.getMinutes();
		var s = today.getSeconds();

		m = checkTime(m);
		s = checkTime(s);
		document.getElementById("time").innerHTML = date + ' ' + h + ":" + m
				+ ":" + s;
		t = setTimeout(function() {
			startTime()
		}, 500);
	}

	// 10보다 작을때 앞에 0 생성
	function checkTime(i) {
		if (i < 10) {
			i = "0" + i;
		}
		return i;
	}
	function cw(data) {
		var output = '';
		var condition = $(data).find('yweather\\:condition,condition').attr(
				'text');
		var temp = $(data).find('yweather\\:condition,condition').attr('temp');
		var date = $(data).find('yweather\\:condition,condition').attr('date');
		var code = $(data).find('yweather\\:condition,condition').attr('code');
		var country = $(data).find('yweather\\:location,location').attr(
				'country');
		var region = $(data).find('yweather\\:location,location')
				.attr('region');
		var codetext = getWeatherCode(code);
		console.log(code);
		output += '<span id="time"></span>';
		output += '<span>' + region + ', ' + country + '</span>';
		output += '<span id="temp">' + temp + '℃</span>';
		output += '<div class="a3">' + codetext + '</div>';
		output += '<span class="title">Current Conditions:</span>' + condition
				+ '<br/>';
		output += '<h5>' + date + '</h5>';

		$('#cw').html(output);
		startTime();
	};

	$(document)
			.ready(
					function() {
						function display(data) {
							var output = '';
							output += '<table>';
							output += '<thead>';
							output += '<tr>';
							output += '<th>ID';
							output += '</th>';
							output += '<th>NAME';
							output += '</th>';
							output += '<th>IMG';
							output += '</th>';
							output += '</tr>';
							output += '</thead>';
							output += '<tbody>';
							$(data)
									.each(
											function(index, item) {
												output += '<tr>';
												output += '<td>' + item.id;
												output += '</td>';
												output += '<td>' + item.name;
												output += '</td>';
												output += '<td>';
												output += '<img src="img/'+item.imgname+'" width="50">';
												output += '</td>';
												output += '</tr>';

											});
							output += '</tbody>';
							output += '</table>';
							$('#main_data').html(output);
							var cheight = $('#center_aside').height();
							$('#left_aside').css('height', cheight + 'px');

						}

						function getData() {
							$.ajax({
								url : 'productajax.mul?cmd=all',
								success : function(data) {
									display(data);
								}
							});
						}

						var uri = 'productajax.mul?cmd=w';

						$.ajax({
							url : uri,
							success : function(data) {
								cw(data);
							},
						});

						getData();
						setInterval(getData, 3000);
					});
</script>
<div id="main_center" class="center">
	<h1>AJAX Weather</h1>
	<!-- AJAX 데이터 출력 시작 -->
	<div id="cw">Loading.....</div>
	<h3>AJAX Product List</h3>
	<div id="main_data"></div>
	<!-- AJAX 데이터 출력 끝 -->
</div>
