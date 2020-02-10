package model.organisateurs;

import model.AccesBdd;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrganisateurRepository {
    public static Organisateur findOne(String mail) throws SQLException {
        BeanHandler<Organisateur> beanHandler = new BeanHandler<>(Organisateur.class);
        QueryRunner runner = new QueryRunner();
        String query = "SELECT * FROM organisateur WHERE mail = ? LIMIT 1 ";
        Organisateur organisateur = runner.query(AccesBdd.getConnection(), query, beanHandler, mail);
        return organisateur;
    }
}
