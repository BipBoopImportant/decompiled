package Tk;

import TJ.C16532g;
import Wk.f;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H%¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0003J!\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH'¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00162\u0006\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LTk/b;", "", "<init>", "()V", "", "LWk/f;", "stockAvailabilityEntities", "LXH/N;", "g", "(Ljava/util/List;)V", "", "storeId", "itemNos", "c", "(Ljava/lang/String;Ljava/util/List;)V", "itemNo", "b", "d", "(Ljava/lang/String;)V", "a", "f", "(Ljava/lang/String;Ljava/lang/String;)LWk/f;", "LTJ/g;", "e", "(Ljava/lang/String;)LTJ/g;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b(String str, List<String> list);

    public void c(String str, List<String> list) {
        C17542s.j(str, "storeId");
        C17542s.j(list, "itemNos");
        for (List b10 : C16877v.k0(list, 100)) {
            b(str, b10);
        }
    }

    public abstract void d(String str);

    public abstract C16532g<List<f>> e(String str);

    public abstract f f(String str, String str2);

    public abstract void g(List<f> list);
}
