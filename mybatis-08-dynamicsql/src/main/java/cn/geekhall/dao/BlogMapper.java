package cn.geekhall.dao;

import cn.geekhall.bean.Blog;

import java.util.List;
import java.util.Map;

/**
 * BlogMapper.java
 *
 * @author yiny
 */
public interface BlogMapper {
    // 新增博客
    int addBlog(Blog blog);

    // 查询博客
    List<Blog> queryBlogIF(Map map);

    // 查询（choose实现）
    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);
}
