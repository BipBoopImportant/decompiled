package WJ;

import QJ.C16287E;
import QJ.C16294a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188DX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LWJ/z;", "T", "LQJ/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "LdI/i;", "context", "LdI/e;", "uCont", "<init>", "(LdI/i;LdI/e;)V", "", "state", "LXH/N;", "L", "(Ljava/lang/Object;)V", "f1", "()V", "b1", "d", "LdI/e;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "z0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class z<T> extends C16294a<T> implements e {

    /* renamed from: d  reason: collision with root package name */
    public final C17164e<T> f139586d;

    public z(C17168i iVar, C17164e<? super T> eVar) {
        super(iVar, true, true);
        this.f139586d = eVar;
    }

    /* access modifiers changed from: protected */
    public void L(Object obj) {
        C16748i.b(C17187b.c(this.f139586d), C16287E.a(obj, this.f139586d));
    }

    /* access modifiers changed from: protected */
    public void b1(Object obj) {
        C17164e<T> eVar = this.f139586d;
        eVar.resumeWith(C16287E.a(obj, eVar));
    }

    public void f1() {
    }

    public final e getCallerFrame() {
        C17164e<T> eVar = this.f139586d;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean z0() {
        return true;
    }
}
