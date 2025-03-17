package m0;

import XH.C16796C;
import XH.v;
import YH.X;
import c2.h;
import c2.j;
import c2.n;
import c2.o;
import c2.r;
import c2.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.r;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\".\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0010\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017\"\u0015\u0010\u0010\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001a\"\u0015\u0010\u0010\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0015\u0010\u0010\u001a\u00020 *\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lo1/i;", "a", "Lo1/i;", "rectVisibilityThreshold", "", "Lm0/z0;", "", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "visibilityThresholdMap", "Lc2/n$a;", "Lc2/n;", "c", "(Lc2/n$a;)J", "VisibilityThreshold", "Lo1/g$a;", "Lo1/g;", "e", "(Lo1/g$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/r;)I", "Lc2/h$a;", "Lc2/h;", "(Lc2/h$a;)F", "Lo1/m$a;", "Lo1/m;", "f", "(Lo1/m$a;)J", "Lc2/r$a;", "Lc2/r;", "d", "(Lc2/r$a;)J", "Lo1/i$a;", "g", "(Lo1/i$a;)Lo1/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class P0 {

    /* renamed from: a  reason: collision with root package name */
    private static final C5669i f25613a = new C5669i(0.5f, 0.5f, 0.5f, 0.5f);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<z0<?, ?>, Float> f25614b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        z0<Integer, C5554m> g10 = B0.g(r.f144386a);
        Float valueOf2 = Float.valueOf(1.0f);
        v<A, B> a10 = C16796C.a(g10, valueOf2);
        v<A, B> a11 = C16796C.a(B0.e(c2.r.f23053b), valueOf2);
        v<A, B> a12 = C16796C.a(B0.d(n.f23044b), valueOf2);
        v<A, B> a13 = C16796C.a(B0.f(C17536l.f144385a), Float.valueOf(0.01f));
        v<A, B> a14 = C16796C.a(B0.i(C5669i.f26706e), valueOf);
        v<A, B> a15 = C16796C.a(B0.j(C5673m.f26722b), valueOf);
        v<A, B> a16 = C16796C.a(B0.h(C5667g.f26701b), valueOf);
        z0<h, C5554m> b10 = B0.b(h.f23031b);
        Float valueOf3 = Float.valueOf(0.1f);
        f25614b = X.m(a10, a11, a12, a13, a14, a15, a16, C16796C.a(b10, valueOf3), C16796C.a(B0.c(j.f23036b), valueOf3));
    }

    public static final float a(h.a aVar) {
        return h.B(0.1f);
    }

    public static final int b(r rVar) {
        return 1;
    }

    public static final long c(n.a aVar) {
        return o.a(1, 1);
    }

    public static final long d(r.a aVar) {
        return s.a(1, 1);
    }

    public static final long e(C5667g.a aVar) {
        return C5668h.a(0.5f, 0.5f);
    }

    public static final long f(C5673m.a aVar) {
        return C5674n.a(0.5f, 0.5f);
    }

    public static final C5669i g(C5669i.a aVar) {
        return f25613a;
    }

    public static final Map<z0<?, ?>, Float> h() {
        return f25614b;
    }
}
