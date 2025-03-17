package a9;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* renamed from: a9.k0  reason: case insensitive filesystem */
public final class C6862k0 {
    public static String a(View view, String str) {
        Context context = view.getContext();
        int id2 = view.getId();
        long j10 = (long) id2;
        if (j10 == 16777215 || j10 == 0 || id2 == -1) {
            return str;
        }
        try {
            return context.getResources().getResourceEntryName(id2);
        } catch (Resources.NotFoundException | NullPointerException unused) {
            return str;
        }
    }
}
