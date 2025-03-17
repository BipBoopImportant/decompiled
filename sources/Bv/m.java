package Bv;

import Hx.f;
import IC.C13023e;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0016\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"LBv/m;", "", "", "id", "LHx/f;", "type", "LIC/e;", "label", "amount", "LKJ/c;", "imageUrls", "<init>", "(Ljava/lang/String;LHx/f;LIC/e;LIC/e;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LHx/f;", "e", "()LHx/f;", "c", "LIC/e;", "d", "()LIC/e;", "LKJ/c;", "()LKJ/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f33503a;

    /* renamed from: b  reason: collision with root package name */
    private final f f33504b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f33505c;

    /* renamed from: d  reason: collision with root package name */
    private final C13023e f33506d;

    /* renamed from: e  reason: collision with root package name */
    private final C15987c<String> f33507e;

    public m(String str, f fVar, C13023e eVar, C13023e eVar2, C15987c<String> cVar) {
        C17542s.j(str, "id");
        C17542s.j(fVar, "type");
        C17542s.j(eVar, "label");
        C17542s.j(eVar2, "amount");
        C17542s.j(cVar, "imageUrls");
        this.f33503a = str;
        this.f33504b = fVar;
        this.f33505c = eVar;
        this.f33506d = eVar2;
        this.f33507e = cVar;
    }

    public final C13023e a() {
        return this.f33506d;
    }

    public final String b() {
        return this.f33503a;
    }

    public final C15987c<String> c() {
        return this.f33507e;
    }

    public final C13023e d() {
        return this.f33505c;
    }

    public final f e() {
        return this.f33504b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f33503a, mVar.f33503a) && this.f33504b == mVar.f33504b && C17542s.e(this.f33505c, mVar.f33505c) && C17542s.e(this.f33506d, mVar.f33506d) && C17542s.e(this.f33507e, mVar.f33507e);
    }

    public int hashCode() {
        return (((((((this.f33503a.hashCode() * 31) + this.f33504b.hashCode()) * 31) + this.f33505c.hashCode()) * 31) + this.f33506d.hashCode()) * 31) + this.f33507e.hashCode();
    }

    public String toString() {
        String str = this.f33503a;
        f fVar = this.f33504b;
        C13023e eVar = this.f33505c;
        C13023e eVar2 = this.f33506d;
        C15987c<String> cVar = this.f33507e;
        return "LatestPurchase(id=" + str + ", type=" + fVar + ", label=" + eVar + ", amount=" + eVar2 + ", imageUrls=" + cVar + ")";
    }
}
