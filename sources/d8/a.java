package D8;

import G8.h;
import G8.t;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\u001dBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0*8\u0000X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"LD8/a;", "", "LG8/h;", "fileStorageUtil", "LG8/t;", "systemInstantiable", "LQJ/Q;", "coroutineScope", "", "logBatchSize", "storedLinesLimit", "", "appFilesDir", "<init>", "(LG8/h;LG8/t;LQJ/Q;IILjava/lang/String;)V", "", "logs", "LXH/N;", "e", "(Ljava/util/List;)V", "level", "tag", "msg", "", "tr", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "()V", "a", "LG8/h;", "LG8/t;", "c", "LQJ/Q;", "I", "f", "Ljava/lang/String;", "filePath", "Ljava/text/SimpleDateFormat;", "g", "Ljava/text/SimpleDateFormat;", "formatter", "", "h", "Ljava/util/List;", "getLogs$core_release", "()Ljava/util/List;", "getLogs$core_release$annotations", "i", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final C0553a f34577i = new C0553a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f34578a;

    /* renamed from: b  reason: collision with root package name */
    private final t f34579b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f34580c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34581d;

    /* renamed from: e  reason: collision with root package name */
    private final int f34582e;

    /* renamed from: f  reason: collision with root package name */
    private String f34583f;

    /* renamed from: g  reason: collision with root package name */
    private final SimpleDateFormat f34584g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f34585h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LD8/a$a;", "", "<init>", "()V", "", "DEBUG_FOLDER", "Ljava/lang/String;", "FILE_NAME", "", "LOG_BATCH_SIZE", "I", "STORED_LINES_LIMIT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D8.a$a  reason: collision with other inner class name */
    public static final class C0553a {
        private C0553a() {
        }

        public /* synthetic */ C0553a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.core.features.logging.DebugLogWriter$add$1", f = "DebugLogWriter.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34586c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f34587d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f34588e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, List<String> list, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f34587d = aVar;
            this.f34588e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f34587d, this.f34588e, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f34586c == 0) {
                y.b(obj);
                this.f34587d.e(this.f34588e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public a(h hVar, t tVar, Q q10, int i10, int i11, String str) {
        C17542s.j(hVar, "fileStorageUtil");
        C17542s.j(tVar, "systemInstantiable");
        C17542s.j(q10, "coroutineScope");
        C17542s.j(str, "appFilesDir");
        this.f34578a = hVar;
        this.f34579b = tVar;
        this.f34580c = q10;
        this.f34581d = i10;
        this.f34582e = i11;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        this.f34584g = simpleDateFormat;
        this.f34585h = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("cs");
        sb2.append(str2);
        sb2.append("debug-logs");
        String sb3 = sb2.toString();
        hVar.o(sb3);
        this.f34583f = sb3 + str2 + "cs-debug-logs.log";
        new c("DebugLogStorage").j("A DebugLogStorage has been created. Debug logs will be stored to disk and can be send to Contentsquare through CS InApp menu.");
    }

    public static /* synthetic */ void c(a aVar, String str, String str2, String str3, Throwable th2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        aVar.b(str, str2, str3, th2);
    }

    /* access modifiers changed from: private */
    public final void e(List<String> list) {
        this.f34578a.t(this.f34583f, C16877v.G0(list, "\n", "\n", (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 60, (Object) null), true);
        int size = this.f34578a.q(this.f34583f).size() - this.f34582e;
        if (size > 0) {
            this.f34578a.t(this.f34583f, C16877v.G0(C16877v.n0(this.f34578a.q(this.f34583f), size), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e A[Catch:{ all -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Throwable r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "level"
            kotlin.jvm.internal.C17542s.j(r7, r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.C17542s.j(r8, r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.C17542s.j(r9, r0)     // Catch:{ all -> 0x0066 }
            java.text.SimpleDateFormat r0 = r6.f34584g     // Catch:{ all -> 0x0066 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0066 }
            G8.t r2 = r6.f34579b     // Catch:{ all -> 0x0066 }
            long r2 = r2.a()     // Catch:{ all -> 0x0066 }
            r1.<init>(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r0.format(r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "formatter.format(Date(sy…ble.currentTimeMillis()))"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0066 }
            java.util.List<java.lang.String> r1 = r6.f34585h     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = "["
            r2.<init>(r3)     // Catch:{ all -> 0x0066 }
            r2.append(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "] "
            r2.append(r0)     // Catch:{ all -> 0x0066 }
            r2.append(r7)     // Catch:{ all -> 0x0066 }
            r7 = 32
            r2.append(r7)     // Catch:{ all -> 0x0066 }
            r2.append(r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = " ["
            r2.append(r7)     // Catch:{ all -> 0x0066 }
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x0066 }
            r2.append(r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "]: "
            r2.append(r7)     // Catch:{ all -> 0x0066 }
            r2.append(r9)     // Catch:{ all -> 0x0066 }
            r7 = 0
            if (r10 == 0) goto L_0x0068
            r8 = 0
            r9 = 1
            java.lang.String r8 = G8.g.b(r10, r8, r9, r7)     // Catch:{ all -> 0x0066 }
            if (r8 != 0) goto L_0x006a
            goto L_0x0068
        L_0x0066:
            r7 = move-exception
            goto L_0x0099
        L_0x0068:
            java.lang.String r8 = ""
        L_0x006a:
            r2.append(r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x0066 }
            r1.add(r8)     // Catch:{ all -> 0x0066 }
            java.util.List<java.lang.String> r8 = r6.f34585h     // Catch:{ all -> 0x0066 }
            int r8 = r8.size()     // Catch:{ all -> 0x0066 }
            int r9 = r6.f34581d     // Catch:{ all -> 0x0066 }
            if (r8 <= r9) goto L_0x0097
            java.util.List<java.lang.String> r8 = r6.f34585h     // Catch:{ all -> 0x0066 }
            java.util.List r8 = YH.C16877v.t1(r8)     // Catch:{ all -> 0x0066 }
            java.util.List<java.lang.String> r9 = r6.f34585h     // Catch:{ all -> 0x0066 }
            r9.clear()     // Catch:{ all -> 0x0066 }
            QJ.Q r0 = r6.f34580c     // Catch:{ all -> 0x0066 }
            D8.a$b r3 = new D8.a$b     // Catch:{ all -> 0x0066 }
            r3.<init>(r6, r8, r7)     // Catch:{ all -> 0x0066 }
            r4 = 3
            r5 = 0
            r1 = 0
            r2 = 0
            QJ.F0 unused = QJ.C16314k.d(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0066 }
        L_0x0097:
            monitor-exit(r6)
            return
        L_0x0099:
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public final void d() {
        List<T> t12 = C16877v.t1(this.f34585h);
        this.f34585h.clear();
        this.f34578a.t(this.f34583f, C16877v.G0(t12, "\n", "\n", (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 60, (Object) null), true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(G8.h r8, G8.t r9, QJ.Q r10, int r11, int r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x0009
            G8.h r8 = new G8.h
            r8.<init>()
        L_0x0009:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L_0x0013
            G8.t r9 = new G8.t
            r9.<init>()
        L_0x0013:
            r2 = r9
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0029
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r9 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.C17542s.i(r8, r9)
            QJ.v0 r8 = QJ.C16340x0.c(r8)
            QJ.Q r10 = QJ.S.a(r8)
        L_0x0029:
            r3 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L_0x0030
            r11 = 200(0xc8, float:2.8E-43)
        L_0x0030:
            r4 = r11
            r8 = r14 & 16
            if (r8 == 0) goto L_0x0037
            r12 = 10000(0x2710, float:1.4013E-41)
        L_0x0037:
            r5 = r12
            r0 = r7
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.a.<init>(G8.h, G8.t, QJ.Q, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
