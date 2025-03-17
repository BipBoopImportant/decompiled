package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

public final class m implements C14193d {

    /* renamed from: a  reason: collision with root package name */
    final LruCache<String, b> f122576a;

    class a extends LruCache<String, b> {
        a(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, b bVar) {
            return bVar.f122579b;
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Bitmap f122578a;

        /* renamed from: b  reason: collision with root package name */
        final int f122579b;

        b(Bitmap bitmap, int i10) {
            this.f122578a = bitmap;
            this.f122579b = i10;
        }
    }

    public m(Context context) {
        this(F.b(context));
    }

    public int a() {
        return this.f122576a.maxSize();
    }

    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i10 = F.i(bitmap);
        if (i10 > a()) {
            this.f122576a.remove(str);
        } else {
            this.f122576a.put(str, new b(bitmap, i10));
        }
    }

    public void c(String str) {
        for (String next : this.f122576a.snapshot().keySet()) {
            if (next.startsWith(str) && next.length() > str.length() && next.charAt(str.length()) == 10) {
                this.f122576a.remove(next);
            }
        }
    }

    public Bitmap get(String str) {
        b bVar = this.f122576a.get(str);
        if (bVar != null) {
            return bVar.f122578a;
        }
        return null;
    }

    public int size() {
        return this.f122576a.size();
    }

    public m(int i10) {
        this.f122576a = new a(i10);
    }
}
