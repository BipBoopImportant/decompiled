package wF;

import QE.C13444v;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;

/* renamed from: wF.c  reason: case insensitive filesystem */
public final /* synthetic */ class C15190c implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C13444v f131755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f131756b;

    public /* synthetic */ C15190c(C13444v vVar, TextInputEditText textInputEditText) {
        this.f131755a = vVar;
        this.f131756b = textInputEditText;
    }

    public final void onFocusChange(View view, boolean z10) {
        FeedbackBottomSheet.I0(this.f131755a, this.f131756b, view, z10);
    }
}
