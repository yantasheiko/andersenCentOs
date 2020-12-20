<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Title</title>
</head>
<body>
<c:set var="hello" value="${requestScope.hello}"/>
<c:out value="${requestScope.hello}"/>
</body>
</html>
