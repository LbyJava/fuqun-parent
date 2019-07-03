package com.fuqun.mapper;

import com.fuqun.pojo.Part;
import com.fuqun.pojo.PartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartMapper {
    int countByExample(PartExample example);

    int deleteByExample(PartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Part record);

    int insertSelective(Part record);

    List<Part> selectByExample(PartExample example);

    Part selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Part record, @Param("example") PartExample example);

    int updateByExample(@Param("record") Part record, @Param("example") PartExample example);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}