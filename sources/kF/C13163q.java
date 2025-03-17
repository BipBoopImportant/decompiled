package KF;

import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import com.sugarcube.app.base.data.database.Converters;
import com.sugarcube.app.base.upload.UploadSetDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: KF.q  reason: case insensitive filesystem */
public final class C13163q implements UploadSetDao {

    /* renamed from: a  reason: collision with root package name */
    private final x f111733a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<MF.e> f111734b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Converters f111735c = new Converters();

    /* renamed from: d  reason: collision with root package name */
    private final H f111736d;

    /* renamed from: e  reason: collision with root package name */
    private final H f111737e;

    /* renamed from: f  reason: collision with root package name */
    private final H f111738f;

    /* renamed from: g  reason: collision with root package name */
    private final H f111739g;

    /* renamed from: h  reason: collision with root package name */
    private final H f111740h;

    /* renamed from: i  reason: collision with root package name */
    private final H f111741i;

    /* renamed from: KF.q$a */
    class a extends C7014k<MF.e> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, MF.e eVar) {
            String fromUuid = C13163q.this.f111735c.fromUuid(eVar.c());
            if (fromUuid == null) {
                kVar.I2(1);
            } else {
                kVar.H(1, fromUuid);
            }
            String fromUuid2 = C13163q.this.f111735c.fromUuid(eVar.i());
            if (fromUuid2 == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, fromUuid2);
            }
            if (eVar.j() == null) {
                kVar.I2(3);
            } else {
                kVar.i2(3, eVar.j().longValue());
            }
            kVar.H(4, C13163q.this.c(eVar.g()));
            String fromUuid3 = C13163q.this.f111735c.fromUuid(eVar.f());
            if (fromUuid3 == null) {
                kVar.I2(5);
            } else {
                kVar.H(5, fromUuid3);
            }
            kVar.i2(6, (long) eVar.h());
            kVar.H(7, eVar.d());
            kVar.H(8, eVar.e());
            kVar.H(9, eVar.b());
            kVar.H(10, eVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR ABORT INTO `UploadSetDBO` (`captureUUID`,`uploadUUID`,`uploadUUIDCreatedTs`,`state`,`sceneUUID`,`uploadAttempts`,`roomTitle`,`roomType`,`captureType`,`captureStrategy`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: KF.q$b */
    class b extends H {
        b(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadSetDBO SET uploadUUID = ? WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$c */
    class c extends H {
        c(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadSetDBO SET uploadUUIDCreatedTs = ? WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$d */
    class d extends H {
        d(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadSetDBO SET state = ? WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$e */
    class e extends H {
        e(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadSetDBO SET uploadAttempts = ? WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$f */
    class f extends H {
        f(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE UploadSetDBO SET sceneUUID = ? WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$g */
    class g extends H {
        g(C13163q qVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM UploadSetDBO WHERE captureUUID = ?";
        }
    }

    /* renamed from: KF.q$h */
    static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f111743a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                MF.f[] r0 = MF.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f111743a = r0
                MF.f r1 = MF.f.Scheduled     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f111743a     // Catch:{ NoSuchFieldError -> 0x001d }
                MF.f r1 = MF.f.Failed     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f111743a     // Catch:{ NoSuchFieldError -> 0x0028 }
                MF.f r1 = MF.f.Uploading     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f111743a     // Catch:{ NoSuchFieldError -> 0x0033 }
                MF.f r1 = MF.f.Uploaded     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f111743a     // Catch:{ NoSuchFieldError -> 0x003e }
                MF.f r1 = MF.f.UploadConfirmed     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: KF.C13163q.h.<clinit>():void");
        }
    }

    public C13163q(x xVar) {
        this.f111733a = xVar;
        this.f111734b = new a(xVar);
        this.f111736d = new b(this, xVar);
        this.f111737e = new c(this, xVar);
        this.f111738f = new d(this, xVar);
        this.f111739g = new e(this, xVar);
        this.f111740h = new f(this, xVar);
        this.f111741i = new g(this, xVar);
    }

    /* access modifiers changed from: private */
    public String c(MF.f fVar) {
        int i10 = h.f111743a[fVar.ordinal()];
        if (i10 == 1) {
            return "Scheduled";
        }
        if (i10 == 2) {
            return "Failed";
        }
        if (i10 == 3) {
            return "Uploading";
        }
        if (i10 == 4) {
            return "Uploaded";
        }
        if (i10 == 5) {
            return "UploadConfirmed";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + fVar);
    }

    private MF.f d(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1156825538:
                if (str.equals("UploadConfirmed")) {
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
            case 1628635776:
                if (str.equals("Uploaded")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1843257485:
                if (str.equals("Scheduled")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2096857181:
                if (str.equals("Failed")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return MF.f.UploadConfirmed;
            case 1:
                return MF.f.Uploading;
            case 2:
                return MF.f.Uploaded;
            case 3:
                return MF.f.Scheduled;
            case 4:
                return MF.f.Failed;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void delete(UUID uuid) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111741i.acquire();
        String fromUuid = this.f111735c.fromUuid(uuid);
        if (fromUuid == null) {
            acquire.I2(1);
        } else {
            acquire.H(1, fromUuid);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111741i.release(acquire);
        } catch (Throwable th2) {
            this.f111741i.release(acquire);
            throw th2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: MF.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r15v1, types: [MF.e] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MF.e get(java.util.UUID r27) {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = "SELECT * FROM UploadSetDBO WHERE captureUUID = ?"
            r2 = 1
            androidx.room.B r3 = androidx.room.B.e(r0, r2)
            com.sugarcube.app.base.data.database.Converters r0 = r1.f111735c
            r4 = r27
            java.lang.String r0 = r0.fromUuid(r4)
            if (r0 != 0) goto L_0x0017
            r3.I2(r2)
            goto L_0x001a
        L_0x0017:
            r3.H(r2, r0)
        L_0x001a:
            androidx.room.x r0 = r1.f111733a
            r0.assertNotSuspendingTransaction()
            androidx.room.x r0 = r1.f111733a
            r2 = 0
            r4 = 0
            android.database.Cursor r2 = O4.b.e(r0, r3, r2, r4)
            java.lang.String r0 = "captureUUID"
            int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = "uploadUUID"
            int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x00d6 }
            java.lang.String r6 = "uploadUUIDCreatedTs"
            int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = "state"
            int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r8 = "sceneUUID"
            int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x00d6 }
            java.lang.String r9 = "uploadAttempts"
            int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x00d6 }
            java.lang.String r10 = "roomTitle"
            int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x00d6 }
            java.lang.String r11 = "roomType"
            int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x00d6 }
            java.lang.String r12 = "captureType"
            int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x00d6 }
            java.lang.String r13 = "captureStrategy"
            int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x00d6 }
            boolean r14 = r2.moveToFirst()     // Catch:{ all -> 0x00d6 }
            if (r14 == 0) goto L_0x00e0
            boolean r14 = r2.isNull(r0)     // Catch:{ all -> 0x00d6 }
            if (r14 == 0) goto L_0x0071
            r0 = r4
            goto L_0x0075
        L_0x0071:
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x00d6 }
        L_0x0075:
            com.sugarcube.app.base.data.database.Converters r14 = r1.f111735c     // Catch:{ all -> 0x00d6 }
            java.util.UUID r16 = r14.toUuid(r0)     // Catch:{ all -> 0x00d6 }
            if (r16 == 0) goto L_0x00d8
            boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0085
            r0 = r4
            goto L_0x0089
        L_0x0085:
            java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x00d6 }
        L_0x0089:
            com.sugarcube.app.base.data.database.Converters r5 = r1.f111735c     // Catch:{ all -> 0x00d6 }
            java.util.UUID r17 = r5.toUuid(r0)     // Catch:{ all -> 0x00d6 }
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x0098
            r18 = r4
            goto L_0x00a2
        L_0x0098:
            long r5 = r2.getLong(r6)     // Catch:{ all -> 0x00d6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00d6 }
            r18 = r0
        L_0x00a2:
            java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x00d6 }
            MF.f r19 = r1.d(r0)     // Catch:{ all -> 0x00d6 }
            boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00d6 }
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00d6 }
        L_0x00b5:
            com.sugarcube.app.base.data.database.Converters r0 = r1.f111735c     // Catch:{ all -> 0x00d6 }
            java.util.UUID r20 = r0.toUuid(r4)     // Catch:{ all -> 0x00d6 }
            int r21 = r2.getInt(r9)     // Catch:{ all -> 0x00d6 }
            java.lang.String r22 = r2.getString(r10)     // Catch:{ all -> 0x00d6 }
            java.lang.String r23 = r2.getString(r11)     // Catch:{ all -> 0x00d6 }
            java.lang.String r24 = r2.getString(r12)     // Catch:{ all -> 0x00d6 }
            java.lang.String r25 = r2.getString(r13)     // Catch:{ all -> 0x00d6 }
            MF.e r4 = new MF.e     // Catch:{ all -> 0x00d6 }
            r15 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x00d6 }
            goto L_0x00e0
        L_0x00d6:
            r0 = move-exception
            goto L_0x00e7
        L_0x00d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d6 }
            java.lang.String r4 = "Expected NON-NULL 'java.util.UUID', but it was NULL."
            r0.<init>(r4)     // Catch:{ all -> 0x00d6 }
            throw r0     // Catch:{ all -> 0x00d6 }
        L_0x00e0:
            r2.close()
            r3.h()
            return r4
        L_0x00e7:
            r2.close()
            r3.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: KF.C13163q.get(java.util.UUID):MF.e");
    }

    public List<MF.e> getAll() {
        B e10 = B.e("SELECT * FROM UploadSetDBO", 0);
        this.f111733a.assertNotSuspendingTransaction();
        String str = null;
        Cursor e11 = O4.b.e(this.f111733a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "captureUUID");
            int d11 = O4.a.d(e11, "uploadUUID");
            int d12 = O4.a.d(e11, "uploadUUIDCreatedTs");
            int d13 = O4.a.d(e11, "state");
            int d14 = O4.a.d(e11, "sceneUUID");
            int d15 = O4.a.d(e11, "uploadAttempts");
            int d16 = O4.a.d(e11, "roomTitle");
            int d17 = O4.a.d(e11, "roomType");
            int d18 = O4.a.d(e11, "captureType");
            int d19 = O4.a.d(e11, "captureStrategy");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                UUID uuid = this.f111735c.toUuid(e11.isNull(d10) ? str : e11.getString(d10));
                if (uuid != null) {
                    arrayList.add(new MF.e(uuid, this.f111735c.toUuid(e11.isNull(d11) ? null : e11.getString(d11)), e11.isNull(d12) ? null : Long.valueOf(e11.getLong(d12)), d(e11.getString(d13)), this.f111735c.toUuid(e11.isNull(d14) ? null : e11.getString(d14)), e11.getInt(d15), e11.getString(d16), e11.getString(d17), e11.getString(d18), e11.getString(d19)));
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

    public List<MF.e> getWithSceneUUID(UUID uuid) {
        B e10 = B.e("SELECT * FROM UploadSetDBO WHERE sceneUUID = ?", 1);
        String fromUuid = this.f111735c.fromUuid(uuid);
        if (fromUuid == null) {
            e10.I2(1);
        } else {
            e10.H(1, fromUuid);
        }
        this.f111733a.assertNotSuspendingTransaction();
        String str = null;
        Cursor e11 = O4.b.e(this.f111733a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "captureUUID");
            int d11 = O4.a.d(e11, "uploadUUID");
            int d12 = O4.a.d(e11, "uploadUUIDCreatedTs");
            int d13 = O4.a.d(e11, "state");
            int d14 = O4.a.d(e11, "sceneUUID");
            int d15 = O4.a.d(e11, "uploadAttempts");
            int d16 = O4.a.d(e11, "roomTitle");
            int d17 = O4.a.d(e11, "roomType");
            int d18 = O4.a.d(e11, "captureType");
            int d19 = O4.a.d(e11, "captureStrategy");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                UUID uuid2 = this.f111735c.toUuid(e11.isNull(d10) ? str : e11.getString(d10));
                if (uuid2 != null) {
                    arrayList.add(new MF.e(uuid2, this.f111735c.toUuid(e11.isNull(d11) ? null : e11.getString(d11)), e11.isNull(d12) ? null : Long.valueOf(e11.getLong(d12)), d(e11.getString(d13)), this.f111735c.toUuid(e11.isNull(d14) ? null : e11.getString(d14)), e11.getInt(d15), e11.getString(d16), e11.getString(d17), e11.getString(d18), e11.getString(d19)));
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

    public void insert(MF.e eVar) {
        this.f111733a.assertNotSuspendingTransaction();
        this.f111733a.beginTransaction();
        try {
            this.f111734b.insert(eVar);
            this.f111733a.setTransactionSuccessful();
        } finally {
            this.f111733a.endTransaction();
        }
    }

    public void updateCreatedTs(UUID uuid, long j10) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111737e.acquire();
        acquire.i2(1, j10);
        String fromUuid = this.f111735c.fromUuid(uuid);
        if (fromUuid == null) {
            acquire.I2(2);
        } else {
            acquire.H(2, fromUuid);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111737e.release(acquire);
        } catch (Throwable th2) {
            this.f111737e.release(acquire);
            throw th2;
        }
    }

    public void updateLocalState(UUID uuid, MF.f fVar) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111738f.acquire();
        acquire.H(1, c(fVar));
        String fromUuid = this.f111735c.fromUuid(uuid);
        if (fromUuid == null) {
            acquire.I2(2);
        } else {
            acquire.H(2, fromUuid);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111738f.release(acquire);
        } catch (Throwable th2) {
            this.f111738f.release(acquire);
            throw th2;
        }
    }

    public void updateSceneCreated(UUID uuid, UUID uuid2) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111740h.acquire();
        String fromUuid = this.f111735c.fromUuid(uuid2);
        if (fromUuid == null) {
            acquire.I2(1);
        } else {
            acquire.H(1, fromUuid);
        }
        String fromUuid2 = this.f111735c.fromUuid(uuid);
        if (fromUuid2 == null) {
            acquire.I2(2);
        } else {
            acquire.H(2, fromUuid2);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111740h.release(acquire);
        } catch (Throwable th2) {
            this.f111740h.release(acquire);
            throw th2;
        }
    }

    public void updateUploadAttempts(UUID uuid, int i10) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111739g.acquire();
        acquire.i2(1, (long) i10);
        String fromUuid = this.f111735c.fromUuid(uuid);
        if (fromUuid == null) {
            acquire.I2(2);
        } else {
            acquire.H(2, fromUuid);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111739g.release(acquire);
        } catch (Throwable th2) {
            this.f111739g.release(acquire);
            throw th2;
        }
    }

    public void updateUploadUUID(UUID uuid, UUID uuid2) {
        this.f111733a.assertNotSuspendingTransaction();
        k acquire = this.f111736d.acquire();
        String fromUuid = this.f111735c.fromUuid(uuid2);
        if (fromUuid == null) {
            acquire.I2(1);
        } else {
            acquire.H(1, fromUuid);
        }
        String fromUuid2 = this.f111735c.fromUuid(uuid);
        if (fromUuid2 == null) {
            acquire.I2(2);
        } else {
            acquire.H(2, fromUuid2);
        }
        try {
            this.f111733a.beginTransaction();
            acquire.b0();
            this.f111733a.setTransactionSuccessful();
            this.f111733a.endTransaction();
            this.f111736d.release(acquire);
        } catch (Throwable th2) {
            this.f111736d.release(acquire);
            throw th2;
        }
    }
}
