package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;


import java.io.IOException;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

public class ProductDtoMapper implements RequestMapper<Product> {
    @Override
    public Product map(HttpServletRequest request) throws IOException, ServletException {
        Product product = new Product();
        product.setName(request.getParameter("productName"));
        product.setPrice(Double.parseDouble(request.getParameter("price")));
        product.setDescription(request.getParameter("description"));
        product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        Part part = request.getPart("productImage");
        product.setImage(part.getSubmittedFileName());
        return product;
    }
    
}
