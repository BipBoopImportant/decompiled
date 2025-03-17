package Iy;

import androidx.fragment.app.C5187o;
import kotlin.Metadata;
import rz.C15014g;
import rz.C15031y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIy/b;", "", "", "storeId", "Landroidx/fragment/app/o;", "fragment", "Lrz/y;", "pickupType", "Lrz/g;", "cartRepresentation", "LXH/N;", "b", "(Ljava/lang/String;Landroidx/fragment/app/o;Lrz/y;Lrz/g;)V", "title", "body", "a", "(Landroidx/fragment/app/o;Ljava/lang/String;Ljava/lang/String;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, C5187o oVar, String str, String str2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    str = null;
                }
                bVar.a(oVar, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openErrorDialog");
        }
    }

    void a(C5187o oVar, String str, String str2);

    void b(String str, C5187o oVar, C15031y yVar, C15014g gVar);
}
