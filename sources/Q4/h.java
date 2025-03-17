package Q4;

import HJ.C15854t;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LQ4/h;", "Ljava/io/Closeable;", "", "enabled", "LXH/N;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "LQ4/g;", "getWritableDatabase", "()LQ4/g;", "writableDatabase", "a", "b", "c", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h extends Closeable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"LQ4/h$a;", "", "", "version", "<init>", "(I)V", "", "fileName", "LXH/N;", "a", "(Ljava/lang/String;)V", "LQ4/g;", "db", "b", "(LQ4/g;)V", "d", "oldVersion", "newVersion", "g", "(LQ4/g;II)V", "e", "f", "c", "I", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0627a f39571b = new C0627a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final int f39572a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LQ4/h$a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Q4.h$a$a  reason: collision with other inner class name */
        public static final class C0627a {
            public /* synthetic */ C0627a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0627a() {
            }
        }

        public a(int i10) {
            this.f39572a = i10;
        }

        private final void a(String str) {
            if (!C15854t.H(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = C17542s.l(str.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (!z10) {
                        if (!z11) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i10, length + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        b.c(new File(str));
                    } catch (Exception e10) {
                        Log.w("SupportSQLite", "delete failed: ", e10);
                    }
                }
            }
        }

        public void b(g gVar) {
            C17542s.j(gVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            if (r4.hasNext() != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            kotlin.jvm.internal.C17542s.i(r1, "p.second");
            a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4 = r4.m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
            a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v12 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:6:0x0033, B:9:0x003a, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(Q4.g r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                kotlin.jvm.internal.C17542s.j(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.e(r2, r1)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0032
                java.lang.String r4 = r4.m()
                if (r4 == 0) goto L_0x0031
                r3.a(r4)
            L_0x0031:
                return
            L_0x0032:
                r1 = 0
                java.util.List r1 = r4.R()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                goto L_0x003a
            L_0x0038:
                r2 = move-exception
                goto L_0x003e
            L_0x003a:
                r4.close()     // Catch:{ IOException -> 0x0067, all -> 0x0038 }
                goto L_0x0067
            L_0x003e:
                if (r1 == 0) goto L_0x005d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x0046:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0066
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.C17542s.i(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x0046
            L_0x005d:
                java.lang.String r4 = r4.m()
                if (r4 == 0) goto L_0x0066
                r3.a(r4)
            L_0x0066:
                throw r2
            L_0x0067:
                if (r1 == 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x006f:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x008f
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.C17542s.i(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x006f
            L_0x0086:
                java.lang.String r4 = r4.m()
                if (r4 == 0) goto L_0x008f
                r3.a(r4)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Q4.h.a.c(Q4.g):void");
        }

        public abstract void d(g gVar);

        public void e(g gVar, int i10, int i11) {
            C17542s.j(gVar, "db");
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(g gVar) {
            C17542s.j(gVar, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\r\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"LQ4/h$b;", "", "Landroid/content/Context;", "context", "", "name", "LQ4/h$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;LQ4/h$a;ZZ)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "LQ4/h$a;", "d", "Z", "e", "f", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0628b f39573f = new C0628b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final Context f39574a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39575b;

        /* renamed from: c  reason: collision with root package name */
        public final a f39576c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f39577d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f39578e;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LQ4/h$b$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LQ4/h$b;", "b", "()LQ4/h$b;", "", "name", "d", "(Ljava/lang/String;)LQ4/h$b$a;", "LQ4/h$a;", "callback", "c", "(LQ4/h$a;)LQ4/h$b$a;", "", "useNoBackupDirectory", "e", "(Z)LQ4/h$b$a;", "allowDataLossOnRecovery", "a", "Landroid/content/Context;", "Ljava/lang/String;", "LQ4/h$a;", "Z", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final Context f39579a;

            /* renamed from: b  reason: collision with root package name */
            private String f39580b;

            /* renamed from: c  reason: collision with root package name */
            private a f39581c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f39582d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f39583e;

            public a(Context context) {
                C17542s.j(context, "context");
                this.f39579a = context;
            }

            public a a(boolean z10) {
                this.f39583e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f39581c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (!this.f39582d || ((str = this.f39580b) != null && str.length() != 0)) {
                    return new b(this.f39579a, this.f39580b, aVar, this.f39582d, this.f39583e);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a c(a aVar) {
                C17542s.j(aVar, "callback");
                this.f39581c = aVar;
                return this;
            }

            public a d(String str) {
                this.f39580b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f39582d = z10;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQ4/h$b$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQ4/h$b$a;", "a", "(Landroid/content/Context;)LQ4/h$b$a;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Q4.h$b$b  reason: collision with other inner class name */
        public static final class C0628b {
            public /* synthetic */ C0628b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                C17542s.j(context, "context");
                return new a(context);
            }

            private C0628b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            C17542s.j(context, "context");
            C17542s.j(aVar, "callback");
            this.f39574a = context;
            this.f39575b = str;
            this.f39576c = aVar;
            this.f39577d = z10;
            this.f39578e = z11;
        }

        public static final a a(Context context) {
            return f39573f.a(context);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"LQ4/h$c;", "", "LQ4/h$b;", "configuration", "LQ4/h;", "a", "(LQ4/h$b;)LQ4/h;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        h a(b bVar);
    }

    void close();

    String getDatabaseName();

    g getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z10);
}
