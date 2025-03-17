package K9;

import android.app.Activity;
import android.content.Intent;

final class G extends I {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f37762a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f37763b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f37764c;

    G(Intent intent, Activity activity, int i10) {
        this.f37762a = intent;
        this.f37763b = activity;
        this.f37764c = i10;
    }

    public final void a() {
        Intent intent = this.f37762a;
        if (intent != null) {
            this.f37763b.startActivityForResult(intent, this.f37764c);
        }
    }
}
