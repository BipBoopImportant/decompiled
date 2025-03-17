package com.squareup.picasso;

import WK.N;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f122587b = {"orientation"};

    enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private a(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    o(Context context) {
        super(context);
    }

    static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f122587b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i10 = query.getInt(0);
                    query.close();
                    return i10;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    static a l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.width && i11 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.width || i11 > aVar2.height) ? a.FULL : aVar2;
    }

    public boolean c(w wVar) {
        Uri uri = wVar.f122638d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public y.a f(w wVar, int i10) {
        Bitmap bitmap;
        w wVar2 = wVar;
        ContentResolver contentResolver = this.f122551a.getContentResolver();
        int k10 = k(contentResolver, wVar2.f122638d);
        String type = contentResolver.getType(wVar2.f122638d);
        boolean z10 = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a l10 = l(wVar2.f122642h, wVar2.f122643i);
            if (!z10 && l10 == a.FULL) {
                return new y.a((Bitmap) null, WK.y.l(j(wVar)), t.e.DISK, k10);
            }
            long parseId = ContentUris.parseId(wVar2.f122638d);
            BitmapFactory.Options d10 = y.d(wVar);
            d10.inJustDecodeBounds = true;
            BitmapFactory.Options options = d10;
            y.a(wVar2.f122642h, wVar2.f122643i, l10.width, l10.height, d10, wVar);
            if (z10) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l10 == a.FULL ? 1 : l10.androidKind, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l10.androidKind, options);
            }
            if (bitmap != null) {
                return new y.a(bitmap, (N) null, t.e.DISK, k10);
            }
        }
        return new y.a((Bitmap) null, WK.y.l(j(wVar)), t.e.DISK, k10);
    }
}
