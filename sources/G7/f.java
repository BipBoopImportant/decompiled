package G7;

import G7.d;
import android.content.Context;
import java.io.File;

public final class f extends d {

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f36241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36242b;

        a(Context context, String str) {
            this.f36241a = context;
            this.f36242b = str;
        }

        public File a() {
            File cacheDir = this.f36241a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f36242b != null ? new File(cacheDir, this.f36242b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
