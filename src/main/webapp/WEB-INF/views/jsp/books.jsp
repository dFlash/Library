<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Books!</h2>
	<c:if test="${not empty books}">

		<ul>
			<c:forEach var="book" items="${books}">
				<li>${book.name}, ${book.year}</li>
				<c:if test="${not empty book.authors}">
				    Authors:<br>
				    <ol>
				        <c:forEach var="author" items="${book.authors}">
				            <li>${author.lastName}</li>
				        </c:forEach>
				    </ol>
				</c:if>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>