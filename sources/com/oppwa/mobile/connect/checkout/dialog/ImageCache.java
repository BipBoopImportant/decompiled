package com.oppwa.mobile.connect.checkout.dialog;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.Map;

public class ImageCache extends LruCache<String, Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    private static ImageCache f120967b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f120968c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f120969d;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Bitmap> f120970a;

    static {
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        f120968c = maxMemory;
        f120969d = maxMemory / 8;
    }

    ImageCache(int i10) {
        super(i10);
    }

    public static ImageCache getInstance() {
        if (f120967b == null) {
            f120967b = new ImageCache(f120969d);
        }
        return f120967b;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, Bitmap bitmap) {
        if (a(str) == null) {
            put(str, bitmap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int sizeOf(String str, Bitmap bitmap) {
        return bitmap.getByteCount() / 1024;
    }

    private Bitmap b(String str) {
        Map<String, Bitmap> map = this.f120970a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Bitmap a(String str) {
        Bitmap b10 = b(str);
        return b10 != null ? b10 : (Bitmap) get(str);
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, Bitmap> map) {
        this.f120970a = map;
    }
}
