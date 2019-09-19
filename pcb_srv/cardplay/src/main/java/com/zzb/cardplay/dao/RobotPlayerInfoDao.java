package com.zzb.cardplay.dao;

import com.zzb.cardplay.pojo.RobotPlayerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RobotPlayerInfoDao extends JpaRepository<RobotPlayerInfo,Integer> {

//    @Query("select toUserId from Relationship where fromUserId =:fromUserId")
//    List<Long> findByFromUserId(@Param("fromUserId") Long fromUserId);

    RobotPlayerInfo findFirstByStatusIs(String status);

    RobotPlayerInfo findFirstByUid(String uid);

}
