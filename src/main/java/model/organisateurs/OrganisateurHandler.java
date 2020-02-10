package model.organisateurs;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganisateurHandler extends BeanHandler {

    private Connection connection;

    public OrganisateurHandler(Connection con) {
        super(Organisateur.class);
        connection = con;
    }

    @Override
    public Organisateur handle(ResultSet rs) throws SQLException {
        Organisateur organisateur = (Organisateur) super.handle((rs));
        QueryRunner runner = new QueryRunner();
        BeanHandler<Organisateur> handler = new BeanHandler<>(Organisateur.class);
        return organisateur;

    }
}
