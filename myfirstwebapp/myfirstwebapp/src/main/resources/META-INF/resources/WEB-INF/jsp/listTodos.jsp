<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title> Todos Page </title>
    </head>
    <body>
      Welocme to Todos Page !
      <table>
        <thead>
          <tr>
            <th>id</th>
            <th>Description</th>
            <th>Target name</th>
            <th>Is Done?</th>
          </tr>
        </thead>
        <tbody>
      <c:forEach items="${todos}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.username}</td>
            <td>${todo.done}</td>
          </tr>
      </c:forEach>
    </tbody>
    </table>
    </body>
</html>