package gov.iti.jets.services;

import jakarta.security.enterprise.credential.Password;

public interface UpdatePasswordService {
    boolean updatePassword (String email , String password);
}
