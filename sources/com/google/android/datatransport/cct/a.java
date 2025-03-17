package com.google.android.datatransport.cct;

import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import l9.g;

public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f47790c;

    /* renamed from: d  reason: collision with root package name */
    static final String f47791d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f47792e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<c> f47793f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c[]{c.b("proto"), c.b(FeatureVariable.JSON_TYPE)})));

    /* renamed from: g  reason: collision with root package name */
    public static final a f47794g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f47795h;

    /* renamed from: a  reason: collision with root package name */
    private final String f47796a;

    /* renamed from: b  reason: collision with root package name */
    private final String f47797b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f47790c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f47791d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f47792e = a12;
        f47794g = new a(a10, (String) null);
        f47795h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f47796a = str;
        this.f47797b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<c> a() {
        return f47793f;
    }

    public byte[] b() {
        String str = this.f47797b;
        if (str == null && this.f47796a == null) {
            return null;
        }
        String str2 = this.f47796a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", new Object[]{"1$", str2, "\\", str}).getBytes(Charset.forName(Constants.ENCODING));
    }

    public String d() {
        return this.f47797b;
    }

    public String e() {
        return this.f47796a;
    }

    public byte[] getExtras() {
        return b();
    }

    public String getName() {
        return "cct";
    }
}
