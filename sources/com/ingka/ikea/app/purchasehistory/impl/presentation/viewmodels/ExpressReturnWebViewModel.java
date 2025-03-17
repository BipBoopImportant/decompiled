package com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels;

import Fi.e;
import HJ.C15854t;
import PD.C13337b;
import PD.C13338c;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import YC.C13857b;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fK.p;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001$BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel;", "Landroidx/lifecycle/U;", "savedStateHandle", "LaA/a;", "sessionManager", "LPD/b;", "createWebViewCookieUseCase", "LPD/e;", "setWebViewCookieUseCase", "LPD/d;", "getWebViewUrlUseCase", "LPD/c;", "getWebViewCookieUseCase", "LFi/e;", "getExpressReturnActionUseCase", "LYC/b;", "uiMode", "<init>", "(Landroidx/lifecycle/U;LaA/a;LPD/b;LPD/e;LPD/d;LPD/c;LFi/e;LYC/b;)V", "", "orderId", "liteId", "LTJ/g;", "M", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "", "setAccesstoken", "I", "(ZLjava/lang/String;)Ljava/lang/String;", "F", "LaA/a;", "G", "LPD/b;", "H", "LFi/e;", "Companion", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressReturnWebViewModel extends ManageOrderWebViewModel {

    /* renamed from: I  reason: collision with root package name */
    public static final Companion f90962I = new Companion((DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    public static final int f90963J = 8;

    /* renamed from: F  reason: collision with root package name */
    private final C13909a f90964F;

    /* renamed from: G  reason: collision with root package name */
    private final C13337b f90965G;

    /* renamed from: H  reason: collision with root package name */
    private final e f90966H;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel$Companion;", "", "<init>", "()V", "CookieDataFromApp", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel$Companion$CookieDataFromApp;", "", "", "accessToken", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel$Companion$CookieDataFromApp;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "Companion", "$serializer", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CookieDataFromApp {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f90968a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel$Companion$CookieDataFromApp$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ExpressReturnWebViewModel$Companion$CookieDataFromApp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<CookieDataFromApp> serializer() {
                    return ExpressReturnWebViewModel$Companion$CookieDataFromApp$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ CookieDataFromApp(int i10, String str, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, ExpressReturnWebViewModel$Companion$CookieDataFromApp$$serializer.INSTANCE.getDescriptor());
                }
                this.f90968a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CookieDataFromApp) && C17542s.e(this.f90968a, ((CookieDataFromApp) obj).f90968a);
            }

            public int hashCode() {
                return this.f90968a.hashCode();
            }

            public String toString() {
                String str = this.f90968a;
                return "CookieDataFromApp(accessToken=" + str + ")";
            }

            public CookieDataFromApp(String str) {
                C17542s.j(str, "accessToken");
                this.f90968a = str;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90969a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$a$a  reason: collision with other inner class name */
        public static final class C1988a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90970a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$loadContentUrl$$inlined$map$1$2", f = "ExpressReturnWebViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$a$a$a  reason: collision with other inner class name */
            public static final class C1989a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90971c;

                /* renamed from: d  reason: collision with root package name */
                int f90972d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1988a f90973e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1989a(C1988a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90973e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90971c = obj;
                    this.f90972d |= Integer.MIN_VALUE;
                    return this.f90973e.emit((Object) null, this);
                }
            }

            public C1988a(C16533h hVar) {
                this.f90970a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel.a.C1988a.C1989a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$a$a$a r0 = (com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel.a.C1988a.C1989a) r0
                    int r1 = r0.f90972d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90972d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$a$a$a r0 = new com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f90971c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90972d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f90970a
                    Hx.c$d$c r5 = (Hx.c.d.C2665c) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.b()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f90972d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ExpressReturnWebViewModel.a.C1988a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f90969a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90969a.collect(new C1988a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressReturnWebViewModel(U u10, C13909a aVar, C13337b bVar, PD.e eVar, PD.d dVar, C13338c cVar, e eVar2, C13857b bVar2) {
        super(u10, eVar, dVar, cVar, bVar2);
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(bVar, "createWebViewCookieUseCase");
        C17542s.j(eVar, "setWebViewCookieUseCase");
        C17542s.j(dVar, "getWebViewUrlUseCase");
        C17542s.j(cVar, "getWebViewCookieUseCase");
        C17542s.j(eVar2, "getExpressReturnActionUseCase");
        C17542s.j(bVar2, "uiMode");
        this.f90964F = aVar;
        this.f90965G = bVar;
        this.f90966H = eVar2;
    }

    public String I(boolean z10, String str) {
        Companion.CookieDataFromApp cookieDataFromApp = new Companion.CookieDataFromApp(z10 ? this.f90964F.h() : "");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Setting cookie: " + cookieDataFromApp, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = ExpressReturnWebViewModel.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, true, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return this.f90965G.invoke(cookieDataFromApp);
    }

    public C16532g<String> M(String str, String str2) {
        C17542s.j(str, "orderId");
        return new a(this.f90966H.a(g0.a(this), str, str2));
    }
}
