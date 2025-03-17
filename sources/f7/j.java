package F7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class j implements d {

    /* renamed from: k  reason: collision with root package name */
    private static final Bitmap.Config f35483k = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final k f35484a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Bitmap.Config> f35485b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35486c;

    /* renamed from: d  reason: collision with root package name */
    private final a f35487d;

    /* renamed from: e  reason: collision with root package name */
    private long f35488e;

    /* renamed from: f  reason: collision with root package name */
    private long f35489f;

    /* renamed from: g  reason: collision with root package name */
    private int f35490g;

    /* renamed from: h  reason: collision with root package name */
    private int f35491h;

    /* renamed from: i  reason: collision with root package name */
    private int f35492i;

    /* renamed from: j  reason: collision with root package name */
    private int f35493j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    j(long j10, k kVar, Set<Bitmap.Config> set) {
        this.f35486c = j10;
        this.f35488e = j10;
        this.f35484a = kVar;
        this.f35485b = set;
        this.f35487d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f35483k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f35490g + ", misses=" + this.f35491h + ", puts=" + this.f35492i + ", evictions=" + this.f35493j + ", currentSize=" + this.f35489f + ", maxSize=" + this.f35488e + "\nStrategy=" + this.f35484a);
    }

    private void j() {
        q(this.f35488e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap d10;
        try {
            f(config);
            d10 = this.f35484a.d(i10, i11, config != null ? config : f35483k);
            if (d10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f35484a.b(i10, i11, config));
                }
                this.f35491h++;
            } else {
                this.f35490g++;
                this.f35489f -= (long) this.f35484a.e(d10);
                this.f35487d.a(d10);
                p(d10);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f35484a.b(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return d10;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f35489f > j10) {
            try {
                Bitmap removeLast = this.f35484a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f35489f = 0;
                    return;
                }
                this.f35487d.a(removeLast);
                this.f35489f -= (long) this.f35484a.e(removeLast);
                this.f35493j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f35484a.a(removeLast));
                }
                h();
                removeLast.recycle();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0);
    }

    public synchronized void c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f35484a.e(bitmap)) <= this.f35488e) {
                        if (this.f35485b.contains(bitmap.getConfig())) {
                            int e10 = this.f35484a.e(bitmap);
                            this.f35484a.c(bitmap);
                            this.f35487d.b(bitmap);
                            this.f35492i++;
                            this.f35489f += (long) e10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f35484a.a(bitmap));
                            }
                            h();
                            j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f35484a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f35485b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        if (m10 == null) {
            return g(i10, i11, config);
        }
        m10.eraseColor(0);
        return m10;
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap m10 = m(i10, i11, config);
        return m10 == null ? g(i10, i11, config) : m10;
    }

    public long n() {
        return this.f35488e;
    }

    public j(long j10) {
        this(j10, l(), k());
    }
}
