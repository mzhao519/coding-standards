<%--
/* ============================================================================================================================= */
/* JSP Page                                                                                                                      */
/* Line width is 128 chars.                                                                                                      */
/* ============================================================================================================================= */

package au.com.tt.agweb.web.jsp
--%>

<%--
/* ============================================================================================================================= */
/* JSP directives                                                                                                                */
/* ============================================================================================================================= */
--%>

<%@ page errorPage="error.jsp" %>
<%@ page language="java" %>

<%@ page import="au.com.tt.agweb.struts.agency.AgencyConst" %>
<%@ page import="au.com.tt.agweb.struts.enterprise.EnterpriseConst" %>
<%@ page import="au.com.tt.agweb.struts.web.PageFocusPoint" %>

<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/tt.tld"           prefix="tt" %>

<%--
/* ============================================================================================================================= */
/* Page scope and scriptlet variables                                                                                            */
/* ============================================================================================================================= */
--%>

<bean:define id="pageTitle" value="Booking Summary"/>
<bean:define id="globalLocation" value="bookings"/>
<bean:define id="bkgPage" value="summary"/>

<% PageFocusPoint myFP = PageFocusPoint.getFocusPoint(request, orderedFocusPoints); %>

<%--
/* ============================================================================================================================= */
/* Start of HTML                                                                                                                 */
/* ============================================================================================================================= */
--%>

<%@ include file="doctype.jspi" %>
<html:html lang="true">

<head><%@ include file="fragment.jspi" %></head>

<%--
    Scriptlet indentation is four spaces. 
    If scriptlet spans multiple lines, 
    - Opening and closing tags do not need to be on a line of their own
    - Include space around opening and closing tags
    - Insert 2 spaces after the opening tag, to align with standard indent
    - Increase the indent level after opening the scriptlet
    - Sibling elements share the same level of indentation
    - Decrease the indent level for the closing tag of the parent level
 --%>

<%  if (myFP != null)
    { %>
        <body onload="MoveToElement('<%= myFP.getAnchorId() %>', '<%= myFP.getFocusId() %>')">
<%  }
    else
    { %>
        <body>
<%  } %>

<%--
    HTML indentation is four spaces. 
    - Increase the indent level to identify child elements. Can relax this for highest order elements if needed.  
    - Sibling elements share the same level of indentation
    - Decrease the indent level for the closing tag of the parent level
    
    If an element exceeds the line width limit, place each of its attributes on a new line and align them vertically.
 --%>

<div id="cssid_pageContainer">
<tr>
    <td class="info-label">Range:</td>
    <td colspan="2">
        <html:text property="prodInfoDetails.prodRange"
                   styleId="prodRange"
                   maxlength="<%= AgencyConst.SZ_STR_PROD_RANGE %>"
                   style="width: 4em"
                   styleClass="rngBrowse" /> <%-- BQ - 0018. --%>

        <a href="javascript:onClickPickRange()" class="image-link">
            <img src="<tt:resource path="v1/images/browse.gif"/>"
                 alt="Browse/Search product ranges"
                 class="rngBrowse" />
        </a>
        <logic:messagesPresent property="prodRange"><html:errors property="prodRange" /></logic:messagesPresent>
        <span class="error-text" id="gwtErrorsProdRange" style="display: none;">&nbsp;</span>
        <div class="rngBrowse"><jsp:include page="prdrange.jsp" /></div>
    </td>
</tr>
<%--
    An inline comment can either precede the code to which applies, or can be placed to the right on the same line.
    
    Make use of inline comments to identify closing tags for elements that are obscured.
--%>
</div> <%-- cssid_pageContainer --%>
</body>
</html:html>