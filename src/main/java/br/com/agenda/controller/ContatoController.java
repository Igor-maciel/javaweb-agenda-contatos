package br.com.agenda.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ContatoController", "/main", "/insert"})
public class ContatoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
;

    public ContatoController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/main")) {
            listaContatos(request, response);
        } else if (action.equals("/insert")) {
            novoContatos(request, response);
        }
    }

    protected void listaContatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("agenda.jsp");
    }

    protected void novoContatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("nome"));
        System.out.println(request.getParameter("fone"));
        System.out.println(request.getParameter("email"));
    }
}


