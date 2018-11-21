package com.szxs.dao;

import com.szxs.entity.TRoles;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRoleDao{
    List<TRoles> queryAll(@Param("tRoles") TRoles tRoles, @Param("from") Integer from , @Param("end") Integer end);
}
