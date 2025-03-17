package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import android.net.Uri;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCategoryJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CatalogCategory;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CatalogCategory;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CatalogCategory;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableListOfCatalogCategoryAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Landroid/net/Uri;", "nullableUriAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogCategoryJsonAdapter extends f<CatalogCategory> {
    private volatile Constructor<CatalogCategory> constructorRef;
    private final f<List<CatalogCategory>> nullableListOfCatalogCategoryAdapter;
    private final f<String> nullableStringAdapter;
    private final f<Uri> nullableUriAdapter;
    private final k.a options;

    public CatalogCategoryJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("subCategories", "categoryId", "name", "region", "imageUrl");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<List<CatalogCategory>> f10 = tVar.f(w.j(List.class, CatalogCategory.class), g0.d(), "subcategories");
        C17542s.i(f10, "adapter(...)");
        this.nullableListOfCatalogCategoryAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "categoryId");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Uri> f12 = tVar.f(Uri.class, g0.d(), "imageUrl");
        C17542s.i(f12, "adapter(...)");
        this.nullableUriAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogCategory");
        sb2.append(')');
        return sb2.toString();
    }

    public CatalogCategory fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar2.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                list = this.nullableListOfCatalogCategoryAdapter.fromJson(kVar2);
                i10 &= -2;
            } else if (s10 == 1) {
                str = this.nullableStringAdapter.fromJson(kVar2);
                i10 &= -3;
            } else if (s10 == 2) {
                str2 = this.nullableStringAdapter.fromJson(kVar2);
                i10 &= -5;
            } else if (s10 == 3) {
                str3 = this.nullableStringAdapter.fromJson(kVar2);
                i10 &= -9;
            } else if (s10 == 4) {
                uri = this.nullableUriAdapter.fromJson(kVar2);
                i10 &= -17;
            }
        }
        kVar.f();
        if (i10 == -32) {
            return new CatalogCategory(list, str, str2, str3, uri);
        }
        Constructor<CatalogCategory> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CatalogCategory.class.getDeclaredConstructor(new Class[]{List.class, String.class, String.class, String.class, Uri.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CatalogCategory newInstance = constructor.newInstance(new Object[]{list, str, str2, str3, uri, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CatalogCategory catalogCategory) {
        C17542s.j(qVar, "writer");
        if (catalogCategory != null) {
            qVar.d();
            qVar.n("subCategories");
            this.nullableListOfCatalogCategoryAdapter.toJson(qVar, catalogCategory.getSubcategories());
            qVar.n("categoryId");
            this.nullableStringAdapter.toJson(qVar, catalogCategory.getCategoryId());
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, catalogCategory.getName());
            qVar.n("region");
            this.nullableStringAdapter.toJson(qVar, catalogCategory.getRegion());
            qVar.n("imageUrl");
            this.nullableUriAdapter.toJson(qVar, catalogCategory.getImageUrl());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
