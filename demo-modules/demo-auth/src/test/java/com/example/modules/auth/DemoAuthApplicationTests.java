package com.example.modules.auth;

import com.example.modules.auth.dao.UserMapper;
import com.example.modules.auth.entity.User;
import com.example.common.core.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@SpringBootTest
class DemoAuthApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private UserMapper userMapper;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        User user = User.builder()
                .username("犬小哈")
                .createTime(new Date())
                .updateTime(new Date())
                .build();

        userMapper.insert(user);
    }
    /**
     * 查询数据
     */
    @Test
    void testSelect() {
        // 查询主键 ID 为 4 的记录
        User userDO = userMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }
    /**
     * 更新数据
     */
    @Test
    void testUpdate() {
        User userDO = User.builder()
                .id(1L)
                .username("犬小哈教程")
                .updateTime(new Date())
                .build();

        // 根据主键 ID 更新记录
        userMapper.updateByPrimaryKey(userDO);
    }
    /**
     * 删除数据
     */
    @Test
    void testDelete() {
        // 删除主键 ID 为 4 的记录
        userMapper.deleteByPrimaryKey(1L);
    }
}
