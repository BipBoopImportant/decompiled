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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sugarcube/core/network/models/CatalogPlaceableMetadataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CatalogPlaceableMetadata;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/sugarcube/core/network/models/PlaceableAnchor;", "nullableListOfPlaceableAnchorAdapter", "nullableListOfIntAdapter", "nullableListOfListOfIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogPlaceableMetadataJsonAdapter extends f<CatalogPlaceableMetadata> {
    private volatile Constructor<CatalogPlaceableMetadata> constructorRef;
    private final f<Integer> nullableIntAdapter;
    private final f<List<Integer>> nullableListOfIntAdapter;
    private final f<List<List<Integer>>> nullableListOfListOfIntAdapter;
    private final f<List<PlaceableAnchor>> nullableListOfPlaceableAnchorAdapter;
    private final k.a options;

    public CatalogPlaceableMetadataJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("version", "anchors", "stackables", "combinations");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<Integer> cls = Integer.class;
        f<Integer> f10 = tVar.f(cls, g0.d(), "version");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        Class<List> cls2 = List.class;
        f<List<PlaceableAnchor>> f11 = tVar.f(w.j(cls2, PlaceableAnchor.class), g0.d(), "anchors");
        C17542s.i(f11, "adapter(...)");
        this.nullableListOfPlaceableAnchorAdapter = f11;
        f<List<Integer>> f12 = tVar.f(w.j(cls2, cls), g0.d(), "stackables");
        C17542s.i(f12, "adapter(...)");
        this.nullableListOfIntAdapter = f12;
        f<List<List<Integer>>> f13 = tVar.f(w.j(cls2, w.j(cls2, cls)), g0.d(), "combinations");
        C17542s.i(f13, "adapter(...)");
        this.nullableListOfListOfIntAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogPlaceableMetadata");
        sb2.append(')');
        return sb2.toString();
    }

    public CatalogPlaceableMetadata fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Integer num = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                list = this.nullableListOfPlaceableAnchorAdapter.fromJson(kVar);
                i10 &= -3;
            } else if (s10 == 2) {
                list2 = this.nullableListOfIntAdapter.fromJson(kVar);
                i10 &= -5;
            } else if (s10 == 3) {
                list3 = this.nullableListOfListOfIntAdapter.fromJson(kVar);
                i10 &= -9;
            }
        }
        kVar.f();
        if (i10 == -16) {
            return new CatalogPlaceableMetadata(num, list, list2, list3);
        }
        Constructor<CatalogPlaceableMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CatalogPlaceableMetadata.class.getDeclaredConstructor(new Class[]{Integer.class, List.class, List.class, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CatalogPlaceableMetadata newInstance = constructor.newInstance(new Object[]{num, list, list2, list3, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CatalogPlaceableMetadata catalogPlaceableMetadata) {
        C17542s.j(qVar, "writer");
        if (catalogPlaceableMetadata != null) {
            qVar.d();
            qVar.n("version");
            this.nullableIntAdapter.toJson(qVar, catalogPlaceableMetadata.getVersion());
            qVar.n("anchors");
            this.nullableListOfPlaceableAnchorAdapter.toJson(qVar, catalogPlaceableMetadata.getAnchors());
            qVar.n("stackables");
            this.nullableListOfIntAdapter.toJson(qVar, catalogPlaceableMetadata.getStackables());
            qVar.n("combinations");
            this.nullableListOfListOfIntAdapter.toJson(qVar, catalogPlaceableMetadata.getCombinations());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
