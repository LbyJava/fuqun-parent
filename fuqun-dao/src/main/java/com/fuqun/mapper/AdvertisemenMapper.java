package com.fuqun.mapper;

import com.fuqun.pojo.Advertisemen;
import com.fuqun.pojo.AdvertisemenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertisemenMapper {
    int countByExample(AdvertisemenExample example);

    int deleteByExample(AdvertisemenExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Advertisemen record);

    int insertSelective(Advertisemen record);

    List<Advertisemen> selectByExample(AdvertisemenExample example);

    Advertisemen selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Advertisemen record, @Param("example") AdvertisemenExample example);

    int updateByExample(@Param("record") Advertisemen record, @Param("example") AdvertisemenExample example);

    int updateByPrimaryKeySelective(Advertisemen record);

    int updateByPrimaryKey(Advertisemen record);
}