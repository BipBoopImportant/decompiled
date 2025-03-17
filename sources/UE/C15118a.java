package uE;

import android.widget.CompoundButton;
import com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa.DirectDebitSepaUiComponentInteraction;

/* renamed from: uE.a  reason: case insensitive filesystem */
public final /* synthetic */ class C15118a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DirectDebitSepaUiComponentInteraction f131377a;

    public /* synthetic */ C15118a(DirectDebitSepaUiComponentInteraction directDebitSepaUiComponentInteraction) {
        this.f131377a = directDebitSepaUiComponentInteraction;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        this.f131377a.setTokenizationEnabled(z10);
    }
}
