package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class i extends RecyclerView.p {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f44044d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    private Drawable f44045a;

    /* renamed from: b  reason: collision with root package name */
    private int f44046b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f44047c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public i(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f44044d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f44045a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        o(i10);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            i10 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), i10);
        } else {
            i10 = recyclerView.getHeight();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().r0(childAt, this.f44047c);
            int round = this.f44047c.right + Math.round(childAt.getTranslationX());
            this.f44045a.setBounds(round - this.f44045a.getIntrinsicWidth(), i11, round, i10);
            this.f44045a.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingLeft();
            i10 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i11, recyclerView.getPaddingTop(), i10, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i10 = recyclerView.getWidth();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.q0(childAt, this.f44047c);
            int round = this.f44047c.bottom + Math.round(childAt.getTranslationY());
            this.f44045a.setBounds(i11, round - this.f44045a.getIntrinsicHeight(), i10, round);
            this.f44045a.draw(canvas);
        }
        canvas.restore();
    }

    @SuppressLint({"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        Drawable drawable = this.f44045a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f44046b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        if (recyclerView.getLayoutManager() != null && this.f44045a != null) {
            if (this.f44046b == 1) {
                m(canvas, recyclerView);
            } else {
                l(canvas, recyclerView);
            }
        }
    }

    public void n(Drawable drawable) {
        if (drawable != null) {
            this.f44045a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void o(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f44046b = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
