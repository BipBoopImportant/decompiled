package com.google.firebase.perf.config;

import Ac.a;
import Fb.f;
import Fb.o;
import Ic.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.g;
import com.google.firebase.remoteconfig.c;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mc.C10036b;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final a logger = a.e();
    private final ConcurrentHashMap<String, n> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private C10036b<c> firebaseRemoteConfigProvider;

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.f(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), (com.google.firebase.remoteconfig.a) null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        o oVar;
        try {
            oVar = (o) f.l().j(o.class);
        } catch (IllegalStateException unused) {
            logger.a("Unable to get StartupTime instance.");
            oVar = null;
        }
        return oVar != null ? oVar.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private n getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        n nVar = this.allRcConfigMap.get(str);
        if (nVar.i() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", nVar.a(), str);
        return nVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.h());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().f(this.executor, new y(this)).d(this.executor, new z(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public g<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return g.a();
        }
        n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return g.a();
    }

    /* access modifiers changed from: protected */
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public g<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return g.a();
        }
        n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Double.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return g.a();
    }

    public g<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return g.a();
        }
        n remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return g.e(Long.valueOf(remoteConfigValue.b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.a().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.a(), str);
                }
            }
        }
        return g.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r5, T r6) {
        /*
            r4 = this;
            Ic.n r0 = r4.getRemoteConfigValue(r5)
            if (r0 == 0) goto L_0x0068
            boolean r1 = r6 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r0.d()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
        L_0x0012:
            r6 = r5
            goto L_0x0068
        L_0x0014:
            boolean r1 = r6 instanceof java.lang.Double     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0021
            double r1 = r0.c()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Double r5 = java.lang.Double.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x0021:
            boolean r1 = r6 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 != 0) goto L_0x0046
            boolean r1 = r6 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x002a
            goto L_0x0046
        L_0x002a:
            boolean r1 = r6 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0033
            java.lang.String r5 = r0.a()     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x0033:
            java.lang.String r1 = r0.a()     // Catch:{ IllegalArgumentException -> 0x004f }
            Ac.a r2 = logger     // Catch:{ IllegalArgumentException -> 0x0044 }
            java.lang.String r3 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ IllegalArgumentException -> 0x0044 }
            r2.b(r3, r6)     // Catch:{ IllegalArgumentException -> 0x0044 }
            r6 = r1
            goto L_0x0068
        L_0x0044:
            r6 = r1
            goto L_0x004f
        L_0x0046:
            long r1 = r0.b()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x004f:
            java.lang.String r1 = r0.a()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0068
            Ac.a r1 = logger
            java.lang.String r0 = r0.a()
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "Could not parse value: '%s' for key: '%s'."
            r1.b(r0, r5)
        L_0x0068:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public g<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return g.a();
        }
        n remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? g.e(remoteConfigValue.a()) : g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        C10036b<c> bVar;
        c cVar;
        if (!(this.firebaseRemoteConfig != null || (bVar = this.firebaseRemoteConfigProvider) == null || (cVar = bVar.get()) == null)) {
            this.firebaseRemoteConfig = cVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1 || this.firebaseRemoteConfig.i().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(C10036b<c> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    /* access modifiers changed from: protected */
    public void syncConfigValues(Map<String, n> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        d e10 = d.e();
        n nVar = this.allRcConfigMap.get(e10.c());
        if (nVar != null) {
            try {
                this.cache.n(e10.a(), nVar.d());
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.a("ExperimentTTID remote config flag does not exist.");
        }
    }

    RemoteConfigManager(x xVar, Executor executor2, com.google.firebase.remoteconfig.a aVar, long j10, long j11) {
        ConcurrentHashMap<String, n> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor2;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
