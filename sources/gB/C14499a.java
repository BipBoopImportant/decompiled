package gB;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"LgB/a;", "", "", "itemNo", "LgB/b;", "productDetails", "", "numberOfPackages", "quantity", "<init>", "(Ljava/lang/String;LgB/b;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LgB/b;", "c", "()LgB/b;", "I", "d", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.a  reason: case insensitive filesystem */
public final class C14499a {

    /* renamed from: a  reason: collision with root package name */
    private final String f127253a;

    /* renamed from: b  reason: collision with root package name */
    private final C14500b f127254b;

    /* renamed from: c  reason: collision with root package name */
    private final int f127255c;

    /* renamed from: d  reason: collision with root package name */
    private final int f127256d;

    public C14499a(String str, C14500b bVar, int i10, int i11) {
        C17542s.j(str, "itemNo");
        this.f127253a = str;
        this.f127254b = bVar;
        this.f127255c = i10;
        this.f127256d = i11;
    }

    public final String a() {
        return this.f127253a;
    }

    public final int b() {
        return this.f127255c;
    }

    public final C14500b c() {
        return this.f127254b;
    }

    public final int d() {
        return this.f127256d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14499a)) {
            return false;
        }
        C14499a aVar = (C14499a) obj;
        return C17542s.e(this.f127253a, aVar.f127253a) && C17542s.e(this.f127254b, aVar.f127254b) && this.f127255c == aVar.f127255c && this.f127256d == aVar.f127256d;
    }

    public int hashCode() {
        int hashCode = this.f127253a.hashCode() * 31;
        C14500b bVar = this.f127254b;
        return ((((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Integer.hashCode(this.f127255c)) * 31) + Integer.hashCode(this.f127256d);
    }

    public String toString() {
        String str = this.f127253a;
        C14500b bVar = this.f127254b;
        int i10 = this.f127255c;
        int i11 = this.f127256d;
        return "Article(itemNo=" + str + ", productDetails=" + bVar + ", numberOfPackages=" + i10 + ", quantity=" + i11 + ")";
    }
}
