
package com.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resgister
 */
@WebServlet("/Resgister")
public class Resgister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resgister() {
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
		String username = request.getParameter("username");		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		 //输入流输入数据指定到文件
		 String fileName="D:\\data.txt";
		 BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
		 bw.write(username+","+email+";"+password +"\r\n");	 
		 bw.close(); 
		 //读出文件内容
		 InputStreamReader read = new InputStreamReader(
                 new FileInputStream(fileName));
         BufferedReader br = new BufferedReader(read);
         String lineTxt = null;
         while((lineTxt= br.readLine()) != null){    	  
        	 //PrintWriter out = response.getWriter();
        	 //out.println(lineTxt);
        	 
                }
                 read.close();
		 request.getRequestDispatcher("/data.jsp").forward(request, response);
	}
}
