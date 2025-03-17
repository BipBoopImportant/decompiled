package T;

import C.C4389d0;
import C.C4400j;
import C.C4404l;
import C.C4407o;
import C.C4408p;
import C.C4409q;
import C.C4414w;
import C.C4415x;
import C.H0;
import C.I0;
import C.J0;
import G.e;
import G.p;
import H2.i;
import I.d;
import I.n;
import J.f;
import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import android.content.Context;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C5033l0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.V0;
import androidx.concurrent.futures.c;
import androidx.lifecycle.C5221y;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import nI.C17642l;
import ob.C10101e;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 X2\u00020\u0001:\u00014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"Jk\u0010-\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010(2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\u00122\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0017¢\u0006\u0004\b1\u0010\u0003J\u0017\u00102\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010A\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010E\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0L8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010S\u001a\u00020R2\u0006\u0010S\u001a\u00020R8B@BX\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"LT/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lob/e;", "LC/w;", "u", "(Landroid/content/Context;)Lob/e;", "LC/q;", "cameraSelector", "LC/p;", "cameraInfo", "Landroidx/camera/core/impl/B;", "q", "(LC/q;LC/p;)Landroidx/camera/core/impl/B;", "cameraX", "LXH/N;", "y", "(LC/w;)V", "z", "(Landroid/content/Context;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "LC/H0;", "useCases", "LC/j;", "o", "(Landroidx/lifecycle/y;LC/q;[LC/H0;)LC/j;", "LC/I0;", "useCaseGroup", "n", "(Landroidx/lifecycle/y;LC/q;LC/I0;)LC/j;", "primaryCameraSelector", "secondaryCameraSelector", "LC/d0;", "primaryLayoutSettings", "secondaryLayoutSettings", "LC/J0;", "viewPort", "", "LC/l;", "effects", "p", "(Landroidx/lifecycle/y;LC/q;LC/q;LC/d0;LC/d0;LC/J0;Ljava/util/List;[LC/H0;)LC/j;", "A", "([LC/H0;)V", "B", "r", "(LC/q;)LC/p;", "a", "Ljava/lang/Object;", "mLock", "LC/x$b;", "b", "LC/x$b;", "mCameraXConfigProvider", "c", "Lob/e;", "mCameraXInitializeFuture", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "d", "mCameraXShutdownFuture", "LT/c;", "e", "LT/c;", "mLifecycleCameraRepository", "f", "LC/w;", "mCameraX", "g", "Landroid/content/Context;", "mContext", "", "LJ/f$b;", "Landroidx/camera/core/impl/V0;", "h", "Ljava/util/Map;", "mCameraInfoMap", "", "cameraOperatingMode", "s", "()I", "x", "(I)V", "i", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: i  reason: collision with root package name */
    public static final a f13479i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final g f13480j = new g();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f13481a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C4415x.b f13482b;

    /* renamed from: c  reason: collision with root package name */
    private C10101e<C4414w> f13483c;

    /* renamed from: d  reason: collision with root package name */
    private C10101e<Void> f13484d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final c f13485e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C4414w f13486f;

    /* renamed from: g  reason: collision with root package name */
    private Context f13487g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Map<f.b, V0> f13488h;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LT/g$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lob/e;", "LT/g;", "b", "(Landroid/content/Context;)Lob/e;", "sAppInstance", "LT/g;", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LC/w;", "kotlin.jvm.PlatformType", "cameraX", "LT/g;", "a", "(LC/w;)LT/g;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: T.g$a$a  reason: collision with other inner class name */
        static final class C0199a extends C17544u implements C17642l<C4414w, g> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f13489c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0199a(Context context) {
                super(1);
                this.f13489c = context;
            }

            /* renamed from: a */
            public final g invoke(C4414w wVar) {
                g j10 = g.f13480j;
                C17542s.i(wVar, "cameraX");
                j10.y(wVar);
                g j11 = g.f13480j;
                Context a10 = e.a(this.f13489c);
                C17542s.i(a10, "getApplicationContext(context)");
                j11.z(a10);
                return g.f13480j;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final g c(C17642l lVar, Object obj) {
            C17542s.j(lVar, "$tmp0");
            return (g) lVar.invoke(obj);
        }

        public final C10101e<g> b(Context context) {
            C17542s.j(context, "context");
            i.g(context);
            C10101e<g> G10 = n.G(g.f13480j.u(context), new f(new C0199a(context)), H.a.a());
            C17542s.i(G10, "context: Context): Liste…tExecutor()\n            )");
            return G10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T/g$b", "LI/c;", "Ljava/lang/Void;", "result", "LXH/N;", "c", "(Ljava/lang/Void;)V", "", "t", "b", "(Ljava/lang/Throwable;)V", "camera-lifecycle_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a<C4414w> f13490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4414w f13491b;

        b(c.a<C4414w> aVar, C4414w wVar) {
            this.f13490a = aVar;
            this.f13491b = wVar;
        }

        public void b(Throwable th2) {
            C17542s.j(th2, "t");
            this.f13490a.f(th2);
        }

        /* renamed from: c */
        public void a(Void voidR) {
            this.f13490a.c(this.f13491b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u00000\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "it", "Lob/e;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Void;)Lob/e;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Void, C10101e<Void>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4414w f13492c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4414w wVar) {
            super(1);
            this.f13492c = wVar;
        }

        /* renamed from: a */
        public final C10101e<Void> invoke(Void voidR) {
            return this.f13492c.i();
        }
    }

    private g() {
        C10101e<Void> p10 = n.p(null);
        C17542s.i(p10, "immediateFuture<Void>(null)");
        this.f13484d = p10;
        this.f13485e = new c();
        this.f13488h = new HashMap();
    }

    /* access modifiers changed from: private */
    public final B q(C4409q qVar, C4408p pVar) {
        Iterator<C4407o> it = qVar.c().iterator();
        B b10 = null;
        while (it.hasNext()) {
            C4407o next = it.next();
            C17542s.i(next, "cameraSelector.cameraFilterSet");
            C4407o oVar = next;
            if (!C17542s.e(oVar.a(), C4407o.f5378a)) {
                D a10 = C5033l0.a(oVar.a());
                Context context = this.f13487g;
                C17542s.g(context);
                B a11 = a10.a(pVar, context);
                if (a11 == null) {
                    continue;
                } else if (b10 == null) {
                    b10 = a11;
                } else {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
            }
        }
        return b10 == null ? E.a() : b10;
    }

    /* access modifiers changed from: private */
    public final int s() {
        C4414w wVar = this.f13486f;
        if (wVar == null) {
            return 0;
        }
        C17542s.g(wVar);
        return wVar.e().d().c();
    }

    public static final C10101e<g> t(Context context) {
        return f13479i.b(context);
    }

    /* access modifiers changed from: private */
    public final C10101e<C4414w> u(Context context) {
        synchronized (this.f13481a) {
            C10101e<C4414w> eVar = this.f13483c;
            if (eVar != null) {
                C17542s.h(eVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
                return eVar;
            }
            C10101e<C4414w> a10 = androidx.concurrent.futures.c.a(new d(this, new C4414w(context, this.f13482b)));
            this.f13483c = a10;
            C17542s.h(a10, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.CameraX>");
            return a10;
        }
    }

    /* access modifiers changed from: private */
    public static final Object v(g gVar, C4414w wVar, c.a aVar) {
        C17542s.j(gVar, "this$0");
        C17542s.j(wVar, "$cameraX");
        C17542s.j(aVar, "completer");
        synchronized (gVar.f13481a) {
            d<T> f10 = d.b(gVar.f13484d).f(new e(new c(wVar)), H.a.a());
            C17542s.i(f10, "cameraX = CameraX(contex…                        )");
            n.j(f10, new b(aVar, wVar), H.a.a());
            C16807N n10 = C16807N.f139792a;
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* access modifiers changed from: private */
    public static final C10101e w(C17642l lVar, Object obj) {
        C17542s.j(lVar, "$tmp0");
        return (C10101e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public final void x(int i10) {
        C4414w wVar = this.f13486f;
        if (wVar != null) {
            C17542s.g(wVar);
            wVar.e().d().d(i10);
        }
    }

    /* access modifiers changed from: private */
    public final void y(C4414w wVar) {
        this.f13486f = wVar;
    }

    /* access modifiers changed from: private */
    public final void z(Context context) {
        this.f13487g = context;
    }

    public void A(H0... h0Arr) {
        C17542s.j(h0Arr, "useCases");
        V4.a.c("CX:unbind");
        try {
            p.a();
            if (s() != 2) {
                this.f13485e.k(C16877v.q(Arrays.copyOf(h0Arr, h0Arr.length)));
                C16807N n10 = C16807N.f139792a;
                return;
            }
            throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            V4.a.f();
        }
    }

    public void B() {
        V4.a.c("CX:unbindAll");
        try {
            p.a();
            x(0);
            this.f13485e.l();
            C16807N n10 = C16807N.f139792a;
        } finally {
            V4.a.f();
        }
    }

    public final C4400j n(C5221y yVar, C4409q qVar, I0 i02) {
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(qVar, "cameraSelector");
        C17542s.j(i02, "useCaseGroup");
        V4.a.c("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (s() != 2) {
                x(1);
                C4389d0 d0Var = C4389d0.f5320f;
                C17542s.i(d0Var, "DEFAULT");
                C17542s.i(d0Var, "DEFAULT");
                J0 c10 = i02.c();
                List<C4404l> a10 = i02.a();
                C17542s.i(a10, "useCaseGroup.effects");
                List<H0> b10 = i02.b();
                C17542s.i(b10, "useCaseGroup.useCases");
                H0[] h0Arr = (H0[]) b10.toArray(new H0[0]);
                return p(yVar, qVar, (C4409q) null, d0Var, d0Var, c10, a10, (H0[]) Arrays.copyOf(h0Arr, h0Arr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            V4.a.f();
        }
    }

    public final C4400j o(C5221y yVar, C4409q qVar, H0... h0Arr) {
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(qVar, "cameraSelector");
        C17542s.j(h0Arr, "useCases");
        V4.a.c("CX:bindToLifecycle");
        try {
            if (s() != 2) {
                x(1);
                C4389d0 d0Var = C4389d0.f5320f;
                C17542s.i(d0Var, "DEFAULT");
                C17542s.i(d0Var, "DEFAULT");
                return p(yVar, qVar, (C4409q) null, d0Var, d0Var, (J0) null, C16877v.n(), (H0[]) Arrays.copyOf(h0Arr, h0Arr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            V4.a.f();
        }
    }

    public final C4400j p(C5221y yVar, C4409q qVar, C4409q qVar2, C4389d0 d0Var, C4389d0 d0Var2, J0 j02, List<? extends C4404l> list, H0... h0Arr) {
        V0 v02;
        J j10;
        C5221y yVar2 = yVar;
        C4409q qVar3 = qVar;
        C4409q qVar4 = qVar2;
        H0[] h0Arr2 = h0Arr;
        C17542s.j(yVar2, "lifecycleOwner");
        C17542s.j(qVar3, "primaryCameraSelector");
        C17542s.j(d0Var, "primaryLayoutSettings");
        C17542s.j(d0Var2, "secondaryLayoutSettings");
        C17542s.j(list, "effects");
        C17542s.j(h0Arr2, "useCases");
        V4.a.c("CX:bindToLifecycle-internal");
        try {
            p.a();
            C4414w f10 = this.f13486f;
            C17542s.g(f10);
            J e10 = qVar3.e(f10.f().a());
            C17542s.i(e10, "primaryCameraSelector.se…cameraRepository.cameras)");
            e10.r(true);
            C4408p r10 = r(qVar3);
            C17542s.h(r10, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
            V0 v03 = (V0) r10;
            if (qVar4 != null) {
                C4414w f11 = this.f13486f;
                C17542s.g(f11);
                J e11 = qVar4.e(f11.f().a());
                e11.r(false);
                C4408p r11 = r(qVar4);
                C17542s.h(r11, "null cannot be cast to non-null type androidx.camera.core.impl.RestrictedCameraInfo");
                j10 = e11;
                v02 = (V0) r11;
            } else {
                j10 = null;
                v02 = null;
            }
            b c10 = this.f13485e.c(yVar2, f.B(v03, v02));
            Collection<b> e12 = this.f13485e.e();
            for (H0 h02 : C16870n.d0(h0Arr)) {
                for (b next : e12) {
                    C17542s.i(next, "lifecycleCameras");
                    b bVar = next;
                    if (bVar.w(h02) && !C17542s.e(bVar, c10)) {
                        V v10 = V.f144353a;
                        String format = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{h02}, 1));
                        C17542s.i(format, "format(format, *args)");
                        throw new IllegalStateException(format);
                    }
                }
            }
            if (c10 == null) {
                c g10 = this.f13485e;
                C4414w f12 = this.f13486f;
                C17542s.g(f12);
                D.a d10 = f12.e().d();
                C4414w f13 = this.f13486f;
                C17542s.g(f13);
                G d11 = f13.d();
                C4414w f14 = this.f13486f;
                C17542s.g(f14);
                c10 = g10.b(yVar2, new f(e10, j10, v03, v02, d0Var, d0Var2, d10, d11, f14.h()));
            }
            if (h0Arr2.length == 0) {
                C17542s.g(c10);
            } else {
                c g11 = this.f13485e;
                C17542s.g(c10);
                C4414w f15 = this.f13486f;
                C17542s.g(f15);
                g11.a(c10, j02, list, C16877v.q(Arrays.copyOf(h0Arr2, h0Arr2.length)), f15.e().d());
            }
            return c10;
        } finally {
            V4.a.f();
        }
    }

    public C4408p r(C4409q qVar) {
        Object obj;
        C17542s.j(qVar, "cameraSelector");
        V4.a.c("CX:getCameraInfo");
        try {
            C4414w f10 = this.f13486f;
            C17542s.g(f10);
            I j10 = qVar.e(f10.f().a()).j();
            C17542s.i(j10, "cameraSelector.select(mC…meras).cameraInfoInternal");
            B c10 = q(qVar, j10);
            f.b a10 = f.b.a(j10.d(), c10.Q());
            C17542s.i(a10, "create(\n                …ilityId\n                )");
            synchronized (this.f13481a) {
                obj = this.f13488h.get(a10);
                if (obj == null) {
                    obj = new V0(j10, c10);
                    this.f13488h.put(a10, obj);
                }
                C16807N n10 = C16807N.f139792a;
            }
            V0 v02 = (V0) obj;
            V4.a.f();
            return v02;
        } catch (Throwable th2) {
            V4.a.f();
            throw th2;
        }
    }
}
