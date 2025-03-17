package ni;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import op.C11699j;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lni/h;", "", "", "isLoading", "", "error", "Lop/j;", "productDetails", "<init>", "(ZLjava/lang/Throwable;Lop/j;)V", "a", "(ZLjava/lang/Throwable;Lop/j;)Lni/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "Lop/j;", "d", "()Lop/j;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f75671a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f75672b;

    /* renamed from: c  reason: collision with root package name */
    private final C11699j f75673c;

    public h(boolean z10, Throwable th2, C11699j jVar) {
        this.f75671a = z10;
        this.f75672b = th2;
        this.f75673c = jVar;
    }

    public static /* synthetic */ h b(h hVar, boolean z10, Throwable th2, C11699j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = hVar.f75671a;
        }
        if ((i10 & 2) != 0) {
            th2 = hVar.f75672b;
        }
        if ((i10 & 4) != 0) {
            jVar = hVar.f75673c;
        }
        return hVar.a(z10, th2, jVar);
    }

    public final h a(boolean z10, Throwable th2, C11699j jVar) {
        return new h(z10, th2, jVar);
    }

    public final Throwable c() {
        return this.f75672b;
    }

    public final C11699j d() {
        return this.f75673c;
    }

    public final boolean e() {
        return this.f75671a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f75671a == hVar.f75671a && C17542s.e(this.f75672b, hVar.f75672b) && C17542s.e(this.f75673c, hVar.f75673c);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f75671a) * 31;
        Throwable th2 = this.f75672b;
        int i10 = 0;
        int hashCode2 = (hashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        C11699j jVar = this.f75673c;
        if (jVar != null) {
            i10 = jVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        boolean z10 = this.f75671a;
        Throwable th2 = this.f75672b;
        C11699j jVar = this.f75673c;
        return "ProductDetailsState(isLoading=" + z10 + ", error=" + th2 + ", productDetails=" + jVar + ")";
    }
}
