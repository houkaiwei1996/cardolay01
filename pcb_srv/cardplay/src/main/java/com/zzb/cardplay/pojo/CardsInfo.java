package com.zzb.cardplay.pojo;

/**
 * 牌信息
 */

public class CardsInfo {
    //3张底牌
    private String bottomCards;
    //该玩家原始拥有的17张牌
    private String allCards;
    //该玩家当前剩余的牌
    private String curCards;
    //上一次出的牌
    private String preOutCards;//上家出牌
    private String myOutCards;//自己出牌
    private String nextOutCards;//下家出牌
    //截至目前出过的所有牌
    private String preOutAllCards;
    private String myOutAllCards;
    private String nextOutAllCards;
}




//    private String landLordIdx;
//    //当前玩家的下家牌的张数
//    private String nextCnt;
//    //lastMove出牌玩家编号
//    private String lastMoveIdx;
//    //当前玩家需要管的牌
//    private CardsMove cardsMove;
//    //当前玩家上家的牌
//    private String preCards;
//    //当前玩家下家的牌
//    private String nextCards;
//    //抢地主的三张牌
//    private String grabCards;


