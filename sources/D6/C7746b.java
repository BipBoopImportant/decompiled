package d6;

import T5.G;
import T5.H;
import WK.C16762E;
import k6.C8442i;
import k6.C8450q;
import kotlin.Metadata;
import r6.E;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld6/b;", "Ld6/c;", "LT5/G;", "<init>", "()V", "data", "Lk6/q;", "options", "", "b", "(LT5/G;Lk6/q;)Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: d6.b  reason: case insensitive filesystem */
public final class C7746b implements C7747c<G> {
    /* renamed from: b */
    public String a(G g10, C8450q qVar) {
        String d10;
        if (!E.m(g10) || !C8442i.b(qVar) || (d10 = H.d(g10)) == null) {
            return null;
        }
        Long c10 = qVar.g().s(C16762E.a.e(C16762E.f139592b, d10, false, 1, (Object) null)).c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g10);
        sb2.append('-');
        sb2.append(c10);
        return sb2.toString();
    }
}
