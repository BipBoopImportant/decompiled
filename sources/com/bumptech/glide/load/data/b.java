package com.bumptech.glide.load.data;

import C7.a;
import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f46573a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f46574b;

    /* renamed from: c  reason: collision with root package name */
    private T f46575c;

    public b(AssetManager assetManager, String str) {
        this.f46574b = assetManager;
        this.f46573a = str;
    }

    public void b() {
        T t10 = this.f46575c;
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
    public abstract T e(AssetManager assetManager, String str);

    public void f(g gVar, d.a<? super T> aVar) {
        try {
            T e10 = e(this.f46574b, this.f46573a);
            this.f46575c = e10;
            aVar.e(e10);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.c(e11);
        }
    }
}
