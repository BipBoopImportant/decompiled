package com.sugarcube.decorate;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate_engine.ObjectInstanceId;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/decorate/TempModelInstanceInfoJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/decorate/TempModelInstanceInfo;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/decorate/TempModelInstanceInfo;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "b", "(Lcom/squareup/moshi/q;Lcom/sugarcube/decorate/TempModelInstanceInfo;)V", "Lcom/squareup/moshi/k$a;", "Lcom/squareup/moshi/k$a;", "options", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/squareup/moshi/f;", "objectInstanceIdAdapter", "Lcom/sugarcube/core/network/models/CatalogItem;", "c", "catalogItemAdapter", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TempModelInstanceInfoJsonAdapter extends f<TempModelInstanceInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final k.a f126122a;

    /* renamed from: b  reason: collision with root package name */
    private final f<ObjectInstanceId> f126123b;

    /* renamed from: c  reason: collision with root package name */
    private final f<CatalogItem> f126124c;

    public TempModelInstanceInfoJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("instanceId", "catalogItem");
        C17542s.i(a10, "of(...)");
        this.f126122a = a10;
        f<ObjectInstanceId> f10 = tVar.f(ObjectInstanceId.class, g0.d(), "instanceId");
        C17542s.i(f10, "adapter(...)");
        this.f126123b = f10;
        f<CatalogItem> f11 = tVar.f(CatalogItem.class, g0.d(), "catalogItem");
        C17542s.i(f11, "adapter(...)");
        this.f126124c = f11;
    }

    /* renamed from: a */
    public TempModelInstanceInfo fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        ObjectInstanceId objectInstanceId = null;
        CatalogItem catalogItem = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.f126122a);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                objectInstanceId = this.f126123b.fromJson(kVar);
                if (objectInstanceId == null) {
                    throw c.w("instanceId", "instanceId", kVar);
                }
            } else if (s10 == 1 && (catalogItem = this.f126124c.fromJson(kVar)) == null) {
                throw c.w("catalogItem", "catalogItem", kVar);
            }
        }
        kVar.f();
        if (objectInstanceId == null) {
            throw c.n("instanceId", "instanceId", kVar);
        } else if (catalogItem != null) {
            return new TempModelInstanceInfo(objectInstanceId, catalogItem);
        } else {
            throw c.n("catalogItem", "catalogItem", kVar);
        }
    }

    /* renamed from: b */
    public void toJson(q qVar, TempModelInstanceInfo tempModelInstanceInfo) {
        C17542s.j(qVar, "writer");
        if (tempModelInstanceInfo != null) {
            qVar.d();
            qVar.n("instanceId");
            this.f126123b.toJson(qVar, tempModelInstanceInfo.b());
            qVar.n("catalogItem");
            this.f126124c.toJson(qVar, tempModelInstanceInfo.a());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TempModelInstanceInfo");
        sb2.append(')');
        return sb2.toString();
    }
}
