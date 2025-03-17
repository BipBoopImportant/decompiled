package com.nsoftware.ipworks3ds.sdk;

import android.content.Context;
import java.util.List;
import nts.C3734;
import nts.C4150;
import qE.C14944d;
import qE.C14945e;
import qE.C14951k;
import qE.C14952l;
import qE.C14953m;
import rE.C15001f;

public interface ThreeDS2Service {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreeDS2Service f120780a = C4150.f3778;

    static boolean a() {
        C4150 r02 = C4150.f3778;
        return C3734.f1056;
    }

    void cleanup(Context context);

    C14952l createTransaction(String str, String str2);

    String getSDKVersion();

    List<C14953m> getWarnings();

    void initialize(Context context, C14945e eVar, String str, C15001f fVar, C14944d dVar, C14951k kVar);
}
