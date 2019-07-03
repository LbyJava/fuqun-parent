package com.fuqun.mapper;

import com.fuqun.pojo.Orderdetailed;
import com.fuqun.pojo.OrderdetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdetailedMapper {
    int countByExample(OrderdetailedExample example);

    int deleteByExample(OrderdetailedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderdetailed record);

    int insertSelective(Orderdetailed record);

    List<Orderdetailed> selectByExample(OrderdetailedExample example);

    Orderdetailed selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderdetailed record, @Param("example") OrderdetailedExample example);

    int updateByExample(@Param("record") Orderdetailed record, @Param("example") OrderdetailedExample example);

    int updateByPrimaryKeySelective(Orderdetailed record);

    int updateByPrimaryKey(Orderdetailed record);
}