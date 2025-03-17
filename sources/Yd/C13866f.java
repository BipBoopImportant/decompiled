package YD;

import YH.C16877v;
import cw.d;
import cw.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LYD/f;", "LYD/e;", "Lcw/d;", "messageCenterRepository", "<init>", "(Lcw/d;)V", "", "", "ids", "LXH/N;", "a", "(Ljava/util/List;)V", "Lcw/d;", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YD.f  reason: case insensitive filesystem */
public final class C13866f implements C13865e {

    /* renamed from: a  reason: collision with root package name */
    private final d f118096a;

    public C13866f(d dVar) {
        C17542s.j(dVar, "messageCenterRepository");
        this.f118096a = dVar;
    }

    public void a(List<String> list) {
        C17542s.j(list, "ids");
        for (String a10 : list) {
            d.a.a(this.f118096a, a10, false, 2, (Object) null);
        }
        this.f118096a.d(C16877v.e(e.WHATS_NEW));
    }
}
