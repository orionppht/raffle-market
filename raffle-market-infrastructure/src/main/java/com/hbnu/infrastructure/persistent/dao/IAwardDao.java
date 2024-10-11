package com.hbnu.infrastructure.persistent.dao;

import com.hbnu.infrastructure.persistent.po.AwardPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname IAwardDao
 * @Description 奖品Dao
 * @Date 2024/10/11 18:20
 * @Created by pht
 */
@Mapper
public interface IAwardDao {
    List<AwardPO>queryAwardList();
}
