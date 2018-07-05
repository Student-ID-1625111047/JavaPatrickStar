package com.patrickstar.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.patrickstar.crud.bean.Landlord;
import com.patrickstar.crud.bean.LandlordExample;

public interface LandlordMapper {
    long countByExample(LandlordExample example);

    int deleteByExample(LandlordExample example);

    int deleteByPrimaryKey(Integer landlordId);

    int insert(Landlord record);

    int insertSelective(Landlord record);

    List<Landlord> selectByExample(LandlordExample example);

    Landlord selectByPrimaryKey(Integer landlordId);

    int updateByExampleSelective(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByExample(@Param("record") Landlord record, @Param("example") LandlordExample example);

    int updateByPrimaryKeySelective(Landlord record);

    int updateByPrimaryKey(Landlord record);
}