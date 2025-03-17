package V;

import android.util.Size;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: V.l  reason: case insensitive filesystem */
public class C4927l {

    /* renamed from: a  reason: collision with root package name */
    public static final C4927l f14459a;

    /* renamed from: b  reason: collision with root package name */
    public static final C4927l f14460b;

    /* renamed from: c  reason: collision with root package name */
    public static final C4927l f14461c;

    /* renamed from: d  reason: collision with root package name */
    public static final C4927l f14462d;

    /* renamed from: e  reason: collision with root package name */
    public static final C4927l f14463e;

    /* renamed from: f  reason: collision with root package name */
    public static final C4927l f14464f;

    /* renamed from: g  reason: collision with root package name */
    static final C4927l f14465g = b.f(-1, "NONE", Collections.emptyList());

    /* renamed from: h  reason: collision with root package name */
    private static final Set<C4927l> f14466h;

    /* renamed from: i  reason: collision with root package name */
    private static final List<C4927l> f14467i;

    /* renamed from: V.l$b */
    public static abstract class b extends C4927l {
        public b() {
            super();
        }

        static b f(int i10, String str, List<Size> list) {
            return new C4921f(i10, str, list);
        }

        public abstract String c();

        public abstract List<Size> d();

        public abstract int e();
    }

    static {
        b f10 = b.f(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size[]{new Size(720, 480), new Size(640, 480)})));
        f14459a = f10;
        b f11 = b.f(5, "HD", Collections.singletonList(new Size(SceneLayout.kCurrent3DVersion, 720)));
        f14460b = f11;
        b f12 = b.f(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f14461c = f12;
        b f13 = b.f(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f14462d = f13;
        b f14 = b.f(0, "LOWEST", Collections.emptyList());
        f14463e = f14;
        b f15 = b.f(1, "HIGHEST", Collections.emptyList());
        f14464f = f15;
        f14466h = new HashSet(Arrays.asList(new C4927l[]{f14, f15, f10, f11, f12, f13}));
        f14467i = Arrays.asList(new C4927l[]{f13, f12, f11, f10});
    }

    static boolean a(C4927l lVar) {
        return f14466h.contains(lVar);
    }

    public static List<C4927l> b() {
        return new ArrayList(f14467i);
    }

    private C4927l() {
    }
}
