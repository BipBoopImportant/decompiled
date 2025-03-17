package com.sugarcube.app.base.network;

import QL.y;
import TL.C16557a;
import VE.C13760b;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.core.network.api.AutocompleteAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/network/AutocompleteClient;", "", "Lcom/sugarcube/app/base/external/config/a;", "config", "<init>", "(Lcom/sugarcube/app/base/external/config/a;)V", "", "query", "", "getPartialSearch", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/external/config/a;", "getConfig", "()Lcom/sugarcube/app/base/external/config/a;", "LQL/y;", "retrofit", "LQL/y;", "Lcom/sugarcube/core/network/api/AutocompleteAPI;", "api", "Lcom/sugarcube/core/network/api/AutocompleteAPI;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutocompleteClient {
    public static final int $stable = 8;
    private AutocompleteAPI api;
    private final a config;
    private y retrofit;

    public AutocompleteClient(a aVar) {
        C17542s.j(aVar, "config");
        this.config = aVar;
        y e10 = new y.b().d(C13760b.f117438d.c(aVar.getCountry(), aVar.getLanguage())).b(C16557a.f()).e();
        this.retrofit = e10;
        this.api = e10 != null ? (AutocompleteAPI) e10.b(AutocompleteAPI.class) : null;
    }

    public final a getConfig() {
        return this.config;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079 A[Catch:{ IOException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[Catch:{ IOException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getPartialSearch(java.lang.String r6, dI.C17164e<? super java.util.List<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.network.AutocompleteClient$getPartialSearch$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.network.AutocompleteClient$getPartialSearch$1 r0 = (com.sugarcube.app.base.network.AutocompleteClient$getPartialSearch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.network.AutocompleteClient$getPartialSearch$1 r0 = new com.sugarcube.app.base.network.AutocompleteClient$getPartialSearch$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.L$3
            com.sugarcube.core.network.api.AutocompleteAPI r6 = (com.sugarcube.core.network.api.AutocompleteAPI) r6
            java.lang.Object r6 = r0.L$2
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            com.sugarcube.app.base.network.AutocompleteClient r6 = (com.sugarcube.app.base.network.AutocompleteClient) r6
            XH.y.b(r1)     // Catch:{ IOException -> 0x0039 }
            goto L_0x005b
        L_0x0039:
            r6 = move-exception
            goto L_0x00a7
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            com.sugarcube.core.network.api.AutocompleteAPI r1 = r5.api     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x00ae
            r0.L$0 = r5     // Catch:{ IOException -> 0x0039 }
            r0.L$1 = r6     // Catch:{ IOException -> 0x0039 }
            r0.L$2 = r7     // Catch:{ IOException -> 0x0039 }
            r0.L$3 = r1     // Catch:{ IOException -> 0x0039 }
            r0.label = r4     // Catch:{ IOException -> 0x0039 }
            java.lang.Object r1 = r1.searchResultsForPartialQuery(r6, r0)     // Catch:{ IOException -> 0x0039 }
            if (r1 != r2) goto L_0x005b
            return r2
        L_0x005b:
            QL.x r1 = (QL.x) r1     // Catch:{ IOException -> 0x0039 }
            if (r1 == 0) goto L_0x00ae
            boolean r6 = r1.e()     // Catch:{ IOException -> 0x0039 }
            if (r6 == 0) goto L_0x00ae
            java.lang.Object r6 = r1.a()     // Catch:{ IOException -> 0x0039 }
            com.sugarcube.core.network.models.PartialSearchResponse r6 = (com.sugarcube.core.network.models.PartialSearchResponse) r6     // Catch:{ IOException -> 0x0039 }
            if (r6 == 0) goto L_0x00a2
            com.sugarcube.core.network.models.PartialSearchBox r6 = r6.getSearchBox()     // Catch:{ IOException -> 0x0039 }
            if (r6 == 0) goto L_0x00a2
            java.util.List r6 = r6.getPartialSearchResults()     // Catch:{ IOException -> 0x0039 }
            if (r6 == 0) goto L_0x00a2
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ IOException -> 0x0039 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x0039 }
            r7.<init>()     // Catch:{ IOException -> 0x0039 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x0039 }
        L_0x0084:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r6.next()     // Catch:{ IOException -> 0x0039 }
            com.sugarcube.core.network.models.PartialSearchResult r0 = (com.sugarcube.core.network.models.PartialSearchResult) r0     // Catch:{ IOException -> 0x0039 }
            com.sugarcube.core.network.models.PartialSearchCompletion r0 = r0.getCompletion()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r0.getText()     // Catch:{ IOException -> 0x0039 }
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 == 0) goto L_0x0084
            r7.add(r0)     // Catch:{ IOException -> 0x0039 }
            goto L_0x0084
        L_0x00a2:
            java.util.List r7 = YH.C16877v.n()     // Catch:{ IOException -> 0x0039 }
        L_0x00a6:
            return r7
        L_0x00a7:
            java.lang.String r7 = "Sugarcube"
            java.lang.String r0 = "could not query search results!"
            android.util.Log.e(r7, r0, r6)
        L_0x00ae:
            java.util.List r6 = YH.C16877v.n()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.network.AutocompleteClient.getPartialSearch(java.lang.String, dI.e):java.lang.Object");
    }
}
