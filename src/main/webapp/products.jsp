<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h2>Products:</h2>
<ul>
    <li>
        Name - Category - Price($)
    </li>
    <c:forEach items="${shop_items}" var="shop_item">
        <li>
            ${shop_item.name} - ${shop_item.category} - ${shop_item.price} - ${shop_item.id}
            <input type="button" value="Order" onclick="order('${shop_item.id}')"  />
        </li>
    </c:forEach>
</ul>