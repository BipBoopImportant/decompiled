package androidx.room;

import Q4.g;
import Q4.h;
import XH.C16807N;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001dR\u0014\u0010.\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\b;\u0010\u0016\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010J\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010(R\u0011\u0010L\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bI\u0010K¨\u0006M"}, d2 = {"Landroidx/room/c;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "LQ4/h;", "delegateOpenHelper", "LXH/N;", "k", "(LQ4/h;)V", "V", "Lkotlin/Function1;", "LQ4/g;", "block", "g", "(LnI/l;)Ljava/lang/Object;", "j", "()LQ4/g;", "e", "()V", "d", "Ljava/lang/Runnable;", "onAutoClose", "m", "(Ljava/lang/Runnable;)V", "a", "LQ4/h;", "i", "()LQ4/h;", "n", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "h", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "LQ4/g;", "setDelegateDatabase$room_runtime_release", "(LQ4/g;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "l", "autoCloser", "()Z", "isActive", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.c  reason: case insensitive filesystem */
public final class C7006c {

    /* renamed from: m  reason: collision with root package name */
    public static final a f44261m = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public h f44262a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f44263b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private Runnable f44264c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f44265d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private long f44266e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f44267f;

    /* renamed from: g  reason: collision with root package name */
    private int f44268g;

    /* renamed from: h  reason: collision with root package name */
    private long f44269h;

    /* renamed from: i  reason: collision with root package name */
    private g f44270i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f44271j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f44272k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f44273l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/c$a;", "", "<init>", "()V", "", "autoCloseBug", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7006c(long j10, TimeUnit timeUnit, Executor executor) {
        C17542s.j(timeUnit, "autoCloseTimeUnit");
        C17542s.j(executor, "autoCloseExecutor");
        this.f44266e = timeUnit.toMillis(j10);
        this.f44267f = executor;
        this.f44269h = SystemClock.uptimeMillis();
        this.f44272k = new C7004a(this);
        this.f44273l = new C7005b(this);
    }

    /* access modifiers changed from: private */
    public static final void c(C7006c cVar) {
        C16807N n10;
        C17542s.j(cVar, "this$0");
        synchronized (cVar.f44265d) {
            try {
                if (SystemClock.uptimeMillis() - cVar.f44269h >= cVar.f44266e) {
                    if (cVar.f44268g == 0) {
                        Runnable runnable = cVar.f44264c;
                        if (runnable != null) {
                            runnable.run();
                            n10 = C16807N.f139792a;
                        } else {
                            n10 = null;
                        }
                        if (n10 != null) {
                            g gVar = cVar.f44270i;
                            if (gVar != null && gVar.isOpen()) {
                                gVar.close();
                            }
                            cVar.f44270i = null;
                            C16807N n11 = C16807N.f139792a;
                            return;
                        }
                        throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void f(C7006c cVar) {
        C17542s.j(cVar, "this$0");
        cVar.f44267f.execute(cVar.f44273l);
    }

    public final void d() {
        synchronized (this.f44265d) {
            try {
                this.f44271j = true;
                g gVar = this.f44270i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f44270i = null;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f44265d) {
            try {
                int i10 = this.f44268g;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.f44268g = i11;
                    if (i11 == 0) {
                        if (this.f44270i != null) {
                            this.f44263b.postDelayed(this.f44272k, this.f44266e);
                        } else {
                            return;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <V> V g(C17642l<? super g, ? extends V> lVar) {
        C17542s.j(lVar, "block");
        try {
            return lVar.invoke(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f44270i;
    }

    public final h i() {
        h hVar = this.f44262a;
        if (hVar != null) {
            return hVar;
        }
        C17542s.z("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f44265d) {
            this.f44263b.removeCallbacks(this.f44272k);
            this.f44268g++;
            if (!this.f44271j) {
                g gVar = this.f44270i;
                if (gVar != null && gVar.isOpen()) {
                    return gVar;
                }
                g writableDatabase = i().getWritableDatabase();
                this.f44270i = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public final void k(h hVar) {
        C17542s.j(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f44271j;
    }

    public final void m(Runnable runnable) {
        C17542s.j(runnable, "onAutoClose");
        this.f44264c = runnable;
    }

    public final void n(h hVar) {
        C17542s.j(hVar, "<set-?>");
        this.f44262a = hVar;
    }
}
