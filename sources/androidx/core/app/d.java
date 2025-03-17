package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

public class d {

    private static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f20956a;

        a(ActivityOptions activityOptions) {
            this.f20956a = activityOptions;
        }

        public Bundle b() {
            return this.f20956a.toBundle();
        }
    }

    protected d() {
    }

    public static d a(Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public Bundle b() {
        throw null;
    }
}
