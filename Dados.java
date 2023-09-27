package aula2709;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dados")
public class Dados extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
			
			String dataDeNasc = request.getParameter("date");
			String escolha = request.getParameter("sim");
		
			PrintWriter writer = response.getWriter();
			
			writer.append("<HTML><BODY>");
			
			int anoDeNasc = Integer.parseInt(dataDeNasc);
			if(escolha==null) {
				writer.append("Sua idade é:" + (2022-anoDeNasc));
			} else if (escolha!=null){
				writer.append("Sua idade é:"+(2023-anoDeNasc));
			} 
			
			writer.append( "</BODY>  </HTML>" );

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
