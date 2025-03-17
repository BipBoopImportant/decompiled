package Db;

import Db.j;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import vb.C10302b;

public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b  reason: collision with root package name */
    public static final i<j.a, Cipher> f59050b = new i<>(new j.a());

    /* renamed from: c  reason: collision with root package name */
    public static final i<j.e, Mac> f59051c = new i<>(new j.e());

    /* renamed from: d  reason: collision with root package name */
    public static final i<j.g, Signature> f59052d = new i<>(new j.g());

    /* renamed from: e  reason: collision with root package name */
    public static final i<j.f, MessageDigest> f59053e = new i<>(new j.f());

    /* renamed from: f  reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f59054f = new i<>(new j.b());

    /* renamed from: g  reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f59055g = new i<>(new j.d());

    /* renamed from: h  reason: collision with root package name */
    public static final i<j.c, KeyFactory> f59056h = new i<>(new j.c());

    /* renamed from: a  reason: collision with root package name */
    private final e<JcePrimitiveT> f59057a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        private final j<JcePrimitiveT> f59058a;

        public JcePrimitiveT a(String str) {
            Exception exc = null;
            for (Provider a10 : i.b("GmsCore_OpenSSL", "AndroidOpenSSL")) {
                try {
                    return this.f59058a.a(str, a10);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f59058a.a(str, (Provider) null);
        }

        private b(j<JcePrimitiveT> jVar) {
            this.f59058a = jVar;
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        private final j<JcePrimitiveT> f59059a;

        public JcePrimitiveT a(String str) {
            return this.f59059a.a(str, (Provider) null);
        }

        private c(j<JcePrimitiveT> jVar) {
            this.f59059a = jVar;
        }
    }

    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        private final j<JcePrimitiveT> f59060a;

        public JcePrimitiveT a(String str) {
            Exception exc = null;
            for (Provider a10 : i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
                try {
                    return this.f59060a.a(str, a10);
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        private d(j<JcePrimitiveT> jVar) {
            this.f59060a = jVar;
        }
    }

    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public i(T_WRAPPER t_wrapper) {
        if (C10302b.c()) {
            this.f59057a = new d(t_wrapper);
        } else if (q.b()) {
            this.f59057a = new b(t_wrapper);
        } else {
            this.f59057a = new c(t_wrapper);
        }
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f59057a.a(str);
    }
}
