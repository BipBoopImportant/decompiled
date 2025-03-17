package rj;

import android.view.View;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b;

/* renamed from: rj.e  reason: case insensitive filesystem */
public final /* synthetic */ class C11825e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnavailableChildItemsDialog f102019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.d f102020b;

    public /* synthetic */ C11825e(UnavailableChildItemsDialog unavailableChildItemsDialog, b.d dVar) {
        this.f102019a = unavailableChildItemsDialog;
        this.f102020b = dVar;
    }

    public final void onClick(View view) {
        UnavailableChildItemsDialog.a1(this.f102019a, this.f102020b, view);
    }
}
