package TJ;

import QJ.C16324p;
import UJ.C16610c;
import UJ.C16611d;
import WJ.C16742c;
import XH.C16807N;
import XH.x;
import d0.i;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LTJ/T;", "LUJ/d;", "LTJ/Q;", "<init>", "()V", "flow", "", "d", "(LTJ/Q;)Z", "", "LdI/e;", "LXH/N;", "f", "(LTJ/Q;)[LdI/e;", "g", "h", "()Z", "e", "(LdI/e;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.T  reason: case insensitive filesystem */
final class C16522T extends C16611d<C16520Q<?>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Object> f138602a = new AtomicReference<>((Object) null);

    /* renamed from: d */
    public boolean a(C16520Q<?> q10) {
        if (C16742c.a(this.f138602a) != null) {
            return false;
        }
        C16742c.b(this.f138602a, C16521S.f138600a);
        return true;
    }

    public final Object e(C17164e<? super C16807N> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        if (!i.a(this.f138602a, C16521S.f138600a, pVar)) {
            x.a aVar = x.f139812b;
            pVar.resumeWith(x.b(C16807N.f139792a));
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    /* renamed from: f */
    public C17164e<C16807N>[] b(C16520Q<?> q10) {
        C16742c.b(this.f138602a, null);
        return C16610c.f139095a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this.f138602a;
        while (true) {
            Object a10 = C16742c.a(atomicReference);
            if (a10 != null && a10 != C16521S.f138601b) {
                if (a10 == C16521S.f138600a) {
                    if (i.a(this.f138602a, a10, C16521S.f138601b)) {
                        return;
                    }
                } else if (i.a(this.f138602a, a10, C16521S.f138600a)) {
                    x.a aVar = x.f139812b;
                    ((C16324p) a10).resumeWith(x.b(C16807N.f139792a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f138602a.getAndSet(C16521S.f138600a);
        C17542s.g(andSet);
        return andSet == C16521S.f138601b;
    }
}
