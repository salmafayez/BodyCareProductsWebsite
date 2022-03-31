package gov.iti.jets.presentation.requestdtomappers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public interface RequestMapper<T> {
    T map(HttpServletRequest request) throws IOException, ServletException;
}
