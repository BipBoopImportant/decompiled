package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class o {

    /* renamed from: a  reason: collision with root package name */
    boolean f44160a = true;

    /* renamed from: b  reason: collision with root package name */
    int f44161b;

    /* renamed from: c  reason: collision with root package name */
    int f44162c;

    /* renamed from: d  reason: collision with root package name */
    int f44163d;

    /* renamed from: e  reason: collision with root package name */
    int f44164e;

    /* renamed from: f  reason: collision with root package name */
    int f44165f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f44166g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f44167h;

    /* renamed from: i  reason: collision with root package name */
    boolean f44168i;

    o() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.C c10) {
        int i10 = this.f44162c;
        return i10 >= 0 && i10 < c10.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.x xVar) {
        View o10 = xVar.o(this.f44162c);
        this.f44162c += this.f44163d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f44161b + ", mCurrentPosition=" + this.f44162c + ", mItemDirection=" + this.f44163d + ", mLayoutDirection=" + this.f44164e + ", mStartLine=" + this.f44165f + ", mEndLine=" + this.f44166g + '}';
    }
}
