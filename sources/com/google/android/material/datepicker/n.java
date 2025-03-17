package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

class n extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f66629d = 4;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f66630a;

    /* renamed from: b  reason: collision with root package name */
    private final int f66631b;

    /* renamed from: c  reason: collision with root package name */
    private final int f66632c;

    public n() {
        Calendar m10 = y.m();
        this.f66630a = m10;
        this.f66631b = m10.getMaximum(7);
        this.f66632c = m10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f66632c;
        int i12 = this.f66631b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f66631b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    public int getCount() {
        return this.f66631b;
    }

    public long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L_0x0017
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = Ea.C9074h.f59538v
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r5 = r3.f66630a
            int r4 = r3.b(r4)
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.util.Calendar r5 = r3.f66630a
            int r2 = f66629d
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r5 = Ea.C9076j.f59579v
            java.lang.String r4 = r4.getString(r5)
            java.util.Calendar r5 = r3.f66630a
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public n(int i10) {
        Calendar m10 = y.m();
        this.f66630a = m10;
        this.f66631b = m10.getMaximum(7);
        this.f66632c = i10;
    }
}
