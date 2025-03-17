package Ce;

import Be.a;
import XH.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"LCe/e;", "LBe/a;", "LCe/f;", "contentsquareWrapper", "<init>", "(LCe/f;)V", "", "name", "LXH/N;", "a", "(Ljava/lang/String;)V", "transactionId", "", "price", "currency", "b", "(Ljava/lang/String;DLjava/lang/String;)V", "", "LXH/v;", "userProperties", "c", "(Ljava/util/List;)V", "LCe/f;", "contentsquare-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f58987a;

    public e(f fVar) {
        C17542s.j(fVar, "contentsquareWrapper");
        this.f58987a = fVar;
    }

    public void a(String str) {
        C17542s.j(str, "name");
        this.f58987a.a(str);
    }

    public void b(String str, double d10, String str2) {
        C17542s.j(str, "transactionId");
        C17542s.j(str2, "currency");
        this.f58987a.b(str, d10, str2);
    }

    public void c(List<v<String, String>> list) {
        C17542s.j(list, "userProperties");
        for (v next : list) {
            this.f58987a.c((String) next.c(), (String) next.d());
        }
    }
}
