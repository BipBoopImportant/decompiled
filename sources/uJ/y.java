package Uj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LUj/y;", "", "", "isLoading", "LUj/x;", "error", "LUj/w;", "data", "LUj/u;", "navigateTo", "<init>", "(ZLUj/x;LUj/w;LUj/u;)V", "a", "(ZLUj/x;LUj/w;LUj/u;)LUj/y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "LUj/x;", "d", "()LUj/x;", "c", "LUj/w;", "()LUj/w;", "LUj/u;", "e", "()LUj/u;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f88284a;

    /* renamed from: b  reason: collision with root package name */
    private final x f88285b;

    /* renamed from: c  reason: collision with root package name */
    private final w f88286c;

    /* renamed from: d  reason: collision with root package name */
    private final u f88287d;

    public y() {
        this(false, (x) null, (w) null, (u) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ y b(y yVar, boolean z10, x xVar, w wVar, u uVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = yVar.f88284a;
        }
        if ((i10 & 2) != 0) {
            xVar = yVar.f88285b;
        }
        if ((i10 & 4) != 0) {
            wVar = yVar.f88286c;
        }
        if ((i10 & 8) != 0) {
            uVar = yVar.f88287d;
        }
        return yVar.a(z10, xVar, wVar, uVar);
    }

    public final y a(boolean z10, x xVar, w wVar, u uVar) {
        return new y(z10, xVar, wVar, uVar);
    }

    public final w c() {
        return this.f88286c;
    }

    public final x d() {
        return this.f88285b;
    }

    public final u e() {
        return this.f88287d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f88284a == yVar.f88284a && C17542s.e(this.f88285b, yVar.f88285b) && C17542s.e(this.f88286c, yVar.f88286c) && C17542s.e(this.f88287d, yVar.f88287d);
    }

    public final boolean f() {
        return this.f88284a;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f88284a) * 31;
        x xVar = this.f88285b;
        int i10 = 0;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        w wVar = this.f88286c;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        u uVar = this.f88287d;
        if (uVar != null) {
            i10 = uVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        boolean z10 = this.f88284a;
        x xVar = this.f88285b;
        w wVar = this.f88286c;
        u uVar = this.f88287d;
        return "UiState(isLoading=" + z10 + ", error=" + xVar + ", data=" + wVar + ", navigateTo=" + uVar + ")";
    }

    public y(boolean z10, x xVar, w wVar, u uVar) {
        this.f88284a = z10;
        this.f88285b = xVar;
        this.f88286c = wVar;
        this.f88287d = uVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(boolean z10, x xVar, w wVar, u uVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : xVar, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? null : uVar);
    }
}
