package U;

import C.C4391e0;
import G.q;
import K9.C6620s;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.n;
import com.sugarcube.decorate_engine.SceneLayout;
import h0.C5408a;
import hd.C9774a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import xa.C8971l;

public class c implements f.a {

    /* renamed from: g  reason: collision with root package name */
    private static final Size f13720g = new Size(480, 360);

    /* renamed from: a  reason: collision with root package name */
    private final List<C9774a<?>> f13721a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13722b;

    /* renamed from: c  reason: collision with root package name */
    final H2.a<a> f13723c;

    /* renamed from: d  reason: collision with root package name */
    final C5408a f13724d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f13725e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f13726f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<C9774a<?>, Object> f13727a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<C9774a<?>, Throwable> f13728b;

        /* renamed from: c  reason: collision with root package name */
        private final long f13729c;

        public a(Map<C9774a<?>, Object> map, long j10, Map<C9774a<?>, Throwable> map2) {
            this.f13727a = map;
            this.f13728b = map2;
            this.f13729c = j10;
        }

        private void a(C9774a<?> aVar) {
            C6620s.b(this.f13727a.containsKey(aVar) || this.f13728b.containsKey(aVar), "The detector does not exist");
        }

        public Throwable b(C9774a<?> aVar) {
            a(aVar);
            return this.f13728b.get(aVar);
        }

        public <T> T c(C9774a<T> aVar) {
            a(aVar);
            return this.f13727a.get(aVar);
        }
    }

    public c(List<C9774a<?>> list, int i10, Executor executor, H2.a<a> aVar) {
        if (i10 != 0) {
            for (C9774a<?> K12 : list) {
                C6620s.b(K12.K1() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.f13721a = new ArrayList(list);
        this.f13722b = i10;
        this.f13723c = aVar;
        this.f13725e = executor;
        C5408a aVar2 = new C5408a();
        this.f13724d = aVar2;
        aVar2.a(true);
    }

    private void g(n nVar, int i10, Matrix matrix, Map<C9774a<?>, Object> map, Map<C9774a<?>, Throwable> map2) {
        int i11 = i10;
        Map<C9774a<?>, Throwable> map3 = map2;
        Image k10 = nVar.k();
        if (k10 == null) {
            C4391e0.c("MlKitAnalyzer", "Image is null.");
            nVar.close();
        } else if (i11 > this.f13721a.size() - 1) {
            nVar.close();
            n nVar2 = nVar;
            this.f13725e.execute(new a(this, map, nVar, map3));
        } else {
            n nVar3 = nVar;
            Map<C9774a<?>, Object> map4 = map;
            C9774a aVar = this.f13721a.get(i10);
            try {
                aVar.H1(k10, nVar.F2().e(), matrix).b(this.f13725e, new b(this, map2, aVar, map, nVar, i10, matrix));
            } catch (Exception e10) {
                map3.put(aVar, new RuntimeException("Failed to process the image.", e10));
                g(nVar, i11 + 1, matrix, map, map2);
            }
        }
    }

    private Size h(int i10) {
        return (i10 == 1 || i10 == 4) ? new Size(SceneLayout.kCurrent3DVersion, 720) : f13720g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Map map, n nVar, Map map2) {
        this.f13723c.accept(new a(map, nVar.F2().a(), map2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(Map map, C9774a aVar, Map map2, n nVar, int i10, Matrix matrix, C8971l lVar) {
        if (lVar.o()) {
            map.put(aVar, new CancellationException("The task is canceled."));
        } else if (lVar.q()) {
            map2.put(aVar, lVar.m());
        } else {
            map.put(aVar, lVar.l());
        }
        g(nVar, i10 + 1, matrix, map2, map);
    }

    public final Size a() {
        Size size = f13720g;
        for (C9774a<?> K12 : this.f13721a) {
            Size h10 = h(K12.K1());
            if (h10.getHeight() * h10.getWidth() > size.getWidth() * size.getHeight()) {
                size = h10;
            }
        }
        return size;
    }

    public final int b() {
        return this.f13722b;
    }

    public final void c(Matrix matrix) {
        if (matrix == null) {
            this.f13726f = null;
        } else {
            this.f13726f = new Matrix(matrix);
        }
    }

    public final void d(n nVar) {
        Matrix matrix = new Matrix();
        int i10 = this.f13722b;
        if (i10 != 0) {
            Matrix matrix2 = this.f13726f;
            if (i10 == 2 || matrix2 != null) {
                Matrix matrix3 = new Matrix(nVar.F2().d());
                RectF rectF = new RectF(0.0f, 0.0f, (float) nVar.getWidth(), (float) nVar.getHeight());
                matrix3.postConcat(q.d(rectF, q.p(rectF, nVar.F2().e()), nVar.F2().e()));
                matrix3.invert(matrix);
                if (this.f13722b != 2) {
                    matrix.postConcat(matrix2);
                }
            } else {
                C4391e0.a("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                nVar.close();
                return;
            }
        }
        g(nVar, 0, matrix, new HashMap(), new HashMap());
    }
}
