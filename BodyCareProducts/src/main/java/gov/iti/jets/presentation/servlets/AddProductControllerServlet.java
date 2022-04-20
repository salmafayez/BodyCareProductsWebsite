package gov.iti.jets.presentation.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ProductDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.util.AwsImageService;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig
public class AddProductControllerServlet extends HttpServlet{

    private static final RequestMapper<Product> productMapper= new ProductDtoMapper();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-add-product.jsp");
        requestDispatcher.forward(request, response);

    }    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        uploadImage(request);
        Product product = productMapper.map(request);
        boolean result = DomainFacade.addProduct(product);
        request.setAttribute("addProduct", result);
        log(result+"");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-add-product.jsp");
//        requestDispatcher.forward(request, response);
        response.sendRedirect("home");

    }  

    private void uploadImage(HttpServletRequest request) throws IOException, ServletException{
        Part part =request.getPart("productImage");
        String path = request.getServletContext().getRealPath("img") + File.separator+"products"+File.separator+ part.getSubmittedFileName();
        System.out.println(path);
        //FileOutputStream fos = new FileOutputStream(path);
        InputStream is = part.getInputStream();
        AwsImageService awsImageService =AwsImageService.getInstance();
        String url=awsImageService.uploadImage(is,part.getSubmittedFileName());
        request.setAttribute("imageUrl",url);

        System.out.println("url= :" +url);
//        byte [] data = new byte [is.available()];
//        is.read(data);
//        fos.write(data);
//        fos.close();

    }
}
