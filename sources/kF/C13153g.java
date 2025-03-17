package KF;

import MF.C13208b;
import MF.C13209c;
import MF.C13210d;
import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import com.sugarcube.app.base.data.database.Converters;
import com.sugarcube.app.base.upload.UploadFileDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: KF.g  reason: case insensitive filesystem */
public final class C13153g implements UploadFileDao {

    /* renamed from: a  reason: collision with root package name */
    private final x f111719a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C13208b> f111720b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Converters f111721c = new Converters();

    /* renamed from: d  reason: collision with root package name */
    private final H f111722d;

    /* renamed from: e  reason: collision with root package name */
    private final H f111723e;

    /* renamed from: f  reason: collision with root package name */
    private final H f111724f;

    /* renamed from: g  reason: collision with root package name */
    private final H f111725g;

    /* renamed from: h  reason: collision with root package name */
    private final H f111726h;

    /* renamed from: KF.g$a */
    class a extends C7014k<C13208b> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13208b bVar) {
            kVar.H(1, bVar.e());
            kVar.H(2, bVar.d());
            kVar.H(3, C13153g.this.d(bVar.f()));
            kVar.H(4, C13153g.this.f(bVar.h()));
            String fromUuid = C13153g.this.f111721c.fromUuid(bVar.a());
            if (fromUuid == null) {
                kVar.I2(5);
            } else {
                kVar.H(5, fromUuid);
            }
            kVar.H(6, bVar.g());
            kVar.H(7, bVar.c());
            if (bVar.b() == null) {
                kVar.I2(8);
            } else {
                kVar.H(8, bVar.b());
            }
            if (bVar.j() == null) {
                kVar.I2(9);
            } else {
                kVar.H(9, bVar.j());
            }
            kVar.i2(10, (long) bVar.i());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR ABORT INTO `UploadFileDBO` (`localPath`,`fileName`,`localState`,`remoteState`,`captureUUID`,`remotePath`,`contentType`,`contentMd5`,`uploadUrl`,`uploadAttempts`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: KF.g$b */
    class b extends H {
        b(C13153g gVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadFileDBO SET uploadUrl = ? WHERE localPath = ?";
        }
    }

    /* renamed from: KF.g$c */
    class c extends H {
        c(C13153g gVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadFileDBO SET localState = ? WHERE localPath = ?";
        }
    }

    /* renamed from: KF.g$d */
    class d extends H {
        d(C13153g gVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadFileDBO SET remoteState = ? WHERE localPath = ?";
        }
    }

    /* renamed from: KF.g$e */
    class e extends H {
        e(C13153g gVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadFileDBO SET uploadAttempts = ? WHERE localPath = ?";
        }
    }

    /* renamed from: KF.g$f */
    class f extends H {
        f(C13153g gVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM UploadFileDBO WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.g$g  reason: collision with other inner class name */
    static /* synthetic */ class C2726g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f111728a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f111729b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                MF.d[] r0 = MF.C13210d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f111729b = r0
                r1 = 1
                MF.d r2 = MF.C13210d.NotCompleted     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f111729b     // Catch:{ NoSuchFieldError -> 0x001d }
                MF.d r3 = MF.C13210d.Completed     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                MF.c[] r2 = MF.C13209c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f111728a = r2
                MF.c r3 = MF.C13209c.NotUploaded     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f111728a     // Catch:{ NoSuchFieldError -> 0x0038 }
                MF.c r2 = MF.C13209c.Uploading     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f111728a     // Catch:{ NoSuchFieldError -> 0x0043 }
                MF.c r1 = MF.C13209c.Uploaded     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f111728a     // Catch:{ NoSuchFieldError -> 0x004e }
                MF.c r1 = MF.C13209c.UploadedAndNotified     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: KF.C13153g.C2726g.<clinit>():void");
        }
    }

    public C13153g(x xVar) {
        this.f111719a = xVar;
        this.f111720b = new a(xVar);
        this.f111722d = new b(this, xVar);
        this.f111723e = new c(this, xVar);
        this.f111724f = new d(this, xVar);
        this.f111725g = new e(this, xVar);
        this.f111726h = new f(this, xVar);
    }

    /* access modifiers changed from: private */
    public String d(C13209c cVar) {
        int i10 = C2726g.f111728a[cVar.ordinal()];
        if (i10 == 1) {
            return "NotUploaded";
        }
        if (i10 == 2) {
            return "Uploading";
        }
        if (i10 == 3) {
            return "Uploaded";
        }
        if (i10 == 4) {
            return "UploadedAndNotified";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + cVar);
    }

    private C13209c e(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1814108689:
                if (str.equals("UploadedAndNotified")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1051894239:
                if (str.equals("Uploading")) {
                    c10 = 1;
                    break;
                }
                break;
            case -644099533:
                if (str.equals("NotUploaded")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1628635776:
                if (str.equals("Uploaded")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return C13209c.UploadedAndNotified;
            case 1:
                return C13209c.Uploading;
            case 2:
                return C13209c.NotUploaded;
            case 3:
                return C13209c.Uploaded;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    /* access modifiers changed from: private */
    public String f(C13210d dVar) {
        int i10 = C2726g.f111729b[dVar.ordinal()];
        if (i10 == 1) {
            return "NotCompleted";
        }
        if (i10 == 2) {
            return "Completed";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + dVar);
    }

    private C13210d g(String str) {
        str.hashCode();
        if (str.equals("NotCompleted")) {
            return C13210d.NotCompleted;
        }
        if (str.equals("Completed")) {
            return C13210d.Completed;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public void delete(UUID uuid) {
        this.f111719a.assertNotSuspendingTransaction();
        k acquire = this.f111726h.acquire();
        String fromUuid = this.f111721c.fromUuid(uuid);
        if (fromUuid == null) {
            acquire.I2(1);
        } else {
            acquire.H(1, fromUuid);
        }
        try {
            this.f111719a.beginTransaction();
            acquire.b0();
            this.f111719a.setTransactionSuccessful();
            this.f111719a.endTransaction();
            this.f111726h.release(acquire);
        } catch (Throwable th2) {
            this.f111726h.release(acquire);
            throw th2;
        }
    }

    public boolean exists(String str) {
        Cursor e10;
        boolean z10 = true;
        B e11 = B.e("SELECT EXISTS(SELECT * FROM UploadFileDBO WHERE localPath = ?)", 1);
        e11.H(1, str);
        this.f111719a.assertNotSuspendingTransaction();
        this.f111719a.beginTransaction();
        try {
            boolean z11 = false;
            e10 = O4.b.e(this.f111719a, e11, false, (CancellationSignal) null);
            if (e10.moveToFirst()) {
                if (e10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            this.f111719a.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.f111719a.endTransaction();
            return z11;
        } catch (Throwable th2) {
            this.f111719a.endTransaction();
            throw th2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: MF.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: MF.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: MF.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: MF.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: MF.b} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MF.C13208b get(java.lang.String r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            java.lang.String r2 = "SELECT * FROM UploadFileDBO WHERE localPath = ?"
            r3 = 1
            androidx.room.B r2 = androidx.room.B.e(r2, r3)
            if (r0 != 0) goto L_0x0011
            r2.I2(r3)
            goto L_0x0014
        L_0x0011:
            r2.H(r3, r0)
        L_0x0014:
            androidx.room.x r0 = r1.f111719a
            r0.assertNotSuspendingTransaction()
            androidx.room.x r0 = r1.f111719a
            r3 = 0
            r4 = 0
            android.database.Cursor r3 = O4.b.e(r0, r2, r3, r4)
            java.lang.String r0 = "localPath"
            int r0 = O4.a.d(r3, r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "fileName"
            int r5 = O4.a.d(r3, r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = "localState"
            int r6 = O4.a.d(r3, r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "remoteState"
            int r7 = O4.a.d(r3, r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r8 = "captureUUID"
            int r8 = O4.a.d(r3, r8)     // Catch:{ all -> 0x00bf }
            java.lang.String r9 = "remotePath"
            int r9 = O4.a.d(r3, r9)     // Catch:{ all -> 0x00bf }
            java.lang.String r10 = "contentType"
            int r10 = O4.a.d(r3, r10)     // Catch:{ all -> 0x00bf }
            java.lang.String r11 = "contentMd5"
            int r11 = O4.a.d(r3, r11)     // Catch:{ all -> 0x00bf }
            java.lang.String r12 = "uploadUrl"
            int r12 = O4.a.d(r3, r12)     // Catch:{ all -> 0x00bf }
            java.lang.String r13 = "uploadAttempts"
            int r13 = O4.a.d(r3, r13)     // Catch:{ all -> 0x00bf }
            boolean r14 = r3.moveToFirst()     // Catch:{ all -> 0x00bf }
            if (r14 == 0) goto L_0x00c9
            java.lang.String r16 = r3.getString(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r17 = r3.getString(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r3.getString(r6)     // Catch:{ all -> 0x00bf }
            MF.c r18 = r1.e(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x00bf }
            MF.d r19 = r1.g(r0)     // Catch:{ all -> 0x00bf }
            boolean r0 = r3.isNull(r8)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0083
            r0 = r4
            goto L_0x0087
        L_0x0083:
            java.lang.String r0 = r3.getString(r8)     // Catch:{ all -> 0x00bf }
        L_0x0087:
            com.sugarcube.app.base.data.database.Converters r5 = r1.f111721c     // Catch:{ all -> 0x00bf }
            java.util.UUID r20 = r5.toUuid(r0)     // Catch:{ all -> 0x00bf }
            if (r20 == 0) goto L_0x00c1
            java.lang.String r21 = r3.getString(r9)     // Catch:{ all -> 0x00bf }
            java.lang.String r22 = r3.getString(r10)     // Catch:{ all -> 0x00bf }
            boolean r0 = r3.isNull(r11)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00a0
            r23 = r4
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r0 = r3.getString(r11)     // Catch:{ all -> 0x00bf }
            r23 = r0
        L_0x00a6:
            boolean r0 = r3.isNull(r12)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00af
        L_0x00ac:
            r24 = r4
            goto L_0x00b4
        L_0x00af:
            java.lang.String r4 = r3.getString(r12)     // Catch:{ all -> 0x00bf }
            goto L_0x00ac
        L_0x00b4:
            int r25 = r3.getInt(r13)     // Catch:{ all -> 0x00bf }
            MF.b r4 = new MF.b     // Catch:{ all -> 0x00bf }
            r15 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00bf }
            goto L_0x00c9
        L_0x00bf:
            r0 = move-exception
            goto L_0x00d0
        L_0x00c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = "Expected NON-NULL 'java.util.UUID', but it was NULL."
            r0.<init>(r4)     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00c9:
            r3.close()
            r2.h()
            return r4
        L_0x00d0:
            r3.close()
            r2.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: KF.C13153g.get(java.lang.String):MF.b");
    }

    public List<C13208b> getAllFiles() {
        B e10 = B.e("SELECT * FROM UploadFileDBO", 0);
        this.f111719a.assertNotSuspendingTransaction();
        String str = null;
        Cursor e11 = O4.b.e(this.f111719a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "localPath");
            int d11 = O4.a.d(e11, "fileName");
            int d12 = O4.a.d(e11, "localState");
            int d13 = O4.a.d(e11, "remoteState");
            int d14 = O4.a.d(e11, "captureUUID");
            int d15 = O4.a.d(e11, "remotePath");
            int d16 = O4.a.d(e11, "contentType");
            int d17 = O4.a.d(e11, "contentMd5");
            int d18 = O4.a.d(e11, "uploadUrl");
            int d19 = O4.a.d(e11, "uploadAttempts");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                String string = e11.getString(d10);
                String string2 = e11.getString(d11);
                C13209c e12 = e(e11.getString(d12));
                C13210d g10 = g(e11.getString(d13));
                UUID uuid = this.f111721c.toUuid(e11.isNull(d14) ? str : e11.getString(d14));
                if (uuid != null) {
                    arrayList.add(new C13208b(string, string2, e12, g10, uuid, e11.getString(d15), e11.getString(d16), e11.isNull(d17) ? null : e11.getString(d17), e11.isNull(d18) ? null : e11.getString(d18), e11.getInt(d19)));
                    str = null;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
            }
            e11.close();
            e10.h();
            return arrayList;
        } catch (Throwable th2) {
            e11.close();
            e10.h();
            throw th2;
        }
    }

    public List<C13208b> getCaptureFiles(UUID uuid) {
        B e10 = B.e("SELECT * FROM UploadFileDBO WHERE captureUUID = ?", 1);
        String fromUuid = this.f111721c.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        this.f111719a.assertNotSuspendingTransaction();
        String str = null;
        Cursor e11 = O4.b.e(this.f111719a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "localPath");
            int d11 = O4.a.d(e11, "fileName");
            int d12 = O4.a.d(e11, "localState");
            int d13 = O4.a.d(e11, "remoteState");
            int d14 = O4.a.d(e11, "captureUUID");
            int d15 = O4.a.d(e11, "remotePath");
            int d16 = O4.a.d(e11, "contentType");
            int d17 = O4.a.d(e11, "contentMd5");
            int d18 = O4.a.d(e11, "uploadUrl");
            int d19 = O4.a.d(e11, "uploadAttempts");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                String string = e11.getString(d10);
                String string2 = e11.getString(d11);
                C13209c e12 = e(e11.getString(d12));
                C13210d g10 = g(e11.getString(d13));
                UUID uuid2 = this.f111721c.toUuid(e11.isNull(d14) ? str : e11.getString(d14));
                if (uuid2 != null) {
                    arrayList.add(new C13208b(string, string2, e12, g10, uuid2, e11.getString(d15), e11.getString(d16), e11.isNull(d17) ? null : e11.getString(d17), e11.isNull(d18) ? null : e11.getString(d18), e11.getInt(d19)));
                    str = null;
                } else {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.UUID', but it was NULL.");
                }
            }
            e11.close();
            e10.h();
            return arrayList;
        } catch (Throwable th2) {
            e11.close();
            e10.h();
            throw th2;
        }
    }

    public void insert(C13208b bVar) {
        this.f111719a.assertNotSuspendingTransaction();
        this.f111719a.beginTransaction();
        try {
            this.f111720b.insert(bVar);
            this.f111719a.setTransactionSuccessful();
        } finally {
            this.f111719a.endTransaction();
        }
    }

    public void updateLocalState(String str, C13209c cVar) {
        this.f111719a.assertNotSuspendingTransaction();
        k acquire = this.f111723e.acquire();
        acquire.H(1, d(cVar));
        acquire.H(2, str);
        try {
            this.f111719a.beginTransaction();
            acquire.b0();
            this.f111719a.setTransactionSuccessful();
            this.f111719a.endTransaction();
            this.f111723e.release(acquire);
        } catch (Throwable th2) {
            this.f111723e.release(acquire);
            throw th2;
        }
    }

    public void updateRemoteState(String str, C13210d dVar) {
        this.f111719a.assertNotSuspendingTransaction();
        k acquire = this.f111724f.acquire();
        acquire.H(1, f(dVar));
        acquire.H(2, str);
        try {
            this.f111719a.beginTransaction();
            acquire.b0();
            this.f111719a.setTransactionSuccessful();
            this.f111719a.endTransaction();
            this.f111724f.release(acquire);
        } catch (Throwable th2) {
            this.f111724f.release(acquire);
            throw th2;
        }
    }

    public void updateUploadAttempts(String str, int i10) {
        this.f111719a.assertNotSuspendingTransaction();
        k acquire = this.f111725g.acquire();
        acquire.i2(1, (long) i10);
        acquire.H(2, str);
        try {
            this.f111719a.beginTransaction();
            acquire.b0();
            this.f111719a.setTransactionSuccessful();
            this.f111719a.endTransaction();
            this.f111725g.release(acquire);
        } catch (Throwable th2) {
            this.f111725g.release(acquire);
            throw th2;
        }
    }

    public void updateUploadUrl(String str, String str2) {
        this.f111719a.assertNotSuspendingTransaction();
        k acquire = this.f111722d.acquire();
        acquire.H(1, str2);
        acquire.H(2, str);
        try {
            this.f111719a.beginTransaction();
            acquire.b0();
            this.f111719a.setTransactionSuccessful();
            this.f111719a.endTransaction();
            this.f111722d.release(acquire);
        } catch (Throwable th2) {
            this.f111722d.release(acquire);
            throw th2;
        }
    }
}
