package t0;

import E1.c0;
import YH.C16877v;
import kotlin.Metadata;
import v0.C6147m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001b"}, d2 = {"Lt0/g;", "Lv0/m;", "Lt0/A;", "state", "", "beyondBoundsItemCount", "<init>", "(Lt0/A;I)V", "LXH/N;", "b", "()V", "a", "Lt0/A;", "getState", "()Lt0/A;", "I", "getBeyondBoundsItemCount", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements C6147m {

    /* renamed from: a  reason: collision with root package name */
    private final C5934A f29189a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29190b;

    public g(C5934A a10, int i10) {
        this.f29189a = a10;
        this.f29190b = i10;
    }

    public int a() {
        return this.f29189a.x().f();
    }

    public void b() {
        c0 E10 = this.f29189a.E();
        if (E10 != null) {
            E10.g();
        }
    }

    public boolean c() {
        return !this.f29189a.x().i().isEmpty();
    }

    public int d() {
        return Math.max(0, this.f29189a.s() - this.f29190b);
    }

    public int e() {
        return Math.min(a() - 1, ((k) C16877v.I0(this.f29189a.x().i())).getIndex() + this.f29190b);
    }
}
