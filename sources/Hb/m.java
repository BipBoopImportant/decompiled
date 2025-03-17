package hb;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static String f73548a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f73549a;

        /* renamed from: b  reason: collision with root package name */
        public final String f73550b;

        public a(int i10, String str) {
            this.f73549a = i10;
            this.f73550b = str;
        }
    }

    private static Map<String, Integer> a(PackageManager packageManager) {
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap hashMap = new HashMap();
        for (ResolveInfo next : queryIntentServices) {
            String str = next.serviceInfo.packageName;
            int i10 = 0;
            if (C9767a.d(packageManager, str)) {
                hashMap.put(str, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i10 = 1;
                }
                hashMap.put(str, Integer.valueOf(i10 ^ 1));
            }
        }
        return hashMap;
    }

    public static a b(PackageManager packageManager) {
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null));
        String str2 = f73548a;
        if (str2 != null) {
            data.setPackage(str2);
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        queryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        Map<String, Integer> a10 = a(packageManager);
        String str3 = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str4 = resolveInfo.activityInfo.packageName;
            int intValue = a10.containsKey(str4) ? a10.get(str4).intValue() : 2;
            if (intValue == 0) {
                Log.d("TWAProviderPicker", "Found TWA provider, finishing search: " + str4);
                return new a(0, str4);
            } else if (intValue == 1) {
                Log.d("TWAProviderPicker", "Found Custom Tabs provider: " + str4);
                if (str == null) {
                    str = str4;
                }
            } else if (intValue == 2) {
                Log.d("TWAProviderPicker", "Found browser: " + str4);
                if (str3 == null) {
                    str3 = str4;
                }
            }
        }
        if (str != null) {
            Log.d("TWAProviderPicker", "Found no TWA providers, using first Custom Tabs provider: " + str);
            return new a(1, str);
        }
        Log.d("TWAProviderPicker", "Found no TWA providers, using first browser: " + str3);
        return new a(2, str3);
    }
}
