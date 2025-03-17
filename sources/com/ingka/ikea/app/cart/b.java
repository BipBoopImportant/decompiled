package com.ingka.ikea.app.cart;

import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/cart/b;", "", "Lx4/o;", "navController", "", "autoNavigate", "Lx4/C;", "navOptions", "LXH/N;", "h", "(Lx4/o;ZLx4/C;)V", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, C8951o oVar, boolean z10, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                if ((i10 & 4) != 0) {
                    c10 = c.f28698a.c().a();
                }
                bVar.h(oVar, z10, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCart");
        }
    }

    void h(C8951o oVar, boolean z10, C c10);
}
