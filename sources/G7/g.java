package G7;

import C7.f;
import E7.v;
import G7.h;
import Y7.h;
import android.annotation.SuppressLint;

public class g extends h<f, v<?>> implements h {

    /* renamed from: e  reason: collision with root package name */
    private h.a f36243e;

    public g(long j10) {
        super(j10);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    public /* bridge */ /* synthetic */ v c(f fVar) {
        return (v) super.l(fVar);
    }

    public /* bridge */ /* synthetic */ v d(f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    public void e(h.a aVar) {
        this.f36243e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int i(v<?> vVar) {
        return vVar == null ? super.i(null) : vVar.a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void j(f fVar, v<?> vVar) {
        h.a aVar = this.f36243e;
        if (aVar != null && vVar != null) {
            aVar.b(vVar);
        }
    }
}
