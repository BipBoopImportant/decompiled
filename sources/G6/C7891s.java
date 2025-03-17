package g6;

import WK.C16762E;
import WK.C16771f;
import WK.C16772g;
import WK.C16777l;
import WK.y;
import XH.C16807N;
import XH.C16816g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0001\u0003\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lg6/s;", "Lg6/r;", "LWK/g;", "source", "e", "(LWK/g;)LWK/g;", "LWK/f;", "sink", "LXH/N;", "l", "(LWK/g;LWK/f;LdI/e;)Ljava/lang/Object;", "LWK/l;", "fileSystem", "LWK/E;", "path", "n", "(LWK/g;LWK/l;LWK/E;LdI/e;)Ljava/lang/Object;", "d", "(LWK/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWK/g;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
/* renamed from: g6.s  reason: case insensitive filesystem */
final class C7891s implements C7890r {

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f51341a;

    private /* synthetic */ C7891s(C16772g gVar) {
        this.f51341a = gVar;
    }

    public static final /* synthetic */ C7891s c(C16772g gVar) {
        return new C7891s(gVar);
    }

    public static void d(C16772g gVar) {
        gVar.close();
    }

    public static C16772g e(C16772g gVar) {
        return gVar;
    }

    public static boolean f(C16772g gVar, Object obj) {
        return (obj instanceof C7891s) && C17542s.e(gVar, ((C7891s) obj).i());
    }

    public static int g(C16772g gVar) {
        return gVar.hashCode();
    }

    public static String h(C16772g gVar) {
        return "SourceResponseBody(source=" + gVar + ')';
    }

    public static Object l(C16772g gVar, C16771f fVar, C17164e<? super C16807N> eVar) {
        gVar.L2(fVar);
        return C16807N.f139792a;
    }

    public static Object n(C16772g gVar, C16777l lVar, C16762E e10, C17164e<? super C16807N> eVar) {
        C16771f c10 = y.c(lVar.z(e10, false));
        try {
            b.f(gVar.L2(c10));
            if (c10 != null) {
                try {
                    c10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            C16816g.a(th, th3);
        }
        if (th == null) {
            return C16807N.f139792a;
        }
        throw th;
    }

    public Object A(C16771f fVar, C17164e<? super C16807N> eVar) {
        return l(this.f51341a, fVar, eVar);
    }

    public Object B2(C16777l lVar, C16762E e10, C17164e<? super C16807N> eVar) {
        return n(this.f51341a, lVar, e10, eVar);
    }

    public void close() {
        d(this.f51341a);
    }

    public boolean equals(Object obj) {
        return f(this.f51341a, obj);
    }

    public int hashCode() {
        return g(this.f51341a);
    }

    public final /* synthetic */ C16772g i() {
        return this.f51341a;
    }

    public String toString() {
        return h(this.f51341a);
    }
}
