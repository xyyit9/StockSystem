package com.godwei.stock.mapper.user;

import com.godwei.stock.model.user.Comm;
import com.godwei.stock.model.user.CommExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommMapper {

    int deleteByExample(CommExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Comm record);

    int insertSelective(Comm record);

    List<Comm> selectByExample(CommExample example);

    Comm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Comm record, @Param("example") CommExample example);

    int updateByExample(@Param("record") Comm record, @Param("example") CommExample example);

    int updateByPrimaryKeySelective(Comm record);

    int updateByPrimaryKey(Comm record);

    Comm selectByCommDate(String time);

    void deleteByCommDate(String time);
}