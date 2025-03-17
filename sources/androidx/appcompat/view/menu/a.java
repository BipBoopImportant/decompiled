package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

public abstract class a implements k {

    /* renamed from: a  reason: collision with root package name */
    protected Context f15754a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f15755b;

    /* renamed from: c  reason: collision with root package name */
    protected f f15756c;

    /* renamed from: d  reason: collision with root package name */
    protected LayoutInflater f15757d;

    /* renamed from: e  reason: collision with root package name */
    protected LayoutInflater f15758e;

    /* renamed from: f  reason: collision with root package name */
    private k.a f15759f;

    /* renamed from: g  reason: collision with root package name */
    private int f15760g;

    /* renamed from: h  reason: collision with root package name */
    private int f15761h;

    /* renamed from: i  reason: collision with root package name */
    protected l f15762i;

    /* renamed from: j  reason: collision with root package name */
    private int f15763j;

    public a(Context context, int i10, int i11) {
        this.f15754a = context;
        this.f15757d = LayoutInflater.from(context);
        this.f15760g = i10;
        this.f15761h = i11;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f15762i).addView(view, i10);
    }

    public abstract void b(h hVar, l.a aVar);

    public void c(f fVar, boolean z10) {
        k.a aVar = this.f15759f;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public boolean d(f fVar, h hVar) {
        return false;
    }

    public void e(k.a aVar) {
        this.f15759f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(androidx.appcompat.view.menu.o r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.k$a r0 = r1.f15759f
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.f r2 = r1.f15756c
        L_0x0009:
            boolean r2 = r0.d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.g(androidx.appcompat.view.menu.o):boolean");
    }

    public int getId() {
        return this.f15763j;
    }

    public void i(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f15762i;
        if (viewGroup != null) {
            f fVar = this.f15756c;
            int i10 = 0;
            if (fVar != null) {
                fVar.t();
                ArrayList<h> G10 = this.f15756c.G();
                int size = G10.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    h hVar = G10.get(i12);
                    if (s(i11, hVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        h itemData = childAt instanceof l.a ? ((l.a) childAt).getItemData() : null;
                        View p10 = p(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            p10.setPressed(false);
                            p10.jumpDrawablesToCurrentState();
                        }
                        if (p10 != childAt) {
                            a(p10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!n(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public boolean k(f fVar, h hVar) {
        return false;
    }

    public void l(Context context, f fVar) {
        this.f15755b = context;
        this.f15758e = LayoutInflater.from(context);
        this.f15756c = fVar;
    }

    public l.a m(ViewGroup viewGroup) {
        return (l.a) this.f15757d.inflate(this.f15761h, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public k.a o() {
        return this.f15759f;
    }

    public View p(h hVar, View view, ViewGroup viewGroup) {
        l.a m10 = view instanceof l.a ? (l.a) view : m(viewGroup);
        b(hVar, m10);
        return (View) m10;
    }

    public l q(ViewGroup viewGroup) {
        if (this.f15762i == null) {
            l lVar = (l) this.f15757d.inflate(this.f15760g, viewGroup, false);
            this.f15762i = lVar;
            lVar.a(this.f15756c);
            i(true);
        }
        return this.f15762i;
    }

    public void r(int i10) {
        this.f15763j = i10;
    }

    public abstract boolean s(int i10, h hVar);
}
