package Wh;

import android.view.View;
import com.ingka.ikea.app.productinformationpage.ui.FeeDialogFragment;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FeeDialogFragment f64764a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f64765b;

    public /* synthetic */ c(FeeDialogFragment feeDialogFragment, String str) {
        this.f64764a = feeDialogFragment;
        this.f64765b = str;
    }

    public final void onClick(View view) {
        FeeDialogFragment.E0(this.f64764a, this.f64765b, view);
    }
}
