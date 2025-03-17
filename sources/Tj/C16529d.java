package TJ;

import SJ.C16428d;
import SJ.C16449y;
import UJ.C16612e;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LTJ/d;", "T", "LUJ/e;", "Lkotlin/Function2;", "LSJ/y;", "LdI/e;", "LXH/N;", "", "block", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LnI/p;LdI/i;ILSJ/d;)V", "scope", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "d", "LnI/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.d  reason: case insensitive filesystem */
class C16529d<T> extends C16612e<T> {

    /* renamed from: d  reason: collision with root package name */
    private final p<C16449y<? super T>, C17164e<? super C16807N>, Object> f138628d;

    public C16529d(p<? super C16449y<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17168i iVar, int i10, C16428d dVar) {
        super(iVar, i10, dVar);
        this.f138628d = pVar;
    }

    static /* synthetic */ <T> Object o(C16529d<T> dVar, C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        Object invoke = dVar.f138628d.invoke(yVar, eVar);
        return invoke == C17187b.f() ? invoke : C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public Object i(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        return o(this, yVar, eVar);
    }

    public String toString() {
        return "block[" + this.f138628d + "] -> " + super.toString();
    }
}
