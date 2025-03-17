package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p2.C5756a;
import p2.e;

public class Barrier extends ConstraintHelper {

    /* renamed from: j  reason: collision with root package name */
    private int f20144j;

    /* renamed from: k  reason: collision with root package name */
    private int f20145k;

    /* renamed from: l  reason: collision with root package name */
    private C5756a f20146l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(e eVar, int i10, boolean z10) {
        this.f20145k = i10;
        if (z10) {
            int i11 = this.f20144j;
            if (i11 == 5) {
                this.f20145k = 1;
            } else if (i11 == 6) {
                this.f20145k = 0;
            }
        } else {
            int i12 = this.f20144j;
            if (i12 == 5) {
                this.f20145k = 0;
            } else if (i12 == 6) {
                this.f20145k = 1;
            }
        }
        if (eVar instanceof C5756a) {
            ((C5756a) eVar).E1(this.f20145k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f20146l.y1();
    }

    public int getMargin() {
        return this.f20146l.A1();
    }

    public int getType() {
        return this.f20144j;
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f20146l = new C5756a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20616V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20756l1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20747k1) {
                    this.f20146l.D1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == f.f20765m1) {
                    this.f20146l.F1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f20150d = this.f20146l;
        s();
    }

    public void n(e eVar, boolean z10) {
        t(eVar, this.f20144j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f20146l.D1(z10);
    }

    public void setDpMargin(int i10) {
        C5756a aVar = this.f20146l;
        aVar.F1((int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f20146l.F1(i10);
    }

    public void setType(int i10) {
        this.f20144j = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
