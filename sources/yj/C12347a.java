package yj;

import HJ.C15854t;
import Op.h1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sy.a;
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
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import pp.C11767a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sp.C11879a;
import zj.C12520a;
import zj.C12521b;
import zj.C12522c;
import zj.C12523d;
import zj.C12524e;
import zj.C12525f;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0004038\u0016X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lyj/a;", "Landroidx/lifecycle/f0;", "Lsp/a;", "Lzj/b;", "Lzj/e;", "Landroidx/lifecycle/U;", "savedStateHandle", "LTj/n;", "getProductDetailsUseCase", "LSy/a;", "analytics", "<init>", "(Landroidx/lifecycle/U;LTj/n;LSy/a;)V", "Lpp/a;", "cacheStrategy", "LXH/N;", "D", "(Lpp/a;)V", "LTj/n$a;", "result", "J", "(LTj/n$a;)V", "LOp/h1;", "E", "()LOp/h1;", "G", "()V", "H", "I", "action", "F", "(Lzj/b;)V", "m", "LTj/n;", "n", "LSy/a;", "", "o", "Ljava/lang/String;", "navArgItemNo", "", "p", "Z", "isCombination", "q", "navArgSectionType", "LTJ/B;", "Lzj/f;", "r", "LTJ/B;", "viewModelUiState", "LTJ/P;", "s", "LTJ/P;", "getState", "()LTJ/P;", "state", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yj.a  reason: case insensitive filesystem */
public final class C12347a extends f0 implements C11879a<C12521b, C12524e> {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final n f106300m;

    /* renamed from: n  reason: collision with root package name */
    private final a f106301n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final String f106302o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final boolean f106303p;

    /* renamed from: q  reason: collision with root package name */
    private final String f106304q;

    /* renamed from: r  reason: collision with root package name */
    private final C16505B<C12525f> f106305r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<C12524e> f106306s;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"yj/a$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yj.a$a  reason: collision with other inner class name */
    public static final class C2537a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12347a f106307a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2537a(N.a aVar, C12347a aVar2) {
            super(aVar);
            this.f106307a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C12347a aVar = this.f106307a;
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
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
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f106307a.G();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ProductDetailsSectionViewModel$fetch$3", f = "ProductDetailsSectionViewModel.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: yj.a$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106308c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12347a f106309d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11767a f106310e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12347a aVar, C11767a aVar2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f106309d = aVar;
            this.f106310e = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f106309d, this.f106310e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f106308c;
            if (i10 == 0) {
                y.b(obj);
                n h10 = this.f106309d.f106300m;
                String i11 = this.f106309d.f106302o;
                boolean j10 = this.f106309d.f106303p;
                C11767a aVar = this.f106310e;
                this.f106308c = 1;
                obj2 = h10.a(i11, j10, aVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12347a aVar2 = this.f106309d;
            if (x.h(obj2)) {
                aVar2.J((n.a) obj2);
            }
            C12347a aVar3 = this.f106309d;
            if (x.e(obj2) != null) {
                aVar3.G();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yj.a$c */
    public static final class c implements C16532g<C12524e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f106311a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yj.a$c$a  reason: collision with other inner class name */
        public static final class C2538a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f106312a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ProductDetailsSectionViewModel$special$$inlined$map$1$2", f = "ProductDetailsSectionViewModel.kt", l = {50}, m = "emit")
            /* renamed from: yj.a$c$a$a  reason: collision with other inner class name */
            public static final class C2539a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f106313c;

                /* renamed from: d  reason: collision with root package name */
                int f106314d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2538a f106315e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2539a(C2538a aVar, C17164e eVar) {
                    super(eVar);
                    this.f106315e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f106313c = obj;
                    this.f106314d |= Integer.MIN_VALUE;
                    return this.f106315e.emit((Object) null, this);
                }
            }

            public C2538a(C16533h hVar) {
                this.f106312a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof yj.C12347a.c.C2538a.C2539a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    yj.a$c$a$a r0 = (yj.C12347a.c.C2538a.C2539a) r0
                    int r1 = r0.f106314d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f106314d = r1
                    goto L_0x0018
                L_0x0013:
                    yj.a$c$a$a r0 = new yj.a$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f106313c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f106314d
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
                    TJ.h r8 = r6.f106312a
                    zj.f r7 = (zj.C12525f) r7
                    boolean r2 = r7.f()
                    r4 = 0
                    if (r2 == 0) goto L_0x0045
                    zj.e$b r7 = new zj.e$b
                    r7.<init>(r4, r3, r4)
                    goto L_0x0071
                L_0x0045:
                    zj.d r2 = r7.d()
                    zj.d$b r5 = zj.C12523d.b.f107377a
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
                    if (r2 != 0) goto L_0x0057
                    zj.e$a r7 = new zj.e$a
                    r7.<init>(r4, r3, r4)
                    goto L_0x0071
                L_0x0057:
                    zj.c r2 = r7.c()
                    if (r2 == 0) goto L_0x006c
                    zj.e$c r2 = new zj.e$c
                    zj.a r4 = r7.e()
                    zj.c r7 = r7.c()
                    r2.<init>(r4, r7)
                    r7 = r2
                    goto L_0x0071
                L_0x006c:
                    zj.e$a r7 = new zj.e$a
                    r7.<init>(r4, r3, r4)
                L_0x0071:
                    r0.f106314d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: yj.C12347a.c.C2538a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f106311a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f106311a.collect(new C2538a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C12347a(U u10, n nVar, a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(nVar, "getProductDetailsUseCase");
        C17542s.j(aVar, "analytics");
        this.f106300m = nVar;
        this.f106301n = aVar;
        Object f10 = u10.f("productNo");
        if (f10 != null) {
            String str = (String) f10;
            this.f106302o = str;
            Object f11 = u10.f("isCombination");
            if (f11 != null) {
                this.f106303p = ((Boolean) f11).booleanValue();
                Object f12 = u10.f("sectionType");
                if (f12 != null) {
                    this.f106304q = (String) f12;
                    C16505B<C12525f> a10 = C16521S.a(new C12525f(false, (C12523d) null, (C12522c) null, (C12520a) null, 15, (DefaultConstructorMarker) null));
                    this.f106305r = a10;
                    this.f106306s = C16534i.c0(new c(a10), g0.a(this), ip.f.a(), new C12524e.b((C12520a) null, 1, (DefaultConstructorMarker) null));
                    F(new C12521b.a(str));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void D(C11767a aVar) {
        C12525f value;
        C16505B<C12525f> b10 = this.f106305r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12525f.b(value, true, (C12523d) null, (C12522c) null, (C12520a) null, 14, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new C2537a(N.f137593c0, this), (T) null, new b(this, aVar, (C17164e<? super b>) null), 2, (Object) null);
    }

    private final h1 E() {
        T t10;
        Iterator<T> it = h1.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((h1) t10).m(), this.f106304q)) {
                break;
            }
        }
        h1 h1Var = (h1) t10;
        if (h1Var != null) {
            return h1Var;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The SectionType argument is invalid " + this.f106304q);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C12347a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
        G();
        return null;
    }

    /* access modifiers changed from: private */
    public final void G() {
        C12525f value;
        C16505B<C12525f> b10 = this.f106305r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12525f.b(value, false, C12523d.a.f107376a, (C12522c) null, (C12520a) null, 12, (Object) null)));
    }

    private final void H() {
        C12525f value;
        C16505B<C12525f> b10 = this.f106305r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12525f.b(value, false, (C12523d) null, (C12522c) null, C12520a.b.f107366a, 7, (Object) null)));
    }

    private final void I() {
        this.f106301n.H();
    }

    /* access modifiers changed from: private */
    public final void J(n.a aVar) {
        C12525f value;
        h1 E10 = E();
        if (E10 != null) {
            C16505B<C12525f> b10 = this.f106305r;
            do {
                value = b10.getValue();
            } while (!b10.e(value, C12525f.b(value, false, C12523d.b.f107377a, new C12522c(this.f106302o, E10, aVar.b(), aVar.d(), aVar.c()), (C12520a) null, 8, (Object) null)));
        }
    }

    public void F(C12521b bVar) {
        C17542s.j(bVar, "action");
        if (bVar instanceof C12521b.a) {
            D(C11767a.LOCAL);
        } else if (C17542s.e(bVar, C12521b.C2562b.f107368a)) {
            H();
        } else if (C17542s.e(bVar, C12521b.d.f107370a)) {
            D(C11767a.NETWORK);
        } else if (bVar instanceof C12521b.c) {
            I();
        } else {
            throw new t();
        }
    }

    public C16519P<C12524e> getState() {
        return this.f106306s;
    }
}
