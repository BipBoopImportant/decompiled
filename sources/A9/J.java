package a9;

import D8.c;
import com.contentsquare.android.sdk.A0;
import com.contentsquare.android.sdk.C7115b;
import com.contentsquare.android.sdk.C7122e0;
import com.contentsquare.android.sdk.C7125g;
import com.contentsquare.android.sdk.C7148r0;
import com.contentsquare.android.sdk.C7149s;
import com.contentsquare.android.sdk.C7155v;
import com.contentsquare.android.sdk.C7157w;
import com.contentsquare.android.sdk.C7162y0;
import com.contentsquare.android.sdk.C7163z;
import com.contentsquare.android.sdk.D0;
import com.contentsquare.android.sdk.H0;
import com.contentsquare.android.sdk.L0;
import com.contentsquare.android.sdk.Q;
import com.contentsquare.android.sdk.T;
import com.contentsquare.android.sdk.T0;
import com.contentsquare.android.sdk.U0;
import com.contentsquare.android.sdk.V0;
import com.contentsquare.android.sdk.W;
import com.contentsquare.android.sdk.Z0;
import com.contentsquare.android.sdk.e1;
import com.contentsquare.android.sdk.h1;
import com.sugarcube.core.logger.DslKt;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v8.C8902a;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final c f42076a = new c("JsonProxyUtils");

    /* renamed from: b  reason: collision with root package name */
    public static final C8902a f42077b = ((C8902a) C6976y3.f42974d.getValue());

    public static void a(C7162y0 y0Var) {
        if (y0Var.f47734c.length() == 0) {
            f42076a.j("No screenview detected. Gestures are linked to screenviews. Please implement screenview tracking to enable gestures tracking.");
        }
    }

    public static final JSONObject b(C7162y0 y0Var) {
        JSONArray jSONArray;
        C17542s.j(y0Var, "event");
        if (y0Var instanceof C7148r0) {
            C7148r0 r0Var = (C7148r0) y0Var;
            C17542s.j(r0Var, "event");
            JSONObject c10 = c(r0Var);
            try {
                c10.put("sl", r0Var.f47602m);
                C8537a[] aVarArr = r0Var.f47604o;
                if (aVarArr == null) {
                    return c10;
                }
                if (!(!(aVarArr.length == 0))) {
                    return c10;
                }
                c10.put("cv", C8537a.f54796d.b(aVarArr));
                return c10;
            } catch (JSONException e10) {
                C6953v4.a(e10, new StringBuilder("[ScreenViewEvent] Error in json proxy : "), f42076a, e10);
                return c10;
            }
        } else if (y0Var instanceof C7163z) {
            C7163z zVar = (C7163z) y0Var;
            C17542s.j(zVar, "event");
            JSONObject c11 = c(zVar);
            try {
                c11.put("dx", zVar.f47753m);
                c11.put("dy", zVar.f47754n);
                c11.put("du", zVar.f47755o);
                a(zVar);
                return c11;
            } catch (JSONException e11) {
                C6953v4.a(e11, new StringBuilder("[ResizeEvent] Error in json proxy : "), f42076a, e11);
                return c11;
            }
        } else {
            JSONObject jSONObject = null;
            if (y0Var instanceof C7122e0) {
                C7122e0 e0Var = (C7122e0) y0Var;
                C17542s.j(e0Var, "event");
                JSONObject c12 = c(e0Var);
                try {
                    c12.put("tvp", e0Var.f47388m);
                    c12.put("tvt", (Object) null);
                    c12.put("tvac", (Object) null);
                    c12.put("ur", e0Var.f47389n);
                    a(e0Var);
                    return c12;
                } catch (JSONException e12) {
                    C6953v4.a(e12, new StringBuilder("[TapEvent] Error in json proxy : "), f42076a, e12);
                    return c12;
                }
            } else if (y0Var instanceof T) {
                T t10 = (T) y0Var;
                C17542s.j(t10, "event");
                JSONObject c13 = c(t10);
                try {
                    c13.put("tvp", t10.f47154m);
                    c13.put("tvt", (Object) null);
                    c13.put("tvac", (Object) null);
                    a(t10);
                    return c13;
                } catch (JSONException e13) {
                    C6953v4.a(e13, new StringBuilder("[LongPressEvent] Error in json proxy : "), f42076a, e13);
                    return c13;
                }
            } else if (y0Var instanceof A0) {
                A0 a02 = (A0) y0Var;
                C17542s.j(a02, "event");
                JSONObject c14 = c(a02);
                try {
                    c14.put("tvp", a02.f46889m);
                    c14.put("tvt", (Object) null);
                    c14.put("tvac", (Object) null);
                    c14.put("fd", a02.f46890n);
                    c14.put("tvd", a02.f46891o);
                    c14.put("tvv", a02.f46892p);
                    a(a02);
                    return c14;
                } catch (JSONException e14) {
                    C6953v4.a(e14, new StringBuilder("[DragEvent] Error in json proxy : "), f42076a, e14);
                    return c14;
                }
            } else if (y0Var instanceof Q) {
                Q q10 = (Q) y0Var;
                C17542s.j(q10, "event");
                JSONObject c15 = c(q10);
                try {
                    c15.put("tvp", q10.f47116m);
                    c15.put("tvt", (Object) null);
                    c15.put("tvac", (Object) null);
                    c15.put("fd", q10.f47117n);
                    c15.put("tvd", q10.f47118o);
                    c15.put("tvv", q10.f47119p);
                    a(q10);
                    return c15;
                } catch (JSONException e15) {
                    C6953v4.a(e15, new StringBuilder("[FlickEvent] Error in json proxy : "), f42076a, e15);
                    return c15;
                }
            } else if (y0Var instanceof C7157w) {
                C7157w wVar = (C7157w) y0Var;
                C17542s.j(wVar, "event");
                return c(wVar);
            } else if (y0Var instanceof C7149s) {
                C7149s sVar = (C7149s) y0Var;
                C17542s.j(sVar, "event");
                return c(sVar);
            } else if (y0Var instanceof C7125g) {
                C7125g gVar = (C7125g) y0Var;
                C17542s.j(gVar, "event");
                return c(gVar);
            } else if (y0Var instanceof C7155v) {
                C7155v vVar = (C7155v) y0Var;
                C17542s.j(vVar, "event");
                JSONObject c16 = c(vVar);
                try {
                    c16.put("tr", vVar.f47657m);
                    return c16;
                } catch (JSONException e16) {
                    C6953v4.a(e16, new StringBuilder("[DragEvent] Error in json proxy : "), f42076a, e16);
                    return c16;
                }
            } else if (y0Var instanceof Z0) {
                Z0 z02 = (Z0) y0Var;
                C17542s.j(z02, "event");
                JSONObject c17 = c(z02);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("hm", z02.f47259n);
                    jSONObject2.put("u", z02.f47258m);
                    jSONObject2.put("sc", z02.f47262q);
                    jSONObject2.put("rst", z02.f47260o);
                    jSONObject2.put("rpt", z02.f47261p);
                    jSONObject2.put("src", z02.f47263r);
                    if (z02.f47264s != null) {
                        jSONArray = new JSONArray();
                        for (String put : z02.f47264s) {
                            jSONArray.put(put);
                        }
                    } else {
                        jSONArray = null;
                    }
                    jSONObject2.putOpt("mbc", jSONArray);
                    if (z02.f47265t != null) {
                        jSONObject = new JSONObject();
                        for (Map.Entry next : z02.f47265t.entrySet()) {
                            jSONObject.put((String) next.getKey(), (String) next.getValue());
                        }
                    }
                    jSONObject2.putOpt("prba", jSONObject);
                    c17.putOpt("nrm", jSONObject2);
                    return c17;
                } catch (JSONException e17) {
                    C6953v4.a(e17, new StringBuilder("[NetworkRequestMetricEvent] Error in json proxy : "), f42076a, e17);
                    return c17;
                }
            } else if (y0Var instanceof com.contentsquare.android.sdk.J) {
                com.contentsquare.android.sdk.J j10 = (com.contentsquare.android.sdk.J) y0Var;
                C17542s.j(j10, "event");
                JSONObject c18 = c(j10);
                try {
                    c18.putOpt("chi", j10.f47012m);
                    return c18;
                } catch (JSONException e18) {
                    C6953v4.a(e18, new StringBuilder("[UserIdentifierEvent] Error in json proxy : "), f42076a, e18);
                    return c18;
                }
            } else if (y0Var instanceof L0) {
                L0 l02 = (L0) y0Var;
                C17542s.j(l02, "event");
                JSONObject c19 = c(l02);
                try {
                    c19.put("k", l02.f47037n);
                    c19.put("v", l02.f47036m);
                    return c19;
                } catch (JSONException e19) {
                    C6953v4.a(e19, new StringBuilder("[DynamicStringVarEvent] Error in json proxy : "), f42076a, e19);
                    return c19;
                }
            } else if (y0Var instanceof H0) {
                H0 h02 = (H0) y0Var;
                C17542s.j(h02, "event");
                JSONObject c20 = c(h02);
                try {
                    c20.put("k", h02.f46996n);
                    c20.put("v", h02.f46995m);
                    return c20;
                } catch (JSONException e20) {
                    C6953v4.a(e20, new StringBuilder("[DynamicStringVarEvent] Error in json proxy : "), f42076a, e20);
                    return c20;
                }
            } else if (y0Var instanceof T0) {
                T0 t02 = (T0) y0Var;
                C17542s.j(t02, "event");
                return c(t02);
            } else if (y0Var instanceof W) {
                W w10 = (W) y0Var;
                C17542s.j(w10, "event");
                JSONObject c21 = c(w10);
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("rt", w10.f47197o);
                    jSONObject3.put("message", w10.f47195m);
                    jSONObject3.put("src", w10.f47196n);
                    JSONObject jSONObject4 = new JSONObject();
                    for (Map.Entry next2 : w10.f47198p.entrySet()) {
                        jSONObject4.put((String) next2.getKey(), (String) next2.getValue());
                    }
                    jSONObject3.putOpt("attributes", jSONObject4);
                    c21.putOpt("cur", jSONObject3);
                    return c21;
                } catch (JSONException e21) {
                    C6953v4.a(e21, new StringBuilder("[Custom Error] Error in json proxy : "), f42076a, e21);
                    return c21;
                }
            } else if (y0Var instanceof C7115b) {
                C7115b bVar = (C7115b) y0Var;
                C17542s.j(bVar, "event");
                JSONObject c22 = c(bVar);
                try {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("filename", bVar.f47287n);
                    jSONObject5.put("pageurl", bVar.f47288o);
                    jSONObject5.put("lineno", bVar.f47290q);
                    jSONObject5.put("colno", bVar.f47289p);
                    jSONObject5.put("src", bVar.f47291r);
                    jSONObject5.put("rt", bVar.f47292s);
                    jSONObject5.put(DslKt.INDICATOR_MAIN, bVar.f47286m);
                    c22.putOpt("jsr", jSONObject5);
                    return c22;
                } catch (JSONException e22) {
                    C6953v4.a(e22, new StringBuilder("[Javascript Error] Error in json proxy : "), f42076a, e22);
                    return c22;
                }
            } else if (y0Var instanceof U0) {
                U0 u02 = (U0) y0Var;
                C17542s.j(u02, "event");
                JSONObject c23 = c(u02);
                try {
                    c23.put("dx", u02.f47168m);
                    c23.put("dy", u02.f47169n);
                    c23.put("du", u02.f47170o);
                    a(u02);
                    return c23;
                } catch (JSONException e23) {
                    C6953v4.a(e23, new StringBuilder("[ScrollEvent] Error in json proxy : "), f42076a, e23);
                    return c23;
                }
            } else if (y0Var instanceof e1) {
                e1 e1Var = (e1) y0Var;
                C17542s.j(e1Var, "event");
                JSONObject c24 = c(e1Var);
                try {
                    c24.put("n", e1Var.f47392m);
                    return c24;
                } catch (JSONException e24) {
                    C6953v4.a(e24, new StringBuilder("[EtrSessionEvent] Error in json proxy : "), f42076a, e24);
                    return c24;
                }
            } else if (y0Var instanceof V0) {
                V0 v02 = (V0) y0Var;
                C17542s.j(v02, "event");
                JSONObject c25 = c(v02);
                try {
                    c25.put("n", v02.f47191m);
                    return c25;
                } catch (JSONException e25) {
                    C6953v4.a(e25, new StringBuilder("[EtrScreenEvent] Error in json proxy : "), f42076a, e25);
                    return c25;
                }
            } else if (y0Var instanceof D0) {
                D0 d02 = (D0) y0Var;
                C17542s.j(d02, "event");
                JSONObject c26 = c(d02);
                try {
                    c26.put("an", d02.f46942m);
                    return c26;
                } catch (JSONException e26) {
                    C6953v4.a(e26, new StringBuilder("[ActivityEvent] Error in json proxy : "), f42076a, e26);
                    return c26;
                }
            } else {
                if (!(y0Var instanceof h1)) {
                    f42076a.h("!!Wrong event type sent! returning null.");
                }
                return null;
            }
        }
    }

    public static JSONObject c(C7162y0 y0Var) {
        C8902a.b b10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("euid", y0Var.f47732a);
            jSONObject.put("ea", y0Var.f47733b);
            jSONObject.put("url", y0Var.f47734c);
            jSONObject.put("scn", y0Var.f47735d);
            jSONObject.put("c", y0Var.f47736e.b());
            jSONObject.put("ci", y0Var.f47737f);
            jSONObject.put("o", y0Var.f47738g.b());
            jSONObject.put("vo", y0Var.f47739h);
            jSONObject.put("sn", y0Var.f47740i);
            jSONObject.put("t", y0Var.f47741j);
            jSONObject.put("upt", y0Var.f47742k);
            C8902a aVar = f42077b;
            if (!(aVar == null || (b10 = aVar.b()) == null)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("happid", b10.a());
                jSONObject2.put("hsid", b10.b());
                jSONObject2.put("huu", b10.c());
                jSONObject.put("ht", jSONObject2);
            }
        } catch (JSONException e10) {
            C6953v4.a(e10, new StringBuilder("[EventsBundle] Error in json proxy : "), f42076a, e10);
        }
        return jSONObject;
    }
}
