package com.auth0.android.provider;

import com.auth0.android.result.Credentials;
import java.util.Map;
import t7.C8836a;
import t7.C8837b;
import u7.C8884a;
import w7.f;

class m {

    /* renamed from: f  reason: collision with root package name */
    static final String f46379f = "m";

    /* renamed from: a  reason: collision with root package name */
    final C8836a f46380a;

    /* renamed from: b  reason: collision with root package name */
    private final String f46381b;

    /* renamed from: c  reason: collision with root package name */
    private final String f46382c;

    /* renamed from: d  reason: collision with root package name */
    private final String f46383d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f46384e;

    public m(C8836a aVar, String str, Map<String, String> map) {
        this(aVar, new a(), str, map);
    }

    public String a() {
        return this.f46383d;
    }

    public void b(String str, C8884a<Credentials, C8837b> aVar) {
        f<Credentials, C8837b> f10 = this.f46380a.f(str, this.f46381b, this.f46382c);
        for (Map.Entry next : this.f46384e.entrySet()) {
            f10.c((String) next.getKey(), (String) next.getValue());
        }
        f10.a(aVar);
    }

    m(C8836a aVar, a aVar2, String str, Map<String, String> map) {
        this.f46380a = aVar;
        this.f46382c = str;
        String b10 = aVar2.b();
        this.f46381b = b10;
        this.f46383d = aVar2.a(b10);
        this.f46384e = map;
    }
}
