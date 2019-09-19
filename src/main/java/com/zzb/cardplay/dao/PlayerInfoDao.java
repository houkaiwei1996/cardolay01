package com.zzb.cardplay.dao;

import com.zzb.cardplay.pojo.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerInfoDao extends JpaRepository<PlayerInfo,Integer> {

//    @Query("select toUserId from Relationship where fromUserId =:fromUserId")
//    List<Long> findByFromUserId(@Param("fromUserId") Long fromUserId);

    PlayerInfo findFirstByUid(String uid);

}
