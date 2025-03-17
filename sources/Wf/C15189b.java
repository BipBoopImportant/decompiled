package wF;

import QE.C13444v;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;

/* renamed from: wF.b  reason: case insensitive filesystem */
public final /* synthetic */ class C15189b implements FeedbackSmileRatingBar.OnRatingSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FeedbackBottomSheet f131753a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C13444v f131754b;

    public /* synthetic */ C15189b(FeedbackBottomSheet feedbackBottomSheet, C13444v vVar) {
        this.f131753a = feedbackBottomSheet;
        this.f131754b = vVar;
    }

    public final void onRatingSelected(FeedbackSmileRatingBar.a aVar) {
        FeedbackBottomSheet.H0(this.f131753a, this.f131754b, aVar);
    }
}
