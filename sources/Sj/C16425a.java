package SJ;

import QJ.C16332t0;
import QJ.F0;
import QJ.O;
import QJ.V;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSJ/a;", "E", "LSJ/k;", "LSJ/c;", "LdI/i;", "parentContext", "LSJ/j;", "channel", "", "active", "<init>", "(LdI/i;LSJ/j;Z)V", "", "cause", "LXH/N;", "K0", "(Ljava/lang/Throwable;)V", "exception", "v0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.a  reason: case insensitive filesystem */
class C16425a<E> extends C16435k<E> implements C16427c<E> {
    public C16425a(C17168i iVar, C16434j<E> jVar, boolean z10) {
        super(iVar, jVar, false, z10);
        x0((F0) iVar.get(F0.f137562d0));
    }

    /* access modifiers changed from: protected */
    public void K0(Throwable th2) {
        C16434j f12 = f1();
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = C16332t0.a(V.a(this) + " was cancelled", th2);
            }
        }
        f12.i(cancellationException);
    }

    /* access modifiers changed from: protected */
    public boolean v0(Throwable th2) {
        O.a(getContext(), th2);
        return true;
    }
}
