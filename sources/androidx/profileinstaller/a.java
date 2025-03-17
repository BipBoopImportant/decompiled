package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    private static class C0749a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z10 = true;
            for (int i10 = 0; i10 < length; i10++) {
                z10 = a(listFiles[i10]) && z10;
            }
            return z10;
        }
        file.delete();
        return true;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(Build.VERSION.SDK_INT >= 34 ? b.a(context).getCacheDir() : C0749a.a(b.a(context)))) {
            aVar.a(14, (Object) null);
        } else {
            aVar.a(15, (Object) null);
        }
    }
}
