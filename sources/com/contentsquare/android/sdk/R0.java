package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import com.contentsquare.android.sdk.K0;
import kotlin.jvm.internal.C17542s;

public final class R0 extends K0.a {

    /* renamed from: e  reason: collision with root package name */
    public final int f47137e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R0(Bitmap bitmap, int i10) {
        super(bitmap, true);
        C17542s.j(bitmap, "bitmap");
        this.f47137e = i10;
    }

    public final String d(int i10, int i11, int i12, int i13) {
        return super.d(i10, i11 + this.f47137e, i12, i13);
    }
}
