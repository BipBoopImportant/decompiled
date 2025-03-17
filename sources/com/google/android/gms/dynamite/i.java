package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class i implements DynamiteModule.b {
    i() {
    }

    public final DynamiteModule.b.C0824b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0824b bVar = new DynamiteModule.b.C0824b();
        bVar.f48111a = aVar.b(context, str);
        int i10 = 1;
        int a10 = aVar.a(context, str, true);
        bVar.f48112b = a10;
        int i11 = bVar.f48111a;
        if (i11 == 0) {
            i11 = 0;
            if (a10 == 0) {
                i10 = 0;
                bVar.f48113c = i10;
                return bVar;
            }
        }
        if (a10 < i11) {
            i10 = -1;
        }
        bVar.f48113c = i10;
        return bVar;
    }
}
