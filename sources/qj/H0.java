package QJ;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00078\u0010X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078PX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LQJ/H0;", "LQJ/L0;", "LQJ/A;", "LQJ/F0;", "parent", "<init>", "(LQJ/F0;)V", "", "b1", "()Z", "l", "", "exception", "g", "(Ljava/lang/Throwable;)Z", "c", "Z", "l0", "handlesException", "m0", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class H0 extends L0 implements C16283A {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f137565c = b1();

    public H0(F0 f02) {
        super(true);
        x0(f02);
    }

    private final boolean b1() {
        L0 v10;
        C16333u q02 = q0();
        C16335v vVar = q02 instanceof C16335v ? (C16335v) q02 : null;
        if (!(vVar == null || (v10 = vVar.v()) == null)) {
            while (!v10.l0()) {
                C16333u q03 = v10.q0();
                C16335v vVar2 = q03 instanceof C16335v ? (C16335v) q03 : null;
                if (vVar2 != null) {
                    v10 = vVar2.v();
                    if (v10 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(Throwable th2) {
        return E0(new C16285C(th2, false, 2, (DefaultConstructorMarker) null));
    }

    public boolean l() {
        return E0(C16807N.f139792a);
    }

    public boolean l0() {
        return this.f137565c;
    }

    public boolean m0() {
        return true;
    }
}
