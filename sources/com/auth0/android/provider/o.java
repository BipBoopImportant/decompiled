package com.auth0.android.provider;

import com.auth0.android.request.internal.Jwt;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;
import t7.C8836a;
import t7.C8837b;
import u7.C8884a;
import v7.C8900i;
import v7.u;
import v7.x;

abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f46385a;

    class a implements C8884a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C8884a f46387b;

        a(String str, C8884a aVar) {
            this.f46386a = str;
            this.f46387b = aVar;
        }

        /* renamed from: c */
        public void b(C8837b bVar) {
            this.f46387b.b(new u(this.f46386a));
        }

        /* renamed from: d */
        public void a(Map<String, PublicKey> map) {
            try {
                this.f46387b.a(new b(map.get(this.f46386a)));
            } catch (InvalidKeyException unused) {
                this.f46387b.b(new u(this.f46386a));
            }
        }
    }

    o(List<String> list) {
        this.f46385a = list;
    }

    private void a(String str) {
        if (!this.f46385a.contains(str) || "none".equalsIgnoreCase(str)) {
            throw new C8900i(str, this.f46385a);
        }
    }

    static void c(String str, C8836a aVar, C8884a<o, x> aVar2) {
        aVar.a().a(new a(str, aVar2));
    }

    /* access modifiers changed from: protected */
    public abstract void b(String[] strArr);

    /* access modifiers changed from: package-private */
    public void d(Jwt jwt) {
        a(jwt.a());
        b(jwt.l());
    }
}
