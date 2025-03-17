package MK;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15794m;
import GK.C15795n;
import GK.C15804w;
import GK.C15805x;
import HJ.C15854t;
import HK.C15864d;
import WK.r;
import WK.y;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"LMK/a;", "LGK/w;", "LGK/n;", "cookieJar", "<init>", "(LGK/n;)V", "", "LGK/m;", "cookies", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "LGK/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: MK.a  reason: case insensitive filesystem */
public final class C16088a implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final C15795n f136453a;

    public C16088a(C15795n nVar) {
        C17542s.j(nVar, "cookieJar");
        this.f136453a = nVar;
    }

    private final String a(List<C15794m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object next : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C15794m mVar = (C15794m) next;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append('=');
            sb2.append(mVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public C15776D intercept(C15804w.a aVar) {
        C15777E c10;
        C17542s.j(aVar, "chain");
        C15774B t10 = aVar.t();
        C15774B.a i10 = t10.i();
        C15775C a10 = t10.a();
        if (a10 != null) {
            C15805x b10 = a10.b();
            if (b10 != null) {
                i10.e("Content-Type", b10.toString());
            }
            long a11 = a10.a();
            if (a11 != -1) {
                i10.e("Content-Length", String.valueOf(a11));
                i10.j("Transfer-Encoding");
            } else {
                i10.e("Transfer-Encoding", "chunked");
                i10.j("Content-Length");
            }
        }
        boolean z10 = false;
        if (t10.d("Host") == null) {
            i10.e("Host", C15864d.V(t10.k(), false, 1, (Object) null));
        }
        if (t10.d("Connection") == null) {
            i10.e("Connection", "Keep-Alive");
        }
        if (t10.d("Accept-Encoding") == null && t10.d("Range") == null) {
            i10.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<C15794m> b11 = this.f136453a.b(t10.k());
        if (!b11.isEmpty()) {
            i10.e("Cookie", a(b11));
        }
        if (t10.d("User-Agent") == null) {
            i10.e("User-Agent", "okhttp/4.12.0");
        }
        C15776D b12 = aVar.b(i10.b());
        e.f(this.f136453a, t10.k(), b12.q());
        C15776D.a r10 = b12.u().r(t10);
        if (z10 && C15854t.H("gzip", C15776D.o(b12, "Content-Encoding", (String) null, 2, (Object) null), true) && e.b(b12) && (c10 = b12.c()) != null) {
            r rVar = new r(c10.k3());
            r10.k(b12.q().p().i("Content-Encoding").i("Content-Length").f());
            r10.b(new h(C15776D.o(b12, "Content-Type", (String) null, 2, (Object) null), -1, y.d(rVar)));
        }
        return r10.c();
    }
}
