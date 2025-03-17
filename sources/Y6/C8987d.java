package y6;

import B6.e;
import B6.f;
import C6.l;
import D6.c;
import D6.q;
import E6.b;
import I6.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.List;
import w6.C8927i;
import x6.C8955a;
import z6.C9019a;
import z6.p;

/* renamed from: y6.d  reason: case insensitive filesystem */
public class C8987d implements C8988e, m, C9019a.b, f {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f57854a;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f57855b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f57856c;

    /* renamed from: d  reason: collision with root package name */
    private final Path f57857d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f57858e;

    /* renamed from: f  reason: collision with root package name */
    private final String f57859f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f57860g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C8986c> f57861h;

    /* renamed from: i  reason: collision with root package name */
    private final o f57862i;

    /* renamed from: j  reason: collision with root package name */
    private List<m> f57863j;

    /* renamed from: k  reason: collision with root package name */
    private p f57864k;

    public C8987d(o oVar, b bVar, q qVar, C8927i iVar) {
        this(oVar, bVar, qVar.c(), qVar.d(), f(oVar, iVar, bVar, qVar.b()), i(qVar.b()));
    }

    private static List<C8986c> f(o oVar, C8927i iVar, b bVar, List<c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8986c a10 = list.get(i10).a(oVar, iVar, bVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    static l i(List<c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof l) {
                return (l) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f57861h.size(); i11++) {
            if ((this.f57861h.get(i11) instanceof C8988e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.f57862i.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f57861h.size());
        arrayList.addAll(list);
        for (int size = this.f57861h.size() - 1; size >= 0; size--) {
            C8986c cVar = this.f57861h.get(size);
            cVar.b(arrayList, this.f57861h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int e10 = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f57861h.size(); i11++) {
                    C8986c cVar = this.f57861h.get(i11);
                    if (cVar instanceof f) {
                        ((f) cVar).c(eVar, e10, list, eVar2);
                    }
                }
            }
        }
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f57856c.set(matrix);
        p pVar = this.f57864k;
        if (pVar != null) {
            this.f57856c.preConcat(pVar.f());
        }
        this.f57858e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f57861h.size() - 1; size >= 0; size--) {
            C8986c cVar = this.f57861h.get(size);
            if (cVar instanceof C8988e) {
                ((C8988e) cVar).e(this.f57858e, this.f57856c, z10);
                rectF.union(this.f57858e);
            }
        }
    }

    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f57860g) {
            this.f57856c.set(matrix);
            p pVar = this.f57864k;
            if (pVar != null) {
                this.f57856c.preConcat(pVar.f());
                i10 = (int) ((((((float) (this.f57864k.h() == null ? 100 : this.f57864k.h().h().intValue())) / 100.0f) * ((float) i10)) / 255.0f) * 255.0f);
            }
            boolean z10 = this.f57862i.c0() && n() && i10 != 255;
            if (z10) {
                this.f57855b.set(0.0f, 0.0f, 0.0f, 0.0f);
                e(this.f57855b, this.f57856c, true);
                this.f57854a.setAlpha(i10);
                j.m(canvas, this.f57855b, this.f57854a);
            }
            if (z10) {
                i10 = 255;
            }
            for (int size = this.f57861h.size() - 1; size >= 0; size--) {
                C8986c cVar = this.f57861h.get(size);
                if (cVar instanceof C8988e) {
                    ((C8988e) cVar).g(canvas, this.f57856c, i10);
                }
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public String getName() {
        return this.f57859f;
    }

    public <T> void h(T t10, J6.c<T> cVar) {
        p pVar = this.f57864k;
        if (pVar != null) {
            pVar.c(t10, cVar);
        }
    }

    public List<C8986c> j() {
        return this.f57861h;
    }

    /* access modifiers changed from: package-private */
    public List<m> k() {
        if (this.f57863j == null) {
            this.f57863j = new ArrayList();
            for (int i10 = 0; i10 < this.f57861h.size(); i10++) {
                C8986c cVar = this.f57861h.get(i10);
                if (cVar instanceof m) {
                    this.f57863j.add((m) cVar);
                }
            }
        }
        return this.f57863j;
    }

    /* access modifiers changed from: package-private */
    public Matrix l() {
        p pVar = this.f57864k;
        if (pVar != null) {
            return pVar.f();
        }
        this.f57856c.reset();
        return this.f57856c;
    }

    public Path m() {
        this.f57856c.reset();
        p pVar = this.f57864k;
        if (pVar != null) {
            this.f57856c.set(pVar.f());
        }
        this.f57857d.reset();
        if (this.f57860g) {
            return this.f57857d;
        }
        for (int size = this.f57861h.size() - 1; size >= 0; size--) {
            C8986c cVar = this.f57861h.get(size);
            if (cVar instanceof m) {
                this.f57857d.addPath(((m) cVar).m(), this.f57856c);
            }
        }
        return this.f57857d;
    }

    C8987d(o oVar, b bVar, String str, boolean z10, List<C8986c> list, l lVar) {
        this.f57854a = new C8955a();
        this.f57855b = new RectF();
        this.f57856c = new Matrix();
        this.f57857d = new Path();
        this.f57858e = new RectF();
        this.f57859f = str;
        this.f57862i = oVar;
        this.f57860g = z10;
        this.f57861h = list;
        if (lVar != null) {
            p b10 = lVar.b();
            this.f57864k = b10;
            b10.a(bVar);
            this.f57864k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C8986c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
