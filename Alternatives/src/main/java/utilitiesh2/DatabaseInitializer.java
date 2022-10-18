package utilitiesh2;

import models.TrForm;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInitializer {

    void initiateDatabase() throws SQLException;

}
