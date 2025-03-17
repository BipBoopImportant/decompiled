package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.u  reason: case insensitive filesystem */
class C14110u extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final b[] f121324a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f121325b;

    /* renamed from: c  reason: collision with root package name */
    private int f121326c;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.u$b */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        String f121327a;

        /* renamed from: b  reason: collision with root package name */
        String f121328b;

        b(String str, String str2) {
            this.f121327a = str;
            this.f121328b = str2;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.u$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        TextView f121329a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f121330b;

        private c() {
        }
    }

    C14110u(Context context, b[] bVarArr) {
        this.f121324a = bVarArr;
        this.f121325b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f121326c;
    }

    public int getCount() {
        return this.f121324a.length;
    }

    public Object getItem(int i10) {
        return this.f121324a[i10];
    }

    public long getItemId(int i10) {
        return 0;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = this.f121325b.inflate(R.layout.opp_item_payment_info, viewGroup, false);
            cVar = new c();
            cVar.f121329a = (TextView) view.findViewById(R.id.text_view);
            cVar.f121330b = (ImageView) view.findViewById(R.id.mark_image_view);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        cVar.f121329a.setText(this.f121324a[i10].f121327a);
        if (i10 == this.f121326c) {
            cVar.f121330b.setVisibility(0);
        } else {
            cVar.f121330b.setVisibility(4);
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        this.f121326c = i10;
    }
}
