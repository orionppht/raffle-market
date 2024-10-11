package com.hbnu.test.infrastructure;

import com.hbnu.infrastructure.persistent.dao.IAwardDao;
import com.hbnu.infrastructure.persistent.po.AwardPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname AwardDaoTest
 * @Description 奖品持久化单元测试
 * @Date 2024/10/11 19:06
 * @Created by pht
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList(){
        List<AwardPO>awardPOS=awardDao.queryAwardList();
        log.info("测试结果：{}",awardPOS);
    }
}
