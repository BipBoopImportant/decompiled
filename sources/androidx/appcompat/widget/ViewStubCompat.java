package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.C5430j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f16486a;

    /* renamed from: b  reason: collision with root package name */
    private int f16487b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f16488c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f16489d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f16486a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f16489d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f16486a, viewGroup, false);
            int i10 = this.f16487b;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f16488c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f16487b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f16489d;
    }

    public int getLayoutResource() {
        return this.f16486a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f16487b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f16489d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f16486a = i10;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f16488c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16486a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24264x3, i10, 0);
        this.f16487b = obtainStyledAttributes.getResourceId(C5430j.f24044A3, -1);
        this.f16486a = obtainStyledAttributes.getResourceId(C5430j.f24274z3, 0);
        setId(obtainStyledAttributes.getResourceId(C5430j.f24269y3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
