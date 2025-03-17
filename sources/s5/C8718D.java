package s5;

import XH.t;
import android.os.Build;
import androidx.work.C7032a;
import androidx.work.C7056z;
import androidx.work.H;
import androidx.work.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Ls5/D;", "", "<init>", "()V", "Landroidx/work/Q$c;", "state", "", "k", "(Landroidx/work/Q$c;)I", "value", "g", "(I)Landroidx/work/Q$c;", "Landroidx/work/a;", "backoffPolicy", "a", "(Landroidx/work/a;)I", "d", "(I)Landroidx/work/a;", "Landroidx/work/z;", "networkType", "h", "(Landroidx/work/z;)I", "e", "(I)Landroidx/work/z;", "Landroidx/work/H;", "policy", "i", "(Landroidx/work/H;)I", "f", "(I)Landroidx/work/H;", "", "Landroidx/work/e$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", "bytes", "b", "([B)Ljava/util/Set;", "Lt5/z;", "l", "([B)Lt5/z;", "requestCompat", "c", "(Lt5/z;)[B", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.D  reason: case insensitive filesystem */
public final class C8718D {

    /* renamed from: a  reason: collision with root package name */
    public static final C8718D f55866a = new C8718D();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s5.D$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f55867a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f55868b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f55869c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f55870d;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0098 */
        static {
            /*
                androidx.work.Q$c[] r0 = androidx.work.Q.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.work.Q$c r2 = androidx.work.Q.c.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.work.Q$c r3 = androidx.work.Q.c.RUNNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                androidx.work.Q$c r4 = androidx.work.Q.c.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                androidx.work.Q$c r5 = androidx.work.Q.c.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                androidx.work.Q$c r6 = androidx.work.Q.c.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.work.Q$c r6 = androidx.work.Q.c.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f55867a = r0
                androidx.work.a[] r0 = androidx.work.C7032a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.a r6 = androidx.work.C7032a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                androidx.work.a r6 = androidx.work.C7032a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f55868b = r0
                androidx.work.z[] r0 = androidx.work.C7056z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.z r6 = androidx.work.C7056z.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                androidx.work.z r6 = androidx.work.C7056z.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                androidx.work.z r6 = androidx.work.C7056z.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                androidx.work.z r3 = androidx.work.C7056z.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                androidx.work.z r3 = androidx.work.C7056z.METERED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                f55869c = r0
                androidx.work.H[] r0 = androidx.work.H.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.H r3 = androidx.work.H.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                androidx.work.H r1 = androidx.work.H.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f55870d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s5.C8718D.a.<clinit>():void");
        }
    }

    private C8718D() {
    }

    public static final int a(C7032a aVar) {
        C17542s.j(aVar, "backoffPolicy");
        int i10 = a.f55868b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        jI.C17416c.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<androidx.work.C7036e.c> b(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0046 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0046 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x003c }
            r4 = 0
        L_0x001e:
            if (r4 >= r3) goto L_0x003e
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x003c }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x003c }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x003c }
            androidx.work.e$c r7 = new androidx.work.e$c     // Catch:{ all -> 0x003c }
            java.lang.String r8 = "uri"
            kotlin.jvm.internal.C17542s.i(r5, r8)     // Catch:{ all -> 0x003c }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x003c }
            r0.add(r7)     // Catch:{ all -> 0x003c }
            int r4 = r4 + 1
            goto L_0x001e
        L_0x003c:
            r3 = move-exception
            goto L_0x0048
        L_0x003e:
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x003c }
            jI.C17416c.a(r2, r9)     // Catch:{ IOException -> 0x0046 }
            goto L_0x0051
        L_0x0044:
            r9 = move-exception
            goto L_0x0057
        L_0x0046:
            r2 = move-exception
            goto L_0x004e
        L_0x0048:
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            jI.C17416c.a(r2, r3)     // Catch:{ IOException -> 0x0046 }
            throw r4     // Catch:{ IOException -> 0x0046 }
        L_0x004e:
            r2.printStackTrace()     // Catch:{ all -> 0x0044 }
        L_0x0051:
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0044 }
            jI.C17416c.a(r1, r9)
            return r0
        L_0x0057:
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            jI.C17416c.a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8718D.b(byte[]):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        jI.C17416c.a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] c(t5.C8831z r7) {
        /*
            java.lang.String r0 = "requestCompat"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 >= r1) goto L_0x000f
            byte[] r7 = new byte[r2]
            return r7
        L_0x000f:
            android.net.NetworkRequest r7 = r7.b()
            if (r7 != 0) goto L_0x0018
            byte[] r7 = new byte[r2]
            return r7
        L_0x0018:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x005e }
            r1.<init>(r0)     // Catch:{ all -> 0x005e }
            int[] r3 = t5.C8790A.b(r7)     // Catch:{ all -> 0x003a }
            int[] r7 = t5.C8790A.a(r7)     // Catch:{ all -> 0x003a }
            int r4 = r3.length     // Catch:{ all -> 0x003a }
            r1.writeInt(r4)     // Catch:{ all -> 0x003a }
            int r4 = r3.length     // Catch:{ all -> 0x003a }
            r5 = r2
        L_0x0030:
            if (r5 >= r4) goto L_0x003c
            r6 = r3[r5]     // Catch:{ all -> 0x003a }
            r1.writeInt(r6)     // Catch:{ all -> 0x003a }
            int r5 = r5 + 1
            goto L_0x0030
        L_0x003a:
            r7 = move-exception
            goto L_0x0060
        L_0x003c:
            int r3 = r7.length     // Catch:{ all -> 0x003a }
            r1.writeInt(r3)     // Catch:{ all -> 0x003a }
            int r3 = r7.length     // Catch:{ all -> 0x003a }
        L_0x0041:
            if (r2 >= r3) goto L_0x004b
            r4 = r7[r2]     // Catch:{ all -> 0x003a }
            r1.writeInt(r4)     // Catch:{ all -> 0x003a }
            int r2 = r2 + 1
            goto L_0x0041
        L_0x004b:
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x003a }
            r7 = 0
            jI.C17416c.a(r1, r7)     // Catch:{ all -> 0x005e }
            jI.C17416c.a(r0, r7)
            byte[] r7 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C17542s.i(r7, r0)
            return r7
        L_0x005e:
            r7 = move-exception
            goto L_0x0066
        L_0x0060:
            throw r7     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r2 = move-exception
            jI.C17416c.a(r1, r7)     // Catch:{ all -> 0x005e }
            throw r2     // Catch:{ all -> 0x005e }
        L_0x0066:
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            jI.C17416c.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8718D.c(t5.z):byte[]");
    }

    public static final C7032a d(int i10) {
        if (i10 == 0) {
            return C7032a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return C7032a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final C7056z e(int i10) {
        if (i10 == 0) {
            return C7056z.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return C7056z.CONNECTED;
        }
        if (i10 == 2) {
            return C7056z.UNMETERED;
        }
        if (i10 == 3) {
            return C7056z.NOT_ROAMING;
        }
        if (i10 == 4) {
            return C7056z.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return C7056z.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final H f(int i10) {
        if (i10 == 0) {
            return H.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return H.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final Q.c g(int i10) {
        if (i10 == 0) {
            return Q.c.ENQUEUED;
        }
        if (i10 == 1) {
            return Q.c.RUNNING;
        }
        if (i10 == 2) {
            return Q.c.SUCCEEDED;
        }
        if (i10 == 3) {
            return Q.c.FAILED;
        }
        if (i10 == 4) {
            return Q.c.BLOCKED;
        }
        if (i10 == 5) {
            return Q.c.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int h(C7056z zVar) {
        C17542s.j(zVar, "networkType");
        int i10 = a.f55869c[zVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 == 4) {
                return 3;
            }
            if (i10 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && zVar == C7056z.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + zVar + " to int");
            }
        }
        return i11;
    }

    public static final int i(H h10) {
        C17542s.j(h10, "policy");
        int i10 = a.f55870d[h10.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        jI.C17416c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] j(java.util.Set<androidx.work.C7036e.c> r4) {
        /*
            java.lang.String r0 = "triggers"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0058 }
            r1.<init>(r0)     // Catch:{ all -> 0x0058 }
            int r2 = r4.size()     // Catch:{ all -> 0x0043 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0043 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0043 }
            androidx.work.e$c r2 = (androidx.work.C7036e.c) r2     // Catch:{ all -> 0x0043 }
            android.net.Uri r3 = r2.a()     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0043 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0043 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0043 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0043 }
            goto L_0x0024
        L_0x0043:
            r4 = move-exception
            goto L_0x005a
        L_0x0045:
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0043 }
            r4 = 0
            jI.C17416c.a(r1, r4)     // Catch:{ all -> 0x0058 }
            jI.C17416c.a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C17542s.i(r4, r0)
            return r4
        L_0x0058:
            r4 = move-exception
            goto L_0x0060
        L_0x005a:
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r2 = move-exception
            jI.C17416c.a(r1, r4)     // Catch:{ all -> 0x0058 }
            throw r2     // Catch:{ all -> 0x0058 }
        L_0x0060:
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            jI.C17416c.a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8718D.j(java.util.Set):byte[]");
    }

    public static final int k(Q.c cVar) {
        C17542s.j(cVar, "state");
        switch (a.f55867a[cVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new t();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        jI.C17416c.a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t5.C8831z l(byte[] r7) {
        /*
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L_0x005b
            int r0 = r7.length
            if (r0 != 0) goto L_0x0010
            goto L_0x005b
        L_0x0010:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r7)
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ all -> 0x004d }
            r7.<init>(r0)     // Catch:{ all -> 0x004d }
            int r1 = r7.readInt()     // Catch:{ all -> 0x002d }
            int[] r3 = new int[r1]     // Catch:{ all -> 0x002d }
            r4 = 0
            r5 = r4
        L_0x0022:
            if (r5 >= r1) goto L_0x002f
            int r6 = r7.readInt()     // Catch:{ all -> 0x002d }
            r3[r5] = r6     // Catch:{ all -> 0x002d }
            int r5 = r5 + 1
            goto L_0x0022
        L_0x002d:
            r1 = move-exception
            goto L_0x004f
        L_0x002f:
            int r1 = r7.readInt()     // Catch:{ all -> 0x002d }
            int[] r5 = new int[r1]     // Catch:{ all -> 0x002d }
        L_0x0035:
            if (r4 >= r1) goto L_0x0040
            int r6 = r7.readInt()     // Catch:{ all -> 0x002d }
            r5[r4] = r6     // Catch:{ all -> 0x002d }
            int r4 = r4 + 1
            goto L_0x0035
        L_0x0040:
            t5.v r1 = t5.C8827v.f56626a     // Catch:{ all -> 0x002d }
            t5.z r1 = r1.b(r5, r3)     // Catch:{ all -> 0x002d }
            jI.C17416c.a(r7, r2)     // Catch:{ all -> 0x004d }
            jI.C17416c.a(r0, r2)
            return r1
        L_0x004d:
            r7 = move-exception
            goto L_0x0055
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            jI.C17416c.a(r7, r1)     // Catch:{ all -> 0x004d }
            throw r2     // Catch:{ all -> 0x004d }
        L_0x0055:
            throw r7     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            jI.C17416c.a(r0, r7)
            throw r1
        L_0x005b:
            t5.z r7 = new t5.z
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8718D.l(byte[]):t5.z");
    }
}
