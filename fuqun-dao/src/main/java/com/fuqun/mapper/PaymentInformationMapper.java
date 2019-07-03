package com.fuqun.mapper;

import com.fuqun.pojo.PaymentInformation;
import com.fuqun.pojo.PaymentInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentInformationMapper {
    int countByExample(PaymentInformationExample example);

    int deleteByExample(PaymentInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentInformation record);

    int insertSelective(PaymentInformation record);

    List<PaymentInformation> selectByExample(PaymentInformationExample example);

    PaymentInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentInformation record, @Param("example") PaymentInformationExample example);

    int updateByExample(@Param("record") PaymentInformation record, @Param("example") PaymentInformationExample example);

    int updateByPrimaryKeySelective(PaymentInformation record);

    int updateByPrimaryKey(PaymentInformation record);
}