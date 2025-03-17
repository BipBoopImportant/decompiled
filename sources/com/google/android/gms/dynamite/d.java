package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.b {
    d() {
    }

    public final DynamiteModule.b.C0824b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0824b bVar = new DynamiteModule.b.C0824b();
        int a10 = aVar.a(context, str, true);
        bVar.f48112b = a10;
        if (a10 != 0) {
            bVar.f48113c = 1;
        } else {
            int b10 = aVar.b(context, str);
            bVar.f48111a = b10;
            if (b10 != 0) {
                bVar.f48113c = -1;
            }
        }
        return bVar;
    }
}
