package R4;

import Q4.g;
import Q4.h;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003\u0013\u0015\u0017B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010'\u001a\u00020\u001d8BX\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"LR4/d;", "LQ4/h;", "Landroid/content/Context;", "context", "", "name", "LQ4/h$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LQ4/h$a;ZZ)V", "enabled", "LXH/N;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LQ4/h$a;", "d", "Z", "e", "LXH/o;", "LR4/d$c;", "f", "LXH/o;", "lazyDelegate", "g", "writeAheadLoggingEnabled", "i", "()LR4/d$c;", "getDelegate$delegate", "(LR4/d;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LQ4/g;", "getWritableDatabase", "()LQ4/g;", "writableDatabase", "h", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f39656h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f39657a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f39658b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h.a f39659c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f39660d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f39661e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o<c> f39662f = C16825p.b(new C0633d(this));
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f39663g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LR4/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"LR4/d$b;", "", "LR4/c;", "db", "<init>", "(LR4/c;)V", "a", "LR4/c;", "()LR4/c;", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private c f39664a;

        public b(c cVar) {
            this.f39664a = cVar;
        }

        public final c a() {
            return this.f39664a;
        }

        public final void b(c cVar) {
            this.f39664a = cVar;
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0003(,0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0014\u0010;\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105¨\u0006="}, d2 = {"LR4/d$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "LR4/d$b;", "dbRef", "LQ4/h$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LR4/d$b;LQ4/h$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "h", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "g", "LQ4/g;", "e", "(Z)LQ4/g;", "sqLiteDatabase", "LR4/c;", "f", "(Landroid/database/sqlite/SQLiteDatabase;)LR4/c;", "LXH/N;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "LR4/d$b;", "getDbRef", "()LR4/d$b;", "c", "LQ4/h$a;", "getCallback", "()LQ4/h$a;", "d", "Z", "getAllowDataLossOnRecovery", "()Z", "migrated", "LS4/a;", "LS4/a;", "lock", "opened", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends SQLiteOpenHelper {

        /* renamed from: h  reason: collision with root package name */
        public static final C0631c f39665h = new C0631c((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Context f39666a;

        /* renamed from: b  reason: collision with root package name */
        private final b f39667b;

        /* renamed from: c  reason: collision with root package name */
        private final h.a f39668c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f39669d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f39670e;

        /* renamed from: f  reason: collision with root package name */
        private final S4.a f39671f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f39672g;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LR4/d$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LR4/d$c$b;", "callbackName", "", "cause", "<init>", "(LR4/d$c$b;Ljava/lang/Throwable;)V", "a", "LR4/d$c$b;", "()LR4/d$c$b;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class a extends RuntimeException {

            /* renamed from: a  reason: collision with root package name */
            private final b f39673a;

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f39674b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th2) {
                super(th2);
                C17542s.j(bVar, "callbackName");
                C17542s.j(th2, "cause");
                this.f39673a = bVar;
                this.f39674b = th2;
            }

            public final b a() {
                return this.f39673a;
            }

            public Throwable getCause() {
                return this.f39674b;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LR4/d$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LR4/d$c$c;", "", "<init>", "()V", "LR4/d$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "LR4/c;", "a", "(LR4/d$b;Landroid/database/sqlite/SQLiteDatabase;)LR4/c;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R4.d$c$c  reason: collision with other inner class name */
        public static final class C0631c {
            public /* synthetic */ C0631c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                C17542s.j(bVar, "refHolder");
                C17542s.j(sQLiteDatabase, "sqLiteDatabase");
                c a10 = bVar.a();
                if (a10 != null && a10.e(sQLiteDatabase)) {
                    return a10;
                }
                c cVar = new c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }

            private C0631c() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R4.d$c$d  reason: collision with other inner class name */
        public /* synthetic */ class C0632d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f39675a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    R4.d$c$b[] r0 = R4.d.c.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    R4.d$c$b r1 = R4.d.c.b.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    R4.d$c$b r1 = R4.d.c.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    R4.d$c$b r1 = R4.d.c.b.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    R4.d$c$b r1 = R4.d.c.b.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    R4.d$c$b r1 = R4.d.c.b.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f39675a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: R4.d.c.C0632d.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, b bVar, h.a aVar, boolean z10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f39572a, new e(aVar, bVar));
            C17542s.j(context, "context");
            C17542s.j(bVar, "dbRef");
            C17542s.j(aVar, "callback");
            this.f39666a = context;
            this.f39667b = bVar;
            this.f39668c = aVar;
            this.f39669d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C17542s.i(str, "randomUUID().toString()");
            }
            this.f39671f = new S4.a(str, context.getCacheDir(), false);
        }

        /* access modifiers changed from: private */
        public static final void d(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            C17542s.j(aVar, "$callback");
            C17542s.j(bVar, "$dbRef");
            C0631c cVar = f39665h;
            C17542s.i(sQLiteDatabase, "dbObj");
            aVar.c(cVar.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase g(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                C17542s.i(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            C17542s.i(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|11|13|14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.database.sqlite.SQLiteDatabase h(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                boolean r1 = r4.f39672g
                if (r0 == 0) goto L_0x0035
                if (r1 != 0) goto L_0x0035
                android.content.Context r1 = r4.f39666a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0035
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0035
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0035:
                android.database.sqlite.SQLiteDatabase r5 = r4.g(r5)     // Catch:{ all -> 0x003a }
                return r5
            L_0x003a:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0042 }
            L_0x0042:
                android.database.sqlite.SQLiteDatabase r5 = r4.g(r5)     // Catch:{ all -> 0x0047 }
                return r5
            L_0x0047:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof R4.d.c.a
                if (r2 == 0) goto L_0x0074
                R4.d$c$a r1 = (R4.d.c.a) r1
                java.lang.Throwable r2 = r1.getCause()
                R4.d$c$b r1 = r1.a()
                int[] r3 = R4.d.c.C0632d.f39675a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x0073
                r3 = 2
                if (r1 == r3) goto L_0x0073
                r3 = 3
                if (r1 == r3) goto L_0x0073
                r3 = 4
                if (r1 == r3) goto L_0x0073
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x0072
                goto L_0x007e
            L_0x0072:
                throw r2
            L_0x0073:
                throw r2
            L_0x0074:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008f
                if (r0 == 0) goto L_0x008e
                boolean r2 = r4.f39669d
                if (r2 == 0) goto L_0x008e
            L_0x007e:
                android.content.Context r1 = r4.f39666a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.g(r5)     // Catch:{ a -> 0x0088 }
                return r5
            L_0x0088:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008e:
                throw r1
            L_0x008f:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: R4.d.c.h(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void close() {
            try {
                S4.a.c(this.f39671f, false, 1, (Object) null);
                super.close();
                this.f39667b.b((c) null);
                this.f39672g = false;
            } finally {
                this.f39671f.d();
            }
        }

        public final g e(boolean z10) {
            try {
                this.f39671f.b(!this.f39672g && getDatabaseName() != null);
                this.f39670e = false;
                SQLiteDatabase h10 = h(z10);
                if (this.f39670e) {
                    close();
                    g e10 = e(z10);
                    this.f39671f.d();
                    return e10;
                }
                c f10 = f(h10);
                this.f39671f.d();
                return f10;
            } catch (Throwable th2) {
                this.f39671f.d();
                throw th2;
            }
        }

        public final c f(SQLiteDatabase sQLiteDatabase) {
            C17542s.j(sQLiteDatabase, "sqLiteDatabase");
            return f39665h.a(this.f39667b, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C17542s.j(sQLiteDatabase, "db");
            if (!this.f39670e && this.f39668c.f39572a != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.f39668c.b(f(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C17542s.j(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f39668c.d(f(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C17542s.j(sQLiteDatabase, "db");
            this.f39670e = true;
            try {
                this.f39668c.e(f(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            C17542s.j(sQLiteDatabase, "db");
            if (!this.f39670e) {
                try {
                    this.f39668c.f(f(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f39672g = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            C17542s.j(sQLiteDatabase, "sqLiteDatabase");
            this.f39670e = true;
            try {
                this.f39668c.g(f(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR4/d$c;", "b", "()LR4/d$c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: R4.d$d  reason: collision with other inner class name */
    static final class C0633d extends C17544u implements C17631a<c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f39676c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0633d(d dVar) {
            super(0);
            this.f39676c = dVar;
        }

        /* renamed from: b */
        public final c invoke() {
            c cVar;
            if (this.f39676c.f39658b == null || !this.f39676c.f39660d) {
                cVar = new c(this.f39676c.f39657a, this.f39676c.f39658b, new b((c) null), this.f39676c.f39659c, this.f39676c.f39661e);
            } else {
                cVar = new c(this.f39676c.f39657a, new File(Q4.d.a(this.f39676c.f39657a), this.f39676c.f39658b).getAbsolutePath(), new b((c) null), this.f39676c.f39659c, this.f39676c.f39661e);
            }
            Q4.b.f(cVar, this.f39676c.f39663g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a aVar, boolean z10, boolean z11) {
        C17542s.j(context, "context");
        C17542s.j(aVar, "callback");
        this.f39657a = context;
        this.f39658b = str;
        this.f39659c = aVar;
        this.f39660d = z10;
        this.f39661e = z11;
    }

    private final c i() {
        return this.f39662f.getValue();
    }

    public void close() {
        if (this.f39662f.isInitialized()) {
            i().close();
        }
    }

    public String getDatabaseName() {
        return this.f39658b;
    }

    public g getWritableDatabase() {
        return i().e(true);
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f39662f.isInitialized()) {
            Q4.b.f(i(), z10);
        }
        this.f39663g = z10;
    }
}
