package Fj;

import Vi.T;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15012e;
import rz.C15017j;
import rz.C15024q;
import rz.I;
import rz.O;
import uK.C18146a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LFj/h;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "Lrz/O;", "scanType", "", "LVi/T;", "a", "(Lrz/I;Lrz/O;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {
    public final List<T> a(I i10, O o10) {
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(o10, "scanType");
        C15024q g10 = i10.g();
        C15017j e10 = i10.e();
        C15012e b10 = i10.h().b();
        List c10 = C16877v.c();
        if (e10 instanceof C15017j.a) {
            c10.add(new T.a(((C15017j.a) e10).a(), false));
        }
        if (b10 instanceof C15012e.a) {
            c10.add(new T.c(((C15012e.a) b10).a(), C18146a.f148718xd, true));
        }
        if ((g10 instanceof C15024q.a) && o10 != O.BARCODE) {
            c10.add(new T.b(((C15024q.a) g10).a(), C18146a.f148220R5, true));
        }
        return C16877v.a(c10);
    }
}
