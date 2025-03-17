package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.d;
import org.json.JSONException;
import org.json.JSONObject;

public class n {

    /* renamed from: i  reason: collision with root package name */
    private static final Long f145143i = 1000L;

    /* renamed from: j  reason: collision with root package name */
    private static final Long f145144j = 600L;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<String> f145145k = a.a("iss", "sub", "aud", "exp", "iat", "nonce", "azp");

    /* renamed from: a  reason: collision with root package name */
    public final String f145146a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145147b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f145148c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f145149d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f145150e;

    /* renamed from: f  reason: collision with root package name */
    public final String f145151f;

    /* renamed from: g  reason: collision with root package name */
    public final String f145152g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Object> f145153h;

    static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    n(String str, String str2, List<String> list, Long l10, Long l11, String str3, String str4, Map<String, Object> map) {
        this.f145146a = str;
        this.f145147b = str2;
        this.f145148c = list;
        this.f145149d = l10;
        this.f145150e = l11;
        this.f145151f = str3;
        this.f145152g = str4;
        this.f145153h = map;
    }

    static n a(String str) {
        List<String> list;
        String[] split = str.split("\\.");
        if (split.length > 1) {
            b(split[0]);
            JSONObject b10 = b(split[1]);
            String d10 = o.d(b10, "iss");
            String d11 = o.d(b10, "sub");
            try {
                list = o.f(b10, "aud");
            } catch (JSONException unused) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(o.d(b10, "aud"));
                list = arrayList;
            }
            Long valueOf = Long.valueOf(b10.getLong("exp"));
            Long valueOf2 = Long.valueOf(b10.getLong("iat"));
            String e10 = o.e(b10, "nonce");
            String e11 = o.e(b10, "azp");
            for (String remove : f145145k) {
                b10.remove(remove);
            }
            return new n(d10, d11, list, valueOf, valueOf2, e10, e11, o.s(b10));
        }
        throw new a("ID token must have both header and claims section");
    }

    private static JSONObject b(String str) {
        return new JSONObject(new String(Base64.decode(str, 8)));
    }

    /* access modifiers changed from: package-private */
    public void c(q qVar, k kVar, boolean z10) {
        j jVar = qVar.f145160a.f145092e;
        if (jVar != null) {
            if (this.f145146a.equals(jVar.e())) {
                Uri parse = Uri.parse(this.f145146a);
                if (!z10 && !parse.getScheme().equals(Constants.SCHEME)) {
                    throw d.l(d.b.f145010j, new a("Issuer must be an https URL"));
                } else if (TextUtils.isEmpty(parse.getHost())) {
                    throw d.l(d.b.f145010j, new a("Issuer host can not be empty"));
                } else if (parse.getFragment() != null || parse.getQueryParameterNames().size() > 0) {
                    throw d.l(d.b.f145010j, new a("Issuer URL should not containt query parameters or fragment components"));
                }
            } else {
                throw d.l(d.b.f145010j, new a("Issuer mismatch"));
            }
        }
        String str = qVar.f145162c;
        if (this.f145148c.contains(str) || str.equals(this.f145152g)) {
            long a10 = kVar.a() / f145143i.longValue();
            if (a10 > this.f145149d.longValue()) {
                throw d.l(d.b.f145010j, new a("ID Token expired"));
            } else if (Math.abs(a10 - this.f145150e.longValue()) > f145144j.longValue()) {
                throw d.l(d.b.f145010j, new a("Issued at time is more than 10 minutes before or after the current time"));
            } else if ("authorization_code".equals(qVar.f145163d)) {
                if (!TextUtils.equals(this.f145151f, qVar.f145161b)) {
                    throw d.l(d.b.f145010j, new a("Nonce mismatch"));
                }
            }
        } else {
            throw d.l(d.b.f145010j, new a("Audience mismatch"));
        }
    }
}
