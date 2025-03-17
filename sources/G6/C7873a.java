package g6;

import WK.C16771f;
import WK.C16772g;
import g6.C7886n;
import h6.C7936e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg6/a;", "", "<init>", "()V", "LWK/g;", "source", "Lg6/q;", "a", "(LWK/g;)Lg6/q;", "response", "LWK/f;", "sink", "LXH/N;", "b", "(Lg6/q;LWK/f;)V", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.a  reason: case insensitive filesystem */
public final class C7873a {

    /* renamed from: a  reason: collision with root package name */
    public static final C7873a f51268a = new C7873a();

    private C7873a() {
    }

    public final C7889q a(C16772g gVar) {
        int parseInt = Integer.parseInt(gVar.Z0());
        long parseLong = Long.parseLong(gVar.Z0());
        long parseLong2 = Long.parseLong(gVar.Z0());
        C7886n.a aVar = new C7886n.a();
        int parseInt2 = Integer.parseInt(gVar.Z0());
        for (int i10 = 0; i10 < parseInt2; i10++) {
            C7936e.b(aVar, gVar.Z0());
        }
        return new C7889q(parseInt, parseLong, parseLong2, aVar.b(), (C7890r) null, (Object) null, 48, (DefaultConstructorMarker) null);
    }

    public final void b(C7889q qVar, C16771f fVar) {
        fVar.u1((long) qVar.d()).Z1(10);
        fVar.u1(qVar.f()).Z1(10);
        fVar.u1(qVar.g()).Z1(10);
        Set<Map.Entry<String, List<String>>> entrySet = qVar.e().b().entrySet();
        int i10 = 0;
        for (Map.Entry value : entrySet) {
            i10 += ((List) value.getValue()).size();
        }
        fVar.u1((long) i10).Z1(10);
        for (Map.Entry next : entrySet) {
            for (String D02 : (List) next.getValue()) {
                fVar.D0((String) next.getKey()).D0(":").D0(D02).Z1(10);
            }
        }
    }
}
