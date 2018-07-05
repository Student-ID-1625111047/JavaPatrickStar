package com.patrickstar.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.patrickstar.crud.bean.MeetingDate;
import com.patrickstar.crud.bean.MeetingDateExample;

public interface MeetingDateMapper {
    long countByExample(MeetingDateExample example);

    int deleteByExample(MeetingDateExample example);

    int deleteByPrimaryKey(Integer dateId);

    int insert(MeetingDate record);

    int insertSelective(MeetingDate record);

    List<MeetingDate> selectByExample(MeetingDateExample example);

    MeetingDate selectByPrimaryKey(Integer dateId);

    int updateByExampleSelective(@Param("record") MeetingDate record, @Param("example") MeetingDateExample example);

    int updateByExample(@Param("record") MeetingDate record, @Param("example") MeetingDateExample example);

    int updateByPrimaryKeySelective(MeetingDate record);

    int updateByPrimaryKey(MeetingDate record);
}