package androidx.camera.camera2.internal.compat.quirk;

import C.C4391e0;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.N0;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcludedSupportedSizesQuirk implements N0 {
    private List<Size> g(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(Constants.MINIMAL_ERROR_STATUS_CODE, Constants.MINIMAL_ERROR_STATUS_CODE));
        }
        return arrayList;
    }

    private List<Size> h(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> i(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> j(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i10 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    private List<Size> k(String str, int i10, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i10 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i10 == 35) {
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str.equals("1") && (i10 == 34 || i10 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
            arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private List<Size> l(String str, int i10, Class<?> cls) {
        String str2 = str;
        int i11 = i10;
        ArrayList arrayList = new ArrayList();
        if (str2.equals("0")) {
            if (i11 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
                arrayList.add(new Size(1920, 1080));
            } else if (i11 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
                arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
                arrayList.add(new Size(1920, 1080));
            }
        } else if (str2.equals("1") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1536));
            arrayList.add(new Size(RecyclerView.n.FLAG_MOVED, 1152));
            arrayList.add(new Size(1920, 1080));
        }
        return arrayList;
    }

    private static boolean m() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean n() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean o() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean p() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean q() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean r() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    static boolean s() {
        return n() || o() || m() || r() || q() || p();
    }

    public List<Size> f(String str, int i10) {
        if (n()) {
            return h(str, i10);
        }
        if (o()) {
            return i(str, i10);
        }
        if (m()) {
            return g(str, i10, (Class<?>) null);
        }
        if (r()) {
            return l(str, i10, (Class<?>) null);
        }
        if (q()) {
            return k(str, i10, (Class<?>) null);
        }
        if (p()) {
            return j(str, i10);
        }
        C4391e0.l("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
