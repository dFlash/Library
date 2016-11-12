<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Authors!</h2>
	<c:if test="${not empty authors}">

		<ul>
			<c:forEach var="author" items="${authors}">
				<li>${author.firstName}, ${author.lastName}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>