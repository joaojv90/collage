package com.cybertools.college.servlet;

import com.cybertools.college.controller.ControllerLogin;
import com.cybertools.college.controller.DAOLogin;
import com.cybertools.college.model.ModelUsers;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
@MultipartConfig
public class ServletLogin extends HttpServlet {
	
	private String format = "[\\[\\]]";

    private static final Gson objGson = new GsonBuilder().serializeNulls().create();
    private static final DAOLogin<ModelUsers> dao = new ControllerLogin();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll(format, "");
        ModelUsers mu = objGson.fromJson(formData, ModelUsers.class);
        boolean login = dao.login(mu);
        if(login){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10*60);
            response.sendRedirect("Introduction.jsp");
        }else {
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll(format, "");
        ModelUsers mu = objGson.fromJson(formData, ModelUsers.class);
        boolean register = dao.register(mu);
        if(register){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10*60);
            response.sendRedirect("Introduction.jsp");
        }else {
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }

    }
}
