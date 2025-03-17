package Zf;

import Ae.e;
import IC.C13023e;
import IC.C13026h;
import Kf.C9133b;
import Kf.z;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import YH.X;
import Zf.k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fn.C11275a;
import fn.C11277c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import uK.C18146a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u00100\u001a\u00020,8\u0016XD¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001e\u0010/R\u001c\u00105\u001a\u0004\u0018\u0001018\u0016X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b!\u00104R&\u0010=\u001a\b\u0012\u0004\u0012\u000207068\u0000X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010\u001d\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020(068BX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010;¨\u0006A²\u0006\f\u0010=\u001a\u0002078\nX\u0002"}, d2 = {"LZf/m;", "LKf/z;", "LKf/b;", "cartApi", "LAy/a;", "scanAndGoCartApi", "LZf/k;", "cartNavigation", "LAy/b;", "scanAndGoCartIntegration", "LAe/e;", "analytics", "LQJ/Q;", "scope", "<init>", "(LKf/b;LAy/a;LZf/k;LAy/b;LAe/e;LQJ/Q;)V", "", "online", "store", "LXH/N;", "k", "(II)V", "", "selected", "Landroidx/compose/ui/d;", "modifier", "d", "(ZLandroidx/compose/ui/d;LU0/m;I)V", "b", "()V", "a", "LKf/b;", "LAy/a;", "c", "LZf/k;", "LAy/b;", "e", "LAe/e;", "f", "LQJ/Q;", "LZf/m$a;", "g", "LZf/m$a;", "currentCombinedCartQuantity", "", "h", "Ljava/lang/String;", "()Ljava/lang/String;", "route", "", "i", "Ljava/lang/Object;", "()Ljava/lang/Object;", "typeSafeRoute", "LTJ/g;", "Lfn/a;", "j", "LTJ/g;", "getBadge$cart_implementation_release", "()LTJ/g;", "getBadge$cart_implementation_release$annotations", "badge", "()Z", "isDualBagEnabled", "combinedCartSize", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements z {

    /* renamed from: a  reason: collision with root package name */
    private final C9133b f65217a;

    /* renamed from: b  reason: collision with root package name */
    private final Ay.a f65218b;

    /* renamed from: c  reason: collision with root package name */
    private final k f65219c;

    /* renamed from: d  reason: collision with root package name */
    private final Ay.b f65220d;

    /* renamed from: e  reason: collision with root package name */
    private final e f65221e;

    /* renamed from: f  reason: collision with root package name */
    private final Q f65222f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f65223g = a.c(a.f65227e.a(), 0, 0, j(), 3, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final String f65224h = "cart";

    /* renamed from: i  reason: collision with root package name */
    private final Object f65225i;

    /* renamed from: j  reason: collision with root package name */
    private final C16532g<C11275a> f65226j = new c(i());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001d"}, d2 = {"LZf/m$a;", "", "", "online", "store", "", "combinedCartEnabled", "<init>", "(IIZ)V", "b", "(IIZ)LZf/m$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "f", "c", "Z", "d", "()Z", "g", "total", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final C1142a f65227e = new C1142a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final a f65228f = new a(0, 0, false);

        /* renamed from: a  reason: collision with root package name */
        private final int f65229a;

        /* renamed from: b  reason: collision with root package name */
        private final int f65230b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f65231c;

        /* renamed from: d  reason: collision with root package name */
        private final int f65232d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LZf/m$a$a;", "", "<init>", "()V", "LZf/m$a;", "INITIAL", "LZf/m$a;", "a", "()LZf/m$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zf.m$a$a  reason: collision with other inner class name */
        public static final class C1142a {
            public /* synthetic */ C1142a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a() {
                return a.f65228f;
            }

            private C1142a() {
            }
        }

        public a(int i10, int i11, boolean z10) {
            this.f65229a = i10;
            this.f65230b = i11;
            this.f65231c = z10;
            this.f65232d = z10 ? i10 + i11 : i10;
        }

        public static /* synthetic */ a c(a aVar, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f65229a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f65230b;
            }
            if ((i12 & 4) != 0) {
                z10 = aVar.f65231c;
            }
            return aVar.b(i10, i11, z10);
        }

        public final a b(int i10, int i11, boolean z10) {
            return new a(i10, i11, z10);
        }

        public final boolean d() {
            return this.f65231c;
        }

        public final int e() {
            return this.f65229a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65229a == aVar.f65229a && this.f65230b == aVar.f65230b && this.f65231c == aVar.f65231c;
        }

        public final int f() {
            return this.f65230b;
        }

        public final int g() {
            return this.f65232d;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65229a) * 31) + Integer.hashCode(this.f65230b)) * 31) + Boolean.hashCode(this.f65231c);
        }

        public String toString() {
            int i10 = this.f65229a;
            int i11 = this.f65230b;
            boolean z10 = this.f65231c;
            return "CombinedCartQuantity(online=" + i10 + ", store=" + i11 + ", combinedCartEnabled=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "online", "store", "LZf/m$a;", "<anonymous>", "(II)LZf/m$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.navigation.CartNavigationTabImpl$combinedCartSize$1", f = "CartNavigationTabImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<Integer, Integer, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65233c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ int f65234d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ int f65235e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f65236f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f65236f = mVar;
        }

        public final Object i(int i10, int i11, C17164e<? super a> eVar) {
            b bVar = new b(this.f65236f, eVar);
            bVar.f65234d = i10;
            bVar.f65235e = i11;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f65233c == 0) {
                y.b(obj);
                int i10 = this.f65234d;
                int i11 = this.f65235e;
                this.f65236f.k(i10, i11);
                a aVar = new a(i10, i11, this.f65236f.j());
                this.f65236f.f65223g = aVar;
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<C11275a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f65237a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f65238a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.impl.navigation.CartNavigationTabImpl$special$$inlined$map$1$2", f = "CartNavigationTabImpl.kt", l = {50}, m = "emit")
            /* renamed from: Zf.m$c$a$a  reason: collision with other inner class name */
            public static final class C1143a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f65239c;

                /* renamed from: d  reason: collision with root package name */
                int f65240d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f65241e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1143a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f65241e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f65239c = obj;
                    this.f65240d |= Integer.MIN_VALUE;
                    return this.f65241e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f65238a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Zf.m.c.a.C1143a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Zf.m$c$a$a r0 = (Zf.m.c.a.C1143a) r0
                    int r1 = r0.f65240d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f65240d = r1
                    goto L_0x0018
                L_0x0013:
                    Zf.m$c$a$a r0 = new Zf.m$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f65239c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f65240d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x005d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f65238a
                    Zf.m$a r5 = (Zf.m.a) r5
                    int r2 = r5.g()
                    if (r2 <= 0) goto L_0x0052
                    boolean r2 = r5.d()
                    if (r2 == 0) goto L_0x0047
                    fn.a$a r5 = fn.C11275a.C2174a.f97452a
                    goto L_0x0054
                L_0x0047:
                    fn.a$c r2 = new fn.a$c
                    int r5 = r5.g()
                    r2.<init>(r5)
                    r5 = r2
                    goto L_0x0054
                L_0x0052:
                    fn.a$b r5 = fn.C11275a.b.f97453a
                L_0x0054:
                    r0.f65240d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Zf.m.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f65237a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f65237a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public m(C9133b bVar, Ay.a aVar, k kVar, Ay.b bVar2, e eVar, Q q10) {
        C17542s.j(bVar, "cartApi");
        C17542s.j(aVar, "scanAndGoCartApi");
        C17542s.j(kVar, "cartNavigation");
        C17542s.j(bVar2, "scanAndGoCartIntegration");
        C17542s.j(eVar, "analytics");
        C17542s.j(q10, "scope");
        this.f65217a = bVar;
        this.f65218b = aVar;
        this.f65219c = kVar;
        this.f65220d = bVar2;
        this.f65221e = eVar;
        this.f65222f = q10;
    }

    private static final C11275a e(A1<? extends C11275a> a12) {
        return (C11275a) a12.getValue();
    }

    private final C16532g<a> i() {
        return C16534i.s(C16534i.I(this.f65217a.a(), this.f65218b.a(), new b(this, (C17164e<? super b>) null)));
    }

    /* access modifiers changed from: private */
    public final boolean j() {
        return this.f65220d.a();
    }

    /* access modifiers changed from: private */
    public final void k(int i10, int i11) {
        boolean z10 = false;
        boolean z11 = this.f65223g.e() != i10;
        if (this.f65223g.f() != i11) {
            z10 = true;
        }
        if (z11 || z10) {
            this.f65219c.d((i10 <= 0 || !z11) ? (i11 <= 0 || (!z10 && i10 != 0)) ? k.a.ONLINE_CART : k.a.STORE_CART : k.a.ONLINE_CART);
        }
    }

    public String a() {
        return this.f65224h;
    }

    public void b() {
        e.c.b(this.f65221e, Interaction$Component.TAB_BAR, (String) null, X.f(C16796C.a("component_value", "cart")), (e.b) null, 10, (Object) null);
    }

    public Object c() {
        return this.f65225i;
    }

    public void d(boolean z10, androidx.compose.ui.d dVar, C4889m mVar, int i10) {
        C17542s.j(dVar, "modifier");
        mVar.W(478198532);
        if (C4895p.J()) {
            C4895p.S(478198532, i10, -1, "com.ingka.ikea.app.cart.impl.navigation.CartNavigationTabImpl.Icon (CartNavigationTabImpl.kt:76)");
        }
        androidx.compose.ui.d dVar2 = dVar;
        C4889m mVar2 = mVar;
        C11277c.b(C18146a.f148225Ra, C13026h.a(Oo.b.f84568Z0), dVar2, e(j3.a.b(this.f65226j, C11275a.b.f97453a, (C5221y) null, (r.b) null, (C17168i) null, mVar, C11275a.b.f97454b << 3, 14)), mVar2, (C13023e.f110931a << 3) | ((i10 << 3) & 896), 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
