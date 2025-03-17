package G7;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.ar.core.ImageMetadata;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f36244a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36245b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f36246c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36247d;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f36248i = 1;

        /* renamed from: a  reason: collision with root package name */
        final Context f36249a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f36250b;

        /* renamed from: c  reason: collision with root package name */
        c f36251c;

        /* renamed from: d  reason: collision with root package name */
        float f36252d = 2.0f;

        /* renamed from: e  reason: collision with root package name */
        float f36253e = ((float) f36248i);

        /* renamed from: f  reason: collision with root package name */
        float f36254f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f36255g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f36256h = 4194304;

        public a(Context context) {
            this.f36249a = context;
            this.f36250b = (ActivityManager) context.getSystemService("activity");
            this.f36251c = new b(context.getResources().getDisplayMetrics());
            if (i.e(this.f36250b)) {
                this.f36253e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f36257a;

        b(DisplayMetrics displayMetrics) {
            this.f36257a = displayMetrics;
        }

        public int a() {
            return this.f36257a.heightPixels;
        }

        public int b() {
            return this.f36257a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f36246c = aVar.f36249a;
        int i10 = e(aVar.f36250b) ? aVar.f36256h / 2 : aVar.f36256h;
        this.f36247d = i10;
        int c10 = c(aVar.f36250b, aVar.f36254f, aVar.f36255g);
        float b10 = (float) (aVar.f36251c.b() * aVar.f36251c.a() * 4);
        int round = Math.round(aVar.f36253e * b10);
        int round2 = Math.round(b10 * aVar.f36252d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f36245b = round2;
            this.f36244a = round;
        } else {
            float f10 = (float) i11;
            float f11 = aVar.f36253e;
            float f12 = aVar.f36252d;
            float f13 = f10 / (f11 + f12);
            this.f36245b = Math.round(f12 * f13);
            this.f36244a = Math.round(f13 * aVar.f36253e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f36245b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f36244a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > c10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f36250b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f36250b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = (float) (activityManager.getMemoryClass() * ImageMetadata.SHADING_MODE);
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f36246c, (long) i10);
    }

    public int a() {
        return this.f36247d;
    }

    public int b() {
        return this.f36244a;
    }

    public int d() {
        return this.f36245b;
    }
}
