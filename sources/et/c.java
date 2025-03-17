package Et;

import Ae.p;
import Ct.h;
import EB.C12832d;
import Et.a;
import FB.C12860a;
import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import YC.C13857b;
import YC.C13860e;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.instore.impl.foodmobile.model.CookieDataToApp;
import com.ingka.ikea.instore.impl.foodmobile.navigation.FoodMobileRoutes$FoodMobile;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lD.C14762d;
import nI.C17642l;
import nu.C11676a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.O;
import xt.C12341a;
import yt.f;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bu\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH@¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH@¢\u0006\u0004\b$\u0010#J-\u0010)\u001a\u00020!2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0&\u0012\u0006\u0012\u0004\u0018\u00010'0%H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010\u001f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!0%H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020!2\u0006\u00100\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0001¢\u0006\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010IR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010.\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010_\u001a\b\u0012\u0004\u0012\u00020V0Z8\u0016X\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, d2 = {"LEt/c;", "Landroidx/lifecycle/f0;", "LEt/a;", "Landroidx/lifecycle/U;", "savedStateHandle", "LDt/a;", "webViewUseCases", "Lnu/a;", "getFamilyCardNumberUseCase", "LCt/h;", "saveMobileFoodOrderUseCase", "LCt/a;", "foodMobileUrlRedirectUseCase", "LAe/e;", "analytics", "LlD/d;", "getProfileUseCase", "LQJ/M;", "ioDispatcher", "LQJ/Q;", "applicationScope", "Lxt/a;", "foodMobileAnalytics", "LGo/a;", "clientIdentityProvider", "LYC/b;", "uiMode", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Landroidx/lifecycle/U;LDt/a;Lnu/a;LCt/h;LCt/a;LAe/e;LlD/d;LQJ/M;LQJ/Q;Lxt/a;LGo/a;LYC/b;LFB/a;)V", "", "familyCardNumber", "LXH/N;", "I", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "E", "Lkotlin/Function1;", "LdI/e;", "", "function", "G", "(LnI/l;)V", "", "u", "()Z", "url", "Lyt/f$c;", "action", "z", "(Ljava/lang/String;LnI/l;)Z", "LEt/a$a;", "H", "(LEt/a$a;)V", "Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp;", "F", "()Lcom/ingka/ikea/instore/impl/foodmobile/model/CookieDataToApp;", "m", "LDt/a;", "n", "Lnu/a;", "o", "LCt/h;", "p", "LCt/a;", "q", "LAe/e;", "r", "LlD/d;", "s", "LQJ/M;", "t", "LQJ/Q;", "Lxt/a;", "v", "LGo/a;", "w", "LYC/b;", "Lcom/ingka/ikea/instore/impl/foodmobile/navigation/FoodMobileRoutes$FoodMobile;", "x", "Lcom/ingka/ikea/instore/impl/foodmobile/navigation/FoodMobileRoutes$FoodMobile;", "route", "y", "Ljava/lang/String;", "callerRoot", "LTJ/B;", "LEt/a$b;", "A", "LTJ/B;", "_state", "LTJ/P;", "B", "LTJ/P;", "getState", "()LTJ/P;", "state", "LAe/p;", "C", "LAe/p;", "root", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 implements a {

    /* renamed from: A  reason: collision with root package name */
    private final C16505B<a.b> f80794A;

    /* renamed from: B  reason: collision with root package name */
    private final C16519P<a.b> f80795B;

    /* renamed from: C  reason: collision with root package name */
    private final p f80796C = p.FOOD_MOBILE;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Dt.a f80797m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11676a f80798n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final h f80799o;

    /* renamed from: p  reason: collision with root package name */
    private final Ct.a f80800p;

    /* renamed from: q  reason: collision with root package name */
    private final Ae.e f80801q;

    /* renamed from: r  reason: collision with root package name */
    private final C14762d f80802r;

    /* renamed from: s  reason: collision with root package name */
    private final M f80803s;

    /* renamed from: t  reason: collision with root package name */
    private final Q f80804t;

    /* renamed from: u  reason: collision with root package name */
    private final C12341a f80805u;

    /* renamed from: v  reason: collision with root package name */
    private final Go.a f80806v;

    /* renamed from: w  reason: collision with root package name */
    private final C13857b f80807w;

    /* renamed from: x  reason: collision with root package name */
    private final FoodMobileRoutes$FoodMobile f80808x;

    /* renamed from: y  reason: collision with root package name */
    private final String f80809y;

    /* renamed from: z  reason: collision with root package name */
    private final String f80810z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80811a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ct.g[] r0 = Ct.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ct.g r1 = Ct.g.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ct.g r1 = Ct.g.DONE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ct.g r1 = Ct.g.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f80811a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Et.c.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl", f = "FoodMobileViewModelImpl.kt", l = {175}, m = "createCookieData")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80812c;

        /* renamed from: d  reason: collision with root package name */
        Object f80813d;

        /* renamed from: e  reason: collision with root package name */
        Object f80814e;

        /* renamed from: f  reason: collision with root package name */
        Object f80815f;

        /* renamed from: g  reason: collision with root package name */
        Object f80816g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f80817h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f80818i;

        /* renamed from: j  reason: collision with root package name */
        int f80819j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f80818i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80817h = obj;
            this.f80819j |= Integer.MIN_VALUE;
            return this.f80818i.E((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Et/c$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Et.c$c  reason: collision with other inner class name */
    public static final class C1547c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f80820a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1547c(N.a aVar, c cVar) {
            super(aVar);
            this.f80820a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f80820a;
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
                    String a10 = C11818a.a("FoodMobileViewModel exception", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl$launch$2", f = "FoodMobileViewModelImpl.kt", l = {188}, m = "invokeSuspend")
    static final class d extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f80822d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f80822d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f80822d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80821c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f80822d;
                this.f80821c = 1;
                if (lVar.invoke(this) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl$onAction$1", f = "FoodMobileViewModelImpl.kt", l = {123}, m = "invokeSuspend")
    static final class e extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80823c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f80824d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl$onAction$1$1", f = "FoodMobileViewModelImpl.kt", l = {124}, m = "invokeSuspend")
        static final class a extends l implements nI.p<String, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f80825c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f80826d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f80827e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f80827e = cVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f80827e, eVar);
                aVar.f80826d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(String str, C17164e<? super C16807N> eVar) {
                return ((a) create(str, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f80825c;
                if (i10 == 0) {
                    y.b(obj);
                    String str = (String) this.f80826d;
                    c cVar = this.f80827e;
                    this.f80826d = str;
                    this.f80825c = 1;
                    if (cVar.I(str, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    String str2 = (String) this.f80826d;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(1, eVar);
            this.f80824d = cVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new e(this.f80824d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80823c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<String> invoke = this.f80824d.f80798n.invoke();
                a aVar = new a(this.f80824d, (C17164e<? super a>) null);
                this.f80823c = 1;
                if (C16534i.j(invoke, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl$onAction$2", f = "FoodMobileViewModelImpl.kt", l = {130}, m = "invokeSuspend")
    static final class f extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80828c;

        /* renamed from: d  reason: collision with root package name */
        Object f80829d;

        /* renamed from: e  reason: collision with root package name */
        Object f80830e;

        /* renamed from: f  reason: collision with root package name */
        int f80831f;

        /* renamed from: g  reason: collision with root package name */
        int f80832g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ c f80833h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f80833h = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f80833h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object f10 = C17187b.f();
            int i10 = this.f80832g;
            if (i10 == 0) {
                y.b(obj);
                CookieDataToApp F10 = this.f80833h.F();
                c cVar2 = this.f80833h;
                h k10 = cVar2.f80799o;
                Long l10 = null;
                String b10 = F10 != null ? F10.b() : null;
                if (F10 != null) {
                    l10 = kotlin.coroutines.jvm.internal.b.f(F10.a());
                }
                this.f80828c = F10;
                this.f80829d = cVar2;
                this.f80830e = F10;
                this.f80831f = 0;
                this.f80832g = 1;
                if (k10.a(b10, l10, this) == f10) {
                    return f10;
                }
                cVar = cVar2;
            } else if (i10 == 1) {
                CookieDataToApp cookieDataToApp = (CookieDataToApp) this.f80830e;
                cVar = (c) this.f80829d;
                CookieDataToApp cookieDataToApp2 = (CookieDataToApp) this.f80828c;
                y.b(obj);
                ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar.f80797m.a().invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.foodmobile.viewmodel.FoodMobileViewModelImpl", f = "FoodMobileViewModelImpl.kt", l = {157}, m = "setCookieAndLoadContent")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80834c;

        /* renamed from: d  reason: collision with root package name */
        Object f80835d;

        /* renamed from: e  reason: collision with root package name */
        Object f80836e;

        /* renamed from: f  reason: collision with root package name */
        Object f80837f;

        /* renamed from: g  reason: collision with root package name */
        Object f80838g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f80839h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f80840i;

        /* renamed from: j  reason: collision with root package name */
        int f80841j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f80840i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80839h = obj;
            this.f80841j |= Integer.MIN_VALUE;
            return this.f80840i.I((String) null, this);
        }
    }

    public c(U u10, Dt.a aVar, C11676a aVar2, h hVar, Ct.a aVar3, Ae.e eVar, C14762d dVar, M m10, Q q10, C12341a aVar4, Go.a aVar5, C13857b bVar, C12860a aVar6) {
        a.b value;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "webViewUseCases");
        C17542s.j(aVar2, "getFamilyCardNumberUseCase");
        C17542s.j(hVar, "saveMobileFoodOrderUseCase");
        C17542s.j(aVar3, "foodMobileUrlRedirectUseCase");
        C17542s.j(eVar, "analytics");
        C17542s.j(dVar, "getProfileUseCase");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(q10, "applicationScope");
        C17542s.j(aVar4, "foodMobileAnalytics");
        C17542s.j(aVar5, "clientIdentityProvider");
        C17542s.j(bVar, "uiMode");
        C17542s.j(aVar6, "localStoreSelectionRepository");
        this.f80797m = aVar;
        this.f80798n = aVar2;
        this.f80799o = hVar;
        this.f80800p = aVar3;
        this.f80801q = eVar;
        this.f80802r = dVar;
        this.f80803s = m10;
        this.f80804t = q10;
        this.f80805u = aVar4;
        this.f80806v = aVar5;
        this.f80807w = bVar;
        FoodMobileRoutes$FoodMobile foodMobileRoutes$FoodMobile = (FoodMobileRoutes$FoodMobile) O.a(u10, P.b(FoodMobileRoutes$FoodMobile.class), X.j());
        this.f80808x = foodMobileRoutes$FoodMobile;
        this.f80809y = foodMobileRoutes$FoodMobile.b();
        this.f80810z = foodMobileRoutes$FoodMobile.a();
        C16505B<a.b> a10 = C16521S.a(new a.b(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null));
        this.f80794A = a10;
        this.f80795B = C16534i.c(a10);
        b(new a.C1545a.h(false));
        C12832d c10 = aVar6.c();
        String name = c10 != null ? c10.getName() : null;
        name = name == null ? "" : name;
        do {
            value = a10.getValue();
        } while (!a10.e(value, a.b.b(value, false, (String) null, name, 3, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E(java.lang.String r16, dI.C17164e<? super java.lang.String> r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            boolean r2 = r1 instanceof Et.c.b
            if (r2 == 0) goto L_0x0016
            r2 = r1
            Et.c$b r2 = (Et.c.b) r2
            int r3 = r2.f80819j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f80819j = r3
            goto L_0x001b
        L_0x0016:
            Et.c$b r2 = new Et.c$b
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r3 = r2.f80817h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f80819j
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x004a
            if (r5 != r7) goto L_0x0042
            java.lang.Object r1 = r2.f80816g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r2.f80815f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.f80814e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r5 = r2.f80813d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.f80812c
            Et.c r2 = (Et.c) r2
            XH.y.b(r3)
            goto L_0x0075
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            XH.y.b(r3)
            Go.a r3 = r0.f80806v
            java.lang.String r3 = r3.c()
            Go.a r5 = r0.f80806v
            java.lang.String r5 = r5.b()
            lD.d r9 = r0.f80802r
            r2.f80812c = r0
            r10 = r16
            r2.f80813d = r10
            r2.f80814e = r1
            r2.f80815f = r3
            r2.f80816g = r5
            r2.f80819j = r7
            java.lang.Object r1 = lD.C14762d.a.a(r9, r6, r2, r7, r8)
            if (r1 != r4) goto L_0x0070
            return r4
        L_0x0070:
            r2 = r0
            r4 = r3
            r3 = r1
            r1 = r5
            r5 = r10
        L_0x0075:
            kD.h r3 = (kD.h) r3
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r3.b()
            goto L_0x007f
        L_0x007e:
            r3 = r8
        L_0x007f:
            com.ingka.ikea.instore.impl.foodmobile.model.CookieDataFromApp r9 = new com.ingka.ikea.instore.impl.foodmobile.model.CookieDataFromApp
            r9.<init>(r5, r1, r4, r3)
            Dt.a r1 = r2.f80797m
            PD.b r1 = r1.b()
            java.lang.String r1 = r1.invoke(r9)
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r3.next()
            r9 = r5
            qv.b r9 = (qv.C11819b) r9
            boolean r9 = r9.b(r2, r6)
            if (r9 == 0) goto L_0x00a1
            r4.add(r5)
            goto L_0x00a1
        L_0x00b8:
            java.util.Iterator r3 = r4.iterator()
            r4 = r8
            r5 = r4
        L_0x00be:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0141
            java.lang.Object r6 = r3.next()
            r9 = r6
            qv.b r9 = (qv.C11819b) r9
            r13 = 0
            if (r4 != 0) goto L_0x00ea
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "createCookieData created "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r13)
            if (r4 != 0) goto L_0x00e6
            goto L_0x0141
        L_0x00e6:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00ea:
            if (r5 != 0) goto L_0x0138
            java.lang.Class<Et.c> r5 = Et.c.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r10 = 2
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r8, r10, r8)
            r11 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r11, r8, r10, r8)
            int r10 = r6.length()
            if (r10 != 0) goto L_0x0109
            goto L_0x010f
        L_0x0109:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x010f:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r10 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r10, r7)
            if (r6 == 0) goto L_0x0122
            java.lang.String r6 = "m"
            goto L_0x0124
        L_0x0122:
            java.lang.String r6 = "b"
        L_0x0124:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = "|"
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x0138:
            r12 = 0
            r10 = r2
            r11 = r5
            r14 = r4
            r9.a(r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x0141:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Et.c.E(java.lang.String, dI.e):java.lang.Object");
    }

    private final void G(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), new C1547c(N.f137593c0, this), (T) null, new d(lVar, (C17164e<? super d>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object I(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Et.c.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Et.c$g r0 = (Et.c.g) r0
            int r1 = r0.f80841j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80841j = r1
            goto L_0x0018
        L_0x0013:
            Et.c$g r0 = new Et.c$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f80839h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80841j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f80838g
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f80837f
            PD.e r7 = (PD.e) r7
            java.lang.Object r2 = r0.f80836e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r0.f80835d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.f80834c
            Et.c r0 = (Et.c) r0
            XH.y.b(r1)
            goto L_0x0067
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            Dt.a r1 = r5.f80797m
            PD.e r1 = r1.e()
            java.lang.String r3 = r5.f80809y
            r0.f80834c = r5
            r0.f80835d = r6
            r0.f80836e = r7
            r0.f80837f = r1
            r0.f80838g = r3
            r0.f80841j = r4
            java.lang.Object r6 = r5.E(r6, r0)
            if (r6 != r2) goto L_0x0063
            return r2
        L_0x0063:
            r0 = r5
            r7 = r1
            r1 = r6
            r6 = r3
        L_0x0067:
            java.lang.String r1 = (java.lang.String) r1
            Et.b r2 = new Et.b
            r2.<init>(r0)
            r7.a(r6, r1, r2)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Et.c.I(java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N J(c cVar, boolean z10) {
        a.b value;
        String a10 = cVar.f80797m.d().a(cVar.f80809y, "https://www.ikea.com/ikeaapp/food_mobile", C13857b.a.b(cVar.f80807w, (C13860e) null, 1, (Object) null));
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
                String a11 = C11818a.a("setCookieAndLoadContent with url: " + a10, (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str = C11820c.a(a11);
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
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
        C16505B<a.b> b10 = cVar.f80794A;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b.b(value, false, a10, (String) null, 4, (Object) null)));
        return C16807N.f139792a;
    }

    public final CookieDataToApp F() {
        return (CookieDataToApp) this.f80797m.c().a(this.f80809y, CookieDataToApp.Remote.class);
    }

    /* renamed from: H */
    public void b(a.C1545a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C1545a.C1546a) {
            a.C1545a.C1546a aVar2 = (a.C1545a.C1546a) aVar;
            this.f80805u.d(aVar2.a(), aVar2.b());
        } else if (C17542s.e(aVar, a.C1545a.b.f80783a)) {
            this.f80805u.e();
        } else if (C17542s.e(aVar, a.C1545a.c.f80784a)) {
            this.f80805u.a();
        } else if (C17542s.e(aVar, a.C1545a.d.f80785a)) {
            this.f80805u.b();
        } else if (C17542s.e(aVar, a.C1545a.e.f80786a)) {
            this.f80805u.c();
        } else {
            T t10 = null;
            if (aVar instanceof a.C1545a.f) {
                G(new e(this, (C17164e<? super e>) null));
            } else if (C17542s.e(aVar, a.C1545a.g.f80788a)) {
                F0 unused = C16314k.d(this.f80804t, this.f80803s, (T) null, new f(this, (C17164e<? super f>) null), 2, (Object) null);
            } else if (!(aVar instanceof a.C1545a.h)) {
                throw new t();
            } else if (((a.C1545a.h) aVar).a()) {
                Iterator<T> it = p.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C17542s.e(((p) next).j(), this.f80810z)) {
                        t10 = next;
                        break;
                    }
                }
                p pVar = (p) t10;
                if (pVar != null) {
                    this.f80801q.p(pVar);
                }
            } else {
                this.f80801q.p(this.f80796C);
            }
        }
    }

    public C16519P<a.b> getState() {
        return this.f80795B;
    }

    public boolean u() {
        return F() != null;
    }

    public boolean z(String str, C17642l<? super f.c, C16807N> lVar) {
        C17542s.j(lVar, "action");
        int i10 = a.f80811a[this.f80800p.a(str).ordinal()];
        if (i10 == 1) {
            lVar.invoke(f.c.a.f107289a);
            return true;
        } else if (i10 == 2) {
            lVar.invoke(f.c.b.f107290a);
            return true;
        } else if (i10 == 3) {
            return false;
        } else {
            throw new t();
        }
    }
}
