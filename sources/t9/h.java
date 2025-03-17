package T9;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

final class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f40137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f40138b;

    h(Context context, Intent intent) {
        this.f40137a = context;
        this.f40138b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f40137a.startActivity(this.f40138b);
        } catch (ActivityNotFoundException e10) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
        }
    }
}
