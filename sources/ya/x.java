package Ya;

import android.content.Context;
import java.io.File;

final class x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f64890a;

    x(Context context) {
        this.f64890a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File b10 : listFiles) {
                j10 += b(b10);
            }
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return b(new File(this.f64890a.getFilesDir(), "assetpacks"));
    }
}
