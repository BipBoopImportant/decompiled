package xb;

import Db.k;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import qb.C10156a;
import qb.C10157b;
import qb.C10158c;
import qb.C10167l;
import qb.C10169n;
import qb.C10170o;
import qb.C10172q;

/* renamed from: xb.a  reason: case insensitive filesystem */
public final class C10379a {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Object f77680d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f77681e = "a";

    /* renamed from: a  reason: collision with root package name */
    private final C10172q f77682a;

    /* renamed from: b  reason: collision with root package name */
    private final C10156a f77683b;

    /* renamed from: c  reason: collision with root package name */
    private C10170o f77684c;

    /* renamed from: xb.a$b */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f77685a = null;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f77686b = null;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f77687c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f77688d = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public C10156a f77689e = null;

        /* renamed from: f  reason: collision with root package name */
        private boolean f77690f = true;

        /* renamed from: g  reason: collision with root package name */
        private C10167l f77691g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public C10170o f77692h;

        private C10170o g() {
            if (this.f77691g != null) {
                C10170o a10 = C10170o.i().a(this.f77691g);
                C10170o h10 = a10.h(a10.d().i().V(0).V());
                C10382d dVar = new C10382d(this.f77685a, this.f77686b, this.f77687c);
                if (this.f77689e != null) {
                    h10.d().r(dVar, this.f77689e);
                } else {
                    C10158c.b(h10.d(), dVar);
                }
                return h10;
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }

        private static byte[] h(Context context, String str, String str2) {
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                try {
                    String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, (String) null);
                    if (string == null) {
                        return null;
                    }
                    return k.a(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{str}));
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        }

        private C10170o i(byte[] bArr) {
            return C10170o.j(C10158c.a(C10157b.c(bArr)));
        }

        private C10170o j(byte[] bArr) {
            try {
                this.f77689e = new C10381c().b(this.f77688d);
                try {
                    return C10170o.j(C10169n.n(C10157b.c(bArr), this.f77689e));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    C10170o i10 = i(bArr);
                    Log.w(C10379a.f77681e, "cannot use Android Keystore, it'll be disabled", e11);
                    return i10;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private C10156a k() {
            if (!C10379a.e()) {
                Log.w(C10379a.f77681e, "Android Keystore requires at least Android M");
                return null;
            }
            C10381c cVar = new C10381c();
            try {
                boolean d10 = C10381c.d(this.f77688d);
                try {
                    return cVar.b(this.f77688d);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (d10) {
                        Log.w(C10379a.f77681e, "cannot use Android Keystore, it'll be disabled", e10);
                        return null;
                    }
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f77688d}), e10);
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(C10379a.f77681e, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public synchronized C10379a f() {
            C10379a aVar;
            try {
                if (this.f77686b != null) {
                    synchronized (C10379a.f77680d) {
                        byte[] h10 = h(this.f77685a, this.f77686b, this.f77687c);
                        if (h10 == null) {
                            if (this.f77688d != null) {
                                this.f77689e = k();
                            }
                            this.f77692h = g();
                        } else {
                            if (this.f77688d != null) {
                                if (C10379a.e()) {
                                    this.f77692h = j(h10);
                                }
                            }
                            this.f77692h = i(h10);
                        }
                        aVar = new C10379a(this);
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th2) {
                throw th2;
            } finally {
                while (true) {
                }
            }
            return aVar;
        }

        public b l(C10167l lVar) {
            this.f77691g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f77690f) {
                this.f77688d = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.f77685a = context;
                this.f77686b = str;
                this.f77687c = str2;
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean e() {
        return true;
    }

    public synchronized C10169n d() {
        return this.f77684c.d();
    }

    private C10379a(b bVar) {
        this.f77682a = new C10382d(bVar.f77685a, bVar.f77686b, bVar.f77687c);
        this.f77683b = bVar.f77689e;
        this.f77684c = bVar.f77692h;
    }
}
