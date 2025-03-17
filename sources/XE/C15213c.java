package xE;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

/* renamed from: xE.c  reason: case insensitive filesystem */
public class C15213c {
    static Map<String, String> a(Context context, Logger logger) {
        String str = Build.MODEL;
        String str2 = Build.VERSION.RELEASE;
        String str3 = "";
        try {
            str3 = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionName;
        } catch (Exception e10) {
            logger.warn("Error getting app version from context.", (Throwable) e10);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("optimizely_android_device_model", str);
        hashMap.put("optimizely_android_sdk_version", "3.13.4");
        hashMap.put("optimizely_android_os_version", str2);
        hashMap.put("optimizely_android_app_version", str3);
        return hashMap;
    }
}
