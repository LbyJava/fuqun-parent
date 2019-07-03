package com.fuqun.mapper;

import com.fuqun.pojo.Dumping;
import com.fuqun.pojo.DumpingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DumpingMapper {
    int countByExample(DumpingExample example);

    int deleteByExample(DumpingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dumping record);

    int insertSelective(Dumping record);

    List<Dumping> selectByExample(DumpingExample example);

    Dumping selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Dumping record, @Param("example") DumpingExample example);

    int updateByExample(@Param("record") Dumping record, @Param("example") DumpingExample example);

    int updateByPrimaryKeySelective(Dumping record);

    int updateByPrimaryKey(Dumping record);
}