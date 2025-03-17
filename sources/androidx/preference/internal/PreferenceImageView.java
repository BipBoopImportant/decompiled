package androidx.preference.internal;

import G4.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f43573a;

    /* renamed from: b  reason: collision with root package name */
    private int f43574b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getMaxHeight() {
        return this.f43574b;
    }

    public int getMaxWidth() {
        return this.f43573a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i10);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i11);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i11 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxHeight(int i10) {
        this.f43574b = i10;
        super.setMaxHeight(i10);
    }

    public void setMaxWidth(int i10) {
        this.f43573a = i10;
        super.setMaxWidth(i10);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43573a = Integer.MAX_VALUE;
        this.f43574b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36147y0, i10, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(g.f36042A0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(g.f36149z0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
