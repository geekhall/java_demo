package cn.geekhall.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * Multiton.java
 * 多例：
 *  实际上对于多例设计能够体现在很多的方面，
 *  例如：现在要定义一个表示一周时间数的类，那么这个类只能够有七个对象。如果定义一个表示性别的类，那么这个类只能有两个对象。
 *  例如表示颜色基色的类只有三个对象，这些都属于多例设计模式
 *
 * @author yiny
 */
public class Multiton {

    public interface Creator<V> {
        public Object create();
        public V cast(Object value);
    }

    public static abstract class TypedCreator<A> implements Creator<A> {
        private final Class<A> tclass;
        public TypedCreator(Class<A> tclass){
            this.tclass = tclass;
        }

        public final A cast(Object value){
            return tclass.cast(value);
        }
    }

    public static final class SuppliedCreator<A> extends TypedCreator<A> {
        private final Supplier<A> supplier;

        public SuppliedCreator(Class<A> tclass, Supplier<A> supplier) {
            super(tclass);
            this.supplier = supplier;
        }

        public Object create() {
            return null;
        }
    }

    /**
     * The storage.
     */
    private final ConcurrentMap<Creator<?>, Object> multitons = new ConcurrentHashMap<>();

    /**
     * The getter.
     *
     * @param key  The unique key behind which the value is to be stored.
     * @param <V>  the type of the value that should be returned.
     * @param <C>
     * @return      The value stored ( and perhaps created) behind the key.
     */
    public <V, C extends Multiton.Creator<V>> V get(final C key) {
        return key.cast(multitons.computeIfAbsent(key, k -> k.create()));
    }
}
