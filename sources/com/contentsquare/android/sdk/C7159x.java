package com.contentsquare.android.sdk;

import G8.g;
import a9.B;
import a9.C6854j0;
import a9.C6862k0;
import a9.C6949v0;
import a9.K2;
import a9.Q;
import a9.W3;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C7153u;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;
import w8.C8933a;

/* renamed from: com.contentsquare.android.sdk.x  reason: case insensitive filesystem */
public final class C7159x {
    public static final C7153u a(View view, W3 w32, K2 k22, C8933a aVar) {
        View view2 = view;
        W3 w33 = w32;
        K2 k23 = k22;
        C8933a aVar2 = aVar;
        C17542s.j(view2, "view");
        C17542s.j(w33, "viewBitmapProviderResult");
        C17542s.j(k23, "screenGraphParameters");
        C6854j0 j0Var = new C6854j0(new C6949v0());
        String simpleName = view.getClass().getSimpleName();
        C17542s.i(simpleName, "view.javaClass.simpleName");
        boolean z10 = false;
        B b10 = new B(0, simpleName, j0Var.a(view2));
        C7153u.a aVar3 = (aVar2 == null || !aVar2.a(view2)) ? (aVar2 == null || !aVar2.d(view2)) ? C7153u.a.VIEW : C7153u.a.ANDROID_VIEWS_HANDLER : C7153u.a.ANDROID_COMPOSE_VIEW;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        Q q10 = r9;
        Q q11 = new Q(view.getWidth(), view.getHeight(), iArr[0], iArr[1], view.getZ(), (String) null, (String) null, false, 0.0f, 992);
        q10.f42219h = view.getVisibility() == 0;
        if (k23.f42096a) {
            z10 = C17542s.e(view2, k23.f42098c);
        } else if (!(view2 instanceof ViewGroup) || (view.getBackground() instanceof LayerDrawable) || (view2 instanceof WebView) || g.h(view2, "CollapsingToolbarLayout")) {
            z10 = true;
        }
        if (z10) {
            q10.f42217f = w33.b(view2);
        } else if (k23.f42097b) {
            C17542s.j(view2, "view");
            Drawable background = view.getBackground();
            q10.f42218g = background instanceof ColorDrawable ? g.o(((ColorDrawable) background).getColor()) : "#00FFFFFF";
            C17542s.j(view2, "view");
            q10.f42220i = (!(view2 instanceof ViewGroup) || !(view.getBackground() instanceof ColorDrawable)) ? 1.0f : view.getAlpha();
        }
        if (aVar3 == C7153u.a.ANDROID_VIEWS_HANDLER) {
            q10.f42221j = Boolean.FALSE;
        }
        String a10 = C6862k0.a(view2, "null");
        C17542s.i(a10, "getResourceEntryName(vie…urceUtils.NULL_STRING_ID)");
        C7153u uVar = new C7153u();
        JSONObject a11 = q10.a();
        C17542s.j(a11, "<set-?>");
        uVar.f47644f = a11;
        JSONObject a12 = b10.a();
        C17542s.j(a12, "<set-?>");
        uVar.f47640b = a12;
        C17542s.j(a10, "<set-?>");
        uVar.f47639a = a10;
        C17542s.j(aVar3, "<set-?>");
        uVar.f47646h = aVar3;
        return uVar;
    }
}
