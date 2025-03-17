package RH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"LRH/s;", "", "value", "LXH/N;", "a", "(LRH/s;S)V", "b", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {
    public static final void a(s sVar, short s10) {
        C17542s.j(sVar, "<this>");
        int z10 = sVar.z();
        if (sVar.w() - z10 > 2) {
            sVar.N(z10 + 2);
            sVar.x().putShort(z10, s10);
            return;
        }
        b(sVar, s10);
    }

    private static final void b(s sVar, short s10) {
        C16373f.f(sVar.F(2), s10);
        sVar.d();
    }
}
