package Ay;

import kotlin.Metadata;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LAy/c;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "", "showCombinedCart", "LXH/N;", "b", "(Lx4/o;Lx4/C;Z)V", "a", "(Lx4/o;)V", "", "c", "(Z)Ljava/lang/String;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(c cVar, C8951o oVar, C c10, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = null;
                }
                cVar.b(oVar, c10, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCart");
        }
    }

    void a(C8951o oVar);

    void b(C8951o oVar, C c10, boolean z10);

    String c(boolean z10);
}
