<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <script src="script.js"></script>
        <title>Simple Web Shop</title>
    </head>
    <body>
        <br/>
            <jsp:include page="header.jsp" />
        <div id="categories">
            <ul>
                <c:forEach items="${categories}" var="category">
                    <input type="button" value="${category}" onclick="getProducts('${category}')" />
                </c:forEach>
            </ul>
        </div>

        <div id="shop_items"><jsp:include page="products.jsp" /></div>
        <div id="ordered_items"></div>
        <div id="footer"><jsp:include page="footer.jsp" /></div>

    </body>
</html>