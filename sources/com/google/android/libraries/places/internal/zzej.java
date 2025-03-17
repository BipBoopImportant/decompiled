package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.p;
import com.android.volley.toolbox.i;
import java.util.Map;

final class zzej extends i {
    final /* synthetic */ Map zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzej(zzek zzek, String str, p.b bVar, int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }

    public final Map getHeaders() {
        return this.zza;
    }
}
