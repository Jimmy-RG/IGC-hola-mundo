package com.auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Authenticator {
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM Usuario WHERE Username = ? AND Password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Devuelve true si se encuentra un registro
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
