package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14110u;

public abstract class ListPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    protected ListView f121018p;

    /* renamed from: q  reason: collision with root package name */
    protected C14110u f121019q;

    /* renamed from: r  reason: collision with root package name */
    protected RelativeLayout f121020r;

    /* renamed from: s  reason: collision with root package name */
    protected RelativeLayout f121021s;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AdapterView adapterView, View view, int i10, long j10) {
        this.f121019q.a(i10);
        this.f121019q.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public abstract C14110u.b[] e();

    /* access modifiers changed from: protected */
    public String f() {
        return ((C14110u.b) this.f121018p.getItemAtPosition(this.f121019q.a())).f121328b;
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f121021s.setVisibility(0);
        this.f121020r.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void h() {
        this.f121060m.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void i() {
        C14110u uVar = new C14110u(getContext(), e());
        this.f121019q = uVar;
        this.f121018p.setAdapter(uVar);
        this.f121018p.setOnItemClickListener(new X1(this));
        this.f121019q.a(0);
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f121021s.setVisibility(8);
        this.f121020r.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_list_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121018p = (ListView) view.findViewById(R.id.list_view);
        this.f121020r = (RelativeLayout) view.findViewById(R.id.list_payment_info_view);
        this.f121021s = (RelativeLayout) view.findViewById(R.id.progress_view);
    }
}
