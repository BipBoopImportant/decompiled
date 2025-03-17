package VK;

import WK.C16770e;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWK/e;", "", "a", "(LWK/e;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: VK.b  reason: case insensitive filesystem */
public final class C16698b {
    public static final boolean a(C16770e eVar) {
        C17542s.j(eVar, "<this>");
        try {
            C16770e eVar2 = new C16770e();
            eVar.l(eVar2, 0, C17978n.j(eVar.size(), 64));
            for (int i10 = 0; i10 < 16; i10++) {
                if (eVar2.Y1()) {
                    return true;
                }
                int o02 = eVar2.o0();
                if (Character.isISOControl(o02) && !Character.isWhitespace(o02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
