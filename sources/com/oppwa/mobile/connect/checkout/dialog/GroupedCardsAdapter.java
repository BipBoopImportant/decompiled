package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

public class GroupedCardsAdapter extends RecyclerView.h<RecyclerView.G> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f120943a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f120944b;

    /* renamed from: c  reason: collision with root package name */
    private b f120945c;

    /* renamed from: d  reason: collision with root package name */
    private GroupedCardsItemAdapter f120946d;

    static class a extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        RecyclerView f120947a;

        a(View view) {
            super(view);
            this.f120947a = (RecyclerView) view.findViewById(R.id.card_brands_recycler_view);
        }
    }

    interface b {
        void a(String str);
    }

    GroupedCardsAdapter(Context context, String[] strArr) {
        this.f120943a = context;
        this.f120944b = strArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        b bVar = this.f120945c;
        if (bVar != null) {
            bVar.a("CARD");
        }
    }

    public int getItemCount() {
        return 1;
    }

    public void onBindViewHolder(RecyclerView.G g10, int i10) {
        a aVar = (a) g10;
        Context context = this.f120943a;
        aVar.f120947a.setLayoutManager(new GridLayoutManager(context, a(context)));
        GroupedCardsItemAdapter groupedCardsItemAdapter = new GroupedCardsItemAdapter(this.f120943a, this.f120944b);
        this.f120946d = groupedCardsItemAdapter;
        aVar.f120947a.setAdapter(groupedCardsItemAdapter);
        aVar.f120947a.suppressLayout(true);
        aVar.itemView.setOnClickListener(new O1(this));
    }

    public RecyclerView.G onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(this.f120943a).inflate(R.layout.opp_item_grouped_cards, viewGroup, false));
    }

    public void setListener(b bVar) {
        this.f120945c = bVar;
    }

    /* access modifiers changed from: package-private */
    public GroupedCardsItemAdapter a() {
        return this.f120946d;
    }

    private static int a(Context context) {
        Resources resources = context.getResources();
        return resources.getDisplayMetrics().widthPixels / (((int) resources.getDimension(R.dimen.card_brand_logo_width)) + (((int) resources.getDimension(R.dimen.card_brand_logo_padding)) * 2));
    }
}
