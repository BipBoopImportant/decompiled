package t5;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C7055y;

/* renamed from: t5.B  reason: case insensitive filesystem */
public class C8791B {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56558a = C7055y.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z10) {
        String str = "disabled";
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                C7055y e10 = C7055y.e();
                String str2 = f56558a;
                e10.a(str2, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            C7055y e11 = C7055y.e();
            String str3 = f56558a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : str);
            e11.a(str3, sb2.toString());
        } catch (Exception e12) {
            C7055y e13 = C7055y.e();
            String str4 = f56558a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z10) {
                str = "enabled";
            }
            sb3.append(str);
            e13.b(str4, sb3.toString(), e12);
        }
    }
}
