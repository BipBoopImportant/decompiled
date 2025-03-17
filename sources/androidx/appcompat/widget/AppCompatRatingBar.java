package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import i.C5421a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final C4999k f16087a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23879I);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.f16087a.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C4999k kVar = new C4999k(this);
        this.f16087a = kVar;
        kVar.c(attributeSet, i10);
    }
}
