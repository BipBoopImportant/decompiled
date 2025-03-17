package aj;

import Sy.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001e\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006*"}, d2 = {"Laj/a;", "", "", "itemId", "productType", "", "price", "", "quantity", "", "isFullServe", "LSy/a$c;", "productAssortmentType", "LSy/a$b;", "productAssortmentSpecialType", "<init>", "(Ljava/lang/String;Ljava/lang/String;DIZLSy/a$c;LSy/a$b;)V", "g", "()D", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "D", "getPrice", "I", "e", "Z", "f", "()Z", "LSy/a$c;", "()LSy/a$c;", "LSy/a$b;", "()LSy/a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aj.a  reason: case insensitive filesystem */
public final class C11061a {

    /* renamed from: a  reason: collision with root package name */
    private final String f90265a;

    /* renamed from: b  reason: collision with root package name */
    private final String f90266b;

    /* renamed from: c  reason: collision with root package name */
    private final double f90267c;

    /* renamed from: d  reason: collision with root package name */
    private final int f90268d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f90269e;

    /* renamed from: f  reason: collision with root package name */
    private final a.c f90270f;

    /* renamed from: g  reason: collision with root package name */
    private final a.b f90271g;

    public C11061a(String str, String str2, double d10, int i10, boolean z10, a.c cVar, a.b bVar) {
        C17542s.j(str, "itemId");
        C17542s.j(str2, "productType");
        C17542s.j(cVar, "productAssortmentType");
        this.f90265a = str;
        this.f90266b = str2;
        this.f90267c = d10;
        this.f90268d = i10;
        this.f90269e = z10;
        this.f90270f = cVar;
        this.f90271g = bVar;
    }

    public final String a() {
        return this.f90265a;
    }

    public final a.b b() {
        return this.f90271g;
    }

    public final a.c c() {
        return this.f90270f;
    }

    public final String d() {
        return this.f90266b;
    }

    public final int e() {
        return this.f90268d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11061a)) {
            return false;
        }
        C11061a aVar = (C11061a) obj;
        return C17542s.e(this.f90265a, aVar.f90265a) && C17542s.e(this.f90266b, aVar.f90266b) && Double.compare(this.f90267c, aVar.f90267c) == 0 && this.f90268d == aVar.f90268d && this.f90269e == aVar.f90269e && this.f90270f == aVar.f90270f && this.f90271g == aVar.f90271g;
    }

    public final boolean f() {
        return this.f90269e;
    }

    public final double g() {
        return this.f90267c * ((double) this.f90268d);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f90265a.hashCode() * 31) + this.f90266b.hashCode()) * 31) + Double.hashCode(this.f90267c)) * 31) + Integer.hashCode(this.f90268d)) * 31) + Boolean.hashCode(this.f90269e)) * 31) + this.f90270f.hashCode()) * 31;
        a.b bVar = this.f90271g;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.f90265a;
        String str2 = this.f90266b;
        double d10 = this.f90267c;
        int i10 = this.f90268d;
        boolean z10 = this.f90269e;
        a.c cVar = this.f90270f;
        a.b bVar = this.f90271g;
        return "PurchaseItem(itemId=" + str + ", productType=" + str2 + ", price=" + d10 + ", quantity=" + i10 + ", isFullServe=" + z10 + ", productAssortmentType=" + cVar + ", productAssortmentSpecialType=" + bVar + ")";
    }
}
