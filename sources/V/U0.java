package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5042q;
import java.util.ArrayList;
import java.util.List;

final class U0 {
    static CameraCaptureSession.CaptureCallback a(C5040p pVar) {
        if (pVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        b(pVar, arrayList);
        return arrayList.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList.get(0) : C6043U.a(arrayList);
    }

    static void b(C5040p pVar, List<CameraCaptureSession.CaptureCallback> list) {
        if (pVar instanceof C5042q.a) {
            for (C5040p b10 : ((C5042q.a) pVar).e()) {
                b(b10, list);
            }
        } else if (pVar instanceof T0) {
            list.add(((T0) pVar).f());
        } else {
            list.add(new S0(pVar));
        }
    }
}
