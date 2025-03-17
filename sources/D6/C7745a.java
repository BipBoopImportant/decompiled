package d6;

import T5.G;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r6.F;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld6/a;", "Ld6/c;", "LT5/G;", "<init>", "()V", "data", "Lk6/q;", "options", "", "b", "(LT5/G;Lk6/q;)Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: d6.a  reason: case insensitive filesystem */
public final class C7745a implements C7747c<G> {
    /* renamed from: b */
    public String a(G g10, C8450q qVar) {
        if (!C17542s.e(g10.c(), "android.resource")) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g10);
        sb2.append(':');
        sb2.append(F.d(qVar.c().getResources().getConfiguration()));
        return sb2.toString();
    }
}
