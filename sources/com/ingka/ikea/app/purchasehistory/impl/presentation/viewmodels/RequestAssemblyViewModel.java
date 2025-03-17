package com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels;

import Fi.c;
import HJ.C15854t;
import PD.C13337b;
import PD.C13338c;
import PD.d;
import PD.e;
import TJ.C16532g;
import YC.C13857b;
import aA.C13909a;
import androidx.lifecycle.U;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001$BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel;", "Landroidx/lifecycle/U;", "savedStateHandle", "LaA/a;", "sessionManager", "LPD/b;", "createWebViewCookieUseCase", "LPD/e;", "setWebViewCookieUseCase", "LPD/d;", "getWebViewUrlUseCase", "LPD/c;", "getWebViewCookieUseCase", "LFi/c;", "getAssemblyUrlUseCase", "LYC/b;", "uiMode", "<init>", "(Landroidx/lifecycle/U;LaA/a;LPD/b;LPD/e;LPD/d;LPD/c;LFi/c;LYC/b;)V", "", "orderId", "liteId", "LTJ/g;", "M", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "", "setAccesstoken", "I", "(ZLjava/lang/String;)Ljava/lang/String;", "F", "LaA/a;", "G", "LPD/b;", "H", "LFi/c;", "Companion", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestAssemblyViewModel extends ManageOrderWebViewModel {

    /* renamed from: I  reason: collision with root package name */
    public static final Companion f91023I = new Companion((DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    public static final int f91024J = 8;

    /* renamed from: F  reason: collision with root package name */
    private final C13909a f91025F;

    /* renamed from: G  reason: collision with root package name */
    private final C13337b f91026G;

    /* renamed from: H  reason: collision with root package name */
    private final c f91027H;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel$Companion;", "", "<init>", "()V", "CookieDataFromApp", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel$Companion$CookieDataFromApp;", "", "", "accessToken", "liteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel$Companion$CookieDataFromApp;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getAccessToken$annotations", "()V", "b", "getLiteId", "getLiteId$annotations", "Companion", "$serializer", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CookieDataFromApp {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f91029a;

            /* renamed from: b  reason: collision with root package name */
            private final String f91030b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel$Companion$CookieDataFromApp$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/RequestAssemblyViewModel$Companion$CookieDataFromApp;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<CookieDataFromApp> serializer() {
                    return RequestAssemblyViewModel$Companion$CookieDataFromApp$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ CookieDataFromApp(int i10, String str, String str2, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, RequestAssemblyViewModel$Companion$CookieDataFromApp$$serializer.INSTANCE.getDescriptor());
                }
                this.f91029a = str;
                if ((i10 & 2) == 0) {
                    this.f91030b = null;
                } else {
                    this.f91030b = str2;
                }
            }

            public static final /* synthetic */ void a(CookieDataFromApp cookieDataFromApp, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, cookieDataFromApp.f91029a);
                if (dVar.z(serialDescriptor, 1) || cookieDataFromApp.f91030b != null) {
                    dVar.B(serialDescriptor, 1, Y0.f144077a, cookieDataFromApp.f91030b);
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CookieDataFromApp)) {
                    return false;
                }
                CookieDataFromApp cookieDataFromApp = (CookieDataFromApp) obj;
                return C17542s.e(this.f91029a, cookieDataFromApp.f91029a) && C17542s.e(this.f91030b, cookieDataFromApp.f91030b);
            }

            public int hashCode() {
                int hashCode = this.f91029a.hashCode() * 31;
                String str = this.f91030b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f91029a;
                String str2 = this.f91030b;
                return "CookieDataFromApp(accessToken=" + str + ", liteId=" + str2 + ")";
            }

            public CookieDataFromApp(String str, String str2) {
                C17542s.j(str, "accessToken");
                this.f91029a = str;
                this.f91030b = str2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestAssemblyViewModel(U u10, C13909a aVar, C13337b bVar, e eVar, d dVar, C13338c cVar, c cVar2, C13857b bVar2) {
        super(u10, eVar, dVar, cVar, bVar2);
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(bVar, "createWebViewCookieUseCase");
        C17542s.j(eVar, "setWebViewCookieUseCase");
        C17542s.j(dVar, "getWebViewUrlUseCase");
        C17542s.j(cVar, "getWebViewCookieUseCase");
        C17542s.j(cVar2, "getAssemblyUrlUseCase");
        C17542s.j(bVar2, "uiMode");
        this.f91025F = aVar;
        this.f91026G = bVar;
        this.f91027H = cVar2;
    }

    public String I(boolean z10, String str) {
        Companion.CookieDataFromApp cookieDataFromApp = new Companion.CookieDataFromApp(z10 ? this.f91025F.h() : "", str);
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
                String name = RequestAssemblyViewModel.class.getName();
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
        return this.f91026G.invoke(cookieDataFromApp);
    }

    public C16532g<String> M(String str, String str2) {
        C17542s.j(str, "orderId");
        return this.f91027H.a(str);
    }
}
