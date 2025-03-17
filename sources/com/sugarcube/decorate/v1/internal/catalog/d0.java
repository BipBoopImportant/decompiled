package com.sugarcube.decorate.v1.internal.catalog;

import com.sugarcube.app.base.data.database.CachedCatalogItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/d0;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "", "shouldReplace", "shouldAutoSelect", "isRestored", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "Z", "c", "()Z", "d", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final CachedCatalogItem f141713a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f141714b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f141715c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f141716d;

    public d0(CachedCatalogItem cachedCatalogItem, boolean z10, boolean z11, boolean z12) {
        C17542s.j(cachedCatalogItem, "cachedCatalogItem");
        this.f141713a = cachedCatalogItem;
        this.f141714b = z10;
        this.f141715c = z11;
        this.f141716d = z12;
    }

    public final CachedCatalogItem a() {
        return this.f141713a;
    }

    public final boolean b() {
        return this.f141715c;
    }

    public final boolean c() {
        return this.f141714b;
    }

    public final boolean d() {
        return this.f141716d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return C17542s.e(this.f141713a, d0Var.f141713a) && this.f141714b == d0Var.f141714b && this.f141715c == d0Var.f141715c && this.f141716d == d0Var.f141716d;
    }

    public int hashCode() {
        return (((((this.f141713a.hashCode() * 31) + Boolean.hashCode(this.f141714b)) * 31) + Boolean.hashCode(this.f141715c)) * 31) + Boolean.hashCode(this.f141716d);
    }

    public String toString() {
        CachedCatalogItem cachedCatalogItem = this.f141713a;
        boolean z10 = this.f141714b;
        boolean z11 = this.f141715c;
        boolean z12 = this.f141716d;
        return "PlacedCatalogItem(cachedCatalogItem=" + cachedCatalogItem + ", shouldReplace=" + z10 + ", shouldAutoSelect=" + z11 + ", isRestored=" + z12 + ")";
    }
}
