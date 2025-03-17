package vb;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: vb.b  reason: case insensitive filesystem */
public final class C10302b {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f77144a = Logger.getLogger(C10302b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f77145b = new AtomicBoolean(false);

    /* renamed from: vb.b$b  reason: collision with other inner class name */
    public enum C1424b {
        ALGORITHM_NOT_FIPS {
            public boolean a() {
                return !C10302b.c();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO {
            public boolean a() {
                return !C10302b.c() || C10302b.b();
            }
        };

        public abstract boolean a();
    }

    private C10302b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            f77144a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return C10301a.a() || f77145b.get();
    }
}
