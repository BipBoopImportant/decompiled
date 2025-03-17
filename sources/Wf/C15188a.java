package wF;

import QE.C13444v;
import android.view.MotionEvent;
import android.view.View;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;

/* renamed from: wF.a  reason: case insensitive filesystem */
public final /* synthetic */ class C15188a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C13444v f131752a;

    public /* synthetic */ C15188a(C13444v vVar) {
        this.f131752a = vVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return FeedbackBottomSheet.G0(this.f131752a, view, motionEvent);
    }
}
