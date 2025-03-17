package xb;

import Db.p;
import Db.r;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import qb.C10156a;
import qb.C10173r;

/* renamed from: xb.c  reason: case insensitive filesystem */
public final class C10381c implements C10173r {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f77695c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final String f77696d = "c";

    /* renamed from: a  reason: collision with root package name */
    private final String f77697a;

    /* renamed from: b  reason: collision with root package name */
    private KeyStore f77698b;

    /* renamed from: xb.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f77699a = null;

        /* renamed from: b  reason: collision with root package name */
        KeyStore f77700b = null;

        public a() {
            if (C10381c.g()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.f77700b = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    public C10381c() {
        this(new a());
    }

    static boolean d(String str) {
        C10381c cVar = new C10381c();
        synchronized (f77695c) {
            try {
                if (cVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void e(String str) {
        String b10 = r.b("android-keystore://", str);
        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        instance.generateKey();
    }

    /* access modifiers changed from: private */
    public static boolean g() {
        return true;
    }

    private static void h() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 40.0d)));
        } catch (InterruptedException unused) {
        }
    }

    private static C10156a i(C10156a aVar) {
        byte[] c10 = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c10, aVar.b(aVar.a(c10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f77697a     // Catch:{ all -> 0x000e }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r2)
            return r1
        L_0x000e:
            r3 = move-exception
            goto L_0x0026
        L_0x0010:
            java.lang.String r0 = r2.f77697a     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0023
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x000e }
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch:{ all -> 0x000e }
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch:{ all -> 0x000e }
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            monitor-exit(r2)
            return r1
        L_0x0026:
            monitor-exit(r2)     // Catch:{ all -> 0x000e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.C10381c.a(java.lang.String):boolean");
    }

    public synchronized C10156a b(String str) {
        try {
            String str2 = this.f77697a;
            if (str2 != null) {
                if (!str2.equals(str)) {
                    throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.f77697a, str}));
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return i(new C10380b(r.b("android-keystore://", str), this.f77698b));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|(6:11|12|13|14|15|16)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        android.util.Log.w(f77696d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        h();
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r2.f77698b = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return r2.f77698b.containsAlias(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw new java.security.GeneralSecurityException(r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean f(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = Db.r.b(r0, r3)     // Catch:{ all -> 0x000f }
            java.security.KeyStore r0 = r2.f77698b     // Catch:{ NullPointerException -> 0x0011 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x0011 }
            monitor-exit(r2)
            return r3
        L_0x000f:
            r3 = move-exception
            goto L_0x0036
        L_0x0011:
            java.lang.String r0 = f77696d     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x000f }
            h()     // Catch:{ IOException -> 0x002f }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002f }
            r2.f77698b = r0     // Catch:{ IOException -> 0x002f }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002f }
            java.security.KeyStore r0 = r2.f77698b     // Catch:{ all -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x002f:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x000f }
            r0.<init>(r3)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.C10381c.f(java.lang.String):boolean");
    }

    private C10381c(a aVar) {
        this.f77697a = aVar.f77699a;
        this.f77698b = aVar.f77700b;
    }
}
