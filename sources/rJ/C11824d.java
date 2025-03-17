package rj;

import android.view.View;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog;

/* renamed from: rj.d  reason: case insensitive filesystem */
public final /* synthetic */ class C11824d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnavailableChildItemsDialog f102017a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f102018b;

    public /* synthetic */ C11824d(UnavailableChildItemsDialog unavailableChildItemsDialog, boolean z10) {
        this.f102017a = unavailableChildItemsDialog;
        this.f102018b = z10;
    }

    public final void onClick(View view) {
        UnavailableChildItemsDialog.Z0(this.f102017a, this.f102018b, view);
    }
}
