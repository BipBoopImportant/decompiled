package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.e  reason: case insensitive filesystem */
class C14063e extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121160a;

    /* renamed from: b  reason: collision with root package name */
    private String[] f121161b;

    /* renamed from: c  reason: collision with root package name */
    private a f121162c;

    /* renamed from: d  reason: collision with root package name */
    private int f121163d = 0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e$a */
    interface a {
        void onCardBrandSelected(String str);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.e$b */
    static class b extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        ImageView f121164a;

        /* renamed from: b  reason: collision with root package name */
        ProgressBar f121165b;

        /* renamed from: c  reason: collision with root package name */
        RelativeLayout f121166c;

        b(View view) {
            super(view);
            this.f121164a = (ImageView) view.findViewById(R.id.card_brand_logo);
            this.f121165b = (ProgressBar) view.findViewById(R.id.loading_panel_item_card_brands);
            this.f121166c = (RelativeLayout) view.findViewById(R.id.card_brand_border);
        }
    }

    C14063e(Context context, String[] strArr) {
        this.f121160a = context;
        this.f121161b = strArr;
    }

    public void a(a aVar) {
        this.f121162c = aVar;
    }

    public int getItemCount() {
        return this.f121161b.length;
    }

    public void a(String[] strArr) {
        this.f121161b = strArr;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        String[] strArr = this.f121161b;
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length && !strArr[i10].equals(str)) {
            i11++;
            i10++;
        }
        this.f121163d = i11;
    }

    /* renamed from: a */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(this.f121160a).inflate(R.layout.opp_item_card_brands, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.f121165b.setVisibility(0);
        String str = this.f121161b[i10];
        Bitmap image = ImageLoader.getInstance(this.f121160a).getImage(str);
        String b10 = C14069g.b(this.f121160a, str);
        if (image != null) {
            bVar.f121164a.setImageBitmap(image);
            bVar.f121165b.setVisibility(8);
        }
        bVar.itemView.setOnClickListener(new s2(this, bVar));
        if (i10 == this.f121163d) {
            bVar.f121166c.setSelected(true);
            View view = bVar.itemView;
            view.setContentDescription(b10 + " " + this.f121160a.getString(R.string.checkout_layout_text_selected));
        } else {
            bVar.f121166c.setSelected(false);
            bVar.itemView.setContentDescription(b10);
        }
        bVar.itemView.setTag(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, View view) {
        this.f121163d = bVar.getAdapterPosition();
        notifyDataSetChanged();
        a aVar = this.f121162c;
        if (aVar != null) {
            aVar.onCardBrandSelected(this.f121161b[this.f121163d]);
        }
    }
}
