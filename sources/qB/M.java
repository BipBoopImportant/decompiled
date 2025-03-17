package Qb;

import android.content.Context;

class M {

    /* renamed from: a  reason: collision with root package name */
    private String f62942a;

    M() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        try {
            if (this.f62942a == null) {
                this.f62942a = b(context);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return "".equals(this.f62942a) ? null : this.f62942a;
    }
}
