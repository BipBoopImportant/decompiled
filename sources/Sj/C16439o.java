package SJ;

import QJ.q1;
import TH.C16488b;
import WJ.C16732A;
import WJ.w;
import XH.C16807N;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0001\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0019\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\r8\u0002X\u0004¨\u00064"}, d2 = {"LSJ/o;", "E", "LWJ/A;", "", "id", "prev", "LSJ/h;", "channel", "", "pointers", "<init>", "(JLSJ/o;LSJ/h;I)V", "index", "", "value", "LXH/N;", "(ILjava/lang/Object;)V", "element", "G", "A", "(I)Ljava/lang/Object;", "D", "w", "(I)V", "B", "F", "from", "to", "", "v", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "x", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "LdI/i;", "context", "s", "(ILjava/lang/Throwable;LdI/i;)V", "receiver", "C", "(IZ)V", "e", "LSJ/h;", "_channel", "y", "()LSJ/h;", "r", "()I", "numberOfSlots", "data", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.o  reason: case insensitive filesystem */
public final class C16439o<E> extends C16732A<C16439o<E>> {

    /* renamed from: e  reason: collision with root package name */
    private final C16432h<E> f138334e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f138335f = new AtomicReferenceArray(C16433i.f138307b * 2);

    public C16439o(long j10, C16439o<E> oVar, C16432h<E> hVar, int i10) {
        super(j10, oVar, i10);
        this.f138334e = hVar;
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f138335f;
    }

    public final E A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().u1((this.f139524c * ((long) C16433i.f138307b)) + ((long) i10));
        }
        t();
    }

    public final E D(int i10) {
        E A10 = A(i10);
        w(i10);
        return A10;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, E e10) {
        E(i10, e10);
    }

    public int r() {
        return C16433i.f138307b;
    }

    public void s(int i10, Throwable th2, C17168i iVar) {
        C17642l<E, C16807N> lVar;
        C17642l<E, C16807N> lVar2;
        int i11 = C16433i.f138307b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object A10 = A(i10);
        while (true) {
            Object B10 = B(i10);
            if ((B10 instanceof q1) || (B10 instanceof C16424C)) {
                if (v(i10, B10, z10 ? C16433i.f138315j : C16433i.f138316k)) {
                    w(i10);
                    C(i10, !z10);
                    if (z10 && (lVar = y().f138287b) != null) {
                        w.a(lVar, A10, iVar);
                        return;
                    }
                    return;
                }
            } else if (B10 == C16433i.f138315j || B10 == C16433i.f138316k) {
                w(i10);
            } else if (!(B10 == C16433i.f138312g || B10 == C16433i.f138311f)) {
                if (B10 != C16433i.f138314i && B10 != C16433i.f138309d && B10 != C16433i.z()) {
                    throw new IllegalStateException(("unexpected state: " + B10).toString());
                }
                return;
            }
        }
        w(i10);
        if (z10 && (lVar2 = y().f138287b) != null) {
            w.a(lVar2, A10, iVar);
        }
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return C16488b.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, (Object) null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final C16432h<E> y() {
        C16432h<E> hVar = this.f138334e;
        C17542s.g(hVar);
        return hVar;
    }
}
