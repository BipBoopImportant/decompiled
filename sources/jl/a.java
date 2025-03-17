package Jl;

import FB.C12860a;
import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import Rl.g;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.UrlConfig;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import nI.p;
import oC.C14874c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H@¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0013H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/R\u0014\u0010\u0012\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b!\u00104R\u0014\u00106\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0018R\u0014\u0010<\u001a\u0002098VX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010B\u001a\u00020?8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010 R\u0014\u0010J\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010 R\u0016\u0010L\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\bK\u00104R\u0016\u0010N\u001a\u0004\u0018\u00010\u00108VX\u0004¢\u0006\u0006\u001a\u0004\bM\u00104R\u0016\u0010R\u001a\u0004\u0018\u00010O8VX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\bS\u00104R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010 R\u0014\u0010_\u001a\u00020\\8VX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010c\u001a\u0004\u0018\u00010`8VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010 ¨\u0006f"}, d2 = {"LJl/a;", "LIl/a;", "Lsf/c;", "userDataRepository", "LJl/b;", "marketConfigRepository", "LQJ/M;", "coroutineDispatcher", "LQJ/Q;", "applicationScope", "LoC/c;", "taskSchedulerEvents", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Lsf/c;LJl/b;LQJ/M;LQJ/Q;LoC/c;LFB/a;)V", "", "marketCode", "languageCode", "", "e", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ljava/util/Locale;", "c", "()Ljava/util/Locale;", "y", "z", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "x", "()V", "h", "()Z", "a", "Lsf/c;", "b", "LJl/b;", "LQJ/M;", "d", "LQJ/Q;", "LoC/c;", "f", "LFB/a;", "LRl/e;", "g", "LRl/e;", "getInternalConfig$appconfig_implementation_release", "()LRl/e;", "setInternalConfig$appconfig_implementation_release", "(LRl/e;)V", "internalConfig", "marketConfig", "()Ljava/lang/String;", "i", "retailCode", "A", "applicationLocale", "LRl/a;", "l", "()LRl/a;", "hostedLoginPage", "k", "hostedSignupPage", "LRl/g;", "u", "()LRl/g;", "measurementSystem", "Lkp/d;", "s", "()Lkp/d;", "currencyConfig", "n", "isEnablePrf", "m", "showPricesInclVat", "j", "prfUrl", "t", "privacyPolicyUrl", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "r", "()Lcom/ingka/ikea/appconfig/model/MapServiceData;", "mapServiceData", "o", "legalInformationFooter", "", "LRl/b;", "B", "()Ljava/util/List;", "urls", "p", "extendedAnalyticsTrackingEnabled", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "v", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "q", "()Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "giftCardConfiguration", "w", "familyAndRegularPriceSameSize", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Il.a {

    /* renamed from: a  reason: collision with root package name */
    private final C10242c f82558a;

    /* renamed from: b  reason: collision with root package name */
    private final b f82559b;

    /* renamed from: c  reason: collision with root package name */
    private final M f82560c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f82561d;

    /* renamed from: e  reason: collision with root package name */
    private final C14874c f82562e;

    /* renamed from: f  reason: collision with root package name */
    private final C12860a f82563f;

    /* renamed from: g  reason: collision with root package name */
    private Rl.e f82564g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.appconfig.impl.AppConfigApiImpl$1", f = "AppConfigApiImpl.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: Jl.a$a  reason: collision with other inner class name */
    static final class C1621a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82565c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f82566d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f82567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1621a(a aVar, C17164e<? super C1621a> eVar) {
            super(2, eVar);
            this.f82567e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1621a aVar = new C1621a(this.f82567e, eVar);
            aVar.f82566d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1621a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f82565c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f82566d;
                a aVar = this.f82567e;
                String i11 = aVar.i();
                String a10 = this.f82567e.a();
                this.f82566d = q11;
                this.f82565c = 1;
                Object b10 = aVar.e(i11, a10, this);
                if (b10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj = b10;
            } else if (i10 == 1) {
                q10 = (Q) this.f82566d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue()) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Updating config failed during initialization");
                qv.e eVar = qv.e.WARN;
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
                        String a11 = C11818a.a((String) null, illegalArgumentException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
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
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Jl/a$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82568a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, a aVar2) {
            super(aVar);
            this.f82568a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            a aVar = this.f82568a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to fetch config", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.appconfig.impl.AppConfigApiImpl$refreshConfigAsync$3", f = "AppConfigApiImpl.kt", l = {127}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f82570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f82570d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f82570d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f82569c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f82570d;
                this.f82569c = 1;
                if (aVar.z(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.AppConfigApiImpl", f = "AppConfigApiImpl.kt", l = {77, 107}, m = "updateConfig")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: A  reason: collision with root package name */
        int f82571A;

        /* renamed from: B  reason: collision with root package name */
        int f82572B;

        /* renamed from: C  reason: collision with root package name */
        int f82573C;

        /* renamed from: D  reason: collision with root package name */
        /* synthetic */ Object f82574D;

        /* renamed from: E  reason: collision with root package name */
        final /* synthetic */ a f82575E;

        /* renamed from: F  reason: collision with root package name */
        int f82576F;

        /* renamed from: c  reason: collision with root package name */
        Object f82577c;

        /* renamed from: d  reason: collision with root package name */
        Object f82578d;

        /* renamed from: e  reason: collision with root package name */
        Object f82579e;

        /* renamed from: f  reason: collision with root package name */
        Object f82580f;

        /* renamed from: g  reason: collision with root package name */
        Object f82581g;

        /* renamed from: h  reason: collision with root package name */
        Object f82582h;

        /* renamed from: i  reason: collision with root package name */
        Object f82583i;

        /* renamed from: j  reason: collision with root package name */
        Object f82584j;

        /* renamed from: k  reason: collision with root package name */
        Object f82585k;

        /* renamed from: l  reason: collision with root package name */
        Object f82586l;

        /* renamed from: m  reason: collision with root package name */
        Object f82587m;

        /* renamed from: n  reason: collision with root package name */
        Object f82588n;

        /* renamed from: o  reason: collision with root package name */
        Object f82589o;

        /* renamed from: p  reason: collision with root package name */
        Object f82590p;

        /* renamed from: q  reason: collision with root package name */
        Object f82591q;

        /* renamed from: r  reason: collision with root package name */
        Object f82592r;

        /* renamed from: s  reason: collision with root package name */
        Object f82593s;

        /* renamed from: t  reason: collision with root package name */
        Object f82594t;

        /* renamed from: u  reason: collision with root package name */
        Object f82595u;

        /* renamed from: v  reason: collision with root package name */
        int f82596v;

        /* renamed from: w  reason: collision with root package name */
        int f82597w;

        /* renamed from: x  reason: collision with root package name */
        int f82598x;

        /* renamed from: y  reason: collision with root package name */
        int f82599y;

        /* renamed from: z  reason: collision with root package name */
        int f82600z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f82575E = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82574D = obj;
            this.f82576F |= Integer.MIN_VALUE;
            return this.f82575E.y((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.AppConfigApiImpl", f = "AppConfigApiImpl.kt", l = {202}, m = "updateConfigFromDatabase")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82601c;

        /* renamed from: d  reason: collision with root package name */
        Object f82602d;

        /* renamed from: e  reason: collision with root package name */
        Object f82603e;

        /* renamed from: f  reason: collision with root package name */
        Object f82604f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f82605g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f82606h;

        /* renamed from: i  reason: collision with root package name */
        int f82607i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f82606h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82605g = obj;
            this.f82607i |= Integer.MIN_VALUE;
            return this.f82606h.e((String) null, (String) null, this);
        }
    }

    public a(C10242c cVar, b bVar, M m10, Q q10, C14874c cVar2, C12860a aVar) {
        C17542s.j(cVar, "userDataRepository");
        C17542s.j(bVar, "marketConfigRepository");
        C17542s.j(m10, "coroutineDispatcher");
        C17542s.j(q10, "applicationScope");
        C17542s.j(cVar2, "taskSchedulerEvents");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f82558a = cVar;
        this.f82559b = bVar;
        this.f82560c = m10;
        this.f82561d = q10;
        this.f82562e = cVar2;
        this.f82563f = aVar;
        C16310i.e(m10, new C1621a(this, (C17164e<? super C1621a>) null));
    }

    private final Locale c() {
        String a10 = this.f82558a.a();
        String c10 = this.f82558a.c();
        return (a10 == null || C15854t.v0(a10) || c10 == null || C15854t.v0(c10)) ? Zo.b.f90092a.d() : new Locale(a10, c10);
    }

    private final Rl.e d() {
        Rl.e eVar = this.f82564g;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r6, java.lang.String r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof Jl.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Jl.a$e r0 = (Jl.a.e) r0
            int r1 = r0.f82607i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82607i = r1
            goto L_0x0018
        L_0x0013:
            Jl.a$e r0 = new Jl.a$e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f82605g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82607i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f82604f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f82603e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f82602d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f82601c
            Jl.a r6 = (Jl.a) r6
            XH.y.b(r1)
            goto L_0x0058
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            Jl.b r1 = r5.f82559b
            r0.f82601c = r5
            r0.f82602d = r6
            r0.f82603e = r7
            r0.f82604f = r8
            r0.f82607i = r4
            java.lang.Object r1 = r1.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            r6 = r5
        L_0x0058:
            Rl.e r1 = (Rl.e) r1
            r6.f82564g = r1
            if (r1 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Jl.a.e(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public Locale A() {
        return c();
    }

    public List<Rl.b> B() {
        Iterable<UrlConfig> t10 = d().t();
        ArrayList arrayList = new ArrayList(C16877v.y(t10, 10));
        for (UrlConfig urlConfig : t10) {
            arrayList.add(new Rl.b(urlConfig.c(), urlConfig.b(), urlConfig.a()));
        }
        return arrayList;
    }

    public String a() {
        String a10 = this.f82558a.a();
        return a10 == null ? "" : a10;
    }

    public boolean h() {
        return this.f82564g != null;
    }

    public String i() {
        String c10 = this.f82558a.c();
        return c10 == null ? "" : c10;
    }

    public String j() {
        Object obj;
        Iterator it = d().t().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((UrlConfig) obj).b(), "prfUrl")) {
                break;
            }
        }
        UrlConfig urlConfig = (UrlConfig) obj;
        if (urlConfig != null) {
            return urlConfig.c();
        }
        return null;
    }

    public Rl.a k() {
        return d().j();
    }

    public Rl.a l() {
        return d().i();
    }

    public boolean m() {
        return d().q().h();
    }

    public boolean n() {
        return d().q().b();
    }

    public String o() {
        String l10 = d().l();
        return l10 == null ? "" : l10;
    }

    public boolean p() {
        return d().f();
    }

    public GiftCardConfiguration q() {
        return d().h();
    }

    public MapServiceData r() {
        return d().m();
    }

    public C11522d s() {
        return d().c();
    }

    public String t() {
        Object obj;
        Iterator it = d().t().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((UrlConfig) obj).b(), "PrivacyPolicy")) {
                break;
            }
        }
        UrlConfig urlConfig = (UrlConfig) obj;
        if (urlConfig != null) {
            return urlConfig.c();
        }
        return null;
    }

    public g u() {
        return d().o();
    }

    public PostalCodePickerConfig v() {
        return d().p();
    }

    public boolean w() {
        return d().g();
    }

    public void x() {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("refreshConfigAsync", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
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
        F0 unused = C16314k.d(this.f82561d, new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object y(java.lang.String r29, java.lang.String r30, dI.C17164e<? super java.lang.Boolean> r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            boolean r4 = r3 instanceof Jl.a.d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Jl.a$d r4 = (Jl.a.d) r4
            int r5 = r4.f82576F
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f82576F = r5
            goto L_0x0020
        L_0x001b:
            Jl.a$d r4 = new Jl.a$d
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f82574D
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f82576F
            r8 = 2
            r9 = 1
            if (r7 == 0) goto L_0x009e
            if (r7 == r9) goto L_0x0085
            if (r7 != r8) goto L_0x007d
            java.lang.Object r1 = r4.f82594t
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r4.f82593s
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r4.f82592r
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f82591q
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f82590p
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r4.f82589o
            Jl.a r1 = (Jl.a) r1
            java.lang.Object r1 = r4.f82588n
            Jl.a r1 = (Jl.a) r1
            java.lang.Object r1 = r4.f82587m
            gp.b$a r1 = (gp.C11343b.a) r1
            java.lang.Object r1 = r4.f82586l
            gp.b$a r1 = (gp.C11343b.a) r1
            java.lang.Object r1 = r4.f82585k
            Il.e r1 = (Il.e) r1
            java.lang.Object r1 = r4.f82584j
            Il.b r1 = (Il.b) r1
            java.lang.Object r1 = r4.f82583i
            gp.b$a r1 = (gp.C11343b.a) r1
            java.lang.Object r1 = r4.f82582h
            XH.v r1 = (XH.v) r1
            java.lang.Object r1 = r4.f82581g
            Rl.e r1 = (Rl.e) r1
            java.lang.Object r1 = r4.f82580f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f82579e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f82578d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f82577c
            Jl.a r1 = (Jl.a) r1
            XH.y.b(r5)
            goto L_0x0272
        L_0x007d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0085:
            java.lang.Object r1 = r4.f82580f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r4.f82579e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.f82578d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r7 = r4.f82577c
            Jl.a r7 = (Jl.a) r7
            XH.y.b(r5)
            r27 = r3
            r3 = r1
            r1 = r27
            goto L_0x00b5
        L_0x009e:
            XH.y.b(r5)
            Jl.b r5 = r0.f82559b
            r4.f82577c = r0
            r4.f82578d = r1
            r4.f82579e = r2
            r4.f82580f = r3
            r4.f82576F = r9
            java.lang.Object r5 = r5.c(r1, r2, r4)
            if (r5 != r6) goto L_0x00b4
            return r6
        L_0x00b4:
            r7 = r0
        L_0x00b5:
            Rl.e r5 = (Rl.e) r5
            r15 = 0
            if (r5 != 0) goto L_0x00bf
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r15)
            return r1
        L_0x00bf:
            sf.c r10 = r7.f82558a
            r10.B(r1)
            sf.c r10 = r7.f82558a
            r10.p(r2)
            Rl.e r10 = r7.f82564g
            r14 = 0
            if (r10 == 0) goto L_0x00d3
            java.lang.String r10 = r10.n()
            goto L_0x00d4
        L_0x00d3:
            r10 = r14
        L_0x00d4:
            java.lang.String r11 = r5.n()
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r11)
            r13 = r10 ^ 1
            Rl.e r11 = r7.f82564g
            if (r11 == 0) goto L_0x00e7
            java.lang.String r11 = r11.k()
            goto L_0x00e8
        L_0x00e7:
            r11 = r14
        L_0x00e8:
            java.lang.String r12 = r5.k()
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            r12 = r11 ^ 1
            r7.f82564g = r5
            if (r10 != 0) goto L_0x0100
            gp.b$a r10 = gp.C11343b.a.REGION_CHANGED
            Il.b r11 = Il.b.REGION_CHANGED
            XH.v r10 = XH.C16796C.a(r10, r11)
        L_0x00fe:
            r11 = r10
            goto L_0x0112
        L_0x0100:
            if (r11 != 0) goto L_0x010b
            gp.b$a r10 = gp.C11343b.a.LANGUAGE_CHANGED
            Il.b r11 = Il.b.LANGUAGE_CHANGED
            XH.v r10 = XH.C16796C.a(r10, r11)
            goto L_0x00fe
        L_0x010b:
            Il.b r10 = Il.b.NO_CHANGE
            XH.v r10 = XH.C16796C.a(r14, r10)
            goto L_0x00fe
        L_0x0112:
            java.lang.Object r10 = r11.a()
            gp.b$a r10 = (gp.C11343b.a) r10
            java.lang.Object r16 = r11.b()
            r9 = r16
            Il.b r9 = (Il.b) r9
            Il.e r8 = new Il.e
            Rl.e r14 = r7.f82564g
            kotlin.jvm.internal.C17542s.g(r14)
            FB.a r15 = r7.f82563f
            EB.d r15 = FB.C12861b.a(r15)
            if (r15 == 0) goto L_0x0135
            java.lang.String r15 = r15.e()
            r0 = r10
            goto L_0x0137
        L_0x0135:
            r0 = r10
            r15 = 0
        L_0x0137:
            r10 = r8
            r17 = r6
            r6 = r11
            r11 = r9
            r18 = r12
            r12 = r1
            r19 = r13
            r13 = r2
            r31 = r8
            r8 = 0
            r8 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0272
            qv.e r10 = qv.e.DEBUG
            qv.d r11 = qv.d.f102012a
            java.util.List r11 = r11.a()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x015e:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0175
            java.lang.Object r13 = r11.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r10, r8)
            if (r14 == 0) goto L_0x015e
            r12.add(r13)
            goto L_0x015e
        L_0x0175:
            java.util.Iterator r11 = r12.iterator()
            r15 = r12
            r13 = 0
            r14 = 0
        L_0x017c:
            boolean r20 = r11.hasNext()
            if (r20 == 0) goto L_0x0223
            java.lang.Object r15 = r11.next()
            r20 = r15
            qv.b r20 = (qv.C11819b) r20
            if (r14 != 0) goto L_0x01b2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r26 = r15
            java.lang.String r15 = "AppConfigIml: Emitting "
            r8.append(r15)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r15 = 0
            java.lang.String r8 = qv.C11818a.a(r8, r15)
            if (r8 != 0) goto L_0x01ac
            r29 = r11
            r15 = r26
            goto L_0x0225
        L_0x01ac:
            java.lang.String r8 = qv.C11820c.a(r8)
            r14 = r8
            goto L_0x01b4
        L_0x01b2:
            r26 = r15
        L_0x01b4:
            if (r13 != 0) goto L_0x020c
            java.lang.Class<Jl.a> r8 = Jl.a.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r13 = 36
            r29 = r11
            r11 = 0
            r15 = 2
            java.lang.String r13 = HJ.C15854t.s1(r8, r13, r11, r15, r11)
            r21 = r8
            r8 = 46
            java.lang.String r8 = HJ.C15854t.o1(r13, r8, r11, r15, r11)
            int r13 = r8.length()
            if (r13 != 0) goto L_0x01da
            r8 = r21
            goto L_0x01e0
        L_0x01da:
            java.lang.String r13 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r8, r13)
        L_0x01e0:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "main"
            r11 = 1
            boolean r13 = HJ.C15854t.b0(r13, r15, r11)
            if (r13 == 0) goto L_0x01f4
            java.lang.String r11 = "m"
            goto L_0x01f6
        L_0x01f4:
            java.lang.String r11 = "b"
        L_0x01f6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = "|"
            r13.append(r11)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            r13 = r8
            goto L_0x020e
        L_0x020c:
            r29 = r11
        L_0x020e:
            r23 = 0
            r21 = r10
            r22 = r13
            r8 = 0
            r24 = r8
            r25 = r14
            r20.a(r21, r22, r23, r24, r25)
            r11 = r29
            r15 = r26
            r8 = 0
            goto L_0x017c
        L_0x0223:
            r29 = r11
        L_0x0225:
            oC.c r8 = r7.f82562e
            r4.f82577c = r7
            r4.f82578d = r1
            r4.f82579e = r2
            r4.f82580f = r3
            r4.f82581g = r5
            r4.f82582h = r6
            r4.f82583i = r0
            r4.f82584j = r9
            r1 = r31
            r4.f82585k = r1
            r4.f82586l = r0
            r4.f82587m = r0
            r4.f82588n = r7
            r4.f82589o = r7
            r4.f82590p = r10
            r4.f82591q = r14
            r4.f82592r = r13
            r4.f82593s = r12
            r2 = r29
            r4.f82594t = r2
            r4.f82595u = r15
            r2 = r19
            r4.f82596v = r2
            r2 = r18
            r4.f82597w = r2
            r2 = 0
            r4.f82598x = r2
            r4.f82599y = r2
            r4.f82600z = r2
            r4.f82571A = r2
            r4.f82572B = r2
            r4.f82573C = r2
            r2 = 2
            r4.f82576F = r2
            java.lang.Object r0 = r8.b(r0, r1, r4)
            r1 = r17
            if (r0 != r1) goto L_0x0272
            return r1
        L_0x0272:
            r0 = 1
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Jl.a.y(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public Object z(C17164e<? super Boolean> eVar) {
        String c10 = this.f82558a.c();
        if (c10 != null) {
            String a10 = this.f82558a.a();
            if (a10 != null) {
                return y(c10, a10, eVar);
            }
            throw new IllegalStateException("We should have language code");
        }
        throw new IllegalStateException("We should have market code");
    }
}
