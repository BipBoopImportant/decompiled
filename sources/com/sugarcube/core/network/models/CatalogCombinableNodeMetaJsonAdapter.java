package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u00190\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCombinableNodeMetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "", "", "nullableListOfListOfDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogCombinableNodeMetaJsonAdapter extends f<CatalogCombinableNodeMeta> {
    private volatile Constructor<CatalogCombinableNodeMeta> constructorRef;
    private final f<List<List<Double>>> nullableListOfListOfDoubleAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public CatalogCombinableNodeMetaJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("size", "category", "matrixModel");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<String> f10 = tVar.f(String.class, g0.d(), "size");
        C17542s.i(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        Class<List> cls = List.class;
        f<List<List<Double>>> f11 = tVar.f(w.j(cls, w.j(cls, Double.class)), g0.d(), "matrixModel");
        C17542s.i(f11, "adapter(...)");
        this.nullableListOfListOfDoubleAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogCombinableNodeMeta");
        sb2.append(')');
        return sb2.toString();
    }

    public CatalogCombinableNodeMeta fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        String str = null;
        String str2 = null;
        List list = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                str = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -2;
            } else if (s10 == 1) {
                str2 = this.nullableStringAdapter.fromJson(kVar);
                i10 &= -3;
            } else if (s10 == 2) {
                list = this.nullableListOfListOfDoubleAdapter.fromJson(kVar);
                i10 &= -5;
            }
        }
        kVar.f();
        if (i10 == -8) {
            return new CatalogCombinableNodeMeta(str, str2, list);
        }
        Constructor<CatalogCombinableNodeMeta> constructor = this.constructorRef;
        if (constructor == null) {
            Class<String> cls = String.class;
            constructor = CatalogCombinableNodeMeta.class.getDeclaredConstructor(new Class[]{cls, cls, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CatalogCombinableNodeMeta newInstance = constructor.newInstance(new Object[]{str, str2, list, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CatalogCombinableNodeMeta catalogCombinableNodeMeta) {
        C17542s.j(qVar, "writer");
        if (catalogCombinableNodeMeta != null) {
            qVar.d();
            qVar.n("size");
            this.nullableStringAdapter.toJson(qVar, catalogCombinableNodeMeta.getSize());
            qVar.n("category");
            this.nullableStringAdapter.toJson(qVar, catalogCombinableNodeMeta.getCategory());
            qVar.n("matrixModel");
            this.nullableListOfListOfDoubleAdapter.toJson(qVar, catalogCombinableNodeMeta.getMatrixModel());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
