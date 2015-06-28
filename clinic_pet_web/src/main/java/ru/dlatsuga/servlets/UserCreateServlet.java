package ru.dlatsuga.servlets;

import ru.dlatsuga.models.User;
import ru.dlatsuga.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Dima on 21.06.2015.
 */
public class UserCreateServlet extends HttpServlet {
    private final UserCache USER_CACHE = UserCache.getInstance();

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.USER_CACHE.add(new User(USER_CACHE.generateId(), req.getParameter("login"), req.getParameter("email")));
//        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/user/view"));
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.USER_CACHE.add(new User(USER_CACHE.generateId(), req.getParameter("login"), req.getParameter("email")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/user/view"));
    }
}
