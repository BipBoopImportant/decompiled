package oE;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14918c;
import pE.C14919d;
import pE.C14920e;

/* renamed from: oE.c  reason: case insensitive filesystem */
class C14880c {

    /* renamed from: e  reason: collision with root package name */
    private static final JSONArray f130023e = new JSONArray();

    /* renamed from: a  reason: collision with root package name */
    private final C14883f f130024a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f130025b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, C14881d> f130026c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final C14891n f130027d;

    /* renamed from: oE.c$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f130028a = false;
    }

    /* renamed from: oE.c$b */
    static class b extends Exception {
        public b(String str, JSONException jSONException) {
            super(str, jSONException);
        }
    }

    public C14880c(Context context, C14883f fVar) {
        this.f130025b = context;
        this.f130024a = fVar;
        this.f130027d = C14891n.f(context);
    }

    private static byte[] b(C14920e eVar, Context context, String str) {
        C14883f m10 = C14883f.m(context);
        m10.q();
        if (!eVar.a(context, (C14919d) null)) {
            return null;
        }
        try {
            return eVar.b(str, (Map<String, Object>) null, m10.s());
        } catch (MalformedURLException e10) {
            C14918c.d("MixpanelAPI.DChecker", "Cannot interpret " + str + " as a URL.", e10);
            return null;
        } catch (FileNotFoundException e11) {
            C14918c.j("MixpanelAPI.DChecker", "Cannot get " + str + ", file not found.", e11);
            return null;
        } catch (IOException e12) {
            C14918c.j("MixpanelAPI.DChecker", "Cannot get " + str + ".", e12);
            return null;
        } catch (OutOfMemoryError e13) {
            C14918c.d("MixpanelAPI.DChecker", "Out of memory when getting to " + str + ".", e13);
            return null;
        }
    }

    private String d(String str, String str2, C14920e eVar) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            String encode2 = str2 != null ? URLEncoder.encode(str2, "utf-8") : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("?version=1&lib=android&token=");
            sb2.append(encode);
            if (encode2 != null) {
                sb2.append("&distinct_id=");
                sb2.append(encode2);
            }
            sb2.append("&properties=");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("$android_lib_version", "6.5.2");
                jSONObject.putOpt("$android_app_version", this.f130027d.b());
                jSONObject.putOpt("$android_version", Build.VERSION.RELEASE);
                jSONObject.putOpt("$android_app_release", this.f130027d.a());
                jSONObject.putOpt("$android_device_model", Build.MODEL);
                sb2.append(URLEncoder.encode(jSONObject.toString(), "utf-8"));
            } catch (Exception e10) {
                C14918c.d("MixpanelAPI.DChecker", "Exception constructing properties JSON", e10.getCause());
            }
            String str3 = this.f130024a.c() + sb2.toString();
            C14918c.i("MixpanelAPI.DChecker", "Querying decide server, url: " + str3);
            byte[] b10 = b(eVar, this.f130025b, str3);
            if (b10 == null) {
                return null;
            }
            try {
                return new String(b10, Constants.ENCODING);
            } catch (UnsupportedEncodingException e11) {
                throw new RuntimeException("UTF not supported on this platform?", e11);
            }
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", e12);
        }
    }

    static a e(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("automatic_events")) {
                try {
                    aVar.f130028a = jSONObject.getBoolean("automatic_events");
                } catch (JSONException unused) {
                    C14918c.c("MixpanelAPI.DChecker", "Mixpanel endpoint returned a non boolean value for automatic events: " + jSONObject);
                }
            }
            return aVar;
        } catch (JSONException e10) {
            throw new b("Mixpanel endpoint returned unparsable result:\n" + str, e10);
        }
    }

    private a f(String str, String str2, C14920e eVar) {
        String d10 = d(str, str2, eVar);
        C14918c.i("MixpanelAPI.DChecker", "Mixpanel decide server response was:\n" + d10);
        if (d10 != null) {
            return e(d10);
        }
        return null;
    }

    public void a(C14881d dVar) {
        this.f130026c.put(dVar.b(), dVar);
    }

    public C14881d c(String str) {
        return this.f130026c.get(str);
    }

    public void g(String str, C14920e eVar) {
        C14881d dVar = this.f130026c.get(str);
        if (dVar != null) {
            try {
                a f10 = f(dVar.b(), dVar.a(), eVar);
                if (f10 != null) {
                    dVar.d(f10.f130028a);
                }
            } catch (b e10) {
                C14918c.d("MixpanelAPI.DChecker", e10.getMessage(), e10);
            }
        }
    }
}
