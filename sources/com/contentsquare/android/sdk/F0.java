package com.contentsquare.android.sdk;

import D8.c;
import E8.b;
import a9.C6865k3;
import a9.C6908p6;
import a9.D6;
import a9.O0;
import com.contentsquare.android.sdk.C7148r0;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import u8.C8886a;

public final class F0 extends C6865k3 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C7133k f46969f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ J0 f46970g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F0(O0 o02, C6908p6 p6Var, C7133k kVar, J0 j02, c cVar) {
        super(o02, cVar, p6Var);
        this.f46969f = kVar;
        this.f46970g = j02;
    }

    public final void a(int i10, String str, String str2, C8537a[] aVarArr, boolean z10, Long l10, String str3) {
        C17542s.j(aVarArr, "customVars");
        C7148r0.a aVar = (C7148r0.a) this.f46969f.a(4, str2);
        aVar.f47606k = i10;
        aVar.f47607l = str;
        aVar.f47608m = aVarArr;
        aVar.f47609n = z10;
        if (l10 != null) {
            aVar.f47751i = l10.longValue();
        }
        J0 j02 = this.f46970g;
        j02.f47018e = aVar;
        j02.f47016c.k(b.SCREEN_TIMESTAMP, aVar.f47751i);
        if (D6.a(C8886a.f56874d.a(), "endofscreenview_event") && aVar.f47745c != 0) {
            J0 j03 = this.f46970g;
            j03.f47014a.a(this.f46969f.a(24, str3));
        }
        this.f46970g.f47014a.a(aVar);
    }
}
