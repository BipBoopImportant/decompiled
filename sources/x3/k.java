package x3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kb.C9970y;
import kb.e0;
import t3.C5950a;
import t3.C5951b;
import t3.N;
import v3.d;

class k {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, j> f31923a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<String> f31924b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f31925c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseBooleanArray f31926d;

    /* renamed from: e  reason: collision with root package name */
    private c f31927e;

    /* renamed from: f  reason: collision with root package name */
    private c f31928f;

    private static final class a implements c {

        /* renamed from: e  reason: collision with root package name */
        private static final String[] f31929e = {"id", "key", "metadata"};

        /* renamed from: a  reason: collision with root package name */
        private final v3.b f31930a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<j> f31931b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private String f31932c;

        /* renamed from: d  reason: collision with root package name */
        private String f31933d;

        public a(v3.b bVar) {
            this.f31930a = bVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, j jVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.r(jVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(jVar.f31916a));
            contentValues.put("key", jVar.f31917b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C5950a.e(this.f31933d), (String) null, contentValues);
        }

        private static void j(v3.b bVar, String str) {
            SQLiteDatabase writableDatabase;
            try {
                String n10 = n(str);
                writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                d.c(writableDatabase, 1, str);
                l(writableDatabase, n10);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new v3.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }

        private void k(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) C5950a.e(this.f31933d), "id = ?", new String[]{Integer.toString(i10)});
        }

        private static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor m() {
            return this.f31930a.getReadableDatabase().query((String) C5950a.e(this.f31933d), f31929e, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        }

        private static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void o(SQLiteDatabase sQLiteDatabase) {
            d.d(sQLiteDatabase, 1, (String) C5950a.e(this.f31932c), 1);
            l(sQLiteDatabase, (String) C5950a.e(this.f31933d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f31933d + " " + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        public void a(j jVar) {
            this.f31931b.put(jVar.f31916a, jVar);
        }

        public boolean b() {
            try {
                return d.b(this.f31930a.getReadableDatabase(), 1, (String) C5950a.e(this.f31932c)) != -1;
            } catch (SQLException e10) {
                throw new v3.a(e10);
            }
        }

        public void c(HashMap<String, j> hashMap) {
            SQLiteDatabase writableDatabase;
            if (this.f31931b.size() != 0) {
                try {
                    writableDatabase = this.f31930a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    for (int i10 = 0; i10 < this.f31931b.size(); i10++) {
                        j valueAt = this.f31931b.valueAt(i10);
                        if (valueAt == null) {
                            k(writableDatabase, this.f31931b.keyAt(i10));
                        } else {
                            i(writableDatabase, valueAt);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f31931b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e10) {
                    throw new v3.a(e10);
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        }

        public void d(long j10) {
            String hexString = Long.toHexString(j10);
            this.f31932c = hexString;
            this.f31933d = n(hexString);
        }

        public void e(HashMap<String, j> hashMap) {
            SQLiteDatabase writableDatabase;
            try {
                writableDatabase = this.f31930a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                o(writableDatabase);
                for (j i10 : hashMap.values()) {
                    i(writableDatabase, i10);
                }
                writableDatabase.setTransactionSuccessful();
                this.f31931b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new v3.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }

        public void f(j jVar, boolean z10) {
            if (z10) {
                this.f31931b.delete(jVar.f31916a);
            } else {
                this.f31931b.put(jVar.f31916a, (Object) null);
            }
        }

        public void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) {
            Cursor m10;
            SQLiteDatabase writableDatabase;
            C5950a.g(this.f31931b.size() == 0);
            try {
                if (d.b(this.f31930a.getReadableDatabase(), 1, (String) C5950a.e(this.f31932c)) != 1) {
                    writableDatabase = this.f31930a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    o(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                m10 = m();
                while (m10.moveToNext()) {
                    j jVar = new j(m10.getInt(0), (String) C5950a.e(m10.getString(1)), k.o(new DataInputStream(new ByteArrayInputStream(m10.getBlob(2)))));
                    hashMap.put(jVar.f31917b, jVar);
                    sparseArray.put(jVar.f31916a, jVar.f31917b);
                }
                m10.close();
                return;
            } catch (SQLiteException e10) {
                hashMap.clear();
                sparseArray.clear();
                throw new v3.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
            throw th;
        }

        public void h() {
            j(this.f31930a, (String) C5950a.e(this.f31932c));
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f31934a;

        /* renamed from: b  reason: collision with root package name */
        private final Cipher f31935b;

        /* renamed from: c  reason: collision with root package name */
        private final SecretKeySpec f31936c;

        /* renamed from: d  reason: collision with root package name */
        private final SecureRandom f31937d;

        /* renamed from: e  reason: collision with root package name */
        private final C5951b f31938e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31939f;

        /* renamed from: g  reason: collision with root package name */
        private q f31940g;

        public b(File file, byte[] bArr, boolean z10) {
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            boolean z11 = false;
            C5950a.g(bArr != null || !z10);
            SecureRandom secureRandom = null;
            if (bArr != null) {
                C5950a.a(bArr.length == 16 ? true : z11);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                C5950a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f31934a = z10;
            this.f31935b = cipher;
            this.f31936c = secretKeySpec;
            this.f31937d = z10 ? new SecureRandom() : secureRandom;
            this.f31938e = new C5951b(file);
        }

        private int i(j jVar, int i10) {
            int i11;
            int hashCode;
            int hashCode2 = (jVar.f31916a * 31) + jVar.f31917b.hashCode();
            if (i10 < 2) {
                long c10 = l.c(jVar.c());
                i11 = hashCode2 * 31;
                hashCode = (int) (c10 ^ (c10 >>> 32));
            } else {
                i11 = hashCode2 * 31;
                hashCode = jVar.c().hashCode();
            }
            return i11 + hashCode;
        }

        private j j(int i10, DataInputStream dataInputStream) {
            n nVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i10 < 2) {
                long readLong = dataInputStream.readLong();
                m mVar = new m();
                m.g(mVar, readLong);
                nVar = n.f31943c.g(mVar);
            } else {
                nVar = k.o(dataInputStream);
            }
            return new j(readInt, readUTF, nVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean k(java.util.HashMap<java.lang.String, x3.j> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
                r10 = this;
                t3.b r0 = r10.f31938e
                boolean r0 = r0.c()
                r1 = 1
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 0
                r2 = 0
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                t3.b r4 = r10.f31938e     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                java.io.InputStream r4 = r4.d()     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                r4.<init>(r3)     // Catch:{ IOException -> 0x00b7, all -> 0x00b0 }
                int r2 = r4.readInt()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                if (r2 < 0) goto L_0x00ac
                r5 = 2
                if (r2 <= r5) goto L_0x0027
                goto L_0x00ac
            L_0x0027:
                int r6 = r4.readInt()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r6 = r6 & r1
                if (r6 == 0) goto L_0x006b
                javax.crypto.Cipher r6 = r10.f31935b     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                if (r6 != 0) goto L_0x0036
                t3.N.m(r4)
                return r0
            L_0x0036:
                r6 = 16
                byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r4.readFully(r6)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r7.<init>(r6)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                javax.crypto.Cipher r6 = r10.f31935b     // Catch:{ InvalidKeyException -> 0x0064, InvalidAlgorithmParameterException -> 0x0062 }
                javax.crypto.spec.SecretKeySpec r8 = r10.f31936c     // Catch:{ InvalidKeyException -> 0x0064, InvalidAlgorithmParameterException -> 0x0062 }
                java.lang.Object r8 = t3.N.i(r8)     // Catch:{ InvalidKeyException -> 0x0064, InvalidAlgorithmParameterException -> 0x0062 }
                java.security.Key r8 = (java.security.Key) r8     // Catch:{ InvalidKeyException -> 0x0064, InvalidAlgorithmParameterException -> 0x0062 }
                r6.init(r5, r8, r7)     // Catch:{ InvalidKeyException -> 0x0064, InvalidAlgorithmParameterException -> 0x0062 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                javax.crypto.Cipher r7 = r10.f31935b     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r6.<init>(r3, r7)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r5.<init>(r6)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r4 = r5
                goto L_0x0071
            L_0x005d:
                r11 = move-exception
                r2 = r4
                goto L_0x00b1
            L_0x0060:
                r2 = r4
                goto L_0x00b7
            L_0x0062:
                r11 = move-exception
                goto L_0x0065
            L_0x0064:
                r11 = move-exception
            L_0x0065:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r12.<init>(r11)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                throw r12     // Catch:{ IOException -> 0x0060, all -> 0x005d }
            L_0x006b:
                boolean r3 = r10.f31934a     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                if (r3 == 0) goto L_0x0071
                r10.f31939f = r1     // Catch:{ IOException -> 0x0060, all -> 0x005d }
            L_0x0071:
                int r3 = r4.readInt()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r5 = r0
                r6 = r5
            L_0x0077:
                if (r5 >= r3) goto L_0x0091
                x3.j r7 = r10.j(r2, r4)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                java.lang.String r8 = r7.f31917b     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r11.put(r8, r7)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                int r8 = r7.f31916a     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                java.lang.String r9 = r7.f31917b     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r12.put(r8, r9)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                int r7 = r10.i(r7, r2)     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                int r6 = r6 + r7
                int r5 = r5 + 1
                goto L_0x0077
            L_0x0091:
                int r11 = r4.readInt()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                int r12 = r4.read()     // Catch:{ IOException -> 0x0060, all -> 0x005d }
                r2 = -1
                if (r12 != r2) goto L_0x009e
                r12 = r1
                goto L_0x009f
            L_0x009e:
                r12 = r0
            L_0x009f:
                if (r11 != r6) goto L_0x00a8
                if (r12 != 0) goto L_0x00a4
                goto L_0x00a8
            L_0x00a4:
                t3.N.m(r4)
                return r1
            L_0x00a8:
                t3.N.m(r4)
                return r0
            L_0x00ac:
                t3.N.m(r4)
                return r0
            L_0x00b0:
                r11 = move-exception
            L_0x00b1:
                if (r2 == 0) goto L_0x00b6
                t3.N.m(r2)
            L_0x00b6:
                throw r11
            L_0x00b7:
                if (r2 == 0) goto L_0x00bc
                t3.N.m(r2)
            L_0x00bc:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.k.b.k(java.util.HashMap, android.util.SparseArray):boolean");
        }

        private void l(j jVar, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(jVar.f31916a);
            dataOutputStream.writeUTF(jVar.f31917b);
            k.r(jVar.c(), dataOutputStream);
        }

        private void m(HashMap<String, j> hashMap) {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream f10 = this.f31938e.f();
                q qVar = this.f31940g;
                if (qVar == null) {
                    this.f31940g = new q(f10);
                } else {
                    qVar.c(f10);
                }
                q qVar2 = this.f31940g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(qVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int i10 = 0;
                    dataOutputStream2.writeInt(this.f31934a ? 1 : 0);
                    if (this.f31934a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) N.i(this.f31937d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        ((Cipher) N.i(this.f31935b)).init(1, (Key) N.i(this.f31936c), new IvParameterSpec(bArr));
                        dataOutputStream2.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(qVar2, this.f31935b));
                    }
                    dataOutputStream2.writeInt(hashMap.size());
                    for (j next : hashMap.values()) {
                        l(next, dataOutputStream2);
                        i10 += i(next, 2);
                    }
                    dataOutputStream2.writeInt(i10);
                    this.f31938e.b(dataOutputStream2);
                    N.m((Closeable) null);
                } catch (InvalidKeyException e10) {
                    e = e10;
                    throw new IllegalStateException(e);
                } catch (InvalidAlgorithmParameterException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    N.m(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                N.m(dataOutputStream);
                throw th;
            }
        }

        public void a(j jVar) {
            this.f31939f = true;
        }

        public boolean b() {
            return this.f31938e.c();
        }

        public void c(HashMap<String, j> hashMap) {
            if (this.f31939f) {
                e(hashMap);
            }
        }

        public void d(long j10) {
        }

        public void e(HashMap<String, j> hashMap) {
            m(hashMap);
            this.f31939f = false;
        }

        public void f(j jVar, boolean z10) {
            this.f31939f = true;
        }

        public void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) {
            C5950a.g(!this.f31939f);
            if (!k(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f31938e.a();
            }
        }

        public void h() {
            this.f31938e.a();
        }
    }

    private interface c {
        void a(j jVar);

        boolean b();

        void c(HashMap<String, j> hashMap);

        void d(long j10);

        void e(HashMap<String, j> hashMap);

        void f(j jVar, boolean z10);

        void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray);

        void h();
    }

    public k(v3.b bVar, File file, byte[] bArr, boolean z10, boolean z11) {
        C5950a.g((bVar == null && file == null) ? false : true);
        this.f31923a = new HashMap<>();
        this.f31924b = new SparseArray<>();
        this.f31925c = new SparseBooleanArray();
        this.f31926d = new SparseBooleanArray();
        b bVar2 = null;
        a aVar = bVar != null ? new a(bVar) : null;
        bVar2 = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : bVar2;
        if (aVar == null || (bVar2 != null && z11)) {
            this.f31927e = (c) N.i(bVar2);
            this.f31928f = aVar;
            return;
        }
        this.f31927e = aVar;
        this.f31928f = bVar2;
    }

    private j c(String str) {
        int j10 = j(this.f31924b);
        j jVar = new j(j10, str);
        this.f31923a.put(str, jVar);
        this.f31924b.put(j10, str);
        this.f31926d.put(j10, true);
        this.f31927e.a(jVar);
        return jVar;
    }

    static int j(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean m(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* access modifiers changed from: private */
    public static n o(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = N.f29467f;
                int i11 = 0;
                while (i11 != readInt2) {
                    int i12 = i11 + min;
                    bArr = Arrays.copyOf(bArr, i12);
                    dataInputStream.readFully(bArr, i11, min);
                    min = Math.min(readInt2 - i12, 10485760);
                    i11 = i12;
                }
                hashMap.put(readUTF, bArr);
                i10++;
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new n(hashMap);
    }

    /* access modifiers changed from: private */
    public static void r(n nVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> h10 = nVar.h();
        dataOutputStream.writeInt(h10.size());
        for (Map.Entry next : h10) {
            dataOutputStream.writeUTF((String) next.getKey());
            byte[] bArr = (byte[]) next.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void d(String str, m mVar) {
        j k10 = k(str);
        if (k10.b(mVar)) {
            this.f31927e.a(k10);
        }
    }

    public int e(String str) {
        return k(str).f31916a;
    }

    public j f(String str) {
        return this.f31923a.get(str);
    }

    public Collection<j> g() {
        return Collections.unmodifiableCollection(this.f31923a.values());
    }

    public l h(String str) {
        j f10 = f(str);
        return f10 != null ? f10.c() : n.f31943c;
    }

    public String i(int i10) {
        return this.f31924b.get(i10);
    }

    public j k(String str) {
        j jVar = this.f31923a.get(str);
        return jVar == null ? c(str) : jVar;
    }

    public void l(long j10) {
        c cVar;
        this.f31927e.d(j10);
        c cVar2 = this.f31928f;
        if (cVar2 != null) {
            cVar2.d(j10);
        }
        if (this.f31927e.b() || (cVar = this.f31928f) == null || !cVar.b()) {
            this.f31927e.g(this.f31923a, this.f31924b);
        } else {
            this.f31928f.g(this.f31923a, this.f31924b);
            this.f31927e.e(this.f31923a);
        }
        c cVar3 = this.f31928f;
        if (cVar3 != null) {
            cVar3.h();
            this.f31928f = null;
        }
    }

    public void n(String str) {
        j jVar = this.f31923a.get(str);
        if (jVar != null && jVar.f() && jVar.h()) {
            this.f31923a.remove(str);
            int i10 = jVar.f31916a;
            boolean z10 = this.f31926d.get(i10);
            this.f31927e.f(jVar, z10);
            if (z10) {
                this.f31924b.remove(i10);
                this.f31926d.delete(i10);
                return;
            }
            this.f31924b.put(i10, (Object) null);
            this.f31925c.put(i10, true);
        }
    }

    public void p() {
        e0<String> q10 = C9970y.A(this.f31923a.keySet()).iterator();
        while (q10.hasNext()) {
            n(q10.next());
        }
    }

    public void q() {
        this.f31927e.c(this.f31923a);
        int size = this.f31925c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31924b.remove(this.f31925c.keyAt(i10));
        }
        this.f31925c.clear();
        this.f31926d.clear();
    }
}
