package j0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\r¨\u0006\u000f"}, d2 = {"V", "Lj0/u;", "a", "()Lj0/u;", "", "key1", "value1", "b", "(JLjava/lang/Object;)Lj0/u;", "Lj0/H;", "c", "()Lj0/H;", "", "Lj0/H;", "EmptyLongObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.v  reason: case insensitive filesystem */
public final class C5465v {

    /* renamed from: a  reason: collision with root package name */
    private static final H f24656a = new H(0);

    public static final <V> C5464u<V> a() {
        H h10 = f24656a;
        C17542s.h(h10, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return h10;
    }

    public static final <V> C5464u<V> b(long j10, V v10) {
        H h10 = new H(0, 1, (DefaultConstructorMarker) null);
        h10.s(j10, v10);
        return h10;
    }

    public static final <V> H<V> c() {
        return new H<>(0, 1, (DefaultConstructorMarker) null);
    }
}
