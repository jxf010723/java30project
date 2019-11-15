package com.accp.mapper;

import com.accp.domain.Colorseries;
import com.accp.domain.ColorseriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorseriesMapper {
    int countByExample(ColorseriesExample example);

    int deleteByExample(ColorseriesExample example);

    int deleteByPrimaryKey(Integer seriesid);

    int insert(Colorseries record);

    int insertSelective(Colorseries record);

    List<Colorseries> selectByExample(ColorseriesExample example);

    Colorseries selectByPrimaryKey(Integer seriesid);

    int updateByExampleSelective(@Param("record") Colorseries record, @Param("example") ColorseriesExample example);

    int updateByExample(@Param("record") Colorseries record, @Param("example") ColorseriesExample example);

    int updateByPrimaryKeySelective(Colorseries record);

    int updateByPrimaryKey(Colorseries record);
}