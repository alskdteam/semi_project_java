package com.ohgiraffers.semi_project.subpage.main.model.dao;

import com.ohgiraffers.semi_project.subpage.main.model.dto.CommuteDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.subpage.main.model.dto.SidebarImageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface MainMapper {


    List<NoticeDTO> selectNoticeList();


    List<SidebarImageDTO> selectSidebar(int user_no);

//조회
    CommuteDTO selectCommuteTime(CommuteDTO commuteDTO);

//    출근 추가
    void uploadStartTime(CommuteDTO commuteDTO);

//    퇴근 업데이트
    void updateEndTime(CommuteDTO commuteDTO);
}
