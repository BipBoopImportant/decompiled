package com.sugarcube.app.base.data;

import OE.C13313e;
import XH.C16796C;
import XH.v;
import YH.X;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SizeF;
import android.view.WindowManager;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.core.analytics.IAnalyticsEngine;
import com.sugarcube.core.analytics.entities.LoggedInUser;
import com.sugarcube.core.logger.AnyKt;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oE.C14886i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/sugarcube/app/base/data/AnalyticsMixpanelEngine;", "Lcom/sugarcube/core/analytics/IAnalyticsEngine;", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "LOE/e;", "installationConfig", "Landroid/content/Context;", "appContext", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/app/base/external/config/a;LOE/e;Landroid/content/Context;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "Lcom/sugarcube/core/analytics/entities/LoggedInUser;", "user", "", "isNew", "LXH/N;", "associateUser", "(Lcom/sugarcube/core/analytics/entities/LoggedInUser;Z)V", "disassociateUser", "()V", "", "eventName", "", "", "properties", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/sugarcube/app/base/external/config/a;", "LOE/e;", "Landroid/content/Context;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "", "screenDiagonal", "F", "superProperties", "Ljava/util/Map;", "globalRendingSessionId", "Ljava/lang/String;", "LoE/i;", "mixpanel", "LoE/i;", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsMixpanelEngine implements IAnalyticsEngine {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String mixpanelToken = "29a3c10bc553189c0e5b6c5dcded291a";
    public static final String mixpanelTokenDev = "a7a560b7ce99351f21ced5f60aa7d965";
    private final a appConfig;
    private final Context appContext;
    private final ConfigRepository configRepository;
    private final String globalRendingSessionId;
    private final C13313e installationConfig;
    private final C14886i mixpanel;
    private final float screenDiagonal;
    private final Map<String, Object> superProperties;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/data/AnalyticsMixpanelEngine$Companion;", "", "<init>", "()V", "mixpanelToken", "", "mixpanelTokenDev", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AnalyticsMixpanelEngine(a aVar, C13313e eVar, Context context, ConfigRepository configRepository2) {
        float f10;
        SizeF sizeF;
        C17542s.j(aVar, "appConfig");
        C17542s.j(eVar, "installationConfig");
        C17542s.j(context, "appContext");
        C17542s.j(configRepository2, "configRepository");
        this.appConfig = aVar;
        this.installationConfig = eVar;
        this.appContext = context;
        this.configRepository = configRepository2;
        try {
            Object systemService = context.getSystemService("window");
            C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager) systemService;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (Build.VERSION.SDK_INT >= 30) {
                Rect a10 = windowManager.getCurrentWindowMetrics().getBounds();
                C17542s.i(a10, "getBounds(...)");
                int i10 = a10.right;
                int i11 = a10.left;
                float f11 = displayMetrics.xdpi;
                Log.d(AnyKt.SUGARCUBE_TAG, "w=" + i10 + " - " + i11 + " " + f11);
                sizeF = new SizeF((float) a10.width(), (float) a10.height());
            } else {
                sizeF = new SizeF((float) displayMetrics.widthPixels, (float) displayMetrics.heightPixels);
            }
            float width = sizeF.getWidth() / displayMetrics.xdpi;
            float height = sizeF.getHeight() / displayMetrics.ydpi;
            float f12 = (float) 100;
            f10 = ((float) Math.rint((double) (((float) Math.sqrt((double) ((width * width) + (height * height)))) * f12))) / f12;
        } catch (Throwable unused) {
            f10 = 0.0f;
        }
        this.screenDiagonal = f10;
        Map<String, Object> x10 = X.x(X.l(C16796C.a("AppVersion", this.installationConfig.h()), C16796C.a("AppEnvironment", this.installationConfig.a()), C16796C.a("SugarcubeLibrary", this.installationConfig.g()), C16796C.a("Application", this.installationConfig.e()), C16796C.a("$screen_size", Float.valueOf(f10))));
        this.superProperties = x10;
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        this.globalRendingSessionId = uuid;
        C14886i r10 = C14886i.r(this.appContext, mixpanelToken);
        r10.K(x10);
        if (this.appConfig.getTrackingEnabledFlow().getValue().booleanValue()) {
            Log.i(AnyKt.SUGARCUBE_TAG, "track: Mixpanel.getInstance " + x10);
        } else {
            Log.i(AnyKt.SUGARCUBE_TAG, "disabled track: Mixpanel.getInstance " + x10);
        }
        C17542s.i(r10, "also(...)");
        this.mixpanel = r10;
    }

    public void associateUser(LoggedInUser loggedInUser, boolean z10) {
        C17542s.j(loggedInUser, "user");
        String partyUid = loggedInUser.getPartyUid();
        if (partyUid == null) {
            partyUid = String.valueOf(loggedInUser.getWid());
        }
        if (z10) {
            this.mixpanel.h(partyUid, (String) null);
        }
        this.mixpanel.y(partyUid);
        C14886i.d t10 = this.mixpanel.t();
        v a10 = C16796C.a("UserId", partyUid);
        v a11 = C16796C.a("User ID", partyUid);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
        HashMap l10 = X.l(a10, a11, C16796C.a("LastLogin", dateTimeFormatter.format(Instant.now())), C16796C.a("AppVersion", this.installationConfig.h()), C16796C.a("AppEnvironment", this.installationConfig.a()), C16796C.a("Application", this.installationConfig.e()), C16796C.a("LoginAuthenticationModel", loggedInUser.getAuthMethod().toString()), C16796C.a("UserEmail", loggedInUser.getEmail()));
        if (z10) {
            l10.put("SignupDate", dateTimeFormatter.format(Instant.now()));
        }
        t10.c(X.x(l10));
    }

    public void disassociateUser() {
        this.mixpanel.L();
        this.mixpanel.K(this.superProperties);
    }

    public void track(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventName");
        C17542s.j(map, "properties");
        Map<String, ? extends Object> z10 = X.z(map);
        z10.put("User ID", this.mixpanel.q());
        z10.put("globalRenderingSessionId", this.globalRendingSessionId);
        z10.put("OptimizelyFlags", this.configRepository.getEnabledFeatures());
        this.mixpanel.R(str, z10);
    }

    public boolean trackAlways() {
        return IAnalyticsEngine.DefaultImpls.trackAlways(this);
    }
}
