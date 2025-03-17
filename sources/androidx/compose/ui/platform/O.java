package androidx.compose.ui.platform;

import D2.i;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import U0.C4879h0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16869m;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001 B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/O;", "LQJ/M;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "h1", "()Ljava/lang/Runnable;", "LXH/N;", "o1", "()V", "", "frameTimeNanos", "k1", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "y1", "(Landroid/view/Choreographer$FrameCallback;)V", "D1", "LdI/i;", "context", "block", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "b", "Landroid/view/Choreographer;", "a1", "()Landroid/view/Choreographer;", "c", "Landroid/os/Handler;", "", "d", "Ljava/lang/Object;", "lock", "LYH/m;", "e", "LYH/m;", "toRunTrampolined", "", "f", "Ljava/util/List;", "toRunOnFrame", "g", "spareToRunOnFrame", "", "h", "Z", "scheduledTrampolineDispatch", "i", "scheduledFrameDispatch", "androidx/compose/ui/platform/O$d", "j", "Landroidx/compose/ui/platform/O$d;", "dispatchCallback", "LU0/h0;", "k", "LU0/h0;", "b1", "()LU0/h0;", "frameClock", "l", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O extends M {

    /* renamed from: l  reason: collision with root package name */
    public static final c f19306l = new c((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f19307m = 8;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final C16824o<C17168i> f19308n = C16825p.b(a.f19320c);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final ThreadLocal<C17168i> f19309o = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Choreographer f19310b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Handler f19311c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f19312d;

    /* renamed from: e  reason: collision with root package name */
    private final C16869m<Runnable> f19313e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<Choreographer.FrameCallback> f19314f;

    /* renamed from: g  reason: collision with root package name */
    private List<Choreographer.FrameCallback> f19315g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19316h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f19317i;

    /* renamed from: j  reason: collision with root package name */
    private final d f19318j;

    /* renamed from: k  reason: collision with root package name */
    private final C4879h0 f19319k;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LdI/i;", "b", "()LdI/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C17168i> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19320c = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.O$a$a  reason: collision with other inner class name */
        static final class C0299a extends l implements p<Q, C17164e<? super Choreographer>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f19321c;

            C0299a(C17164e<? super C0299a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0299a(eVar);
            }

            public final Object invoke(Q q10, C17164e<? super Choreographer> eVar) {
                return ((C0299a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f19321c == 0) {
                    y.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C17168i invoke() {
            O o10 = new O(P.b() ? Choreographer.getInstance() : (Choreographer) C16310i.e(C16311i0.c(), new C0299a((C17164e<? super C0299a>) null)), i.a(Looper.getMainLooper()), (DefaultConstructorMarker) null);
            return o10.plus(o10.b1());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/O$b", "Ljava/lang/ThreadLocal;", "LdI/i;", "a", "()LdI/i;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends ThreadLocal<C17168i> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C17168i initialValue() {
            Choreographer instance = Choreographer.getInstance();
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                O o10 = new O(instance, i.a(myLooper), (DefaultConstructorMarker) null);
                return o10.plus(o10.b1());
            }
            throw new IllegalStateException("no Looper on this thread");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/O$c;", "", "<init>", "()V", "LdI/i;", "Main$delegate", "LXH/o;", "b", "()LdI/i;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17168i a() {
            if (P.b()) {
                return b();
            }
            C17168i iVar = (C17168i) O.f19309o.get();
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final C17168i b() {
            return (C17168i) O.f19308n.getValue();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/O$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "LXH/N;", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f19322a;

        d(O o10) {
            this.f19322a = o10;
        }

        public void doFrame(long j10) {
            this.f19322a.f19311c.removeCallbacks(this);
            this.f19322a.o1();
            this.f19322a.k1(j10);
        }

        public void run() {
            this.f19322a.o1();
            Object R02 = this.f19322a.f19312d;
            O o10 = this.f19322a;
            synchronized (R02) {
                try {
                    if (o10.f19314f.isEmpty()) {
                        o10.a1().removeFrameCallback(this);
                        o10.f19317i = false;
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ O(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable h1() {
        Runnable D10;
        synchronized (this.f19312d) {
            D10 = this.f19313e.D();
        }
        return D10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2.get(r1).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k1(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f19312d
            monitor-enter(r0)
            boolean r1 = r4.f19317i     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.f19317i = r1     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r2 = r4.f19314f     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r4.f19315g     // Catch:{ all -> 0x002b }
            r4.f19314f = r3     // Catch:{ all -> 0x002b }
            r4.f19315g = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.O.k1(long):void");
    }

    /* access modifiers changed from: private */
    public final void o1() {
        boolean z10;
        do {
            Runnable h12 = h1();
            while (h12 != null) {
                h12.run();
                h12 = h1();
            }
            synchronized (this.f19312d) {
                if (this.f19313e.isEmpty()) {
                    z10 = false;
                    this.f19316h = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final void D1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f19312d) {
            this.f19314f.remove(frameCallback);
        }
    }

    public void E0(C17168i iVar, Runnable runnable) {
        synchronized (this.f19312d) {
            try {
                this.f19313e.addLast(runnable);
                if (!this.f19316h) {
                    this.f19316h = true;
                    this.f19311c.post(this.f19318j);
                    if (!this.f19317i) {
                        this.f19317i = true;
                        this.f19310b.postFrameCallback(this.f19318j);
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Choreographer a1() {
        return this.f19310b;
    }

    public final C4879h0 b1() {
        return this.f19319k;
    }

    public final void y1(Choreographer.FrameCallback frameCallback) {
        synchronized (this.f19312d) {
            try {
                this.f19314f.add(frameCallback);
                if (!this.f19317i) {
                    this.f19317i = true;
                    this.f19310b.postFrameCallback(this.f19318j);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private O(Choreographer choreographer, Handler handler) {
        this.f19310b = choreographer;
        this.f19311c = handler;
        this.f19312d = new Object();
        this.f19313e = new C16869m<>();
        this.f19314f = new ArrayList();
        this.f19315g = new ArrayList();
        this.f19318j = new d(this);
        this.f19319k = new Q(choreographer, this);
    }
}
