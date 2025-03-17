package E8;

import YH.C16877v;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0005\u0015\u001a\u0017\u000b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LE8/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences$Editor;", "prefStoreEditor", "LXH/N;", "e", "(Landroid/content/Context;Landroid/content/SharedPreferences$Editor;)V", "d", "", "oldPrefsName", "Landroid/content/SharedPreferences;", "oldPrefs", "LE8/a$c;", "oldKey", "g", "(Ljava/lang/String;Landroid/content/SharedPreferences;LE8/a$c;Landroid/content/SharedPreferences$Editor;)V", "message", "a", "(Ljava/lang/String;)V", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "(Ljava/lang/String;Ljava/lang/Exception;)V", "prefStoreSharedPref", "f", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35237a = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"LE8/a$a;", "", "<init>", "()V", "LE8/a$c;", "b", "LE8/a$c;", "c", "()LE8/a$c;", "OPTOUT_DATA", "LAST_EVENT_TIMESTAMP_KEY", "d", "a", "IS_HIDE_EVENT_PENDING_KEY", "e", "SCHEDULED_APP_HIDE_EVENT_KEY", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E8.a$a  reason: collision with other inner class name */
    public static final class C0564a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0564a f35238a = new C0564a();

        /* renamed from: b  reason: collision with root package name */
        private static final c f35239b;

        /* renamed from: c  reason: collision with root package name */
        private static final c f35240c = new c(d.LONG, "last_event_timestamp", "b979faa093058ea41897894dc2cfbb42", b.LAST_EVENT_TIMESTAMP);

        /* renamed from: d  reason: collision with root package name */
        private static final c f35241d;

        /* renamed from: e  reason: collision with root package name */
        private static final c f35242e = new c(d.STRING, "scheduled_app_hide_event", "9034f57360cfc17846093bfbb15f84d3", b.SCHEDULED_APP_HIDE_EVENT);

        static {
            d dVar = d.BOOLEAN;
            f35239b = new c(dVar, "optout_data_collection", "dacf8be919a342da6b9726a3c3e6ab27", b.IS_OPT_OUT);
            f35241d = new c(dVar, "is_hide_event_pending", "53ad207c8331f3770f3c39fc16eabf90", b.IS_HIDE_EVENT_PENDING);
        }

        private C0564a() {
        }

        public final c a() {
            return f35241d;
        }

        public final c b() {
            return f35240c;
        }

        public final c c() {
            return f35239b;
        }

        public final c d() {
            return f35242e;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE8/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LE8/a$c;", "", "LE8/a$d;", "prefType", "", "name", "md5hash", "LE8/b;", "newKey", "<init>", "(LE8/a$d;Ljava/lang/String;Ljava/lang/String;LE8/b;)V", "a", "LE8/a$d;", "d", "()LE8/a$d;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "LE8/b;", "()LE8/b;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f35243a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35244b;

        /* renamed from: c  reason: collision with root package name */
        private final String f35245c;

        /* renamed from: d  reason: collision with root package name */
        private final b f35246d;

        public c(d dVar, String str, String str2, b bVar) {
            C17542s.j(dVar, "prefType");
            C17542s.j(str, "name");
            C17542s.j(str2, "md5hash");
            C17542s.j(bVar, "newKey");
            this.f35243a = dVar;
            this.f35244b = str;
            this.f35245c = str2;
            this.f35246d = bVar;
        }

        public final String a() {
            return this.f35245c;
        }

        public final String b() {
            return this.f35244b;
        }

        public final b c() {
            return this.f35246d;
        }

        public final d d() {
            return this.f35243a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LE8/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "BOOLEAN", "INT", "LONG", "STRING", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        BOOLEAN,
        INT,
        LONG,
        STRING
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"LE8/a$e;", "", "<init>", "()V", "LE8/a$c;", "b", "LE8/a$c;", "a", "()LE8/a$c;", "LAST_SEGMENT", "c", "TRACKABLE", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f35247a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final c f35248b = new c(d.INT, "last_segment", "d1cd941e9361399f0433d63e6f7d7c76", b.LAST_SEGMENT);

        /* renamed from: c  reason: collision with root package name */
        private static final c f35249c = new c(d.BOOLEAN, "trackable", "41acbd06dbc9316d28c0db48b144aaf8", b.IS_TRACKABLE);

        private e() {
        }

        public final c a() {
            return f35248b;
        }

        public final c b() {
            return f35249c;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35250a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                E8.a$d[] r0 = E8.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E8.a$d r1 = E8.a.d.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                E8.a$d r1 = E8.a.d.INT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                E8.a$d r1 = E8.a.d.LONG     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                E8.a$d r1 = E8.a.d.STRING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f35250a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E8.a.f.<clinit>():void");
        }
    }

    private final void a(String str) {
    }

    private final void b(String str, Exception exc) {
        Log.e("CSLIB|OldPrefsMigration", str, exc);
    }

    private final void c(String str) {
        Log.i("CSLIB|OldPrefsMigration", str);
    }

    private final void d(Context context, SharedPreferences.Editor editor) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cs_app", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        C17542s.i(all, "oldPrefs.all");
        if (!all.isEmpty()) {
            a("Migrating cs_app");
            C0564a aVar = C0564a.f35238a;
            for (c g10 : C16877v.q(aVar.c(), aVar.b(), aVar.a(), aVar.d())) {
                C17542s.i(sharedPreferences, "oldPrefs");
                g("cs_app", sharedPreferences, g10, editor);
            }
            sharedPreferences.edit().clear().apply();
            a("Old prefs cs_app cleared.");
        }
    }

    private final void e(Context context, SharedPreferences.Editor editor) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cs", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        C17542s.i(all, "oldPrefs.all");
        if (!all.isEmpty()) {
            a("Migrating cs");
            e eVar = e.f35247a;
            for (c g10 : C16877v.q(eVar.b(), eVar.a())) {
                C17542s.i(sharedPreferences, "oldPrefs");
                g("cs", sharedPreferences, g10, editor);
            }
            sharedPreferences.edit().clear().apply();
            a("Old prefs cs cleared.");
        }
    }

    private final void g(String str, SharedPreferences sharedPreferences, c cVar, SharedPreferences.Editor editor) {
        b c10 = cVar.c();
        try {
            if (sharedPreferences.contains(cVar.a())) {
                int i10 = f.f35250a[cVar.d().ordinal()];
                if (i10 == 1) {
                    boolean z10 = sharedPreferences.getBoolean(cVar.a(), false);
                    a("Migrating " + str + ' ' + cVar.b() + " -> " + c10 + ": " + z10);
                    editor.putBoolean(c10.name(), z10);
                } else if (i10 == 2) {
                    int i11 = sharedPreferences.getInt(cVar.a(), 0);
                    a("Migrating " + str + ' ' + cVar.b() + " -> " + c10 + ": " + i11);
                    editor.putInt(c10.name(), i11);
                } else if (i10 == 3) {
                    long j10 = sharedPreferences.getLong(cVar.a(), 0);
                    a("Migrating " + str + ' ' + cVar.b() + " -> " + c10 + ": " + j10);
                    editor.putLong(c10.name(), j10);
                } else if (i10 == 4) {
                    String string = sharedPreferences.getString(cVar.a(), "");
                    a("Migrating " + str + ' ' + cVar.b() + " -> " + c10 + ": " + string);
                    editor.putString(c10.name(), string);
                }
            }
        } catch (Exception e10) {
            b("Migrating " + str + ' ' + cVar.b() + " -> " + c10, e10);
        }
    }

    public final void f(Context context, SharedPreferences sharedPreferences) {
        C17542s.j(context, "context");
        C17542s.j(sharedPreferences, "prefStoreSharedPref");
        long currentTimeMillis = System.currentTimeMillis();
        if (!sharedPreferences.getBoolean("IS_MIGRATED_FROM_PREFS_HELPER", false)) {
            a("Checking for old preferences migration ...");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("IS_MIGRATED_FROM_PREFS_HELPER", true);
            C17542s.i(edit, "editor");
            e(context, edit);
            d(context, edit);
            edit.apply();
            c("Migration done in " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
        }
    }
}
