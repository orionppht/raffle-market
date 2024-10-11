package com.hbnu.infrastructure.persistent.dao;

import com.hbnu.infrastructure.persistent.po.AwardPO;
import com.hbnu.infrastructure.persistent.po.StrategyPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname IStrategyDao
 * @Description 策略Dao
 * @Date 2024/10/11 18:41
 * @Created by pht
 */
@Mapper
public interface IStrategyDao {
    List<StrategyPO> queryStrategyList();
}
