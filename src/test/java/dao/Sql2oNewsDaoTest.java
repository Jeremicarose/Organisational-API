package dao;

import models.News;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Sql2oNewsDaoTest {

    private Connection conn;
    private Sql2oNewsDao newsDao ;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/org_api";
        Sql2o sql2o = new Sql2o(connectionString,"moringa","1234" );
        newsDao = new Sql2oNewsDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        newsDao.clearAll();
        conn.close();
    }

    @Test
    public void add() {
        News news = setUpNews();
        assertEquals(1,newsDao.getAll().size());
    }

    @Test
    public void getAll() {
        News news = setUpNews();
        assertEquals(true, newsDao.getAll().contains(news));

    }

    @Test
    public void getAllNewsByDepartment() {
        News news = setUpNews();
        List<News> allNewsByDept = newsDao.getAllNewsByDepartment(news.getDepartmentId());
        assertEquals(news.getDepartmentId(),allNewsByDept.get(0).getDepartmentId());

    }

    @Test
    public void findById() {
        News news = setUpNews();
        assertEquals(news, newsDao.findById(news.getId()));
    }

    @Test
    public void update() {
        News news = setUpNews();
        String newsString = news.getNews();
        newsDao.update(newsDao.getAll().get(0).getId(),"New news",3);
        assertEquals("New news",newsDao.getAll().get(0).getNews());
    }

    @Test
    public void deleteById() {
        News news = setUpNews();
        newsDao.deleteById(news.getId());
        assertEquals(0, newsDao.getAll().size());

    }

    @Test
    public void clearAll() {
        News news = setUpNews();
        newsDao.clearAll();
        assertEquals(0, newsDao.getAll().size());
    }

    public News setUpNews(){
        News news = new News("",2);
        newsDao.add(news);
        return news;
    }
}