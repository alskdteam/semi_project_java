package com.ohgiraffers.semi_project.subpage.main.model.dao;

import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {


    List<NoticeDTO> selectNoticeList();
}