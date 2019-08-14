
import DB.DB;
import com.google.gson.Gson;
import dao.Sql2oDepartmentDao;
import dao.Sql2oNewsDao;
import dao.Sql2oUserDao;
import models.Department;
import models.News;
import models.User;

import static spark.Spark.*;

public class App {


    public static void main(String[] args) {

        staticFileLocation("/public");

        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        }else {
            port = 4567;
        }
        port(port);

        Sql2oUserDao userDao = new Sql2oUserDao(DB.sql2o);
        Sql2oNewsDao newsDao = new Sql2oNewsDao(DB.sql2o);
        Sql2oDepartmentDao departmentDao = new Sql2oDepartmentDao(DB.sql2o);
        Gson gson = new Gson();


        get("/users", "application/json",(req, res) -> {
            res.type("application/json");
            return gson.toJson(userDao.getAll());
        });
        get("/news", "application/json",(req, res) ->{
            res.type("application/json");
            return gson.toJson(newsDao.getAll());
        });
        get("/departments", "application/json",(req, res) ->{
            res.type("application/json");
            return gson.toJson(departmentDao.getAll());
        });

        post("/users/new", "application/json", (req, res)->{
            User user = gson.fromJson(req.body(), User.class);
            userDao.add(user);
            res.type("application/json");
            res.status(201);
            return gson.toJson(user);
        });
        post("/news/new", "application/json", (req, res)->{
            News news = gson.fromJson(req.body(), News.class);
            newsDao.add(news);
            res.type("application/json");
            res.status(201);
            return gson.toJson(news);
        });
        post("/department/new", "application/json", (req, res) -> {
            Department department = gson.fromJson(req.body(), Department.class);
            departmentDao.add(department);
            res.type("application/json");
            res.status(201);
            return gson.toJson(department);
        });;



    }
}
