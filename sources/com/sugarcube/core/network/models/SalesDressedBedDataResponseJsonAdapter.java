package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R6\u0010\u001c\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/SalesDressedBedDataResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/SalesDressedBedDataResponse;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "nullableMapOfStringMapOfStringNullableCatalogItemAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SalesDressedBedDataResponseJsonAdapter extends f<SalesDressedBedDataResponse> {
    private volatile Constructor<SalesDressedBedDataResponse> constructorRef;
    private final f<Integer> nullableIntAdapter;
    private final f<Map<String, Map<String, CatalogItem>>> nullableMapOfStringMapOfStringNullableCatalogItemAdapter;
    private final k.a options;

    public SalesDressedBedDataResponseJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("id", "data");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.class, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        Class<String> cls = String.class;
        Class<Map> cls2 = Map.class;
        f<Map<String, Map<String, CatalogItem>>> f11 = tVar.f(w.j(cls2, cls, w.j(cls2, cls, CatalogItem.class)), g0.d(), "data");
        C17542s.i(f11, "adapter(...)");
        this.nullableMapOfStringMapOfStringNullableCatalogItemAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SalesDressedBedDataResponse");
        sb2.append(')');
        return sb2.toString();
    }

    public SalesDressedBedDataResponse fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Integer num = null;
        Map map = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                num = this.nullableIntAdapter.fromJson(kVar);
                i10 &= -2;
            } else if (s10 == 1) {
                map = this.nullableMapOfStringMapOfStringNullableCatalogItemAdapter.fromJson(kVar);
                i10 &= -3;
            }
        }
        kVar.f();
        if (i10 == -4) {
            return new SalesDressedBedDataResponse(num, map);
        }
        Constructor<SalesDressedBedDataResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SalesDressedBedDataResponse.class.getDeclaredConstructor(new Class[]{Integer.class, Map.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        SalesDressedBedDataResponse newInstance = constructor.newInstance(new Object[]{num, map, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, SalesDressedBedDataResponse salesDressedBedDataResponse) {
        C17542s.j(qVar, "writer");
        if (salesDressedBedDataResponse != null) {
            qVar.d();
            qVar.n("id");
            this.nullableIntAdapter.toJson(qVar, salesDressedBedDataResponse.getId());
            qVar.n("data");
            this.nullableMapOfStringMapOfStringNullableCatalogItemAdapter.toJson(qVar, salesDressedBedDataResponse.getData());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
