package com.fuqun.mapper;

import com.fuqun.pojo.Rank;
import com.fuqun.pojo.RankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankMapper {
    int countByExample(RankExample example);

    int deleteByExample(RankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rank record);

    int insertSelective(Rank record);

    List<Rank> selectByExample(RankExample example);

    Rank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByExample(@Param("record") Rank record, @Param("example") RankExample example);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}