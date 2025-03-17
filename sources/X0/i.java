package x0;

import E1.c0;
import YH.C16877v;
import kotlin.Metadata;
import v0.C6147m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"Lx0/i;", "Lv0/m;", "Lx0/C;", "state", "", "beyondViewportPageCount", "<init>", "(Lx0/C;I)V", "LXH/N;", "b", "()V", "a", "Lx0/C;", "I", "()I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements C6147m {

    /* renamed from: a  reason: collision with root package name */
    private final C6230C f31704a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31705b;

    public i(C6230C c10, int i10) {
        this.f31704a = c10;
        this.f31705b = i10;
    }

    public int a() {
        return this.f31704a.G();
    }

    public void b() {
        c0 P10 = this.f31704a.P();
        if (P10 != null) {
            P10.g();
        }
    }

    public boolean c() {
        return !this.f31704a.C().i().isEmpty();
    }

    public int d() {
        return Math.max(0, this.f31704a.y() - this.f31705b);
    }

    public int e() {
        return Math.min(a() - 1, ((C6238f) C16877v.I0(this.f31704a.C().i())).getIndex() + this.f31705b);
    }
}
