package wF;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;

/* renamed from: wF.d  reason: case insensitive filesystem */
public final /* synthetic */ class C15191d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FeedbackBottomSheet f131757a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f131758b;

    public /* synthetic */ C15191d(FeedbackBottomSheet feedbackBottomSheet, MaterialButton materialButton) {
        this.f131757a = feedbackBottomSheet;
        this.f131758b = materialButton;
    }

    public final void onClick(View view) {
        FeedbackBottomSheet.E0(this.f131757a, this.f131758b, view);
    }
}
