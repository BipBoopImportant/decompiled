package w0;

import E1.c0;
import YH.C16877v;
import kotlin.Metadata;
import v0.C6147m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Lw0/d;", "Lv0/m;", "Lw0/E;", "state", "<init>", "(Lw0/E;)V", "LXH/N;", "b", "()V", "a", "Lw0/E;", "getState", "()Lw0/E;", "", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.d  reason: case insensitive filesystem */
public final class C6197d implements C6147m {

    /* renamed from: a  reason: collision with root package name */
    private final C6192E f31178a;

    public C6197d(C6192E e10) {
        this.f31178a = e10;
    }

    public int a() {
        return this.f31178a.w().f();
    }

    public void b() {
        c0 D10 = this.f31178a.D();
        if (D10 != null) {
            D10.g();
        }
    }

    public boolean c() {
        return !this.f31178a.w().i().isEmpty();
    }

    public int d() {
        return this.f31178a.r();
    }

    public int e() {
        return ((C6202i) C16877v.I0(this.f31178a.w().i())).getIndex();
    }
}
