package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/core/network/models/CreateSceneRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CreateSceneRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CreateSceneRequest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Ljava/util/UUID;", "uUIDAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Lcom/sugarcube/core/network/models/SessionMeta;", "sessionMetaAdapter", "nullableStringAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateSceneRequestJsonAdapter extends f<CreateSceneRequest> {
    private final f<String> nullableStringAdapter;
    private final k.a options;
    private final f<SessionMeta> sessionMetaAdapter;
    private final f<String> stringAdapter;
    private final f<UUID> uUIDAdapter;

    public CreateSceneRequestJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("uploadUUID", "name", "roomType", "sessionMeta", "captureMetaSha256", "clientCapturedAt", "appType", "pipelineName", "pipelineType");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<UUID> f10 = tVar.f(UUID.class, g0.d(), "uploadUUID");
        C17542s.i(f10, "adapter(...)");
        this.uUIDAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar.f(cls, g0.d(), "name");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<SessionMeta> f12 = tVar.f(SessionMeta.class, g0.d(), "sessionMeta");
        C17542s.i(f12, "adapter(...)");
        this.sessionMetaAdapter = f12;
        f<String> f13 = tVar.f(cls, g0.d(), "appType");
        C17542s.i(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateSceneRequest");
        sb2.append(')');
        return sb2.toString();
    }

    public CreateSceneRequest fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        UUID uuid = null;
        String str = null;
        String str2 = null;
        SessionMeta sessionMeta = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (true) {
            String str8 = str7;
            String str9 = str6;
            if (kVar.hasNext()) {
                switch (kVar2.s(this.options)) {
                    case -1:
                        kVar.w();
                        kVar.a0();
                        break;
                    case 0:
                        uuid = this.uUIDAdapter.fromJson(kVar2);
                        if (uuid == null) {
                            throw c.w("uploadUUID", "uploadUUID", kVar2);
                        }
                        break;
                    case 1:
                        str = this.stringAdapter.fromJson(kVar2);
                        if (str == null) {
                            throw c.w("name", "name", kVar2);
                        }
                        break;
                    case 2:
                        str2 = this.stringAdapter.fromJson(kVar2);
                        if (str2 == null) {
                            throw c.w("roomType", "roomType", kVar2);
                        }
                        break;
                    case 3:
                        sessionMeta = this.sessionMetaAdapter.fromJson(kVar2);
                        if (sessionMeta == null) {
                            throw c.w("sessionMeta", "sessionMeta", kVar2);
                        }
                        break;
                    case 4:
                        str3 = this.stringAdapter.fromJson(kVar2);
                        if (str3 == null) {
                            throw c.w("captureMetaSha256", "captureMetaSha256", kVar2);
                        }
                        break;
                    case 5:
                        str4 = this.stringAdapter.fromJson(kVar2);
                        if (str4 == null) {
                            throw c.w("clientCapturedAt", "clientCapturedAt", kVar2);
                        }
                        break;
                    case 6:
                        str5 = this.nullableStringAdapter.fromJson(kVar2);
                        break;
                    case 7:
                        str6 = this.nullableStringAdapter.fromJson(kVar2);
                        str7 = str8;
                        continue;
                    case 8:
                        str7 = this.nullableStringAdapter.fromJson(kVar2);
                        break;
                }
                str7 = str8;
                str6 = str9;
            } else {
                kVar.f();
                if (uuid == null) {
                    throw c.n("uploadUUID", "uploadUUID", kVar2);
                } else if (str == null) {
                    throw c.n("name", "name", kVar2);
                } else if (str2 == null) {
                    throw c.n("roomType", "roomType", kVar2);
                } else if (sessionMeta == null) {
                    throw c.n("sessionMeta", "sessionMeta", kVar2);
                } else if (str3 == null) {
                    throw c.n("captureMetaSha256", "captureMetaSha256", kVar2);
                } else if (str4 != null) {
                    return new CreateSceneRequest(uuid, str, str2, sessionMeta, str3, str4, str5, str9, str8);
                } else {
                    throw c.n("clientCapturedAt", "clientCapturedAt", kVar2);
                }
            }
        }
    }

    public void toJson(q qVar, CreateSceneRequest createSceneRequest) {
        C17542s.j(qVar, "writer");
        if (createSceneRequest != null) {
            qVar.d();
            qVar.n("uploadUUID");
            this.uUIDAdapter.toJson(qVar, createSceneRequest.getUploadUUID());
            qVar.n("name");
            this.stringAdapter.toJson(qVar, createSceneRequest.getName());
            qVar.n("roomType");
            this.stringAdapter.toJson(qVar, createSceneRequest.getRoomType());
            qVar.n("sessionMeta");
            this.sessionMetaAdapter.toJson(qVar, createSceneRequest.getSessionMeta());
            qVar.n("captureMetaSha256");
            this.stringAdapter.toJson(qVar, createSceneRequest.getCaptureMetaSha256());
            qVar.n("clientCapturedAt");
            this.stringAdapter.toJson(qVar, createSceneRequest.getClientCapturedAt());
            qVar.n("appType");
            this.nullableStringAdapter.toJson(qVar, createSceneRequest.getAppType());
            qVar.n("pipelineName");
            this.nullableStringAdapter.toJson(qVar, createSceneRequest.getPipelineName());
            qVar.n("pipelineType");
            this.nullableStringAdapter.toJson(qVar, createSceneRequest.getPipelineType());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
