package com.ingka.ikea.benefits.impl.presentation;

import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.benefits.impl.presentation.c;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/benefits/impl/presentation/a;", "Landroidx/lifecycle/f0;", "LAm/a;", "benefitsRepository", "<init>", "(LAm/a;)V", "LAm/a$a;", "result", "Lcom/ingka/ikea/benefits/impl/presentation/c;", "i", "(LAm/a$a;)Lcom/ingka/ikea/benefits/impl/presentation/c;", "LTJ/P;", "m", "LTJ/P;", "()LTJ/P;", "uiState", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16519P<c> f93227m;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.benefits.impl.presentation.a$a  reason: collision with other inner class name */
    public static final class C2074a implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f93228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f93229b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.benefits.impl.presentation.a$a$a  reason: collision with other inner class name */
        public static final class C2075a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f93230a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f93231b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.benefits.impl.presentation.FeaturedBenefitViewModel$special$$inlined$map$1$2", f = "FeaturedBenefitViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.benefits.impl.presentation.a$a$a$a  reason: collision with other inner class name */
            public static final class C2076a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f93232c;

                /* renamed from: d  reason: collision with root package name */
                int f93233d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2075a f93234e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2076a(C2075a aVar, C17164e eVar) {
                    super(eVar);
                    this.f93234e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f93232c = obj;
                    this.f93233d |= Integer.MIN_VALUE;
                    return this.f93234e.emit((Object) null, this);
                }
            }

            public C2075a(C16533h hVar, a aVar) {
                this.f93230a = hVar;
                this.f93231b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.benefits.impl.presentation.a.C2074a.C2075a.C2076a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.benefits.impl.presentation.a$a$a$a r0 = (com.ingka.ikea.benefits.impl.presentation.a.C2074a.C2075a.C2076a) r0
                    int r1 = r0.f93233d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f93233d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.benefits.impl.presentation.a$a$a$a r0 = new com.ingka.ikea.benefits.impl.presentation.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f93232c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f93233d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f93230a
                    Am.a$a r5 = (Am.a.C1458a) r5
                    com.ingka.ikea.benefits.impl.presentation.a r2 = r4.f93231b
                    com.ingka.ikea.benefits.impl.presentation.c r5 = r2.i(r5)
                    r0.f93233d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.benefits.impl.presentation.a.C2074a.C2075a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2074a(C16532g gVar, a aVar) {
            this.f93228a = gVar;
            this.f93229b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f93228a.collect(new C2075a(hVar, this.f93229b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(Am.a aVar) {
        C17542s.j(aVar, "benefitsRepository");
        this.f93227m = C16534i.c0(new C2074a(aVar.c(), this), g0.a(this), ip.f.a(), c.b.f93239a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.benefits.impl.presentation.c i(Am.a.C1458a r2) {
        /*
            r1 = this;
            Mm.d r0 = r2.a()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r0.d()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = YH.C16877v.y0(r0)
            Mm.a r0 = (Mm.a) r0
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x002f
            boolean r0 = r2 instanceof Am.a.C1458a.b
            if (r0 == 0) goto L_0x001d
            com.ingka.ikea.benefits.impl.presentation.c$b r2 = com.ingka.ikea.benefits.impl.presentation.c.b.f93239a
            goto L_0x0034
        L_0x001d:
            boolean r0 = r2 instanceof Am.a.C1458a.C1459a
            if (r0 != 0) goto L_0x002c
            boolean r2 = r2 instanceof Am.a.C1458a.c
            if (r2 == 0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            XH.t r2 = new XH.t
            r2.<init>()
            throw r2
        L_0x002c:
            com.ingka.ikea.benefits.impl.presentation.c$a r2 = com.ingka.ikea.benefits.impl.presentation.c.a.f93238a
            goto L_0x0034
        L_0x002f:
            com.ingka.ikea.benefits.impl.presentation.c$c r2 = new com.ingka.ikea.benefits.impl.presentation.c$c
            r2.<init>(r0)
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.benefits.impl.presentation.a.i(Am.a$a):com.ingka.ikea.benefits.impl.presentation.c");
    }

    public final C16519P<c> m() {
        return this.f93227m;
    }
}
