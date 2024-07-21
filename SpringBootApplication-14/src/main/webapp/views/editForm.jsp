<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
    <h2>Edit User Form</h2>
 
    <form:form method="POST" action="/updateandsave">
        <table>
            <tr>
                <td>Id:</td>
                <td><form:hidden path="id" /></td>  
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>  
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input path="password" /></td>  
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>  
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:input path="gender" /></td>  
            </tr>
            <tr>
                <td>Country:</td>
                <td><form:input path="country" /></td>  
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="EditAndSave"></td>
            </tr>
            <tr>
        </table>
    </form:form>