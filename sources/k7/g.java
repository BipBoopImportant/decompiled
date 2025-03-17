package k7;

import WK.C16773h;
import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l7.C8533b;
import l7.C8536e;
import m7.C8558a;
import m7.C8559b;
import m7.c;
import m7.d;
import o7.j;
import o7.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "Lk7/h;", "logger", "Lk7/o;", "e", "([BLk7/h;)Lk7/o;", "Ll7/b;", "Lk7/d;", "a", "(Ll7/b;Lk7/h;)Lk7/d;", "d", "(Ll7/b;Lk7/h;)Lk7/o;", "", "count", "b", "([BILk7/h;)[B", "", "h", "([B)Ljava/lang/String;", "g", "(Ll7/b;)Ljava/lang/String;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final C8464d a(C8533b bVar, h hVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(hVar, "logger");
        c a10 = d.a(bVar);
        C8558a a11 = C8559b.a(bVar, a10, hVar);
        return new C8464d(a10, a11.b(), a11.a());
    }

    public static final byte[] b(byte[] bArr, int i10, h hVar) {
        C17542s.j(bArr, "<this>");
        C17542s.j(hVar, "logger");
        C8533b b10 = C8536e.b(bArr);
        int i11 = 0;
        while (i11 < i10) {
            o d10 = d(b10, hVar);
            if (d10.i().i(4)) {
                b10 = d10.g();
                i11++;
            } else {
                throw new IllegalStateException("Not an octet string");
            }
        }
        return b10.P2(0, b10.a());
    }

    public static /* synthetic */ byte[] c(byte[] bArr, int i10, h hVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            hVar = C8460B.f54288a;
        }
        return b(bArr, i10, hVar);
    }

    public static final o d(C8533b bVar, h hVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(hVar, "logger");
        C8464d a10 = a(bVar, hVar);
        C8533b e02 = bVar.e0(a10.a(), a10.c());
        c b10 = a10.b();
        return b10.i(1) ? C8463c.f54294i.a(b10, e02, hVar) : b10.i(2) ? f.f54303i.a(b10, e02, hVar) : b10.i(3) ? C8461a.f54289h.a(b10, e02, hVar) : b10.i(5) ? j.f54309i.a(b10, e02, hVar) : b10.i(6) ? q.f54323i.a(b10, e02, hVar) : b10.i(12) ? u.f54335i.a(b10, e02, hVar) : (b10.i(16) || b10.i(17)) ? x.f54341i.b(b10, e02, hVar) : b10.i(19) ? s.f54329i.a(b10, e02, hVar) : b10.i(23) ? z.f54347i.a(b10, e02, hVar) : c.g(b10, 0, false, 2, (Object) null) ? q.f55288i.a(b10, e02, hVar) : c.g(b10, 3, false, 2, (Object) null) ? j.f55268i.b(b10, e02, hVar) : C8459A.f54284h.a(b10, e02, hVar);
    }

    public static final o e(byte[] bArr, h hVar) {
        C17542s.j(bArr, "<this>");
        C17542s.j(hVar, "logger");
        return d(C8536e.b(bArr), hVar);
    }

    public static /* synthetic */ o f(byte[] bArr, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = C8460B.f54288a;
        }
        return e(bArr, hVar);
    }

    public static final String g(C8533b bVar) {
        C17542s.j(bVar, "<this>");
        return h(C16877v.n1(C16877v.t1(bVar)));
    }

    public static final String h(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        return C16773h.a.f(C16773h.f139664d, bArr, 0, 0, 3, (Object) null).G();
    }
}
