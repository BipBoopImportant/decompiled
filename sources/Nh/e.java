package NH;

import QJ.Q;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0000H @ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"LNH/e;", "", "TSubject", "TContext", "LQJ/Q;", "context", "<init>", "(Ljava/lang/Object;)V", "subject", "f", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "e", "(LdI/e;)Ljava/lang/Object;", "initial", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "c", "setSubject", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<TSubject, TContext> implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final TContext f136522a;

    public e(TContext tcontext) {
        C17542s.j(tcontext, "context");
        this.f136522a = tcontext;
    }

    public abstract Object a(TSubject tsubject, C17164e<? super TSubject> eVar);

    public final TContext b() {
        return this.f136522a;
    }

    public abstract TSubject c();

    public abstract Object e(C17164e<? super TSubject> eVar);

    public abstract Object f(TSubject tsubject, C17164e<? super TSubject> eVar);
}
