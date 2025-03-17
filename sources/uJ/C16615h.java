package UJ;

import SJ.C16428d;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LUJ/h;", "T", "LUJ/g;", "LTJ/g;", "flow", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LTJ/g;LdI/i;ILSJ/d;)V", "LUJ/e;", "j", "(LdI/i;ILSJ/d;)LUJ/e;", "k", "()LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "r", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.h  reason: case insensitive filesystem */
public final class C16615h<T> extends C16614g<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16615h(C16532g gVar, C17168i iVar, int i10, C16428d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, (i11 & 2) != 0 ? C17169j.f142968a : iVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? C16428d.SUSPEND : dVar);
    }

    /* access modifiers changed from: protected */
    public C16612e<T> j(C17168i iVar, int i10, C16428d dVar) {
        return new C16615h(this.f139106d, iVar, i10, dVar);
    }

    public C16532g<T> k() {
        return this.f139106d;
    }

    /* access modifiers changed from: protected */
    public Object r(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        Object collect = this.f139106d.collect(hVar, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public C16615h(C16532g<? extends T> gVar, C17168i iVar, int i10, C16428d dVar) {
        super(gVar, iVar, i10, dVar);
    }
}
