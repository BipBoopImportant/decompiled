package com.google.android.material.datepicker;

import Ea.C9072f;
import H2.d;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.internal.v;
import java.util.Calendar;
import java.util.Iterator;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f66522a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f66523b;

    class a extends C4597a {
        a() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.k0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    /* renamed from: b */
    public r getAdapter() {
        return (r) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        r b10 = getAdapter();
        i<?> iVar = b10.f66644b;
        c cVar = b10.f66646d;
        int max = Math.max(b10.b(), getFirstVisiblePosition());
        int min = Math.min(b10.m(), getLastVisiblePosition());
        Long d10 = b10.getItem(max);
        Long d11 = b10.getItem(min);
        Iterator<d<Long, Long>> it = iVar.L1().iterator();
        while (it.hasNext()) {
            d next = it.next();
            F f10 = next.f7052a;
            if (f10 == null) {
                materialCalendarGridView = this;
            } else if (next.f7053b != null) {
                Long l10 = (Long) f10;
                long longValue = l10.longValue();
                Long l11 = (Long) next.f7053b;
                long longValue2 = l11.longValue();
                if (!e(d10, d11, l10, l11)) {
                    boolean i16 = v.i(this);
                    if (longValue < d10.longValue()) {
                        i10 = b10.h(max) ? 0 : !i16 ? materialCalendarGridView.c(max - 1).getRight() : materialCalendarGridView.c(max - 1).getLeft();
                        i11 = max;
                    } else {
                        materialCalendarGridView.f66522a.setTimeInMillis(longValue);
                        i11 = b10.a(materialCalendarGridView.f66522a.get(5));
                        i10 = d(materialCalendarGridView.c(i11));
                    }
                    if (longValue2 > d11.longValue()) {
                        i12 = b10.i(min) ? getWidth() : !i16 ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        i13 = min;
                    } else {
                        materialCalendarGridView.f66522a.setTimeInMillis(longValue2);
                        i13 = b10.a(materialCalendarGridView.f66522a.get(5));
                        i12 = d(materialCalendarGridView.c(i13));
                    }
                    int itemId = (int) b10.getItemId(i11);
                    int i17 = max;
                    int i18 = min;
                    int itemId2 = (int) b10.getItemId(i13);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c10 = materialCalendarGridView.c(numColumns);
                        int top = c10.getTop() + cVar.f66605a.c();
                        r rVar = b10;
                        int bottom = c10.getBottom() - cVar.f66605a.b();
                        if (!i16) {
                            i15 = numColumns > i11 ? 0 : i10;
                            i14 = i13 > numColumns2 ? getWidth() : i12;
                        } else {
                            int i19 = i13 > numColumns2 ? 0 : i12;
                            i14 = numColumns > i11 ? getWidth() : i10;
                            i15 = i19;
                        }
                        canvas.drawRect((float) i15, (float) top, (float) i14, (float) bottom, cVar.f66612h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        b10 = rVar;
                    }
                    materialCalendarGridView = this;
                    max = i17;
                    min = i18;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i10, int i11) {
        if (this.f66523b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66522a = y.m();
        if (MaterialDatePicker.v0(getContext())) {
            setNextFocusLeftId(C9072f.f59483a);
            setNextFocusRightId(C9072f.f59486d);
        }
        this.f66523b = MaterialDatePicker.x0(getContext());
        C4600b0.p0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof r) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()}));
    }
}
