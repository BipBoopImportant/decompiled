package androidx.compose.foundation.lazy.layout;

import G1.V;
import c2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;
import v0.C6143i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "LG1/V;", "Lv0/i;", "Lm0/N;", "", "fadeInSpec", "Lc2/n;", "placementSpec", "fadeOutSpec", "<init>", "(Lm0/N;Lm0/N;Lm0/N;)V", "c", "()Lv0/i;", "node", "LXH/N;", "f", "(Lv0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lm0/N;", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LazyLayoutAnimateItemElement extends V<C6143i> {

    /* renamed from: d  reason: collision with root package name */
    private final N<Float> f18256d;

    /* renamed from: e  reason: collision with root package name */
    private final N<n> f18257e;

    /* renamed from: f  reason: collision with root package name */
    private final N<Float> f18258f;

    public LazyLayoutAnimateItemElement(N<Float> n10, N<n> n11, N<Float> n12) {
        this.f18256d = n10;
        this.f18257e = n11;
        this.f18258f = n12;
    }

    /* renamed from: c */
    public C6143i a() {
        return new C6143i(this.f18256d, this.f18257e, this.f18258f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return C17542s.e(this.f18256d, lazyLayoutAnimateItemElement.f18256d) && C17542s.e(this.f18257e, lazyLayoutAnimateItemElement.f18257e) && C17542s.e(this.f18258f, lazyLayoutAnimateItemElement.f18258f);
    }

    /* renamed from: f */
    public void b(C6143i iVar) {
        iVar.F2(this.f18256d);
        iVar.H2(this.f18257e);
        iVar.G2(this.f18258f);
    }

    public int hashCode() {
        N<Float> n10 = this.f18256d;
        int i10 = 0;
        int hashCode = (n10 == null ? 0 : n10.hashCode()) * 31;
        N<n> n11 = this.f18257e;
        int hashCode2 = (hashCode + (n11 == null ? 0 : n11.hashCode())) * 31;
        N<Float> n12 = this.f18258f;
        if (n12 != null) {
            i10 = n12.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f18256d + ", placementSpec=" + this.f18257e + ", fadeOutSpec=" + this.f18258f + ')';
    }
}
