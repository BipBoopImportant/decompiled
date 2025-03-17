package com.google.android.gms.vision.clearcut;

import S9.c;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.internal.vision.C7500j;
import com.google.android.gms.internal.vision.C7520o;
import com.google.android.gms.internal.vision.C7531s;
import com.google.android.gms.internal.vision.C7543w;
import com.google.android.gms.internal.vision.C7546x;
import com.google.android.gms.internal.vision.L2;
import com.google.android.gms.internal.vision.Q0;
import com.google.android.gms.internal.vision.r;
import java.util.ArrayList;
import java.util.List;
import ya.d;

@Keep
public class LogUtils {
    public static C7546x zza(long j10, int i10, String str, String str2, List<C7543w> list, L2 l22) {
        r.a x10 = r.x();
        C7520o.b z10 = C7520o.x().y(str2).v(j10).z((long) i10);
        z10.w(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C7520o) ((Q0) z10.i()));
        return (C7546x) ((Q0) C7546x.x().v((r) ((Q0) x10.w(arrayList).v((C7531s) ((Q0) C7531s.x().w((long) l22.f49217b).v((long) l22.f49216a).y((long) l22.f49218c).z(l22.f49219d).i())).i())).i());
    }

    private static String zzb(Context context) {
        try {
            return c.a(context).e(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            d.c(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C7500j zza(Context context) {
        C7500j.a v10 = C7500j.x().v(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            v10.w(zzb);
        }
        return (C7500j) ((Q0) v10.i());
    }
}
