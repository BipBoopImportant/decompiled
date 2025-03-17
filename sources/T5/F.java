package T5;

import T5.C;
import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", "LT5/C$a;", "a", "(Landroid/content/Context;)LT5/C$a;", "coil_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class F {
    public static final C.a a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof C.a) {
            return (C.a) applicationContext;
        }
        return null;
    }
}
