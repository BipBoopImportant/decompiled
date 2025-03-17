package Tj;

import Tj.n;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15019l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LTj/x;", "", "LTj/z;", "productSectionBuilder", "<init>", "(LTj/z;)V", "Lrz/l;", "product", "LTj/n$a;", "a", "(Lrz/l;)LTj/n$a;", "LTj/z;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final z f87719a;

    public x(z zVar) {
        C17542s.j(zVar, "productSectionBuilder");
        this.f87719a = zVar;
    }

    public final n.a a(C15019l lVar) {
        C17542s.j(lVar, "product");
        ArrayList arrayList = new ArrayList();
        for (Object next : lVar.a().c().a().b()) {
            if (C17542s.e(((PackageDetailsItem) next).getType(), w.PACKAGE_MEASUREMENTS.b())) {
                arrayList.add(next);
            }
        }
        return new n.a(lVar.b(), lVar.a().b(), lVar.a().a().a().a(), arrayList, this.f87719a.c(lVar.a().b()));
    }
}
