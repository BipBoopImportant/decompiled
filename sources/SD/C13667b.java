package SD;

import XD.C13804b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LSD/b;", "LXD/b;", "<init>", "()V", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;Lx4/C;)V", "a", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SD.b  reason: case insensitive filesystem */
public final class C13667b implements C13804b {
    public void a(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        oVar.Y(Uri.parse("ikea://navigation/onboarding/promo"), c10);
    }

    public void b(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        oVar.Y(Uri.parse("ikea://navigation/onboarding/welcome"), c10);
    }
}
