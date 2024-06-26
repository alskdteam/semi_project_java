package com.ohgiraffers.semi_project.admin.model.dao;

import com.ohgiraffers.semi_project.admin.model.dto.AdminEmployeeDTO;
import com.ohgiraffers.semi_project.admin.model.dto.NoticeDTO;
import com.ohgiraffers.semi_project.user.model.dto.SignupDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {
    List<NoticeDTO> findnotice();

    NoticeDTO findByCodePage(int code);

    int updateNotice(NoticeDTO noticeDTO);

    void addNotice(NoticeDTO noticeDTO);


    // 도아 - 전체 사원 조회
    List<AdminEmployeeDTO> findEmployee();

    // 사원 개별 조회
    List<AdminEmployeeDTO> findSelectEmployee(Map<String, Object> search);


    AdminEmployeeDTO findByEmployee(int userNo);


    void adminEmployeeDTO(Map<String,Object> map);

    void deleteEmployee(int userId);




}
