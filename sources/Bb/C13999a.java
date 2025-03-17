package bB;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"LbB/a;", "", "", "itemNo", "LbB/c;", "product", "", "numberOfPackages", "quantityPerItem", "<init>", "(Ljava/lang/String;LbB/c;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LbB/c;", "c", "()LbB/c;", "I", "d", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bB.a  reason: case insensitive filesystem */
public final class C13999a {

    /* renamed from: a  reason: collision with root package name */
    private final String f118873a;

    /* renamed from: b  reason: collision with root package name */
    private final c f118874b;

    /* renamed from: c  reason: collision with root package name */
    private final int f118875c;

    /* renamed from: d  reason: collision with root package name */
    private final int f118876d;

    public C13999a(String str, c cVar, int i10, int i11) {
        C17542s.j(str, "itemNo");
        this.f118873a = str;
        this.f118874b = cVar;
        this.f118875c = i10;
        this.f118876d = i11;
    }

    public final String a() {
        return this.f118873a;
    }

    public final int b() {
        return this.f118875c;
    }

    public final c c() {
        return this.f118874b;
    }

    public final int d() {
        return this.f118876d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13999a)) {
            return false;
        }
        C13999a aVar = (C13999a) obj;
        return C17542s.e(this.f118873a, aVar.f118873a) && C17542s.e(this.f118874b, aVar.f118874b) && this.f118875c == aVar.f118875c && this.f118876d == aVar.f118876d;
    }

    public int hashCode() {
        int hashCode = this.f118873a.hashCode() * 31;
        c cVar = this.f118874b;
        return ((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Integer.hashCode(this.f118875c)) * 31) + Integer.hashCode(this.f118876d);
    }

    public String toString() {
        String str = this.f118873a;
        c cVar = this.f118874b;
        int i10 = this.f118875c;
        int i11 = this.f118876d;
        return "ArticleRemoteModel(itemNo=" + str + ", product=" + cVar + ", numberOfPackages=" + i10 + ", quantityPerItem=" + i11 + ")";
    }
}
