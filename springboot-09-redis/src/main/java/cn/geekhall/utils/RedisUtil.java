package cn.geekhall.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * RedisUtil.java
 *
 * @author yiny
 */
@Component
public final class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    /**
     * 指定缓存失效时间
     *
     * @param key  键
     * @param time 时间（秒）
     * @return true 成功 false 失败
     */
    public boolean expire(String key, long time) {
        if (time > 0) {
            redisTemplate.expire(key, time, TimeUnit.SECONDS);
        }
        return true;
    }

    /**
     * 获取缓存过期时间
     *
     * @param key 键
     * @return 过期时间
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     *
     * @param key 键
     * @return true 成功 false 失败
     */
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * @param key
     */
    public void del(String... key) {
        if (key != null && key.length > 0) {
            if (key.length == 1) {
                redisTemplate.delete(key[0]);
            } else {
                redisTemplate.delete(Arrays.asList(key));
            }
        }
    }

    // =============== String =================

    /**
     * 普通缓存获取
     *
     * @param key 键
     * @return
     */
    public Object get(String key) {
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 普通缓存放入
     *
     * @param key   键
     * @param value 值
     */
    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 普通缓存放入并设置时间
     *
     * @param key   键
     * @param value 值
     * @param time  时间（秒） time要大于0，如果time小于或等于0 将设置无限期
     * @return true 成功 false 失败
     */
    public boolean set(String key, Object value, long time) {
        if (time > 0) {
            redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
        } else {
            set(key, value);
        }
        return true;
    }

    /**
     * 递增
     *
     * @param key
     * @param delta
     * @return
     */
    public long increment(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, delta);
    }

    /**
     * 递减
     *
     * @param key
     * @param delta
     * @return
     */
    public long decrement(String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return redisTemplate.opsForValue().increment(key, -delta);
    }

    /**
     * Hash get method
     * @param key key
     * @return
     */
    public Object hashGet(String key, String item){
        return redisTemplate.opsForHash().get(key,item);
    }

    /**
     * 获取hash指定key对应的所有键值
     * @param key
     * @return
     */
    public Map<Object,Object> hashmapGet(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    /**
     * HashSet
     *
     * @param key
     * @param map
     */
    public void hashmapSet(String key, Map<String, Object> map){
        redisTemplate.opsForHash().putAll(key, map);

    }

    /**
     * 带超时时间的hashSet
     * @param key
     * @param map
     * @param time
     */
    public void hashmapSet(String key, Map<String,Object> map, long time){
        redisTemplate.opsForHash().putAll(key, map);
        if (time > 0 ){
            expire(key, time);
        }
    }

    /**
     * 同一张hash表中放入数据，如果不存在将创建。
     * @param key
     * @param item
     * @param value
     */
    public void hashSet(String key, String item, Object value){
        redisTemplate.opsForHash().put(key, item, value);
    }


    /**
     * 删除Hash表中的值
     * @param key
     * @param item
     */
    public void hashDel(String key, Object... item){
        redisTemplate.opsForHash().delete(key,item);
    }

    /**
     * 判断hash表中是否有该项的值
     * @param key
     * @param item
     * @return
     */
    public boolean hashHasKey(String key, String item){
        return redisTemplate.opsForHash().hasKey(key, item);
    }


    /**
     * hash递增，如果不存在，就会创建一个，并把新增后的值返回
     * @param key
     * @param item
     * @param by
     * @return
     */
    public double hashIncrement(String key, String item, double by){
        return redisTemplate.opsForHash().increment(key, item, by);
    }

    /**
     * hash递减，如果不存在，就会创建一个，并把新增后的值返回
     * @param key
     * @param item
     * @param by
     * @return
     */
    public double hashDecrement(String key, String item, double by){
        return redisTemplate.opsForHash().increment(key, item, -by);
    }

    // =============== Set ==================

    /**
     * 根据Key获取Set中的所有值
     * @param key
     * @return
     */
    public Set<Object> getSet(String key){
        return redisTemplate.opsForSet().members(key);
    }

    /**
     * 根据value从一个set中查询，是否存在。
     * @param key
     * @param value
     * @return
     */
    public boolean setHasKey(String key, Object value){
        return redisTemplate.opsForSet().isMember(key, value);
    }

    /**
     * 将数据放入Set缓存
     * @param key
     * @param values
     * @return
     */
    public long setSet(String key, Object... values){
        return redisTemplate.opsForSet().add(key, values);
    }


    /**
     * Set数据放入缓存
     * @param key
     * @param time
     * @param values
     * @return
     */
    public long setSetWithTime(String key, long time, Object... values){
        Long count = redisTemplate.opsForSet().add(key, values);
        if (time > 0){
            expire(key, time);
        }
        return count;
    }

    /**
     * 获取set缓存的长度
     * @param key
     * @return
     */
    public long getSetSize(String key){
        return redisTemplate.opsForSet().size(key);
    }

    /**
     * 移除值为value的
     * @param key
     * @param values
     * @return
     */
    public long removeSet(String key, Object... values){
        return redisTemplate.opsForSet().remove(key, values);
    }

    /**
     *
     * @param key
     * @param index
     * @return
     */
    public Object getListIndex(String key, long index){
       return redisTemplate.opsForList().index(key,index);
    }

    /**
     * 将List放入缓存
     * @param key
     * @param value
     * @return
     */
    public Long setList(String key, Object value){
        return redisTemplate.opsForList().rightPush(key,value);
    }

    public Long setList(String key, Object value, long time){
        Long count = redisTemplate.opsForList().rightPush(key, value);
        if (time > 0)
            expire(key, time);
        return count;
    }


    /**
     * 将List放入缓存
     * @param key
     * @param value
     * @return
     */
    public Long setList(String key, List<Object> value){
        return redisTemplate.opsForList().rightPushAll(key, value);
    }

    /**
     * 将List放入缓存
     * @param key
     * @param value
     * @return
     */
    public Long setList(String key, List<Object> value, long time){
        Long count = redisTemplate.opsForList().rightPushAll(key, value);
        if (time > 0)
            expire(key, time);
        return count;
    }

    /**
     * 根据索引修改List中的某条数据。
     * @param key
     * @param index
     * @param value
     */
    public void updateListIndex(String key, long index, Object value){
        redisTemplate.opsForList().set(key, index, value);
    }


    /**
     * 从List中移除N个值为value的数据
     * @param key
     * @param count
     * @param value
     */
    public void removeList(String key,long count, Object value){
        redisTemplate.opsForList().remove(key, count, value);
    }
}
