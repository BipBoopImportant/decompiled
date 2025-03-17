package E6;

import I6.j;
import J6.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import w6.v;
import w6.z;
import x6.C8955a;
import z6.C9019a;
import z6.q;

public class d extends b {

    /* renamed from: D  reason: collision with root package name */
    private final Paint f34949D = new C8955a(3);

    /* renamed from: E  reason: collision with root package name */
    private final Rect f34950E = new Rect();

    /* renamed from: F  reason: collision with root package name */
    private final Rect f34951F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    private final v f34952G;

    /* renamed from: H  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f34953H;

    /* renamed from: I  reason: collision with root package name */
    private C9019a<Bitmap, Bitmap> f34954I;

    d(o oVar, e eVar) {
        super(oVar, eVar);
        this.f34952G = oVar.N(eVar.n());
    }

    private Bitmap Q() {
        Bitmap h10;
        C9019a<Bitmap, Bitmap> aVar = this.f34954I;
        if (aVar != null && (h10 = aVar.h()) != null) {
            return h10;
        }
        Bitmap F10 = this.f34928p.F(this.f34929q.n());
        if (F10 != null) {
            return F10;
        }
        v vVar = this.f34952G;
        if (vVar != null) {
            return vVar.a();
        }
        return null;
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        if (this.f34952G != null) {
            float e10 = j.e();
            rectF.set(0.0f, 0.0f, ((float) this.f34952G.e()) * e10, ((float) this.f34952G.c()) * e10);
            this.f34927o.mapRect(rectF);
        }
    }

    public <T> void h(T t10, c<T> cVar) {
        super.h(t10, cVar);
        if (t10 == z.f57302K) {
            if (cVar == null) {
                this.f34953H = null;
            } else {
                this.f34953H = new q(cVar);
            }
        } else if (t10 != z.f57305N) {
        } else {
            if (cVar == null) {
                this.f34954I = null;
            } else {
                this.f34954I = new q(cVar);
            }
        }
    }

    public void u(Canvas canvas, Matrix matrix, int i10) {
        Bitmap Q10 = Q();
        if (Q10 != null && !Q10.isRecycled() && this.f34952G != null) {
            float e10 = j.e();
            this.f34949D.setAlpha(i10);
            C9019a<ColorFilter, ColorFilter> aVar = this.f34953H;
            if (aVar != null) {
                this.f34949D.setColorFilter(aVar.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f34950E.set(0, 0, Q10.getWidth(), Q10.getHeight());
            if (this.f34928p.O()) {
                this.f34951F.set(0, 0, (int) (((float) this.f34952G.e()) * e10), (int) (((float) this.f34952G.c()) * e10));
            } else {
                this.f34951F.set(0, 0, (int) (((float) Q10.getWidth()) * e10), (int) (((float) Q10.getHeight()) * e10));
            }
            canvas.drawBitmap(Q10, this.f34950E, this.f34951F, this.f34949D);
            canvas.restore();
        }
    }
}
