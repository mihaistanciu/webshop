<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%><ul>

<h2>Ordered:</h2>
   <ul>
      <li>Name - Category - Price($)</li>
      <c:forEach items="${ordered_items}" var="shop_item">
         <li>${shop_item.name} - ${shop_item.category} - ${shop_item.price}</li>
      </c:forEach>
   </ul>
</ul>