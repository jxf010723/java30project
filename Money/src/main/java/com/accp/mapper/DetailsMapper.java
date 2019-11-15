package com.accp.mapper;

import com.accp.domain.Details;
import com.accp.domain.DetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailsMapper {
    int countByExample(DetailsExample example);

    int deleteByExample(DetailsExample example);

    int deleteByPrimaryKey(Integer detailsid);

    int insert(Details record);

    int insertSelective(Details record);

    List<Details> selectByExample(DetailsExample example);

    Details selectByPrimaryKey(Integer detailsid);

    int updateByExampleSelective(@Param("record") Details record, @Param("example") DetailsExample example);

    int updateByExample(@Param("record") Details record, @Param("example") DetailsExample example);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
}