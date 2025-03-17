package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

class e {

    /* renamed from: a  reason: collision with root package name */
    final String f46305a;

    /* renamed from: b  reason: collision with root package name */
    final String f46306b;

    /* renamed from: c  reason: collision with root package name */
    final Date f46307c;

    /* renamed from: d  reason: collision with root package name */
    final Date f46308d;

    /* renamed from: e  reason: collision with root package name */
    final Date f46309e;

    /* renamed from: f  reason: collision with root package name */
    final String f46310f;

    /* renamed from: g  reason: collision with root package name */
    final List<String> f46311g;

    /* renamed from: h  reason: collision with root package name */
    final Map<String, b> f46312h;

    e(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, b> map) {
        this.f46305a = str;
        this.f46306b = str2;
        this.f46307c = date;
        this.f46308d = date2;
        this.f46309e = date3;
        this.f46310f = str3;
        this.f46311g = list;
        this.f46312h = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public b a(String str) {
        b bVar = this.f46312h.get(str);
        return bVar != null ? bVar : new a();
    }
}
