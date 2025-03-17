package com.contentsquare.android.sdk;

import D8.c;
import a9.C6940u;
import a9.C6951v2;
import a9.D6;
import a9.E6;
import com.optimizely.ab.config.FeatureVariable;
import d9.F;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import org.json.JSONObject;
import u8.C8886a;
import v8.b;
import x8.C8957a;
import y8.C8993b;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final C7133k f47019a;

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C8957a> f47020b;

    /* renamed from: c  reason: collision with root package name */
    public final C17631a<C7131j> f47021c;

    /* renamed from: d  reason: collision with root package name */
    public final E6 f47022d;

    /* renamed from: e  reason: collision with root package name */
    public final b f47023e;

    /* renamed from: f  reason: collision with root package name */
    public final c f47024f = new c("WebViewSessionReplayEventProcessor");

    public K(C7133k kVar, C17631a<? extends C8957a> aVar, C17631a<C7131j> aVar2, E6 e62, b bVar) {
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(aVar, "errorAnalysisModuleProvider");
        C17542s.j(aVar2, "sessionReplayProvider");
        C17542s.j(e62, "eventLimiter");
        C17542s.j(bVar, "screenViewTracker");
        this.f47019a = kVar;
        this.f47020b = aVar;
        this.f47021c = aVar2;
        this.f47022d = e62;
        this.f47023e = bVar;
    }

    public final void a(JSONObject jSONObject) {
        boolean z10;
        C17542s.j(jSONObject, FeatureVariable.JSON_TYPE);
        int i10 = jSONObject.getInt("type");
        if (!this.f47022d.a(i10)) {
            int i11 = 0;
            if (i10 == F.b.JS_ERROR.d()) {
                z10 = D6.a(C8886a.f56874d.a(), "webview_javascript_errors");
                if (z10) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C7133k kVar = this.f47019a;
                    C17542s.i(jSONObject2, "dataObject");
                    C7115b bVar = new C7115b(r.c(kVar, jSONObject2, this.f47023e));
                    C7131j invoke = this.f47021c.invoke();
                    if (invoke != null) {
                        C6940u uVar = new C6940u(bVar);
                        C17542s.j(uVar, "event");
                        invoke.f47448b.a(uVar);
                    }
                }
            } else if (i10 == F.b.CUSTOM_ERROR.d()) {
                z10 = D6.a(C8886a.f56874d.a(), "webview_custom_errors");
                if (z10) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                    C7133k kVar2 = this.f47019a;
                    C17542s.i(jSONObject3, "dataObject");
                    W w10 = new W(r.a(kVar2, jSONObject3, this.f47023e));
                    C7131j invoke2 = this.f47021c.invoke();
                    if (invoke2 != null) {
                        C6951v2 v2Var = new C6951v2(w10);
                        C17542s.j(v2Var, "event");
                        invoke2.f47449c.a(v2Var);
                    }
                }
            } else {
                if (i10 == F.b.NETWORK_REQUEST_METRIC.d()) {
                    boolean a10 = D6.a(C8886a.f56874d.a(), "webview_api_errors");
                    JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                    C17542s.i(jSONObject4, "dataObject");
                    C8993b b10 = r.b(jSONObject4);
                    C8957a invoke3 = this.f47020b.invoke();
                    if (invoke3 == null || !a10) {
                        this.f47024f.h("Unable to send API Error - Error Analysis Module is not available");
                    } else {
                        if (b10 != null) {
                            invoke3.e(b10);
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                E6 e62 = this.f47022d;
                e62.getClass();
                if (E6.f41987c.contains(Integer.valueOf(i10))) {
                    LinkedHashMap linkedHashMap = e62.f41989b;
                    Integer valueOf = Integer.valueOf(i10);
                    Integer num = (Integer) e62.f41989b.get(Integer.valueOf(i10));
                    if (num != null) {
                        i11 = num.intValue();
                    }
                    linkedHashMap.put(valueOf, Integer.valueOf(i11 + 1));
                }
            }
        }
    }
}
