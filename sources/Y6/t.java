package y6;

import D6.s;
import E6.b;
import J6.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.o;
import w6.z;
import z6.C9019a;
import z6.C9020b;
import z6.q;

public class t extends C8984a {

    /* renamed from: r  reason: collision with root package name */
    private final b f57973r;

    /* renamed from: s  reason: collision with root package name */
    private final String f57974s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f57975t;

    /* renamed from: u  reason: collision with root package name */
    private final C9019a<Integer, Integer> f57976u;

    /* renamed from: v  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f57977v;

    public t(o oVar, b bVar, s sVar) {
        super(oVar, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f57973r = bVar;
        this.f57974s = sVar.h();
        this.f57975t = sVar.k();
        C9019a<Integer, Integer> h10 = sVar.c().h();
        this.f57976u = h10;
        h10.a(this);
        bVar.i(h10);
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f57975t) {
            this.f57842i.setColor(((C9020b) this.f57976u).p());
            C9019a<ColorFilter, ColorFilter> aVar = this.f57977v;
            if (aVar != null) {
                this.f57842i.setColorFilter(aVar.h());
            }
            super.g(canvas, matrix, i10);
        }
    }

    public String getName() {
        return this.f57974s;
    }

    public <T> void h(T t10, c<T> cVar) {
        super.h(t10, cVar);
        if (t10 == z.f57308b) {
            this.f57976u.n(cVar);
        } else if (t10 == z.f57302K) {
            C9019a<ColorFilter, ColorFilter> aVar = this.f57977v;
            if (aVar != null) {
                this.f57973r.I(aVar);
            }
            if (cVar == null) {
                this.f57977v = null;
                return;
            }
            q qVar = new q(cVar);
            this.f57977v = qVar;
            qVar.a(this);
            this.f57973r.i(this.f57976u);
        }
    }
}
