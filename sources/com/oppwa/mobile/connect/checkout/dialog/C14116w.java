package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.w  reason: case insensitive filesystem */
class C14116w extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121342a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f121343b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f121344c;

    /* renamed from: d  reason: collision with root package name */
    private a f121345d;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.w$a */
    interface a {
        void a(String str);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.w$b */
    static class b extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        ImageView f121346a;

        /* renamed from: b  reason: collision with root package name */
        TextView f121347b;

        /* renamed from: c  reason: collision with root package name */
        ProgressBar f121348c;

        b(View view) {
            super(view);
            this.f121346a = (ImageView) view.findViewById(R.id.payment_brand_image);
            this.f121347b = (TextView) view.findViewById(R.id.payment_brand_title);
            this.f121348c = (ProgressBar) view.findViewById(R.id.loading_panel);
        }
    }

    C14116w(Context context, String[] strArr, Bundle bundle) {
        this.f121342a = context;
        this.f121343b = strArr;
        this.f121344c = bundle;
    }

    /* renamed from: a */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(this.f121342a).inflate(R.layout.opp_item_payment_brand, viewGroup, false));
    }

    public int getItemCount() {
        return this.f121343b.length;
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f121348c.setVisibility(0);
        String str = this.f121343b[i10];
        Bitmap image = ImageLoader.getInstance(this.f121342a).getImage(str);
        if (image != null) {
            bVar.f121348c.setVisibility(8);
            bVar.f121346a.setImageBitmap(image);
        }
        String a10 = a(this.f121342a, str);
        bVar.f121347b.setText(a10);
        bVar.itemView.setContentDescription(a10);
        bVar.itemView.setOnClickListener(new z2(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, View view) {
        a aVar = this.f121345d;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void a(a aVar) {
        this.f121345d = aVar;
    }

    private String a(Context context, String str) {
        int c10 = C14069g.c(context, str);
        if (c10 != 0) {
            return context.getString(c10);
        }
        String string = this.f121344c.getString(str);
        if (string == null || string.isEmpty()) {
            return Utils.formatPaymentBrandString(str);
        }
        return string;
    }
}
