package Iy;

import Cy.b;
import androidx.fragment.app.C5187o;
import com.ingka.ikea.scanandgo.cart.impl.dialog.CartErrorBottomSheet;
import com.ingka.ikea.scanandgo.cart.impl.dialog.CartOverflowMenuBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import rz.C15031y;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LIy/a;", "LIy/b;", "LCy/b;", "scanAndGoCartAnalytics", "<init>", "(LCy/b;)V", "", "storeId", "Landroidx/fragment/app/o;", "fragment", "Lrz/y;", "pickupType", "Lrz/g;", "cartRepresentation", "LXH/N;", "b", "(Ljava/lang/String;Landroidx/fragment/app/o;Lrz/y;Lrz/g;)V", "title", "body", "a", "(Landroidx/fragment/app/o;Ljava/lang/String;Ljava/lang/String;)V", "LCy/b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f110999a;

    public a(b bVar) {
        C17542s.j(bVar, "scanAndGoCartAnalytics");
        this.f110999a = bVar;
    }

    public void a(C5187o oVar, String str, String str2) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str2, "body");
        CartErrorBottomSheet.f119837R.a(str, str2).show(oVar.getParentFragmentManager(), "");
    }

    public void b(String str, C5187o oVar, C15031y yVar, C15014g gVar) {
        C17542s.j(str, "storeId");
        C17542s.j(oVar, "fragment");
        C17542s.j(yVar, "pickupType");
        C17542s.j(gVar, "cartRepresentation");
        this.f110999a.o(str, gVar);
        CartOverflowMenuBottomSheet.f119840Z.a(gVar.a(), gVar.g().e().i(), gVar.b(), gVar.j(), gVar.f().j(), yVar).show(oVar.getParentFragmentManager(), (String) null);
    }
}
