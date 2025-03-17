package E6;

import B6.e;
import C6.b;
import I6.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import j0.C5468y;
import java.util.ArrayList;
import java.util.List;
import w6.C8923e;
import w6.C8927i;
import w6.z;
import z6.C9019a;
import z6.q;

public class c extends b {

    /* renamed from: D  reason: collision with root package name */
    private C9019a<Float, Float> f34941D;

    /* renamed from: E  reason: collision with root package name */
    private final List<b> f34942E = new ArrayList();

    /* renamed from: F  reason: collision with root package name */
    private final RectF f34943F = new RectF();

    /* renamed from: G  reason: collision with root package name */
    private final RectF f34944G = new RectF();

    /* renamed from: H  reason: collision with root package name */
    private final Paint f34945H = new Paint();

    /* renamed from: I  reason: collision with root package name */
    private float f34946I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f34947J = true;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34948a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                E6.e$b[] r0 = E6.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34948a = r0
                E6.e$b r1 = E6.e.b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34948a     // Catch:{ NoSuchFieldError -> 0x001d }
                E6.e$b r1 = E6.e.b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E6.c.a.<clinit>():void");
        }
    }

    public c(o oVar, e eVar, List<e> list, C8927i iVar) {
        super(oVar, eVar);
        int i10;
        b bVar;
        b v10 = eVar.v();
        if (v10 != null) {
            C9019a<Float, Float> h10 = v10.h();
            this.f34941D = h10;
            i(h10);
            this.f34941D.a(this);
        } else {
            this.f34941D = null;
        }
        C5468y yVar = new C5468y(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b v11 = b.v(this, eVar2, oVar, iVar);
            if (v11 != null) {
                yVar.k(v11.A().e(), v11);
                if (bVar2 != null) {
                    bVar2.K(v11);
                    bVar2 = null;
                } else {
                    this.f34942E.add(0, v11);
                    int i11 = a.f34948a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = v11;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < yVar.o(); i10++) {
            b bVar3 = (b) yVar.d(yVar.j(i10));
            if (!(bVar3 == null || (bVar = (b) yVar.d(bVar3.A().k())) == null)) {
                bVar3.M(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void J(e eVar, int i10, List<e> list, e eVar2) {
        for (int i11 = 0; i11 < this.f34942E.size(); i11++) {
            this.f34942E.get(i11).c(eVar, i10, list, eVar2);
        }
    }

    public void L(boolean z10) {
        super.L(z10);
        for (b L10 : this.f34942E) {
            L10.L(z10);
        }
    }

    public void N(float f10) {
        C8923e.b("CompositionLayer#setProgress");
        this.f34946I = f10;
        super.N(f10);
        if (this.f34941D != null) {
            f10 = ((this.f34941D.h().floatValue() * this.f34929q.c().i()) - this.f34929q.c().p()) / (this.f34928p.H().e() + 0.01f);
        }
        if (this.f34941D == null) {
            f10 -= this.f34929q.s();
        }
        if (this.f34929q.w() != 0.0f && !"__container".equals(this.f34929q.j())) {
            f10 /= this.f34929q.w();
        }
        for (int size = this.f34942E.size() - 1; size >= 0; size--) {
            this.f34942E.get(size).N(f10);
        }
        C8923e.c("CompositionLayer#setProgress");
    }

    public float Q() {
        return this.f34946I;
    }

    public void R(boolean z10) {
        this.f34947J = z10;
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        for (int size = this.f34942E.size() - 1; size >= 0; size--) {
            this.f34943F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f34942E.get(size).e(this.f34943F, this.f34927o, true);
            rectF.union(this.f34943F);
        }
    }

    public <T> void h(T t10, J6.c<T> cVar) {
        super.h(t10, cVar);
        if (t10 != z.f57296E) {
            return;
        }
        if (cVar == null) {
            C9019a<Float, Float> aVar = this.f34941D;
            if (aVar != null) {
                aVar.n((J6.c<Float>) null);
                return;
            }
            return;
        }
        q qVar = new q(cVar);
        this.f34941D = qVar;
        qVar.a(this);
        i(this.f34941D);
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        C8923e.b("CompositionLayer#draw");
        this.f34944G.set(0.0f, 0.0f, this.f34929q.m(), this.f34929q.l());
        matrix.mapRect(this.f34944G);
        boolean z10 = this.f34928p.c0() && this.f34942E.size() > 1 && i10 != 255;
        if (z10) {
            this.f34945H.setAlpha(i10);
            j.m(canvas, this.f34944G, this.f34945H);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f34942E.size() - 1; size >= 0; size--) {
            if (((this.f34947J || !"__container".equals(this.f34929q.j())) && !this.f34944G.isEmpty()) ? canvas.clipRect(this.f34944G) : true) {
                this.f34942E.get(size).g(canvas, matrix, i10);
            }
        }
        canvas.restore();
        C8923e.c("CompositionLayer#draw");
    }
}
