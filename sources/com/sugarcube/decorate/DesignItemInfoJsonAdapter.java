package com.sugarcube.decorate;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.sugarcube.decorate_engine.ModelScreenTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/decorate/DesignItemInfoJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/decorate/DesignItemInfo;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/decorate/DesignItemInfo;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "b", "(Lcom/squareup/moshi/q;Lcom/sugarcube/decorate/DesignItemInfo;)V", "Lcom/squareup/moshi/k$a;", "Lcom/squareup/moshi/k$a;", "options", "Lcom/sugarcube/decorate/TempModelInstanceInfo;", "Lcom/squareup/moshi/f;", "tempModelInstanceInfoAdapter", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "c", "modelScreenTransformAdapter", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DesignItemInfoJsonAdapter extends f<DesignItemInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final k.a f126117a;

    /* renamed from: b  reason: collision with root package name */
    private final f<TempModelInstanceInfo> f126118b;

    /* renamed from: c  reason: collision with root package name */
    private final f<ModelScreenTransform> f126119c;

    public DesignItemInfoJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("modelInstanceInfo", "modelScreenTransform");
        C17542s.i(a10, "of(...)");
        this.f126117a = a10;
        f<TempModelInstanceInfo> f10 = tVar.f(TempModelInstanceInfo.class, g0.d(), "modelInstanceInfo");
        C17542s.i(f10, "adapter(...)");
        this.f126118b = f10;
        f<ModelScreenTransform> f11 = tVar.f(ModelScreenTransform.class, g0.d(), "modelScreenTransform");
        C17542s.i(f11, "adapter(...)");
        this.f126119c = f11;
    }

    /* renamed from: a */
    public DesignItemInfo fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        TempModelInstanceInfo tempModelInstanceInfo = null;
        ModelScreenTransform modelScreenTransform = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.f126117a);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                tempModelInstanceInfo = this.f126118b.fromJson(kVar);
                if (tempModelInstanceInfo == null) {
                    throw c.w("modelInstanceInfo", "modelInstanceInfo", kVar);
                }
            } else if (s10 == 1 && (modelScreenTransform = this.f126119c.fromJson(kVar)) == null) {
                throw c.w("modelScreenTransform", "modelScreenTransform", kVar);
            }
        }
        kVar.f();
        if (tempModelInstanceInfo == null) {
            throw c.n("modelInstanceInfo", "modelInstanceInfo", kVar);
        } else if (modelScreenTransform != null) {
            return new DesignItemInfo(tempModelInstanceInfo, modelScreenTransform);
        } else {
            throw c.n("modelScreenTransform", "modelScreenTransform", kVar);
        }
    }

    /* renamed from: b */
    public void toJson(q qVar, DesignItemInfo designItemInfo) {
        C17542s.j(qVar, "writer");
        if (designItemInfo != null) {
            qVar.d();
            qVar.n("modelInstanceInfo");
            this.f126118b.toJson(qVar, designItemInfo.c());
            qVar.n("modelScreenTransform");
            this.f126119c.toJson(qVar, designItemInfo.d());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("DesignItemInfo");
        sb2.append(')');
        return sb2.toString();
    }
}
