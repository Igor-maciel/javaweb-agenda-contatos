package br.com.agenda.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.model.dao.ContatoDao;
import br.com.agenda.model.entity.Contato;

@WebServlet(urlPatterns = {"/ContatoController", "/main", "/insert"})
public class ContatoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Contato contato;
    private ContatoDao contratoDao;
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
    	List<Contato> contatoList = new ArrayList<>();

        try {            
			contatoList = contratoDao.findAll();
            request.setAttribute("contatos", contatoList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("agenda.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException exception) {
            Logger.getLogger(ContatoController.class.getName()).log(Level.SEVERE, null, exception);
        }
        response.sendRedirect("agenda.jsp");
    }

    protected void novoContatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Contato contato = new Contato(request.getParameter("nome"), request.getParameter("fone"), request.getParameter("email"));
        contato.setObservacao(request.getParameter("observacao"));
        try {
            ContatoDao contatoDao = new ContatoDao();
            contatoDao.create(contato);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        response.sendRedirect("main");
    }
}


