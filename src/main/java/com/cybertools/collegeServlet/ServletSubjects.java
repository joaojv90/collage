package com.cybertools.collegeServlet;

//@author jpjar

import com.cybertools.collegeController.*;
import com.cybertools.collegeModel.ModelSubjects;
import com.google.gson.*;
import java.io.*;
import java.util.List;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(name = "SubjectsServlet", urlPatterns = "/subjects")
@MultipartConfig
 
public class ServletSubjects extends HttpServlet{
    
    private static final Gson objGson = new GsonBuilder().serializeNulls().create();
    private static final DAO<ModelSubjects> dao = new ControllerSubjects();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        List<ModelSubjects> list = dao.read();
        String data = objGson.toJson(list);        
        out.write(data);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String formData = objGson.toJson(request.getParameterMap()); 
        formData = formData.replaceAll("[\\[\\]]", ""); 
        ModelSubjects ms = objGson.fromJson(formData, ModelSubjects.class);
        boolean create = dao.create(ms);
        if(create){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }
    
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll("[\\[\\]]", "");
        ModelSubjects ms = objGson.fromJson(formData, ModelSubjects.class);
        boolean update = dao.update(ms);
        if(update){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }
    
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String formData = objGson.toJson(request.getParameterMap());
        formData = formData.replaceAll("[\\[\\]]", "");
        ModelSubjects ms = objGson.fromJson(formData, ModelSubjects.class);
        boolean del = dao.delete(ms);
        if(del){
            response.setStatus(HttpServletResponse.SC_OK);
        }else{
            response.sendError(HttpServletResponse.SC_CONFLICT);
        }
    }

}
