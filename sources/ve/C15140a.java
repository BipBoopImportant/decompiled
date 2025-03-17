package vE;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import yE.C15298a;

/* renamed from: vE.a  reason: case insensitive filesystem */
public class C15140a {

    /* renamed from: a  reason: collision with root package name */
    private final C15298a f131537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f131538b;

    /* renamed from: c  reason: collision with root package name */
    private final Logger f131539c;

    public C15140a(String str, C15298a aVar, Logger logger) {
        this.f131537a = aVar;
        this.f131538b = String.format("optly-data-file-%s.json", new Object[]{str});
        this.f131539c = logger;
    }

    public boolean a() {
        return this.f131537a.a(this.f131538b);
    }

    public boolean b() {
        return this.f131537a.b(this.f131538b);
    }

    public String c() {
        return this.f131538b;
    }

    public JSONObject d() {
        String c10 = this.f131537a.c(this.f131538b);
        if (c10 == null) {
            return null;
        }
        try {
            return new JSONObject(c10);
        } catch (JSONException e10) {
            this.f131539c.error("Unable to parse data file", (Throwable) e10);
            return null;
        }
    }

    public boolean e(String str) {
        return this.f131537a.d(this.f131538b, str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15140a)) {
            return false;
        }
        return this.f131538b.equals(((C15140a) obj).f131538b);
    }
}
