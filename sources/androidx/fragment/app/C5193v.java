package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.v  reason: case insensitive filesystem */
public abstract class C5193v {
    @Deprecated
    public C5187o b(Context context, String str, Bundle bundle) {
        return C5187o.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
