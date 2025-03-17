package com.sugarcube.app.base.data.source.remote;

import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.SmartaRepository;
import com.sugarcube.core.network.api.SmartaApiService;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/app/base/data/source/remote/SmartaRepositoryImpl;", "Lcom/sugarcube/app/base/data/source/SmartaRepository;", "Lcom/sugarcube/core/network/api/SmartaApiService;", "smartaAPI", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "<init>", "(Lcom/sugarcube/core/network/api/SmartaApiService;Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "smartaPlacementRequest", "Lcom/sugarcube/app/base/data/Result;", "Lcom/sugarcube/core/network/models/SmartaPlacementResponse;", "postSmartaPlacement", "(Lcom/sugarcube/core/network/models/SmartaPlacementRequest;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/core/network/api/SmartaApiService;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaRepositoryImpl implements SmartaRepository {
    public static final int $stable = 8;
    private final ConfigRepository configRepository;
    /* access modifiers changed from: private */
    public final SmartaApiService smartaAPI;

    public SmartaRepositoryImpl(SmartaApiService smartaApiService, ConfigRepository configRepository2) {
        C17542s.j(smartaApiService, "smartaAPI");
        C17542s.j(configRepository2, "configRepository");
        this.smartaAPI = smartaApiService;
        this.configRepository = configRepository2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: dI.e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.SmartaPlacementResponse>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac A[Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object postSmartaPlacement(com.sugarcube.core.network.models.SmartaPlacementRequest r10, dI.C17164e<? super com.sugarcube.app.base.data.Result<com.sugarcube.core.network.models.SmartaPlacementResponse>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$1 r0 = (com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$1 r0 = new com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L_0x005b
            if (r3 == r4) goto L_0x004a
            if (r3 != r5) goto L_0x0042
            java.lang.Object r10 = r0.L$2
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.L$1
            com.sugarcube.core.network.models.SmartaPlacementRequest r10 = (com.sugarcube.core.network.models.SmartaPlacementRequest) r10
            java.lang.Object r10 = r0.L$0
            com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl r10 = (com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl) r10
            XH.y.b(r1)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            goto L_0x008e
        L_0x0039:
            r10 = move-exception
            goto L_0x00d8
        L_0x003c:
            r10 = move-exception
            goto L_0x00e6
        L_0x003f:
            r10 = move-exception
            goto L_0x00ec
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            java.lang.Object r10 = r0.L$2
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.L$1
            com.sugarcube.core.network.models.SmartaPlacementRequest r10 = (com.sugarcube.core.network.models.SmartaPlacementRequest) r10
            java.lang.Object r3 = r0.L$0
            com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl r3 = (com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl) r3
            XH.y.b(r1)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            goto L_0x0072
        L_0x005b:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r9.configRepository     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            com.sugarcube.app.base.data.feature.ConfigItems$SmartPlacementTimeoutLimit r3 = com.sugarcube.app.base.data.feature.ConfigItems.SmartPlacementTimeoutLimit.INSTANCE     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$0 = r9     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$1 = r10     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$2 = r11     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.label = r4     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.Object r1 = r1.get(r3, r0)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            if (r1 != r2) goto L_0x0071
            return r2
        L_0x0071:
            r3 = r9
        L_0x0072:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            long r7 = r1.longValue()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$response$1 r1 = new com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl$postSmartaPlacement$response$1     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r1.<init>(r3, r10, r6)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$0 = r3     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$1 = r10     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.L$2 = r11     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.J$0 = r7     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r0.label = r5     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.Object r1 = QJ.m1.c(r7, r1, r0)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            if (r1 != r2) goto L_0x008e
            return r2
        L_0x008e:
            QL.x r1 = (QL.x) r1     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            boolean r10 = r1.e()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            if (r10 == 0) goto L_0x00ac
            com.sugarcube.app.base.data.Result$Success r10 = new com.sugarcube.app.base.data.Result$Success     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.Object r11 = r1.a()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            com.sugarcube.core.network.models.SmartaPlacementResponse r11 = (com.sugarcube.core.network.models.SmartaPlacementResponse) r11     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            if (r11 == 0) goto L_0x00a4
            r10.<init>(r11)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            goto L_0x010c
        L_0x00a4:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.String r11 = "Response body is null"
            r10.<init>(r11)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            throw r10     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
        L_0x00ac:
            com.sugarcube.app.base.data.Result$Error r10 = new com.sugarcube.app.base.data.Result$Error     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.io.IOException r11 = new java.io.IOException     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            int r0 = r1.b()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.String r1 = r1.f()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r2.<init>()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.String r3 = "Error: "
            r2.append(r3)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r2.append(r0)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.String r0 = " "
            r2.append(r0)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r2.append(r1)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            java.lang.String r0 = r2.toString()     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r11.<init>(r0)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            r10.<init>(r11, r6, r5, r6)     // Catch:{ k1 -> 0x003f, IOException -> 0x003c, Exception -> 0x0039 }
            goto L_0x010c
        L_0x00d8:
            com.sugarcube.app.base.data.Result$Error r11 = new com.sugarcube.app.base.data.Result$Error
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Unknown error"
            r0.<init>(r1, r10)
            r11.<init>(r0, r6, r5, r6)
        L_0x00e4:
            r10 = r11
            goto L_0x010c
        L_0x00e6:
            com.sugarcube.app.base.data.Result$Error r11 = new com.sugarcube.app.base.data.Result$Error
            r11.<init>(r10, r6, r5, r6)
            goto L_0x00e4
        L_0x00ec:
            com.sugarcube.app.base.data.Result$Error r11 = new com.sugarcube.app.base.data.Result$Error
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Timeout error: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            r11.<init>(r0, r6, r5, r6)
            goto L_0x00e4
        L_0x010c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.source.remote.SmartaRepositoryImpl.postSmartaPlacement(com.sugarcube.core.network.models.SmartaPlacementRequest, dI.e):java.lang.Object");
    }
}
