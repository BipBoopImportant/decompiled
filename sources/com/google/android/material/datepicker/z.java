package com.google.android.material.datepicker;

import Ea.C9074h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

class z extends RecyclerView.h<b> {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final MaterialCalendar<?> f66670h;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f66671a;

        a(int i10) {
            this.f66671a = i10;
        }

        public void onClick(View view) {
            z.this.f66670h.G0(z.this.f66670h.x0().f(q.b(this.f66671a, z.this.f66670h.z0().f66635b)));
            z.this.f66670h.H0(MaterialCalendar.l.DAY);
        }
    }

    public static class b extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        final TextView f66673e;

        b(TextView textView) {
            super(textView);
            this.f66673e = textView;
        }
    }

    z(MaterialCalendar<?> materialCalendar) {
        this.f66670h = materialCalendar;
    }

    private View.OnClickListener d(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: package-private */
    public int e(int i10) {
        return i10 - this.f66670h.x0().l().f66636c;
    }

    /* access modifiers changed from: package-private */
    public int f(int i10) {
        return this.f66670h.x0().l().f66636c + i10;
    }

    /* renamed from: g */
    public void onBindViewHolder(b bVar, int i10) {
        int f10 = f(i10);
        bVar.f66673e.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(f10)}));
        TextView textView = bVar.f66673e;
        textView.setContentDescription(j.i(textView.getContext(), f10));
        c y02 = this.f66670h.y0();
        Calendar k10 = y.k();
        b bVar2 = k10.get(1) == f10 ? y02.f66610f : y02.f66608d;
        for (Long longValue : this.f66670h.A0().Q2()) {
            k10.setTimeInMillis(longValue.longValue());
            if (k10.get(1) == f10) {
                bVar2 = y02.f66609e;
            }
        }
        bVar2.d(bVar.f66673e);
        bVar.f66673e.setOnClickListener(d(f10));
    }

    public int getItemCount() {
        return this.f66670h.x0().m();
    }

    /* renamed from: h */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C9074h.f59542z, viewGroup, false));
    }
}
