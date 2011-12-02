<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<f:view>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="eng">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title><h:outputText value="#{msgs.usersList}" /></title>
    </head>
    <body>
        <div id="main">
            <div id="header">
            </div>
            <div id="content">
            		<h1><h:outputText value="#{msgs.usersList}" /></h1>
            		<h:form id="mainForm">
            		<h:dataTable border="0" rules="all" value="#{userController.users}" var="p">
									<h:column>
										<f:facet name="header">
											<h:outputText value="#{msgs.firstName}" />
										</f:facet>
										<h:outputText value="#{p.prenom}" />
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText value="#{msgs.lastName}" />
										</f:facet>
										<h:outputText value="#{p.nom}" />
									</h:column>									
									<h:column>
										<f:facet name="header">
											<h:outputText value="#{msgs.operations}" />
										</f:facet>
										<h:commandButton value="#{msgs.update}"
											action="#{userController.edit}" />
										<h:commandButton value="#{msgs.delete}"
											action="#{userController.delete}" />
										</h:column>
								</h:dataTable>
                    <h:commandButton value="#{msgs.addUser}" action="#{userController.add}"/>
                </h:form>
            </div>
            <div id="footer">
            </div>
        </div>
    </body>
</html>
</f:view>