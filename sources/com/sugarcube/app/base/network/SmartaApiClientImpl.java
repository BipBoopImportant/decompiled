package com.sugarcube.app.base.network;

import QL.y;
import SE.C13668a;
import TL.C16557a;
import VE.C13759a;
import VE.C13760b;
import com.squareup.moshi.t;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.core.network.api.SmartaApiService;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/network/SmartaApiClientImpl;", "Lcom/sugarcube/app/base/network/SmartaApiClient;", "LVE/b;", "networkConfig", "Lcom/sugarcube/app/base/external/config/a;", "config", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(LVE/b;Lcom/sugarcube/app/base/external/config/a;Lcom/squareup/moshi/t;)V", "Lcom/sugarcube/core/network/api/SmartaApiService;", "createService", "()Lcom/sugarcube/core/network/api/SmartaApiService;", "Lcom/squareup/moshi/t;", "", "baseUrl", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaApiClientImpl implements SmartaApiClient {
    public static final int $stable = 8;
    private final String baseUrl;
    private final t moshi;

    public SmartaApiClientImpl(C13760b bVar, a aVar, t tVar) {
        String str;
        C17542s.j(bVar, "networkConfig");
        C17542s.j(aVar, "config");
        C17542s.j(tVar, "moshi");
        this.moshi = tVar;
        C13759a b10 = bVar.b();
        if (C17542s.e(b10, C13759a.b.f117436i)) {
            str = bVar.d();
        } else if (C17542s.e(b10, C13759a.c.f117437i)) {
            str = C13760b.f117438d.g(C13668a.f116532a.a(aVar.getCountry()), aVar.getCountry(), aVar.getLanguage());
        } else {
            throw new XH.t();
        }
        this.baseUrl = str;
    }

    public SmartaApiService createService() {
        Object b10 = new y.b().d(this.baseUrl).b(C16557a.g(this.moshi)).e().b(SmartaApiService.class);
        C17542s.i(b10, "create(...)");
        return (SmartaApiService) b10;
    }
}
