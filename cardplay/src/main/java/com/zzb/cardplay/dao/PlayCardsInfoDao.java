package com.zzb.cardplay.dao;

import com.zzb.cardplay.pojo.PlayCardsInfo;
import com.zzb.cardplay.pojo.PlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayCardsInfoDao extends JpaRepository<PlayCardsInfo,Integer> {

//    @Query("select toUserId from Relationship where fromUserId =:fromUserId")
//    List<Long> findByFromUserId(@Param("fromUserId") Long fromUserId);
//    PlayerInfo findFirstByUid(String uid);

    List<PlayCardsInfo> findAllByUidIs(String uid);
    PlayCardsInfo findFirstById(int id);
}
