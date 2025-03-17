package com.contentsquare.android.sdk;

import XH.v;
import YH.C16877v;
import a9.B4;
import a9.C4;
import a9.C6789b;
import a9.C6953v4;
import a9.D6;
import a9.H1;
import a9.J;
import a9.M6;
import a9.V6;
import android.net.Uri;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.sdk.C7139n;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;
import u8.C8886a;

public final class S0 {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f47142a;

    /* renamed from: b  reason: collision with root package name */
    public final V6 f47143b;

    /* renamed from: c  reason: collision with root package name */
    public final C8.a f47144c;

    /* renamed from: d  reason: collision with root package name */
    public String f47145d;

    /* renamed from: e  reason: collision with root package name */
    public final C7133k f47146e;

    /* renamed from: f  reason: collision with root package name */
    public final E8.c f47147f;

    /* renamed from: g  reason: collision with root package name */
    public final M6 f47148g;

    /* renamed from: h  reason: collision with root package name */
    public final C6789b f47149h;

    /* renamed from: i  reason: collision with root package name */
    public final D8.c f47150i = new D8.c("BucketsDispatcher");

    public final class a implements Callable<v<? extends Boolean, ? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public final c f47151a;

        /* renamed from: b  reason: collision with root package name */
        public final b f47152b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ S0 f47153c;

        public /* synthetic */ a(S0 s02) {
            this(s02, new B4(), new C4());
        }

        public static final void a() {
        }

        public static final void b() {
        }

        public final boolean c() {
            LinkedList<v> linkedList;
            S0 s02;
            boolean z10;
            V6 v62 = this.f47153c.f47143b;
            synchronized (v62) {
                try {
                    v62.h();
                    linkedList = new LinkedList<>();
                    String str = v62.f42359e + File.separator + "evts";
                    for (T intValue : C16877v.f1(v62.b(str))) {
                        int intValue2 = intValue.intValue();
                        if (intValue2 >= 0) {
                            String str2 = str + File.separator + intValue2;
                            if (v62.f42355a.l(str2)) {
                                List<Integer> b10 = v62.b(str2);
                                for (T intValue3 : intValue2 == v62.f42362h ? C16877v.o0(C16877v.f1(b10), 1) : C16877v.f1(b10)) {
                                    linkedList.add(new v(Integer.valueOf(intValue2), Integer.valueOf(intValue3.intValue())));
                                }
                            } else {
                                v62.f42358d.h("Failed getting a writable folder at path " + intValue2);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (v vVar : linkedList) {
                int intValue4 = ((Number) vVar.c()).intValue();
                int intValue5 = ((Number) vVar.d()).intValue();
                v<String, List<JSONObject>> f10 = this.f47153c.f47143b.f(intValue4, intValue5);
                String a10 = f10.a();
                List<JSONObject> b11 = f10.b();
                if (b11.isEmpty()) {
                    this.f47153c.f47150i.f("Skipping the bucket: " + intValue5 + " for session: " + intValue4 + " because it was empty.");
                    s02 = this.f47153c;
                } else {
                    M6 m62 = this.f47153c.f47148g;
                    m62.getClass();
                    C17542s.j(b11, "events");
                    if (!b11.isEmpty()) {
                        Iterator it = b11.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            JSONObject jSONObject = (JSONObject) it.next();
                            try {
                                if (jSONObject.has("ea") && jSONObject.getInt("ea") == 24) {
                                    z10 = true;
                                    break;
                                }
                            } catch (JSONException e10) {
                                H1.a(m62.f42156a, "Error getting the event action for the event " + jSONObject, e10);
                            }
                        }
                    }
                    z10 = false;
                    C7133k kVar = this.f47153c.f47146e;
                    C7139n.a aVar = new C7139n.a(kVar.f47463a);
                    JsonConfig.ProjectConfiguration b12 = kVar.f47466d.b();
                    aVar.f47531l = b12 != null ? b12.g() : 0;
                    aVar.f47530k = kVar.f47465c.a();
                    C17542s.j(b11, "payload");
                    for (JSONObject put : b11) {
                        aVar.f47528i.put(put);
                    }
                    if (a10 != null) {
                        aVar.f47530k = a10;
                    }
                    C7139n nVar = new C7139n(aVar);
                    D8.c cVar = J.f42076a;
                    C17542s.j(nVar, "events");
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("pid", nVar.f47509b);
                        jSONObject2.put("uid", nVar.f47508a);
                        jSONObject2.put("dt", nVar.f47510c.b());
                        jSONObject2.put("os", nVar.f47511d);
                        jSONObject2.put("l", nVar.f47512e);
                        jSONObject2.put("tz", nVar.f47515h);
                        jSONObject2.put("to", nVar.f47516i);
                        jSONObject2.put("r", nVar.f47517j);
                        jSONObject2.put("pl", nVar.f47518k);
                        jSONObject2.put("now", nVar.f47519l);
                        jSONObject2.put("dmo", nVar.f47513f);
                        jSONObject2.put("dma", nVar.f47514g);
                    } catch (JSONException e11) {
                        C6953v4.a(e11, new StringBuilder("[EventsBundle] Error in json proxy : "), J.f42076a, e11);
                    }
                    this.f47153c.f47150i.f("Calling HTTP request for bucket of " + b11.size() + " items");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f47153c.f47147f.b(E8.b.LOCAL_LOG_VISUALIZER_MODE, false)) {
                        linkedHashMap.put("cs-log-request", "true");
                    }
                    S0 s03 = this.f47153c;
                    C6789b bVar = s03.f47149h;
                    String str3 = s03.f47145d;
                    String str4 = aVar.f47530k;
                    bVar.getClass();
                    C17542s.j(str3, "eventsEndpoint");
                    C17542s.j(b11, "bucketContent");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    JsonConfig.ProjectConfiguration b13 = bVar.f42458a.b();
                    if (b13 != null) {
                        linkedHashMap2.put("pid", String.valueOf(b13.g()));
                    }
                    if (str4 != null) {
                        linkedHashMap2.put("uu", str4);
                    }
                    JSONObject jSONObject3 = (JSONObject) C16877v.y0(b11);
                    if (jSONObject3 != null) {
                        int optInt = jSONObject3.optInt("sn", -1);
                        Integer valueOf = Integer.valueOf(optInt);
                        if (optInt == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            linkedHashMap2.put("sn", String.valueOf(valueOf.intValue()));
                        }
                        JSONObject optJSONObject = jSONObject3.optJSONObject("vo");
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("sv", "");
                            C17542s.i(optString, "sv");
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            if (optString != null) {
                                linkedHashMap2.put("sv", optString);
                            }
                            String optString2 = optJSONObject.optString("av", "");
                            C17542s.i(optString2, "av");
                            if (optString2.length() <= 0) {
                                optString2 = null;
                            }
                            if (optString2 != null) {
                                linkedHashMap2.put("av", optString2);
                            }
                        }
                    }
                    if (D6.a(C8886a.f56874d.a(), "endofscreenview_event")) {
                        linkedHashMap2.put("hlm", String.valueOf(z10));
                    }
                    Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    String builder = buildUpon.toString();
                    C17542s.i(builder, "builder.toString()");
                    C8.a aVar2 = this.f47153c.f47144c;
                    String jSONObject4 = jSONObject2.toString();
                    C17542s.i(jSONObject4, "jsonData.toString()");
                    if (aVar2.f(builder, jSONObject4, linkedHashMap).p()) {
                        this.f47153c.f47150i.f("The bucket: " + intValue5 + " for session: " + intValue4 + " with size " + b11.size() + " was successfully sent.");
                        s02 = this.f47153c;
                    } else {
                        this.f47153c.f47150i.h("Could not send the bucket: " + intValue5 + " for session " + intValue4 + " with payload: " + b11 + ". Breaking the chain in order to retry later.");
                        return false;
                    }
                }
                s02.f47143b.d(intValue4, intValue5);
            }
            return true;
        }

        public final Object call() {
            try {
                this.f47153c.f47150i.f("Fetching the unsent buckets...");
                if (c()) {
                    this.f47151a.a();
                    return new v(Boolean.TRUE, "All buckets were processed");
                }
                this.f47152b.a();
                return new v(Boolean.FALSE, "The process was interrupted due to a problem in the chain");
            } catch (Exception e10) {
                H1.a(this.f47153c.f47150i, "An exception was thrown while trying to send the buckets", e10);
                this.f47152b.a();
                Boolean bool = Boolean.FALSE;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                return new v(bool, message);
            }
        }

        public a(S0 s02, c cVar, b bVar) {
            C17542s.j(cVar, "onSuccess");
            C17542s.j(bVar, "onError");
            this.f47153c = s02;
            this.f47151a = cVar;
            this.f47152b = bVar;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public S0(ExecutorService executorService, V6 v62, C8.a aVar, String str, C7133k kVar, E8.c cVar, M6 m62, C6789b bVar) {
        C17542s.j(executorService, "threadExecutor");
        C17542s.j(v62, "eventStorageManager");
        C17542s.j(aVar, "httpConnection");
        C17542s.j(str, "eventsEndpoint");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(m62, "eventSendingManager");
        C17542s.j(bVar, "eventUrlGenerator");
        this.f47142a = executorService;
        this.f47143b = v62;
        this.f47144c = aVar;
        this.f47145d = str;
        this.f47146e = kVar;
        this.f47147f = cVar;
        this.f47148g = m62;
        this.f47149h = bVar;
    }
}
