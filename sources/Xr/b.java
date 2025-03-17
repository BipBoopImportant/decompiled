package Xr;

import Ba.C6381e;
import HJ.C15854t;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Ur.a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nI.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sv.C11892a;
import tv.C11996a;
import tv.C11997b;
import ug.k;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001)B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0017\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010\u001eJ'\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000e2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eH\u0002¢\u0006\u0004\b%\u0010\u001eJ4\u0010)\u001a\b\u0012\u0004\u0012\u00020(0&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0&H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"LXr/b;", "LUr/a;", "LVr/a;", "paymentsClient", "Lug/k;", "labsFeatures", "Lsv/a;", "mCommerceConfigRepository", "<init>", "(LVr/a;Lug/k;Lsv/a;)V", "", "isGooglePayEnabledKillSwitch", "LUr/a$a;", "deliveryType", "", "Ltv/a;", "allowedCardAuthMethods", "Ltv/b;", "allowedCardNetworks", "LXH/N;", "i", "(ZLUr/a$a;Ljava/util/List;Ljava/util/List;)V", "Lorg/json/JSONObject;", "h", "(LUr/a$a;Ljava/util/List;Ljava/util/List;)Lorg/json/JSONObject;", "k", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "requiredTaxFields", "LUr/a$b$a$c;", "n", "(Ljava/util/List;)Ljava/util/List;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "recipientFields", "m", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "countriesOfOrigin", "LUr/a$b$a$a;", "l", "LTJ/g;", "enabledKillSwitch", "LUr/a$b;", "a", "(LTJ/g;LTJ/g;)LTJ/g;", "LVr/a;", "b", "Lug/k;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "c", "LTJ/g;", "googlePayConfig", "LTJ/B;", "d", "LTJ/B;", "isReadyToPay", "e", "Lorg/json/JSONObject;", "baseRequest", "gpay-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Ur.a {

    /* renamed from: a  reason: collision with root package name */
    private final Vr.a f89247a;

    /* renamed from: b  reason: collision with root package name */
    private final k f89248b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<MComConfig.GooglePayExpressConfig> f89249c;

    /* renamed from: d  reason: collision with root package name */
    private final C16505B<Boolean> f89250d = C16521S.a(null);

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f89251e;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"LXr/b$a;", "", "", "enabled", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "googlePayConfig", "LUr/a$a;", "deliveryType", "<init>", "(ZLcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;LUr/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "c", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "LUr/a$a;", "()LUr/a$a;", "gpay-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f89252a;

        /* renamed from: b  reason: collision with root package name */
        private final MComConfig.GooglePayExpressConfig f89253b;

        /* renamed from: c  reason: collision with root package name */
        private final a.C1858a f89254c;

        public a(boolean z10, MComConfig.GooglePayExpressConfig googlePayExpressConfig, a.C1858a aVar) {
            C17542s.j(googlePayExpressConfig, "googlePayConfig");
            this.f89252a = z10;
            this.f89253b = googlePayExpressConfig;
            this.f89254c = aVar;
        }

        public final a.C1858a a() {
            return this.f89254c;
        }

        public final boolean b() {
            return this.f89252a;
        }

        public final MComConfig.GooglePayExpressConfig c() {
            return this.f89253b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f89252a == aVar.f89252a && C17542s.e(this.f89253b, aVar.f89253b) && this.f89254c == aVar.f89254c;
        }

        public int hashCode() {
            int hashCode = ((Boolean.hashCode(this.f89252a) * 31) + this.f89253b.hashCode()) * 31;
            a.C1858a aVar = this.f89254c;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            boolean z10 = this.f89252a;
            MComConfig.GooglePayExpressConfig googlePayExpressConfig = this.f89253b;
            a.C1858a aVar = this.f89254c;
            return "GooglePaySettings(enabled=" + z10 + ", googlePayConfig=" + googlePayExpressConfig + ", deliveryType=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "it", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.gpay.impl.domain.usecase.GooglePayUseCaseImpl$googlePayConfig$2", f = "GooglePayUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Xr.b$b  reason: collision with other inner class name */
    static final class C1911b extends l implements p<MComConfig.GooglePayExpressConfig, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89255c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f89256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f89257e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1911b(b bVar, C17164e<? super C1911b> eVar) {
            super(2, eVar);
            this.f89257e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1911b bVar = new C1911b(this.f89257e, eVar);
            bVar.f89256d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(MComConfig.GooglePayExpressConfig googlePayExpressConfig, C17164e<? super C16807N> eVar) {
            return ((C1911b) create(googlePayExpressConfig, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89255c == 0) {
                y.b(obj);
                MComConfig.GooglePayExpressConfig googlePayExpressConfig = (MComConfig.GooglePayExpressConfig) this.f89256d;
                b bVar = this.f89257e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Google pay config available: " + (googlePayExpressConfig != null), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = bVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isEnabled", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "googlePayConfig", "LUr/a$a;", "delivery", "LXr/b$a;", "<anonymous>", "(ZLcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;LUr/a$a;)LXr/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.gpay.impl.domain.usecase.GooglePayUseCaseImpl$invoke$1", f = "GooglePayUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements r<Boolean, MComConfig.GooglePayExpressConfig, a.C1858a, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89258c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f89259d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f89260e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f89261f;

        c(C17164e<? super c> eVar) {
            super(4, eVar);
        }

        public final Object i(boolean z10, MComConfig.GooglePayExpressConfig googlePayExpressConfig, a.C1858a aVar, C17164e<? super a> eVar) {
            c cVar = new c(eVar);
            cVar.f89259d = z10;
            cVar.f89260e = googlePayExpressConfig;
            cVar.f89261f = aVar;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89258c == 0) {
                y.b(obj);
                boolean z10 = this.f89259d;
                MComConfig.GooglePayExpressConfig googlePayExpressConfig = (MComConfig.GooglePayExpressConfig) this.f89260e;
                a.C1858a aVar = (a.C1858a) this.f89261f;
                if (googlePayExpressConfig != null) {
                    return new a(z10, googlePayExpressConfig, aVar);
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (MComConfig.GooglePayExpressConfig) obj2, (a.C1858a) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXr/b$a;", "googlePaySettings", "LXH/N;", "<anonymous>", "(LXr/b$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.gpay.impl.domain.usecase.GooglePayUseCaseImpl$invoke$2", f = "GooglePayUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89262c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f89263d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f89264e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f89264e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f89264e, eVar);
            dVar.f89263d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, C17164e<? super C16807N> eVar) {
            return ((d) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89262c == 0) {
                y.b(obj);
                a aVar = (a) this.f89263d;
                if (aVar != null) {
                    this.f89264e.i(aVar.b(), aVar.a(), aVar.c().b(), aVar.c().c());
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isReadyToPay", "LXr/b$a;", "googlePaySettings", "LUr/a$b;", "<anonymous>", "(ZLXr/b$a;)LUr/a$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.gpay.impl.domain.usecase.GooglePayUseCaseImpl$invoke$3", f = "GooglePayUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements q<Boolean, a, C17164e<? super a.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89265c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f89266d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f89267e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f89268f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f89268f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(Boolean bool, a aVar, C17164e<? super a.b> eVar) {
            e eVar2 = new e(this.f89268f, eVar);
            eVar2.f89266d = bool;
            eVar2.f89267e = aVar;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            a.b.C1860a.C1862b bVar;
            b bVar2;
            C17187b.f();
            if (this.f89265c == 0) {
                y.b(obj);
                Boolean bool = (Boolean) this.f89266d;
                a aVar = (a) this.f89267e;
                if (aVar == null) {
                    return a.b.C1863b.f88440a;
                }
                if (bool == null) {
                    return a.b.c.f88441a;
                }
                if (!bool.booleanValue()) {
                    return a.b.C1863b.f88440a;
                }
                List<C11996a> b10 = aVar.c().b();
                List<C11997b> c10 = aVar.c().c();
                JSONObject c11 = this.f89268f.h(aVar.a(), b10, c10);
                List e10 = this.f89268f.l(aVar.c().d());
                MComConfig.GooglePayExpressConfig.FiscalCodeField e11 = aVar.c().e();
                if (e11 != null) {
                    b bVar3 = this.f89268f;
                    bVar = new a.b.C1860a.C1862b(e11.a(), e11.c(), e11.b());
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar4 : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Google Pay - Fiscal code config: " + bVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            String name = bVar3.getClass().getName();
                            C17542s.g(name);
                            bVar2 = bVar3;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            bVar2 = bVar3;
                        }
                        String str3 = str2;
                        bVar4.a(eVar, str3, false, (Throwable) null, str);
                        str2 = str3;
                        bVar3 = bVar2;
                    }
                } else {
                    bVar = null;
                }
                List f10 = bVar != null ? this.f89268f.m(aVar.c().g()) : this.f89268f.n(aVar.c().h());
                String jSONArray = new JSONArray().put(c11).toString();
                C17542s.i(jSONArray, "toString(...)");
                return new a.b.C1860a(jSONArray, new a.b.C1860a.d(aVar.c().i(), aVar.c().f()), b10, c10, bVar, f10, e10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<MComConfig.GooglePayExpressConfig> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89269a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89270a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.gpay.impl.domain.usecase.GooglePayUseCaseImpl$special$$inlined$map$1$2", f = "GooglePayUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Xr.b$f$a$a  reason: collision with other inner class name */
            public static final class C1912a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89271c;

                /* renamed from: d  reason: collision with root package name */
                int f89272d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89273e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1912a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89273e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89271c = obj;
                    this.f89272d |= Integer.MIN_VALUE;
                    return this.f89273e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89270a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Xr.b.f.a.C1912a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Xr.b$f$a$a r0 = (Xr.b.f.a.C1912a) r0
                    int r1 = r0.f89272d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89272d = r1
                    goto L_0x0018
                L_0x0013:
                    Xr.b$f$a$a r0 = new Xr.b$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89271c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89272d
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
                    TJ.h r6 = r4.f89270a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x003f
                    com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig r5 = r5.j()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f89272d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Xr.b.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f89269a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89269a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(Vr.a aVar, k kVar, C11892a aVar2) {
        C17542s.j(aVar, "paymentsClient");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(aVar2, "mCommerceConfigRepository");
        this.f89247a = aVar;
        this.f89248b = kVar;
        this.f89249c = C16534i.R(new f(aVar2.a(false)), new C1911b(this, (C17164e<? super C1911b>) null));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        this.f89251e = jSONObject;
    }

    /* access modifiers changed from: private */
    public final JSONObject h(a.C1858a aVar, List<? extends C11996a> list, List<? extends C11997b> list2) {
        boolean b10 = aVar != null ? aVar.b() : false;
        Iterable<C11996a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C11996a b11 : iterable) {
            arrayList.add(b11.b());
        }
        Iterable<C11997b> iterable2 = list2;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (C11997b b12 : iterable2) {
            arrayList2.add(b12.b());
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray(arrayList));
        jSONObject2.put("allowedCardNetworks", new JSONArray(arrayList2));
        jSONObject2.put("billingAddressRequired", true);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("format", "FULL");
        C16807N n10 = C16807N.f139792a;
        jSONObject2.put("billingAddressParameters", jSONObject3);
        if (b10) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("phoneNumberRequired", false);
            jSONObject2.put("shippingAddressParameters", jSONObject4);
            jSONObject2.put("shippingAddressRequired", true);
        }
        jSONObject.put("type", "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public final void i(boolean z10, a.C1858a aVar, List<? extends C11996a> list, List<? extends C11997b> list2) {
        String str;
        char c10;
        Class<b> cls;
        Boolean value;
        Boolean value2;
        boolean z11 = z10;
        boolean c11 = this.f89248b.c();
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = b.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Google Pay express killSwitch: " + z11 + ", labs: " + c11, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String str5 = name;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                String P02 = o12.length() == 0 ? str5 : C15854t.P0(o12, "Kt");
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + P02;
            }
            String str6 = str3;
            bVar.a(eVar, str6, false, (Throwable) null, str4);
            str3 = str6;
            str2 = str4;
        }
        if (z11 || c11) {
            JSONObject k10 = k(aVar, list, list2);
            if (k10 == null) {
                C16505B<Boolean> b10 = this.f89250d;
                do {
                    value = b10.getValue();
                    Boolean bool = value;
                } while (!b10.e(value, Boolean.FALSE));
                return;
            }
            C6381e x10 = C6381e.x(k10.toString());
            C17542s.i(x10, "fromJson(...)");
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a("Google pay, check isReadyToPay", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str8, false, (Throwable) null, str7);
            }
            this.f89247a.a(x10).c(new a(this));
            return;
        }
        qv.e eVar3 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : qv.d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str9 = null;
        String str10 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str9 == null) {
                String a12 = C11818a.a("Google Pay Express disabled", (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str9 = C11820c.a(a12);
            }
            if (str10 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
            }
            bVar3.a(eVar3, str10, false, (Throwable) null, str9);
            c10 = '$';
        }
        C16505B<Boolean> b11 = this.f89250d;
        do {
            value2 = b11.getValue();
            Boolean bool2 = value2;
        } while (!b11.e(value2, Boolean.FALSE));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(Xr.b r21, xa.C8971l r22) {
        /*
            r1 = r21
            r0 = r22
            java.lang.String r2 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r5 = "main"
            java.lang.String r6 = "Kt"
            java.lang.String r7 = "completedTask"
            kotlin.jvm.internal.C17542s.j(r0, r7)
            r11 = 0
            java.lang.Class<com.google.android.gms.common.api.b> r12 = com.google.android.gms.common.api.b.class
            java.lang.Object r0 = r0.n(r12)     // Catch:{ b -> 0x004d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ b -> 0x004d }
            if (r0 == 0) goto L_0x01be
            boolean r12 = r0.booleanValue()     // Catch:{ b -> 0x004d }
            qv.e r15 = qv.e.DEBUG     // Catch:{ b -> 0x004d }
            qv.d r13 = qv.d.f102012a     // Catch:{ b -> 0x004d }
            java.util.List r13 = r13.a()     // Catch:{ b -> 0x004d }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ b -> 0x004d }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ b -> 0x004d }
            r14.<init>()     // Catch:{ b -> 0x004d }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ b -> 0x004d }
        L_0x0035:
            boolean r16 = r13.hasNext()     // Catch:{ b -> 0x004d }
            r7 = 0
            if (r16 == 0) goto L_0x0052
            java.lang.Object r8 = r13.next()     // Catch:{ b -> 0x004d }
            r9 = r8
            qv.b r9 = (qv.C11819b) r9     // Catch:{ b -> 0x004d }
            boolean r7 = r9.b(r15, r7)     // Catch:{ b -> 0x004d }
            if (r7 == 0) goto L_0x0035
            r14.add(r8)     // Catch:{ b -> 0x004d }
            goto L_0x0035
        L_0x004d:
            r0 = move-exception
            r20 = r3
            goto L_0x00ff
        L_0x0052:
            java.util.Iterator r8 = r14.iterator()     // Catch:{ b -> 0x004d }
            r9 = r11
            r13 = r9
        L_0x0058:
            boolean r14 = r8.hasNext()     // Catch:{ b -> 0x004d }
            if (r14 == 0) goto L_0x007e
            java.lang.Object r14 = r8.next()     // Catch:{ b -> 0x004d }
            qv.b r14 = (qv.C11819b) r14     // Catch:{ b -> 0x004d }
            r7 = 0
            if (r9 != 0) goto L_0x0086
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ b -> 0x004d }
            r9.<init>()     // Catch:{ b -> 0x004d }
            java.lang.String r10 = "Google pay, isReadyToPay result: "
            r9.append(r10)     // Catch:{ b -> 0x004d }
            r9.append(r12)     // Catch:{ b -> 0x004d }
            java.lang.String r9 = r9.toString()     // Catch:{ b -> 0x004d }
            java.lang.String r9 = qv.C11818a.a(r9, r7)     // Catch:{ b -> 0x004d }
            if (r9 != 0) goto L_0x0082
        L_0x007e:
            r20 = r3
            goto L_0x00ee
        L_0x0082:
            java.lang.String r9 = qv.C11820c.a(r9)     // Catch:{ b -> 0x004d }
        L_0x0086:
            if (r13 != 0) goto L_0x00d6
            java.lang.Class r10 = r21.getClass()     // Catch:{ b -> 0x004d }
            java.lang.String r10 = r10.getName()     // Catch:{ b -> 0x004d }
            kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ b -> 0x004d }
            r20 = r3
            r7 = 2
            r13 = 36
            java.lang.String r3 = HJ.C15854t.s1(r10, r13, r11, r7, r11)     // Catch:{ b -> 0x00d4 }
            r13 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r13, r11, r7, r11)     // Catch:{ b -> 0x00d4 }
            int r7 = r3.length()     // Catch:{ b -> 0x00d4 }
            if (r7 != 0) goto L_0x00a9
            goto L_0x00ad
        L_0x00a9:
            java.lang.String r10 = HJ.C15854t.P0(r3, r6)     // Catch:{ b -> 0x00d4 }
        L_0x00ad:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ b -> 0x00d4 }
            java.lang.String r3 = r3.getName()     // Catch:{ b -> 0x00d4 }
            r7 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r7)     // Catch:{ b -> 0x00d4 }
            if (r3 == 0) goto L_0x00be
            r3 = r4
            goto L_0x00c0
        L_0x00be:
            r3 = r20
        L_0x00c0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ b -> 0x00d4 }
            r7.<init>()     // Catch:{ b -> 0x00d4 }
            r7.append(r3)     // Catch:{ b -> 0x00d4 }
            r7.append(r2)     // Catch:{ b -> 0x00d4 }
            r7.append(r10)     // Catch:{ b -> 0x00d4 }
            java.lang.String r13 = r7.toString()     // Catch:{ b -> 0x00d4 }
        L_0x00d2:
            r3 = r13
            goto L_0x00d9
        L_0x00d4:
            r0 = move-exception
            goto L_0x00ff
        L_0x00d6:
            r20 = r3
            goto L_0x00d2
        L_0x00d9:
            r13 = r14
            r14 = r15
            r7 = r15
            r15 = r3
            r10 = 0
            r16 = r10
            r17 = 0
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)     // Catch:{ b -> 0x00d4 }
            r13 = r3
            r15 = r7
            r7 = r10
            r3 = r20
            goto L_0x0058
        L_0x00ee:
            TJ.B<java.lang.Boolean> r3 = r1.f89250d     // Catch:{ b -> 0x00d4 }
        L_0x00f0:
            java.lang.Object r7 = r3.getValue()     // Catch:{ b -> 0x00d4 }
            r8 = r7
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ b -> 0x00d4 }
            boolean r7 = r3.e(r7, r0)     // Catch:{ b -> 0x00d4 }
            if (r7 == 0) goto L_0x00f0
            goto L_0x01be
        L_0x00ff:
            qv.e r3 = qv.e.WARN
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0112:
            boolean r9 = r7.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x012a
            java.lang.Object r9 = r7.next()
            r12 = r9
            qv.b r12 = (qv.C11819b) r12
            boolean r10 = r12.b(r3, r10)
            if (r10 == 0) goto L_0x0112
            r8.add(r9)
            goto L_0x0112
        L_0x012a:
            java.util.Iterator r7 = r8.iterator()
            r8 = r11
            r9 = r8
        L_0x0130:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x01ad
            java.lang.Object r12 = r7.next()
            qv.b r12 = (qv.C11819b) r12
            if (r8 != 0) goto L_0x014c
            java.lang.String r8 = "Google pay, isReadyToPay failed"
            java.lang.String r8 = qv.C11818a.a(r8, r0)
            if (r8 != 0) goto L_0x0148
            goto L_0x01ad
        L_0x0148:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x014c:
            if (r9 != 0) goto L_0x0197
            java.lang.Class r9 = r21.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r14 = 2
            r15 = 36
            java.lang.String r13 = HJ.C15854t.s1(r9, r15, r11, r14, r11)
            r10 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r10, r11, r14, r11)
            int r16 = r13.length()
            if (r16 != 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            java.lang.String r9 = HJ.C15854t.P0(r13, r6)
        L_0x0171:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r10 = 1
            boolean r13 = HJ.C15854t.b0(r13, r5, r10)
            if (r13 == 0) goto L_0x0182
            r13 = r4
            goto L_0x0184
        L_0x0182:
            r13 = r20
        L_0x0184:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x019a
        L_0x0197:
            r14 = 2
            r15 = 36
        L_0x019a:
            r13 = r3
            r10 = r14
            r14 = r9
            r18 = r15
            r19 = 0
            r15 = r19
            r16 = r0
            r17 = r8
            r12.a(r13, r14, r15, r16, r17)
            r10 = r19
            goto L_0x0130
        L_0x01ad:
            TJ.B<java.lang.Boolean> r0 = r1.f89250d
        L_0x01af:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L_0x01af
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xr.b.j(Xr.b, xa.l):void");
    }

    private final JSONObject k(a.C1858a aVar, List<? extends C11996a> list, List<? extends C11997b> list2) {
        try {
            JSONArray put = new JSONArray().put(h(aVar, list, list2));
            JSONObject jSONObject = this.f89251e;
            jSONObject.put("allowedPaymentMethods", put);
            return jSONObject;
        } catch (JSONException e10) {
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to perform isReadyToPayRequest", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final List<a.b.C1860a.C1861a> l(List<MComConfig.GooglePayExpressConfig.CountryOfOrigin> list) {
        ArrayList arrayList;
        if (list != null) {
            Iterable<MComConfig.GooglePayExpressConfig.CountryOfOrigin> iterable = list;
            arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (MComConfig.GooglePayExpressConfig.CountryOfOrigin countryOfOrigin : iterable) {
                arrayList.add(new a.b.C1860a.C1861a(countryOfOrigin.a(), countryOfOrigin.b()));
            }
        } else {
            arrayList = null;
        }
        int size = arrayList != null ? arrayList.size() : 0;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList2.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList2) {
            if (str == null) {
                String a10 = C11818a.a("Google Pay - ID/tax config: Found " + size + " countries of origin", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<Ur.a.b.C1860a.c> m(java.util.List<com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.RequiredRecipientField> r25) {
        /*
            r24 = this;
            r0 = 0
            if (r25 == 0) goto L_0x004b
            r1 = r25
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0010
            r1 = r25
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            if (r1 == 0) goto L_0x004b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r1.next()
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$RequiredRecipientField r3 = (com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.RequiredRecipientField) r3
            Ur.a$b$a$c r10 = new Ur.a$b$a$c
            java.lang.String r5 = r3.a()
            java.lang.String r6 = r3.b()
            java.lang.String r7 = r3.c()
            r8 = 0
            boolean r9 = r3.d()
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r2.add(r10)
            goto L_0x0024
        L_0x004b:
            r2 = r0
        L_0x004c:
            java.lang.String r1 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r6 = "main"
            java.lang.String r7 = "Kt"
            r9 = 36
            java.lang.Class<Xr.b> r10 = Xr.b.class
            r11 = 2
            if (r2 != 0) goto L_0x010a
            qv.e r15 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0070:
            boolean r14 = r12.hasNext()
            r5 = 0
            if (r14 == 0) goto L_0x0088
            java.lang.Object r14 = r12.next()
            r8 = r14
            qv.b r8 = (qv.C11819b) r8
            boolean r5 = r8.b(r15, r5)
            if (r5 == 0) goto L_0x0070
            r13.add(r14)
            goto L_0x0070
        L_0x0088:
            java.util.Iterator r8 = r13.iterator()
            r12 = r0
            r13 = r12
        L_0x008e:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x01fb
            java.lang.Object r14 = r8.next()
            qv.b r14 = (qv.C11819b) r14
            r5 = 0
            if (r12 != 0) goto L_0x00ab
            java.lang.String r12 = "Google Pay - ID/recipient config: No config found"
            java.lang.String r12 = qv.C11818a.a(r12, r5)
            if (r12 != 0) goto L_0x00a7
            goto L_0x01fb
        L_0x00a7:
            java.lang.String r12 = qv.C11820c.a(r12)
        L_0x00ab:
            r20 = r12
            if (r13 != 0) goto L_0x00ef
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r13 = HJ.C15854t.s1(r12, r9, r0, r11, r0)
            r9 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r9, r0, r11, r0)
            int r9 = r13.length()
            if (r9 != 0) goto L_0x00c7
            goto L_0x00cb
        L_0x00c7:
            java.lang.String r12 = HJ.C15854t.P0(r13, r7)
        L_0x00cb:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r13 = 1
            boolean r9 = HJ.C15854t.b0(r9, r6, r13)
            if (r9 == 0) goto L_0x00dc
            r9 = r4
            goto L_0x00dd
        L_0x00dc:
            r9 = r3
        L_0x00dd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r1)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
        L_0x00ef:
            r9 = r13
            r12 = r14
            r13 = r15
            r14 = r9
            r19 = r15
            r22 = 0
            r15 = r22
            r16 = r5
            r17 = r20
            r12.a(r13, r14, r15, r16, r17)
            r13 = r9
            r15 = r19
            r12 = r20
            r5 = r22
            r9 = 36
            goto L_0x008e
        L_0x010a:
            java.util.Iterator r5 = r2.iterator()
        L_0x010e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01fb
            java.lang.Object r8 = r5.next()
            Ur.a$b$a$c r8 = (Ur.a.b.C1860a.c) r8
            qv.e r9 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x012d:
            boolean r14 = r12.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x0146
            java.lang.Object r14 = r12.next()
            r0 = r14
            qv.b r0 = (qv.C11819b) r0
            boolean r0 = r0.b(r9, r15)
            if (r0 == 0) goto L_0x0144
            r13.add(r14)
        L_0x0144:
            r0 = 0
            goto L_0x012d
        L_0x0146:
            java.util.Iterator r0 = r13.iterator()
            r12 = 0
            r13 = 0
        L_0x014c:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0177
            java.lang.Object r14 = r0.next()
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            if (r12 != 0) goto L_0x0184
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = "Google Pay - ID/recipient config: "
            r12.append(r11)
            r12.append(r8)
            java.lang.String r11 = "}"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r11 = qv.C11818a.a(r11, r15)
            if (r11 != 0) goto L_0x0180
        L_0x0177:
            r20 = r3
            r0 = 0
            r21 = 46
            r22 = 36
            goto L_0x01f6
        L_0x0180:
            java.lang.String r12 = qv.C11820c.a(r11)
        L_0x0184:
            r11 = r12
            if (r13 != 0) goto L_0x01d3
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r19 = r0
            r20 = r3
            r0 = 2
            r13 = 0
            r15 = 36
            java.lang.String r3 = HJ.C15854t.s1(r12, r15, r13, r0, r13)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r13, r0, r13)
            int r18 = r3.length()
            if (r18 != 0) goto L_0x01a7
            goto L_0x01ab
        L_0x01a7:
            java.lang.String r12 = HJ.C15854t.P0(r3, r7)
        L_0x01ab:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0 = 1
            boolean r3 = HJ.C15854t.b0(r3, r6, r0)
            if (r3 == 0) goto L_0x01bc
            r3 = r4
            goto L_0x01be
        L_0x01bc:
            r3 = r20
        L_0x01be:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r3 = r0
            r0 = r13
            goto L_0x01db
        L_0x01d3:
            r19 = r0
            r20 = r3
            r0 = 0
            r15 = 46
            r3 = r13
        L_0x01db:
            r12 = r14
            r13 = r9
            r14 = r3
            r21 = r15
            r16 = 0
            r22 = 36
            r23 = 0
            r15 = r23
            r17 = r11
            r12.a(r13, r14, r15, r16, r17)
            r13 = r3
            r12 = r11
            r0 = r19
            r3 = r20
            r11 = 2
            goto L_0x014c
        L_0x01f6:
            r3 = r20
            r11 = 2
            goto L_0x010e
        L_0x01fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Xr.b.m(java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<Ur.a.b.C1860a.c> n(java.util.List<com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.RequiredTaxField> r25) {
        /*
            r24 = this;
            r0 = 0
            if (r25 == 0) goto L_0x004e
            r1 = r25
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0010
            r1 = r25
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            if (r1 == 0) goto L_0x004e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r1.next()
            com.ingka.ikea.mcomsettings.MComConfig$GooglePayExpressConfig$RequiredTaxField r3 = (com.ingka.ikea.mcomsettings.MComConfig.GooglePayExpressConfig.RequiredTaxField) r3
            Ur.a$b$a$c r10 = new Ur.a$b$a$c
            java.lang.String r5 = r3.a()
            java.lang.String r6 = r3.e()
            java.lang.String r7 = r3.b()
            boolean r8 = r3.d()
            boolean r9 = r3.c()
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r2.add(r10)
            goto L_0x0024
        L_0x004e:
            r2 = r0
        L_0x004f:
            java.lang.String r1 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r6 = "main"
            java.lang.String r7 = "Kt"
            r9 = 36
            java.lang.Class<Xr.b> r10 = Xr.b.class
            r11 = 2
            if (r2 != 0) goto L_0x010d
            qv.e r15 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0073:
            boolean r14 = r12.hasNext()
            r5 = 0
            if (r14 == 0) goto L_0x008b
            java.lang.Object r14 = r12.next()
            r8 = r14
            qv.b r8 = (qv.C11819b) r8
            boolean r5 = r8.b(r15, r5)
            if (r5 == 0) goto L_0x0073
            r13.add(r14)
            goto L_0x0073
        L_0x008b:
            java.util.Iterator r8 = r13.iterator()
            r12 = r0
            r13 = r12
        L_0x0091:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x01fe
            java.lang.Object r14 = r8.next()
            qv.b r14 = (qv.C11819b) r14
            r5 = 0
            if (r12 != 0) goto L_0x00ae
            java.lang.String r12 = "Google Pay - ID/tax config: No config found"
            java.lang.String r12 = qv.C11818a.a(r12, r5)
            if (r12 != 0) goto L_0x00aa
            goto L_0x01fe
        L_0x00aa:
            java.lang.String r12 = qv.C11820c.a(r12)
        L_0x00ae:
            r20 = r12
            if (r13 != 0) goto L_0x00f2
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r13 = HJ.C15854t.s1(r12, r9, r0, r11, r0)
            r9 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r9, r0, r11, r0)
            int r9 = r13.length()
            if (r9 != 0) goto L_0x00ca
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r12 = HJ.C15854t.P0(r13, r7)
        L_0x00ce:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r13 = 1
            boolean r9 = HJ.C15854t.b0(r9, r6, r13)
            if (r9 == 0) goto L_0x00df
            r9 = r4
            goto L_0x00e0
        L_0x00df:
            r9 = r3
        L_0x00e0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r1)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
        L_0x00f2:
            r9 = r13
            r12 = r14
            r13 = r15
            r14 = r9
            r19 = r15
            r22 = 0
            r15 = r22
            r16 = r5
            r17 = r20
            r12.a(r13, r14, r15, r16, r17)
            r13 = r9
            r15 = r19
            r12 = r20
            r5 = r22
            r9 = 36
            goto L_0x0091
        L_0x010d:
            java.util.Iterator r5 = r2.iterator()
        L_0x0111:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01fe
            java.lang.Object r8 = r5.next()
            Ur.a$b$a$c r8 = (Ur.a.b.C1860a.c) r8
            qv.e r9 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0130:
            boolean r14 = r12.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x0149
            java.lang.Object r14 = r12.next()
            r0 = r14
            qv.b r0 = (qv.C11819b) r0
            boolean r0 = r0.b(r9, r15)
            if (r0 == 0) goto L_0x0147
            r13.add(r14)
        L_0x0147:
            r0 = 0
            goto L_0x0130
        L_0x0149:
            java.util.Iterator r0 = r13.iterator()
            r12 = 0
            r13 = 0
        L_0x014f:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x017a
            java.lang.Object r14 = r0.next()
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            if (r12 != 0) goto L_0x0187
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = "Google Pay - ID/tax config: "
            r12.append(r11)
            r12.append(r8)
            java.lang.String r11 = "}"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r11 = qv.C11818a.a(r11, r15)
            if (r11 != 0) goto L_0x0183
        L_0x017a:
            r20 = r3
            r0 = 0
            r21 = 46
            r22 = 36
            goto L_0x01f9
        L_0x0183:
            java.lang.String r12 = qv.C11820c.a(r11)
        L_0x0187:
            r11 = r12
            if (r13 != 0) goto L_0x01d6
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r19 = r0
            r20 = r3
            r0 = 2
            r13 = 0
            r15 = 36
            java.lang.String r3 = HJ.C15854t.s1(r12, r15, r13, r0, r13)
            r15 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r15, r13, r0, r13)
            int r18 = r3.length()
            if (r18 != 0) goto L_0x01aa
            goto L_0x01ae
        L_0x01aa:
            java.lang.String r12 = HJ.C15854t.P0(r3, r7)
        L_0x01ae:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0 = 1
            boolean r3 = HJ.C15854t.b0(r3, r6, r0)
            if (r3 == 0) goto L_0x01bf
            r3 = r4
            goto L_0x01c1
        L_0x01bf:
            r3 = r20
        L_0x01c1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r3 = r0
            r0 = r13
            goto L_0x01de
        L_0x01d6:
            r19 = r0
            r20 = r3
            r0 = 0
            r15 = 46
            r3 = r13
        L_0x01de:
            r12 = r14
            r13 = r9
            r14 = r3
            r21 = r15
            r16 = 0
            r22 = 36
            r23 = 0
            r15 = r23
            r17 = r11
            r12.a(r13, r14, r15, r16, r17)
            r13 = r3
            r12 = r11
            r0 = r19
            r3 = r20
            r11 = 2
            goto L_0x014f
        L_0x01f9:
            r3 = r20
            r11 = 2
            goto L_0x0111
        L_0x01fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Xr.b.n(java.util.List):java.util.List");
    }

    public C16532g<a.b> a(C16532g<Boolean> gVar, C16532g<? extends a.C1858a> gVar2) {
        C17542s.j(gVar, "enabledKillSwitch");
        C17542s.j(gVar2, "deliveryType");
        return C16534i.n(this.f89250d, C16534i.R(C16534i.m(gVar, this.f89249c, gVar2, new c((C17164e<? super c>) null)), new d(this, (C17164e<? super d>) null)), new e(this, (C17164e<? super e>) null));
    }
}
