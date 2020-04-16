package com.distributedlock.service;

import redis.clients.jedis.Jedis;

/**
 * @Auto ZiranJuan
 * @Date 2020/4/15 23:37
 */
public interface Lock {
    boolean lock(Jedis jedis);
    boolean unLock(Jedis jedis);
}
