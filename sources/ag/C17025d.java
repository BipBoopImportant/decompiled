package aG;

import RF.k;
import android.view.View;
import com.sugarcube.decorate.v1.internal.v1.adapters.PlacedItemsAdapter;

/* renamed from: aG.d  reason: case insensitive filesystem */
public final /* synthetic */ class C17025d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlacedItemsAdapter f140916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlacedItemsAdapter.a f140917b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f140918c;

    public /* synthetic */ C17025d(PlacedItemsAdapter placedItemsAdapter, PlacedItemsAdapter.a aVar, k kVar) {
        this.f140916a = placedItemsAdapter;
        this.f140917b = aVar;
        this.f140918c = kVar;
    }

    public final void onClick(View view) {
        PlacedItemsAdapter.a.e(this.f140916a, this.f140917b, this.f140918c, view);
    }
}
