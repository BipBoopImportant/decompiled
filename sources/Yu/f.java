package Yu;

import HJ.C15838d;
import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import am.C11070a;
import android.content.Context;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fK.q;
import jI.C17416c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bA\b\u0001\u0018\u0000 \\2\u00020\u0001:\u0001,BG\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014H@¢\u0006\u0004\b\u001f\u0010 J*\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0014H@¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0012H@¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0012H\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u001cH@¢\u0006\u0004\b)\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120@8\u0016X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00140@8\u0016X\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140@8\u0016X\u0004¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0016X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0016X\u0004¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010PR\"\u0010[\u001a\u00020\u00148\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR \u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0016X\u0004¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\b\\\u0010PR \u0010`\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0016X\u0004¢\u0006\f\n\u0004\b^\u0010N\u001a\u0004\b_\u0010PR \u0010c\u001a\b\u0012\u0004\u0012\u00020\u00140L8\u0016X\u0004¢\u0006\f\n\u0004\ba\u0010N\u001a\u0004\bb\u0010PR\u0014\u0010f\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bg\u0010XR\u0014\u0010i\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010XR\u0014\u0010j\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010XR\u0014\u0010k\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010XR\u0014\u0010m\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010XR\u0014\u0010o\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bn\u0010XR\u0014\u0010q\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bp\u0010XR\u0014\u0010r\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010XR\u0014\u0010t\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bs\u0010XR\u0014\u0010v\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010XR\u0014\u0010x\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bw\u0010XR\u0014\u0010y\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010XR\u0014\u0010z\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010XR\u0014\u0010|\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b{\u0010XR\u0014\u0010}\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010XR\u0014\u0010~\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010XR\u0014\u0010\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010XR\u0016\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010XR\u0016\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bA\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010XR\u001b\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140L8VX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010PR\u0016\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010XR\u0015\u0010\u0001\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010X¨\u0006\u0001"}, d2 = {"LYu/f;", "Ltf/a;", "Landroid/content/Context;", "context", "LYu/b;", "killSwitchRemoteDataSource", "LIl/a;", "appConfigApi", "LQJ/M;", "dispatcher", "LQJ/Q;", "scope", "LkK/c;", "json", "Lam/a;", "appApi", "<init>", "(Landroid/content/Context;LYu/b;LIl/a;LQJ/M;LQJ/Q;LkK/c;Lam/a;)V", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "storedKillSwitch", "", "S", "(Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;)Z", "", "retailCode", "languageCode", "V", "(Ljava/lang/String;Ljava/lang/String;)Z", "LXH/N;", "t", "()V", "f", "(LdI/e;)Ljava/lang/Object;", "isBlockMessageAllowed", "B", "(Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "newKillSwitchConfig", "F", "(Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;LdI/e;)Ljava/lang/Object;", "data", "X", "W", "a", "Landroid/content/Context;", "b", "LYu/b;", "c", "LIl/a;", "d", "LQJ/M;", "e", "LQJ/Q;", "LkK/c;", "Ljava/io/File;", "g", "Ljava/io/File;", "store", "h", "Ljava/lang/String;", "appVersion", "LTJ/B;", "i", "LTJ/B;", "_killSwitchConfigFlow", "LTJ/P;", "j", "LTJ/P;", "I", "()LTJ/P;", "killSwitchConfigFlow", "k", "L", "isOnlineCheckoutEnabled", "l", "x", "isScanAndGoEnabledFlow", "LTJ/g;", "m", "LTJ/g;", "y", "()LTJ/g;", "isFamilyRewardsEnabledFlow", "n", "p", "isGeomagicalEnabledFlow", "o", "Z", "H", "()Z", "Y", "(Z)V", "isBlockMessageAllowOnThisUpdate", "s", "isWayfindingEnabledFlow", "q", "getEnableShoppingListRedesign", "enableShoppingListRedesign", "r", "z", "enablePrepaidCardsFlow", "R", "()LQJ/Q;", "coroutineScope", "J", "isDynamicLinkShareDisabled", "isScanAndGoSupported", "showAddToCartUnrestricted", "isAppRatingEnabled", "E", "isFamilyRewardsCartEnabled", "w", "isOnlineAvailabilityEnabled", "K", "isOnlineClickCollectAvailabilityEnabled", "isShopAndGoTermsAndConditionsEnabled", "v", "isAvailabilityCartEnabled", "A", "isAssemblyServicesAvailabilityEnabled", "D", "isAssemblyServicesOrderEnabled", "isFinancialServicesEnabled", "isPurchaseHistoryListingEnabled", "u", "isPurchaseHistoryLookupEnabled", "isBackInStockNotificationsEnabledCashAndCarry", "isBackInStockNotificationsEnabledHomeDelivery", "isRegisterPushTokensEnabled", "isUpsertAddressInCheckoutEnabled", "G", "isInboxBackgroundFetchEnabled", "M", "isExpressAndOnlineReturnsEnabled", "isInAppUpdatesEnabled", "enableNavigeraAlertMessages", "enableBrowseCommercialMessagesBanner", "enableOffersHub", "enableOffersHubFlow", "C", "enableAppointmentBooking", "enableStoreModeActivation", "killswitch-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C10253a {

    /* renamed from: s  reason: collision with root package name */
    public static final b f89780s = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Context f89781a;

    /* renamed from: b  reason: collision with root package name */
    private final b f89782b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Il.a f89783c;

    /* renamed from: d  reason: collision with root package name */
    private final M f89784d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f89785e;

    /* renamed from: f  reason: collision with root package name */
    private final C17514c f89786f;

    /* renamed from: g  reason: collision with root package name */
    private final File f89787g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f89788h;

    /* renamed from: i  reason: collision with root package name */
    private final C16505B<KillSwitchConfig> f89789i;

    /* renamed from: j  reason: collision with root package name */
    private final C16519P<KillSwitchConfig> f89790j;

    /* renamed from: k  reason: collision with root package name */
    private final C16519P<Boolean> f89791k;

    /* renamed from: l  reason: collision with root package name */
    private final C16519P<Boolean> f89792l;

    /* renamed from: m  reason: collision with root package name */
    private final C16532g<Boolean> f89793m;

    /* renamed from: n  reason: collision with root package name */
    private final C16532g<Boolean> f89794n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f89795o = true;

    /* renamed from: p  reason: collision with root package name */
    private final C16532g<Boolean> f89796p;

    /* renamed from: q  reason: collision with root package name */
    private final C16532g<Boolean> f89797q;

    /* renamed from: r  reason: collision with root package name */
    private final C16532g<Boolean> f89798r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$2", f = "KillSwitchRepositoryImpl.kt", l = {197}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89799c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f89800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f89800d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f89800d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f89799c;
            if (i10 == 0) {
                y.b(obj);
                f fVar = this.f89800d;
                this.f89799c = 1;
                if (fVar.W(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYu/f$b;", "", "<init>", "()V", "killswitch-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Yu/f$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f89801a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, f fVar) {
            super(aVar);
            this.f89801a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f89801a;
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
                    String a10 = C11818a.a("Unable to fetch kill switch", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$fetchAndUpdateConfig$2", f = "KillSwitchRepositoryImpl.kt", l = {207, 212}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f89802c;

        /* renamed from: d  reason: collision with root package name */
        int f89803d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f89804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f89804e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f89804e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f89803d;
            if (i10 == 0) {
                y.b(obj);
                f fVar = this.f89804e;
                String i11 = fVar.f89783c.i();
                String a10 = this.f89804e.f89783c.a();
                this.f89803d = 1;
                obj = fVar.B(i11, a10, true, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                KillSwitchConfig killSwitchConfig = (KillSwitchConfig) this.f89802c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            KillSwitchConfig killSwitchConfig2 = (KillSwitchConfig) obj;
            f fVar2 = this.f89804e;
            this.f89802c = killSwitchConfig2;
            this.f89803d = 2;
            if (fVar2.F(killSwitchConfig2, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl", f = "KillSwitchRepositoryImpl.kt", l = {217, 222}, m = "fetchAndUpdateConfigSuspended")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89805c;

        /* renamed from: d  reason: collision with root package name */
        Object f89806d;

        /* renamed from: e  reason: collision with root package name */
        Object f89807e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f89808f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f89809g;

        /* renamed from: h  reason: collision with root package name */
        int f89810h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f89809g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89808f = obj;
            this.f89810h |= Integer.MIN_VALUE;
            return this.f89809g.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl", f = "KillSwitchRepositoryImpl.kt", l = {232}, m = "fetchConfigSuspended")
    /* renamed from: Yu.f$f  reason: collision with other inner class name */
    static final class C1921f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89811c;

        /* renamed from: d  reason: collision with root package name */
        Object f89812d;

        /* renamed from: e  reason: collision with root package name */
        Object f89813e;

        /* renamed from: f  reason: collision with root package name */
        Object f89814f;

        /* renamed from: g  reason: collision with root package name */
        Object f89815g;

        /* renamed from: h  reason: collision with root package name */
        Object f89816h;

        /* renamed from: i  reason: collision with root package name */
        Object f89817i;

        /* renamed from: j  reason: collision with root package name */
        Object f89818j;

        /* renamed from: k  reason: collision with root package name */
        Object f89819k;

        /* renamed from: l  reason: collision with root package name */
        Object f89820l;

        /* renamed from: m  reason: collision with root package name */
        Object f89821m;

        /* renamed from: n  reason: collision with root package name */
        Object f89822n;

        /* renamed from: o  reason: collision with root package name */
        boolean f89823o;

        /* renamed from: p  reason: collision with root package name */
        int f89824p;

        /* renamed from: q  reason: collision with root package name */
        int f89825q;

        /* renamed from: r  reason: collision with root package name */
        int f89826r;

        /* renamed from: s  reason: collision with root package name */
        int f89827s;

        /* renamed from: t  reason: collision with root package name */
        int f89828t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f89829u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ f f89830v;

        /* renamed from: w  reason: collision with root package name */
        int f89831w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1921f(f fVar, C17164e<? super C1921f> eVar) {
            super(eVar);
            this.f89830v = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89829u = obj;
            this.f89831w |= Integer.MIN_VALUE;
            return this.f89830v.B((String) null, (String) null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl", f = "KillSwitchRepositoryImpl.kt", l = {286, 292, 295, 298}, m = "load$killswitch_implementation_release")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89832c;

        /* renamed from: d  reason: collision with root package name */
        Object f89833d;

        /* renamed from: e  reason: collision with root package name */
        Object f89834e;

        /* renamed from: f  reason: collision with root package name */
        Object f89835f;

        /* renamed from: g  reason: collision with root package name */
        Object f89836g;

        /* renamed from: h  reason: collision with root package name */
        Object f89837h;

        /* renamed from: i  reason: collision with root package name */
        Object f89838i;

        /* renamed from: j  reason: collision with root package name */
        Object f89839j;

        /* renamed from: k  reason: collision with root package name */
        Object f89840k;

        /* renamed from: l  reason: collision with root package name */
        Object f89841l;

        /* renamed from: m  reason: collision with root package name */
        Object f89842m;

        /* renamed from: n  reason: collision with root package name */
        Object f89843n;

        /* renamed from: o  reason: collision with root package name */
        Object f89844o;

        /* renamed from: p  reason: collision with root package name */
        Object f89845p;

        /* renamed from: q  reason: collision with root package name */
        int f89846q;

        /* renamed from: r  reason: collision with root package name */
        int f89847r;

        /* renamed from: s  reason: collision with root package name */
        int f89848s;

        /* renamed from: t  reason: collision with root package name */
        int f89849t;

        /* renamed from: u  reason: collision with root package name */
        int f89850u;

        /* renamed from: v  reason: collision with root package name */
        int f89851v;

        /* renamed from: w  reason: collision with root package name */
        /* synthetic */ Object f89852w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ f f89853x;

        /* renamed from: y  reason: collision with root package name */
        int f89854y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f89853x = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89852w = obj;
            this.f89854y |= Integer.MIN_VALUE;
            return this.f89853x.W(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl", f = "KillSwitchRepositoryImpl.kt", l = {247}, m = "onUpdateSuspended")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89855c;

        /* renamed from: d  reason: collision with root package name */
        Object f89856d;

        /* renamed from: e  reason: collision with root package name */
        Object f89857e;

        /* renamed from: f  reason: collision with root package name */
        Object f89858f;

        /* renamed from: g  reason: collision with root package name */
        Object f89859g;

        /* renamed from: h  reason: collision with root package name */
        Object f89860h;

        /* renamed from: i  reason: collision with root package name */
        Object f89861i;

        /* renamed from: j  reason: collision with root package name */
        Object f89862j;

        /* renamed from: k  reason: collision with root package name */
        Object f89863k;

        /* renamed from: l  reason: collision with root package name */
        Object f89864l;

        /* renamed from: m  reason: collision with root package name */
        Object f89865m;

        /* renamed from: n  reason: collision with root package name */
        Object f89866n;

        /* renamed from: o  reason: collision with root package name */
        int f89867o;

        /* renamed from: p  reason: collision with root package name */
        int f89868p;

        /* renamed from: q  reason: collision with root package name */
        int f89869q;

        /* renamed from: r  reason: collision with root package name */
        int f89870r;

        /* renamed from: s  reason: collision with root package name */
        int f89871s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f89872t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ f f89873u;

        /* renamed from: v  reason: collision with root package name */
        int f89874v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f89873u = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89872t = obj;
            this.f89874v |= Integer.MIN_VALUE;
            return this.f89873u.F((KillSwitchConfig) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Yu/f$i", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f89875a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(N.a aVar, f fVar) {
            super(aVar);
            this.f89875a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f89875a;
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
                    String a10 = C11818a.a("Unable to read file", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89876a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89877a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$1$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$j$a$a  reason: collision with other inner class name */
            public static final class C1922a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89878c;

                /* renamed from: d  reason: collision with root package name */
                int f89879d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89880e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1922a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89880e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89878c = obj;
                    this.f89879d |= Integer.MIN_VALUE;
                    return this.f89880e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89877a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.j.a.C1922a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$j$a$a r0 = (Yu.f.j.a.C1922a) r0
                    int r1 = r0.f89879d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89879d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$j$a$a r0 = new Yu.f$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89878c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89879d
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
                    TJ.h r6 = r4.f89877a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.l()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89879d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.j.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public j(C16532g gVar) {
            this.f89876a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89876a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89881a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89882a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$2$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$k$a$a  reason: collision with other inner class name */
            public static final class C1923a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89883c;

                /* renamed from: d  reason: collision with root package name */
                int f89884d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89885e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1923a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89885e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89883c = obj;
                    this.f89884d |= Integer.MIN_VALUE;
                    return this.f89885e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89882a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.k.a.C1923a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$k$a$a r0 = (Yu.f.k.a.C1923a) r0
                    int r1 = r0.f89884d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89884d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$k$a$a r0 = new Yu.f$k$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89883c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89884d
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
                    TJ.h r6 = r4.f89882a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.t()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89884d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.k.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public k(C16532g gVar) {
            this.f89881a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89881a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89886a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89887a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$3$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$l$a$a  reason: collision with other inner class name */
            public static final class C1924a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89888c;

                /* renamed from: d  reason: collision with root package name */
                int f89889d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89890e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1924a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89890e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89888c = obj;
                    this.f89889d |= Integer.MIN_VALUE;
                    return this.f89890e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89887a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.l.a.C1924a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$l$a$a r0 = (Yu.f.l.a.C1924a) r0
                    int r1 = r0.f89889d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89889d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$l$a$a r0 = new Yu.f$l$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89888c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89889d
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
                    TJ.h r6 = r4.f89887a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.P()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89889d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.l.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f89886a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89886a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89891a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89892a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$4$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$m$a$a  reason: collision with other inner class name */
            public static final class C1925a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89893c;

                /* renamed from: d  reason: collision with root package name */
                int f89894d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89895e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1925a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89895e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89893c = obj;
                    this.f89894d |= Integer.MIN_VALUE;
                    return this.f89895e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89892a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.m.a.C1925a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$m$a$a r0 = (Yu.f.m.a.C1925a) r0
                    int r1 = r0.f89894d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89894d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$m$a$a r0 = new Yu.f$m$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89893c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89894d
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
                    TJ.h r6 = r4.f89892a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.E()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89894d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar) {
            this.f89891a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89891a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89896a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89897a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$5$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$n$a$a  reason: collision with other inner class name */
            public static final class C1926a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89898c;

                /* renamed from: d  reason: collision with root package name */
                int f89899d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89900e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1926a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89900e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89898c = obj;
                    this.f89899d |= Integer.MIN_VALUE;
                    return this.f89900e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89897a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.n.a.C1926a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$n$a$a r0 = (Yu.f.n.a.C1926a) r0
                    int r1 = r0.f89899d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89899d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$n$a$a r0 = new Yu.f$n$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89898c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89899d
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
                    TJ.h r6 = r4.f89897a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.B()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89899d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.n.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public n(C16532g gVar) {
            this.f89896a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89896a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89901a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89902a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.killswitch.impl.data.KillSwitchRepositoryImpl$special$$inlined$map$6$2", f = "KillSwitchRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yu.f$o$a$a  reason: collision with other inner class name */
            public static final class C1927a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89903c;

                /* renamed from: d  reason: collision with root package name */
                int f89904d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89905e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1927a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89905e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89903c = obj;
                    this.f89904d |= Integer.MIN_VALUE;
                    return this.f89905e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f89902a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r5 = r5.x();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yu.f.o.a.C1927a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yu.f$o$a$a r0 = (Yu.f.o.a.C1927a) r0
                    int r1 = r0.f89904d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89904d = r1
                    goto L_0x0018
                L_0x0013:
                    Yu.f$o$a$a r0 = new Yu.f$o$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f89903c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89904d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f89902a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x0045
                    java.lang.Boolean r5 = r5.x()
                    if (r5 == 0) goto L_0x0045
                    boolean r5 = r5.booleanValue()
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f89904d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yu.f.o.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public o(C16532g gVar) {
            this.f89901a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89901a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public f(Context context, b bVar, Il.a aVar, M m10, Q q10, C17514c cVar, C11070a aVar2) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "killSwitchRemoteDataSource");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "scope");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(aVar2, "appApi");
        this.f89781a = context;
        this.f89782b = bVar;
        this.f89783c = aVar;
        this.f89784d = m10;
        this.f89785e = q10;
        this.f89786f = cVar;
        this.f89787g = new File(context.getFilesDir(), "ks_store");
        this.f89788h = aVar2.a();
        C16505B<KillSwitchConfig> a10 = C16521S.a(null);
        this.f89789i = a10;
        this.f89790j = a10;
        this.f89791k = ip.n.a(a10, q10, new d());
        this.f89792l = ip.n.a(a10, q10, new e());
        this.f89793m = new j(a10);
        this.f89794n = new k(a10);
        this.f89796p = new l(a10);
        this.f89797q = new m(a10);
        this.f89798r = new n(a10);
        F0 unused = C16314k.d(R(), new i(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    private final Q R() {
        return S.a(this.f89784d);
    }

    private final boolean S(KillSwitchConfig killSwitchConfig) {
        String str;
        String str2;
        String str3;
        char c10;
        char c11;
        Object obj;
        String str4;
        String str5 = DslKt.INDICATOR_BACKGROUND;
        String str6 = DslKt.INDICATOR_MAIN;
        char c12 = '$';
        Class<f> cls = f.class;
        if (killSwitchConfig == null) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar : arrayList) {
                if (str7 == null) {
                    String a10 = C11818a.a("Stored KillSwitch was null", (Throwable) null);
                    if (a10 == null) {
                        return false;
                    }
                    str7 = C11820c.a(a10);
                }
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str6 : str5) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str9 = str8;
                bVar.a(eVar, str9, false, (Throwable) null, str7);
                str8 = str9;
                eVar = eVar;
                c12 = '$';
            }
            return false;
        }
        boolean V10 = V(killSwitchConfig.I(), killSwitchConfig.H());
        if (!V10) {
            qv.e eVar2 = qv.e.WARN;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it = arrayList2.iterator();
            String str10 = null;
            String str11 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar2 = (C11819b) it.next();
                if (str10 == null) {
                    String I10 = killSwitchConfig.I();
                    String i10 = this.f89783c.i();
                    String H10 = killSwitchConfig.H();
                    String a11 = this.f89783c.a();
                    str2 = str5;
                    StringBuilder sb2 = new StringBuilder();
                    str = str6;
                    sb2.append("\n                    Stored KillSwitch locale is invalid:\n                      region: ");
                    sb2.append(I10);
                    sb2.append(" (");
                    sb2.append(i10);
                    sb2.append(")\n                      language: ");
                    sb2.append(H10);
                    sb2.append(" (");
                    sb2.append(a11);
                    sb2.append(")\n                ");
                    String a12 = C11818a.a(C15854t.m(sb2.toString()), (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str10 = C11820c.a(a12);
                } else {
                    str2 = str5;
                    str = str6;
                }
                if (str11 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                String str12 = str11;
                bVar2.a(eVar2, str12, false, (Throwable) null, str10);
                str11 = str12;
                str5 = str2;
                str6 = str;
            }
        }
        str2 = str5;
        str = str6;
        boolean H11 = C15854t.H(this.f89788h, killSwitchConfig.O(), false);
        if (!H11) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str13 = null;
            String str14 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str14 == null) {
                    String a13 = C11818a.a(C15854t.m("\n                    Stored KillSwitch version is invalid:\n                      current: " + this.f89788h + " \n                      stored: " + killSwitchConfig.O() + "\n                "), (Throwable) null);
                    if (a13 == null) {
                        break;
                    }
                    str3 = C11820c.a(a13);
                } else {
                    str3 = str14;
                }
                if (str13 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    obj = null;
                    c11 = 2;
                    c10 = '$';
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    obj = null;
                    c11 = 2;
                    c10 = '$';
                    str4 = str13;
                }
                Object obj2 = obj;
                char c13 = c11;
                char c14 = c10;
                bVar3.a(eVar3, str4, false, (Throwable) null, str3);
                str13 = str4;
                str14 = str3;
            }
        }
        return V10 && H11;
    }

    /* access modifiers changed from: private */
    public static final boolean T(KillSwitchConfig killSwitchConfig) {
        if (killSwitchConfig != null) {
            return killSwitchConfig.z();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean U(KillSwitchConfig killSwitchConfig) {
        if (killSwitchConfig != null) {
            return killSwitchConfig.D();
        }
        return false;
    }

    private final boolean V(String str, String str2) {
        return C17542s.e(this.f89783c.i(), str) && C17542s.e(this.f89783c.a(), str2);
    }

    public boolean A() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B(java.lang.String r30, java.lang.String r31, boolean r32, dI.C17164e<? super com.ingka.ikea.killswitch.model.KillSwitchConfig> r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            boolean r5 = r4 instanceof Yu.f.C1921f
            if (r5 == 0) goto L_0x001d
            r5 = r4
            Yu.f$f r5 = (Yu.f.C1921f) r5
            int r6 = r5.f89831w
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f89831w = r6
            goto L_0x0022
        L_0x001d:
            Yu.f$f r5 = new Yu.f$f
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f89829u
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f89831w
            java.lang.String r9 = "|"
            java.lang.String r10 = "b"
            java.lang.String r11 = "m"
            java.lang.String r12 = "main"
            java.lang.String r13 = "Kt"
            r14 = 1
            if (r8 == 0) goto L_0x0076
            if (r8 != r14) goto L_0x006e
            java.lang.Object r1 = r5.f89821m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f89820l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r5.f89819k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f89818j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f89817i
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r5.f89816h
            Yu.f r1 = (Yu.f) r1
            java.lang.Object r1 = r5.f89815g
            Yu.f r1 = (Yu.f) r1
            java.lang.Object r1 = r5.f89814f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r5.f89813e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f89812d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r5.f89811c
            Yu.f r1 = (Yu.f) r1
            XH.y.b(r6)
            r23 = r10
            r25 = r11
            goto L_0x0193
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0076:
            XH.y.b(r6)
            qv.e r6 = qv.e.DEBUG
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x008c:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x00ac
            java.lang.Object r15 = r8.next()
            r17 = r8
            r8 = r15
            qv.b r8 = (qv.C11819b) r8
            r23 = r10
            r10 = 0
            boolean r8 = r8.b(r6, r10)
            if (r8 == 0) goto L_0x00a7
            r14.add(r15)
        L_0x00a7:
            r8 = r17
            r10 = r23
            goto L_0x008c
        L_0x00ac:
            r23 = r10
            java.util.Iterator r8 = r14.iterator()
            r17 = r14
            r10 = 0
            r15 = 0
        L_0x00b6:
            boolean r18 = r8.hasNext()
            if (r18 == 0) goto L_0x014c
            java.lang.Object r24 = r8.next()
            r17 = r24
            qv.b r17 = (qv.C11819b) r17
            r25 = r11
            r11 = 0
            r26 = r7
            if (r10 != 0) goto L_0x00df
            java.lang.String r7 = "fetchConfig"
            java.lang.String r7 = qv.C11818a.a(r7, r11)
            if (r7 != 0) goto L_0x00db
            r27 = r8
            r28 = r14
            r7 = r24
            goto L_0x0156
        L_0x00db:
            java.lang.String r10 = qv.C11820c.a(r7)
        L_0x00df:
            if (r15 != 0) goto L_0x012e
            java.lang.Class<Yu.f> r7 = Yu.f.class
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r27 = r8
            r28 = r14
            r8 = 0
            r11 = 2
            r15 = 36
            java.lang.String r14 = HJ.C15854t.s1(r7, r15, r8, r11, r8)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r8, r11, r8)
            int r8 = r14.length()
            if (r8 != 0) goto L_0x0103
            goto L_0x0107
        L_0x0103:
            java.lang.String r7 = HJ.C15854t.P0(r14, r13)
        L_0x0107:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r11 = 1
            boolean r8 = HJ.C15854t.b0(r8, r12, r11)
            if (r8 == 0) goto L_0x0119
            r8 = r25
            goto L_0x011b
        L_0x0119:
            r8 = r23
        L_0x011b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r9)
            r11.append(r7)
            java.lang.String r15 = r11.toString()
            goto L_0x0132
        L_0x012e:
            r27 = r8
            r28 = r14
        L_0x0132:
            r20 = 0
            r18 = r6
            r19 = r15
            r7 = 0
            r21 = r7
            r22 = r10
            r17.a(r18, r19, r20, r21, r22)
            r17 = r24
            r11 = r25
            r7 = r26
            r8 = r27
            r14 = r28
            goto L_0x00b6
        L_0x014c:
            r26 = r7
            r27 = r8
            r25 = r11
            r28 = r14
            r7 = r17
        L_0x0156:
            r0.Y(r3)
            Yu.b r8 = r0.f89782b
            java.lang.String r11 = r0.f89788h
            r5.f89811c = r0
            r5.f89812d = r1
            r5.f89813e = r2
            r5.f89814f = r4
            r5.f89815g = r0
            r5.f89816h = r0
            r5.f89817i = r6
            r5.f89818j = r10
            r5.f89819k = r15
            r4 = r28
            r5.f89820l = r4
            r4 = r27
            r5.f89821m = r4
            r5.f89822n = r7
            r5.f89823o = r3
            r3 = 0
            r5.f89824p = r3
            r5.f89825q = r3
            r5.f89826r = r3
            r5.f89827s = r3
            r5.f89828t = r3
            r3 = 1
            r5.f89831w = r3
            java.lang.Object r6 = r8.a(r1, r2, r11, r5)
            r1 = r26
            if (r6 != r1) goto L_0x0192
            return r1
        L_0x0192:
            r1 = r0
        L_0x0193:
            com.ingka.ikea.killswitch.model.KillSwitchConfig r6 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r6
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01a8:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01c0
            java.lang.Object r5 = r3.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x01a8
            r4.add(r5)
            goto L_0x01a8
        L_0x01c0:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r8 = 0
        L_0x01c6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0254
            java.lang.Object r5 = r3.next()
            r17 = r5
            qv.b r17 = (qv.C11819b) r17
            r5 = 0
            if (r8 != 0) goto L_0x01f4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Fetched kill switch: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r5)
            if (r7 != 0) goto L_0x01ef
            goto L_0x0254
        L_0x01ef:
            java.lang.String r7 = qv.C11820c.a(r7)
            r8 = r7
        L_0x01f4:
            if (r4 != 0) goto L_0x0241
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r7 = 36
            r10 = 2
            r11 = 0
            java.lang.String r14 = HJ.C15854t.s1(r4, r7, r11, r10, r11)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r11, r10, r11)
            int r16 = r14.length()
            if (r16 != 0) goto L_0x0216
            goto L_0x021a
        L_0x0216:
            java.lang.String r4 = HJ.C15854t.P0(r14, r13)
        L_0x021a:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r7 = 1
            boolean r14 = HJ.C15854t.b0(r14, r12, r7)
            if (r14 == 0) goto L_0x022c
            r14 = r25
            goto L_0x022e
        L_0x022c:
            r14 = r23
        L_0x022e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            r7.append(r9)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x0245
        L_0x0241:
            r10 = 2
            r11 = 0
            r15 = 46
        L_0x0245:
            r20 = 0
            r18 = r2
            r19 = r4
            r21 = r5
            r22 = r8
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x01c6
        L_0x0254:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.f.B(java.lang.String, java.lang.String, boolean, dI.e):java.lang.Object");
    }

    public boolean C() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.d();
    }

    public boolean D() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.f();
    }

    public boolean E() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.m();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object F(com.ingka.ikea.killswitch.model.KillSwitchConfig r20, dI.C17164e<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof Yu.f.h
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Yu.f$h r3 = (Yu.f.h) r3
            int r4 = r3.f89874v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f89874v = r4
            goto L_0x001e
        L_0x0019:
            Yu.f$h r3 = new Yu.f$h
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f89872t
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f89874v
            r7 = 1
            if (r6 == 0) goto L_0x0064
            if (r6 != r7) goto L_0x005c
            java.lang.Object r1 = r3.f89865m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f89864l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f89863k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f89862j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f89861i
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f89860h
            Yu.f r1 = (Yu.f) r1
            java.lang.Object r1 = r3.f89859g
            Yu.f r1 = (Yu.f) r1
            java.lang.Object r1 = r3.f89858f
            com.ingka.ikea.killswitch.model.KillSwitchConfig r1 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r1
            java.lang.Object r1 = r3.f89857e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f89856d
            com.ingka.ikea.killswitch.model.KillSwitchConfig r1 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r1
            java.lang.Object r2 = r3.f89855c
            Yu.f r2 = (Yu.f) r2
            XH.y.b(r4)
            goto L_0x017f
        L_0x005c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0064:
            XH.y.b(r4)
            r4 = 0
            if (r1 != 0) goto L_0x006f
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r1
        L_0x006f:
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r6 = r0.f89789i
            java.lang.Object r6 = r6.getValue()
            com.ingka.ikea.killswitch.model.KillSwitchConfig r6 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r6
            boolean r8 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r8 != 0) goto L_0x0188
            qv.e r8 = qv.e.DEBUG
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0090:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a7
            java.lang.Object r10 = r9.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r8, r4)
            if (r11 == 0) goto L_0x0090
            r15.add(r10)
            goto L_0x0090
        L_0x00a7:
            java.util.Iterator r14 = r15.iterator()
            r13 = 0
            r9 = r13
            r10 = r9
            r11 = r15
        L_0x00af:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x014e
            java.lang.Object r16 = r14.next()
            r11 = r16
            qv.b r11 = (qv.C11819b) r11
            r12 = 0
            if (r9 != 0) goto L_0x00e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "save kill switch: "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r12)
            if (r4 != 0) goto L_0x00dc
            r7 = r14
            r11 = r16
            goto L_0x014f
        L_0x00dc:
            java.lang.String r9 = qv.C11820c.a(r4)
        L_0x00e0:
            r4 = r9
            if (r10 != 0) goto L_0x0130
            java.lang.Class<Yu.f> r7 = Yu.f.class
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r9 = 36
            r10 = 2
            java.lang.String r9 = HJ.C15854t.s1(r7, r9, r13, r10, r13)
            r12 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r12, r13, r10, r13)
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r9, r7)
        L_0x0106:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "main"
            r12 = 1
            boolean r9 = HJ.C15854t.b0(r9, r10, r12)
            if (r9 == 0) goto L_0x011a
            java.lang.String r9 = "m"
            goto L_0x011c
        L_0x011a:
            java.lang.String r9 = "b"
        L_0x011c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "|"
            r10.append(r9)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
        L_0x0130:
            r7 = r10
            r12 = 0
            r9 = r11
            r10 = r8
            r11 = r7
            r17 = 0
            r18 = r13
            r13 = r17
            r17 = r7
            r7 = r14
            r14 = r4
            r9.a(r10, r11, r12, r13, r14)
            r9 = r4
            r14 = r7
            r11 = r16
            r10 = r17
            r13 = r18
            r4 = 0
            r7 = 1
            goto L_0x00af
        L_0x014e:
            r7 = r14
        L_0x014f:
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r4 = r0.f89789i
            r3.f89855c = r0
            r3.f89856d = r1
            r3.f89857e = r2
            r3.f89858f = r6
            r3.f89859g = r0
            r3.f89860h = r0
            r3.f89861i = r8
            r3.f89862j = r9
            r3.f89863k = r10
            r3.f89864l = r15
            r3.f89865m = r7
            r3.f89866n = r11
            r2 = 0
            r3.f89867o = r2
            r3.f89868p = r2
            r3.f89869q = r2
            r3.f89870r = r2
            r3.f89871s = r2
            r2 = 1
            r3.f89874v = r2
            java.lang.Object r2 = r4.emit(r1, r3)
            if (r2 != r5) goto L_0x017e
            return r5
        L_0x017e:
            r2 = r0
        L_0x017f:
            boolean r1 = r2.X(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r1
        L_0x0188:
            r2 = r7
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.f.F(com.ingka.ikea.killswitch.model.KillSwitchConfig, dI.e):java.lang.Object");
    }

    public boolean G() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.s();
    }

    public boolean H() {
        return this.f89795o;
    }

    public C16519P<KillSwitchConfig> I() {
        return this.f89790j;
    }

    public boolean J() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && !value.j();
    }

    public boolean K() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.A();
    }

    public C16519P<Boolean> L() {
        return this.f89791k;
    }

    public boolean M() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.nio.charset.Charset} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v69, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v71, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0350, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0351, code lost:
        r10 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0350 A[Catch:{ IOException -> 0x0349, q -> 0x0342, IllegalArgumentException -> 0x033b }, ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), PHI: r19 
      PHI: (r19v10 java.lang.String) = (r19v9 java.lang.String), (r19v9 java.lang.String), (r19v9 java.lang.String), (r19v9 java.lang.String), (r19v9 java.lang.String), (r19v13 java.lang.String) binds: [B:67:0x0235, B:68:?, B:69:0x0237, B:92:0x02a0, B:100:0x02cb, B:114:0x02f2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:67:0x0235] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x038c A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03b8 A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0492 A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04b7 A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04e1 A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05bb A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05e0 A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x060a A[Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350, all -> 0x027b }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x06ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0578 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06aa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object W(dI.C17164e<? super XH.C16807N> r34) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            boolean r0 = r2 instanceof Yu.f.g
            if (r0 == 0) goto L_0x0018
            r0 = r2
            Yu.f$g r0 = (Yu.f.g) r0
            int r3 = r0.f89854y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r0.f89854y = r3
        L_0x0016:
            r3 = r0
            goto L_0x001e
        L_0x0018:
            Yu.f$g r0 = new Yu.f$g
            r0.<init>(r1, r2)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r3.f89852w
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f89854y
            r6 = 4
            r7 = 3
            java.lang.String r8 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            r15 = 1
            r13 = 2
            if (r5 == 0) goto L_0x014b
            if (r5 == r15) goto L_0x00ed
            if (r5 == r13) goto L_0x00b8
            if (r5 == r7) goto L_0x0083
            if (r5 != r6) goto L_0x007b
            java.lang.Object r2 = r3.f89844o
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r3.f89843n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r3.f89842m
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89841l
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89840k
            qv.e r2 = (qv.e) r2
            java.lang.Object r2 = r3.f89839j
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89838i
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89837h
            java.lang.IllegalArgumentException r2 = (java.lang.IllegalArgumentException) r2
            java.lang.Object r2 = r3.f89836g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89835f
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            java.lang.Object r2 = r3.f89834e
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r4 = r3.f89833d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r3 = r3.f89832c
            Yu.f r3 = (Yu.f) r3
        L_0x0072:
            XH.y.b(r0)     // Catch:{ all -> 0x0077 }
            goto L_0x0278
        L_0x0077:
            r0 = move-exception
            r1 = r0
            goto L_0x06f7
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0083:
            java.lang.Object r2 = r3.f89844o
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r3.f89843n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r3.f89842m
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89841l
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89840k
            qv.e r2 = (qv.e) r2
            java.lang.Object r2 = r3.f89839j
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89838i
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89837h
            fK.q r2 = (fK.q) r2
            java.lang.Object r2 = r3.f89836g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89835f
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            java.lang.Object r2 = r3.f89834e
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r4 = r3.f89833d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r3 = r3.f89832c
            Yu.f r3 = (Yu.f) r3
            goto L_0x0072
        L_0x00b8:
            java.lang.Object r2 = r3.f89844o
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r3.f89843n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r3.f89842m
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89841l
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89840k
            qv.e r2 = (qv.e) r2
            java.lang.Object r2 = r3.f89839j
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89838i
            Yu.f r2 = (Yu.f) r2
            java.lang.Object r2 = r3.f89837h
            java.io.IOException r2 = (java.io.IOException) r2
            java.lang.Object r2 = r3.f89836g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f89835f
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            java.lang.Object r2 = r3.f89834e
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r4 = r3.f89833d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r3 = r3.f89832c
            Yu.f r3 = (Yu.f) r3
            goto L_0x0072
        L_0x00ed:
            int r2 = r3.f89846q
            java.lang.Object r5 = r3.f89842m
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r5 = r3.f89841l
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = r3.f89840k
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r3.f89839j
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r3.f89838i
            qv.e r5 = (qv.e) r5
            java.lang.Object r5 = r3.f89837h
            com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
            java.lang.Object r5 = r3.f89836g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r3.f89835f
            java.io.BufferedReader r7 = (java.io.BufferedReader) r7
            java.lang.Object r6 = r3.f89834e
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r15 = r3.f89833d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r13 = r3.f89832c
            Yu.f r13 = (Yu.f) r13
            XH.y.b(r0)     // Catch:{ IOException -> 0x013e, q -> 0x0131, IllegalArgumentException -> 0x0125, all -> 0x0120 }
            goto L_0x0277
        L_0x0120:
            r0 = move-exception
            r1 = r0
            r2 = r6
            goto L_0x06f7
        L_0x0125:
            r0 = move-exception
            r25 = r9
            r26 = r10
            r10 = r8
            r8 = r6
            r6 = r0
            r0 = r2
            r2 = r15
            goto L_0x0373
        L_0x0131:
            r0 = move-exception
            r1 = r4
            r25 = r9
            r26 = r10
            r4 = r0
            r0 = r2
            r10 = r8
            r2 = r15
            r8 = r6
            goto L_0x049e
        L_0x013e:
            r0 = move-exception
            r1 = r4
            r25 = r9
            r26 = r10
            r4 = r0
            r0 = r2
            r10 = r8
            r2 = r15
            r8 = r6
            goto L_0x05c7
        L_0x014b:
            XH.y.b(r0)
            qv.e r0 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0161:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0179
            java.lang.Object r7 = r5.next()
            r13 = r7
            qv.b r13 = (qv.C11819b) r13
            r15 = 0
            boolean r13 = r13.b(r0, r15)
            if (r13 == 0) goto L_0x0161
            r6.add(r7)
            goto L_0x0161
        L_0x0179:
            java.util.Iterator r5 = r6.iterator()
            r15 = r6
            r7 = 0
            r13 = 0
        L_0x0180:
            boolean r19 = r5.hasNext()
            java.lang.Class<Yu.f> r20 = Yu.f.class
            if (r19 == 0) goto L_0x020c
            java.lang.Object r15 = r5.next()
            r19 = r15
            qv.b r19 = (qv.C11819b) r19
            r14 = 0
            r25 = r9
            if (r7 != 0) goto L_0x01a5
            java.lang.String r9 = "load kill switch from file"
            java.lang.String r9 = qv.C11818a.a(r9, r14)
            if (r9 != 0) goto L_0x01a1
        L_0x019d:
            r26 = r10
            goto L_0x020f
        L_0x01a1:
            java.lang.String r7 = qv.C11820c.a(r9)
        L_0x01a5:
            if (r13 != 0) goto L_0x01f2
            java.lang.String r9 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r26 = r10
            r27 = r15
            r10 = 0
            r13 = 36
            r14 = 2
            java.lang.String r15 = HJ.C15854t.s1(r9, r13, r10, r14, r10)
            r13 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r13, r10, r14, r10)
            int r10 = r15.length()
            if (r10 != 0) goto L_0x01c7
            goto L_0x01cb
        L_0x01c7:
            java.lang.String r9 = HJ.C15854t.P0(r15, r12)
        L_0x01cb:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r13 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r13)
            if (r10 == 0) goto L_0x01dd
            r10 = r26
            goto L_0x01df
        L_0x01dd:
            r10 = r25
        L_0x01df:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r8)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            goto L_0x01f6
        L_0x01f2:
            r26 = r10
            r27 = r15
        L_0x01f6:
            r22 = 0
            r20 = r0
            r21 = r13
            r9 = 0
            r23 = r9
            r24 = r7
            r19.a(r20, r21, r22, r23, r24)
            r9 = r25
            r10 = r26
            r15 = r27
            goto L_0x0180
        L_0x020c:
            r25 = r9
            goto L_0x019d
        L_0x020f:
            java.io.File r9 = r1.f89787g
            boolean r9 = r9.exists()
            if (r9 != 0) goto L_0x021a
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x021a:
            java.io.File r9 = r1.f89787g
            java.nio.charset.Charset r10 = HJ.C15838d.f135279b
            java.io.InputStreamReader r14 = new java.io.InputStreamReader
            r19 = r8
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r9)
            r14.<init>(r8, r10)
            java.io.BufferedReader r8 = new java.io.BufferedReader
            r9 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r14, r9)
            java.lang.String r9 = jI.C17431r.h(r8)     // Catch:{ all -> 0x027b }
            kK.c r10 = r1.f89786f     // Catch:{ IOException -> 0x05bc, q -> 0x0493, IllegalArgumentException -> 0x0350 }
            com.ingka.ikea.killswitch.model.KillSwitchConfig$a r14 = com.ingka.ikea.killswitch.model.KillSwitchConfig.Companion     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            kotlinx.serialization.KSerializer r14 = r14.serializer()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.lang.Object r10 = r10.c(r14, r9)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            com.ingka.ikea.killswitch.model.KillSwitchConfig r10 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r10     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            boolean r14 = r1.S(r10)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            if (r14 == 0) goto L_0x02a0
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r14 = r1.f89789i     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89832c = r1     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89833d = r2     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89834e = r8     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89835f = r8     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89836g = r9     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89837h = r10     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89838i = r0     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89839j = r7     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89840k = r13     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89841l = r6     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89842m = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89843n = r15     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r5 = 0
            r3.f89846q = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89847r = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89848s = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r3.f89849t = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r5 = 1
            r3.f89854y = r5     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            java.lang.Object r0 = r14.emit(r10, r3)     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            if (r0 != r4) goto L_0x0276
            return r4
        L_0x0276:
            r6 = r8
        L_0x0277:
            r2 = r6
        L_0x0278:
            r1 = 0
            goto L_0x06ef
        L_0x027b:
            r0 = move-exception
            r1 = r0
            r2 = r8
            goto L_0x06f7
        L_0x0280:
            r0 = move-exception
            r6 = r0
            r13 = r1
            r7 = r8
            r5 = r9
            r10 = r19
        L_0x0287:
            r0 = 0
            goto L_0x0373
        L_0x028a:
            r0 = move-exception
            r13 = r1
            r1 = r4
            r7 = r8
            r5 = r9
            r10 = r19
        L_0x0291:
            r4 = r0
        L_0x0292:
            r0 = 0
            goto L_0x049e
        L_0x0295:
            r0 = move-exception
            r13 = r1
            r1 = r4
            r7 = r8
            r5 = r9
            r10 = r19
        L_0x029c:
            r4 = r0
        L_0x029d:
            r0 = 0
            goto L_0x05c7
        L_0x02a0:
            qv.e r0 = qv.e.WARN     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            qv.d r5 = qv.d.f102012a     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.util.List r5 = r5.a()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r6.<init>()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
        L_0x02b3:
            boolean r7 = r5.hasNext()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            if (r7 == 0) goto L_0x02cb
            java.lang.Object r7 = r5.next()     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r10 = r7
            qv.b r10 = (qv.C11819b) r10     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            r13 = 0
            boolean r10 = r10.b(r0, r13)     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            if (r10 == 0) goto L_0x02b3
            r6.add(r7)     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            goto L_0x02b3
        L_0x02cb:
            java.util.Iterator r5 = r6.iterator()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r6 = 0
            r7 = 0
        L_0x02d1:
            boolean r10 = r5.hasNext()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            if (r10 == 0) goto L_0x0370
            java.lang.Object r10 = r5.next()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r27 = r10
            qv.b r27 = (qv.C11819b) r27     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r10 = 0
            if (r6 != 0) goto L_0x02f0
            java.lang.String r6 = "KillSwitchConfig is not valid"
            java.lang.String r6 = qv.C11818a.a(r6, r10)     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
            if (r6 != 0) goto L_0x02ec
            goto L_0x0370
        L_0x02ec:
            java.lang.String r6 = qv.C11820c.a(r6)     // Catch:{ IOException -> 0x0295, q -> 0x028a, IllegalArgumentException -> 0x0280 }
        L_0x02f0:
            if (r7 != 0) goto L_0x035c
            java.lang.String r7 = r20.getName()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r13 = 36
            r14 = 2
            r15 = 0
            java.lang.String r10 = HJ.C15854t.s1(r7, r13, r15, r14, r15)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r13 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r13, r15, r14, r15)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            int r13 = r10.length()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            if (r13 != 0) goto L_0x030e
            goto L_0x0312
        L_0x030e:
            java.lang.String r7 = HJ.C15854t.P0(r10, r12)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
        L_0x0312:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            java.lang.String r10 = r10.getName()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r13 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r13)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            if (r10 == 0) goto L_0x0324
            r10 = r26
            goto L_0x0326
        L_0x0324:
            r10 = r25
        L_0x0326:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r13.<init>()     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r13.append(r10)     // Catch:{ IOException -> 0x0358, q -> 0x0354, IllegalArgumentException -> 0x0350 }
            r10 = r19
            r13.append(r10)     // Catch:{ IOException -> 0x0349, q -> 0x0342, IllegalArgumentException -> 0x033b }
            r13.append(r7)     // Catch:{ IOException -> 0x0349, q -> 0x0342, IllegalArgumentException -> 0x033b }
            java.lang.String r7 = r13.toString()     // Catch:{ IOException -> 0x0349, q -> 0x0342, IllegalArgumentException -> 0x033b }
            goto L_0x035e
        L_0x033b:
            r0 = move-exception
        L_0x033c:
            r6 = r0
            r13 = r1
            r7 = r8
            r5 = r9
            goto L_0x0287
        L_0x0342:
            r0 = move-exception
        L_0x0343:
            r13 = r1
            r1 = r4
            r7 = r8
            r5 = r9
            goto L_0x0291
        L_0x0349:
            r0 = move-exception
        L_0x034a:
            r13 = r1
            r1 = r4
            r7 = r8
            r5 = r9
            goto L_0x029c
        L_0x0350:
            r0 = move-exception
            r10 = r19
            goto L_0x033c
        L_0x0354:
            r0 = move-exception
            r10 = r19
            goto L_0x0343
        L_0x0358:
            r0 = move-exception
            r10 = r19
            goto L_0x034a
        L_0x035c:
            r10 = r19
        L_0x035e:
            r30 = 0
            r28 = r0
            r29 = r7
            r13 = 0
            r31 = r13
            r32 = r6
            r27.a(r28, r29, r30, r31, r32)     // Catch:{ IOException -> 0x0349, q -> 0x0342, IllegalArgumentException -> 0x033b }
            r19 = r10
            goto L_0x02d1
        L_0x0370:
            r2 = r8
            goto L_0x0278
        L_0x0373:
            qv.e r9 = qv.e.ERROR     // Catch:{ all -> 0x027b }
            qv.d r14 = qv.d.f102012a     // Catch:{ all -> 0x027b }
            java.util.List r14 = r14.a()     // Catch:{ all -> 0x027b }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ all -> 0x027b }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x027b }
            r15.<init>()     // Catch:{ all -> 0x027b }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x027b }
        L_0x0386:
            boolean r17 = r14.hasNext()     // Catch:{ all -> 0x027b }
            if (r17 == 0) goto L_0x03a8
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x027b }
            r34 = r14
            r14 = r1
            qv.b r14 = (qv.C11819b) r14     // Catch:{ all -> 0x027b }
            r27 = r4
            r4 = 0
            boolean r14 = r14.b(r9, r4)     // Catch:{ all -> 0x027b }
            if (r14 == 0) goto L_0x03a1
            r15.add(r1)     // Catch:{ all -> 0x027b }
        L_0x03a1:
            r1 = r33
            r14 = r34
            r4 = r27
            goto L_0x0386
        L_0x03a8:
            r27 = r4
            java.util.Iterator r1 = r15.iterator()     // Catch:{ all -> 0x027b }
            r17 = r15
            r4 = 0
            r14 = 0
        L_0x03b2:
            boolean r19 = r1.hasNext()     // Catch:{ all -> 0x027b }
            if (r19 == 0) goto L_0x044f
            java.lang.Object r17 = r1.next()     // Catch:{ all -> 0x027b }
            r19 = r17
            qv.b r19 = (qv.C11819b) r19     // Catch:{ all -> 0x027b }
            if (r4 != 0) goto L_0x03dc
            r28 = r0
            java.lang.String r0 = "KillSwitchConfig serializer is not valid"
            java.lang.String r0 = qv.C11818a.a(r0, r6)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x03d6
        L_0x03cc:
            r34 = r1
            r30 = r5
            r29 = r15
            r0 = r17
            goto L_0x0453
        L_0x03d6:
            java.lang.String r0 = qv.C11820c.a(r0)     // Catch:{ all -> 0x027b }
            r4 = r0
            goto L_0x03de
        L_0x03dc:
            r28 = r0
        L_0x03de:
            if (r14 != 0) goto L_0x0432
            java.lang.Class r0 = r13.getClass()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x027b }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x027b }
            r34 = r1
            r30 = r5
            r29 = r15
            r1 = 2
            r14 = 36
            r15 = 0
            java.lang.String r5 = HJ.C15854t.s1(r0, r14, r15, r1, r15)     // Catch:{ all -> 0x027b }
            r14 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r14, r15, r1, r15)     // Catch:{ all -> 0x027b }
            int r1 = r5.length()     // Catch:{ all -> 0x027b }
            if (r1 != 0) goto L_0x0406
            goto L_0x040a
        L_0x0406:
            java.lang.String r0 = HJ.C15854t.P0(r5, r12)     // Catch:{ all -> 0x027b }
        L_0x040a:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x027b }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x027b }
            r5 = 1
            boolean r1 = HJ.C15854t.b0(r1, r11, r5)     // Catch:{ all -> 0x027b }
            if (r1 == 0) goto L_0x041c
            r1 = r26
            goto L_0x041e
        L_0x041c:
            r1 = r25
        L_0x041e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r5.<init>()     // Catch:{ all -> 0x027b }
            r5.append(r1)     // Catch:{ all -> 0x027b }
            r5.append(r10)     // Catch:{ all -> 0x027b }
            r5.append(r0)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x027b }
            r14 = r0
            goto L_0x0438
        L_0x0432:
            r34 = r1
            r30 = r5
            r29 = r15
        L_0x0438:
            r22 = 0
            r20 = r9
            r21 = r14
            r23 = r6
            r24 = r4
            r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x027b }
            r1 = r34
            r0 = r28
            r15 = r29
            r5 = r30
            goto L_0x03b2
        L_0x044f:
            r28 = r0
            goto L_0x03cc
        L_0x0453:
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r1 = r13.f89789i     // Catch:{ all -> 0x027b }
            r3.f89832c = r13     // Catch:{ all -> 0x027b }
            r3.f89833d = r2     // Catch:{ all -> 0x027b }
            r3.f89834e = r8     // Catch:{ all -> 0x027b }
            r3.f89835f = r7     // Catch:{ all -> 0x027b }
            r5 = r30
            r3.f89836g = r5     // Catch:{ all -> 0x027b }
            r3.f89837h = r6     // Catch:{ all -> 0x027b }
            r3.f89838i = r13     // Catch:{ all -> 0x027b }
            r3.f89839j = r13     // Catch:{ all -> 0x027b }
            r3.f89840k = r9     // Catch:{ all -> 0x027b }
            r3.f89841l = r4     // Catch:{ all -> 0x027b }
            r3.f89842m = r14     // Catch:{ all -> 0x027b }
            r2 = r29
            r3.f89843n = r2     // Catch:{ all -> 0x027b }
            r2 = r34
            r3.f89844o = r2     // Catch:{ all -> 0x027b }
            r3.f89845p = r0     // Catch:{ all -> 0x027b }
            r2 = r28
            r3.f89846q = r2     // Catch:{ all -> 0x027b }
            r2 = 0
            r3.f89847r = r2     // Catch:{ all -> 0x027b }
            r3.f89848s = r2     // Catch:{ all -> 0x027b }
            r3.f89849t = r2     // Catch:{ all -> 0x027b }
            r3.f89850u = r2     // Catch:{ all -> 0x027b }
            r3.f89851v = r2     // Catch:{ all -> 0x027b }
            r2 = 4
            r3.f89854y = r2     // Catch:{ all -> 0x027b }
            r2 = 0
            java.lang.Object r0 = r1.emit(r2, r3)     // Catch:{ all -> 0x027b }
            r1 = r27
            if (r0 != r1) goto L_0x0370
            return r1
        L_0x0493:
            r0 = move-exception
            r1 = r4
            r10 = r19
            r13 = r33
            r4 = r0
            r7 = r8
            r5 = r9
            goto L_0x0292
        L_0x049e:
            qv.e r6 = qv.e.WARN     // Catch:{ all -> 0x027b }
            qv.d r9 = qv.d.f102012a     // Catch:{ all -> 0x027b }
            java.util.List r9 = r9.a()     // Catch:{ all -> 0x027b }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x027b }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x027b }
            r14.<init>()     // Catch:{ all -> 0x027b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x027b }
        L_0x04b1:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x027b }
            if (r15 == 0) goto L_0x04d1
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x027b }
            r34 = r9
            r9 = r15
            qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x027b }
            r27 = r1
            r1 = 0
            boolean r9 = r9.b(r6, r1)     // Catch:{ all -> 0x027b }
            if (r9 == 0) goto L_0x04cc
            r14.add(r15)     // Catch:{ all -> 0x027b }
        L_0x04cc:
            r9 = r34
            r1 = r27
            goto L_0x04b1
        L_0x04d1:
            r27 = r1
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x027b }
            r18 = r14
            r9 = 0
            r15 = 0
        L_0x04db:
            boolean r19 = r1.hasNext()     // Catch:{ all -> 0x027b }
            if (r19 == 0) goto L_0x0578
            java.lang.Object r18 = r1.next()     // Catch:{ all -> 0x027b }
            r19 = r18
            qv.b r19 = (qv.C11819b) r19     // Catch:{ all -> 0x027b }
            if (r9 != 0) goto L_0x0505
            r28 = r0
            java.lang.String r0 = "Unable to serialize the object"
            java.lang.String r0 = qv.C11818a.a(r0, r4)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x04ff
        L_0x04f5:
            r34 = r1
            r30 = r5
            r29 = r14
            r0 = r18
            goto L_0x057c
        L_0x04ff:
            java.lang.String r0 = qv.C11820c.a(r0)     // Catch:{ all -> 0x027b }
            r9 = r0
            goto L_0x0507
        L_0x0505:
            r28 = r0
        L_0x0507:
            if (r15 != 0) goto L_0x055b
            java.lang.Class r0 = r13.getClass()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x027b }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x027b }
            r34 = r1
            r30 = r5
            r29 = r14
            r1 = 2
            r14 = 0
            r15 = 36
            java.lang.String r5 = HJ.C15854t.s1(r0, r15, r14, r1, r14)     // Catch:{ all -> 0x027b }
            r15 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r15, r14, r1, r14)     // Catch:{ all -> 0x027b }
            int r1 = r5.length()     // Catch:{ all -> 0x027b }
            if (r1 != 0) goto L_0x052f
            goto L_0x0533
        L_0x052f:
            java.lang.String r0 = HJ.C15854t.P0(r5, r12)     // Catch:{ all -> 0x027b }
        L_0x0533:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x027b }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x027b }
            r5 = 1
            boolean r1 = HJ.C15854t.b0(r1, r11, r5)     // Catch:{ all -> 0x027b }
            if (r1 == 0) goto L_0x0545
            r1 = r26
            goto L_0x0547
        L_0x0545:
            r1 = r25
        L_0x0547:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r5.<init>()     // Catch:{ all -> 0x027b }
            r5.append(r1)     // Catch:{ all -> 0x027b }
            r5.append(r10)     // Catch:{ all -> 0x027b }
            r5.append(r0)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x027b }
            r15 = r0
            goto L_0x0561
        L_0x055b:
            r34 = r1
            r30 = r5
            r29 = r14
        L_0x0561:
            r22 = 0
            r20 = r6
            r21 = r15
            r23 = r4
            r24 = r9
            r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x027b }
            r1 = r34
            r0 = r28
            r14 = r29
            r5 = r30
            goto L_0x04db
        L_0x0578:
            r28 = r0
            goto L_0x04f5
        L_0x057c:
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r1 = r13.f89789i     // Catch:{ all -> 0x027b }
            r3.f89832c = r13     // Catch:{ all -> 0x027b }
            r3.f89833d = r2     // Catch:{ all -> 0x027b }
            r3.f89834e = r8     // Catch:{ all -> 0x027b }
            r3.f89835f = r7     // Catch:{ all -> 0x027b }
            r5 = r30
            r3.f89836g = r5     // Catch:{ all -> 0x027b }
            r3.f89837h = r4     // Catch:{ all -> 0x027b }
            r3.f89838i = r13     // Catch:{ all -> 0x027b }
            r3.f89839j = r13     // Catch:{ all -> 0x027b }
            r3.f89840k = r6     // Catch:{ all -> 0x027b }
            r3.f89841l = r9     // Catch:{ all -> 0x027b }
            r3.f89842m = r15     // Catch:{ all -> 0x027b }
            r2 = r29
            r3.f89843n = r2     // Catch:{ all -> 0x027b }
            r2 = r34
            r3.f89844o = r2     // Catch:{ all -> 0x027b }
            r3.f89845p = r0     // Catch:{ all -> 0x027b }
            r2 = r28
            r3.f89846q = r2     // Catch:{ all -> 0x027b }
            r2 = 0
            r3.f89847r = r2     // Catch:{ all -> 0x027b }
            r3.f89848s = r2     // Catch:{ all -> 0x027b }
            r3.f89849t = r2     // Catch:{ all -> 0x027b }
            r3.f89850u = r2     // Catch:{ all -> 0x027b }
            r3.f89851v = r2     // Catch:{ all -> 0x027b }
            r2 = 3
            r3.f89854y = r2     // Catch:{ all -> 0x027b }
            r2 = 0
            java.lang.Object r0 = r1.emit(r2, r3)     // Catch:{ all -> 0x027b }
            r1 = r27
            if (r0 != r1) goto L_0x0370
            return r1
        L_0x05bc:
            r0 = move-exception
            r1 = r4
            r10 = r19
            r13 = r33
            r4 = r0
            r7 = r8
            r5 = r9
            goto L_0x029d
        L_0x05c7:
            qv.e r6 = qv.e.ERROR     // Catch:{ all -> 0x027b }
            qv.d r9 = qv.d.f102012a     // Catch:{ all -> 0x027b }
            java.util.List r9 = r9.a()     // Catch:{ all -> 0x027b }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x027b }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x027b }
            r14.<init>()     // Catch:{ all -> 0x027b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x027b }
        L_0x05da:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x027b }
            if (r15 == 0) goto L_0x05fa
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x027b }
            r34 = r9
            r9 = r15
            qv.b r9 = (qv.C11819b) r9     // Catch:{ all -> 0x027b }
            r27 = r1
            r1 = 0
            boolean r9 = r9.b(r6, r1)     // Catch:{ all -> 0x027b }
            if (r9 == 0) goto L_0x05f5
            r14.add(r15)     // Catch:{ all -> 0x027b }
        L_0x05f5:
            r9 = r34
            r1 = r27
            goto L_0x05da
        L_0x05fa:
            r27 = r1
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x027b }
            r17 = r14
            r9 = 0
            r15 = 0
        L_0x0604:
            boolean r18 = r1.hasNext()     // Catch:{ all -> 0x027b }
            if (r18 == 0) goto L_0x06aa
            java.lang.Object r17 = r1.next()     // Catch:{ all -> 0x027b }
            r19 = r17
            qv.b r19 = (qv.C11819b) r19     // Catch:{ all -> 0x027b }
            if (r9 != 0) goto L_0x062f
            r18 = r0
            java.lang.String r0 = "Unable to load KillSwitchConfig from file"
            java.lang.String r0 = qv.C11818a.a(r0, r4)     // Catch:{ all -> 0x027b }
            if (r0 != 0) goto L_0x0629
        L_0x061e:
            r34 = r1
            r28 = r5
            r16 = r14
            r0 = r15
            r1 = r17
            goto L_0x06ae
        L_0x0629:
            java.lang.String r0 = qv.C11820c.a(r0)     // Catch:{ all -> 0x027b }
            r9 = r0
            goto L_0x0631
        L_0x062f:
            r18 = r0
        L_0x0631:
            if (r15 != 0) goto L_0x0686
            java.lang.Class r0 = r13.getClass()     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x027b }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x027b }
            r34 = r1
            r28 = r5
            r16 = r14
            r1 = 2
            r14 = 0
            r15 = 36
            java.lang.String r5 = HJ.C15854t.s1(r0, r15, r14, r1, r14)     // Catch:{ all -> 0x027b }
            r15 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r15, r14, r1, r14)     // Catch:{ all -> 0x027b }
            int r1 = r5.length()     // Catch:{ all -> 0x027b }
            if (r1 != 0) goto L_0x0659
            goto L_0x065d
        L_0x0659:
            java.lang.String r0 = HJ.C15854t.P0(r5, r12)     // Catch:{ all -> 0x027b }
        L_0x065d:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x027b }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x027b }
            r5 = 1
            boolean r1 = HJ.C15854t.b0(r1, r11, r5)     // Catch:{ all -> 0x027b }
            if (r1 == 0) goto L_0x066f
            r1 = r26
            goto L_0x0671
        L_0x066f:
            r1 = r25
        L_0x0671:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r14.<init>()     // Catch:{ all -> 0x027b }
            r14.append(r1)     // Catch:{ all -> 0x027b }
            r14.append(r10)     // Catch:{ all -> 0x027b }
            r14.append(r0)     // Catch:{ all -> 0x027b }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x027b }
            r1 = 36
            goto L_0x0692
        L_0x0686:
            r34 = r1
            r28 = r5
            r16 = r14
            r0 = r15
            r1 = 36
            r5 = 1
            r15 = 46
        L_0x0692:
            r22 = 0
            r20 = r6
            r21 = r0
            r23 = r4
            r24 = r9
            r19.a(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x027b }
            r1 = r34
            r15 = r0
            r14 = r16
            r0 = r18
            r5 = r28
            goto L_0x0604
        L_0x06aa:
            r18 = r0
            goto L_0x061e
        L_0x06ae:
            TJ.B<com.ingka.ikea.killswitch.model.KillSwitchConfig> r5 = r13.f89789i     // Catch:{ all -> 0x027b }
            r3.f89832c = r13     // Catch:{ all -> 0x027b }
            r3.f89833d = r2     // Catch:{ all -> 0x027b }
            r3.f89834e = r8     // Catch:{ all -> 0x027b }
            r3.f89835f = r7     // Catch:{ all -> 0x027b }
            r2 = r28
            r3.f89836g = r2     // Catch:{ all -> 0x027b }
            r3.f89837h = r4     // Catch:{ all -> 0x027b }
            r3.f89838i = r13     // Catch:{ all -> 0x027b }
            r3.f89839j = r13     // Catch:{ all -> 0x027b }
            r3.f89840k = r6     // Catch:{ all -> 0x027b }
            r3.f89841l = r9     // Catch:{ all -> 0x027b }
            r3.f89842m = r0     // Catch:{ all -> 0x027b }
            r0 = r16
            r3.f89843n = r0     // Catch:{ all -> 0x027b }
            r0 = r34
            r3.f89844o = r0     // Catch:{ all -> 0x027b }
            r3.f89845p = r1     // Catch:{ all -> 0x027b }
            r2 = r18
            r3.f89846q = r2     // Catch:{ all -> 0x027b }
            r1 = 0
            r3.f89847r = r1     // Catch:{ all -> 0x027b }
            r3.f89848s = r1     // Catch:{ all -> 0x027b }
            r3.f89849t = r1     // Catch:{ all -> 0x027b }
            r3.f89850u = r1     // Catch:{ all -> 0x027b }
            r3.f89851v = r1     // Catch:{ all -> 0x027b }
            r1 = 2
            r3.f89854y = r1     // Catch:{ all -> 0x027b }
            r1 = 0
            java.lang.Object r0 = r5.emit(r1, r3)     // Catch:{ all -> 0x027b }
            r2 = r27
            if (r0 != r2) goto L_0x06ee
            return r2
        L_0x06ee:
            r2 = r8
        L_0x06ef:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0077 }
            jI.C17416c.a(r2, r1)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x06f7:
            throw r1     // Catch:{ all -> 0x06f8 }
        L_0x06f8:
            r0 = move-exception
            r3 = r0
            jI.C17416c.a(r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.f.W(dI.e):java.lang.Object");
    }

    public final boolean X(KillSwitchConfig killSwitchConfig) {
        Throwable th2;
        KillSwitchConfig killSwitchConfig2 = killSwitchConfig;
        Class<f> cls = f.class;
        C17542s.j(killSwitchConfig2, "data");
        int i10 = 2;
        try {
            String b10 = this.f89786f.b(KillSwitchConfig.Companion.serializer(), killSwitchConfig2);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f89787g), C15838d.f135279b), 8192);
            try {
                bufferedWriter.write(b10);
                C16807N n10 = C16807N.f139792a;
                C17416c.a(bufferedWriter, (Throwable) null);
                return true;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                C17416c.a(bufferedWriter, th2);
                throw th4;
            }
        } catch (IOException e10) {
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
                    String a10 = C11818a.a("Unable to save file", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, e10, str);
                i10 = 2;
            }
            return false;
        } catch (q e11) {
            qv.e eVar2 = qv.e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("Unable to serialize KillSwitchConfig", e11);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, e11, str3);
            }
            return false;
        }
    }

    public void Y(boolean z10) {
        this.f89795o = z10;
    }

    public boolean a() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.G();
    }

    public boolean b() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.M();
    }

    public boolean c() {
        KillSwitchConfig value = this.f89789i.getValue();
        if (value != null) {
            return C17542s.e(value.x(), Boolean.TRUE);
        }
        return false;
    }

    public boolean d() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.h();
    }

    public boolean e() {
        KillSwitchConfig value = this.f89789i.getValue();
        if (value != null) {
            return C17542s.e(value.r(), Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a A[PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:19:0x0077, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Yu.f.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Yu.f$e r0 = (Yu.f.e) r0
            int r1 = r0.f89810h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89810h = r1
            goto L_0x0018
        L_0x0013:
            Yu.f$e r0 = new Yu.f$e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f89808f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89810h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r7 = r0.f89807e
            com.ingka.ikea.killswitch.model.KillSwitchConfig r7 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r7
            java.lang.Object r7 = r0.f89806d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f89805c
            Yu.f r7 = (Yu.f) r7
            XH.y.b(r1)
            goto L_0x007a
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f89806d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r3 = r0.f89805c
            Yu.f r3 = (Yu.f) r3
            XH.y.b(r1)
            goto L_0x0069
        L_0x004c:
            XH.y.b(r1)
            Il.a r1 = r6.f89783c
            java.lang.String r1 = r1.i()
            Il.a r3 = r6.f89783c
            java.lang.String r3 = r3.a()
            r0.f89805c = r6
            r0.f89806d = r7
            r0.f89810h = r5
            java.lang.Object r1 = r6.B(r1, r3, r5, r0)
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            r3 = r6
        L_0x0069:
            com.ingka.ikea.killswitch.model.KillSwitchConfig r1 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r1
            r0.f89805c = r3
            r0.f89806d = r7
            r0.f89807e = r1
            r0.f89810h = r4
            java.lang.Object r1 = r3.F(r1, r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yu.f.f(dI.e):java.lang.Object");
    }

    public boolean g() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.C();
    }

    public boolean h() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.F();
    }

    public boolean i() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.n();
    }

    public boolean j() {
        KillSwitchConfig value = this.f89789i.getValue();
        if (value != null) {
            return C17542s.e(value.v(), Boolean.TRUE);
        }
        return false;
    }

    public boolean k() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.i();
    }

    public boolean l() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.J();
    }

    public boolean m() {
        KillSwitchConfig value = this.f89789i.getValue();
        if (value != null) {
            return C17542s.e(value.w(), Boolean.TRUE);
        }
        return false;
    }

    public boolean n() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.L();
    }

    public C16532g<Boolean> o() {
        return new o(this.f89789i);
    }

    public C16532g<Boolean> p() {
        return this.f89794n;
    }

    public boolean q() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.D();
    }

    public boolean r() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.N();
    }

    public C16532g<Boolean> s() {
        return this.f89796p;
    }

    public void t() {
        F0 unused = C16314k.d(R(), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    public boolean u() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.K();
    }

    public boolean v() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.g();
    }

    public boolean w() {
        KillSwitchConfig value = this.f89789i.getValue();
        return value != null && value.y();
    }

    public C16519P<Boolean> x() {
        return this.f89792l;
    }

    public C16532g<Boolean> y() {
        return this.f89793m;
    }

    public C16532g<Boolean> z() {
        return this.f89798r;
    }
}
