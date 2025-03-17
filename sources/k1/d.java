package K1;

import L1.j;
import L1.p;
import L1.s;
import QJ.F0;
import QJ.Q;
import QJ.R0;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import dI.C17164e;
import eI.C17187b;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import p1.b1;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LK1/d;", "Landroid/view/ScrollCaptureCallback;", "LL1/p;", "node", "Lc2/p;", "viewportBoundsInWindow", "LQJ/Q;", "coroutineScope", "LK1/d$a;", "listener", "<init>", "(LL1/p;Lc2/p;LQJ/Q;LK1/d$a;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;Lc2/p;LdI/e;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "LXH/N;", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "LL1/p;", "b", "Lc2/p;", "c", "LK1/d$a;", "d", "LQJ/Q;", "LK1/h;", "LK1/h;", "scrollTracker", "", "f", "I", "requestCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements ScrollCaptureCallback {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final p f8868a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.p f8869b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f8870c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f8871d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final h f8872e;

    /* renamed from: f  reason: collision with root package name */
    private int f8873f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"LK1/d$a;", "", "LXH/N;", "a", "()V", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {190}, m = "invokeSuspend")
    static final class b extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f8874c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f8875d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f8876e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Runnable runnable, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f8875d = dVar;
            this.f8876e = runnable;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f8875d, this.f8876e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f8874c;
            if (i10 == 0) {
                y.b(obj);
                h c10 = this.f8875d.f8872e;
                this.f8874c = 1;
                if (c10.g(0.0f, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f8875d.f8870c.b();
            this.f8876e.run();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {116}, m = "invokeSuspend")
    static final class c extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f8877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f8878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f8879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Rect f8880f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f8881g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f8878d = dVar;
            this.f8879e = scrollCaptureSession;
            this.f8880f = rect;
            this.f8881g = consumer;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f8878d, this.f8879e, this.f8880f, this.f8881g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f8877c;
            if (i10 == 0) {
                y.b(obj);
                d dVar = this.f8878d;
                ScrollCaptureSession scrollCaptureSession = this.f8879e;
                c2.p d10 = b1.d(this.f8880f);
                this.f8877c = 1;
                obj = dVar.e(scrollCaptureSession, d10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f8881g.accept(b1.a((c2.p) obj));
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {129, 132}, m = "onScrollCaptureImageRequest")
    /* renamed from: K1.d$d  reason: collision with other inner class name */
    static final class C0125d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f8882c;

        /* renamed from: d  reason: collision with root package name */
        Object f8883d;

        /* renamed from: e  reason: collision with root package name */
        Object f8884e;

        /* renamed from: f  reason: collision with root package name */
        int f8885f;

        /* renamed from: g  reason: collision with root package name */
        int f8886g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f8887h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d f8888i;

        /* renamed from: j  reason: collision with root package name */
        int f8889j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0125d(d dVar, C17164e<? super C0125d> eVar) {
            super(eVar);
            this.f8888i = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8887h = obj;
            this.f8889j |= Integer.MIN_VALUE;
            return this.f8888i.e((ScrollCaptureSession) null, (c2.p) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f8890c = new e();

        e() {
            super(1);
        }

        public final void a(long j10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {85}, m = "invokeSuspend")
    static final class f extends l implements nI.p<Float, C17164e<? super Float>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f8891c;

        /* renamed from: d  reason: collision with root package name */
        int f8892d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ float f8893e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f8894f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f8894f = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f8894f, eVar);
            fVar.f8893e = ((Number) obj).floatValue();
            return fVar;
        }

        public final Object i(float f10, C17164e<? super Float> eVar) {
            return ((f) create(Float.valueOf(f10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).floatValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object f10 = C17187b.f();
            int i10 = this.f8892d;
            if (i10 == 0) {
                y.b(obj);
                float f11 = this.f8893e;
                nI.p<C5667g, C17164e<? super C5667g>, Object> c10 = n.c(this.f8894f.f8868a);
                if (c10 != null) {
                    boolean b10 = ((j) this.f8894f.f8868a.w().q(s.f9010a.I())).b();
                    if (b10) {
                        f11 = -f11;
                    }
                    C5667g d10 = C5667g.d(C5668h.a(0.0f, f11));
                    this.f8891c = b10;
                    this.f8892d = 1;
                    obj = c10.invoke(d10, this);
                    if (obj == f10) {
                        return f10;
                    }
                    z10 = b10;
                } else {
                    D1.a.c("Required value was null.");
                    throw new C16820k();
                }
            } else if (i10 == 1) {
                z10 = this.f8891c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float n10 = C5667g.n(((C5667g) obj).v());
            if (z10) {
                n10 = -n10;
            }
            return kotlin.coroutines.jvm.internal.b.d(n10);
        }
    }

    public d(p pVar, c2.p pVar2, Q q10, a aVar) {
        this.f8868a = pVar;
        this.f8869b = pVar2;
        this.f8870c = aVar;
        this.f8871d = S.i(q10, g.f8897a);
        this.f8872e = new h(pVar2.i(), new f(this, (C17164e<? super f>) null));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(android.view.ScrollCaptureSession r9, c2.p r10, dI.C17164e<? super c2.p> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof K1.d.C0125d
            if (r0 == 0) goto L_0x0013
            r0 = r11
            K1.d$d r0 = (K1.d.C0125d) r0
            int r1 = r0.f8889j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8889j = r1
            goto L_0x0018
        L_0x0013:
            K1.d$d r0 = new K1.d$d
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f8887h
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f8889j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            int r9 = r0.f8886g
            int r10 = r0.f8885f
            java.lang.Object r1 = r0.f8884e
            c2.p r1 = (c2.p) r1
            java.lang.Object r2 = r0.f8883d
            android.view.ScrollCaptureSession r2 = K1.a.a(r2)
            java.lang.Object r0 = r0.f8882c
            K1.d r0 = (K1.d) r0
            XH.y.b(r11)
            r11 = r2
            goto L_0x009c
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            int r9 = r0.f8886g
            int r10 = r0.f8885f
            java.lang.Object r2 = r0.f8884e
            c2.p r2 = (c2.p) r2
            java.lang.Object r4 = r0.f8883d
            android.view.ScrollCaptureSession r4 = K1.a.a(r4)
            java.lang.Object r5 = r0.f8882c
            K1.d r5 = (K1.d) r5
            XH.y.b(r11)
            r11 = r10
            r10 = r2
            r2 = r9
            r9 = r4
            goto L_0x0082
        L_0x0061:
            XH.y.b(r11)
            int r11 = r10.m()
            int r2 = r10.e()
            K1.h r5 = r8.f8872e
            r0.f8882c = r8
            r0.f8883d = r9
            r0.f8884e = r10
            r0.f8885f = r11
            r0.f8886g = r2
            r0.f8889j = r4
            java.lang.Object r4 = r5.f(r11, r2, r0)
            if (r4 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r5 = r8
        L_0x0082:
            K1.d$e r4 = K1.d.e.f8890c
            r0.f8882c = r5
            r0.f8883d = r9
            r0.f8884e = r10
            r0.f8885f = r11
            r0.f8886g = r2
            r0.f8889j = r3
            java.lang.Object r0 = U0.C4884j0.c(r4, r0)
            if (r0 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r10
            r10 = r11
            r0 = r5
            r11 = r9
            r9 = r2
        L_0x009c:
            K1.h r2 = r0.f8872e
            int r10 = r2.c(r10)
            K1.h r2 = r0.f8872e
            int r9 = r2.c(r9)
            r6 = 5
            r7 = 0
            r2 = 0
            r4 = 0
            r3 = r10
            r5 = r9
            c2.p r1 = c2.p.d(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r9) goto L_0x00bb
            c2.p$a r9 = c2.p.f23047e
            c2.p r9 = r9.a()
            return r9
        L_0x00bb:
            L1.p r9 = r0.f8868a
            G1.c0 r9 = r9.e()
            if (r9 == 0) goto L_0x0109
            android.view.Surface r10 = r11.getSurface()
            android.graphics.Canvas r10 = r10.lockHardwareCanvas()
            android.graphics.BlendMode r2 = android.graphics.BlendMode.CLEAR     // Catch:{ all -> 0x0100 }
            r3 = 0
            r10.drawColor(r3, r2)     // Catch:{ all -> 0x0100 }
            p1.n0 r2 = p1.C5702H.b(r10)     // Catch:{ all -> 0x0100 }
            int r4 = r1.j()     // Catch:{ all -> 0x0100 }
            float r4 = (float) r4     // Catch:{ all -> 0x0100 }
            float r4 = -r4
            int r5 = r1.m()     // Catch:{ all -> 0x0100 }
            float r5 = (float) r5     // Catch:{ all -> 0x0100 }
            float r5 = -r5
            r2.d(r4, r5)     // Catch:{ all -> 0x0100 }
            r4 = 0
            r9.r2(r2, r4)     // Catch:{ all -> 0x0100 }
            android.view.Surface r9 = r11.getSurface()
            r9.unlockCanvasAndPost(r10)
            K1.h r9 = r0.f8872e
            float r9 = r9.b()
            int r9 = pI.C17752b.e(r9)
            c2.p r9 = r1.r(r3, r9)
            return r9
        L_0x0100:
            r9 = move-exception
            android.view.Surface r11 = r11.getSurface()
            r11.unlockCanvasAndPost(r10)
            throw r9
        L_0x0109:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Could not find coordinator for semantics node."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.e(android.view.ScrollCaptureSession, c2.p, dI.e):java.lang.Object");
    }

    public void onScrollCaptureEnd(Runnable runnable) {
        F0 unused = C16314k.d(this.f8871d, R0.f137599a, (T) null, new b(this, runnable, (C17164e<? super b>) null), 2, (Object) null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        F0 unused = f.c(this.f8871d, cancellationSignal, new c(this, scrollCaptureSession, rect, consumer, (C17164e<? super c>) null));
    }

    public void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(b1.a(this.f8869b));
    }

    public void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f8872e.d();
        this.f8873f = 0;
        this.f8870c.a();
        runnable.run();
    }
}
