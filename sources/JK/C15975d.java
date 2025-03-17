package JK;

import HJ.C15850p;
import HJ.C15854t;
import HK.C15864d;
import KK.C15993a;
import KK.C15996d;
import PK.C16212a;
import QK.C16354j;
import WK.C16771f;
import WK.C16780o;
import WK.N;
import WK.y;
import XH.C16807N;
import XH.C16820k;
import jI.C17416c;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001q\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u00049=ACB9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0010H\u0000¢\u0006\u0004\b#\u0010\u0012J\u001e\u0010%\u001a\b\u0018\u00010$R\u00020\u00002\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\b\u0018\u00010(R\u00020\u00002\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\u00102\n\u0010+\u001a\u00060(R\u00020\u00002\u0006\u0010,\u001a\u00020\u001bH\u0000¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u00020\u001b2\n\u00102\u001a\u000601R\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u0012J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u0012J\r\u00108\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010\t\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\bC\u0010B\u001a\u0004\bD\u0010ER*\u0010\u000b\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n8F@FX\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010>R\u0014\u0010O\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010>R\u0014\u0010Q\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010>R\u0016\u0010S\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010\u0014R\u0018\u0010V\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u000601R\u00020\u00000W8\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010BR\u0016\u0010a\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010`R\u0016\u0010c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010`R\"\u0010h\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bd\u0010`\u001a\u0004\be\u0010\u001d\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u0010`R\u0016\u0010k\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010`R\u0016\u0010l\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0014\u0010p\u001a\u00020m8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020q8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010r¨\u0006t"}, d2 = {"LJK/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "LPK/a;", "fileSystem", "Ljava/io/File;", "directory", "", "appVersion", "valueCount", "", "maxSize", "LKK/e;", "taskRunner", "<init>", "(LPK/a;Ljava/io/File;IIJLKK/e;)V", "LXH/N;", "U", "()V", "LWK/f;", "J", "()LWK/f;", "", "line", "e0", "(Ljava/lang/String;)V", "N", "", "F", "()Z", "n", "j0", "key", "o0", "B", "f0", "LJK/d$d;", "u", "(Ljava/lang/String;)LJK/d$d;", "expectedSequenceNumber", "LJK/d$b;", "s", "(Ljava/lang/String;J)LJK/d$b;", "editor", "success", "o", "(LJK/d$b;Z)V", "h0", "(Ljava/lang/String;)Z", "LJK/d$c;", "entry", "i0", "(LJK/d$c;)Z", "flush", "close", "l0", "q", "a", "LPK/a;", "x", "()LPK/a;", "b", "Ljava/io/File;", "w", "()Ljava/io/File;", "c", "I", "d", "z", "()I", "value", "e", "getMaxSize", "()J", "setMaxSize", "(J)V", "f", "journalFile", "g", "journalFileTmp", "h", "journalFileBackup", "i", "size", "j", "LWK/f;", "journalWriter", "Ljava/util/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", "m", "Z", "hasJournalErrors", "civilizedFileSystem", "initialized", "p", "v", "setClosed$okhttp", "(Z)V", "closed", "mostRecentTrimFailed", "r", "mostRecentRebuildFailed", "nextSequenceNumber", "LKK/d;", "t", "LKK/d;", "cleanupQueue", "JK/d$e", "LJK/d$e;", "cleanupTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JK.d  reason: case insensitive filesystem */
public final class C15975d implements Closeable, Flushable {

    /* renamed from: A  reason: collision with root package name */
    public static final String f135832A = "1";

    /* renamed from: B  reason: collision with root package name */
    public static final long f135833B = -1;

    /* renamed from: C  reason: collision with root package name */
    public static final C15850p f135834C = new C15850p("[a-z0-9_-]{1,120}");

    /* renamed from: D  reason: collision with root package name */
    public static final String f135835D = "CLEAN";

    /* renamed from: E  reason: collision with root package name */
    public static final String f135836E = "DIRTY";

    /* renamed from: F  reason: collision with root package name */
    public static final String f135837F = "REMOVE";

    /* renamed from: G  reason: collision with root package name */
    public static final String f135838G = "READ";

    /* renamed from: v  reason: collision with root package name */
    public static final a f135839v = new a((DefaultConstructorMarker) null);

    /* renamed from: w  reason: collision with root package name */
    public static final String f135840w = "journal";

    /* renamed from: x  reason: collision with root package name */
    public static final String f135841x = "journal.tmp";

    /* renamed from: y  reason: collision with root package name */
    public static final String f135842y = "journal.bkp";

    /* renamed from: z  reason: collision with root package name */
    public static final String f135843z = "libcore.io.DiskLruCache";

    /* renamed from: a  reason: collision with root package name */
    private final C16212a f135844a;

    /* renamed from: b  reason: collision with root package name */
    private final File f135845b;

    /* renamed from: c  reason: collision with root package name */
    private final int f135846c;

    /* renamed from: d  reason: collision with root package name */
    private final int f135847d;

    /* renamed from: e  reason: collision with root package name */
    private long f135848e;

    /* renamed from: f  reason: collision with root package name */
    private final File f135849f;

    /* renamed from: g  reason: collision with root package name */
    private final File f135850g;

    /* renamed from: h  reason: collision with root package name */
    private final File f135851h;

    /* renamed from: i  reason: collision with root package name */
    private long f135852i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C16771f f135853j;

    /* renamed from: k  reason: collision with root package name */
    private final LinkedHashMap<String, c> f135854k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f135855l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f135856m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f135857n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f135858o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f135859p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f135860q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f135861r;

    /* renamed from: s  reason: collision with root package name */
    private long f135862s;

    /* renamed from: t  reason: collision with root package name */
    private final C15996d f135863t;

    /* renamed from: u  reason: collision with root package name */
    private final e f135864u;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XD¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006XD¢\u0006\u0006\n\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"LJK/d$a;", "", "<init>", "()V", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LHJ/p;", "LEGAL_KEY_PATTERN", "LHJ/p;", "MAGIC", "READ", "REMOVE", "VERSION_1", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"LJK/d$b;", "", "LJK/d$c;", "LJK/d;", "entry", "<init>", "(LJK/d;LJK/d$c;)V", "LXH/N;", "c", "()V", "", "index", "LWK/L;", "f", "(I)LWK/L;", "b", "a", "LJK/d$c;", "d", "()LJK/d$c;", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.d$b */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f135865a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f135866b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f135867c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15975d f135868d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "LXH/N;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: JK.d$b$a */
        static final class a extends C17544u implements C17642l<IOException, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C15975d f135869c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b f135870d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C15975d dVar, b bVar) {
                super(1);
                this.f135869c = dVar;
                this.f135870d = bVar;
            }

            public final void a(IOException iOException) {
                C17542s.j(iOException, "it");
                C15975d dVar = this.f135869c;
                b bVar = this.f135870d;
                synchronized (dVar) {
                    bVar.c();
                    C16807N n10 = C16807N.f139792a;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((IOException) obj);
                return C16807N.f139792a;
            }
        }

        public b(C15975d dVar, c cVar) {
            C17542s.j(cVar, "entry");
            this.f135868d = dVar;
            this.f135865a = cVar;
            this.f135866b = cVar.g() ? null : new boolean[dVar.z()];
        }

        public final void a() {
            C15975d dVar = this.f135868d;
            synchronized (dVar) {
                try {
                    if (!this.f135867c) {
                        if (C17542s.e(this.f135865a.b(), this)) {
                            dVar.o(this, false);
                        }
                        this.f135867c = true;
                        C16807N n10 = C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            C15975d dVar = this.f135868d;
            synchronized (dVar) {
                try {
                    if (!this.f135867c) {
                        if (C17542s.e(this.f135865a.b(), this)) {
                            dVar.o(this, true);
                        }
                        this.f135867c = true;
                        C16807N n10 = C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (!C17542s.e(this.f135865a.b(), this)) {
                return;
            }
            if (this.f135868d.f135857n) {
                this.f135868d.o(this, false);
            } else {
                this.f135865a.q(true);
            }
        }

        public final c d() {
            return this.f135865a;
        }

        public final boolean[] e() {
            return this.f135866b;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r4 = WK.y.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final WK.L f(int r4) {
            /*
                r3 = this;
                JK.d r0 = r3.f135868d
                monitor-enter(r0)
                boolean r1 = r3.f135867c     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0051
                JK.d$c r1 = r3.f135865a     // Catch:{ all -> 0x0019 }
                JK.d$b r1 = r1.b()     // Catch:{ all -> 0x0019 }
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x001b
                WK.L r4 = WK.y.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0019:
                r4 = move-exception
                goto L_0x0059
            L_0x001b:
                JK.d$c r1 = r3.f135865a     // Catch:{ all -> 0x0019 }
                boolean r1 = r1.g()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x002b
                boolean[] r1 = r3.f135866b     // Catch:{ all -> 0x0019 }
                kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x0019 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0019 }
            L_0x002b:
                JK.d$c r1 = r3.f135865a     // Catch:{ all -> 0x0019 }
                java.util.List r1 = r1.c()     // Catch:{ all -> 0x0019 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0019 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0019 }
                PK.a r1 = r0.x()     // Catch:{ FileNotFoundException -> 0x004b }
                WK.L r4 = r1.e(r4)     // Catch:{ FileNotFoundException -> 0x004b }
                JK.e r1 = new JK.e     // Catch:{ all -> 0x0019 }
                JK.d$b$a r2 = new JK.d$b$a     // Catch:{ all -> 0x0019 }
                r2.<init>(r0, r3)     // Catch:{ all -> 0x0019 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r1
            L_0x004b:
                WK.L r4 = WK.y.b()     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)
                return r4
            L_0x0051:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0019 }
                r1.<init>(r4)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ all -> 0x0019 }
            L_0x0059:
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.b.f(int):WK.L");
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b'\u0010)R\"\u00102\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00106\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R(\u0010<\u001a\b\u0018\u000107R\u00020\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b \u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR\"\u0010H\u001a\u00020C8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"LJK/d$c;", "", "", "key", "<init>", "(LJK/d;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "LWK/N;", "k", "(I)LWK/N;", "LXH/N;", "m", "(Ljava/util/List;)V", "LWK/f;", "writer", "s", "(LWK/f;)V", "LJK/d$d;", "LJK/d;", "r", "()LJK/d$d;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "b", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "c", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "LJK/d$b;", "LJK/d$b;", "()LJK/d$b;", "l", "(LJK/d$b;)V", "currentEditor", "h", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.d$c */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f135871a;

        /* renamed from: b  reason: collision with root package name */
        private final long[] f135872b;

        /* renamed from: c  reason: collision with root package name */
        private final List<File> f135873c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List<File> f135874d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private boolean f135875e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f135876f;

        /* renamed from: g  reason: collision with root package name */
        private b f135877g;

        /* renamed from: h  reason: collision with root package name */
        private int f135878h;

        /* renamed from: i  reason: collision with root package name */
        private long f135879i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C15975d f135880j;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"JK/d$c$a", "LWK/o;", "LXH/N;", "close", "()V", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: JK.d$c$a */
        public static final class a extends C16780o {

            /* renamed from: b  reason: collision with root package name */
            private boolean f135881b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C15975d f135882c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c f135883d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(N n10, C15975d dVar, c cVar) {
                super(n10);
                this.f135882c = dVar;
                this.f135883d = cVar;
            }

            public void close() {
                super.close();
                if (!this.f135881b) {
                    this.f135881b = true;
                    C15975d dVar = this.f135882c;
                    c cVar = this.f135883d;
                    synchronized (dVar) {
                        try {
                            cVar.n(cVar.f() - 1);
                            if (cVar.f() == 0 && cVar.i()) {
                                dVar.i0(cVar);
                            }
                            C16807N n10 = C16807N.f139792a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public c(C15975d dVar, String str) {
            C17542s.j(str, "key");
            this.f135880j = dVar;
            this.f135871a = str;
            this.f135872b = new long[dVar.z()];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int z10 = dVar.z();
            for (int i10 = 0; i10 < z10; i10++) {
                sb2.append(i10);
                this.f135873c.add(new File(this.f135880j.w(), sb2.toString()));
                sb2.append(".tmp");
                this.f135874d.add(new File(this.f135880j.w(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final N k(int i10) {
            N d10 = this.f135880j.x().d(this.f135873c.get(i10));
            if (this.f135880j.f135857n) {
                return d10;
            }
            this.f135878h++;
            return new a(d10, this.f135880j, this);
        }

        public final List<File> a() {
            return this.f135873c;
        }

        public final b b() {
            return this.f135877g;
        }

        public final List<File> c() {
            return this.f135874d;
        }

        public final String d() {
            return this.f135871a;
        }

        public final long[] e() {
            return this.f135872b;
        }

        public final int f() {
            return this.f135878h;
        }

        public final boolean g() {
            return this.f135875e;
        }

        public final long h() {
            return this.f135879i;
        }

        public final boolean i() {
            return this.f135876f;
        }

        public final void l(b bVar) {
            this.f135877g = bVar;
        }

        public final void m(List<String> list) {
            C17542s.j(list, "strings");
            if (list.size() == this.f135880j.z()) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f135872b[i10] = Long.parseLong(list.get(i10));
                    }
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new C16820k();
                }
            } else {
                j(list);
                throw new C16820k();
            }
        }

        public final void n(int i10) {
            this.f135878h = i10;
        }

        public final void o(boolean z10) {
            this.f135875e = z10;
        }

        public final void p(long j10) {
            this.f135879i = j10;
        }

        public final void q(boolean z10) {
            this.f135876f = z10;
        }

        public final C3341d r() {
            C15975d dVar = this.f135880j;
            if (C15864d.f135363h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            } else if (!this.f135875e) {
                return null;
            } else {
                if (!this.f135880j.f135857n && (this.f135877g != null || this.f135876f)) {
                    return null;
                }
                ArrayList<N> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.f135872b.clone();
                try {
                    int z10 = this.f135880j.z();
                    for (int i10 = 0; i10 < z10; i10++) {
                        arrayList.add(k(i10));
                    }
                    return new C3341d(this.f135880j, this.f135871a, this.f135879i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (N m10 : arrayList) {
                        C15864d.m(m10);
                    }
                    try {
                        this.f135880j.i0(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(C16771f fVar) {
            C17542s.j(fVar, "writer");
            for (long u12 : this.f135872b) {
                fVar.Z1(32).u1(u12);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0018\u00010\rR\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006\u001e"}, d2 = {"LJK/d$d;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "LWK/N;", "sources", "", "lengths", "<init>", "(LJK/d;Ljava/lang/String;JLjava/util/List;[J)V", "LJK/d$b;", "LJK/d;", "c", "()LJK/d$b;", "", "index", "d", "(I)LWK/N;", "LXH/N;", "close", "()V", "a", "Ljava/lang/String;", "b", "J", "Ljava/util/List;", "[J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.d$d  reason: collision with other inner class name */
    public final class C3341d implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        private final String f135884a;

        /* renamed from: b  reason: collision with root package name */
        private final long f135885b;

        /* renamed from: c  reason: collision with root package name */
        private final List<N> f135886c;

        /* renamed from: d  reason: collision with root package name */
        private final long[] f135887d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15975d f135888e;

        public C3341d(C15975d dVar, String str, long j10, List<? extends N> list, long[] jArr) {
            C17542s.j(str, "key");
            C17542s.j(list, "sources");
            C17542s.j(jArr, "lengths");
            this.f135888e = dVar;
            this.f135884a = str;
            this.f135885b = j10;
            this.f135886c = list;
            this.f135887d = jArr;
        }

        public final b c() {
            return this.f135888e.s(this.f135884a, this.f135885b);
        }

        public void close() {
            for (N m10 : this.f135886c) {
                C15864d.m(m10);
            }
        }

        public final N d(int i10) {
            return this.f135886c.get(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"JK/d$e", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.d$e */
    public static final class e extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15975d f135889e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C15975d dVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f135889e = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            JK.C15975d.h(r0, true);
            JK.C15975d.g(r0, WK.y.c(WK.y.b()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long f() {
            /*
                r5 = this;
                JK.d r0 = r5.f135889e
                monitor-enter(r0)
                boolean r1 = r0.f135858o     // Catch:{ all -> 0x0017 }
                r2 = -1
                if (r1 == 0) goto L_0x003a
                boolean r1 = r0.v()     // Catch:{ all -> 0x0017 }
                if (r1 == 0) goto L_0x0012
                goto L_0x003a
            L_0x0012:
                r1 = 1
                r0.l0()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001c
            L_0x0017:
                r1 = move-exception
                goto L_0x003c
            L_0x0019:
                r0.f135860q = r1     // Catch:{ all -> 0x0017 }
            L_0x001c:
                boolean r4 = r0.F()     // Catch:{ IOException -> 0x002a }
                if (r4 == 0) goto L_0x0038
                r0.f0()     // Catch:{ IOException -> 0x002a }
                r4 = 0
                r0.f135855l = r4     // Catch:{ IOException -> 0x002a }
                goto L_0x0038
            L_0x002a:
                r0.f135861r = r1     // Catch:{ all -> 0x0017 }
                WK.L r1 = WK.y.b()     // Catch:{ all -> 0x0017 }
                WK.f r1 = WK.y.c(r1)     // Catch:{ all -> 0x0017 }
                r0.f135853j = r1     // Catch:{ all -> 0x0017 }
            L_0x0038:
                monitor-exit(r0)
                return r2
            L_0x003a:
                monitor-exit(r0)
                return r2
            L_0x003c:
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.e.f():long");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "LXH/N;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: JK.d$f */
    static final class f extends C17544u implements C17642l<IOException, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15975d f135890c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C15975d dVar) {
            super(1);
            this.f135890c = dVar;
        }

        public final void a(IOException iOException) {
            C17542s.j(iOException, "it");
            C15975d dVar = this.f135890c;
            if (!C15864d.f135363h || Thread.holdsLock(dVar)) {
                this.f135890c.f135856m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IOException) obj);
            return C16807N.f139792a;
        }
    }

    public C15975d(C16212a aVar, File file, int i10, int i11, long j10, KK.e eVar) {
        C17542s.j(aVar, "fileSystem");
        C17542s.j(file, "directory");
        C17542s.j(eVar, "taskRunner");
        this.f135844a = aVar;
        this.f135845b = file;
        this.f135846c = i10;
        this.f135847d = i11;
        this.f135848e = j10;
        this.f135863t = eVar.i();
        this.f135864u = new e(this, C15864d.f135364i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            this.f135849f = new File(file, f135840w);
            this.f135850g = new File(file, f135841x);
            this.f135851h = new File(file, f135842y);
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    public final boolean F() {
        int i10 = this.f135855l;
        return i10 >= 2000 && i10 >= this.f135854k.size();
    }

    private final C16771f J() {
        return y.c(new e(this.f135844a.b(this.f135849f), new f(this)));
    }

    private final void N() {
        this.f135844a.g(this.f135850g);
        Iterator<c> it = this.f135854k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            C17542s.i(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f135847d;
                while (i10 < i11) {
                    this.f135852i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l((b) null);
                int i12 = this.f135847d;
                while (i10 < i12) {
                    this.f135844a.g(cVar.a().get(i10));
                    this.f135844a.g(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|(1:20)(1:21)|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.f135855l = r0 - r9.f135854k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1.Y1() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        f0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r9.f135853j = J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        jI.C17416c.a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        jI.C17416c.a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x005d=Splitter:B:17:0x005d, B:25:0x007d=Splitter:B:25:0x007d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void U() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            PK.a r1 = r9.f135844a
            java.io.File r2 = r9.f135849f
            WK.N r1 = r1.d(r2)
            WK.g r1 = WK.y.d(r1)
            java.lang.String r2 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r3 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r1.Z0()     // Catch:{ all -> 0x005b }
            java.lang.String r7 = f135843z     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r2)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = f135832A     // Catch:{ all -> 0x005b }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r3)     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f135846c     // Catch:{ all -> 0x005b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r7, r4)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.f135847d     // Catch:{ all -> 0x005b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005b }
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x007d
            int r4 = r6.length()     // Catch:{ all -> 0x005b }
            if (r4 > 0) goto L_0x007d
            r0 = 0
        L_0x0051:
            java.lang.String r2 = r1.Z0()     // Catch:{ EOFException -> 0x005d }
            r9.e0(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0051
        L_0x005b:
            r0 = move-exception
            goto L_0x00ab
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r2 = r9.f135854k     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            int r0 = r0 - r2
            r9.f135855l = r0     // Catch:{ all -> 0x005b }
            boolean r0 = r1.Y1()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0070
            r9.f0()     // Catch:{ all -> 0x005b }
            goto L_0x0076
        L_0x0070:
            WK.f r0 = r9.J()     // Catch:{ all -> 0x005b }
            r9.f135853j = r0     // Catch:{ all -> 0x005b }
        L_0x0076:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x005b }
            r0 = 0
            jI.C17416c.a(r1, r0)
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r7.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005b }
            r7.append(r2)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r3)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r5)     // Catch:{ all -> 0x005b }
            r7.append(r0)     // Catch:{ all -> 0x005b }
            r7.append(r6)     // Catch:{ all -> 0x005b }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005b }
            r4.<init>(r0)     // Catch:{ all -> 0x005b }
            throw r4     // Catch:{ all -> 0x005b }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r2 = move-exception
            jI.C17416c.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.U():void");
    }

    private final void e0(String str) {
        String str2;
        String str3 = str;
        int r02 = C15854t.r0(str, ' ', 0, false, 6, (Object) null);
        if (r02 != -1) {
            int i10 = r02 + 1;
            int r03 = C15854t.r0(str, ' ', i10, false, 4, (Object) null);
            if (r03 == -1) {
                str2 = str3.substring(i10);
                C17542s.i(str2, "this as java.lang.String).substring(startIndex)");
                String str4 = f135837F;
                if (r02 == str4.length() && C15854t.W(str3, str4, false, 2, (Object) null)) {
                    this.f135854k.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i10, r03);
                C17542s.i(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c cVar = this.f135854k.get(str2);
            if (cVar == null) {
                cVar = new c(this, str2);
                this.f135854k.put(str2, cVar);
            }
            if (r03 != -1) {
                String str5 = f135835D;
                if (r02 == str5.length() && C15854t.W(str3, str5, false, 2, (Object) null)) {
                    String substring = str3.substring(r03 + 1);
                    C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
                    List X02 = C15854t.X0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    cVar.o(true);
                    cVar.l((b) null);
                    cVar.m(X02);
                    return;
                }
            }
            if (r03 == -1) {
                String str6 = f135836E;
                if (r02 == str6.length() && C15854t.W(str3, str6, false, 2, (Object) null)) {
                    cVar.l(new b(this, cVar));
                    return;
                }
            }
            if (r03 == -1) {
                String str7 = f135838G;
                if (r02 == str7.length() && C15854t.W(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: " + str3);
        }
        throw new IOException("unexpected journal line: " + str3);
    }

    private final boolean j0() {
        for (c next : this.f135854k.values()) {
            if (!next.i()) {
                C17542s.i(next, "toEvict");
                i0(next);
                return true;
            }
        }
        return false;
    }

    private final synchronized void n() {
        if (this.f135859p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void o0(String str) {
        if (!f135834C.i(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public static /* synthetic */ b t(C15975d dVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = f135833B;
        }
        return dVar.s(str, j10);
    }

    public final synchronized void B() {
        try {
            if (C15864d.f135363h) {
                if (!Thread.holdsLock(this)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                }
            }
            if (!this.f135858o) {
                if (this.f135844a.exists(this.f135851h)) {
                    if (this.f135844a.exists(this.f135849f)) {
                        this.f135844a.g(this.f135851h);
                    } else {
                        this.f135844a.f(this.f135851h, this.f135849f);
                    }
                }
                this.f135857n = C15864d.F(this.f135844a, this.f135851h);
                if (this.f135844a.exists(this.f135849f)) {
                    U();
                    N();
                    this.f135858o = true;
                    return;
                }
                f0();
                this.f135858o = true;
            }
        } catch (IOException e10) {
            C16354j g10 = C16354j.f137719a.g();
            g10.k("DiskLruCache " + this.f135845b + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
            q();
            this.f135859p = false;
        } catch (Throwable th2) {
            this.f135859p = false;
            throw th2;
        }
    }

    public synchronized void close() {
        b b10;
        try {
            if (this.f135858o) {
                if (!this.f135859p) {
                    Collection<c> values = this.f135854k.values();
                    C17542s.i(values, "lruEntries.values");
                    for (c cVar : (c[]) values.toArray(new c[0])) {
                        if (!(cVar.b() == null || (b10 = cVar.b()) == null)) {
                            b10.c();
                        }
                    }
                    l0();
                    C16771f fVar = this.f135853j;
                    C17542s.g(fVar);
                    fVar.close();
                    this.f135853j = null;
                    this.f135859p = true;
                    return;
                }
            }
            this.f135859p = true;
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void f0() {
        try {
            C16771f fVar = this.f135853j;
            if (fVar != null) {
                fVar.close();
            }
            C16771f c10 = y.c(this.f135844a.e(this.f135850g));
            try {
                c10.D0(f135843z).Z1(10);
                c10.D0(f135832A).Z1(10);
                c10.u1((long) this.f135846c).Z1(10);
                c10.u1((long) this.f135847d).Z1(10);
                c10.Z1(10);
                for (c next : this.f135854k.values()) {
                    if (next.b() != null) {
                        c10.D0(f135836E).Z1(32);
                        c10.D0(next.d());
                        c10.Z1(10);
                    } else {
                        c10.D0(f135835D).Z1(32);
                        c10.D0(next.d());
                        next.s(c10);
                        c10.Z1(10);
                    }
                }
                C16807N n10 = C16807N.f139792a;
                C17416c.a(c10, (Throwable) null);
                if (this.f135844a.exists(this.f135849f)) {
                    this.f135844a.f(this.f135849f, this.f135851h);
                }
                this.f135844a.f(this.f135850g, this.f135849f);
                this.f135844a.g(this.f135851h);
                this.f135853j = J();
                this.f135856m = false;
                this.f135861r = false;
            } catch (Throwable th2) {
                C17416c.a(c10, th);
                throw th2;
            }
        } finally {
        }
    }

    public synchronized void flush() {
        if (this.f135858o) {
            n();
            l0();
            C16771f fVar = this.f135853j;
            C17542s.g(fVar);
            fVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean h0(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r6, r0)     // Catch:{ all -> 0x002d }
            r5.B()     // Catch:{ all -> 0x002d }
            r5.n()     // Catch:{ all -> 0x002d }
            r5.o0(r6)     // Catch:{ all -> 0x002d }
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r0 = r5.f135854k     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002d }
            JK.d$c r6 = (JK.C15975d.c) r6     // Catch:{ all -> 0x002d }
            r0 = 0
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            boolean r6 = r5.i0(r6)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x002f
            long r1 = r5.f135852i     // Catch:{ all -> 0x002d }
            long r3 = r5.f135848e     // Catch:{ all -> 0x002d }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002f
            r5.f135860q = r0     // Catch:{ all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r6 = move-exception
            goto L_0x0031
        L_0x002f:
            monitor-exit(r5)
            return r6
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.h0(java.lang.String):boolean");
    }

    public final boolean i0(c cVar) {
        C16771f fVar;
        C17542s.j(cVar, "entry");
        if (!this.f135857n) {
            if (cVar.f() > 0 && (fVar = this.f135853j) != null) {
                fVar.D0(f135836E);
                fVar.Z1(32);
                fVar.D0(cVar.d());
                fVar.Z1(10);
                fVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b10 = cVar.b();
        if (b10 != null) {
            b10.c();
        }
        int i10 = this.f135847d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f135844a.g(cVar.a().get(i11));
            this.f135852i -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f135855l++;
        C16771f fVar2 = this.f135853j;
        if (fVar2 != null) {
            fVar2.D0(f135837F);
            fVar2.Z1(32);
            fVar2.D0(cVar.d());
            fVar2.Z1(10);
        }
        this.f135854k.remove(cVar.d());
        if (F()) {
            C15996d.j(this.f135863t, this.f135864u, 0, 2, (Object) null);
        }
        return true;
    }

    public final void l0() {
        while (this.f135852i > this.f135848e) {
            if (!j0()) {
                return;
            }
        }
        this.f135860q = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void o(JK.C15975d.b r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.C17542s.j(r9, r0)     // Catch:{ all -> 0x0044 }
            JK.d$c r0 = r9.d()     // Catch:{ all -> 0x0044 }
            JK.d$b r1 = r0.b()     // Catch:{ all -> 0x0044 }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r9)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0139
            r1 = 0
            if (r10 == 0) goto L_0x0064
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0064
            int r2 = r8.f135847d     // Catch:{ all -> 0x0044 }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x0064
            boolean[] r4 = r9.e()     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x0044 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x004a
            PK.a r4 = r8.f135844a     // Catch:{ all -> 0x0044 }
            java.util.List r5 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0044 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.exists(r5)     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0047
            r9.a()     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x0044:
            r9 = move-exception
            goto L_0x0141
        L_0x0047:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x004a:
            r9.a()     // Catch:{ all -> 0x0044 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r10.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x0044 }
            r10.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0044 }
            r9.<init>(r10)     // Catch:{ all -> 0x0044 }
            throw r9     // Catch:{ all -> 0x0044 }
        L_0x0064:
            int r9 = r8.f135847d     // Catch:{ all -> 0x0044 }
        L_0x0066:
            if (r1 >= r9) goto L_0x00b2
            java.util.List r2 = r0.c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x00aa
            boolean r3 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x00aa
            PK.a r3 = r8.f135844a     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.exists(r2)     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x00af
            java.util.List r3 = r0.a()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0044 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0044 }
            PK.a r4 = r8.f135844a     // Catch:{ all -> 0x0044 }
            r4.f(r2, r3)     // Catch:{ all -> 0x0044 }
            long[] r2 = r0.e()     // Catch:{ all -> 0x0044 }
            r4 = r2[r1]     // Catch:{ all -> 0x0044 }
            PK.a r2 = r8.f135844a     // Catch:{ all -> 0x0044 }
            long r2 = r2.c(r3)     // Catch:{ all -> 0x0044 }
            long[] r6 = r0.e()     // Catch:{ all -> 0x0044 }
            r6[r1] = r2     // Catch:{ all -> 0x0044 }
            long r6 = r8.f135852i     // Catch:{ all -> 0x0044 }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f135852i = r6     // Catch:{ all -> 0x0044 }
            goto L_0x00af
        L_0x00aa:
            PK.a r3 = r8.f135844a     // Catch:{ all -> 0x0044 }
            r3.g(r2)     // Catch:{ all -> 0x0044 }
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x0066
        L_0x00b2:
            r9 = 0
            r0.l(r9)     // Catch:{ all -> 0x0044 }
            boolean r9 = r0.i()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x00c1
            r8.i0(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r8)
            return
        L_0x00c1:
            int r9 = r8.f135855l     // Catch:{ all -> 0x0044 }
            r1 = 1
            int r9 = r9 + r1
            r8.f135855l = r9     // Catch:{ all -> 0x0044 }
            WK.f r9 = r8.f135853j     // Catch:{ all -> 0x0044 }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ all -> 0x0044 }
            boolean r2 = r0.g()     // Catch:{ all -> 0x0044 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f6
            if (r10 == 0) goto L_0x00d9
            goto L_0x00f6
        L_0x00d9:
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r10 = r8.f135854k     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r10.remove(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = f135837F     // Catch:{ all -> 0x0044 }
            WK.f r10 = r9.D0(r10)     // Catch:{ all -> 0x0044 }
            r10.Z1(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.D0(r10)     // Catch:{ all -> 0x0044 }
            r9.Z1(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x011b
        L_0x00f6:
            r0.o(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = f135835D     // Catch:{ all -> 0x0044 }
            WK.f r1 = r9.D0(r1)     // Catch:{ all -> 0x0044 }
            r1.Z1(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r0.d()     // Catch:{ all -> 0x0044 }
            r9.D0(r1)     // Catch:{ all -> 0x0044 }
            r0.s(r9)     // Catch:{ all -> 0x0044 }
            r9.Z1(r3)     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x011b
            long r1 = r8.f135862s     // Catch:{ all -> 0x0044 }
            r3 = 1
            long r3 = r3 + r1
            r8.f135862s = r3     // Catch:{ all -> 0x0044 }
            r0.p(r1)     // Catch:{ all -> 0x0044 }
        L_0x011b:
            r9.flush()     // Catch:{ all -> 0x0044 }
            long r9 = r8.f135852i     // Catch:{ all -> 0x0044 }
            long r0 = r8.f135848e     // Catch:{ all -> 0x0044 }
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x012c
            boolean r9 = r8.F()     // Catch:{ all -> 0x0044 }
            if (r9 == 0) goto L_0x0137
        L_0x012c:
            KK.d r0 = r8.f135863t     // Catch:{ all -> 0x0044 }
            JK.d$e r1 = r8.f135864u     // Catch:{ all -> 0x0044 }
            r4 = 2
            r5 = 0
            r2 = 0
            KK.C15996d.j(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x0044 }
        L_0x0137:
            monitor-exit(r8)
            return
        L_0x0139:
            java.lang.String r9 = "Check failed."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
            r10.<init>(r9)     // Catch:{ all -> 0x0044 }
            throw r10     // Catch:{ all -> 0x0044 }
        L_0x0141:
            monitor-exit(r8)     // Catch:{ all -> 0x0044 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.o(JK.d$b, boolean):void");
    }

    public final void q() {
        close();
        this.f135844a.a(this.f135845b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized JK.C15975d.b s(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r10, r0)     // Catch:{ all -> 0x0029 }
            r9.B()     // Catch:{ all -> 0x0029 }
            r9.n()     // Catch:{ all -> 0x0029 }
            r9.o0(r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r0 = r9.f135854k     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0029 }
            JK.d$c r0 = (JK.C15975d.c) r0     // Catch:{ all -> 0x0029 }
            long r1 = f135833B     // Catch:{ all -> 0x0029 }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002d
            if (r0 == 0) goto L_0x002b
            long r3 = r0.h()     // Catch:{ all -> 0x0029 }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002d
            goto L_0x002b
        L_0x0029:
            r10 = move-exception
            goto L_0x0092
        L_0x002b:
            monitor-exit(r9)
            return r2
        L_0x002d:
            if (r0 == 0) goto L_0x0034
            JK.d$b r11 = r0.b()     // Catch:{ all -> 0x0029 }
            goto L_0x0035
        L_0x0034:
            r11 = r2
        L_0x0035:
            if (r11 == 0) goto L_0x0039
            monitor-exit(r9)
            return r2
        L_0x0039:
            if (r0 == 0) goto L_0x0043
            int r11 = r0.f()     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x0043
            monitor-exit(r9)
            return r2
        L_0x0043:
            boolean r11 = r9.f135860q     // Catch:{ all -> 0x0029 }
            if (r11 != 0) goto L_0x0085
            boolean r11 = r9.f135861r     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x004c
            goto L_0x0085
        L_0x004c:
            WK.f r11 = r9.f135853j     // Catch:{ all -> 0x0029 }
            kotlin.jvm.internal.C17542s.g(r11)     // Catch:{ all -> 0x0029 }
            java.lang.String r12 = f135836E     // Catch:{ all -> 0x0029 }
            WK.f r12 = r11.D0(r12)     // Catch:{ all -> 0x0029 }
            r1 = 32
            WK.f r12 = r12.Z1(r1)     // Catch:{ all -> 0x0029 }
            WK.f r12 = r12.D0(r10)     // Catch:{ all -> 0x0029 }
            r1 = 10
            r12.Z1(r1)     // Catch:{ all -> 0x0029 }
            r11.flush()     // Catch:{ all -> 0x0029 }
            boolean r11 = r9.f135856m     // Catch:{ all -> 0x0029 }
            if (r11 == 0) goto L_0x006f
            monitor-exit(r9)
            return r2
        L_0x006f:
            if (r0 != 0) goto L_0x007b
            JK.d$c r0 = new JK.d$c     // Catch:{ all -> 0x0029 }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r11 = r9.f135854k     // Catch:{ all -> 0x0029 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0029 }
        L_0x007b:
            JK.d$b r10 = new JK.d$b     // Catch:{ all -> 0x0029 }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x0029 }
            r0.l(r10)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r10
        L_0x0085:
            KK.d r3 = r9.f135863t     // Catch:{ all -> 0x0029 }
            JK.d$e r4 = r9.f135864u     // Catch:{ all -> 0x0029 }
            r7 = 2
            r8 = 0
            r5 = 0
            KK.C15996d.j(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0029 }
            monitor-exit(r9)
            return r2
        L_0x0092:
            monitor-exit(r9)     // Catch:{ all -> 0x0029 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.s(java.lang.String, long):JK.d$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized JK.C15975d.C3341d u(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r8, r0)     // Catch:{ all -> 0x0056 }
            r7.B()     // Catch:{ all -> 0x0056 }
            r7.n()     // Catch:{ all -> 0x0056 }
            r7.o0(r8)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashMap<java.lang.String, JK.d$c> r0 = r7.f135854k     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0056 }
            JK.d$c r0 = (JK.C15975d.c) r0     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            monitor-exit(r7)
            return r1
        L_0x001c:
            JK.d$d r0 = r0.r()     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return r1
        L_0x0024:
            int r1 = r7.f135855l     // Catch:{ all -> 0x0056 }
            int r1 = r1 + 1
            r7.f135855l = r1     // Catch:{ all -> 0x0056 }
            WK.f r1 = r7.f135853j     // Catch:{ all -> 0x0056 }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = f135838G     // Catch:{ all -> 0x0056 }
            WK.f r1 = r1.D0(r2)     // Catch:{ all -> 0x0056 }
            r2 = 32
            WK.f r1 = r1.Z1(r2)     // Catch:{ all -> 0x0056 }
            WK.f r8 = r1.D0(r8)     // Catch:{ all -> 0x0056 }
            r1 = 10
            r8.Z1(r1)     // Catch:{ all -> 0x0056 }
            boolean r8 = r7.F()     // Catch:{ all -> 0x0056 }
            if (r8 == 0) goto L_0x0058
            KK.d r1 = r7.f135863t     // Catch:{ all -> 0x0056 }
            JK.d$e r2 = r7.f135864u     // Catch:{ all -> 0x0056 }
            r5 = 2
            r6 = 0
            r3 = 0
            KK.C15996d.j(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r8 = move-exception
            goto L_0x005a
        L_0x0058:
            monitor-exit(r7)
            return r0
        L_0x005a:
            monitor-exit(r7)     // Catch:{ all -> 0x0056 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: JK.C15975d.u(java.lang.String):JK.d$d");
    }

    public final boolean v() {
        return this.f135859p;
    }

    public final File w() {
        return this.f135845b;
    }

    public final C16212a x() {
        return this.f135844a;
    }

    public final int z() {
        return this.f135847d;
    }
}
