package com.google.android.material.datepicker;

import H2.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

class r extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    static final int f66641g = y.m().getMaximum(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f66642h = ((y.m().getMaximum(5) + y.m().getMaximum(7)) - 1);

    /* renamed from: a  reason: collision with root package name */
    final q f66643a;

    /* renamed from: b  reason: collision with root package name */
    final i<?> f66644b;

    /* renamed from: c  reason: collision with root package name */
    private Collection<Long> f66645c;

    /* renamed from: d  reason: collision with root package name */
    c f66646d;

    /* renamed from: e  reason: collision with root package name */
    final a f66647e;

    /* renamed from: f  reason: collision with root package name */
    final m f66648f;

    r(q qVar, i<?> iVar, a aVar, m mVar) {
        this.f66643a = qVar;
        this.f66644b = iVar;
        this.f66647e = aVar;
        this.f66648f = mVar;
        this.f66645c = iVar.Q2();
    }

    private String c(Context context, long j10) {
        return j.c(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f66646d == null) {
            this.f66646d = new c(context);
        }
    }

    private boolean j(long j10) {
        for (Long longValue : this.f66644b.Q2()) {
            if (y.a(j10) == y.a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        return y.k().getTimeInMillis() == j10;
    }

    private void o(TextView textView, long j10, int i10) {
        boolean z10;
        b bVar;
        TextView textView2 = textView;
        long j11 = j10;
        if (textView2 != null) {
            Context context = textView.getContext();
            String c10 = c(context, j11);
            textView2.setContentDescription(c10);
            boolean W02 = this.f66647e.g().W0(j11);
            if (W02) {
                textView2.setEnabled(true);
                boolean j12 = j(j11);
                textView2.setSelected(j12);
                bVar = j12 ? this.f66646d.f66606b : l(j11) ? this.f66646d.f66607c : this.f66646d.f66605a;
                z10 = j12;
            } else {
                textView2.setEnabled(false);
                z10 = false;
                bVar = this.f66646d.f66611g;
            }
            m mVar = this.f66648f;
            if (mVar == null || i10 == -1) {
                bVar.d(textView2);
                return;
            }
            q qVar = this.f66643a;
            int i11 = qVar.f66636c;
            int i12 = qVar.f66635b;
            Context context2 = context;
            int i13 = i11;
            int i14 = i10;
            boolean z11 = W02;
            int i15 = i12;
            ColorStateList a10 = mVar.a(context2, i13, i12, i14, z11, z10);
            boolean z12 = z10;
            bVar.e(textView2, a10, this.f66648f.g(context2, i13, i15, i14, z11, z12));
            Drawable c11 = this.f66648f.c(context2, i13, i15, i14, z11, z12);
            Drawable e10 = this.f66648f.e(context2, i13, i15, i14, z11, z12);
            String str = c10;
            Drawable d10 = this.f66648f.d(context2, i13, i15, i14, z11, z12);
            boolean z13 = z10;
            textView2.setCompoundDrawables(c11, e10, d10, this.f66648f.b(context2, i13, i15, i14, z11, z13));
            textView2.setContentDescription(this.f66648f.f(context2, i13, i15, i14, z11, z13, str));
        }
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (q.j(j10).equals(this.f66643a)) {
            int B10 = this.f66643a.B(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(B10) - materialCalendarGridView.getFirstVisiblePosition()), j10, B10);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f66643a.n(this.f66647e.i());
    }

    /* renamed from: d */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f66643a.v(n(i10)));
    }

    /* JADX WARNING: type inference failed for: r7v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = Ea.C9074h.f59537u
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0054
            com.google.android.material.datepicker.q r8 = r5.f66643a
            int r2 = r8.f66638e
            if (r7 < r2) goto L_0x002d
            goto L_0x0054
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x005d
        L_0x0054:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L_0x005d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0064
            return r0
        L_0x0064:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean g(long j10) {
        for (d<Long, Long> dVar : this.f66644b.L1()) {
            S s10 = dVar.f7053b;
            if (s10 != null && ((Long) s10).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return f66642h;
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.f66643a.f66637d);
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 % this.f66643a.f66637d == 0;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return (i10 + 1) % this.f66643a.f66637d == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean k(long j10) {
        for (d<Long, Long> dVar : this.f66644b.L1()) {
            F f10 = dVar.f7052a;
            if (f10 != null && ((Long) f10).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return (b() + this.f66643a.f66638e) - 1;
    }

    /* access modifiers changed from: package-private */
    public int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f66645c) {
            p(materialCalendarGridView, longValue.longValue());
        }
        i<?> iVar = this.f66644b;
        if (iVar != null) {
            for (Long longValue2 : iVar.Q2()) {
                p(materialCalendarGridView, longValue2.longValue());
            }
            this.f66645c = this.f66644b.Q2();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
