package pi;

import Ln.d;
import TJ.C16532g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpi/a;", "", "<init>", "()V", "", "LLn/d;", "cartItems", "LXH/N;", "e", "(Ljava/util/List;)V", "Lpi/c;", "d", "a", "b", "()Ljava/util/List;", "LTJ/g;", "", "c", "()LTJ/g;", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {
    public abstract void a();

    public abstract List<c> b();

    public abstract C16532g<Integer> c();

    public abstract void d(List<c> list);

    public void e(List<d> list) {
        a();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (d a10 : list) {
                arrayList.add(d.a(a10));
            }
            d(arrayList);
        }
    }
}
