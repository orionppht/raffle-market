package com.hbnu.infrastructure.persistent.dao;

import com.hbnu.infrastructure.persistent.po.AwardPO;
import com.hbnu.infrastructure.persistent.po.StrategyAwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname IStrategyAwardDao
 * @Description 策略奖品Dao
 * @Date 2024/10/11 18:40
 * @Created by pht
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAwardPO> queryStrategyAwardList();
}
