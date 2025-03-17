package WA;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"LWA/a;", "", "", "parentItemNo", "parentArticleItemNo", "", "numberOfPackages", "quantityPerItem", "LWA/d;", "productDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILWA/d;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "d", "e", "LWA/d;", "()LWA/d;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WA.a  reason: case insensitive filesystem */
public final class C13763a {

    /* renamed from: a  reason: collision with root package name */
    private final String f117453a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117454b;

    /* renamed from: c  reason: collision with root package name */
    private final int f117455c;

    /* renamed from: d  reason: collision with root package name */
    private final int f117456d;

    /* renamed from: e  reason: collision with root package name */
    private final C13766d f117457e;

    public C13763a(String str, String str2, int i10, int i11, C13766d dVar) {
        C17542s.j(str, "parentItemNo");
        C17542s.j(str2, "parentArticleItemNo");
        this.f117453a = str;
        this.f117454b = str2;
        this.f117455c = i10;
        this.f117456d = i11;
        this.f117457e = dVar;
    }

    public final int a() {
        return this.f117455c;
    }

    public final String b() {
        return this.f117454b;
    }

    public final String c() {
        return this.f117453a;
    }

    public final C13766d d() {
        return this.f117457e;
    }

    public final int e() {
        return this.f117456d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13763a)) {
            return false;
        }
        C13763a aVar = (C13763a) obj;
        return C17542s.e(this.f117453a, aVar.f117453a) && C17542s.e(this.f117454b, aVar.f117454b) && this.f117455c == aVar.f117455c && this.f117456d == aVar.f117456d && C17542s.e(this.f117457e, aVar.f117457e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f117453a.hashCode() * 31) + this.f117454b.hashCode()) * 31) + Integer.hashCode(this.f117455c)) * 31) + Integer.hashCode(this.f117456d)) * 31;
        C13766d dVar = this.f117457e;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.f117453a;
        String str2 = this.f117454b;
        int i10 = this.f117455c;
        int i11 = this.f117456d;
        C13766d dVar = this.f117457e;
        return "ArticleDetailsEntity(parentItemNo=" + str + ", parentArticleItemNo=" + str2 + ", numberOfPackages=" + i10 + ", quantityPerItem=" + i11 + ", productDetails=" + dVar + ")";
    }
}
