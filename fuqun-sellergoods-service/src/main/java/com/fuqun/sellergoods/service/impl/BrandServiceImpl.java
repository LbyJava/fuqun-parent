package com.fuqun.sellergoods.service.impl;

import com.fuqun.mapper.BrandMapper;
import com.fuqun.pojo.Brand;
import com.fuqun.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/7/3/003.
 */
@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectByExample(null);
    }


}
