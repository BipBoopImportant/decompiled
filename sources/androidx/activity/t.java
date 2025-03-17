package androidx.activity;

import XH.C16807N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010#¨\u0006%"}, d2 = {"Landroidx/activity/t;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "LXH/N;", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;LnI/a;)V", "b", "()V", "a", "Ljava/util/concurrent/Executor;", "LnI/a;", "c", "Ljava/lang/Object;", "lock", "", "d", "I", "reporterCount", "", "e", "Z", "reportPosted", "f", "reportedFullyDrawn", "", "g", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15298a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f15299b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f15300c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f15301d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15302e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15303f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C17631a<C16807N>> f15304g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f15305h = new s(this);

    public t(Executor executor, C17631a<C16807N> aVar) {
        C17542s.j(executor, "executor");
        C17542s.j(aVar, "reportFullyDrawn");
        this.f15298a = executor;
        this.f15299b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(t tVar) {
        synchronized (tVar.f15300c) {
            try {
                tVar.f15302e = false;
                if (tVar.f15301d == 0 && !tVar.f15303f) {
                    tVar.f15299b.invoke();
                    tVar.b();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f15300c) {
            try {
                this.f15303f = true;
                for (C17631a invoke : this.f15304g) {
                    invoke.invoke();
                }
                this.f15304g.clear();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f15300c) {
            z10 = this.f15303f;
        }
        return z10;
    }
}
