package j0;

import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lj0/B;", "Lj0/h;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "g", "capacity", "f", "e", "()V", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B extends C5452h {

    /* renamed from: e  reason: collision with root package name */
    private int f24518e;

    public B(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        g(Y.g(i10));
    }

    private final void e() {
        this.f24518e = Y.c(b()) - this.f24618d;
    }

    private final void f(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24615a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        e();
    }

    private final void g(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24617c = max;
        f(max);
        this.f24616b = new float[max];
    }
}
