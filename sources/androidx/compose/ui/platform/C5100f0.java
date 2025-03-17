package androidx.compose.ui.platform;

import A1.y;
import G1.m0;
import S1.C4819l;
import S1.C4820m;
import T1.S;
import U0.C4889m;
import U0.C4895p;
import U0.C4906v;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.C16820k;
import j1.C5473d;
import j1.C5478i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n1.C5626f;
import nI.C17631a;
import p1.H0;
import w1.C6203a;
import x1.C6241b;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"(\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e8GX\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0012\"&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8GX\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b#\u0010\u0012\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b\"\u0010\u0012\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b&\u0010\u0012\"&\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u000e8GX\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0010\u0012\u0004\b-\u0010\u0018\u001a\u0004\b,\u0010\u0012\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b)\u0010\u0012\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002020\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b0\u0010\u0012\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002050\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010\u0010\u001a\u0004\b3\u0010\u0012\"\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002080\u000e8\u0006¢\u0006\f\n\u0004\b9\u0010\u0010\u001a\u0004\b6\u0010\u0012\"(\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010\u0010\u0012\u0004\b>\u0010\u0018\u001a\u0004\b=\u0010\u0012\"\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\bB\u0010\u0012\"\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020D0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010\u0010\u001a\u0004\bE\u0010\u0012\"\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010\u0010\u001a\u0004\bG\u0010\u0012\"\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010\u0010\u001a\u0004\bJ\u0010\u0012\"\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020L0\u000e8\u0006¢\u0006\f\n\u0004\bJ\u0010\u0010\u001a\u0004\bM\u0010\u0012\"\"\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\bM\u0010\u0010\u001a\u0004\b9\u0010\u0012\" \u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b<\u0010\u0012\"\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0S8F¢\u0006\u0006\u001a\u0004\bA\u0010T¨\u0006V"}, d2 = {"LG1/m0;", "owner", "Landroidx/compose/ui/platform/p1;", "uriHandler", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(LG1/m0;Landroidx/compose/ui/platform/p1;LnI/p;LU0/m;I)V", "", "name", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "LU0/I0;", "Landroidx/compose/ui/platform/h;", "LU0/I0;", "c", "()LU0/I0;", "LocalAccessibilityManager", "Lj1/d;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Lj1/i;", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/d0;", "d", "LocalClipboardManager", "Lp1/H0;", "e", "h", "LocalGraphicsContext", "Lc2/d;", "f", "LocalDensity", "Ln1/f;", "g", "LocalFocusManager", "LS1/l$b;", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "LS1/m$b;", "i", "LocalFontFamilyResolver", "Lw1/a;", "j", "LocalHapticFeedback", "Lx1/b;", "k", "LocalInputModeManager", "Lc2/t;", "l", "LocalLayoutDirection", "LT1/S;", "m", "getLocalTextInputService", "getLocalTextInputService$annotations", "LocalTextInputService", "Landroidx/compose/ui/platform/j1;", "n", "o", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/m1;", "p", "LocalTextToolbar", "q", "LocalUriHandler", "Landroidx/compose/ui/platform/w1;", "r", "LocalViewConfiguration", "Landroidx/compose/ui/platform/C1;", "s", "LocalWindowInfo", "LA1/y;", "LocalPointerIconService", "", "LocalProvidableScrollCaptureInProgress", "LU0/v;", "()LU0/v;", "LocalScrollCaptureInProgress", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f0  reason: case insensitive filesystem */
public final class C5100f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5105h> f19451a = C4910x.f(a.f19471c);

    /* renamed from: b  reason: collision with root package name */
    private static final I0<C5473d> f19452b = C4910x.f(b.f19472c);

    /* renamed from: c  reason: collision with root package name */
    private static final I0<C5478i> f19453c = C4910x.f(c.f19473c);

    /* renamed from: d  reason: collision with root package name */
    private static final I0<C5094d0> f19454d = C4910x.f(d.f19474c);

    /* renamed from: e  reason: collision with root package name */
    private static final I0<H0> f19455e = C4910x.f(i.f19479c);

    /* renamed from: f  reason: collision with root package name */
    private static final I0<c2.d> f19456f = C4910x.f(e.f19475c);

    /* renamed from: g  reason: collision with root package name */
    private static final I0<C5626f> f19457g = C4910x.f(f.f19476c);

    /* renamed from: h  reason: collision with root package name */
    private static final I0<C4819l.b> f19458h = C4910x.f(h.f19478c);

    /* renamed from: i  reason: collision with root package name */
    private static final I0<C4820m.b> f19459i = C4910x.f(g.f19477c);

    /* renamed from: j  reason: collision with root package name */
    private static final I0<C6203a> f19460j = C4910x.f(j.f19480c);

    /* renamed from: k  reason: collision with root package name */
    private static final I0<C6241b> f19461k = C4910x.f(k.f19481c);

    /* renamed from: l  reason: collision with root package name */
    private static final I0<c2.t> f19462l = C4910x.f(l.f19482c);

    /* renamed from: m  reason: collision with root package name */
    private static final I0<S> f19463m = C4910x.f(p.f19486c);

    /* renamed from: n  reason: collision with root package name */
    private static final I0<C5113j1> f19464n = C4910x.f(o.f19485c);

    /* renamed from: o  reason: collision with root package name */
    private static final I0<m1> f19465o = C4910x.f(q.f19487c);

    /* renamed from: p  reason: collision with root package name */
    private static final I0<p1> f19466p = C4910x.f(r.f19488c);

    /* renamed from: q  reason: collision with root package name */
    private static final I0<w1> f19467q = C4910x.f(s.f19489c);

    /* renamed from: r  reason: collision with root package name */
    private static final I0<C1> f19468r = C4910x.f(t.f19490c);

    /* renamed from: s  reason: collision with root package name */
    private static final I0<y> f19469s = C4910x.f(m.f19483c);

    /* renamed from: t  reason: collision with root package name */
    private static final I0<Boolean> f19470t = C4910x.d((o1) null, n.f19484c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/h;", "b", "()Landroidx/compose/ui/platform/h;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$a */
    static final class a extends C17544u implements C17631a<C5105h> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19471c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5105h invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj1/d;", "b", "()Lj1/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$b */
    static final class b extends C17544u implements C17631a<C5473d> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19472c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final C5473d invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj1/i;", "b", "()Lj1/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$c */
    static final class c extends C17544u implements C17631a<C5478i> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f19473c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final C5478i invoke() {
            Void unused = C5100f0.t("LocalAutofillTree");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/d0;", "b", "()Landroidx/compose/ui/platform/d0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$d */
    static final class d extends C17544u implements C17631a<C5094d0> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f19474c = new d();

        d() {
            super(0);
        }

        /* renamed from: b */
        public final C5094d0 invoke() {
            Void unused = C5100f0.t("LocalClipboardManager");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/d;", "b", "()Lc2/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$e */
    static final class e extends C17544u implements C17631a<c2.d> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f19475c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final c2.d invoke() {
            Void unused = C5100f0.t("LocalDensity");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln1/f;", "b", "()Ln1/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$f */
    static final class f extends C17544u implements C17631a<C5626f> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f19476c = new f();

        f() {
            super(0);
        }

        /* renamed from: b */
        public final C5626f invoke() {
            Void unused = C5100f0.t("LocalFocusManager");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LS1/m$b;", "b", "()LS1/m$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$g */
    static final class g extends C17544u implements C17631a<C4820m.b> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f19477c = new g();

        g() {
            super(0);
        }

        /* renamed from: b */
        public final C4820m.b invoke() {
            Void unused = C5100f0.t("LocalFontFamilyResolver");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LS1/l$b;", "b", "()LS1/l$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$h */
    static final class h extends C17544u implements C17631a<C4819l.b> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f19478c = new h();

        h() {
            super(0);
        }

        /* renamed from: b */
        public final C4819l.b invoke() {
            Void unused = C5100f0.t("LocalFontLoader");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/H0;", "b", "()Lp1/H0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$i */
    static final class i extends C17544u implements C17631a<H0> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f19479c = new i();

        i() {
            super(0);
        }

        /* renamed from: b */
        public final H0 invoke() {
            Void unused = C5100f0.t("LocalGraphicsContext");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw1/a;", "b", "()Lw1/a;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$j */
    static final class j extends C17544u implements C17631a<C6203a> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f19480c = new j();

        j() {
            super(0);
        }

        /* renamed from: b */
        public final C6203a invoke() {
            Void unused = C5100f0.t("LocalHapticFeedback");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx1/b;", "b", "()Lx1/b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$k */
    static final class k extends C17544u implements C17631a<C6241b> {

        /* renamed from: c  reason: collision with root package name */
        public static final k f19481c = new k();

        k() {
            super(0);
        }

        /* renamed from: b */
        public final C6241b invoke() {
            Void unused = C5100f0.t("LocalInputManager");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc2/t;", "b", "()Lc2/t;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$l */
    static final class l extends C17544u implements C17631a<c2.t> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f19482c = new l();

        l() {
            super(0);
        }

        /* renamed from: b */
        public final c2.t invoke() {
            Void unused = C5100f0.t("LocalLayoutDirection");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LA1/y;", "b", "()LA1/y;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$m */
    static final class m extends C17544u implements C17631a<y> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f19483c = new m();

        m() {
            super(0);
        }

        /* renamed from: b */
        public final y invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f0$n */
    static final class n extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f19484c = new n();

        n() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/j1;", "b", "()Landroidx/compose/ui/platform/j1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$o */
    static final class o extends C17544u implements C17631a<C5113j1> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f19485c = new o();

        o() {
            super(0);
        }

        /* renamed from: b */
        public final C5113j1 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LT1/S;", "b", "()LT1/S;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$p */
    static final class p extends C17544u implements C17631a<S> {

        /* renamed from: c  reason: collision with root package name */
        public static final p f19486c = new p();

        p() {
            super(0);
        }

        /* renamed from: b */
        public final S invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/m1;", "b", "()Landroidx/compose/ui/platform/m1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$q */
    static final class q extends C17544u implements C17631a<m1> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f19487c = new q();

        q() {
            super(0);
        }

        /* renamed from: b */
        public final m1 invoke() {
            Void unused = C5100f0.t("LocalTextToolbar");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/p1;", "b", "()Landroidx/compose/ui/platform/p1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$r */
    static final class r extends C17544u implements C17631a<p1> {

        /* renamed from: c  reason: collision with root package name */
        public static final r f19488c = new r();

        r() {
            super(0);
        }

        /* renamed from: b */
        public final p1 invoke() {
            Void unused = C5100f0.t("LocalUriHandler");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/w1;", "b", "()Landroidx/compose/ui/platform/w1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$s */
    static final class s extends C17544u implements C17631a<w1> {

        /* renamed from: c  reason: collision with root package name */
        public static final s f19489c = new s();

        s() {
            super(0);
        }

        /* renamed from: b */
        public final w1 invoke() {
            Void unused = C5100f0.t("LocalViewConfiguration");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/C1;", "b", "()Landroidx/compose/ui/platform/C1;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.f0$t */
    static final class t extends C17544u implements C17631a<C1> {

        /* renamed from: c  reason: collision with root package name */
        public static final t f19490c = new t();

        t() {
            super(0);
        }

        /* renamed from: b */
        public final C1 invoke() {
            Void unused = C5100f0.t("LocalWindowInfo");
            throw new C16820k();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.f0$u */
    static final class u extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f19491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p1 f19492d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f19493e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f19494f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(m0 m0Var, p1 p1Var, nI.p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f19491c = m0Var;
            this.f19492d = p1Var;
            this.f19493e = pVar;
            this.f19494f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C5100f0.a(this.f19491c, this.f19492d, this.f19493e, mVar, M0.a(this.f19494f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(m0 m0Var, p1 p1Var, nI.p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        m0 m0Var2 = m0Var;
        p1 p1Var2 = p1Var;
        nI.p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(874662829);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(m0Var2) : k10.F(m0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(p1Var2) : k10.F(p1Var2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(874662829, i11, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            C4910x.b(new J0[]{f19451a.d(m0Var.getAccessibilityManager()), f19452b.d(m0Var.getAutofill()), f19453c.d(m0Var.getAutofillTree()), f19454d.d(m0Var.getClipboardManager()), f19456f.d(m0Var.getDensity()), f19457g.d(m0Var.getFocusOwner()), f19458h.e(m0Var.getFontLoader()), f19459i.e(m0Var.getFontFamilyResolver()), f19460j.d(m0Var.getHapticFeedBack()), f19461k.d(m0Var.getInputModeManager()), f19462l.d(m0Var.getLayoutDirection()), f19463m.d(m0Var.getTextInputService()), f19464n.d(m0Var.getSoftwareKeyboardController()), f19465o.d(m0Var.getTextToolbar()), f19466p.d(p1Var2), f19467q.d(m0Var.getViewConfiguration()), f19468r.d(m0Var.getWindowInfo()), f19469s.d(m0Var.getPointerIconService()), f19455e.d(m0Var.getGraphicsContext())}, pVar2, k10, ((i11 >> 3) & 112) | J0.f13770i);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new u(m0Var2, p1Var2, pVar2, i12));
        }
    }

    public static final I0<C5105h> c() {
        return f19451a;
    }

    public static final I0<C5094d0> d() {
        return f19454d;
    }

    public static final I0<c2.d> e() {
        return f19456f;
    }

    public static final I0<C5626f> f() {
        return f19457g;
    }

    public static final I0<C4820m.b> g() {
        return f19459i;
    }

    public static final I0<H0> h() {
        return f19455e;
    }

    public static final I0<C6203a> i() {
        return f19460j;
    }

    public static final I0<C6241b> j() {
        return f19461k;
    }

    public static final I0<c2.t> k() {
        return f19462l;
    }

    public static final I0<y> l() {
        return f19469s;
    }

    public static final I0<Boolean> m() {
        return f19470t;
    }

    public static final C4906v<Boolean> n() {
        return f19470t;
    }

    public static final I0<C5113j1> o() {
        return f19464n;
    }

    public static final I0<m1> p() {
        return f19465o;
    }

    public static final I0<p1> q() {
        return f19466p;
    }

    public static final I0<w1> r() {
        return f19467q;
    }

    public static final I0<C1> s() {
        return f19468r;
    }

    /* access modifiers changed from: private */
    public static final Void t(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
