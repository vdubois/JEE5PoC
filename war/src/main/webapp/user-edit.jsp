<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<f:view>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="eng">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title><h:outputText value="#{msgs.userEdit}" /></title>
    </head>
    <body>
        <div id="main">
            <div id="header">
            </div>
            <div id="content">
            		<h1><h:outputText value="#{msgs.userEdit}" /></h1>
            		<h:form id="mainForm">
            				<h:panelGrid border="0" columns="3" cellpadding="5">
		            				<h:outputText value="#{msgs.lastName}" />
		            				<h:inputText id="nom" value="#{userController.userEdit.nom}" required="true" requiredMessage="Nom obligatoire"/>
		            				<h:message for="nom" />
		            				<h:outputText value="#{msgs.firstName}" />
		            				<h:inputText id="prenom" value="#{userController.userEdit.prenom}" required="true" requiredMessage="Pr譯m obligatoire"/>
		            				<h:message for="prenom" />
		            				<h:outputText value="#{msgs.email}" />
		            				<h:inputText id="email" value="#{userController.userEdit.email}" required="true" requiredMessage="Email obligatoire"/>
		            				<h:message for="email" />
		            				<h:outputText value="#{msgs.password}" />
												<h:inputText id="password" value="#{userController.userEdit.password}" required="true" requiredMessage="Mot de passe obligatoire"/>
		            				<h:message for="password" />
			                  <h:commandButton value="#{msgs.validate}" action="#{userController.update}"/> <h:outputText value="#{msgs.alternative}" /> <h:outputLink value="user-index.jsf"><h:outputText value="#{msgs.cancel}" /></h:outputLink>
	                </h:panelGrid>
                </h:form>
                
            </div>
            <div id="footer">
            </div>
        </div>
    </body>
</html>
</f:view>