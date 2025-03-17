package B0;

import T1.H;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LB0/r0;", "LT1/H;", "delegate", "", "originalLength", "transformedLength", "<init>", "(LT1/H;II)V", "offset", "b", "(I)I", "a", "LT1/H;", "c", "I", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class r0 implements H {

    /* renamed from: b  reason: collision with root package name */
    private final H f5130b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5131c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5132d;

    public r0(H h10, int i10, int i11) {
        this.f5130b = h10;
        this.f5131c = i10;
        this.f5132d = i11;
    }

    public int a(int i10) {
        int a10 = this.f5130b.a(i10);
        if (i10 >= 0 && i10 <= this.f5132d) {
            s0.h(a10, this.f5131c, i10);
        }
        return a10;
    }

    public int b(int i10) {
        int b10 = this.f5130b.b(i10);
        if (i10 >= 0 && i10 <= this.f5131c) {
            s0.g(b10, this.f5132d, i10);
        }
        return b10;
    }
}
