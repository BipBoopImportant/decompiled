package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.e1;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ExtraSupportedSurfaceCombinationsQuirk implements N0 {

    /* renamed from: a  reason: collision with root package name */
    private static final d1 f16624a = f();

    /* renamed from: b  reason: collision with root package name */
    private static final d1 f16625b = g();

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f16626c = new HashSet(Arrays.asList(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"}));

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f16627d = new HashSet(Arrays.asList(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"}));

    private static d1 f() {
        d1 d1Var = new d1();
        e1.b bVar = e1.b.YUV;
        d1Var.a(e1.a(bVar, e1.a.VGA));
        d1Var.a(e1.a(e1.b.PRIV, e1.a.PREVIEW));
        d1Var.a(e1.a(bVar, e1.a.MAXIMUM));
        return d1Var;
    }

    private static d1 g() {
        d1 d1Var = new d1();
        e1.b bVar = e1.b.PRIV;
        d1Var.a(e1.a(bVar, e1.a.PREVIEW));
        d1Var.a(e1.a(bVar, e1.a.VGA));
        d1Var.a(e1.a(e1.b.YUV, e1.a.MAXIMUM));
        return d1Var;
    }

    private List<d1> i(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f16624a);
        }
        return arrayList;
    }

    private static boolean j() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean k() {
        return j() || l() || m();
    }

    private static boolean l() {
        if (!Constants.REFERRER_API_GOOGLE.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f16626c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean m() {
        if (!Constants.REFERRER_API_SAMSUNG.equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        for (String startsWith : f16627d) {
            if (upperCase.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public List<d1> h(String str) {
        return j() ? i(str) : (l() || m()) ? Collections.singletonList(f16625b) : Collections.emptyList();
    }
}
