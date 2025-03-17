package hb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class c extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f73507a;

    public static void a(Intent intent, Context context) {
        Intent intent2 = new Intent(context, c.class);
        if (f73507a == null) {
            f73507a = Boolean.valueOf(intent2.resolveActivityInfo(context.getPackageManager(), 0) != null);
        }
        if (!Boolean.FALSE.equals(f73507a)) {
            intent2.setFlags(268435456);
            intent.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(context, 0, intent2, 67108864));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }
}
