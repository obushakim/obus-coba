package com.obus.hr.ws;

import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.xpath.XPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import com.obus.hr.service.EmployeeService;

@Endpoint
public class EmployeeEndpoint {
	private static final String NAMESPACE_URI = "http://obus/coba/schemas";
	private XPath firstNameExpression;
	private XPath lastNameExpression;
	private XPath salaryExpression;
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeEndpoint(EmployeeService employeeService) throws JDOMException {
		this.employeeService = employeeService;
		Namespace namespace = Namespace.getNamespace("employee", NAMESPACE_URI);
		
	}
}
