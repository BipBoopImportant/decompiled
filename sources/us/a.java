package Us;

import kotlin.Metadata;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUs/a;", "", "Lx4/o;", "navController", "", "filter", "inspirationId", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "inspire_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Us.a$a  reason: collision with other inner class name */
    public static final class C1864a {
        public static /* synthetic */ void a(a aVar, C8951o oVar, String str, String str2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                if ((i10 & 4) != 0) {
                    str2 = null;
                }
                aVar.a(oVar, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openInspireFeed");
        }
    }

    void a(C8951o oVar, String str, String str2);
}
