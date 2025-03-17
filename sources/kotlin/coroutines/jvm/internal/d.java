package kotlin.coroutines.jvm.internal;

import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "LdI/e;", "", "completion", "LdI/i;", "_context", "<init>", "(LdI/e;LdI/i;)V", "(LdI/e;)V", "intercepted", "()LdI/e;", "LXH/N;", "releaseIntercepted", "()V", "LdI/i;", "LdI/e;", "getContext", "()LdI/i;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d extends a {
    private final C17168i _context;
    private transient C17164e<Object> intercepted;

    public d(C17164e<Object> eVar, C17168i iVar) {
        super(eVar);
        this._context = iVar;
    }

    public C17168i getContext() {
        C17168i iVar = this._context;
        C17542s.g(iVar);
        return iVar;
    }

    public final C17164e<Object> intercepted() {
        C17164e<Object> eVar = this.intercepted;
        if (eVar == null) {
            C17165f fVar = (C17165f) getContext().get(C17165f.f142966s0);
            if (fVar == null || (eVar = fVar.f0(this)) == null) {
                eVar = this;
            }
            this.intercepted = eVar;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C17164e<Object> eVar = this.intercepted;
        if (!(eVar == null || eVar == this)) {
            C17168i.b bVar = getContext().get(C17165f.f142966s0);
            C17542s.g(bVar);
            ((C17165f) bVar).t(eVar);
        }
        this.intercepted = c.f144333a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(C17164e<Object> eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
