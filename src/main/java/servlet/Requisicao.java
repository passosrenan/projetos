package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario")
public class Requisicao extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		String email = req.getParameter("email");
		String genero = req.getParameter("genero");

		Pessoa pessoa = new Pessoa();

		pessoa.setEmail(email);
		pessoa.setNome(nome);
		pessoa.setSobrenome(sobrenome);
		pessoa.setGenero(genero);

		switch (genero) {
		case "Feminino": {
			req.setAttribute("Sra", genero);
		}
			break;
		case "Masculino": {
			req.setAttribute("Sr", genero);
		}
		default:
		}

		
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("HH");
		String date = formatador.format(data);
		int hora = Integer.parseInt(date);

		if (hora < 12) {
			req.setAttribute("date", "bom dia!!!");

		} else if (hora <= 18) {
			req.setAttribute("date", "boa tarde!!!");
		} else {
			req.setAttribute("date", "boa noite!!!");
		}
		

		req.setAttribute("pessoa", pessoa);
		req.setAttribute("Email", email);
		req.setAttribute("sobrenome", sobrenome);
		req.setAttribute("nome", nome);
		req.setAttribute("genero", genero);

		req.getRequestDispatcher("CadastroRealizado.jsp").forward(req, resp);		

	}

}
