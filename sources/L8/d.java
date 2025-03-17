package L8;

import R8.a;
import R8.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"LL8/d;", "", "<init>", "()V", "Ly8/b;", "event", "a", "(Ly8/b;)Ly8/b;", "", "", "Ljava/util/List;", "urlMaskingPatterns", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f38459a = new ArrayList();

    public final C8993b a(C8993b bVar) {
        String c10;
        C17542s.j(bVar, "event");
        String a10 = a.a(e.d(bVar.E()));
        synchronized (this.f38459a) {
            c10 = e.c(a10, this.f38459a);
        }
        return C8993b.b(bVar, 0, (String) null, c10, 0, 0, 0, (byte[]) null, (Integer) null, (byte[]) null, (Integer) null, (Map) null, (Map) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 268435451, (Object) null);
    }
}
