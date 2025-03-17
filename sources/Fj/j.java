package Fj;

import Vi.h0;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15031y;
import rz.I;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LFj/j;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "", "LVi/h0;", "a", "(Lrz/I;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {
    public final List<h0> a(I i10) {
        C17542s.j(i10, "scanAndGoProduct");
        return C16877v.e(new h0(i10.l(), i10.p() == C15031y.COMBINATION));
    }
}
