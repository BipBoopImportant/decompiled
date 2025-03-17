package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;
import u2.C6012a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f16598a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f16599b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f16598a = intent;
        this.f16599b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f16598a.setData(uri);
        C6012a.o(context, this.f16598a, this.f16599b);
    }

    /* renamed from: androidx.browser.customtabs.d$d  reason: collision with other inner class name */
    public static final class C0230d {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f16600a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0229a f16601b = new a.C0229a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f16602c;

        /* renamed from: d  reason: collision with root package name */
        private ActivityOptions f16603d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f16604e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f16605f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f16606g;

        /* renamed from: h  reason: collision with root package name */
        private int f16607h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f16608i = true;

        /* renamed from: j  reason: collision with root package name */
        private boolean f16609j;

        public C0230d() {
        }

        private void c() {
            String a10 = b.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundleExtra = this.f16600a.hasExtra("com.android.browser.headers") ? this.f16600a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a10);
                    this.f16600a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }

        private void g(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f16600a.putExtras(bundle);
        }

        private void h() {
            if (this.f16603d == null) {
                this.f16603d = a.a();
            }
            c.a(this.f16603d, this.f16609j);
        }

        public d a() {
            Bundle bundle = null;
            if (!this.f16600a.hasExtra("android.support.customtabs.extra.SESSION")) {
                g((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f16602c;
            if (arrayList != null) {
                this.f16600a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f16604e;
            if (arrayList2 != null) {
                this.f16600a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f16600a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f16608i);
            this.f16600a.putExtras(this.f16601b.a().a());
            Bundle bundle2 = this.f16606g;
            if (bundle2 != null) {
                this.f16600a.putExtras(bundle2);
            }
            if (this.f16605f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f16605f);
                this.f16600a.putExtras(bundle3);
            }
            this.f16600a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f16607h);
            int i10 = Build.VERSION.SDK_INT;
            c();
            if (i10 >= 34) {
                h();
            }
            ActivityOptions activityOptions = this.f16603d;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new d(this.f16600a, bundle);
        }

        public C0230d b(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f16600a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i10);
            return this;
        }

        public C0230d d(a aVar) {
            this.f16606g = aVar.a();
            return this;
        }

        public C0230d e(Context context, int i10, int i11) {
            this.f16600a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.d.a(context, i10, i11).b());
            return this;
        }

        public C0230d f(f fVar) {
            this.f16600a.setPackage(fVar.d().getPackageName());
            g(fVar.c(), fVar.e());
            return this;
        }

        public C0230d i(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f16607h = i10;
            if (i10 == 1) {
                this.f16600a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f16600a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f16600a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public C0230d j(boolean z10) {
            this.f16600a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0230d k(Context context, int i10, int i11) {
            this.f16603d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        @Deprecated
        public C0230d l(int i10) {
            this.f16601b.b(i10);
            return this;
        }

        public C0230d(f fVar) {
            if (fVar != null) {
                f(fVar);
            }
        }
    }
}
