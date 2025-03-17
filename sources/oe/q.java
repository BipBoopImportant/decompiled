package OE;

import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import YE.C13867a;
import YE.C13868b;
import YE.e;
import YH.g0;
import android.content.Context;
import android.util.Log;
import com.squareup.picasso.t;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.DeviceRegistration;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.IConfig;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001\u001dBc\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b!\u00109R$\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020;8\u0006@BX\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020;8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0014\u0010F\u001a\u00020C8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020C8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bG\u0010ER\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020;0I8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020C8VX\u0005¢\u0006\u0006\u001a\u0004\bM\u0010ER\u0014\u0010R\u001a\u00020O8VX\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"LOE/q;", "Lcom/sugarcube/app/base/external/config/IConfig;", "Landroid/content/Context;", "appContext", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "LOE/e;", "installationConfig", "LOE/a;", "appEnvironment", "LYE/a;", "eventLog", "Lcom/sugarcube/app/base/data/user/DeviceRegistration;", "deviceRegistration", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "analytics", "<init>", "(Landroid/content/Context;Lcom/sugarcube/app/base/external/config/a;LOE/e;LOE/a;LYE/a;Lcom/sugarcube/app/base/data/user/DeviceRegistration;Lcom/sugarcube/app/base/data/user/UserRepo;Lcom/sugarcube/app/base/data/feature/ConfigRepository;Lcom/sugarcube/app/base/data/AnalyticsManager;Lcom/sugarcube/app/base/DeviceCompatibility;Lcom/sugarcube/app/base/data/analytics/Analytics;)V", "LXH/N;", "d", "()V", "a", "Landroid/content/Context;", "b", "Lcom/sugarcube/app/base/external/config/a;", "c", "LOE/e;", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "e", "Lcom/sugarcube/app/base/DeviceCompatibility;", "f", "Lcom/sugarcube/app/base/data/analytics/Analytics;", "()Lcom/sugarcube/app/base/data/analytics/Analytics;", "", "", "g", "Ljava/util/Set;", "registeredRepos", "LQJ/Q;", "h", "LQJ/Q;", "appScope", "LQJ/M;", "i", "LQJ/M;", "ioDispatcher", "Lcom/squareup/picasso/t;", "j", "Lcom/squareup/picasso/t;", "()Lcom/squareup/picasso/t;", "picasso", "", "value", "k", "Z", "isInitialized", "()Z", "getDebug", "debug", "", "getCountry", "()Ljava/lang/String;", "country", "getLanguage", "language", "LTJ/g;", "getTrackingEnabledFlow", "()LTJ/g;", "trackingEnabledFlow", "getRegion", "region", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "l", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements IConfig {

    /* renamed from: l  reason: collision with root package name */
    public static final a f113515l = new a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f113516m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f113517a;

    /* renamed from: b  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f113518b;

    /* renamed from: c  reason: collision with root package name */
    private final C13313e f113519c;

    /* renamed from: d  reason: collision with root package name */
    private final AnalyticsManager f113520d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final DeviceCompatibility f113521e;

    /* renamed from: f  reason: collision with root package name */
    private final Analytics f113522f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Object> f113523g;

    /* renamed from: h  reason: collision with root package name */
    private final Q f113524h;

    /* renamed from: i  reason: collision with root package name */
    private final M f113525i;

    /* renamed from: j  reason: collision with root package name */
    private final t f113526j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f113527k;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010'\u001a\u00020&8\u0006XT¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0006XT¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0006XT¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006+"}, d2 = {"LOE/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TAG_EVENT_LOG", "ADD_TO_CART", "COUNTRY_US", "COUNTRY_CANADA", "COUNTRY_GREAT_BRITAIN", "COUNTRY_IRELAND", "COUNTRY_SPAIN", "COUNTRY_GERMANY", "COUNTRY_FRANCE", "COUNTRY_NETHERLANDS", "COUNTRY_SWEDEN", "COUNTRY_DENMARK", "COUNTRY_JAPAN", "COUNTRY_KOREA", "COUNTRY_AUSTRALIA", "COUNTRY_POLAND", "COUNTRY_ITALY", "COUNTRY_AUSTRIA", "COUNTRY_SWITZERLAND", "COUNTRY_BELGIUM", "COUNTRY_FINLAND", "COUNTRY_PORTUGAL", "COUNTRY_NORWAY", "COUNTRY_CZECH_REPUBLIC", "COUNTRY_HUNGARY", "COUNTRY_SLOVAKIA", "COUNTRY_ROMANIA", "COUNTRY_CROATIA", "COUNTRY_SERBIA", "COUNTRY_SLOVENIA", "COUNTRY_INDIA", "", "MAX_IMAGE_WIDTH_UW", "I", "MAX_IMAGE_WIDTH", "DEFAULT_CAPTURE_PROCESSING_TIME", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.Sugarcube$initialize$1", f = "Sugarcube.kt", l = {95}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f113529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f113529d = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f113529d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113528c;
            if (i10 == 0) {
                y.b(obj);
                DeviceCompatibility a10 = this.f113529d.f113521e;
                this.f113528c = 1;
                if (a10.updateCompatibility(this) == f10) {
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

    public q(Context context, com.sugarcube.app.base.external.config.a aVar, C13313e eVar, C13309a aVar2, C13867a aVar3, DeviceRegistration deviceRegistration, UserRepo userRepo, ConfigRepository configRepository, AnalyticsManager analyticsManager, DeviceCompatibility deviceCompatibility, Analytics analytics) {
        C17542s.j(context, "appContext");
        C17542s.j(aVar, "appConfig");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(aVar2, "appEnvironment");
        C17542s.j(aVar3, "eventLog");
        C17542s.j(deviceRegistration, "deviceRegistration");
        C17542s.j(userRepo, "userRepo");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(analyticsManager, "analyticsManager");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(analytics, "analytics");
        this.f113517a = context;
        this.f113518b = aVar;
        this.f113519c = eVar;
        this.f113520d = analyticsManager;
        this.f113521e = deviceCompatibility;
        this.f113522f = analytics;
        this.f113523g = g0.f(deviceRegistration, analyticsManager, userRepo, configRepository);
        this.f113524h = aVar2.b();
        this.f113525i = aVar2.e();
        t h10 = t.h();
        eVar.m();
        C17542s.i(h10, "also(...)");
        this.f113526j = h10;
        C13868b bVar = C13868b.f118106a;
        bVar.c(aVar3);
        String str = eVar.e() + " [" + eVar.b() + ":" + eVar.c() + "] init - " + eVar.h() + " - [" + eVar.k() + "] - " + eVar.j() + " - region=" + aVar.getRegion() + " - tracking=" + aVar.getTrackingEnabledFlow().getValue() + " - [" + s.f(s.e(context)) + "][" + s.g(s.e(context)) + "]";
        Log.i(AnyKt.SUGARCUBE_TAG, str);
        bVar.b(str, e.Meta);
    }

    public final Analytics b() {
        return this.f113522f;
    }

    public final t c() {
        return this.f113526j;
    }

    public final void d() {
        this.f113527k = true;
        this.f113520d.initializeTracking();
        String str = this.f113519c.e() + " [" + this.f113519c.b() + "] initialize - region=" + this.f113518b.getRegion() + " - tracking=" + this.f113518b.getTrackingEnabledFlow().getValue() + " ";
        Log.i(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, e.Meta);
        F0 unused = C16314k.d(this.f113524h, this.f113525i, (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    public String getCountry() {
        return this.f113518b.getCountry();
    }

    public boolean getDebug() {
        return this.f113518b.getDebug();
    }

    public String getLanguage() {
        return this.f113518b.getLanguage();
    }

    public Locale getLocale() {
        return this.f113518b.getLocale();
    }

    public String getRegion() {
        return this.f113518b.getRegion();
    }

    public C16532g<Boolean> getTrackingEnabledFlow() {
        return this.f113518b.getTrackingEnabledFlow();
    }
}
