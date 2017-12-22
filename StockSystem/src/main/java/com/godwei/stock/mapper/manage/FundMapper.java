package com.godwei.stock.mapper.manage;

import com.godwei.stock.model.manage.Fund;
import com.godwei.stock.model.manage.FundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FundMapper {
    int deleteByExample(FundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fund record);

    int insertSelective(Fund record);

    List<Fund> selectByExample(FundExample example);

    Fund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fund record, @Param("example") FundExample example);

    int updateByExample(@Param("record") Fund record, @Param("example") FundExample example);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);

    Fund selectByNameAndIdcard(Fund fund);

    Fund selectIdcardAndPw(Fund fund);
}