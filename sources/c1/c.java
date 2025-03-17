package c1;

import U0.C4889m;
import U0.C4895p;
import U0.K0;
import U0.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"", "bits", "slot", "a", "(II)I", "g", "(I)I", "d", "LU0/K0;", "other", "", "f", "(LU0/K0;LU0/K0;)Z", "LU0/m;", "composer", "key", "tracked", "", "block", "Lc1/a;", "b", "(LU0/m;IZLjava/lang/Object;)Lc1/a;", "c", "(IZLjava/lang/Object;)Lc1/a;", "e", "(IZLjava/lang/Object;LU0/m;I)Lc1/a;", "Ljava/lang/Object;", "lambdaKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f23015a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final C5264a b(C4889m mVar, int i10, boolean z10, Object obj) {
        C5265b bVar;
        mVar.H(Integer.rotateLeft(i10, 1), f23015a);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            bVar = new C5265b(i10, z10, obj);
            mVar.u(bVar);
        } else {
            C17542s.h(D10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (C5265b) D10;
            bVar.k(obj);
        }
        mVar.T();
        return bVar;
    }

    public static final C5264a c(int i10, boolean z10, Object obj) {
        return new C5265b(i10, z10, obj);
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final C5264a e(int i10, boolean z10, Object obj, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = new C5265b(i10, z10, obj);
            mVar.u(D10);
        }
        C5265b bVar = (C5265b) D10;
        bVar.k(obj);
        if (C4895p.J()) {
            C4895p.R();
        }
        return bVar;
    }

    public static final boolean f(K0 k02, K0 k03) {
        if (k02 != null) {
            if ((k02 instanceof L0) && (k03 instanceof L0)) {
                L0 l02 = (L0) k02;
                if (!l02.r() || C17542s.e(k02, k03) || C17542s.e(l02.i(), ((L0) k03).i())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static final int g(int i10) {
        return a(1, i10);
    }
}
