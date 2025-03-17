package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.f;
import p2.e;
import p2.g;
import p2.l;

public class Flow extends VirtualLayout {

    /* renamed from: l  reason: collision with root package name */
    private g f20003l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f20003l = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20616V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == f.f20624W0) {
                    this.f20003l.H2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20632X0) {
                    this.f20003l.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20720h1) {
                    this.f20003l.R1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20729i1) {
                    this.f20003l.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20640Y0) {
                    this.f20003l.P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20648Z0) {
                    this.f20003l.S1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20657a1) {
                    this.f20003l.Q1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20666b1) {
                    this.f20003l.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20505H1) {
                    this.f20003l.M2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20864x1) {
                    this.f20003l.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20497G1) {
                    this.f20003l.L2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20810r1) {
                    this.f20003l.v2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20882z1) {
                    this.f20003l.D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20828t1) {
                    this.f20003l.x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20455B1) {
                    this.f20003l.F2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f20846v1) {
                    this.f20003l.z2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20801q1) {
                    this.f20003l.u2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20873y1) {
                    this.f20003l.C2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20819s1) {
                    this.f20003l.w2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20446A1) {
                    this.f20003l.E2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20481E1) {
                    this.f20003l.J2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f20837u1) {
                    this.f20003l.y2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f20473D1) {
                    this.f20003l.I2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f20855w1) {
                    this.f20003l.A2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20489F1) {
                    this.f20003l.K2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f20464C1) {
                    this.f20003l.G2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f20150d = this.f20003l;
        s();
    }

    public void n(e eVar, boolean z10) {
        this.f20003l.x1(z10);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        t(this.f20003l, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f20003l.u2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f20003l.v2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f20003l.w2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f20003l.x2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f20003l.y2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f20003l.z2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f20003l.A2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f20003l.B2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f20003l.C2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f20003l.D2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f20003l.E2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f20003l.F2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f20003l.G2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f20003l.H2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f20003l.M1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f20003l.N1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f20003l.P1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f20003l.Q1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f20003l.S1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f20003l.I2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f20003l.J2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f20003l.K2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f20003l.L2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f20003l.M2(i10);
        requestLayout();
    }

    public void t(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar != null) {
            lVar.G1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.B1(), lVar.A1());
            return;
        }
        setMeasuredDimension(0, 0);
    }
}
