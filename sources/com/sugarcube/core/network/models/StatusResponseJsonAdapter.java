package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/core/network/models/StatusResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/StatusResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/StatusResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/StatusResponse;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "booleanAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusResponseJsonAdapter extends f<StatusResponse> {
    private final f<Boolean> booleanAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public StatusResponseJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("outage", "status", "minimumVersionSugarcubeIos", "minimumVersionSugarcubeAndroid", "minimumVersionShoppableIos", "minimumVersionShoppableAndroid");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Boolean> f10 = tVar.f(Boolean.TYPE, g0.d(), "outage");
        C17542s.i(f10, "adapter(...)");
        this.booleanAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "status");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("StatusResponse");
        sb2.append(')');
        return sb2.toString();
    }

    public StatusResponse fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (kVar.hasNext()) {
            switch (kVar.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(kVar);
                    if (bool != null) {
                        break;
                    } else {
                        throw c.w("outage", "outage", kVar);
                    }
                case 1:
                    str = this.stringAdapter.fromJson(kVar);
                    if (str != null) {
                        break;
                    } else {
                        throw c.w("status", "status", kVar);
                    }
                case 2:
                    str2 = this.stringAdapter.fromJson(kVar);
                    if (str2 != null) {
                        break;
                    } else {
                        throw c.w("minimumVersionSugarcubeIos", "minimumVersionSugarcubeIos", kVar);
                    }
                case 3:
                    str3 = this.stringAdapter.fromJson(kVar);
                    if (str3 != null) {
                        break;
                    } else {
                        throw c.w("minimumVersionSugarcubeAndroid", "minimumVersionSugarcubeAndroid", kVar);
                    }
                case 4:
                    str4 = this.stringAdapter.fromJson(kVar);
                    if (str4 != null) {
                        break;
                    } else {
                        throw c.w("minimumVersionShoppableIos", "minimumVersionShoppableIos", kVar);
                    }
                case 5:
                    str5 = this.stringAdapter.fromJson(kVar);
                    if (str5 != null) {
                        break;
                    } else {
                        throw c.w("minimumVersionShoppableAndroid", "minimumVersionShoppableAndroid", kVar);
                    }
            }
        }
        kVar.f();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (str == null) {
                throw c.n("status", "status", kVar);
            } else if (str2 == null) {
                throw c.n("minimumVersionSugarcubeIos", "minimumVersionSugarcubeIos", kVar);
            } else if (str3 == null) {
                throw c.n("minimumVersionSugarcubeAndroid", "minimumVersionSugarcubeAndroid", kVar);
            } else if (str4 == null) {
                throw c.n("minimumVersionShoppableIos", "minimumVersionShoppableIos", kVar);
            } else if (str5 != null) {
                return new StatusResponse(booleanValue, str, str2, str3, str4, str5);
            } else {
                throw c.n("minimumVersionShoppableAndroid", "minimumVersionShoppableAndroid", kVar);
            }
        } else {
            throw c.n("outage", "outage", kVar);
        }
    }

    public void toJson(q qVar, StatusResponse statusResponse) {
        C17542s.j(qVar, "writer");
        if (statusResponse != null) {
            qVar.d();
            qVar.n("outage");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(statusResponse.getOutage()));
            qVar.n("status");
            this.stringAdapter.toJson(qVar, statusResponse.getStatus());
            qVar.n("minimumVersionSugarcubeIos");
            this.stringAdapter.toJson(qVar, statusResponse.getMinimumVersionSugarcubeIos());
            qVar.n("minimumVersionSugarcubeAndroid");
            this.stringAdapter.toJson(qVar, statusResponse.getMinimumVersionSugarcubeAndroid());
            qVar.n("minimumVersionShoppableIos");
            this.stringAdapter.toJson(qVar, statusResponse.getMinimumVersionShoppableIos());
            qVar.n("minimumVersionShoppableAndroid");
            this.stringAdapter.toJson(qVar, statusResponse.getMinimumVersionShoppableAndroid());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
