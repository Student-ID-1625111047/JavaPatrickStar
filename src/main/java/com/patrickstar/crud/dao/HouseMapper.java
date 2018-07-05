package com.patrickstar.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.patrickstar.crud.bean.House;
import com.patrickstar.crud.bean.HouseExample;

public interface HouseMapper {
    long countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Integer houseId);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Integer houseId);
    
    List<House> selectByExampleWithLandlord(HouseExample example);

    House selectByPrimaryKeyWithLandlord(Integer houseId);

    int updateByExampleSelective(@Param("record") House record, @Param("example") HouseExample example);

    int updateByExample(@Param("record") House record, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}