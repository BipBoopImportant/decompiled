package com.squareup.picasso;

import WK.N;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;

public abstract class y {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final t.e f122685a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f122686b;

        /* renamed from: c  reason: collision with root package name */
        private final N f122687c;

        /* renamed from: d  reason: collision with root package name */
        private final int f122688d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) F.d(bitmap, "bitmap == null"), (N) null, eVar, 0);
        }

        public Bitmap a() {
            return this.f122686b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f122688d;
        }

        public t.e c() {
            return this.f122685a;
        }

        public N d() {
            return this.f122687c;
        }

        public a(N n10, t.e eVar) {
            this((Bitmap) null, (N) F.d(n10, "source == null"), eVar, 0);
        }

        a(Bitmap bitmap, N n10, t.e eVar, int i10) {
            if ((bitmap != null) != (n10 != null)) {
                this.f122686b = bitmap;
                this.f122687c = n10;
                this.f122685a = (t.e) F.d(eVar, "loadedFrom == null");
                this.f122688d = i10;
                return;
            }
            throw new AssertionError();
        }
    }

    static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, w wVar) {
        int i14;
        double floor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                floor = Math.floor((double) (((float) i12) / ((float) i10)));
            } else if (i10 == 0) {
                floor = Math.floor((double) (((float) i13) / ((float) i11)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i13) / ((float) i11)));
                int floor3 = (int) Math.floor((double) (((float) i12) / ((float) i10)));
                i14 = wVar.f122646l ? Math.max(floor2, floor3) : Math.min(floor2, floor3);
            }
            i14 = (int) floor;
        } else {
            i14 = 1;
        }
        options.inSampleSize = i14;
        options.inJustDecodeBounds = false;
    }

    static void b(int i10, int i11, BitmapFactory.Options options, w wVar) {
        a(i10, i11, options.outWidth, options.outHeight, options, wVar);
    }

    static BitmapFactory.Options d(w wVar) {
        boolean c10 = wVar.c();
        boolean z10 = wVar.f122653s != null;
        if (!c10 && !z10 && !wVar.f122652r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c10;
        boolean z11 = wVar.f122652r;
        options.inInputShareable = z11;
        options.inPurgeable = z11;
        if (z10) {
            options.inPreferredConfig = wVar.f122653s;
        }
        return options;
    }

    static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    /* access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i10);

    /* access modifiers changed from: package-private */
    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }
}
