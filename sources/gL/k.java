package Gl;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.shoppinglist.listpicker.impl.navigation.ListPickerRoutes$ListSelector;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8948l;
import x4.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LGl/k;", "LGl/a;", "<init>", "()V", "", "Lx4/l;", "newBackStack", "", "b", "(Ljava/util/List;)Ljava/lang/Boolean;", "previousEntry", "a", "(Ljava/util/List;Lx4/l;)Ljava/lang/Boolean;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements a {
    public Boolean a(List<C8948l> list, C8948l lVar) {
        v e10;
        String C10;
        v e11;
        String C11;
        C17542s.j(list, "newBackStack");
        C8948l lVar2 = (C8948l) C16877v.K0(list);
        if (lVar2 == null || (e10 = lVar2.e()) == null || (C10 = e10.C()) == null || lVar == null || (e11 = lVar.e()) == null || (C11 = e11.C()) == null) {
            return null;
        }
        boolean z10 = false;
        boolean z11 = C15854t.W(C10, "commercialcontent", false, 2, (Object) null) && (C15854t.W(C11, "pip", false, 2, (Object) null) || C15854t.W(C11, "browse", false, 2, (Object) null));
        if (C15854t.W(C10, "browse", false, 2, (Object) null) && v.f57671k.d(e11, P.b(ListPickerRoutes$ListSelector.class))) {
            z10 = true;
        }
        if (z11) {
            return Boolean.FALSE;
        }
        if (z10) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Boolean b(List<C8948l> list) {
        C17542s.j(list, "newBackStack");
        List<String> a10 = l.a(list);
        String str = (String) C16877v.K0(a10);
        String str2 = (String) C16877v.z0(a10, C16877v.p(a10) - 1);
        if (str == null || str2 == null) {
            return null;
        }
        boolean z10 = C15854t.W(str, "pip", false, 2, (Object) null) || C15854t.W(str, "browse", false, 2, (Object) null);
        boolean W10 = C15854t.W(str2, "commercialcontent", false, 2, (Object) null);
        if (!z10 || !W10) {
            return null;
        }
        return Boolean.TRUE;
    }
}
