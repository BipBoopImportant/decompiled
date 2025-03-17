package y6;

import D6.t;
import E6.b;
import android.graphics.Path;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.List;
import z6.C9019a;
import z6.C9031m;

public class r implements m, C9019a.b {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57966a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f57967b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57968c;

    /* renamed from: d  reason: collision with root package name */
    private final o f57969d;

    /* renamed from: e  reason: collision with root package name */
    private final C9031m f57970e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57971f;

    /* renamed from: g  reason: collision with root package name */
    private final C8985b f57972g = new C8985b();

    public r(o oVar, b bVar, D6.r rVar) {
        this.f57967b = rVar.b();
        this.f57968c = rVar.d();
        this.f57969d = oVar;
        C9031m a10 = rVar.c().h();
        this.f57970e = a10;
        bVar.i(a10);
        a10.a(this);
    }

    private void c() {
        this.f57971f = false;
        this.f57969d.invalidateSelf();
    }

    public void a() {
        c();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8986c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f57972g.a(uVar);
                    uVar.c(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f57970e.q(arrayList);
    }

    public Path m() {
        if (this.f57971f) {
            return this.f57966a;
        }
        this.f57966a.reset();
        if (this.f57968c) {
            this.f57971f = true;
            return this.f57966a;
        }
        Path path = (Path) this.f57970e.h();
        if (path == null) {
            return this.f57966a;
        }
        this.f57966a.set(path);
        this.f57966a.setFillType(Path.FillType.EVEN_ODD);
        this.f57972g.b(this.f57966a);
        this.f57971f = true;
        return this.f57966a;
    }
}
