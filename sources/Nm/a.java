package Nm;

import kotlin.Metadata;
import rw.c;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LNm/a;", "", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "", "isTakeATour", "LXH/N;", "c", "(Lx4/o;Lx4/C;Z)V", "", "id", "a", "(Lx4/o;Ljava/lang/String;Lx4/C;)V", "b", "(Lx4/o;Lx4/C;)V", "benefits_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nm.a$a  reason: collision with other inner class name */
    public static final class C1689a {
        public static /* synthetic */ void a(a aVar, C8951o oVar, String str, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    c10 = c.f28698a.c().a();
                }
                aVar.a(oVar, str, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openBenefit");
        }

        public static /* synthetic */ void b(a aVar, C8951o oVar, C c10, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = c.f28698a.c().a();
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                aVar.c(oVar, c10, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openBenefits");
        }

        public static /* synthetic */ void c(a aVar, C8951o oVar, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    c10 = c.f28698a.c().a();
                }
                aVar.b(oVar, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openFeaturedBenefit");
        }
    }

    void a(C8951o oVar, String str, C c10);

    void b(C8951o oVar, C c10);

    void c(C8951o oVar, C c10, boolean z10);
}
