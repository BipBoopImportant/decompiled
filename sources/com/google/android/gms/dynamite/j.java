package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class j implements DynamiteModule.b {
    j() {
    }

    public final DynamiteModule.b.C0824b a(Context context, String str, DynamiteModule.b.a aVar) {
        int i10;
        DynamiteModule.b.C0824b bVar = new DynamiteModule.b.C0824b();
        int b10 = aVar.b(context, str);
        bVar.f48111a = b10;
        int i11 = 1;
        int i12 = 0;
        if (b10 != 0) {
            i10 = aVar.a(context, str, false);
            bVar.f48112b = i10;
        } else {
            i10 = aVar.a(context, str, true);
            bVar.f48112b = i10;
        }
        int i13 = bVar.f48111a;
        if (i13 != 0) {
            i12 = i13;
        } else if (i10 == 0) {
            i11 = 0;
            bVar.f48113c = i11;
            return bVar;
        }
        if (i10 < i12) {
            i11 = -1;
        }
        bVar.f48113c = i11;
        return bVar;
    }
}
