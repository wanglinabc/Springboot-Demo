package com.example.demo.Dao;

import com.example.demo.Entity.ProxyReferrerAward;
import com.example.demo.Entity.ProxyReferrerAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component

public interface ProxyReferrerAwardMapper {
    int deleteByExample(ProxyReferrerAwardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProxyReferrerAward record);

    int insertSelective(ProxyReferrerAward record);

    List<ProxyReferrerAward> selectByExample(ProxyReferrerAwardExample example);

    ProxyReferrerAward selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProxyReferrerAward record, @Param("example") ProxyReferrerAwardExample example);

    int updateByExample(@Param("record") ProxyReferrerAward record, @Param("example") ProxyReferrerAwardExample example);

    int updateByPrimaryKeySelective(ProxyReferrerAward record);

    int updateByPrimaryKey(ProxyReferrerAward record);
}