package com.auth0.android.request.internal;

import HJ.C15838d;
import HJ.C15854t;
import YH.C16877v;
import android.util.Base64;
import com.google.gson.TypeAdapter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b \u0010\u0014R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\"\u0010\u0014R\u0019\u0010'\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u0019\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u0016\u0010&R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010+\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b\r\u0010&R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\n\u0010/¨\u00062"}, d2 = {"Lcom/auth0/android/request/internal/Jwt;", "", "", "rawToken", "<init>", "(Ljava/lang/String;)V", "", "a", "Ljava/util/Map;", "decodedHeader", "b", "decodedPayload", "", "c", "[Ljava/lang/String;", "l", "()[Ljava/lang/String;", "parts", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "algorithm", "e", "h", "keyId", "f", "m", "subject", "g", "issuer", "i", "nonce", "j", "organizationId", "k", "organizationName", "Ljava/util/Date;", "Ljava/util/Date;", "()Ljava/util/Date;", "issuedAt", "expiresAt", "authorizedParty", "n", "authenticationTime", "", "o", "Ljava/util/List;", "()Ljava/util/List;", "audience", "p", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Jwt {

    /* renamed from: p  reason: collision with root package name */
    public static final a f46414p = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f46415a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f46416b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f46417c;

    /* renamed from: d  reason: collision with root package name */
    private final String f46418d;

    /* renamed from: e  reason: collision with root package name */
    private final String f46419e;

    /* renamed from: f  reason: collision with root package name */
    private final String f46420f;

    /* renamed from: g  reason: collision with root package name */
    private final String f46421g;

    /* renamed from: h  reason: collision with root package name */
    private final String f46422h;

    /* renamed from: i  reason: collision with root package name */
    private final String f46423i;

    /* renamed from: j  reason: collision with root package name */
    private final String f46424j;

    /* renamed from: k  reason: collision with root package name */
    private final Date f46425k;

    /* renamed from: l  reason: collision with root package name */
    private final Date f46426l;

    /* renamed from: m  reason: collision with root package name */
    private final String f46427m;

    /* renamed from: n  reason: collision with root package name */
    private final Date f46428n;

    /* renamed from: o  reason: collision with root package name */
    private final List<String> f46429o;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/auth0/android/request/internal/Jwt$a;", "", "<init>", "()V", "", "token", "", "b", "(Ljava/lang/String;)[Ljava/lang/String;", "encoded", "a", "(Ljava/lang/String;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            C17542s.j(str, "encoded");
            byte[] decode = Base64.decode(str, 11);
            C17542s.i(decode, "decode(encoded, Base64.U…RAP or Base64.NO_PADDING)");
            return new String(decode, C15838d.f135279b);
        }

        public final String[] b(String str) {
            C17542s.j(str, "token");
            String[] strArr = (String[]) C15854t.Y0(str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length == 2 && C15854t.G(str, ".", false, 2, (Object) null)) {
                strArr = new String[]{strArr[0], strArr[1], ""};
            }
            if (strArr.length == 3) {
                return strArr;
            }
            V v10 = V.f144353a;
            String format = String.format("The token was expected to have 3 parts, but got %s.", Arrays.copyOf(new Object[]{Integer.valueOf(strArr.length)}, 1));
            C17542s.i(format, "format(format, *args)");
            throw new IllegalArgumentException(format);
        }

        private a() {
        }
    }

    public Jwt(String str) {
        C17542s.j(str, "rawToken");
        a aVar = f46414p;
        String[] b10 = aVar.b(str);
        this.f46417c = b10;
        String a10 = aVar.a(b10[0]);
        String a11 = aVar.a(b10[1]);
        TypeAdapter p10 = g.f46454a.a().p(new Jwt$mapAdapter$1());
        Object fromJson = p10.fromJson(a10);
        C17542s.i(fromJson, "mapAdapter.fromJson(jsonHeader)");
        Map<String, Object> map = (Map) fromJson;
        this.f46415a = map;
        Object fromJson2 = p10.fromJson(a11);
        C17542s.i(fromJson2, "mapAdapter.fromJson(jsonPayload)");
        Map<String, Object> map2 = (Map) fromJson2;
        this.f46416b = map2;
        Object obj = map.get("alg");
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.String");
        this.f46418d = (String) obj;
        this.f46419e = (String) map.get("kid");
        this.f46420f = (String) map2.get("sub");
        this.f46421g = (String) map2.get("iss");
        this.f46422h = (String) map2.get("nonce");
        this.f46423i = (String) map2.get("org_id");
        this.f46424j = (String) map2.get("org_name");
        Object obj2 = map2.get("iat");
        Date date = null;
        Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
        this.f46425k = d10 != null ? new Date(((long) d10.doubleValue()) * ((long) 1000)) : null;
        Object obj3 = map2.get("exp");
        Double d11 = obj3 instanceof Double ? (Double) obj3 : null;
        this.f46426l = d11 != null ? new Date(((long) d11.doubleValue()) * ((long) 1000)) : null;
        this.f46427m = (String) map2.get("azp");
        Object obj4 = map2.get("auth_time");
        Double d12 = obj4 instanceof Double ? (Double) obj4 : null;
        this.f46428n = d12 != null ? new Date(((long) d12.doubleValue()) * ((long) 1000)) : date;
        Object obj5 = map2.get("aud");
        this.f46429o = obj5 instanceof String ? C16877v.e(obj5) : obj5 instanceof List ? (List) obj5 : C16877v.n();
    }

    public final String a() {
        return this.f46418d;
    }

    public final List<String> b() {
        return this.f46429o;
    }

    public final Date c() {
        return this.f46428n;
    }

    public final String d() {
        return this.f46427m;
    }

    public final Date e() {
        return this.f46426l;
    }

    public final Date f() {
        return this.f46425k;
    }

    public final String g() {
        return this.f46421g;
    }

    public final String h() {
        return this.f46419e;
    }

    public final String i() {
        return this.f46422h;
    }

    public final String j() {
        return this.f46423i;
    }

    public final String k() {
        return this.f46424j;
    }

    public final String[] l() {
        return this.f46417c;
    }

    public final String m() {
        return this.f46420f;
    }
}
