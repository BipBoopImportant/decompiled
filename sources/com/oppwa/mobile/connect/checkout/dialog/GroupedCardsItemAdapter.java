package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

public class GroupedCardsItemAdapter extends RecyclerView.h<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f120948a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f120949b;

    public static class ViewHolder extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        ImageView f120950a;

        /* renamed from: b  reason: collision with root package name */
        ProgressBar f120951b;

        public ViewHolder(View view) {
            super(view);
            this.f120950a = (ImageView) view.findViewById(R.id.grouped_cards_item_image);
            this.f120951b = (ProgressBar) view.findViewById(R.id.loading_panel);
        }
    }

    GroupedCardsItemAdapter(Context context, String[] strArr) {
        this.f120948a = strArr;
        this.f120949b = context;
    }

    public int getItemCount() {
        return this.f120948a.length;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i10) {
        viewHolder.f120951b.setVisibility(0);
        String str = this.f120948a[i10];
        Bitmap image = ImageLoader.getInstance(this.f120949b).getImage(str);
        String b10 = C14069g.b(this.f120949b, str);
        if (image != null) {
            viewHolder.f120951b.setVisibility(8);
            viewHolder.f120950a.setImageBitmap(image);
            viewHolder.f120950a.setContentDescription(b10);
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewHolder(LayoutInflater.from(this.f120949b).inflate(R.layout.opp_item_card, viewGroup, false));
    }
}
