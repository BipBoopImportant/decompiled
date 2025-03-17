package GJ;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LGJ/j;", "T", "", "<init>", "()V", "value", "LXH/N;", "d", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "iterator", "i", "(Ljava/util/Iterator;LdI/e;)Ljava/lang/Object;", "LGJ/h;", "sequence", "f", "(LGJ/h;LdI/e;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.j  reason: case insensitive filesystem */
public abstract class C15767j<T> {
    public abstract Object d(T t10, C17164e<? super C16807N> eVar);

    public final Object f(C15765h<? extends T> hVar, C17164e<? super C16807N> eVar) {
        Object i10 = i(hVar.iterator(), eVar);
        return i10 == C17187b.f() ? i10 : C16807N.f139792a;
    }

    public abstract Object i(Iterator<? extends T> it, C17164e<? super C16807N> eVar);
}
