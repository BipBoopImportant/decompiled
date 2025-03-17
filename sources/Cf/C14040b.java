package cF;

import com.sugarcube.app.base.navigation.Kreativ;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx4/o;", "", "sceneUuid", "compositionUuid", "", "sceneDeprecatedId", "", "sceneIsNewDesign", "furniture", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Lx4/C;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.b  reason: case insensitive filesystem */
public final class C14040b {
    public static final void a(C8951o oVar, String str, String str2, int i10, boolean z10, String str3, C c10) {
        C17542s.j(oVar, "<this>");
        C17542s.j(str, "sceneUuid");
        C14046h.c(oVar, new Kreativ.Decorate(str, str2, i10, z10, (str3 == null || str3.length() <= 0) ? null : str3), c10);
    }

    public static /* synthetic */ void b(C8951o oVar, String str, String str2, int i10, boolean z10, String str3, C c10, int i11, Object obj) {
        C c11 = null;
        String str4 = (i11 & 2) != 0 ? null : str2;
        int i12 = (i11 & 4) != 0 ? -1 : i10;
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        String str5 = (i11 & 16) != 0 ? null : str3;
        if ((i11 & 32) == 0) {
            c11 = c10;
        }
        a(oVar, str, str4, i12, z11, str5, c11);
    }
}
