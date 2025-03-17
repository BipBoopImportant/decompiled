package com.contentsquare.android.sdk;

import XH.v;
import YH.C16877v;
import a9.B;
import a9.Q;
import android.graphics.Rect;
import com.contentsquare.android.sdk.C7153u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;
import w8.e;

public final class b1 {
    public static C7153u a(e eVar, String str) {
        String str2 = str + '>' + eVar.j() + ":eq(" + eVar.f() + ')';
        B b10 = new B(eVar.f(), eVar.j(), str2);
        Rect e10 = eVar.e();
        Q q10 = new Q(e10.width(), e10.height(), e10.left, e10.top, eVar.m(), eVar.d(), eVar.c(), eVar.q(), eVar.n(), 512);
        if (eVar.p()) {
            q10.f42221j = Boolean.FALSE;
        }
        C7153u uVar = new C7153u();
        String i10 = eVar.i();
        C17542s.j(i10, "<set-?>");
        uVar.f47639a = i10;
        JSONObject a10 = b10.a();
        C17542s.j(a10, "<set-?>");
        uVar.f47640b = a10;
        JSONObject a11 = q10.a();
        C17542s.j(a11, "<set-?>");
        uVar.f47644f = a11;
        C7153u.a aVar = C7153u.a.COMPOSE_NODE;
        C17542s.j(aVar, "<set-?>");
        uVar.f47646h = aVar;
        v vVar = new v(uVar, str2);
        C7153u uVar2 = (C7153u) vVar.a();
        String str3 = (String) vVar.b();
        List<e> g10 = eVar.g();
        ArrayList arrayList = new ArrayList(C16877v.y(g10, 10));
        for (e a12 : g10) {
            arrayList.add(a(a12, str3));
        }
        uVar2.f47641c = arrayList;
        return uVar2;
    }
}
