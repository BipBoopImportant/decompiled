package androidx.camera.camera2;

import C.C4387c0;
import C.C4410s;
import C.C4415x;
import android.content.Context;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.p1;
import java.util.Set;
import t.C5931a;
import t.C5932b;
import t.C5933c;
import v.C6026F0;
import v.K0;

public final class Camera2Config {

    public static final class DefaultProvider implements C4415x.b {
        public C4415x getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static C4415x c() {
        C5931a aVar = new C5931a();
        C5932b bVar = new C5932b();
        return new C4415x.a().c(aVar).d(bVar).g(new C5933c()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ G d(Context context, Object obj, Set set) {
        try {
            return new C6026F0(context, obj, set);
        } catch (C4410s e10) {
            throw new C4387c0(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ p1 e(Context context) {
        return new K0(context);
    }
}
