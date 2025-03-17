package yj;

import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tj.n;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import pp.C11767a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import zj.C12526g;
import zj.C12527h;
import zj.i;
import zj.j;
import zj.k;
import zj.l;
import zj.m;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001c\u00101¨\u00063"}, d2 = {"Lyj/e;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LTj/n;", "getProductDetailsUseCase", "LSy/a;", "analytics", "<init>", "(Landroidx/lifecycle/U;LTj/n;LSy/a;)V", "LXH/N;", "D", "()V", "LTj/n$a;", "result", "J", "(LTj/n$a;)V", "F", "H", "K", "Lzj/i$d;", "action", "I", "(Lzj/i$d;)V", "G", "Lzj/i;", "E", "(Lzj/i;)V", "m", "LTj/n;", "n", "LSy/a;", "", "o", "Ljava/lang/String;", "productNo", "", "p", "Z", "isCombination", "LTJ/B;", "Lzj/m;", "q", "LTJ/B;", "viewModelUiState", "LTJ/P;", "Lzj/l;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final n f106318m;

    /* renamed from: n  reason: collision with root package name */
    private final Sy.a f106319n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final String f106320o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final boolean f106321p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<m> f106322q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<l> f106323r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106324a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Op.h1[] r0 = Op.h1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Op.h1 r1 = Op.h1.DETAILS_AND_SIZING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Op.h1 r1 = Op.h1.MATERIALS_AND_CARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Op.h1 r1 = Op.h1.GOOD_TO_KNOW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Op.h1 r1 = Op.h1.SAFETY_AND_COMPLIANCE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Op.h1 r1 = Op.h1.ASSEMBLY_AND_DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Op.h1 r1 = Op.h1.REVIEWS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Op.h1 r1 = Op.h1.TECHNICAL_INFORMATION     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f106324a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yj.e.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"yj/e$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f106325a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, e eVar) {
            super(aVar);
            this.f106325a = eVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            e eVar = this.f106325a;
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = eVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f106325a.F();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ProductDetailsViewModel$fetch$3", f = "ProductDetailsViewModel.kt", l = {95}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f106327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(2, eVar2);
            this.f106327d = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f106327d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f106326c;
            if (i10 == 0) {
                y.b(obj);
                n h10 = this.f106327d.f106318m;
                String i11 = this.f106327d.f106320o;
                boolean j10 = this.f106327d.f106321p;
                this.f106326c = 1;
                obj2 = n.b(h10, i11, j10, (C11767a) null, this, 4, (Object) null);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar = this.f106327d;
            if (x.h(obj2)) {
                eVar.J((n.a) obj2);
            }
            e eVar2 = this.f106327d;
            if (x.e(obj2) != null) {
                eVar2.F();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f106328a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f106329a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ProductDetailsViewModel$special$$inlined$map$1$2", f = "ProductDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: yj.e$d$a$a  reason: collision with other inner class name */
            public static final class C2540a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f106330c;

                /* renamed from: d  reason: collision with root package name */
                int f106331d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f106332e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2540a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f106332e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f106330c = obj;
                    this.f106331d |= Integer.MIN_VALUE;
                    return this.f106332e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f106329a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof yj.e.d.a.C2540a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    yj.e$d$a$a r0 = (yj.e.d.a.C2540a) r0
                    int r1 = r0.f106331d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f106331d = r1
                    goto L_0x0018
                L_0x0013:
                    yj.e$d$a$a r0 = new yj.e$d$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f106330c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f106331d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x007a
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f106329a
                    zj.m r7 = (zj.m) r7
                    boolean r2 = r7.f()
                    r4 = 0
                    if (r2 == 0) goto L_0x0045
                    zj.l$b r7 = new zj.l$b
                    r7.<init>(r4, r3, r4)
                    goto L_0x0071
                L_0x0045:
                    zj.k r2 = r7.d()
                    zj.k$b r5 = zj.k.b.f107403a
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
                    if (r2 != 0) goto L_0x0057
                    zj.l$a r7 = new zj.l$a
                    r7.<init>(r4, r3, r4)
                    goto L_0x0071
                L_0x0057:
                    zj.j r2 = r7.c()
                    if (r2 == 0) goto L_0x006c
                    zj.l$c r2 = new zj.l$c
                    zj.h r4 = r7.e()
                    zj.j r7 = r7.c()
                    r2.<init>(r4, r7)
                    r7 = r2
                    goto L_0x0071
                L_0x006c:
                    zj.l$a r7 = new zj.l$a
                    r7.<init>(r4, r3, r4)
                L_0x0071:
                    r0.f106331d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: yj.e.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f106328a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f106328a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public e(U u10, n nVar, Sy.a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(nVar, "getProductDetailsUseCase");
        C17542s.j(aVar, "analytics");
        this.f106318m = nVar;
        this.f106319n = aVar;
        Object f10 = u10.f("productNo");
        if (f10 != null) {
            String str = (String) f10;
            this.f106320o = str;
            Object f11 = u10.f("isCombination");
            if (f11 != null) {
                this.f106321p = ((Boolean) f11).booleanValue();
                C16505B<m> a10 = C16521S.a(new m(false, (k) null, (j) null, (C12527h) null, 15, (DefaultConstructorMarker) null));
                this.f106322q = a10;
                this.f106323r = C16534i.c0(new d(a10), g0.a(this), ip.f.a(), new l.b((C12527h) null, 1, (DefaultConstructorMarker) null));
                E(new i.a(str));
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void D() {
        m value;
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, m.b(value, true, (k) null, (j) null, (C12527h) null, 14, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void F() {
        m value;
        this.f106319n.D();
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, m.b(value, false, k.a.f107402a, (j) null, (C12527h) null, 12, (Object) null)));
    }

    private final void G() {
        m value;
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, m.b(value, false, (k) null, (j) null, C12527h.b.f107390a, 7, (Object) null)));
    }

    private final void H() {
        this.f106319n.N();
        D();
    }

    private final void I(i.d dVar) {
        Interaction$Component interaction$Component;
        m value;
        switch (a.f106324a[dVar.a().ordinal()]) {
            case 1:
                interaction$Component = Interaction$Component.MEASUREMENTS;
                break;
            case 2:
                interaction$Component = Interaction$Component.MATERIALS_AND_CARE;
                break;
            case 3:
                interaction$Component = Interaction$Component.GOOD_TO_KNOW;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                interaction$Component = null;
                break;
            default:
                throw new t();
        }
        if (interaction$Component != null) {
            this.f106319n.v(interaction$Component);
        }
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, m.b(value, false, (k) null, (j) null, new C12527h.c(this.f106320o, this.f106321p, dVar.a()), 7, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void J(n.a aVar) {
        m value;
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
        } while (!b10.e(value, m.b(value, false, k.b.f107403a, new j(aVar.a(), new C12526g(false, aVar.b().h(), C15985a.h(aVar.b().d()), 1, (DefaultConstructorMarker) null), C15985a.h(aVar.e())), (C12527h) null, 8, (Object) null)));
    }

    private final void K() {
        m value;
        m mVar;
        j c10;
        this.f106319n.v(Interaction$Component.SHOW_MORE);
        C16505B<m> b10 = this.f106322q;
        do {
            value = b10.getValue();
            mVar = value;
            c10 = mVar.c();
        } while (!b10.e(value, m.b(mVar, false, (k) null, c10 != null ? j.b(c10, (String) null, C12526g.b(c10.d(), !c10.d().f(), (String) null, (C15987c) null, 6, (Object) null), (C15987c) null, 5, (Object) null) : null, (C12527h) null, 11, (Object) null)));
    }

    public final void E(i iVar) {
        C17542s.j(iVar, "action");
        if (iVar instanceof i.a) {
            D();
        } else if (C17542s.e(iVar, i.c.f107396a)) {
            H();
        } else if (C17542s.e(iVar, i.e.f107398a)) {
            K();
        } else if (iVar instanceof i.d) {
            I((i.d) iVar);
        } else if (C17542s.e(iVar, i.b.f107395a)) {
            G();
        } else {
            throw new t();
        }
    }

    public final C16519P<l> m() {
        return this.f106323r;
    }
}
