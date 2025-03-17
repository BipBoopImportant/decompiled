package t0;

import XH.C16807N;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import n0.C5589L;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import v0.C6142h;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0019\u001a\u00020\u000e2\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010$\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001e¨\u0006%"}, d2 = {"Lt0/e;", "Lv0/h;", "Lt0/A;", "state", "<init>", "(Lt0/A;)V", "Lt0/p;", "layoutInfo", "", "h", "(Lt0/p;)I", "Lp0/A;", "index", "scrollOffset", "LXH/N;", "e", "(Lp0/A;II)V", "targetIndex", "", "c", "(I)F", "Lkotlin/Function2;", "LdI/e;", "", "block", "d", "(LnI/p;LdI/e;)Ljava/lang/Object;", "a", "Lt0/A;", "g", "()I", "firstVisibleItemIndex", "f", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements C6142h {

    /* renamed from: a  reason: collision with root package name */
    private final C5934A f29188a;

    public e(C5934A a10) {
        this.f29188a = a10;
    }

    private final int h(p pVar) {
        List<k> i10 = pVar.i();
        int size = i10.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += i10.get(i12).a();
        }
        return (i11 / i10.size()) + pVar.g();
    }

    public int a() {
        return this.f29188a.x().f();
    }

    public int b() {
        k kVar = (k) C16877v.K0(this.f29188a.x().i());
        if (kVar != null) {
            return kVar.getIndex();
        }
        return 0;
    }

    public float c(int i10) {
        k kVar;
        p x10 = this.f29188a.x();
        if (x10.i().isEmpty()) {
            return 0.0f;
        }
        List<k> i11 = x10.i();
        int size = i11.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                kVar = null;
                break;
            }
            kVar = i11.get(i12);
            if (kVar.getIndex() == i10) {
                break;
            }
            i12++;
        }
        k kVar2 = kVar;
        return kVar2 == null ? ((float) (h(x10) * (i10 - g()))) - ((float) f()) : (float) kVar2.c();
    }

    public Object d(p<? super C5678A, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object a10 = C5681D.a(this.f29188a, (C5589L) null, pVar, eVar, 1, (Object) null);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public void e(C5678A a10, int i10, int i11) {
        this.f29188a.O(i10, i11, true);
    }

    public int f() {
        return this.f29188a.t();
    }

    public int g() {
        return this.f29188a.s();
    }
}
