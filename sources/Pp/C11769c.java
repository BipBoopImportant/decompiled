package pp;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpp/c;", "LOCAL", "REMOTE", "", "remote", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pp.c  reason: case insensitive filesystem */
public interface C11769c<LOCAL, REMOTE> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pp.c$a */
    public static final class a {
        public static <LOCAL, REMOTE> List<LOCAL> a(C11769c<LOCAL, REMOTE> cVar, List<? extends REMOTE> list) {
            C17542s.j(list, "remote");
            ArrayList arrayList = new ArrayList();
            for (Object a10 : list) {
                LOCAL a11 = cVar.a(a10);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return arrayList;
        }
    }

    LOCAL a(REMOTE remote);
}
