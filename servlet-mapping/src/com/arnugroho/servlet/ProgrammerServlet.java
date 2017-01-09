package com.arnugroho.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author arnugroho
 * Jan 9, 2017
 * https://www.linkedin.com/in/akbar-riyan-nugroho-42403054/de
 * https://github.com/arnugroho
 */

@WebServlet("/ProgrammerServlet")
public class ProgrammerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProgrammerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// setContentType bertujuan agar response berupa file html
		response.setContentType("text/html");

		// content yang akan dikirimkan sebagai response
		PrintWriter out = response.getWriter();
		out.println("<h>Saya adalah seorang Programmer Java dari Indonesia</h>");

		// membuat form dengan method post
		out.println("<form action='ProgrammerServlet' method='post'>"
				+ "<label>Nama Programmer</label> : <input type='text' name='namaProgrammer'></input>"
				+ "<br><input type='submit' value='Submit'></input>"
				+ "</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//Mengambil parameter dari form yang dikirimkan. Parameter yang diambil adalah namaProgrammer
		String namaProgrammer = request.getParameter("namaProgrammer");
		// setContentType bertujuan agar response berupa file html
		response.setContentType("text/html");
		// content yang akan dikirimkan sebagai response
		PrintWriter out = response.getWriter();
		out.println("<h>" + namaProgrammer + " adalah seorang Programmer Java dari Indonesia</h>");
	}

}
