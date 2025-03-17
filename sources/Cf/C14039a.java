package cF;

import com.sugarcube.app.base.navigation.Kreativ;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx4/o;", "Ljava/util/UUID;", "sessionUuid", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;Ljava/util/UUID;Lx4/C;)V", "a", "(Lx4/o;Lx4/C;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.a  reason: case insensitive filesystem */
public final class C14039a {
    public static final void a(C8951o oVar, C c10) {
        C17542s.j(oVar, "<this>");
        C14046h.c(oVar, Kreativ.Capture.INSTANCE, c10);
    }

    public static final void b(C8951o oVar, UUID uuid, C c10) {
        C17542s.j(oVar, "<this>");
        C17542s.j(uuid, "sessionUuid");
        String uuid2 = uuid.toString();
        C17542s.i(uuid2, "toString(...)");
        C14046h.c(oVar, new Kreativ.Capture.V2(uuid2), c10);
    }

    public static /* synthetic */ void c(C8951o oVar, UUID uuid, C c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uuid = UUID.randomUUID();
        }
        if ((i10 & 2) != 0) {
            c10 = null;
        }
        b(oVar, uuid, c10);
    }
}
