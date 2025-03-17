package Bw;

import Mp.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LBw/a;", "", "LMp/a;", "offerHub", "", "hasError", "isLoading", "<init>", "(LMp/a;ZZ)V", "a", "(LMp/a;ZZ)LBw/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LMp/a;", "c", "()LMp/a;", "b", "Z", "()Z", "d", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bw.a  reason: case insensitive filesystem */
public final class C12661a {

    /* renamed from: a  reason: collision with root package name */
    private final a f108114a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f108115b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f108116c;

    public C12661a(a aVar, boolean z10, boolean z11) {
        this.f108114a = aVar;
        this.f108115b = z10;
        this.f108116c = z11;
    }

    public final C12661a a(a aVar, boolean z10, boolean z11) {
        return new C12661a(aVar, z10, z11);
    }

    public final boolean b() {
        return this.f108115b;
    }

    public final a c() {
        return this.f108114a;
    }

    public final boolean d() {
        return this.f108116c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12661a)) {
            return false;
        }
        C12661a aVar = (C12661a) obj;
        return C17542s.e(this.f108114a, aVar.f108114a) && this.f108115b == aVar.f108115b && this.f108116c == aVar.f108116c;
    }

    public int hashCode() {
        a aVar = this.f108114a;
        return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + Boolean.hashCode(this.f108115b)) * 31) + Boolean.hashCode(this.f108116c);
    }

    public String toString() {
        a aVar = this.f108114a;
        boolean z10 = this.f108115b;
        boolean z11 = this.f108116c;
        return "OfferHubState(offerHub=" + aVar + ", hasError=" + z10 + ", isLoading=" + z11 + ")";
    }
}
