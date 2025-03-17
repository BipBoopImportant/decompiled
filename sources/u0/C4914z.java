package U0;

import c1.e;
import c1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "LU0/B0;", "LU0/v;", "key", "", "a", "(LU0/B0;LU0/v;)Z", "b", "(LU0/B0;LU0/v;)Ljava/lang/Object;", "", "LU0/J0;", "values", "parentScope", "previous", "c", "([LU0/J0;LU0/B0;LU0/B0;)LU0/B0;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.z  reason: case insensitive filesystem */
public final class C4914z {
    public static final <T> boolean a(B0 b02, C4906v<T> vVar) {
        C17542s.h(vVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return b02.containsKey(vVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [U0.v, U0.v<T>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T b(U0.B0 r1, U0.C4906v<T> r2) {
        /*
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            kotlin.jvm.internal.C17542s.h(r2, r0)
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x000f
            U0.G1 r0 = r2.a()
        L_0x000f:
            U0.G1 r0 = (U0.G1) r0
            java.lang.Object r1 = r0.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4914z.b(U0.B0, U0.v):java.lang.Object");
    }

    public static final B0 c(J0<?>[] j0Arr, B0 b02, B0 b03) {
        e.a z10 = f.a().o();
        for (J0<?> j02 : j0Arr) {
            C4906v<?> b10 = j02.b();
            C17542s.h(b10, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            I0 i02 = (I0) b10;
            if (j02.a() || !a(b02, i02)) {
                C17542s.h(j02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                z10.put(i02, i02.b(j02, (G1) b03.get(i02)));
            }
        }
        return z10.g();
    }

    public static /* synthetic */ B0 d(J0[] j0Arr, B0 b02, B0 b03, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            b03 = f.a();
        }
        return c(j0Arr, b02, b03);
    }
}
