package com.fuqun.mapper;

import com.fuqun.pojo.Hardness;
import com.fuqun.pojo.HardnessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HardnessMapper {
    int countByExample(HardnessExample example);

    int deleteByExample(HardnessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hardness record);

    int insertSelective(Hardness record);

    List<Hardness> selectByExample(HardnessExample example);

    Hardness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hardness record, @Param("example") HardnessExample example);

    int updateByExample(@Param("record") Hardness record, @Param("example") HardnessExample example);

    int updateByPrimaryKeySelective(Hardness record);

    int updateByPrimaryKey(Hardness record);
}