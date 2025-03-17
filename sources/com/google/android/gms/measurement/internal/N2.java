package com.google.android.gms.measurement.internal;

import K9.C6620s;
import com.google.android.gms.internal.measurement.N0;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class N2<V> extends FutureTask<V> implements Comparable<N2<V>> {

    /* renamed from: a  reason: collision with root package name */
    private final long f49842a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f49843b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49844c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ J2 f49845d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    N2(J2 j22, Runnable runnable, boolean z10, String str) {
        super(N0.a().b(runnable), (Object) null);
        this.f49845d = j22;
        C6620s.l(str);
        long andIncrement = J2.f49676l.getAndIncrement();
        this.f49842a = andIncrement;
        this.f49844c = str;
        this.f49843b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j22.f().E().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        N2 n22 = (N2) obj;
        boolean z10 = this.f49843b;
        if (z10 != n22.f49843b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f49842a;
        long j11 = n22.f49842a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f49845d.f().G().b("Two tasks share the same index. index", Long.valueOf(this.f49842a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th2) {
        this.f49845d.f().E().b(this.f49844c, th2);
        super.setException(th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    N2(J2 j22, Callable<V> callable, boolean z10, String str) {
        super(N0.a().a(callable));
        this.f49845d = j22;
        C6620s.l(str);
        long andIncrement = J2.f49676l.getAndIncrement();
        this.f49842a = andIncrement;
        this.f49844c = str;
        this.f49843b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            j22.f().E().a("Tasks index overflow");
        }
    }
}
