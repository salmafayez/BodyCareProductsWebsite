package gov.iti.jets.presentation.ajaxservlet;


import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.presentation.dtos.CategoryDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CategoryLoadAjaxServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        List<Category> categoryList = DomainFacade.loadCategories();
        String categoryListString = createJSON(categoryList);
        out.write(categoryListString);
        
    }

    private String createJSON(List<Category> categoryList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<CategoryDto> cc = createCategoryList(categoryList);
        String json = gson.toJson(cc);
        return json;
    }

    private List<CategoryDto> createCategoryList(List<Category> categoryList){
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        categoryList.forEach(c->categoryDtoList.add(new CategoryDto(c.getName())));
        return categoryDtoList;
    }
}