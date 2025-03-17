package com.contentsquare.android.sdk;

import YH.C16877v;
import a9.B;
import a9.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.u  reason: case insensitive filesystem */
public final class C7153u {

    /* renamed from: a  reason: collision with root package name */
    public String f47639a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f47640b;

    /* renamed from: c  reason: collision with root package name */
    public List<C7153u> f47641c;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f47642d;

    /* renamed from: e  reason: collision with root package name */
    public JSONArray f47643e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f47644f;

    /* renamed from: g  reason: collision with root package name */
    public int f47645g;

    /* renamed from: h  reason: collision with root package name */
    public a f47646h;

    /* renamed from: com.contentsquare.android.sdk.u$a */
    public enum a {
        VIEW,
        ANDROID_COMPOSE_VIEW,
        ANDROID_VIEWS_HANDLER,
        COMPOSE_NODE
    }

    public C7153u() {
        this.f47639a = "";
        this.f47640b = new B(0, "", "").a();
        this.f47644f = new Q(0, 0, 0, 0, 0.0f, (String) null, (String) null, false, 0.0f, 1023).a();
        this.f47645g = 1;
        this.f47646h = a.VIEW;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f47639a);
        jSONObject.put("style", this.f47644f);
        jSONObject.put("format", this.f47645g);
        jSONObject.put("metadata", this.f47640b);
        List<C7153u> list = this.f47641c;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList(C16877v.y(list, 10));
            for (C7153u a10 : list) {
                arrayList.add(a10.a());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("children", jSONArray);
        }
        JSONArray jSONArray2 = this.f47643e;
        if (jSONArray2 != null) {
            jSONObject.put("children", jSONArray2);
        }
        JSONObject jSONObject2 = this.f47642d;
        if (jSONObject2 != null) {
            jSONObject.put("children", jSONObject2);
        }
        return jSONObject;
    }

    public final String toString() {
        return "JsonView{id=\\'" + this.f47639a + "\\', metadata=" + this.f47640b + ", children=" + this.f47641c + ", webViewChildren=" + this.f47642d + ", externalChildren=" + this.f47643e + ", style=" + this.f47644f + ", format=" + this.f47645g + '}';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7153u(C7153u uVar) {
        this();
        C17542s.j(uVar, "other");
        this.f47639a = uVar.f47639a;
        this.f47640b = uVar.f47640b;
        this.f47641c = uVar.f47641c;
        this.f47642d = uVar.f47642d;
        this.f47643e = uVar.f47643e;
        this.f47644f = uVar.f47644f;
        this.f47645g = uVar.f47645g;
        this.f47646h = uVar.f47646h;
    }
}
