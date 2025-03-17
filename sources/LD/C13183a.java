package LD;

import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LLD/a;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Lx4/C;)V", "wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LD.a  reason: case insensitive filesystem */
public interface C13183a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LD.a$a  reason: collision with other inner class name */
    public static final class C2735a {
        public static /* synthetic */ void a(C13183a aVar, C8951o oVar, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = c.f28698a.c().a();
                }
                aVar.a(oVar, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openWallet");
        }
    }

    void a(C8951o oVar, C c10);
}
