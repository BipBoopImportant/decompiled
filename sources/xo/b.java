package Xo;

import android.os.Bundle;
import androidx.lifecycle.U;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/os/Bundle;", "Landroidx/lifecycle/U;", "a", "(Landroid/os/Bundle;)Landroidx/lifecycle/U;", "core-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final U a(Bundle bundle) {
        if (bundle == null) {
            return new U();
        }
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            hashMap.put(next, bundle.get(next));
        }
        return new U(hashMap);
    }
}
