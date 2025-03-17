package a9;

import java.util.ArrayList;
import w8.e;

/* renamed from: a9.a6  reason: case insensitive filesystem */
public final class C6788a6 {
    public static void a(e eVar, ArrayList arrayList) {
        e l10 = eVar.l();
        if (l10 != null) {
            a(l10, arrayList);
        }
        int f10 = eVar.f();
        String j10 = eVar.j();
        arrayList.add(j10 + ":eq(" + f10 + ')');
    }
}
