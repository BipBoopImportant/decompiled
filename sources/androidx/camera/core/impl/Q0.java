package androidx.camera.core.impl;

import C.C4391e0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import androidx.camera.core.impl.O0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import q.C5759a;

public class Q0 implements C5759a<Context, O0> {

    public static class a extends Service {
        private a() {
        }

        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    private static O0 b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] c10 = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] c11 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        C4391e0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        C4391e0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        C4391e0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(c10));
        C4391e0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(c11));
        return new O0.b().d(z10).c(e(c10)).b(e(c11)).a();
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            C4391e0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            C4391e0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    private static Class<? extends N0> d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (N0.class.isAssignableFrom(cls)) {
                return cls;
            }
            C4391e0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            C4391e0.m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    private static Set<Class<? extends N0>> e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String d10 : strArr) {
            Class<? extends N0> d11 = d(d10);
            if (d11 != null) {
                hashSet.add(d11);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public O0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            C4391e0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C4391e0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
