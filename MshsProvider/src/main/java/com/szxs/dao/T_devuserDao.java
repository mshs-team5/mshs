package com.szxs.dao;
import com.szxs.entity.Agent;
import com.szxs.entity.TDevuser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface T_devuserDao {

     List<TDevuser> queryAll(@Param("tDevuser") TDevuser tDevuser, @Param("from")Integer from,@Param("end") Integer end);
     Integer queryTDevusersRows(TDevuser tDevuser);
     Integer updateTDevuser(TDevuser tDevuser);
     Integer delTDevuser(String uuid);
     Integer addTDevuser(TDevuser tDevuser);
     TDevuser queryByid(String uuid);
}
