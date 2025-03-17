package E6;

import J6.c;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import w6.z;
import x6.C8955a;
import z6.C9019a;
import z6.q;

public class h extends b {

    /* renamed from: D  reason: collision with root package name */
    private final RectF f34982D = new RectF();

    /* renamed from: E  reason: collision with root package name */
    private final Paint f34983E;

    /* renamed from: F  reason: collision with root package name */
    private final float[] f34984F;

    /* renamed from: G  reason: collision with root package name */
    private final Path f34985G;

    /* renamed from: H  reason: collision with root package name */
    private final e f34986H;

    /* renamed from: I  reason: collision with root package name */
    private C9019a<ColorFilter, ColorFilter> f34987I;

    /* renamed from: J  reason: collision with root package name */
    private C9019a<Integer, Integer> f34988J;

    h(o oVar, e eVar) {
        super(oVar, eVar);
        C8955a aVar = new C8955a();
        this.f34983E = aVar;
        this.f34984F = new float[8];
        this.f34985G = new Path();
        this.f34986H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.f34982D.set(0.0f, 0.0f, (float) this.f34986H.r(), (float) this.f34986H.q());
        this.f34927o.mapRect(this.f34982D);
        rectF.set(this.f34982D);
    }

    public <T> void h(T t10, c<T> cVar) {
        super.h(t10, cVar);
        if (t10 == z.f57302K) {
            if (cVar == null) {
                this.f34987I = null;
            } else {
                this.f34987I = new q(cVar);
            }
        } else if (t10 != z.f57307a) {
        } else {
            if (cVar == null) {
                this.f34988J = null;
                this.f34983E.setColor(this.f34986H.p());
                return;
            }
            this.f34988J = new q(cVar);
        }
    }

    public void u(Canvas canvas, Matrix matrix, int i10) {
        int alpha = Color.alpha(this.f34986H.p());
        if (alpha != 0) {
            int intValue = (int) ((((float) i10) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f34936x.h() == null ? 100 : this.f34936x.h().h().intValue()))) / 100.0f) * 255.0f);
            this.f34983E.setAlpha(intValue);
            C9019a<Integer, Integer> aVar = this.f34988J;
            if (aVar != null) {
                this.f34983E.setColor(aVar.h().intValue());
            }
            C9019a<ColorFilter, ColorFilter> aVar2 = this.f34987I;
            if (aVar2 != null) {
                this.f34983E.setColorFilter(aVar2.h());
            }
            if (intValue > 0) {
                float[] fArr = this.f34984F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f34986H.r();
                float[] fArr2 = this.f34984F;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f34986H.r();
                this.f34984F[5] = (float) this.f34986H.q();
                float[] fArr3 = this.f34984F;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f34986H.q();
                matrix.mapPoints(this.f34984F);
                this.f34985G.reset();
                Path path = this.f34985G;
                float[] fArr4 = this.f34984F;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f34985G;
                float[] fArr5 = this.f34984F;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f34985G;
                float[] fArr6 = this.f34984F;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f34985G;
                float[] fArr7 = this.f34984F;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f34985G;
                float[] fArr8 = this.f34984F;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f34985G.close();
                canvas.drawPath(this.f34985G, this.f34983E);
            }
        }
    }
}
