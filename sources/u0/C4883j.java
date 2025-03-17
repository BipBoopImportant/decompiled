package U0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LXH/N;", "c", "()V", "LU0/r;", "d", "(LU0/m;I)LU0/r;", "LU0/K0;", "b", "(LU0/m;I)LU0/K0;", "currentRecomposeScope", "", "a", "(LU0/m;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.j  reason: case insensitive filesystem */
public final class C4883j {
    public static final int a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int R10 = mVar.R();
        if (C4895p.J()) {
            C4895p.R();
        }
        return R10;
    }

    public static final K0 b(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        K0 A10 = mVar.A();
        if (A10 != null) {
            mVar.M(A10);
            if (C4895p.J()) {
                C4895p.R();
            }
            return A10;
        }
        throw new IllegalStateException("no recompose scope found");
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final r d(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        r S10 = mVar.S();
        if (C4895p.J()) {
            C4895p.R();
        }
        return S10;
    }
}
