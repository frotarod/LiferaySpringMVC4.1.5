<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet_2_0"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


	<portlet:actionURL var="submitComunicacaoCasoURL"  >
		<portlet:param name="action" value="salvarComunicacaoCaso"/>
	</portlet:actionURL>


<form:form method="POST" action="${submitComunicacaoCasoURL}" modelAttribute="modeloDTO" id="frmAdesao" >

<form:input type="text" id="nome" path="nome"/>
<br/>
<form:input  id="id" path="id"/>
 
<input type="submit" value="Submit Form">

</form:form>


