package Is;

import Js.b;
import Ps.g;
import TJ.C16532g;
import XH.C16807N;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004H§@¢\u0006\u0004\b\u001f\u0010\tJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b \u0010\u0010J0\u0010$\u001a\u00020#2\u0006\u0010\f\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\"\u001a\u00020\u0019H@¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LIs/a;", "", "<init>", "()V", "", "LIs/e;", "inboxNotificationEntities", "", "h", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "messageId", "featureName", "f", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "", "g", "LTJ/g;", "d", "()LTJ/g;", "", "read", "k", "(Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "LPs/g;", "sources", "c", "b", "notifications", "removeEntriesNotInList", "LJs/a;", "i", "(Ljava/lang/String;Ljava/util/List;ZLdI/e;)Ljava/lang/Object;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {
    public static /* synthetic */ Object l(a aVar, String str, String str2, boolean z10, C17164e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return aVar.k(str, str2, z10, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markNotificationAsRead");
    }

    public abstract Object a(C17164e<? super C16807N> eVar);

    public abstract Object b(String str, C17164e<? super C16807N> eVar);

    public abstract Object c(List<? extends g> list, C17164e<? super C16807N> eVar);

    public abstract C16532g<List<e>> d();

    public abstract Object e(String str, C17164e<? super List<e>> eVar);

    public abstract Object f(String str, String str2, C17164e<? super e> eVar);

    public abstract Object g(C17164e<? super Integer> eVar);

    public abstract Object h(List<e> list, C17164e<? super List<Long>> eVar);

    public Object i(String str, List<e> list, boolean z10, C17164e<? super Js.a> eVar) {
        return new b(this).a(str, list, z10, eVar);
    }

    public abstract Object k(String str, String str2, boolean z10, C17164e<? super C16807N> eVar);
}
