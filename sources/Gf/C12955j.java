package GF;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.interstitial.OptionInterstitialCard;

/* renamed from: GF.j  reason: case insensitive filesystem */
public final /* synthetic */ class C12955j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OptionInterstitialCard f110508a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f110509b;

    public /* synthetic */ C12955j(OptionInterstitialCard optionInterstitialCard, MaterialButton materialButton) {
        this.f110508a = optionInterstitialCard;
        this.f110509b = materialButton;
    }

    public final void onClick(View view) {
        OptionInterstitialCard.i(this.f110508a, this.f110509b, view);
    }
}
