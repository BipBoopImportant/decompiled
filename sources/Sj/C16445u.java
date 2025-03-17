package SJ;

import SJ.C16438n;
import WJ.S;
import WJ.w;
import XH.C16807N;
import XH.C16816g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.P;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8TX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LSJ/u;", "E", "LSJ/h;", "", "capacity", "LSJ/d;", "onBufferOverflow", "Lkotlin/Function1;", "LXH/N;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILSJ/d;LnI/l;)V", "element", "", "isSendOp", "LSJ/n;", "x1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "w1", "y", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "m", "I", "n", "LSJ/d;", "B0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.u  reason: case insensitive filesystem */
public class C16445u<E> extends C16432h<E> {

    /* renamed from: m  reason: collision with root package name */
    private final int f138340m;

    /* renamed from: n  reason: collision with root package name */
    private final C16428d f138341n;

    public C16445u(int i10, C16428d dVar, C17642l<? super E, C16807N> lVar) {
        super(i10, lVar);
        this.f138340m = i10;
        this.f138341n = dVar;
        if (dVar == C16428d.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + P.b(C16432h.class).f() + " instead").toString());
        } else if (i10 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
    }

    static /* synthetic */ <E> Object v1(C16445u<E> uVar, E e10, C17164e<? super C16807N> eVar) {
        S c10;
        Object x12 = uVar.x1(e10, true);
        if (!(x12 instanceof C16438n.a)) {
            return C16807N.f139792a;
        }
        C16438n.e(x12);
        C17642l<E, C16807N> lVar = uVar.f138287b;
        if (lVar == null || (c10 = w.c(lVar, e10, (S) null, 2, (Object) null)) == null) {
            throw uVar.n0();
        }
        C16816g.a(c10, uVar.n0());
        throw c10;
    }

    private final Object w1(E e10, boolean z10) {
        C17642l<E, C16807N> lVar;
        S c10;
        Object k10 = super.k(e10);
        if (C16438n.j(k10) || C16438n.i(k10)) {
            return k10;
        }
        if (!z10 || (lVar = this.f138287b) == null || (c10 = w.c(lVar, e10, (S) null, 2, (Object) null)) == null) {
            return C16438n.f138330b.c(C16807N.f139792a);
        }
        throw c10;
    }

    private final Object x1(E e10, boolean z10) {
        return this.f138341n == C16428d.DROP_LATEST ? w1(e10, z10) : l1(e10);
    }

    /* access modifiers changed from: protected */
    public boolean B0() {
        return this.f138341n == C16428d.DROP_OLDEST;
    }

    public Object k(E e10) {
        return x1(e10, false);
    }

    public Object y(E e10, C17164e<? super C16807N> eVar) {
        return v1(this, e10, eVar);
    }
}
