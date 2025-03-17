package Rw;

import IC.C13023e;
import IC.C13026h;
import Nn.C;
import Nn.C10803f;
import Nn.C10806i;
import Nn.K;
import Nn.x;
import RC.m;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vg.a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.k;
import nI.r;
import qx.C14956a;
import sv.C11892a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"LRw/h;", "LRw/g;", "LIl/a;", "appConfigApi", "LNn/x;", "checkoutRepository", "Lsv/a;", "mCommerceConfigRepository", "LVg/a;", "getOrderSummaryUseCase", "LUg/a;", "checkoutPriceMapper", "<init>", "(LIl/a;LNn/x;Lsv/a;LVg/a;LUg/a;)V", "LNn/i;", "", "amountLeftToPay", "LVg/a$a$a;", "f", "(LNn/i;D)LVg/a$a$a;", "", "LVg/a$a$f;", "g", "(LNn/i;)Ljava/util/List;", "", "checkoutId", "LTJ/g;", "LRC/m;", "a", "(Ljava/lang/String;)LTJ/g;", "LIl/a;", "b", "LNn/x;", "c", "LVg/a;", "d", "LUg/a;", "", "e", "LTJ/g;", "showTotalExclTax", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C13559g {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f115611a;

    /* renamed from: b  reason: collision with root package name */
    private final x f115612b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Vg.a f115613c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Ug.a f115614d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Boolean> f115615e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "showTotalExclTax", "LNn/f;", "checkout", "LNn/C;", "paymentHolder", "LRC/m;", "<anonymous>", "(ZLNn/f;LNn/C;)LRC/m;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.usecase.GetPaymentPriceUseCaseImpl$invoke$1", f = "GetPaymentPriceUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements r<Boolean, C10803f, C, C17164e<? super m>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115616c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f115617d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f115618e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f115619f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f115620g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(4, eVar);
            this.f115620g = hVar;
        }

        public final Object i(boolean z10, C10803f fVar, C c10, C17164e<? super m> eVar) {
            a aVar = new a(this.f115620g, eVar);
            aVar.f115617d = z10;
            aVar.f115618e = fVar;
            aVar.f115619f = c10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C10806i h10;
            C17187b.f();
            if (this.f115616c == 0) {
                y.b(obj);
                boolean z10 = this.f115617d;
                C10803f fVar = (C10803f) this.f115618e;
                C c10 = (C) this.f115619f;
                if (fVar == null || (h10 = fVar.h()) == null) {
                    return null;
                }
                h hVar = this.f115620g;
                Vg.a d10 = hVar.f115613c;
                Ug.a c11 = hVar.f115614d;
                List e10 = hVar.g(h10);
                a.C1128a.C1129a b10 = c10 != null ? hVar.f(h10, c10.c()) : null;
                K i10 = fVar.i();
                return d10.a(c11.b(h10, e10, b10, z10, i10 != null ? i10.c() : null), (C13023e) null, C16877v.n(), new a.b(false, z10, true, false, false, false, 16, (DefaultConstructorMarker) null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (C10803f) obj2, (C) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f115621a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f115622a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.onlinepayment.impl.presentation.usecase.GetPaymentPriceUseCaseImpl$special$$inlined$map$1$2", f = "GetPaymentPriceUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Rw.h$b$a$a  reason: collision with other inner class name */
            public static final class C2842a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f115623c;

                /* renamed from: d  reason: collision with root package name */
                int f115624d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f115625e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2842a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f115625e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f115623c = obj;
                    this.f115624d |= Integer.MIN_VALUE;
                    return this.f115625e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f115622a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Rw.h.b.a.C2842a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Rw.h$b$a$a r0 = (Rw.h.b.a.C2842a) r0
                    int r1 = r0.f115624d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f115624d = r1
                    goto L_0x0018
                L_0x0013:
                    Rw.h$b$a$a r0 = new Rw.h$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f115623c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f115624d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f115622a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.r()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f115624d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Rw.h.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f115621a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f115621a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public h(Il.a aVar, x xVar, C11892a aVar2, Vg.a aVar3, Ug.a aVar4) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar2, "mCommerceConfigRepository");
        C17542s.j(aVar3, "getOrderSummaryUseCase");
        C17542s.j(aVar4, "checkoutPriceMapper");
        this.f115611a = aVar;
        this.f115612b = xVar;
        this.f115613c = aVar3;
        this.f115614d = aVar4;
        this.f115615e = new b(C11892a.C2450a.a(aVar2, false, 1, (Object) null));
    }

    /* access modifiers changed from: private */
    public final a.C1128a.C1129a f(C10806i iVar, double d10) {
        C13023e eVar;
        if (iVar.h().isEmpty()) {
            return null;
        }
        Iterable<C10806i.a> h10 = iVar.h();
        ArrayList arrayList = new ArrayList(C16877v.y(h10, 10));
        for (C10806i.a aVar : h10) {
            String a10 = aVar.a();
            double d11 = aVar.d();
            C13023e b10 = C13026h.b(Oo.b.f84341C3, aVar.b());
            Double c10 = aVar.c();
            if (c10 != null) {
                eVar = C13026h.b(Oo.b.f84351D3, C14956a.f130484a.b(c10.doubleValue(), this.f115611a.s()));
            } else {
                eVar = null;
            }
            arrayList.add(new a.C1128a.C1129a.C1130a(a10, d11, b10, eVar, C13026h.a(Oo.b.f84591b2)));
        }
        return new a.C1128a.C1129a(d10, arrayList);
    }

    /* access modifiers changed from: private */
    public final List<a.C1128a.f> g(C10806i iVar) {
        List<k> j10 = iVar.j();
        if (j10 == null) {
            return C16877v.n();
        }
        Iterable<k> iterable = j10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (k kVar : iterable) {
            arrayList.add(new a.C1128a.f(kVar.a(), kVar.b()));
        }
        return arrayList;
    }

    public C16532g<m> a(String str) {
        C17542s.j(str, "checkoutId");
        return C16534i.m(this.f115615e, this.f115612b.q(str), this.f115612b.p(str), new a(this, (C17164e<? super a>) null));
    }
}
