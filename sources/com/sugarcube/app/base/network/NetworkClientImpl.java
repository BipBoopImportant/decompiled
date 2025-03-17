package com.sugarcube.app.base.network;

import GK.C15804w;
import GK.z;
import QL.y;
import TL.C16557a;
import VE.C13760b;
import VK.C16697a;
import android.util.Log;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.squareup.moshi.t;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.api.NetworkAPIs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b\"\u0010'J$\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H@¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00100R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u00102\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b=\u0010;R\"\u0010@\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010,0,0>8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020,0B8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/sugarcube/app/base/network/NetworkClientImpl;", "Lcom/sugarcube/app/base/network/NetworkClient;", "LGK/w;", "hostAppInterceptor", "Lcom/sugarcube/app/base/network/TokenStoreV2;", "tokenStore", "LVE/b;", "networkConfig", "Lcom/squareup/moshi/t;", "moshi", "", "", "interceptors", "<init>", "(LGK/w;Lcom/sugarcube/app/base/network/TokenStoreV2;LVE/b;Lcom/squareup/moshi/t;Ljava/util/Map;)V", "LXH/N;", "createOrUpdateRetrofits", "()V", "tokenInterceptor", "LVK/a$a;", "level", "LGK/z;", "createOkHttpClient", "(LGK/w;LVK/a$a;)LGK/z;", "okHttpClient", "baseUrl", "LTL/a;", "converterFactory", "LQL/y;", "createRetrofit", "(LGK/z;Ljava/lang/String;LTL/a;)LQL/y;", "latestBaseURL", "()Ljava/lang/String;", "Lcom/sugarcube/core/network/api/NetworkAPIs;", "api", "()Lcom/sugarcube/core/network/api/NetworkAPIs;", "T", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "appPackageVersionCode", "", "outage", "Lcom/sugarcube/app/base/network/NetworkStatus;", "checkStatus", "(ILjava/lang/Boolean;LdI/e;)Ljava/lang/Object;", "LVE/b;", "Lcom/squareup/moshi/t;", "Ljava/util/Map;", "TAG", "Ljava/lang/String;", "currentBaseUrl", "Lcom/sugarcube/app/base/network/AuthInterceptor;", "authAwareInterceptor", "Lcom/sugarcube/app/base/network/AuthInterceptor;", "authAwareHttpClient", "LGK/z;", "authAwareRetrofit", "LQL/y;", "noAuthHttpClient", "noAuthRetrofit", "Landroidx/lifecycle/K;", "kotlin.jvm.PlatformType", "_networkStatus", "Landroidx/lifecycle/K;", "Landroidx/lifecycle/F;", "getNetworkStatus", "()Landroidx/lifecycle/F;", "networkStatus", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkClientImpl implements NetworkClient {
    public static final int $stable = 8;
    private final String TAG = AnyKt.SUGARCUBE_TAG;
    private final K<NetworkStatus> _networkStatus;
    private final z authAwareHttpClient;
    private final AuthInterceptor authAwareInterceptor;
    private y authAwareRetrofit;
    private String currentBaseUrl;
    private final Map<String, C15804w> interceptors;
    private final t moshi;
    private final C13760b networkConfig;
    private final z noAuthHttpClient;
    private y noAuthRetrofit;

    public NetworkClientImpl(C15804w wVar, TokenStoreV2 tokenStoreV2, C13760b bVar, t tVar, Map<String, C15804w> map) {
        C17542s.j(wVar, "hostAppInterceptor");
        C17542s.j(tokenStoreV2, "tokenStore");
        C17542s.j(bVar, "networkConfig");
        C17542s.j(tVar, "moshi");
        C17542s.j(map, "interceptors");
        this.networkConfig = bVar;
        this.moshi = tVar;
        this.interceptors = map;
        AuthInterceptor authInterceptor = new AuthInterceptor(tokenStoreV2, wVar);
        this.authAwareInterceptor = authInterceptor;
        this.authAwareHttpClient = createOkHttpClient(authInterceptor, bVar.b().d());
        this.noAuthHttpClient = createOkHttpClient((C15804w) null, bVar.b().d());
        this._networkStatus = new K<>(new NetworkStatus(false, (String) null, false, 7, (DefaultConstructorMarker) null));
        createOrUpdateRetrofits();
    }

    private final z createOkHttpClient(C15804w wVar, C16697a.C3418a aVar) {
        Log.d(AnyKt.SUGARCUBE_TAG, "NetworkClient.createOkHttpClient - " + aVar);
        z.a aVar2 = new z.a();
        C16697a aVar3 = new C16697a((C16697a.b) null, 1, (DefaultConstructorMarker) null);
        aVar3.b(aVar);
        z.a a10 = aVar2.a(aVar3);
        if (wVar != null) {
            a10.a(wVar);
        }
        for (C15804w a11 : this.interceptors.values()) {
            a10.a(a11);
        }
        return a10.c();
    }

    static /* synthetic */ z createOkHttpClient$default(NetworkClientImpl networkClientImpl, C15804w wVar, C16697a.C3418a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar = C16697a.C3418a.NONE;
        }
        return networkClientImpl.createOkHttpClient(wVar, aVar);
    }

    private final void createOrUpdateRetrofits() {
        String latestBaseURL = latestBaseURL();
        if (!C17542s.e(this.currentBaseUrl, latestBaseURL)) {
            String str = this.TAG;
            Log.d(str, "BaseUrl: " + latestBaseURL);
            this.currentBaseUrl = latestBaseURL;
            String str2 = latestBaseURL;
            this.authAwareRetrofit = createRetrofit$default(this, this.authAwareHttpClient, str2, (C16557a) null, 4, (Object) null);
            this.noAuthRetrofit = createRetrofit$default(this, this.noAuthHttpClient, str2, (C16557a) null, 4, (Object) null);
        }
    }

    private final y createRetrofit(z zVar, String str, C16557a aVar) {
        Log.d(AnyKt.SUGARCUBE_TAG, "NetworkClient.createRetrofit - " + str);
        if (aVar == null) {
            aVar = C16557a.g(this.moshi);
        }
        y e10 = new y.b().d(str).g(zVar).b(aVar).e();
        C17542s.i(e10, "build(...)");
        return e10;
    }

    static /* synthetic */ y createRetrofit$default(NetworkClientImpl networkClientImpl, z zVar, String str, C16557a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return networkClientImpl.createRetrofit(zVar, str, aVar);
    }

    public NetworkAPIs api() {
        return (NetworkAPIs) api(NetworkAPIs.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[Catch:{ Exception -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5 A[Catch:{ Exception -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object checkStatus(int r13, java.lang.Boolean r14, dI.C17164e<? super com.sugarcube.app.base.network.NetworkStatus> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.sugarcube.app.base.network.NetworkClientImpl$checkStatus$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.app.base.network.NetworkClientImpl$checkStatus$1 r0 = (com.sugarcube.app.base.network.NetworkClientImpl$checkStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.network.NetworkClientImpl$checkStatus$1 r0 = new com.sugarcube.app.base.network.NetworkClientImpl$checkStatus$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            java.lang.String r4 = "Sugarcube"
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r6) goto L_0x0041
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$3
            QL.y r14 = (QL.y) r14
            java.lang.Object r14 = r0.L$2
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.L$1
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r15 = r0.L$0
            com.sugarcube.app.base.network.NetworkClientImpl r15 = (com.sugarcube.app.base.network.NetworkClientImpl) r15
            XH.y.b(r1)     // Catch:{ Exception -> 0x003e }
            goto L_0x0074
        L_0x003e:
            r13 = move-exception
            goto L_0x00f0
        L_0x0041:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0049:
            XH.y.b(r1)
            QL.y r1 = r12.noAuthRetrofit     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0057
            java.lang.String r3 = "noAuthRetrofit"
            kotlin.jvm.internal.C17542s.z(r3)     // Catch:{ Exception -> 0x003e }
            r3 = r5
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            java.lang.Class<com.sugarcube.core.network.api.NetworkAPIs> r7 = com.sugarcube.core.network.api.NetworkAPIs.class
            java.lang.Object r3 = r3.b(r7)     // Catch:{ Exception -> 0x003e }
            com.sugarcube.core.network.api.NetworkAPIs r3 = (com.sugarcube.core.network.api.NetworkAPIs) r3     // Catch:{ Exception -> 0x003e }
            r0.L$0 = r12     // Catch:{ Exception -> 0x003e }
            r0.L$1 = r14     // Catch:{ Exception -> 0x003e }
            r0.L$2 = r15     // Catch:{ Exception -> 0x003e }
            r0.L$3 = r1     // Catch:{ Exception -> 0x003e }
            r0.I$0 = r13     // Catch:{ Exception -> 0x003e }
            r0.label = r6     // Catch:{ Exception -> 0x003e }
            java.lang.Object r1 = r3.getStatus(r0)     // Catch:{ Exception -> 0x003e }
            if (r1 != r2) goto L_0x0073
            return r2
        L_0x0073:
            r15 = r12
        L_0x0074:
            QL.x r1 = (QL.x) r1     // Catch:{ Exception -> 0x003e }
            java.lang.Object r0 = r1.a()     // Catch:{ Exception -> 0x003e }
            com.sugarcube.core.network.models.StatusResponse r0 = (com.sugarcube.core.network.models.StatusResponse) r0     // Catch:{ Exception -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = r0.getMinimumVersionShoppableAndroid()     // Catch:{ Exception -> 0x003e }
            java.lang.Integer r1 = HJ.C15854t.t(r1)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x008e
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x003e }
            goto L_0x008f
        L_0x008e:
            r1 = r2
        L_0x008f:
            boolean r3 = r0.getOutage()     // Catch:{ Exception -> 0x003e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e }
            r7.<init>()     // Catch:{ Exception -> 0x003e }
            java.lang.String r8 = "NetworkClient.checkStatus - outage="
            r7.append(r8)     // Catch:{ Exception -> 0x003e }
            r7.append(r3)     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = " ("
            r7.append(r3)     // Catch:{ Exception -> 0x003e }
            r7.append(r13)     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = " < "
            r7.append(r3)     // Catch:{ Exception -> 0x003e }
            r7.append(r1)     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = ")"
            r7.append(r3)     // Catch:{ Exception -> 0x003e }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x003e }
            android.util.Log.d(r4, r3)     // Catch:{ Exception -> 0x003e }
            com.sugarcube.app.base.network.NetworkStatus r3 = new com.sugarcube.app.base.network.NetworkStatus     // Catch:{ Exception -> 0x003e }
            if (r14 == 0) goto L_0x00c5
            boolean r14 = r14.booleanValue()     // Catch:{ Exception -> 0x003e }
            goto L_0x00c9
        L_0x00c5:
            boolean r14 = r0.getOutage()     // Catch:{ Exception -> 0x003e }
        L_0x00c9:
            java.lang.String r0 = r0.getStatus()     // Catch:{ Exception -> 0x003e }
            if (r13 >= r1) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r6 = r2
        L_0x00d1:
            r3.<init>(r14, r0, r6)     // Catch:{ Exception -> 0x003e }
            goto L_0x00ea
        L_0x00d5:
            com.sugarcube.app.base.network.NetworkStatus r3 = new com.sugarcube.app.base.network.NetworkStatus     // Catch:{ Exception -> 0x003e }
            int r13 = r1.b()     // Catch:{ Exception -> 0x003e }
            r14 = 502(0x1f6, float:7.03E-43)
            if (r13 != r14) goto L_0x00e1
            r7 = r6
            goto L_0x00e2
        L_0x00e1:
            r7 = r2
        L_0x00e2:
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x003e }
        L_0x00ea:
            androidx.lifecycle.K<com.sugarcube.app.base.network.NetworkStatus> r13 = r15._networkStatus     // Catch:{ Exception -> 0x003e }
            r13.postValue(r3)     // Catch:{ Exception -> 0x003e }
            return r3
        L_0x00f0:
            java.lang.String r13 = r13.getMessage()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "checkStatus exception "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.w(r4, r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.network.NetworkClientImpl.checkStatus(int, java.lang.Boolean, dI.e):java.lang.Object");
    }

    public F<NetworkStatus> getNetworkStatus() {
        return this._networkStatus;
    }

    public String latestBaseURL() {
        return this.networkConfig.d();
    }

    public <T> T api(Class<T> cls) {
        C17542s.j(cls, "clazz");
        createOrUpdateRetrofits();
        y yVar = this.authAwareRetrofit;
        if (yVar == null) {
            C17542s.z("authAwareRetrofit");
            yVar = null;
        }
        return yVar.b(cls);
    }
}
