package U0;

import YH.C16870n;
import g1.C5353v;
import g1.C5355x;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "value", "LU0/o1;", "policy", "LU0/r0;", "d", "(Ljava/lang/Object;LU0/o1;)LU0/r0;", "Lg1/v;", "a", "()Lg1/v;", "", "elements", "b", "([Ljava/lang/Object;)Lg1/v;", "", "g", "(Ljava/util/Collection;)Lg1/v;", "K", "V", "Lg1/x;", "c", "()Lg1/x;", "newValue", "LU0/A1;", "f", "(Ljava/lang/Object;LU0/m;I)LU0/A1;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class u1 {
    public static final <T> C5353v<T> a() {
        return new C5353v<>();
    }

    public static final <T> C5353v<T> b(T... tArr) {
        C5353v<T> vVar = new C5353v<>();
        vVar.addAll(C16870n.c1(tArr));
        return vVar;
    }

    public static final <K, V> C5355x<K, V> c() {
        return new C5355x<>();
    }

    public static final <T> C4899r0<T> d(T t10, o1<T> o1Var) {
        return C4860b.d(t10, o1Var);
    }

    public static /* synthetic */ C4899r0 e(Object obj, o1 o1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            o1Var = p1.s();
        }
        return p1.i(obj, o1Var);
    }

    public static final <T> A1<T> f(T t10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = e(t10, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        r0Var.setValue(t10);
        if (C4895p.J()) {
            C4895p.R();
        }
        return r0Var;
    }

    public static final <T> C5353v<T> g(Collection<? extends T> collection) {
        C5353v<T> vVar = new C5353v<>();
        vVar.addAll(collection);
        return vVar;
    }
}
