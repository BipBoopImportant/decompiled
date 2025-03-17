package a9;

import D8.c;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class X0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o f42375a = C16825p.b(a.f42376c);

    public static final class a extends C17544u implements C17631a<c> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f42376c = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new c("AutoStartHelper");
        }
    }

    public static boolean a(Context context) {
        Boolean bool;
        C17542s.j(context, "context");
        try {
            ApplicationInfo a10 = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            C17542s.i(a10, "if (Build.VERSION.SDK_IN…_META_DATA)\n            }");
            Bundle bundle = a10.metaData;
            boolean containsKey = bundle != null ? bundle.containsKey("com.contentsquare.android.autostart") : false;
            C16824o oVar = f42375a;
            ((c) oVar.getValue()).j("Is Contentsquare meta-data present in the manifest: " + containsKey);
            if (containsKey) {
                Bundle bundle2 = a10.metaData;
                bool = bundle2 != null ? Boolean.valueOf(bundle2.getBoolean("com.contentsquare.android.autostart")) : null;
                ((c) oVar.getValue()).j("Contentsquare meta-data value in the manifest is: " + bool);
            } else {
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        } catch (Exception e10) {
            ((c) f42375a.getValue()).j("Failed to get meta-data in the manifest: " + e10);
            return true;
        }
    }
}
