package androidx.room;

import Q4.k;
import YH.C16877v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0019\u0010\u001bJ#\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001c\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000f¢\u0006\u0004\b \u0010!J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b \u0010\"¨\u0006#"}, d2 = {"Landroidx/room/k;", "T", "Landroidx/room/H;", "Landroidx/room/x;", "database", "<init>", "(Landroidx/room/x;)V", "LQ4/k;", "statement", "entity", "LXH/N;", "bind", "(LQ4/k;Ljava/lang/Object;)V", "insert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "insertAndReturnId", "(Ljava/lang/Object;)J", "", "", "insertAndReturnIdsArray", "(Ljava/util/Collection;)[J", "([Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Ljava/util/Collection;)[Ljava/lang/Long;", "([Ljava/lang/Object;)[Ljava/lang/Long;", "", "insertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.k  reason: case insensitive filesystem */
public abstract class C7014k<T> extends H {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7014k(x xVar) {
        super(xVar);
        C17542s.j(xVar, "database");
    }

    /* access modifiers changed from: protected */
    public abstract void bind(k kVar, T t10);

    public final void insert(T t10) {
        k acquire = acquire();
        try {
            bind(acquire, t10);
            acquire.v1();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t10) {
        k acquire = acquire();
        try {
            bind(acquire, t10);
            return acquire.v1();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        C17542s.j(collection, "entities");
        k acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i10 = 0;
            for (Object next : collection) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                bind(acquire, next);
                jArr[i10] = acquire.v1();
                i10 = i11;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        C17542s.j(collection, "entities");
        k acquire = acquire();
        Iterator<? extends T> it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                bind(acquire, it.next());
                lArr[i10] = Long.valueOf(acquire.v1());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        C17542s.j(tArr, "entities");
        k acquire = acquire();
        try {
            List c10 = C16877v.c();
            for (T bind : tArr) {
                bind(acquire, bind);
                c10.add(Long.valueOf(acquire.v1()));
            }
            List<Long> a10 = C16877v.a(c10);
            release(acquire);
            return a10;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final void insert(T[] tArr) {
        C17542s.j(tArr, "entities");
        k acquire = acquire();
        try {
            for (T bind : tArr) {
                bind(acquire, bind);
                acquire.v1();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        C17542s.j(tArr, "entities");
        k acquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int length = tArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                bind(acquire, tArr[i10]);
                jArr[i11] = acquire.v1();
                i10++;
                i11 = i12;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        C17542s.j(tArr, "entities");
        k acquire = acquire();
        Iterator a10 = C17527c.a(tArr);
        try {
            int length = tArr.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bind(acquire, a10.next());
                lArr[i10] = Long.valueOf(acquire.v1());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        C17542s.j(collection, "entities");
        k acquire = acquire();
        try {
            List c10 = C16877v.c();
            for (Object bind : collection) {
                bind(acquire, bind);
                c10.add(Long.valueOf(acquire.v1()));
            }
            List<Long> a10 = C16877v.a(c10);
            release(acquire);
            return a10;
        } catch (Throwable th2) {
            release(acquire);
            throw th2;
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "entities");
        k acquire = acquire();
        try {
            for (Object bind : iterable) {
                bind(acquire, bind);
                acquire.v1();
            }
        } finally {
            release(acquire);
        }
    }
}
