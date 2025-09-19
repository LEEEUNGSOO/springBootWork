package com.multi.springboot.mapper;

import com.multi.springboot.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> findAll();
    Comment findById(Long id);
    void insertComment(Comment comment);
    void deleteComment(Long id);

    void updateComment(@Param("id") Long id, @Param("content") String content);
}
