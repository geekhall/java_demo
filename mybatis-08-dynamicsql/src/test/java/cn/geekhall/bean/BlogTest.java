package cn.geekhall.bean;

import cn.geekhall.dao.BlogMapper;
import cn.geekhall.utils.IDUtils;
import cn.geekhall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * BlogTest.java
 *
 * @author yiny
 */
public class BlogTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("极客堂lesson1");
        blog.setAuthor("极客堂");
        blog.setCtime(new Date());
        blog.setViews(200);
        mapper.addBlog(blog);
        mapper.addBlog(new Blog(IDUtils.getId(), "Django教程", "极客堂", new Date(), 300));
        mapper.addBlog(new Blog(IDUtils.getId(), "flask教程", "极客堂", new Date(), 300));
        mapper.addBlog(new Blog(IDUtils.getId(), "Spring教程", "极客堂", new Date(), 300));
        mapper.addBlog(new Blog(IDUtils.getId(), "SpringBoot教程", "极客堂", new Date(), 300));
        sqlSession.close();
    }

    @Test
    public void queryTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author", "极客堂");
        map.put("title", "flask教程");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryTestChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views", 100);
//        map.put("author", "极客堂");
        map.put("title", "flask教程");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateblogTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views", 100);
        map.put("id", "a63277a8569e457d8b3684c9b423acea");
//        map.put("author", "极客堂");
        map.put("title", "flask教程111");
        int res = mapper.updateBlog(map);
        if (res > 0){
            System.out.println("更新成功！");
        }
        sqlSession.close();
    }

    @Test
    public void queryIfTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author", "极客堂");
        map.put("title", "flask教程");
        List<Blog> blogs = mapper.queryBlogIF2(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryDynaTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        List<String> titles= new ArrayList<String>();
        titles.add("flask教程");
        titles.add("Django教程");
        map.put("titles", titles);

        List<Blog> blogs = mapper.queryBlogDyna(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
