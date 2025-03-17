package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.e;
import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.v;

public class i extends n<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private p.b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public i(String str, p.b<Bitmap> bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new e(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i10;
        this.mMaxHeight = i11;
        this.mScaleType = scaleType;
    }

    private p<Bitmap> doParse(k kVar) {
        Bitmap bitmap;
        byte[] bArr = kVar.f46226b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i10, i11, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i11, i10, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i10, i11, resizedDimension, resizedDimension2);
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmap != null && (bitmap.getWidth() > resizedDimension || bitmap.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, resizedDimension, resizedDimension2, true);
                bitmap.recycle();
                bitmap = createScaledBitmap;
            }
        }
        return bitmap == null ? p.a(new m(kVar)) : p.c(bitmap, e.e(kVar));
    }

    static int findBestSampleSize(int i10, int i11, int i12, int i13) {
        double min = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (((double) f11) > min) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int getResizedDimension(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        } else if (i11 == 0) {
            return i10;
        } else {
            double d10 = ((double) i13) / ((double) i12);
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d11 = (double) i11;
                return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
            }
            double d12 = (double) i11;
            return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
        }
    }

    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    public n.c getPriority() {
        return n.c.LOW;
    }

    /* access modifiers changed from: protected */
    public p<Bitmap> parseNetworkResponse(k kVar) {
        p<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                doParse = doParse(kVar);
            } catch (OutOfMemoryError e10) {
                v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f46226b.length), getUrl());
                return p.a(new m((Throwable) e10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doParse;
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Bitmap bitmap) {
        p.b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Deprecated
    public i(String str, p.b<Bitmap> bVar, int i10, int i11, Bitmap.Config config, p.a aVar) {
        this(str, bVar, i10, i11, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}
