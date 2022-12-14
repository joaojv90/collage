package com.cybertools.college.servlet;

import com.cybertools.college.controller.*;
import com.cybertools.college.model.ModelStudents;
import com.google.gson.*;
import java.io.*;
import java.util.List;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet(name = "StudentsServlet", urlPatterns = "/students")
@MultipartConfig

public class ServletStudents extends HttpServlet{
	
	private String format = "[\\[\\]]";
    
    private static final Gson objGson = new GsonBuilder().serializeNulls().create();
    private static final DAO<ModelStudents> dao = new ControllerStudents();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        List<ModelStudents> list = dao.read();
        String data = objGson.toJson(list);        
        out.write(data);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String formData = objGson.toJson(request.getParameterMap()); //optiene todos los datos de una sola vez
        formData = formData.replaceAll(format, ""); //remplaza simbolos de request
        ModelStudents mSt = objGson.fromJson(formData, ModelStudents.class);//se convierte al objeto para eso se usa el .class
        boolean create = dao.create(mSt);
        if(create){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll(format, "");
        ModelStudents mSt = objGson.fromJson(formData, ModelStudents.class);
        boolean update = dao.update(mSt);
        if(update){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll(format, "");
        ModelStudents mSt = objGson.fromJson(formData, ModelStudents.class);
        boolean del = dao.delete(mSt);
        if(del){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }

}
