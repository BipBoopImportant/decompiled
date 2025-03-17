package oE;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pE.C14918c;

/* renamed from: oE.g  reason: case insensitive filesystem */
class C14884g {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Context, C14884g> f130060b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f130061c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f130062d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f130063e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f130064f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f130065g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final String f130066h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final String f130067i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String f130068j;

    /* renamed from: a  reason: collision with root package name */
    private final a f130069a;

    /* renamed from: oE.g$a */
    private static class a extends SQLiteOpenHelper {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final File f130070a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C14883f f130071b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f130072c;

        /* renamed from: oE.g$a$a  reason: collision with other inner class name */
        class C3204a implements FilenameFilter {
            C3204a() {
            }

            public boolean accept(File file, String str) {
                return str.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
            }
        }

        a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.f130070a = context.getDatabasePath(str);
            this.f130071b = C14883f.m(context);
            this.f130072c = context;
        }

        private void g(SQLiteDatabase sQLiteDatabase) {
            int i10;
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE ");
            b bVar = b.EVENTS;
            sb2.append(bVar.getName());
            sb2.append(" ADD COLUMN ");
            sb2.append("automatic_data");
            sb2.append(" INTEGER DEFAULT 0");
            sQLiteDatabase2.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ALTER TABLE ");
            b bVar2 = b.PEOPLE;
            sb3.append(bVar2.getName());
            sb3.append(" ADD COLUMN ");
            sb3.append("automatic_data");
            sb3.append(" INTEGER DEFAULT 0");
            sQLiteDatabase2.execSQL(sb3.toString());
            sQLiteDatabase2.execSQL("ALTER TABLE " + bVar.getName() + " ADD COLUMN " + "token" + " STRING NOT NULL DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + bVar2.getName() + " ADD COLUMN " + "token" + " STRING NOT NULL DEFAULT ''");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("SELECT * FROM ");
            sb4.append(bVar.getName());
            Cursor rawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    String string = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data") >= 0 ? rawQuery.getColumnIndex("data") : 1)).getJSONObject("properties").getString("token");
                    sQLiteDatabase2.execSQL("UPDATE " + b.EVENTS.getName() + " SET " + "token" + " = '" + string + "' WHERE _id = " + rawQuery.getInt(rawQuery.getColumnIndex("_id") >= 0 ? rawQuery.getColumnIndex("_id") : 0));
                } catch (JSONException unused) {
                    sQLiteDatabase2.delete(b.EVENTS.getName(), "_id = " + 0, (String[]) null);
                }
            }
            Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT * FROM " + b.PEOPLE.getName(), (String[]) null);
            while (rawQuery2.moveToNext()) {
                try {
                    String string2 = new JSONObject(rawQuery2.getString(rawQuery2.getColumnIndex("data") >= 0 ? rawQuery2.getColumnIndex("data") : 1)).getString("$token");
                    i10 = rawQuery2.getInt(rawQuery2.getColumnIndex("_id") >= 0 ? rawQuery2.getColumnIndex("_id") : 0);
                    try {
                        sQLiteDatabase2.execSQL("UPDATE " + b.PEOPLE.getName() + " SET " + "token" + " = '" + string2 + "' WHERE _id = " + i10);
                    } catch (JSONException unused2) {
                    }
                } catch (JSONException unused3) {
                    i10 = 0;
                    sQLiteDatabase2.delete(b.PEOPLE.getName(), "_id = " + i10, (String[]) null);
                }
            }
        }

        private void h(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C14884g.f130063e);
            sQLiteDatabase.execSQL(C14884g.f130067i);
        }

        private void i(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C14884g.f130064f);
            sQLiteDatabase.execSQL(C14884g.f130068j);
            File file = new File(this.f130072c.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String split : file.list(new C3204a())) {
                    SharedPreferences sharedPreferences = this.f130072c.getSharedPreferences(split.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", (String) null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert(b.ANONYMOUS_PEOPLE.getName(), (String) null, contentValues);
                                } catch (JSONException unused) {
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        } catch (Throwable th2) {
                            sQLiteDatabase.endTransaction();
                            throw th2;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("waiting_array");
                        edit.apply();
                    }
                }
            }
        }

        public boolean c() {
            if (this.f130070a.exists()) {
                return this.f130070a.length() > Math.max(this.f130070a.getUsableSpace(), (long) this.f130071b.o()) || this.f130070a.length() > ((long) this.f130071b.n());
            }
            return false;
        }

        public void f() {
            close();
            this.f130070a.delete();
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C14918c.i("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            sQLiteDatabase.execSQL(C14884g.f130061c);
            sQLiteDatabase.execSQL(C14884g.f130062d);
            sQLiteDatabase.execSQL(C14884g.f130063e);
            sQLiteDatabase.execSQL(C14884g.f130064f);
            sQLiteDatabase.execSQL(C14884g.f130065g);
            sQLiteDatabase.execSQL(C14884g.f130066h);
            sQLiteDatabase.execSQL(C14884g.f130067i);
            sQLiteDatabase.execSQL(C14884g.f130068j);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C14918c.i("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            if (i10 < 4 || i11 > 7) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b.EVENTS.getName());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b.PEOPLE.getName());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b.GROUPS.getName());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + b.ANONYMOUS_PEOPLE.getName());
                sQLiteDatabase.execSQL(C14884g.f130061c);
                sQLiteDatabase.execSQL(C14884g.f130062d);
                sQLiteDatabase.execSQL(C14884g.f130063e);
                sQLiteDatabase.execSQL(C14884g.f130064f);
                sQLiteDatabase.execSQL(C14884g.f130065g);
                sQLiteDatabase.execSQL(C14884g.f130066h);
                sQLiteDatabase.execSQL(C14884g.f130067i);
                sQLiteDatabase.execSQL(C14884g.f130068j);
                return;
            }
            if (i10 == 4) {
                g(sQLiteDatabase);
                h(sQLiteDatabase);
                i(sQLiteDatabase);
            }
            if (i10 == 5) {
                h(sQLiteDatabase);
                i(sQLiteDatabase);
            }
            if (i10 == 6) {
                i(sQLiteDatabase);
            }
        }
    }

    /* renamed from: oE.g$b */
    public enum b {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");
        
        private final String mTableName;

        private b(String str) {
            this.mTableName = str;
        }

        public String getName() {
            return this.mTableName;
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TABLE ");
        b bVar = b.EVENTS;
        sb2.append(bVar.getName());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb2.append("data");
        sb2.append(" STRING NOT NULL, ");
        sb2.append("created_at");
        sb2.append(" INTEGER NOT NULL, ");
        sb2.append("automatic_data");
        sb2.append(" INTEGER DEFAULT 0, ");
        sb2.append("token");
        sb2.append(" STRING NOT NULL DEFAULT '')");
        f130061c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CREATE TABLE ");
        b bVar2 = b.PEOPLE;
        sb3.append(bVar2.getName());
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb3.append("data");
        sb3.append(" STRING NOT NULL, ");
        sb3.append("created_at");
        sb3.append(" INTEGER NOT NULL, ");
        sb3.append("automatic_data");
        sb3.append(" INTEGER DEFAULT 0, ");
        sb3.append("token");
        sb3.append(" STRING NOT NULL DEFAULT '')");
        f130062d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CREATE TABLE ");
        b bVar3 = b.GROUPS;
        sb4.append(bVar3.getName());
        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb4.append("data");
        sb4.append(" STRING NOT NULL, ");
        sb4.append("created_at");
        sb4.append(" INTEGER NOT NULL, ");
        sb4.append("automatic_data");
        sb4.append(" INTEGER DEFAULT 0, ");
        sb4.append("token");
        sb4.append(" STRING NOT NULL DEFAULT '')");
        f130063e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CREATE TABLE ");
        b bVar4 = b.ANONYMOUS_PEOPLE;
        sb5.append(bVar4.getName());
        sb5.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb5.append("data");
        sb5.append(" STRING NOT NULL, ");
        sb5.append("created_at");
        sb5.append(" INTEGER NOT NULL, ");
        sb5.append("automatic_data");
        sb5.append(" INTEGER DEFAULT 0, ");
        sb5.append("token");
        sb5.append(" STRING NOT NULL DEFAULT '')");
        f130064f = sb5.toString();
        f130065g = "CREATE INDEX IF NOT EXISTS time_idx ON " + bVar.getName() + " (" + "created_at" + ");";
        f130066h = "CREATE INDEX IF NOT EXISTS time_idx ON " + bVar2.getName() + " (" + "created_at" + ");";
        f130067i = "CREATE INDEX IF NOT EXISTS time_idx ON " + bVar3.getName() + " (" + "created_at" + ");";
        f130068j = "CREATE INDEX IF NOT EXISTS time_idx ON " + bVar4.getName() + " (" + "created_at" + ");";
    }

    public C14884g(Context context) {
        this(context, "mixpanel");
    }

    private void m(b bVar, String str) {
        String name = bVar.getName();
        try {
            SQLiteDatabase writableDatabase = this.f130069a.getWritableDatabase();
            writableDatabase.delete(name, "automatic_data = 1 AND token = '" + str + "'", (String[]) null);
        } catch (SQLiteException e10) {
            C14918c.d("MixpanelAPI.Database", "Could not clean automatic Mixpanel records from " + name + ". Re-initializing database.", e10);
            this.f130069a.f();
        } catch (Throwable th2) {
            this.f130069a.close();
            throw th2;
        }
        this.f130069a.close();
    }

    public static C14884g s(Context context) {
        C14884g gVar;
        Map<Context, C14884g> map = f130060b;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (!map.containsKey(applicationContext)) {
                    gVar = new C14884g(applicationContext);
                    map.put(applicationContext, gVar);
                } else {
                    gVar = map.get(applicationContext);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return this.f130069a.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r6.f130069a.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        return -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099 A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(org.json.JSONObject r7, java.lang.String r8, oE.C14884g.b r9, boolean r10) {
        /*
            r6 = this;
            boolean r0 = r6.a()
            java.lang.String r1 = "MixpanelAPI.Database"
            if (r0 == 0) goto L_0x000f
            java.lang.String r7 = "There is not enough space left on the device or the data was over the maximum size limit so it was discarded"
            pE.C14918c.c(r1, r7)
            r7 = -2
            return r7
        L_0x000f:
            java.lang.String r9 = r9.getName()
            r0 = 0
            oE.g$a r2 = r6.f130069a     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r4 = "data"
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r3.put(r4, r7)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r7 = "created_at"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r3.put(r7, r4)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r7 = "automatic_data"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r3.put(r7, r10)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r7 = "token"
            r3.put(r7, r8)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r2.insert(r9, r0, r3)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r10 = "SELECT COUNT(*) FROM "
            r7.append(r10)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r7.append(r9)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r9 = " WHERE token='"
            r7.append(r9)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r8 = "'"
            r7.append(r8)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            java.lang.String r7 = r7.toString()     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            android.database.Cursor r7 = r2.rawQuery(r7, r0)     // Catch:{ SQLiteException -> 0x0080, OutOfMemoryError -> 0x0082 }
            r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0092, OutOfMemoryError -> 0x007c }
            r8 = 0
            int r8 = r7.getInt(r8)     // Catch:{ SQLiteException -> 0x0092, OutOfMemoryError -> 0x007c }
            r7.close()
            oE.g$a r7 = r6.f130069a
            r7.close()
            goto L_0x00a7
        L_0x0079:
            r8 = move-exception
            r0 = r7
            goto L_0x00a8
        L_0x007c:
            r0 = r7
            goto L_0x0082
        L_0x007e:
            r8 = move-exception
            goto L_0x00a8
        L_0x0080:
            r7 = r0
            goto L_0x0092
        L_0x0082:
            java.lang.String r7 = "Out of memory when adding Mixpanel data to table"
            pE.C14918c.c(r1, r7)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x008c
        L_0x0089:
            r0.close()
        L_0x008c:
            oE.g$a r7 = r6.f130069a
            r7.close()
            goto L_0x00a6
        L_0x0092:
            java.lang.String r8 = "Could not add Mixpanel data to table"
            pE.C14918c.c(r1, r8)     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x009d
            r7.close()     // Catch:{ all -> 0x0079 }
            goto L_0x009e
        L_0x009d:
            r0 = r7
        L_0x009e:
            oE.g$a r7 = r6.f130069a     // Catch:{ all -> 0x007e }
            r7.f()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x008c
            goto L_0x0089
        L_0x00a6:
            r8 = -1
        L_0x00a7:
            return r8
        L_0x00a8:
            if (r0 == 0) goto L_0x00ad
            r0.close()
        L_0x00ad:
            oE.g$a r7 = r6.f130069a
            r7.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14884g.j(org.json.JSONObject, java.lang.String, oE.g$b, boolean):int");
    }

    public void k(b bVar, String str) {
        String name = bVar.getName();
        try {
            SQLiteDatabase writableDatabase = this.f130069a.getWritableDatabase();
            writableDatabase.delete(name, "token = '" + str + "'", (String[]) null);
        } catch (SQLiteException e10) {
            C14918c.d("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e10);
            this.f130069a.f();
        } catch (Throwable th2) {
            this.f130069a.close();
            throw th2;
        }
        this.f130069a.close();
    }

    public synchronized void l(String str) {
        m(b.EVENTS, str);
        m(b.PEOPLE, str);
        m(b.GROUPS, str);
    }

    public void n(long j10, b bVar) {
        String name = bVar.getName();
        try {
            SQLiteDatabase writableDatabase = this.f130069a.getWritableDatabase();
            writableDatabase.delete(name, "created_at <= " + j10, (String[]) null);
        } catch (SQLiteException e10) {
            C14918c.d("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e10);
            this.f130069a.f();
        } catch (Throwable th2) {
            this.f130069a.close();
            throw th2;
        }
        this.f130069a.close();
    }

    public void o(String str, b bVar, String str2, boolean z10) {
        String name = bVar.getName();
        try {
            SQLiteDatabase writableDatabase = this.f130069a.getWritableDatabase();
            StringBuffer stringBuffer = new StringBuffer("_id <= " + str + " AND " + "token" + " = '" + str2 + "'");
            if (!z10) {
                stringBuffer.append(" AND automatic_data=0");
            }
            writableDatabase.delete(name, stringBuffer.toString(), (String[]) null);
        } catch (SQLiteException e10) {
            C14918c.d("MixpanelAPI.Database", "Could not clean sent Mixpanel records from " + name + ". Re-initializing database.", e10);
            this.f130069a.f();
        } catch (Exception e11) {
            C14918c.d("MixpanelAPI.Database", "Unknown exception. Could not clean sent Mixpanel records from " + name + ".Re-initializing database.", e11);
            this.f130069a.f();
        } catch (Throwable th2) {
            this.f130069a.close();
            throw th2;
        }
        this.f130069a.close();
    }

    public void p() {
        this.f130069a.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] q(oE.C14884g.b r16, java.lang.String r17, boolean r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            java.lang.String r2 = "data"
            java.lang.String r3 = "_id"
            java.lang.String r4 = "' "
            java.lang.String r5 = " = '"
            java.lang.String r6 = "token"
            java.lang.String r7 = " WHERE "
            java.lang.String r8 = r16.getName()
            oE.g$a r9 = r1.f130069a
            android.database.sqlite.SQLiteDatabase r9 = r9.getReadableDatabase()
            r10 = 0
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r13 = "SELECT * FROM "
            r12.append(r13)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r8)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r7)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r6)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r5)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.append(r4)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r12 = r12.toString()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r11.<init>(r12)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r14 = "SELECT COUNT(*) FROM "
            r13.append(r14)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r8)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r7)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r6)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r5)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r13.append(r4)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r0 = r13.toString()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r12.<init>(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            if (r18 != 0) goto L_0x007b
            java.lang.String r0 = "AND automatic_data = 0 "
            r11.append(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r0 = " AND automatic_data = 0"
            r12.append(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r0 = move-exception
            r5 = r10
            goto L_0x0152
        L_0x0075:
            r0 = move-exception
            r4 = r10
            r5 = r4
        L_0x0078:
            r6 = r5
            goto L_0x011c
        L_0x007b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r4 = "ORDER BY created_at ASC LIMIT "
            r0.append(r4)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            oE.g$a r4 = r1.f130069a     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            oE.f r4 = r4.f130071b     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            int r4 = r4.i()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r0.append(r4)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            r11.append(r0)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r0 = r11.toString()     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            android.database.Cursor r4 = r9.rawQuery(r0, r10)     // Catch:{ SQLiteException -> 0x0075, all -> 0x0071 }
            java.lang.String r0 = r12.toString()     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            android.database.Cursor r5 = r9.rawQuery(r0, r10)     // Catch:{ SQLiteException -> 0x0118, all -> 0x0115 }
            r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0112 }
            r0 = 0
            int r6 = r5.getInt(r0)     // Catch:{ SQLiteException -> 0x0112 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0112 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ SQLiteException -> 0x00da }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00da }
            r9 = r10
        L_0x00bf:
            boolean r11 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00da }
            if (r11 == 0) goto L_0x00fa
            boolean r11 = r4.isLast()     // Catch:{ SQLiteException -> 0x00da }
            if (r11 == 0) goto L_0x00e1
            int r9 = r4.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00da }
            if (r9 < 0) goto L_0x00dc
            int r9 = r4.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x00da }
            goto L_0x00dd
        L_0x00d6:
            r0 = move-exception
        L_0x00d7:
            r10 = r4
            goto L_0x0152
        L_0x00da:
            r0 = move-exception
            goto L_0x011c
        L_0x00dc:
            r9 = r0
        L_0x00dd:
            java.lang.String r9 = r4.getString(r9)     // Catch:{ SQLiteException -> 0x00da }
        L_0x00e1:
            int r11 = r4.getColumnIndex(r2)     // Catch:{ JSONException -> 0x00bf }
            if (r11 < 0) goto L_0x00ec
            int r11 = r4.getColumnIndex(r2)     // Catch:{ JSONException -> 0x00bf }
            goto L_0x00ed
        L_0x00ec:
            r11 = 1
        L_0x00ed:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00bf }
            java.lang.String r11 = r4.getString(r11)     // Catch:{ JSONException -> 0x00bf }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x00bf }
            r7.put(r12)     // Catch:{ JSONException -> 0x00bf }
            goto L_0x00bf
        L_0x00fa:
            int r0 = r7.length()     // Catch:{ SQLiteException -> 0x00da }
            if (r0 <= 0) goto L_0x0105
            java.lang.String r0 = r7.toString()     // Catch:{ SQLiteException -> 0x00da }
            goto L_0x0106
        L_0x0105:
            r0 = r10
        L_0x0106:
            oE.g$a r2 = r1.f130069a
            r2.close()
            r4.close()
            r5.close()
            goto L_0x0148
        L_0x0112:
            r0 = move-exception
            r6 = r10
            goto L_0x011c
        L_0x0115:
            r0 = move-exception
            r5 = r10
            goto L_0x00d7
        L_0x0118:
            r0 = move-exception
            r5 = r10
            goto L_0x0078
        L_0x011c:
            java.lang.String r2 = "MixpanelAPI.Database"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d6 }
            r3.<init>()     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = "Could not pull records for Mixpanel out of database "
            r3.append(r7)     // Catch:{ all -> 0x00d6 }
            r3.append(r8)     // Catch:{ all -> 0x00d6 }
            java.lang.String r7 = ". Waiting to send."
            r3.append(r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d6 }
            pE.C14918c.d(r2, r3, r0)     // Catch:{ all -> 0x00d6 }
            oE.g$a r0 = r1.f130069a
            r0.close()
            if (r4 == 0) goto L_0x0141
            r4.close()
        L_0x0141:
            if (r5 == 0) goto L_0x0146
            r5.close()
        L_0x0146:
            r0 = r10
            r9 = r0
        L_0x0148:
            if (r9 == 0) goto L_0x0151
            if (r0 == 0) goto L_0x0151
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r6}
            return r0
        L_0x0151:
            return r10
        L_0x0152:
            oE.g$a r2 = r1.f130069a
            r2.close()
            if (r10 == 0) goto L_0x015c
            r10.close()
        L_0x015c:
            if (r5 == 0) goto L_0x0161
            r5.close()
        L_0x0161:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14884g.q(oE.g$b, java.lang.String, boolean):java.lang.String[]");
    }

    public File r() {
        return this.f130069a.f130070a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:12|13|(1:15)(1:18)|19|(1:21)(1:22)|23|(1:25)(1:26)|27|(1:29)(1:30)|31|(1:33)(1:34)|35|36|67|66|10|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063 A[SYNTHETIC, Splitter:B:12:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int t(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "_id"
            java.lang.String r1 = "data"
            java.lang.String r2 = "automatic_data"
            java.lang.String r3 = "created_at"
            java.lang.String r4 = "token"
            boolean r5 = r13.a()
            java.lang.String r6 = "MixpanelAPI.Database"
            if (r5 == 0) goto L_0x0019
            java.lang.String r14 = "There is not enough space left on the device or the data was over the maximum size limit so it was discarded"
            pE.C14918c.c(r6, r14)
            r14 = -2
            return r14
        L_0x0019:
            r5 = 0
            r7 = -1
            oE.g$a r8 = r13.f130069a     // Catch:{ SQLiteException -> 0x011e }
            android.database.sqlite.SQLiteDatabase r8 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.StringBuffer r9 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x011e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x011e }
            r10.<init>()     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r11 = "SELECT * FROM "
            r10.append(r11)     // Catch:{ SQLiteException -> 0x011e }
            oE.g$b r11 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r11 = r11.getName()     // Catch:{ SQLiteException -> 0x011e }
            r10.append(r11)     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r11 = " WHERE "
            r10.append(r11)     // Catch:{ SQLiteException -> 0x011e }
            r10.append(r4)     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r11 = " = '"
            r10.append(r11)     // Catch:{ SQLiteException -> 0x011e }
            r10.append(r14)     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r14 = "'"
            r10.append(r14)     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r14 = r10.toString()     // Catch:{ SQLiteException -> 0x011e }
            r9.<init>(r14)     // Catch:{ SQLiteException -> 0x011e }
            java.lang.String r14 = r9.toString()     // Catch:{ SQLiteException -> 0x011e }
            android.database.Cursor r14 = r8.rawQuery(r14, r5)     // Catch:{ SQLiteException -> 0x011e }
            r8.beginTransaction()     // Catch:{ SQLiteException -> 0x0116 }
        L_0x005d:
            boolean r9 = r14.moveToNext()     // Catch:{ all -> 0x0073 }
            if (r9 == 0) goto L_0x0104
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ JSONException -> 0x005d }
            r9.<init>()     // Catch:{ JSONException -> 0x005d }
            int r10 = r14.getColumnIndex(r3)     // Catch:{ JSONException -> 0x005d }
            if (r10 < 0) goto L_0x0076
            int r10 = r14.getColumnIndex(r3)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0077
        L_0x0073:
            r15 = move-exception
            goto L_0x0118
        L_0x0076:
            r10 = 2
        L_0x0077:
            long r10 = r14.getLong(r10)     // Catch:{ JSONException -> 0x005d }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ JSONException -> 0x005d }
            r9.put(r3, r10)     // Catch:{ JSONException -> 0x005d }
            int r10 = r14.getColumnIndex(r2)     // Catch:{ JSONException -> 0x005d }
            if (r10 < 0) goto L_0x008d
            int r10 = r14.getColumnIndex(r2)     // Catch:{ JSONException -> 0x005d }
            goto L_0x008e
        L_0x008d:
            r10 = 3
        L_0x008e:
            int r10 = r14.getInt(r10)     // Catch:{ JSONException -> 0x005d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x005d }
            r9.put(r2, r10)     // Catch:{ JSONException -> 0x005d }
            int r10 = r14.getColumnIndex(r4)     // Catch:{ JSONException -> 0x005d }
            if (r10 < 0) goto L_0x00a4
            int r10 = r14.getColumnIndex(r4)     // Catch:{ JSONException -> 0x005d }
            goto L_0x00a5
        L_0x00a4:
            r10 = 4
        L_0x00a5:
            java.lang.String r10 = r14.getString(r10)     // Catch:{ JSONException -> 0x005d }
            r9.put(r4, r10)     // Catch:{ JSONException -> 0x005d }
            int r10 = r14.getColumnIndex(r1)     // Catch:{ JSONException -> 0x005d }
            if (r10 < 0) goto L_0x00b7
            int r10 = r14.getColumnIndex(r1)     // Catch:{ JSONException -> 0x005d }
            goto L_0x00b8
        L_0x00b7:
            r10 = 1
        L_0x00b8:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            java.lang.String r10 = r14.getString(r10)     // Catch:{ JSONException -> 0x005d }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r10 = "$distinct_id"
            r11.put(r10, r15)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r10 = r11.toString()     // Catch:{ JSONException -> 0x005d }
            r9.put(r1, r10)     // Catch:{ JSONException -> 0x005d }
            oE.g$b r10 = oE.C14884g.b.PEOPLE     // Catch:{ JSONException -> 0x005d }
            java.lang.String r10 = r10.getName()     // Catch:{ JSONException -> 0x005d }
            r8.insert(r10, r5, r9)     // Catch:{ JSONException -> 0x005d }
            int r9 = r14.getColumnIndex(r0)     // Catch:{ JSONException -> 0x005d }
            if (r9 < 0) goto L_0x00e1
            int r9 = r14.getColumnIndex(r0)     // Catch:{ JSONException -> 0x005d }
            goto L_0x00e2
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            int r9 = r14.getInt(r9)     // Catch:{ JSONException -> 0x005d }
            oE.g$b r10 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ JSONException -> 0x005d }
            java.lang.String r10 = r10.getName()     // Catch:{ JSONException -> 0x005d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x005d }
            r11.<init>()     // Catch:{ JSONException -> 0x005d }
            java.lang.String r12 = "_id = "
            r11.append(r12)     // Catch:{ JSONException -> 0x005d }
            r11.append(r9)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r9 = r11.toString()     // Catch:{ JSONException -> 0x005d }
            r8.delete(r10, r9, r5)     // Catch:{ JSONException -> 0x005d }
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0104:
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x0073 }
            r8.endTransaction()     // Catch:{ SQLiteException -> 0x0116 }
            r14.close()
        L_0x010d:
            oE.g$a r14 = r13.f130069a
            r14.close()
            goto L_0x0151
        L_0x0113:
            r15 = move-exception
            r5 = r14
            goto L_0x0152
        L_0x0116:
            r15 = move-exception
            goto L_0x0120
        L_0x0118:
            r8.endTransaction()     // Catch:{ SQLiteException -> 0x0116 }
            throw r15     // Catch:{ SQLiteException -> 0x0116 }
        L_0x011c:
            r15 = move-exception
            goto L_0x0152
        L_0x011e:
            r15 = move-exception
            r14 = r5
        L_0x0120:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            r0.<init>()     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = "Could not push anonymous updates records from "
            r0.append(r1)     // Catch:{ all -> 0x0113 }
            oE.g$b r1 = oE.C14884g.b.ANONYMOUS_PEOPLE     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0113 }
            r0.append(r1)     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = ". Re-initializing database."
            r0.append(r1)     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0113 }
            pE.C14918c.d(r6, r0, r15)     // Catch:{ all -> 0x0113 }
            if (r14 == 0) goto L_0x0145
            r14.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0146
        L_0x0145:
            r5 = r14
        L_0x0146:
            oE.g$a r14 = r13.f130069a     // Catch:{ all -> 0x011c }
            r14.f()     // Catch:{ all -> 0x011c }
            if (r5 == 0) goto L_0x010d
            r5.close()
            goto L_0x010d
        L_0x0151:
            return r7
        L_0x0152:
            if (r5 == 0) goto L_0x0157
            r5.close()
        L_0x0157:
            oE.g$a r14 = r13.f130069a
            r14.close()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14884g.t(java.lang.String, java.lang.String):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:13|14|(1:16)(1:19)|20|(2:23|21)|63|24|(1:26)(1:27)|28|29|62|61|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r7.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0066 A[SYNTHETIC, Splitter:B:13:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0109 A[Catch:{ all -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int u(java.util.Map<java.lang.String, java.lang.String> r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "_id"
            java.lang.String r2 = "properties"
            java.lang.String r3 = "data"
            boolean r4 = r16.a()
            java.lang.String r5 = "MixpanelAPI.Database"
            if (r4 == 0) goto L_0x0017
            java.lang.String r0 = "There is not enough space left on the device or the data was over the maximum size limit so it was discarded"
            pE.C14918c.c(r5, r0)
            r0 = -2
            return r0
        L_0x0017:
            r4 = 0
            r6 = 0
            oE.g$a r7 = r1.f130069a     // Catch:{ SQLiteException -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0100 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "SELECT * FROM "
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            oE.g$b r10 = oE.C14884g.b.EVENTS     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = r10.getName()     // Catch:{ SQLiteException -> 0x0100 }
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = " WHERE "
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "token"
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = " = '"
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            r10 = r18
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "'"
            r9.append(r10)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r9 = r9.toString()     // Catch:{ SQLiteException -> 0x0100 }
            r8.<init>(r9)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r8 = r8.toString()     // Catch:{ SQLiteException -> 0x0100 }
            android.database.Cursor r8 = r7.rawQuery(r8, r6)     // Catch:{ SQLiteException -> 0x0100 }
            r7.beginTransaction()     // Catch:{ SQLiteException -> 0x00fc }
            r9 = r4
        L_0x0060:
            boolean r10 = r8.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r10 == 0) goto L_0x00e3
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0060 }
            r10.<init>()     // Catch:{ JSONException -> 0x0060 }
            int r11 = r8.getColumnIndex(r3)     // Catch:{ JSONException -> 0x0060 }
            if (r11 < 0) goto L_0x0079
            int r11 = r8.getColumnIndex(r3)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            goto L_0x00f8
        L_0x0079:
            r11 = 1
        L_0x007a:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r8.getString(r11)     // Catch:{ JSONException -> 0x0060 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r11 = r12.getJSONObject(r2)     // Catch:{ JSONException -> 0x0060 }
            java.util.Set r13 = r17.entrySet()     // Catch:{ JSONException -> 0x0060 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ JSONException -> 0x0060 }
        L_0x008f:
            boolean r14 = r13.hasNext()     // Catch:{ JSONException -> 0x0060 }
            if (r14 == 0) goto L_0x00ab
            java.lang.Object r14 = r13.next()     // Catch:{ JSONException -> 0x0060 }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ JSONException -> 0x0060 }
            java.lang.Object r15 = r14.getKey()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ JSONException -> 0x0060 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x0060 }
            r11.put(r15, r14)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x008f
        L_0x00ab:
            r12.put(r2, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r12.toString()     // Catch:{ JSONException -> 0x0060 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0060 }
            int r11 = r8.getColumnIndex(r0)     // Catch:{ JSONException -> 0x0060 }
            if (r11 < 0) goto L_0x00c0
            int r11 = r8.getColumnIndex(r0)     // Catch:{ JSONException -> 0x0060 }
            goto L_0x00c1
        L_0x00c0:
            r11 = r4
        L_0x00c1:
            int r11 = r8.getInt(r11)     // Catch:{ JSONException -> 0x0060 }
            oE.g$b r12 = oE.C14884g.b.EVENTS     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r12 = r12.getName()     // Catch:{ JSONException -> 0x0060 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0060 }
            r13.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r14 = "_id = "
            r13.append(r14)     // Catch:{ JSONException -> 0x0060 }
            r13.append(r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r13.toString()     // Catch:{ JSONException -> 0x0060 }
            r7.update(r12, r10, r11, r6)     // Catch:{ JSONException -> 0x0060 }
            int r9 = r9 + 1
            goto L_0x0060
        L_0x00e3:
            r7.setTransactionSuccessful()     // Catch:{ all -> 0x0076 }
            r7.endTransaction()     // Catch:{ SQLiteException -> 0x00f5 }
            r8.close()
            oE.g$a r0 = r1.f130069a
            r0.close()
            goto L_0x011e
        L_0x00f2:
            r0 = move-exception
            r6 = r8
            goto L_0x011f
        L_0x00f5:
            r0 = move-exception
            r4 = r9
            goto L_0x0102
        L_0x00f8:
            r7.endTransaction()     // Catch:{ SQLiteException -> 0x00f5 }
            throw r0     // Catch:{ SQLiteException -> 0x00f5 }
        L_0x00fc:
            r0 = move-exception
            goto L_0x0102
        L_0x00fe:
            r0 = move-exception
            goto L_0x011f
        L_0x0100:
            r0 = move-exception
            r8 = r6
        L_0x0102:
            java.lang.String r2 = "Could not re-write events history. Re-initializing database."
            pE.C14918c.d(r5, r2, r0)     // Catch:{ all -> 0x00f2 }
            if (r8 == 0) goto L_0x010d
            r8.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x010e
        L_0x010d:
            r6 = r8
        L_0x010e:
            oE.g$a r0 = r1.f130069a     // Catch:{ all -> 0x00fe }
            r0.f()     // Catch:{ all -> 0x00fe }
            if (r6 == 0) goto L_0x0118
            r6.close()
        L_0x0118:
            oE.g$a r0 = r1.f130069a
            r0.close()
            r9 = r4
        L_0x011e:
            return r9
        L_0x011f:
            if (r6 == 0) goto L_0x0124
            r6.close()
        L_0x0124:
            oE.g$a r2 = r1.f130069a
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14884g.u(java.util.Map, java.lang.String):int");
    }

    public C14884g(Context context, String str) {
        this.f130069a = new a(context, str);
    }
}
