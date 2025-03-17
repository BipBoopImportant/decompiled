package hv;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, d2 = {"Lhv/b;", "", "", "purpose", "title", "primaryActionTitle", "secondaryActionTitle", "Lhv/c;", "highlightedShow", "LKJ/c;", "pastShows", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhv/c;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "getPrimaryActionTitle", "getSecondaryActionTitle", "e", "Lhv/c;", "()Lhv/c;", "f", "LKJ/c;", "()LKJ/c;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hv.b  reason: case insensitive filesystem */
public final class C11386b {

    /* renamed from: a  reason: collision with root package name */
    private final String f98256a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98257b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98258c;

    /* renamed from: d  reason: collision with root package name */
    private final String f98259d;

    /* renamed from: e  reason: collision with root package name */
    private final C11387c f98260e;

    /* renamed from: f  reason: collision with root package name */
    private final C15987c<C11387c> f98261f;

    public C11386b(String str, String str2, String str3, String str4, C11387c cVar, C15987c<C11387c> cVar2) {
        C17542s.j(str, "purpose");
        C17542s.j(str2, "title");
        C17542s.j(str3, "primaryActionTitle");
        C17542s.j(str4, "secondaryActionTitle");
        C17542s.j(cVar2, "pastShows");
        this.f98256a = str;
        this.f98257b = str2;
        this.f98258c = str3;
        this.f98259d = str4;
        this.f98260e = cVar;
        this.f98261f = cVar2;
    }

    public final C11387c a() {
        return this.f98260e;
    }

    public final C15987c<C11387c> b() {
        return this.f98261f;
    }

    public final String c() {
        return this.f98256a;
    }

    public final String d() {
        return this.f98257b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11386b)) {
            return false;
        }
        C11386b bVar = (C11386b) obj;
        return C17542s.e(this.f98256a, bVar.f98256a) && C17542s.e(this.f98257b, bVar.f98257b) && C17542s.e(this.f98258c, bVar.f98258c) && C17542s.e(this.f98259d, bVar.f98259d) && C17542s.e(this.f98260e, bVar.f98260e) && C17542s.e(this.f98261f, bVar.f98261f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f98256a.hashCode() * 31) + this.f98257b.hashCode()) * 31) + this.f98258c.hashCode()) * 31) + this.f98259d.hashCode()) * 31;
        C11387c cVar = this.f98260e;
        return ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f98261f.hashCode();
    }

    public String toString() {
        String str = this.f98256a;
        String str2 = this.f98257b;
        String str3 = this.f98258c;
        String str4 = this.f98259d;
        C11387c cVar = this.f98260e;
        C15987c<C11387c> cVar2 = this.f98261f;
        return "LiveShoppingEntryPoint(purpose=" + str + ", title=" + str2 + ", primaryActionTitle=" + str3 + ", secondaryActionTitle=" + str4 + ", highlightedShow=" + cVar + ", pastShows=" + cVar2 + ")";
    }
}
