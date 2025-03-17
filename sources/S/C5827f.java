package s;

import android.os.Bundle;

/* renamed from: s.f  reason: case insensitive filesystem */
public interface C5827f {

    /* renamed from: s.f$a */
    public static class a implements C5827f {
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* renamed from: s.f$b */
    public static class b implements C5827f {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f28703a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28704b;

        public b(boolean z10, int i10) {
            this.f28703a = z10;
            this.f28704b = i10;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f28703a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f28704b);
            return bundle;
        }
    }

    Bundle a();
}
