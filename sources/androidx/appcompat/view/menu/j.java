package androidx.appcompat.view.menu;

import I2.C4632s;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.k;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15886a;

    /* renamed from: b  reason: collision with root package name */
    private final f f15887b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15888c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15889d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15890e;

    /* renamed from: f  reason: collision with root package name */
    private View f15891f;

    /* renamed from: g  reason: collision with root package name */
    private int f15892g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15893h;

    /* renamed from: i  reason: collision with root package name */
    private k.a f15894i;

    /* renamed from: j  reason: collision with root package name */
    private i f15895j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f15896k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f15897l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        public void onDismiss() {
            j.this.e();
        }
    }

    public j(Context context, f fVar, View view, boolean z10, int i10) {
        this(context, fVar, view, z10, i10, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.i, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.i a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f15886a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f15886a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = i.C5424d.f23923c
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.c r0 = new androidx.appcompat.view.menu.c
            android.content.Context r3 = r15.f15886a
            android.view.View r4 = r15.f15891f
            int r5 = r15.f15889d
            int r6 = r15.f15890e
            boolean r7 = r15.f15888c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.n r0 = new androidx.appcompat.view.menu.n
            android.content.Context r9 = r15.f15886a
            androidx.appcompat.view.menu.f r10 = r15.f15887b
            android.view.View r11 = r15.f15891f
            int r12 = r15.f15889d
            int r13 = r15.f15890e
            boolean r14 = r15.f15888c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.f r1 = r15.f15887b
            r0.m(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f15897l
            r0.w(r1)
            android.view.View r1 = r15.f15891f
            r0.r(r1)
            androidx.appcompat.view.menu.k$a r1 = r15.f15894i
            r0.e(r1)
            boolean r1 = r15.f15893h
            r0.t(r1)
            int r1 = r15.f15892g
            r0.u(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.j.a():androidx.appcompat.view.menu.i");
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        i c10 = c();
        c10.x(z11);
        if (z10) {
            if ((C4632s.b(this.f15892g, this.f15891f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f15891f.getWidth();
            }
            c10.v(i10);
            c10.y(i11);
            int i12 = (int) ((this.f15886a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.s(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.a();
    }

    public void b() {
        if (d()) {
            this.f15895j.dismiss();
        }
    }

    public i c() {
        if (this.f15895j == null) {
            this.f15895j = a();
        }
        return this.f15895j;
    }

    public boolean d() {
        i iVar = this.f15895j;
        return iVar != null && iVar.b();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f15895j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f15896k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f15891f = view;
    }

    public void g(boolean z10) {
        this.f15893h = z10;
        i iVar = this.f15895j;
        if (iVar != null) {
            iVar.t(z10);
        }
    }

    public void h(int i10) {
        this.f15892g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f15896k = onDismissListener;
    }

    public void j(k.a aVar) {
        this.f15894i = aVar;
        i iVar = this.f15895j;
        if (iVar != null) {
            iVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f15891f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f15891f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public j(Context context, f fVar, View view, boolean z10, int i10, int i11) {
        this.f15892g = 8388611;
        this.f15897l = new a();
        this.f15886a = context;
        this.f15887b = fVar;
        this.f15891f = view;
        this.f15888c = z10;
        this.f15889d = i10;
        this.f15890e = i11;
    }
}
