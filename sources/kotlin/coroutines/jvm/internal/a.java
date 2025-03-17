package kotlin.coroutines.jvm.internal;

import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "LdI/e;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "completion", "<init>", "(LdI/e;)V", "LXH/x;", "result", "LXH/N;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(LdI/e;)LdI/e;", "value", "(Ljava/lang/Object;LdI/e;)LdI/e;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "LdI/e;", "getCompletion", "()LdI/e;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements C17164e<Object>, e, Serializable {
    private final C17164e<Object> completion;

    public a(C17164e<Object> eVar) {
        this.completion = eVar;
    }

    public C17164e<C16807N> create(C17164e<?> eVar) {
        C17542s.j(eVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        C17164e<Object> eVar = this.completion;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final C17164e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C17164e eVar = this;
        while (true) {
            h.b(eVar);
            a aVar = (a) eVar;
            C17164e eVar2 = aVar.completion;
            C17542s.g(eVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C17187b.f()) {
                    obj = x.b(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (eVar2 instanceof a) {
                        eVar = eVar2;
                    } else {
                        eVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th2));
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        C17542s.j(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
