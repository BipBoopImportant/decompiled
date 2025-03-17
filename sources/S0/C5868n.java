package s0;

import c2.d;
import c2.h;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Ls0/n;", "Ls0/T;", "Lc2/h;", "leftDp", "topDp", "rightDp", "bottomDp", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "F", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.n  reason: case insensitive filesystem */
final class C5868n implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final float f28825b;

    /* renamed from: c  reason: collision with root package name */
    private final float f28826c;

    /* renamed from: d  reason: collision with root package name */
    private final float f28827d;

    /* renamed from: e  reason: collision with root package name */
    private final float f28828e;

    public /* synthetic */ C5868n(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    public int a(d dVar) {
        return dVar.K0(this.f28826c);
    }

    public int b(d dVar) {
        return dVar.K0(this.f28828e);
    }

    public int c(d dVar, t tVar) {
        return dVar.K0(this.f28825b);
    }

    public int d(d dVar, t tVar) {
        return dVar.K0(this.f28827d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5868n)) {
            return false;
        }
        C5868n nVar = (C5868n) obj;
        return h.D(this.f28825b, nVar.f28825b) && h.D(this.f28826c, nVar.f28826c) && h.D(this.f28827d, nVar.f28827d) && h.D(this.f28828e, nVar.f28828e);
    }

    public int hashCode() {
        return (((((h.E(this.f28825b) * 31) + h.E(this.f28826c)) * 31) + h.E(this.f28827d)) * 31) + h.E(this.f28828e);
    }

    public String toString() {
        return "Insets(left=" + h.F(this.f28825b) + ", top=" + h.F(this.f28826c) + ", right=" + h.F(this.f28827d) + ", bottom=" + h.F(this.f28828e) + ')';
    }

    private C5868n(float f10, float f11, float f12, float f13) {
        this.f28825b = f10;
        this.f28826c = f11;
        this.f28827d = f12;
        this.f28828e = f13;
    }
}
