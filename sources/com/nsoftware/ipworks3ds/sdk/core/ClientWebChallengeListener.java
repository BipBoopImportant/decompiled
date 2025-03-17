package com.nsoftware.ipworks3ds.sdk.core;

import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.appcompat.app.AppCompatActivity;
import nts.C3709;
import nts.C3727;
import nts.C3730;
import nts.C3734;
import nts.C3922;
import nts.C4019;
import nts.C4158;
import nts.C4208;
import qE.C14948h;
import qE.C14949i;

public class ClientWebChallengeListener extends C4158 {

    /* renamed from: v  reason: collision with root package name */
    public boolean f120793v = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3734 r32 = C3734.f1057;
        if (r32.f1066) {
            getWindow().setFlags(8192, 8192);
            setContentView(C14949i.f130468a);
            r32.m1121();
            C4208 r33 = r32.f1064.f1036;
            w(r33 == null ? "" : r33.f4076.f676.f2269.toString());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            MyWebView q02 = q0();
            ViewGroup viewGroup = (ViewGroup) q02.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(q02);
            }
            q02.destroy();
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        super.onResume();
        C3734 r02 = C3734.f1057;
        if (r02.f1066 && this.f120793v) {
            r02.m1121();
            C3730 r03 = r02.f1064;
            int r12 = r03.m1106();
            String str = "";
            if (r12 == 2 && r03.m1107() == C3709.HTML_OOB) {
                m3496(str, (String) null, (AppCompatActivity) this, 3);
            } else if (r12 == 0) {
                C4208 r04 = r03.f1036;
                if (r04 != null) {
                    str = r04.f4076.f706.f2269.toString();
                }
                if (str != null && str.length() > 0) {
                    q0().stopLoading();
                    w(str);
                    return;
                }
            }
            this.f120793v = false;
        }
    }

    public void onStop() {
        super.onStop();
        if (!isChangingConfigurations()) {
            this.f120793v = true;
        }
    }

    public final MyWebView q0() {
        return (MyWebView) findViewById(C14948h.f130451j);
    }

    public final void w(String str) {
        String r72 = C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 0, 9, 44);
        String r82 = C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 9, 5, 31);
        C3727.m1060(getWindow(), getIntent());
        SDKToolbarLayout.getCancelButton().setOnClickListener(new C3922(this, this));
        MyWebView q02 = q0();
        WebSettings settings = q02.getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(false);
        q02.setWebViewClient(new C4019(this));
        q02.loadDataWithBaseURL("", str, r72, r82, (String) null);
        C3734 r11 = C3734.f1057;
        r11.m1121();
        m3498(this, r11.f1064);
    }
}
