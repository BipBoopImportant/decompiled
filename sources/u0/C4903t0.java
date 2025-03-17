package U0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010 \u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001f¨\u0006!"}, d2 = {"LU0/t0;", "N", "LU0/f;", "applier", "", "offset", "<init>", "(LU0/f;I)V", "node", "LXH/N;", "g", "(Ljava/lang/Object;)V", "i", "()V", "index", "instance", "d", "(ILjava/lang/Object;)V", "f", "count", "b", "(II)V", "from", "to", "c", "(III)V", "clear", "a", "LU0/f;", "I", "nesting", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.t0  reason: case insensitive filesystem */
public final class C4903t0<N> implements C4872f<N> {

    /* renamed from: a  reason: collision with root package name */
    private final C4872f<N> f14165a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14166b;

    /* renamed from: c  reason: collision with root package name */
    private int f14167c;

    public C4903t0(C4872f<N> fVar, int i10) {
        this.f14165a = fVar;
        this.f14166b = i10;
    }

    public N a() {
        return this.f14165a.a();
    }

    public void b(int i10, int i11) {
        this.f14165a.b(i10 + (this.f14167c == 0 ? this.f14166b : 0), i11);
    }

    public void c(int i10, int i11, int i12) {
        int i13 = this.f14167c == 0 ? this.f14166b : 0;
        this.f14165a.c(i10 + i13, i11 + i13, i12);
    }

    public void clear() {
        C4895p.s("Clear is not valid on OffsetApplier");
    }

    public void d(int i10, N n10) {
        this.f14165a.d(i10 + (this.f14167c == 0 ? this.f14166b : 0), n10);
    }

    public void f(int i10, N n10) {
        this.f14165a.f(i10 + (this.f14167c == 0 ? this.f14166b : 0), n10);
    }

    public void g(N n10) {
        this.f14167c++;
        this.f14165a.g(n10);
    }

    public void i() {
        if (!(this.f14167c > 0)) {
            C4895p.s("OffsetApplier up called with no corresponding down");
        }
        this.f14167c--;
        this.f14165a.i();
    }
}
