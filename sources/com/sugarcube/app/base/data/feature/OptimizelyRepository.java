package com.sugarcube.app.base.data.feature;

import HE.C13003h;
import HJ.C15854t;
import OE.C13309a;
import OE.C13313e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.util.Log;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import xE.C15211a;
import xE.C15216f;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\u00020\u00132\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011H@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0018H@¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u001e\u0012\f\u0012\n  *\u0004\u0018\u00010\u00190\u0019\u0012\f\u0012\n  *\u0004\u0018\u00010!0!0\u001fH\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/sugarcube/app/base/data/feature/OptimizelyRepository;", "", "LOE/a;", "appEnvironment", "LxE/f;", "optimizelyManager", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "LOE/e;", "installationConfig", "Lcom/sugarcube/app/base/data/user/UserRepo;", "userRepo", "<init>", "(LOE/a;LxE/f;Lcom/sugarcube/app/base/external/config/a;LOE/e;Lcom/sugarcube/app/base/data/user/UserRepo;)V", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "LXH/N;", "block", "LQJ/F0;", "launchInBackground", "(LnI/p;)LQJ/F0;", "initialize", "(LdI/e;)Ljava/lang/Object;", "", "", "buildAttributes", "Ljava/io/File;", "baseDir", "loadUserId", "(Ljava/io/File;)Ljava/lang/String;", "", "kotlin.jvm.PlatformType", "LHE/h;", "featuresMap$base_release", "()Ljava/util/Map;", "featuresMap", "remoteFeatureKey", "getFeature", "(Ljava/lang/String;)LHE/h;", "", "isFeatureEnabled", "(Ljava/lang/String;)Z", "remoteVariableKey", "", "getFeatureVariableInteger", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "", "getFeatureVariableDouble", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Double;", "getFeatureVariableString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LOE/a;", "LxE/f;", "Lcom/sugarcube/app/base/external/config/a;", "LOE/e;", "Lcom/sugarcube/app/base/data/user/UserRepo;", "LTJ/A;", "_initialized", "LTJ/A;", "LTJ/F;", "initialized", "LTJ/F;", "getInitialized", "()LTJ/F;", "userId", "Ljava/lang/String;", "userAttributes", "Ljava/util/Map;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OptimizelyRepository {
    public static final int $stable = 8;
    private static final String ATTRIBUTE_APP_NAME = "AppName";
    private static final String ATTRIBUTE_APP_VERSION = "AppVersion";
    private static final String ATTRIBUTE_APP_VERSION_CODE = "AppVersionCode";
    private static final String ATTRIBUTE_GEOMAGICAL_USER = "GeomagicalUser";
    private static final String ATTRIBUTE_IKEA_USER = "IKEAUser";
    private static final String ATTRIBUTE_LANGUAGE = "Language";
    private static final String ATTRIBUTE_LOGGED_IN = "LoggedIn";
    private static final String ATTRIBUTE_MANUFACTURER = "Manufacturer";
    private static final String ATTRIBUTE_MODEL = "Model";
    private static final String ATTRIBUTE_OS = "OS";
    private static final String ATTRIBUTE_PLATFORM = "Platform";
    private static final String ATTRIBUTE_REGION = "Region";
    private static final String ATTRIBUTE_SDK_INT = "SDK_INT";
    private static final String ATTRIBUTE_SOC_MANUFACTURER = "ManufacturerSOC";
    private static final String ATTRIBUTE_SOC_MODEL = "ModelSOC";
    private static final String ATTRIBUTE_TRACKING_ENABLED = "TrackingEnabled";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "Optimizely";
    /* access modifiers changed from: private */
    public final C16504A<C16807N> _initialized;
    private final a appConfig;
    private final C13309a appEnvironment;
    private final C16509F<C16807N> initialized;
    private final C13313e installationConfig;
    private final C15216f optimizelyManager;
    /* access modifiers changed from: private */
    public Map<String, Object> userAttributes = ((Map) C16312j.b((C17168i) null, new OptimizelyRepository$userAttributes$1(this, (C17164e<? super OptimizelyRepository$userAttributes$1>) null), 1, (Object) null));
    private String userId;
    private final UserRepo userRepo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.data.feature.OptimizelyRepository$1", f = "OptimizelyRepository.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.data.feature.OptimizelyRepository$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
        int label;
        final /* synthetic */ OptimizelyRepository this$0;

        {
            this.this$0 = r1;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new AnonymousClass1(this.this$0, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((AnonymousClass1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.label;
            if (i10 == 0) {
                y.b(obj);
                OptimizelyRepository optimizelyRepository = this.this$0;
                this.label = 1;
                if (optimizelyRepository.initialize(this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/data/feature/OptimizelyRepository$Companion;", "", "<init>", "()V", "TAG", "", "ATTRIBUTE_PLATFORM", "ATTRIBUTE_MANUFACTURER", "ATTRIBUTE_MODEL", "ATTRIBUTE_OS", "ATTRIBUTE_APP_VERSION", "ATTRIBUTE_APP_VERSION_CODE", "ATTRIBUTE_APP_NAME", "ATTRIBUTE_LANGUAGE", "ATTRIBUTE_REGION", "ATTRIBUTE_TRACKING_ENABLED", "ATTRIBUTE_SOC_MANUFACTURER", "ATTRIBUTE_SOC_MODEL", "ATTRIBUTE_LOGGED_IN", "ATTRIBUTE_GEOMAGICAL_USER", "ATTRIBUTE_IKEA_USER", "ATTRIBUTE_SDK_INT", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OptimizelyRepository(C13309a aVar, C15216f fVar, a aVar2, C13313e eVar, UserRepo userRepo2) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(fVar, "optimizelyManager");
        C17542s.j(aVar2, "appConfig");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(userRepo2, "userRepo");
        this.appEnvironment = aVar;
        this.optimizelyManager = fVar;
        this.appConfig = aVar2;
        this.installationConfig = eVar;
        this.userRepo = userRepo2;
        C16504A<C16807N> b10 = C16511H.b(1, 0, (C16428d) null, 6, (Object) null);
        this._initialized = b10;
        this.initialized = C16534i.b(b10);
        this.userId = loadUserId(aVar.c());
        launchInBackground(new AnonymousClass1(this, (C17164e<? super AnonymousClass1>) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0160, code lost:
        if (HJ.C15854t.G(r1, "@ikea.com", false, 2, (java.lang.Object) null) != false) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildAttributes(dI.C17164e<? super java.util.Map<java.lang.String, java.lang.Object>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.data.feature.OptimizelyRepository$buildAttributes$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.sugarcube.app.base.data.feature.OptimizelyRepository$buildAttributes$1 r0 = (com.sugarcube.app.base.data.feature.OptimizelyRepository$buildAttributes$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.feature.OptimizelyRepository$buildAttributes$1 r0 = new com.sugarcube.app.base.data.feature.OptimizelyRepository$buildAttributes$1
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r12 = r0.L$3
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r2 = r0.L$2
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.L$1
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r0 = r0.L$0
            com.sugarcube.app.base.data.feature.OptimizelyRepository r0 = (com.sugarcube.app.base.data.feature.OptimizelyRepository) r0
            XH.y.b(r1)
            goto L_0x00f6
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0043:
            XH.y.b(r1)
            java.lang.String r1 = "Platform"
            java.lang.String r3 = "Android"
            XH.v r1 = XH.C16796C.a(r1, r3)
            java.lang.String r3 = "Manufacturer"
            java.lang.String r6 = android.os.Build.MANUFACTURER
            XH.v r3 = XH.C16796C.a(r3, r6)
            java.lang.String r6 = "Model"
            java.lang.String r7 = android.os.Build.MODEL
            XH.v r6 = XH.C16796C.a(r6, r7)
            java.lang.String r7 = "OS"
            java.lang.String r8 = android.os.Build.VERSION.RELEASE
            XH.v r7 = XH.C16796C.a(r7, r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r8)
            java.lang.String r10 = "SDK_INT"
            XH.v r9 = XH.C16796C.a(r10, r9)
            XH.v[] r1 = new XH.v[]{r1, r3, r6, r7, r9}
            java.util.Map r1 = YH.X.p(r1)
            OE.e r3 = r11.installationConfig
            java.lang.String r3 = r3.d()
            java.lang.String r6 = "AppVersion"
            r1.put(r6, r3)
            OE.e r3 = r11.installationConfig
            int r3 = r3.c()
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.b.e(r3)
            java.lang.String r6 = "AppVersionCode"
            r1.put(r6, r3)
            OE.e r3 = r11.installationConfig
            java.lang.String r3 = r3.b()
            java.lang.String r6 = "AppName"
            r1.put(r6, r3)
            com.sugarcube.app.base.external.config.a r3 = r11.appConfig
            java.lang.String r3 = r3.getLanguage()
            java.lang.String r6 = "Language"
            r1.put(r6, r3)
            com.sugarcube.app.base.external.config.a r3 = r11.appConfig
            java.lang.String r3 = r3.getCountry()
            java.lang.String r6 = "Region"
            r1.put(r6, r3)
            com.sugarcube.app.base.external.config.a r3 = r11.appConfig
            TJ.P r3 = r3.getTrackingEnabledFlow()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r6 = "TrackingEnabled"
            r1.put(r6, r3)
            r3 = 31
            if (r8 < r3) goto L_0x00da
            java.lang.String r3 = "ManufacturerSOC"
            java.lang.String r6 = android.os.Build.SOC_MANUFACTURER
            r1.put(r3, r6)
            java.lang.String r3 = "ModelSOC"
            java.lang.String r6 = android.os.Build.SOC_MODEL
            r1.put(r3, r6)
        L_0x00da:
            com.sugarcube.app.base.data.user.UserRepo r3 = r11.userRepo
            TJ.P r3 = r3.getUser()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r1
            r0.L$3 = r1
            r0.I$0 = r5
            r0.label = r4
            java.lang.Object r12 = TJ.C16534i.D(r3, r0)
            if (r12 != r2) goto L_0x00f3
            return r2
        L_0x00f3:
            r2 = r1
            r1 = r12
            r12 = r2
        L_0x00f6:
            com.sugarcube.core.network.models.LoggedInUser r1 = (com.sugarcube.core.network.models.LoggedInUser) r1
            if (r1 == 0) goto L_0x0102
            boolean r0 = r1.isLoggedIn()
            if (r0 != r4) goto L_0x0102
            r0 = r4
            goto L_0x0103
        L_0x0102:
            r0 = r5
        L_0x0103:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            java.lang.String r3 = "LoggedIn"
            r12.put(r3, r0)
            java.lang.String r0 = "toLowerCase(...)"
            r3 = 0
            r6 = 2
            if (r1 == 0) goto L_0x012d
            java.lang.String r7 = r1.getEmail()
            if (r7 == 0) goto L_0x012d
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            kotlin.jvm.internal.C17542s.i(r7, r0)
            if (r7 == 0) goto L_0x012d
            java.lang.String r8 = "@geomagical.com"
            boolean r7 = HJ.C15854t.G(r7, r8, r5, r6, r3)
            if (r7 != r4) goto L_0x012d
            r7 = r4
            goto L_0x012e
        L_0x012d:
            r7 = r5
        L_0x012e:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            java.lang.String r8 = "GeomagicalUser"
            r12.put(r8, r7)
            if (r1 == 0) goto L_0x0163
            java.lang.String r1 = r1.getEmail()
            if (r1 == 0) goto L_0x0163
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r7)
            kotlin.jvm.internal.C17542s.i(r1, r0)
            if (r1 == 0) goto L_0x0163
            java.lang.String r0 = "@ingka.ikea.com"
            boolean r0 = HJ.C15854t.G(r1, r0, r5, r6, r3)
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "@ingka.com"
            boolean r0 = HJ.C15854t.G(r1, r0, r5, r6, r3)
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "@ikea.com"
            boolean r0 = HJ.C15854t.G(r1, r0, r5, r6, r3)
            if (r0 == 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r4 = r5
        L_0x0164:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r4)
            java.lang.String r1 = "IKEAUser"
            r12.put(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.feature.OptimizelyRepository.buildAttributes(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object initialize(C17164e<? super C16807N> eVar) {
        this.optimizelyManager.o(this.appEnvironment.a(), (Integer) null, new b(this));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void initialize$lambda$0(OptimizelyRepository optimizelyRepository, C15211a aVar) {
        optimizelyRepository.launchInBackground(new OptimizelyRepository$initialize$2$1(optimizelyRepository, (C17164e<? super OptimizelyRepository$initialize$2$1>) null));
    }

    private final F0 launchInBackground(p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        return C16314k.d(this.appEnvironment.b(), this.appEnvironment.e(), (T) null, pVar, 2, (Object) null);
    }

    private final String loadUserId(File file) {
        String str;
        File file2 = new File(file, "sc_uuid.txt");
        try {
            str = C15854t.z1(C17423j.i(file2, (Charset) null, 1, (Object) null)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        if (str.length() == 0) {
            str = UUID.randomUUID().toString();
            try {
                C17423j.l(file2, str, (Charset) null, 2, (Object) null);
                Log.d(TAG, "persistent id created");
            } catch (Throwable unused2) {
                Log.d(TAG, "not able to save persistent id");
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, HE.C13003h> featuresMap$base_release() {
        /*
            r1 = this;
            xE.f r0 = r1.optimizelyManager
            xE.a r0 = r0.n()
            HE.c r0 = r0.f()
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.e()
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.Map r0 = YH.X.j()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.feature.OptimizelyRepository.featuresMap$base_release():java.util.Map");
    }

    public final C13003h getFeature(String str) {
        C17542s.j(str, "remoteFeatureKey");
        return featuresMap$base_release().get(str);
    }

    public final Double getFeatureVariableDouble(String str, String str2) {
        C17542s.j(str, "remoteFeatureKey");
        C17542s.j(str2, "remoteVariableKey");
        return this.optimizelyManager.n().b(str, str2, this.userId, this.userAttributes);
    }

    public final Integer getFeatureVariableInteger(String str, String str2) {
        C17542s.j(str, "remoteFeatureKey");
        C17542s.j(str2, "remoteVariableKey");
        return this.optimizelyManager.n().c(str, str2, this.userId, this.userAttributes);
    }

    public final String getFeatureVariableString(String str, String str2) {
        C17542s.j(str, "remoteFeatureKey");
        C17542s.j(str2, "remoteVariableKey");
        return this.optimizelyManager.n().d(str, str2, this.userId, this.userAttributes);
    }

    public final C16509F<C16807N> getInitialized() {
        return this.initialized;
    }

    public final boolean isFeatureEnabled(String str) {
        C17542s.j(str, "remoteFeatureKey");
        Boolean h10 = this.optimizelyManager.n().h(str, this.userId, this.userAttributes);
        C17542s.i(h10, "isFeatureEnabled(...)");
        return h10.booleanValue();
    }
}
