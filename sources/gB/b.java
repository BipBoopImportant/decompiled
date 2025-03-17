package Gb;

import Ib.a;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f60571g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f60572h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f60573a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60574b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60575c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f60576d;

    /* renamed from: e  reason: collision with root package name */
    private final long f60577e;

    /* renamed from: f  reason: collision with root package name */
    private final long f60578f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f60573a = str;
        this.f60574b = str2;
        this.f60575c = str3;
        this.f60576d = date;
        this.f60577e = j10;
        this.f60578f = j11;
    }

    static b a(a.c cVar) {
        String str = cVar.f60997d;
        if (str == null) {
            str = "";
        }
        return new b(cVar.f60995b, String.valueOf(cVar.f60996c), str, new Date(cVar.f61006m), cVar.f60998e, cVar.f61003j);
    }

    static b b(Map<String, String> map) {
        g(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f60572h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (ParseException e10) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e10);
        } catch (NumberFormatException e11) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e11);
        }
    }

    private static void g(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f60571g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f60573a;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f60576d.getTime();
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f60574b;
    }

    /* access modifiers changed from: package-private */
    public a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f60994a = str;
        cVar.f61006m = d();
        cVar.f60995b = this.f60573a;
        cVar.f60996c = this.f60574b;
        cVar.f60997d = TextUtils.isEmpty(this.f60575c) ? null : this.f60575c;
        cVar.f60998e = this.f60577e;
        cVar.f61003j = this.f60578f;
        return cVar;
    }
}
