package e8;

import android.view.View;
import android.widget.EditText;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.DeveloperActivationActivity;

/* renamed from: e8.b  reason: case insensitive filesystem */
public final /* synthetic */ class C7809b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DeveloperActivationActivity f50892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f50893b;

    public /* synthetic */ C7809b(DeveloperActivationActivity developerActivationActivity, EditText editText) {
        this.f50892a = developerActivationActivity;
        this.f50893b = editText;
    }

    public final void onClick(View view) {
        DeveloperActivationActivity.w(this.f50892a, this.f50893b, view);
    }
}
