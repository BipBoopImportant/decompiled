package c0;

import V.C4927l;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.R0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c0.c  reason: case insensitive filesystem */
public class C5263c implements C5029j0 {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Integer, C4927l> f22969f;

    /* renamed from: c  reason: collision with root package name */
    private final C5029j0 f22970c;

    /* renamed from: d  reason: collision with root package name */
    private final I f22971d;

    /* renamed from: e  reason: collision with root package name */
    private final R0 f22972e;

    static {
        HashMap hashMap = new HashMap();
        f22969f = hashMap;
        hashMap.put(1, C4927l.f14464f);
        hashMap.put(8, C4927l.f14462d);
        hashMap.put(6, C4927l.f14461c);
        hashMap.put(5, C4927l.f14460b);
        hashMap.put(4, C4927l.f14459a);
        hashMap.put(0, C4927l.f14463e);
    }

    public C5263c(C5029j0 j0Var, I i10, R0 r02) {
        this.f22970c = j0Var;
        this.f22971d = i10;
        this.f22972e = r02;
    }

    private boolean c(int i10) {
        C4927l lVar = f22969f.get(Integer.valueOf(i10));
        if (lVar == null) {
            return true;
        }
        for (VideoQualityQuirk next : this.f22972e.c(VideoQualityQuirk.class)) {
            if (next != null && next.c(this.f22971d, lVar) && !d(next)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(N0 n02) {
        return (n02 instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) n02).d();
    }

    public boolean a(int i10) {
        return this.f22970c.a(i10) && c(i10);
    }

    public C5031k0 b(int i10) {
        if (!a(i10)) {
            return null;
        }
        return this.f22970c.b(i10);
    }
}
