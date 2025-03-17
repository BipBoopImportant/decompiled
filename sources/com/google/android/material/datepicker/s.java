package com.google.android.material.datepicker;

import Ea.C9072f;
import Ea.C9074h;
import I2.C4600b0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

class s extends RecyclerView.h<b> {

    /* renamed from: h  reason: collision with root package name */
    private final a f66649h;

    /* renamed from: i  reason: collision with root package name */
    private final i<?> f66650i;

    /* renamed from: j  reason: collision with root package name */
    private final m f66651j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final MaterialCalendar.m f66652k;

    /* renamed from: l  reason: collision with root package name */
    private final int f66653l;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f66654a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f66654a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f66654a.getAdapter().r(i10)) {
                s.this.f66652k.a(this.f66654a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        final TextView f66656e;

        /* renamed from: f  reason: collision with root package name */
        final MaterialCalendarGridView f66657f;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C9072f.f59505w);
            this.f66656e = textView;
            C4600b0.q0(textView, true);
            this.f66657f = (MaterialCalendarGridView) linearLayout.findViewById(C9072f.f59501s);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    s(Context context, i<?> iVar, a aVar, m mVar, MaterialCalendar.m mVar2) {
        q l10 = aVar.l();
        q h10 = aVar.h();
        q k10 = aVar.k();
        if (l10.compareTo(k10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (k10.compareTo(h10) <= 0) {
            this.f66653l = (r.f66641g * MaterialCalendar.B0(context)) + (MaterialDatePicker.v0(context) ? MaterialCalendar.B0(context) : 0);
            this.f66649h = aVar;
            this.f66650i = iVar;
            this.f66651j = mVar;
            this.f66652k = mVar2;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    public q d(int i10) {
        return this.f66649h.l().E(i10);
    }

    /* access modifiers changed from: package-private */
    public CharSequence e(int i10) {
        return d(i10).C();
    }

    /* access modifiers changed from: package-private */
    public int f(q qVar) {
        return this.f66649h.l().F(qVar);
    }

    /* renamed from: g */
    public void onBindViewHolder(b bVar, int i10) {
        q E10 = this.f66649h.l().E(i10);
        bVar.f66656e.setText(E10.C());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f66657f.findViewById(C9072f.f59501s);
        if (materialCalendarGridView.getAdapter() == null || !E10.equals(materialCalendarGridView.getAdapter().f66643a)) {
            r rVar = new r(E10, this.f66650i, this.f66649h, this.f66651j);
            materialCalendarGridView.setNumColumns(E10.f66637d);
            materialCalendarGridView.setAdapter((ListAdapter) rVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    public int getItemCount() {
        return this.f66649h.j();
    }

    public long getItemId(int i10) {
        return this.f66649h.l().E(i10).D();
    }

    /* renamed from: h */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C9074h.f59540x, viewGroup, false);
        if (!MaterialDatePicker.v0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f66653l));
        return new b(linearLayout, true);
    }
}
