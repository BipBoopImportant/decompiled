package Ci;

import android.content.DialogInterface;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment;

/* renamed from: Ci.s  reason: case insensitive filesystem */
public final /* synthetic */ class C10647s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PurchaseDetailsFragment f79487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f79488b;

    public /* synthetic */ C10647s(PurchaseDetailsFragment purchaseDetailsFragment, String str) {
        this.f79487a = purchaseDetailsFragment;
        this.f79488b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        PurchaseDetailsFragment.p1(this.f79487a, this.f79488b, dialogInterface, i10);
    }
}
