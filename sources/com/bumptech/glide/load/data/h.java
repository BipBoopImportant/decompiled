package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

public class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void c(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AssetFileDescriptor e(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
