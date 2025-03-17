package K9;

import D9.b;
import G9.f;
import S9.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.optimizely.ab.config.FeatureVariable;
import j0.b0;
import java.util.Locale;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    private static final b0 f37760a = new b0();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f37761b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(17039370) : resources.getString(b.f34602a) : resources.getString(b.f34611j) : resources.getString(b.f34605d);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(b.f34606e, new Object[]{a10});
        }
        if (i10 == 2) {
            return i.d(context) ? resources.getString(b.f34615n) : resources.getString(b.f34612k, new Object[]{a10});
        }
        if (i10 == 3) {
            return resources.getString(b.f34603b, new Object[]{a10});
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a10);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", a10);
        }
        if (i10 == 9) {
            return resources.getString(b.f34610i, new Object[]{a10});
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a10);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a10);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a10);
            case 18:
                return resources.getString(b.f34614m, new Object[]{a10});
            default:
                return resources.getString(f.f36319a, new Object[]{a10});
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String h10 = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return h10 == null ? context.getResources().getString(b.f34609h) : h10;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(b.f34607f);
            case 2:
                return resources.getString(b.f34613l);
            case 3:
                return resources.getString(b.f34604c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h10 = h(context, str);
        if (h10 == null) {
            h10 = resources.getString(f.f36319a);
        }
        return String.format(resources.getConfiguration().locale, h10, new Object[]{str2});
    }

    private static String h(Context context, String str) {
        b0 b0Var = f37760a;
        synchronized (b0Var) {
            try {
                Locale c10 = D2.f.a(context.getResources().getConfiguration()).c(0);
                if (!c10.equals(f37761b)) {
                    b0Var.clear();
                    f37761b = c10;
                }
                String str2 = (String) b0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources e10 = com.google.android.gms.common.c.e(context);
                if (e10 == null) {
                    return null;
                }
                int identifier = e10.getIdentifier(str, FeatureVariable.STRING_TYPE, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = e10.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                b0Var.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
