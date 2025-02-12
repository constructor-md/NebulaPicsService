package com.anastasia.nebulapicsservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisStringTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedisStringOperations() {
        // 获取操作对象
        ValueOperations<String, String> valueOps = stringRedisTemplate.opsForValue();

        // 测试Key和Value
        String key = "testKey";
        String value = "testValue";

        // 1. 测试新增或更新操作
        valueOps.set(key, value);
        String storeValue = valueOps.get(key);
        assertEquals(value, storeValue, "存储的值与预期不一致");

        // 2. 测试修改操作
        String updatedValue = "updatedValue";
        valueOps.set(key, updatedValue);
        storeValue = valueOps.get(key);
        assertEquals(updatedValue, storeValue, "更新后的值与预期不一致");

        // 3. 测试查询操作
        storeValue = valueOps.get(key);
        assertNotNull(storeValue, "查询的值为空");
        assertEquals(updatedValue, storeValue, "查询的值与预期不一致");

        // 4. 测试删除操作
        stringRedisTemplate.delete(key);
        storeValue = valueOps.get(key);
        assertNull(storeValue, "删除后的值不为空");

    }

    private void assertEquals(String v1, String v2, String message) {
        assert v1.equals(v2) : message;
    }

    private void assertNotNull(String v1, String message) {
        assert v1 != null : message;
    }

    private void assertNull(String v1, String message) {
        assert v1 == null : message;
    }

}
