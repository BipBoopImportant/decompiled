package oC;

import XH.C16807N;
import dI.C17164e;
import gp.C11343b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LoC/c;", "", "Lgp/b$a;", "type", "payload", "LXH/N;", "a", "(Lgp/b$a;Ljava/lang/Object;)V", "b", "(Lgp/b$a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "taskscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oC.c  reason: case insensitive filesystem */
public interface C14874c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oC.c$a */
    public static final class a {
        public static /* synthetic */ void a(C14874c cVar, C11343b.a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 2) != 0) {
                    obj = null;
                }
                cVar.a(aVar, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEvent");
        }
    }

    void a(C11343b.a aVar, Object obj);

    Object b(C11343b.a aVar, Object obj, C17164e<? super C16807N> eVar);
}
