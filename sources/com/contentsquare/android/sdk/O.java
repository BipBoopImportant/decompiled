package com.contentsquare.android.sdk;

import YH.C16877v;
import a9.C6912q2;
import a9.C6975y2;
import l8.C8537a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public int f47052a;

    /* renamed from: b  reason: collision with root package name */
    public int f47053b;

    /* renamed from: c  reason: collision with root package name */
    public int f47054c;

    /* renamed from: d  reason: collision with root package name */
    public int f47055d;

    /* renamed from: e  reason: collision with root package name */
    public double f47056e = 1.0d;

    /* renamed from: f  reason: collision with root package name */
    public String f47057f;

    /* renamed from: g  reason: collision with root package name */
    public String f47058g;

    /* renamed from: h  reason: collision with root package name */
    public String f47059h;

    /* renamed from: i  reason: collision with root package name */
    public String f47060i;

    /* renamed from: j  reason: collision with root package name */
    public String f47061j;

    /* renamed from: k  reason: collision with root package name */
    public String f47062k;

    /* renamed from: l  reason: collision with root package name */
    public String f47063l;

    /* renamed from: m  reason: collision with root package name */
    public String f47064m;

    /* renamed from: n  reason: collision with root package name */
    public C6912q2 f47065n;

    /* renamed from: o  reason: collision with root package name */
    public String f47066o = "";

    /* renamed from: p  reason: collision with root package name */
    public a f47067p = a.f47068b;

    public enum a {
        f47068b("PerViews"),
        f47069c("Fullscreen");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f47071a;

        /* access modifiers changed from: public */
        a(String str) {
            this.f47071a = str;
        }

        public final String toString() {
            return this.f47071a;
        }
    }

    public final JSONObject a(boolean z10) {
        C8537a[] aVarArr;
        C8537a[] aVarArr2;
        C6912q2 q2Var = this.f47065n;
        if (q2Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device_height", this.f47053b);
            jSONObject.put("device_width", this.f47052a);
            jSONObject.put("device_ratio", this.f47056e);
            jSONObject.put("device_model", this.f47057f);
            jSONObject.put("device_manufacturer", this.f47058g);
            jSONObject.put("version_sdk", this.f47059h);
            jSONObject.put("version_json", this.f47060i);
            jSONObject.put("device_id", this.f47054c);
            jSONObject.put("project_id", this.f47055d);
            jSONObject.put("version_app", this.f47061j);
            jSONObject.put("version_os", this.f47062k);
            jSONObject.put("inapp_user_id", this.f47063l);
            jSONObject.put("url", this.f47064m);
            jSONObject.put("bmp_capture_type", this.f47067p.f47071a);
            C6912q2 q2Var2 = this.f47065n;
            if (q2Var2 == null || (aVarArr = q2Var2.f42807c) == null) {
                aVarArr = new C8537a[0];
            }
            if (!(aVarArr.length == 0)) {
                C8537a.C0870a aVar = C8537a.f54796d;
                if (q2Var2 == null || (aVarArr2 = q2Var2.f42807c) == null) {
                    aVarArr2 = new C8537a[0];
                }
                jSONObject.put("cv", aVar.b(aVarArr2));
            }
            JSONArray jSONArray = new JSONArray();
            for (C7153u uVar : q2Var.f42808d) {
                if (z10) {
                    uVar = (C7153u) C16877v.w0(C6975y2.a(uVar, true));
                }
                jSONArray.put(uVar.a());
            }
            jSONObject.put("screengraph", jSONArray);
            jSONObject.put("screenshot", this.f47066o);
            return jSONObject;
        }
        throw new JSONException("Object is not valid. We are missing the ScreenGraph data.");
    }
}
