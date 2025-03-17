package cF;

import com.sugarcube.app.base.navigation.Kreativ;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lx4/o;", "Ljava/util/UUID;", "sceneUuid", "", "sceneName", "", "sceneDeprecatedId", "furniture", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/util/UUID;Ljava/lang/String;ILjava/lang/String;Lx4/C;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.d  reason: case insensitive filesystem */
public final class C14042d {
    public static final void a(C8951o oVar, UUID uuid, String str, int i10, String str2, C c10) {
        C17542s.j(oVar, "<this>");
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(str, "sceneName");
        String uuid2 = uuid.toString();
        C17542s.i(uuid2, "toString(...)");
        C14046h.c(oVar, new Kreativ.DesignOptions(str, uuid2, i10, str2), c10);
    }

    public static /* synthetic */ void b(C8951o oVar, UUID uuid, String str, int i10, String str2, C c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        a(oVar, uuid, str3, i10, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : c10);
    }
}
