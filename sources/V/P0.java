package v;

import C.C4387c0;
import C.C4408p;
import C.C4409q;
import C.C4410s;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.impl.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import w.C6172g;
import w.O;

class P0 {
    private static String a(O o10, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) o10.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) o10.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    static List<String> b(C6115w wVar, C4409q qVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(wVar.c().d());
            if (qVar == null) {
                for (String add : asList) {
                    arrayList.add(add);
                }
                return arrayList;
            }
            try {
                str = a(wVar.c(), qVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(wVar.f(str2));
                }
            }
            Iterator<C4408p> it = qVar.b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((I) it.next()).d());
            }
            return arrayList;
        } catch (C6172g e10) {
            throw new C4387c0(R0.a(e10));
        } catch (C4410s e11) {
            throw new C4387c0(e11);
        }
    }
}
