	package com.capg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/EmployeeDetails")
public class EmployeeDetails extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public EmployeeDetails() {
        super();
    }

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		String EmployeeId = request.getParameter("EmpId");
		String EmployeeName = request.getParameter("EmpName");
		String EmployeeSalary = request.getParameter("EmpSal");
		String Address = request.getParameter("Addr");
		String Area = request.getParameter("Area");
		String City = request.getParameter("City");
		String Pincode = request.getParameter("Pincode");
	
		 response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			if(EmployeeId.equals("1001") && EmployeeName.equals("ABC") && EmployeeSalary.equals
					("40000") && Address.equals("123 Apartment") && Area.equals("Krishna Nagar")
					&& City.equals("Lucknow") && Pincode.equals("226023")) 
			{
				out.println("<h2>Welcome</h2>");			
			}
			else 
			{
				out.println("<h2>Invalid credentials !!</h2>");
			}
			
			out.println("</body></html>");
			
			out.close();

			}

		}
