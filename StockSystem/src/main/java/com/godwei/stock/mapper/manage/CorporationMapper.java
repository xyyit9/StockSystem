package com.godwei.stock.mapper.manage;

import com.godwei.stock.model.manage.Corporation;
import com.godwei.stock.model.manage.CorporationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporationMapper {
    int deleteByExample(CorporationExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Corporation record);

    int insertSelective(Corporation record);

    List<Corporation> selectByExample(CorporationExample example);

    Corporation selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Corporation record, @Param("example") CorporationExample example);

    int updateByExample(@Param("record") Corporation record, @Param("example") CorporationExample example);

    int updateByPrimaryKeySelective(Corporation record);

    int updateByPrimaryKey(Corporation record);

    Corporation selectByIdcard(String idcard);

}