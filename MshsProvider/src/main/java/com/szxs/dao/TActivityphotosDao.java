package com.szxs.dao;

import com.szxs.entity.TActivityphotos;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface TActivityphotosDao {
    List<TActivityphotos> queryAll( @Param("tActivityphotos") TActivityphotos  tActivityphotos, @Param("from")Integer from, @Param("end") Integer end);

}
