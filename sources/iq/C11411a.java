package iq;

import kotlin.Metadata;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Liq/a;", "", "Lx4/o;", "navController", "", "productNo", "Liq/b;", "viewFilter", "LXH/N;", "b", "(Lx4/o;Ljava/lang/String;Liq/b;)V", "a", "(Lx4/o;Ljava/lang/String;)V", "energylabel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iq.a  reason: case insensitive filesystem */
public interface C11411a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iq.a$a  reason: collision with other inner class name */
    public static final class C2225a {
        public static /* synthetic */ void a(C11411a aVar, C8951o oVar, String str, C11412b bVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    bVar = C11412b.ENERGY_LABEL;
                }
                aVar.b(oVar, str, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openEnergyLabel");
        }
    }

    void a(C8951o oVar, String str);

    void b(C8951o oVar, String str, C11412b bVar);
}
