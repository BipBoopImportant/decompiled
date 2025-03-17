package UJ;

import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LUJ/A;", "T", "LdI/e;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "LdI/i;", "context", "<init>", "(LdI/e;LdI/i;)V", "LXH/x;", "result", "LXH/N;", "resumeWith", "(Ljava/lang/Object;)V", "a", "LdI/e;", "b", "LdI/i;", "getContext", "()LdI/i;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.A  reason: case insensitive filesystem */
final class C16605A<T> implements C17164e<T>, e {

    /* renamed from: a  reason: collision with root package name */
    private final C17164e<T> f139082a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f139083b;

    public C16605A(C17164e<? super T> eVar, C17168i iVar) {
        this.f139082a = eVar;
        this.f139083b = iVar;
    }

    public e getCallerFrame() {
        C17164e<T> eVar = this.f139082a;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public C17168i getContext() {
        return this.f139083b;
    }

    public void resumeWith(Object obj) {
        this.f139082a.resumeWith(obj);
    }
}
