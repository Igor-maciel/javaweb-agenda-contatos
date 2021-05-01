<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ page import="br.com.agenda.model.entity.Contato" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.*" %>
<%
    @ SuppressWarnings ("unchecked")
    List<Contato> lista = (ArrayList<Contato>) request.getAttribute("contatos");
%>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <title>Agenda de Contatos</title>
        <link rel="stylesheet" href="style.css">
        <link rel="icon" href="images">
    </head>
    <body>
    <h1>Agenda de Contatos</h1>
    <a href="novo.html" class="Botao1">Novo contato</a>
        <table id="tabela">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Fone</th>
                    <th>E-mail</th>
                    <th>Observações</th>
                    <th>Opções</th>
                </tr>
            </thead>

            <tbody>
            <% for (Contato itemContato : lista) { %>
            <tr>
                <td><%=itemContato.getId()%></td>
                <td><%=itemContato.getNome()%></td>
                <td><%=itemContato.getFone()%></td>
                <td><%=itemContato.getEmail()%></td>
                <td><%=itemContato.getObservacao()%></td>
                <td>
                    <a href="edit?id=<%=itemContato.getId()%>" class="Botao1">Editar</a>
                    <a href="javascript: confirmar(<%=itemContato.getId()%>)" class="Botao2">Excluir</a>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </body>
</html>
