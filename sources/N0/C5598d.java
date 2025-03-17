package n0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5732n0;
import p1.J0;
import p1.U0;
import p1.Y;
import r1.C5815a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ln0/d;", "", "Lp1/J0;", "imageBitmap", "Lp1/n0;", "canvas", "Lr1/a;", "canvasDrawScope", "Lp1/U0;", "borderPath", "<init>", "(Lp1/J0;Lp1/n0;Lr1/a;Lp1/U0;)V", "g", "()Lp1/U0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp1/J0;", "b", "Lp1/n0;", "c", "Lr1/a;", "d", "Lp1/U0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.d  reason: case insensitive filesystem */
final class C5598d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public J0 f26426a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C5732n0 f26427b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C5815a f26428c;

    /* renamed from: d  reason: collision with root package name */
    private U0 f26429d;

    public C5598d() {
        this((J0) null, (C5732n0) null, (C5815a) null, (U0) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5598d)) {
            return false;
        }
        C5598d dVar = (C5598d) obj;
        return C17542s.e(this.f26426a, dVar.f26426a) && C17542s.e(this.f26427b, dVar.f26427b) && C17542s.e(this.f26428c, dVar.f26428c) && C17542s.e(this.f26429d, dVar.f26429d);
    }

    public final U0 g() {
        U0 u02 = this.f26429d;
        if (u02 != null) {
            return u02;
        }
        U0 a10 = Y.a();
        this.f26429d = a10;
        return a10;
    }

    public int hashCode() {
        J0 j02 = this.f26426a;
        int i10 = 0;
        int hashCode = (j02 == null ? 0 : j02.hashCode()) * 31;
        C5732n0 n0Var = this.f26427b;
        int hashCode2 = (hashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        C5815a aVar = this.f26428c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        U0 u02 = this.f26429d;
        if (u02 != null) {
            i10 = u02.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f26426a + ", canvas=" + this.f26427b + ", canvasDrawScope=" + this.f26428c + ", borderPath=" + this.f26429d + ')';
    }

    public C5598d(J0 j02, C5732n0 n0Var, C5815a aVar, U0 u02) {
        this.f26426a = j02;
        this.f26427b = n0Var;
        this.f26428c = aVar;
        this.f26429d = u02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5598d(J0 j02, C5732n0 n0Var, C5815a aVar, U0 u02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : j02, (i10 & 2) != 0 ? null : n0Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : u02);
    }
}
