package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.e1;
import com.adjust.sdk.Constants;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExtraCroppingQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Range<Integer>> f16622a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16623a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.e1$b[] r0 = androidx.camera.core.impl.e1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16623a = r0
                androidx.camera.core.impl.e1$b r1 = androidx.camera.core.impl.e1.b.PRIV     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16623a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.e1$b r1 = androidx.camera.core.impl.e1.b.YUV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16623a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.e1$b r1 = androidx.camera.core.impl.e1.b.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f16622a = hashMap;
        hashMap.put("SM-T580", (Object) null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", (Object) null);
        hashMap.put("SM-G570M", (Object) null);
        hashMap.put("SM-G610F", (Object) null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    private static boolean g() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map<String, Range<Integer>> map = f16622a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    static boolean h() {
        return g();
    }

    public Size f(e1.b bVar) {
        if (!g()) {
            return null;
        }
        int i10 = a.f16623a[bVar.ordinal()];
        if (i10 == 1) {
            return new Size(1920, 1080);
        }
        if (i10 == 2) {
            return new Size(SceneLayout.kCurrent3DVersion, 720);
        }
        if (i10 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
