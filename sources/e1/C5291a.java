package e1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Le1/a;", "", "", "isComposable", "", "realParamsCount", "changedParams", "defaultParams", "<init>", "(ZIII)V", "a", "()I", "b", "c", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "I", "getRealParamsCount", "getChangedParams", "getDefaultParams", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e1.a  reason: case insensitive filesystem */
public final class C5291a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f23229a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23230b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23231c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23232d;

    public C5291a(boolean z10, int i10, int i11, int i12) {
        this.f23229a = z10;
        this.f23230b = i10;
        this.f23231c = i11;
        this.f23232d = i12;
    }

    public final int a() {
        return this.f23230b;
    }

    public final int b() {
        return this.f23231c;
    }

    public final int c() {
        return this.f23232d;
    }

    public final boolean d() {
        return this.f23229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5291a)) {
            return false;
        }
        C5291a aVar = (C5291a) obj;
        return this.f23229a == aVar.f23229a && this.f23230b == aVar.f23230b && this.f23231c == aVar.f23231c && this.f23232d == aVar.f23232d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f23229a) * 31) + Integer.hashCode(this.f23230b)) * 31) + Integer.hashCode(this.f23231c)) * 31) + Integer.hashCode(this.f23232d);
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.f23229a + ", realParamsCount=" + this.f23230b + ", changedParams=" + this.f23231c + ", defaultParams=" + this.f23232d + ')';
    }
}
