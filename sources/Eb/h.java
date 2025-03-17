package eb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

@SuppressLint({"RestrictedApi"})
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final m f72573a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f72574b = new Handler(Looper.getMainLooper());

    h(m mVar) {
        this.f72573a = mVar;
    }

    public final C8971l<C9631b> a() {
        return this.f72573a.a();
    }

    public final C8971l<Void> b(Activity activity, C9631b bVar) {
        if (bVar.b()) {
            return C8974o.f(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C8972m mVar = new C8972m();
        intent.putExtra("result_receiver", new g(this, this.f72574b, mVar));
        activity.startActivity(intent);
        return mVar.a();
    }
}
