package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream e(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
