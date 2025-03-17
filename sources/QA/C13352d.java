package QA;

import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQA/d;", "", "Lx4/o;", "navController", "LQA/a;", "mode", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;LQA/a;Lx4/C;)V", "", "listId", "", "selectInStoreMode", "a", "(Lx4/o;Ljava/lang/String;ZLx4/C;)V", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QA.d  reason: case insensitive filesystem */
public interface C13352d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QA.d$a */
    public static final class a {
        public static /* synthetic */ void a(C13352d dVar, C8951o oVar, String str, boolean z10, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    c10 = c.f28698a.c().a();
                }
                dVar.a(oVar, str, z10, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openShoppingListDetails");
        }

        public static /* synthetic */ void b(C13352d dVar, C8951o oVar, C13349a aVar, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    c10 = c.f28698a.c().a();
                }
                dVar.b(oVar, aVar, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openShoppingLists");
        }
    }

    void a(C8951o oVar, String str, boolean z10, C c10);

    void b(C8951o oVar, C13349a aVar, C c10);
}
