package s0;

import I2.C0;
import I2.C4600b0;
import I2.C4628p0;
import I2.I;
import I2.r;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.P;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g1.C5342k;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import x2.d;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010'\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010)\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b%\u00103R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00103R\u0017\u00109\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b8\u00103R\u0017\u0010;\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010>\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0017\u0010A\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u0017\u0010D\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/R\u0017\u0010G\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u0017\u0010J\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bI\u0010/R\u0017\u0010M\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bL\u0010/R\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b\u001c\u0010QR\u0016\u0010U\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Ls0/U;", "", "LI2/C0;", "insets", "Landroid/view/View;", "view", "<init>", "(LI2/C0;Landroid/view/View;)V", "LXH/N;", "j", "(Landroid/view/View;)V", "b", "windowInsets", "", "types", "k", "(LI2/C0;I)V", "m", "(LI2/C0;)V", "n", "Ls0/b;", "a", "Ls0/b;", "getCaptionBar", "()Ls0/b;", "captionBar", "d", "displayCutout", "c", "e", "ime", "getMandatorySystemGestures", "mandatorySystemGestures", "f", "navigationBars", "h", "statusBars", "g", "i", "systemBars", "getSystemGestures", "systemGestures", "getTappableElement", "tappableElement", "Ls0/S;", "Ls0/S;", "getWaterfall", "()Ls0/S;", "waterfall", "Ls0/T;", "Ls0/T;", "()Ls0/T;", "safeDrawing", "l", "getSafeGestures", "safeGestures", "getSafeContent", "safeContent", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "()Z", "consumes", "v", "I", "accessCount", "Ls0/u;", "w", "Ls0/u;", "insetsListener", "x", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.U  reason: case insensitive filesystem */
public final class C5849U {

    /* renamed from: A  reason: collision with root package name */
    private static boolean f28735A;

    /* renamed from: x  reason: collision with root package name */
    public static final a f28736x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f28737y = 8;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final WeakHashMap<View, C5849U> f28738z = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final C5856b f28739a;

    /* renamed from: b  reason: collision with root package name */
    private final C5856b f28740b;

    /* renamed from: c  reason: collision with root package name */
    private final C5856b f28741c;

    /* renamed from: d  reason: collision with root package name */
    private final C5856b f28742d;

    /* renamed from: e  reason: collision with root package name */
    private final C5856b f28743e;

    /* renamed from: f  reason: collision with root package name */
    private final C5856b f28744f;

    /* renamed from: g  reason: collision with root package name */
    private final C5856b f28745g;

    /* renamed from: h  reason: collision with root package name */
    private final C5856b f28746h;

    /* renamed from: i  reason: collision with root package name */
    private final C5856b f28747i;

    /* renamed from: j  reason: collision with root package name */
    private final C5847S f28748j;

    /* renamed from: k  reason: collision with root package name */
    private final C5848T f28749k;

    /* renamed from: l  reason: collision with root package name */
    private final C5848T f28750l;

    /* renamed from: m  reason: collision with root package name */
    private final C5848T f28751m;

    /* renamed from: n  reason: collision with root package name */
    private final C5847S f28752n;

    /* renamed from: o  reason: collision with root package name */
    private final C5847S f28753o;

    /* renamed from: p  reason: collision with root package name */
    private final C5847S f28754p;

    /* renamed from: q  reason: collision with root package name */
    private final C5847S f28755q;

    /* renamed from: r  reason: collision with root package name */
    private final C5847S f28756r;

    /* renamed from: s  reason: collision with root package name */
    private final C5847S f28757s;

    /* renamed from: t  reason: collision with root package name */
    private final C5847S f28758t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f28759u;

    /* renamed from: v  reason: collision with root package name */
    private int f28760v;

    /* renamed from: w  reason: collision with root package name */
    private final C5875u f28761w;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ls0/U$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Ls0/U;", "d", "(Landroid/view/View;)Ls0/U;", "LI2/C0;", "windowInsets", "", "type", "", "name", "Ls0/b;", "e", "(LI2/C0;ILjava/lang/String;)Ls0/b;", "Ls0/S;", "f", "(LI2/C0;ILjava/lang/String;)Ls0/S;", "c", "(LU0/m;I)Ls0/U;", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s0.U$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: s0.U$a$a  reason: collision with other inner class name */
        static final class C0456a extends C17544u implements C17642l<M, L> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5849U f28762c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ View f28763d;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"s0/U$a$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: s0.U$a$a$a  reason: collision with other inner class name */
            public static final class C0457a implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C5849U f28764a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f28765b;

                public C0457a(C5849U u10, View view) {
                    this.f28764a = u10;
                    this.f28765b = view;
                }

                public void b() {
                    this.f28764a.b(this.f28765b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0456a(C5849U u10, View view) {
                super(1);
                this.f28762c = u10;
                this.f28763d = view;
            }

            /* renamed from: a */
            public final L invoke(M m10) {
                this.f28762c.j(this.f28763d);
                return new C0457a(this.f28762c, this.f28763d);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C5849U d(View view) {
            C5849U u10;
            synchronized (C5849U.f28738z) {
                try {
                    WeakHashMap a10 = C5849U.f28738z;
                    Object obj = a10.get(view);
                    if (obj == null) {
                        obj = new C5849U((C0) null, view, (DefaultConstructorMarker) null);
                        a10.put(view, obj);
                    }
                    u10 = (C5849U) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return u10;
        }

        /* access modifiers changed from: private */
        public final C5856b e(C0 c02, int i10, String str) {
            C5856b bVar = new C5856b(i10, str);
            if (c02 != null) {
                bVar.h(c02, i10);
            }
            return bVar;
        }

        /* access modifiers changed from: private */
        public final C5847S f(C0 c02, int i10, String str) {
            d dVar;
            if (c02 == null || (dVar = c02.g(i10)) == null) {
                dVar = d.f31835e;
            }
            return a0.a(dVar, str);
        }

        public final C5849U c(C4889m mVar, int i10) {
            if (C4895p.J()) {
                C4895p.S(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) mVar.Q(AndroidCompositionLocals_androidKt.k());
            C5849U d10 = d(view);
            boolean F10 = mVar.F(d10) | mVar.F(view);
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C0456a(d10, view);
                mVar.u(D10);
            }
            P.c(d10, (C17642l) D10, mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
            return d10;
        }

        private a() {
        }
    }

    public /* synthetic */ C5849U(C0 c02, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(c02, view);
    }

    public static /* synthetic */ void l(C5849U u10, C0 c02, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        u10.k(c02, i10);
    }

    public final void b(View view) {
        int i10 = this.f28760v - 1;
        this.f28760v = i10;
        if (i10 == 0) {
            C4600b0.E0(view, (I) null);
            C4600b0.M0(view, (C4628p0.b) null);
            view.removeOnAttachStateChangeListener(this.f28761w);
        }
    }

    public final boolean c() {
        return this.f28759u;
    }

    public final C5856b d() {
        return this.f28740b;
    }

    public final C5856b e() {
        return this.f28741c;
    }

    public final C5856b f() {
        return this.f28743e;
    }

    public final C5848T g() {
        return this.f28749k;
    }

    public final C5856b h() {
        return this.f28744f;
    }

    public final C5856b i() {
        return this.f28745g;
    }

    public final void j(View view) {
        if (this.f28760v == 0) {
            C4600b0.E0(view, this.f28761w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f28761w);
            C4600b0.M0(view, this.f28761w);
        }
        this.f28760v++;
    }

    public final void k(C0 c02, int i10) {
        if (f28735A) {
            WindowInsets x10 = c02.x();
            C17542s.g(x10);
            c02 = C0.y(x10);
        }
        this.f28739a.h(c02, i10);
        this.f28741c.h(c02, i10);
        this.f28740b.h(c02, i10);
        this.f28743e.h(c02, i10);
        this.f28744f.h(c02, i10);
        this.f28745g.h(c02, i10);
        this.f28746h.h(c02, i10);
        this.f28747i.h(c02, i10);
        this.f28742d.h(c02, i10);
        if (i10 == 0) {
            this.f28752n.f(a0.f(c02.g(C0.l.a())));
            this.f28753o.f(a0.f(c02.g(C0.l.f())));
            this.f28754p.f(a0.f(c02.g(C0.l.g())));
            this.f28755q.f(a0.f(c02.g(C0.l.h())));
            this.f28756r.f(a0.f(c02.g(C0.l.j())));
            r e10 = c02.e();
            if (e10 != null) {
                this.f28748j.f(a0.f(e10.e()));
            }
        }
        C5342k.f23395e.o();
    }

    public final void m(C0 c02) {
        this.f28758t.f(a0.f(c02.f(C0.l.c())));
    }

    public final void n(C0 c02) {
        this.f28757s.f(a0.f(c02.f(C0.l.c())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.e()).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5849U(I2.C0 r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            s0.U$a r0 = f28736x
            int r1 = I2.C0.l.a()
            java.lang.String r2 = "captionBar"
            s0.b r1 = r0.e(r10, r1, r2)
            r9.f28739a = r1
            int r1 = I2.C0.l.b()
            java.lang.String r2 = "displayCutout"
            s0.b r1 = r0.e(r10, r1, r2)
            r9.f28740b = r1
            int r2 = I2.C0.l.c()
            java.lang.String r3 = "ime"
            s0.b r2 = r0.e(r10, r2, r3)
            r9.f28741c = r2
            int r3 = I2.C0.l.e()
            java.lang.String r4 = "mandatorySystemGestures"
            s0.b r3 = r0.e(r10, r3, r4)
            r9.f28742d = r3
            int r4 = I2.C0.l.f()
            java.lang.String r5 = "navigationBars"
            s0.b r4 = r0.e(r10, r4, r5)
            r9.f28743e = r4
            int r4 = I2.C0.l.g()
            java.lang.String r5 = "statusBars"
            s0.b r4 = r0.e(r10, r4, r5)
            r9.f28744f = r4
            int r4 = I2.C0.l.h()
            java.lang.String r5 = "systemBars"
            s0.b r4 = r0.e(r10, r4, r5)
            r9.f28745g = r4
            int r5 = I2.C0.l.i()
            java.lang.String r6 = "systemGestures"
            s0.b r5 = r0.e(r10, r5, r6)
            r9.f28746h = r5
            int r6 = I2.C0.l.j()
            java.lang.String r7 = "tappableElement"
            s0.b r6 = r0.e(r10, r6, r7)
            r9.f28747i = r6
            if (r10 == 0) goto L_0x007f
            I2.r r7 = r10.e()
            if (r7 == 0) goto L_0x007f
            x2.d r7 = r7.e()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            x2.d r7 = x2.d.f31835e
        L_0x0081:
            java.lang.String r8 = "waterfall"
            s0.S r7 = s0.a0.a(r7, r8)
            r9.f28748j = r7
            s0.T r2 = s0.C5850V.j(r4, r2)
            s0.T r1 = s0.C5850V.j(r2, r1)
            r9.f28749k = r1
            s0.T r2 = s0.C5850V.j(r6, r3)
            s0.T r2 = s0.C5850V.j(r2, r5)
            s0.T r2 = s0.C5850V.j(r2, r7)
            r9.f28750l = r2
            s0.T r1 = s0.C5850V.j(r1, r2)
            r9.f28751m = r1
            int r1 = I2.C0.l.a()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28752n = r1
            int r1 = I2.C0.l.f()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28753o = r1
            int r1 = I2.C0.l.g()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28754p = r1
            int r1 = I2.C0.l.h()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28755q = r1
            int r1 = I2.C0.l.j()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28756r = r1
            int r1 = I2.C0.l.c()
            java.lang.String r2 = "imeAnimationTarget"
            s0.S r1 = r0.f(r10, r1, r2)
            r9.f28757s = r1
            int r1 = I2.C0.l.c()
            java.lang.String r2 = "imeAnimationSource"
            s0.S r10 = r0.f(r10, r1, r2)
            r9.f28758t = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x0107
            android.view.View r10 = (android.view.View) r10
            goto L_0x0108
        L_0x0107:
            r10 = r0
        L_0x0108:
            if (r10 == 0) goto L_0x0111
            int r11 = i1.i.f24337I
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x0112
        L_0x0111:
            r10 = r0
        L_0x0112:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0119
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0119:
            if (r0 == 0) goto L_0x0120
            boolean r10 = r0.booleanValue()
            goto L_0x0121
        L_0x0120:
            r10 = 1
        L_0x0121:
            r9.f28759u = r10
            s0.u r10 = new s0.u
            r10.<init>(r9)
            r9.f28761w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C5849U.<init>(I2.C0, android.view.View):void");
    }
}
