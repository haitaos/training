package com.user;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Query
 */
@WebServlet("/Query")
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String query = request.getParameter("query");
		InputStreamReader read = new InputStreamReader(
                new FileInputStream("D:\\data.txt"));
        BufferedReader br = new BufferedReader(read);
        
        String lineTxt = null; 
        while((lineTxt= br.readLine()) != null){
        String name = lineTxt.substring(0,lineTxt.lastIndexOf(","));
		String email = lineTxt.substring(lineTxt.lastIndexOf(",")+1, lineTxt.lastIndexOf(";"));
        //System.out.println(email);
		
		if(query.equals(name)||query.equals(email)){
			 PrintWriter out = response.getWriter(); 
			 out.println(name + "<br>");
			 out.println(email + "<br>");
			 break;
		}
       }
	}
 }
