package com.distributedlock.service;

import redis.clients.jedis.Jedis;

/**
 * @Auto ZiranJuan
 * @Date 2020/4/15 23:37
 */
public class DistributedLock {
    public static String KEY = "DISTRIBUTED_KEY";
    public static String VALUE = "DISTRIBUTED_VALUE";

    public static boolean lock(Jedis jedis) {
        long setSuccess = jedis.setnx(KEY, VALUE);
        return setSuccess == 1;
    }

    public static boolean unLock(Jedis jedis) {
        return jedis.del(KEY) == 1;
    }
}
