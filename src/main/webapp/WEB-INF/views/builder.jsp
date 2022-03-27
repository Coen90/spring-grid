<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
	<script src="/resources/toast.js"></script>
	<link rel="stylesheet" href="/resources/toast.css" type="text/css" />
</head>  
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div id="grid"></div>
<button onClick='ajaxData("build/toastList")'>Button1</button>
<button onClick='ajaxData("build/toastDataList")'>Button2</button>
<script type="text/javascript">
	$(function() {
		const grid = new tui.Grid({
			el : document.getElementById('grid'),
//	 		data : gridData,
			scrollX : false,
			scrollY : false,
			header: {
		        height: 160,
		        complexColumns: [
		          	{
			            header: 'Basic',
			            name: 'mergeColumn1',
			            childNames: ['name', 'artist']
		          	},
		          	{
			            header: 'Extra',
			            name: 'mergeColumn2',
			            childNames: ['type', 'release', 'genre']
		          	},
		          	{
			            header: 'Detail',
			            name: 'mergeColumn3',
			            childNames: ['mergeColumn1', 'mergeColumn2']
		          	},
		          	{
			            header: 'Count',
			            name: 'mergeColumn4',
			            childNames: ['downloadCount', 'listenCount']
		          	},
		          	{
			            header: 'Album Info',
			            name: 'mergeColumn5',
			            childNames: ['price', 'mergeColumn3', 'mergeColumn4']
		          	}
		        ]
	      	},
			columns : [ 
				{
					header : 'Name',
					name : 'name'
				}, 
				{
					header : 'Artist',
					name : 'artist'
				}, 
				{
					header : 'Type',
					name : 'type'
				}, 
				{
					header : 'Release',
					name : 'release'
				}, 
				{
					header : 'Genre',
					name : 'genre'
				}
			]
		});
		ajaxData = function(url) {
			$.ajax({
				url : url,
				method : "POST",
				dataType : "JSON",
				success : function(result) {
					console.dir(result);
					grid.resetData(result);
				}
			});
		}
		ajaxData("build/toastList");
	});
</script>
</body>
</html>
