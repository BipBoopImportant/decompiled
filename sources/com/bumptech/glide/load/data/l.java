package com.bumptech.glide.load.data;

import C7.a;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f46597a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f46598b;

    /* renamed from: c  reason: collision with root package name */
    private T f46599c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f46598b = contentResolver;
        this.f46597a = uri;
    }

    public void b() {
        T t10 = this.f46599c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c(T t10);

    public void cancel() {
    }

    public a d() {
        return a.LOCAL;
    }

    /* access modifiers changed from: protected */
    public abstract T e(Uri uri, ContentResolver contentResolver);

    public final void f(g gVar, d.a<? super T> aVar) {
        try {
            T e10 = e(this.f46597a, this.f46598b);
            this.f46599c = e10;
            aVar.e(e10);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.c(e11);
        }
    }
}
