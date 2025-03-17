package e8;

import android.view.KeyEvent;
import android.widget.TextView;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.DeveloperActivationActivity;

/* renamed from: e8.a  reason: case insensitive filesystem */
public final /* synthetic */ class C7808a implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeveloperActivationActivity f50891a;

    public /* synthetic */ C7808a(DeveloperActivationActivity developerActivationActivity) {
        this.f50891a = developerActivationActivity;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return DeveloperActivationActivity.x(this.f50891a, textView, i10, keyEvent);
    }
}
