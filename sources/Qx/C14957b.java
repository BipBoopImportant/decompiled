package qx;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lkp/d;", "currencyConfig", "Lqx/c;", "a", "(DLkp/d;)Lqx/c;", "price_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qx.b  reason: case insensitive filesystem */
public final class C14957b {
    public static final c a(double d10, C11522d dVar) {
        String str;
        C17542s.j(dVar, "currencyConfig");
        String a10 = d.a(d10, dVar);
        int z02 = C15854t.z0(a10, dVar.g(), 0, false, 6, (Object) null);
        if (z02 != -1) {
            String substring = a10.substring(0, z02);
            C17542s.i(substring, "substring(...)");
            String substring2 = a10.substring(z02 + 1);
            C17542s.i(substring2, "substring(...)");
            str = substring2;
            a10 = substring;
        } else {
            str = null;
        }
        return new c(a10, str);
    }
}
