package ru.dlatsuga.servlets;

import ru.dlatsuga.models.User;
import ru.dlatsuga.store.ClientCashe;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dima on 27.06.2015.
 */
public class ClientViewServlet extends HttpServlet {

    Collection<User> userList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientCashe clientCashe = new ClientCashe();
        userList = clientCashe.values();

        req.setAttribute("clients", userList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/client_test/ClientView.jsp");
        dispatcher.forward(req, resp);

/*
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append(
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "     <title>Clinic Pets</title>" +
                        "</head>" +
                        "<body>" +
                                "Hello" +
                                this.viewUsers() +
                        "</body>" +
                        "</html>"
        );
        writer.flush();
    }

    private String viewUsers() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Pets</p>");
        sb.append("<table style='border : 1px solid black'>");
        for (User user : userList) {
            sb.append("<tr><td style='border : 1px solid black'>").append(user.getLogin()).append("</td></tr>");
        }
        sb.append("</table>");
        return sb.toString();
        */
    }
}
