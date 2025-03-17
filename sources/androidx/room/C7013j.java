package androidx.room;

import Q4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/room/j;", "T", "Landroidx/room/H;", "Landroidx/room/x;", "database", "<init>", "(Landroidx/room/x;)V", "", "createQuery", "()Ljava/lang/String;", "LQ4/k;", "statement", "entity", "LXH/N;", "bind", "(LQ4/k;Ljava/lang/Object;)V", "", "handle", "(Ljava/lang/Object;)I", "", "entities", "handleMultiple", "(Ljava/lang/Iterable;)I", "", "([Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.j  reason: case insensitive filesystem */
public abstract class C7013j<T> extends H {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7013j(x xVar) {
        super(xVar);
        C17542s.j(xVar, "database");
    }

    /* access modifiers changed from: protected */
    public abstract void bind(k kVar, T t10);

    /* access modifiers changed from: protected */
    public abstract String createQuery();

    public final int handle(T t10) {
        k acquire = acquire();
        try {
            bind(acquire, t10);
            return acquire.b0();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "entities");
        k acquire = acquire();
        try {
            int i10 = 0;
            for (Object bind : iterable) {
                bind(acquire, bind);
                i10 += acquire.b0();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        C17542s.j(tArr, "entities");
        k acquire = acquire();
        try {
            int i10 = 0;
            for (T bind : tArr) {
                bind(acquire, bind);
                i10 += acquire.b0();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }
}
