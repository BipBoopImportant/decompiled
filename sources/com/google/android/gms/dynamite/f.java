package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class f implements DynamiteModule.b {
    f() {
    }

    public final DynamiteModule.b.C0824b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0824b bVar = new DynamiteModule.b.C0824b();
        int i10 = 0;
        int a10 = aVar.a(context, str, false);
        bVar.f48112b = a10;
        if (a10 != 0) {
            i10 = 1;
        }
        bVar.f48113c = i10;
        return bVar;
    }
}
