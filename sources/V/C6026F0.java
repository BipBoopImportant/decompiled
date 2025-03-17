package v;

import H2.i;
import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.o1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.O;

/* renamed from: v.F0  reason: case insensitive filesystem */
public final class C6026F0 implements G {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, O1> f30193a;

    /* renamed from: b  reason: collision with root package name */
    private final C6064f f30194b;

    /* renamed from: v.F0$a */
    class a implements C6064f {
        a() {
        }

        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public C6026F0(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }

    private void c(Context context, O o10, Set<String> set) {
        i.g(context);
        for (String next : set) {
            this.f30193a.put(next, new O1(context, next, o10, this.f30194b));
        }
    }

    public Pair<Map<o1<?>, c1>, Map<C5010a, c1>> a(int i10, String str, List<C5010a> list, Map<o1<?>, List<Size>> map, boolean z10, boolean z11) {
        i.b(!map.isEmpty(), "No new use cases to be bound.");
        O1 o12 = this.f30193a.get(str);
        if (o12 != null) {
            return o12.A(i10, list, map, z10, z11);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    public e1 b(int i10, String str, int i11, Size size) {
        O1 o12 = this.f30193a.get(str);
        if (o12 != null) {
            return o12.M(i10, i11, size);
        }
        return null;
    }

    C6026F0(Context context, C6064f fVar, Object obj, Set<String> set) {
        O o10;
        this.f30193a = new HashMap();
        i.g(fVar);
        this.f30194b = fVar;
        if (obj instanceof O) {
            o10 = (O) obj;
        } else {
            o10 = O.a(context);
        }
        c(context, o10, set);
    }
}
