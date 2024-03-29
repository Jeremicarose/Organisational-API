package DBRule;

import dao.Sql2oDepartmentDao;
import dao.Sql2oUserDao;
import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DbRule extends ExternalResource {

    private Connection conn;
    private Sql2oUserDao userDao;
    private Sql2oDepartmentDao departmentDao;

    @Override
    public void before(){
        String connectionString = "jdbc:postgresql://localhost:5432/org_api";
        Sql2o sql2o = new Sql2o(connectionString,"moringa","1234" );
        userDao = new Sql2oUserDao(sql2o);
        departmentDao = new Sql2oDepartmentDao(sql2o);
        conn = sql2o.open();
    }

    @Override
    public void after(){
        userDao.clearAll();
        conn.close();
    }

}
