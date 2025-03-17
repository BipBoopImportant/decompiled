package wF;

import com.sugarcube.app.base.ui.feedback.FeedbackDialog;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;

public final /* synthetic */ class h implements FeedbackSmileRatingBar.OnRatingSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FeedbackDialog f131761a;

    public /* synthetic */ h(FeedbackDialog feedbackDialog) {
        this.f131761a = feedbackDialog;
    }

    public final void onRatingSelected(FeedbackSmileRatingBar.a aVar) {
        FeedbackDialog.i(this.f131761a, aVar);
    }
}
