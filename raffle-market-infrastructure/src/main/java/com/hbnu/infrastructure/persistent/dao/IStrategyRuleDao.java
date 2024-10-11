package com.hbnu.infrastructure.persistent.dao;

import com.hbnu.infrastructure.persistent.po.AwardPO;
import com.hbnu.infrastructure.persistent.po.StrategyRulePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname IStrategyRuleDao
 * @Description 策略规则Dao
 * @Date 2024/10/11 18:42
 * @Created by pht
 */
@Mapper
public interface IStrategyRuleDao {
    List<StrategyRulePO> queryStrategyRuleList();
}
