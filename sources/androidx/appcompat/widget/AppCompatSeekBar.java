package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import i.C5421a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final C5001m f16088a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23880J);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f16088a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f16088a.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f16088a.g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C5001m mVar = new C5001m(this);
        this.f16088a = mVar;
        mVar.c(attributeSet, i10);
    }
}
