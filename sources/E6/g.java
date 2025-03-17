package E6;

import B6.e;
import D6.a;
import D6.q;
import G6.C6515j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.Collections;
import java.util.List;
import w6.C8927i;
import y6.C8987d;

public class g extends b {

    /* renamed from: D  reason: collision with root package name */
    private final C8987d f34980D;

    /* renamed from: E  reason: collision with root package name */
    private final c f34981E;

    g(o oVar, e eVar, c cVar, C8927i iVar) {
        super(oVar, eVar);
        this.f34981E = cVar;
        C8987d dVar = new C8987d(oVar, this, new q("__container", eVar.o(), false), iVar);
        this.f34980D = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    public void J(e eVar, int i10, List<e> list, e eVar2) {
        this.f34980D.c(eVar, i10, list, eVar2);
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.f34980D.e(rectF, this.f34927o, z10);
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        this.f34980D.g(canvas, matrix, i10);
    }

    public a x() {
        a x10 = super.x();
        return x10 != null ? x10 : this.f34981E.x();
    }

    public C6515j z() {
        C6515j z10 = super.z();
        return z10 != null ? z10 : this.f34981E.z();
    }
}
