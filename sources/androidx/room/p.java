package androidx.room;

import androidx.lifecycle.F;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/p;", "", "Landroidx/room/x;", "database", "<init>", "(Landroidx/room/x;)V", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/F;", "a", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/F;", "liveData", "LXH/N;", "b", "(Landroidx/lifecycle/F;)V", "c", "Landroidx/room/x;", "", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final x f44359a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<F<?>> f44360b;

    public p(x xVar) {
        C17542s.j(xVar, "database");
        this.f44359a = xVar;
        Set<F<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C17542s.i(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f44360b = newSetFromMap;
    }

    public final <T> F<T> a(String[] strArr, boolean z10, Callable<T> callable) {
        C17542s.j(strArr, "tableNames");
        C17542s.j(callable, "computeFunction");
        return new E(this.f44359a, this, z10, callable, strArr);
    }

    public final void b(F<?> f10) {
        C17542s.j(f10, "liveData");
        this.f44360b.add(f10);
    }

    public final void c(F<?> f10) {
        C17542s.j(f10, "liveData");
        this.f44360b.remove(f10);
    }
}
