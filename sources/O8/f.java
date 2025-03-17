package O8;

import D8.c;
import YH.C16877v;
import b9.C7079a;
import b9.C7080b;
import b9.f;
import b9.n;
import com.google.protobuf.GeneratedMessageLite;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x8.C8958b;
import y8.C8992a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001\u0017B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001cH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b(\u0010\"J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010/J$\u00102\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\r2\b\b\u0002\u00101\u001a\u00020\u0014H\u0010¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010\u0011R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u0014\u0010>\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010=¨\u0006@"}, d2 = {"LO8/f;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "chainedHandler", "LO8/a;", "appData", "LO8/d;", "crashEventReporter", "Lx8/b;", "libraryInterface", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;LO8/a;LO8/d;Lx8/b;)V", "Ljava/lang/Thread;", "thread", "", "throwable", "LXH/N;", "h", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "", "appPackage", "", "causeDepth", "Lb9/f$b;", "a", "(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;I)Lb9/f$b;", "", "Ljava/lang/StackTraceElement;", "stackTrace", "", "Lb9/f$c;", "k", "([Ljava/lang/StackTraceElement;)Ljava/util/List;", "list", "m", "(Ljava/util/List;)Ljava/util/List;", "Lb9/f$e;", "d", "()Ljava/util/List;", "l", "(Ljava/lang/Thread;)Lb9/f$e;", "j", "frame", "other", "", "c", "(Lb9/f$c;Lb9/f$c;)Z", "i", "(Lb9/f$c;)Lb9/f$c;", "error", "result", "e", "(Ljava/lang/Throwable;I)I", "uncaughtException", "Ljava/lang/Thread$UncaughtExceptionHandler;", "g", "()Ljava/lang/Thread$UncaughtExceptionHandler;", "b", "LO8/a;", "LO8/d;", "Lx8/b;", "LD8/c;", "LD8/c;", "logger", "f", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements Thread.UncaughtExceptionHandler {

    /* renamed from: f  reason: collision with root package name */
    public static final a f39289f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f39290g = C16877v.e("com.facebook.react.common.JavascriptException");

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f39291a;

    /* renamed from: b  reason: collision with root package name */
    private final a f39292b;

    /* renamed from: c  reason: collision with root package name */
    private final d f39293c;

    /* renamed from: d  reason: collision with root package name */
    private final C8958b f39294d;

    /* renamed from: e  reason: collision with root package name */
    private final c f39295e = new c("ErrorAnalysisCrashHandler");

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"LO8/f$a;", "", "<init>", "()V", "", "", "EXCEPTIONS_TO_IGNORE", "Ljava/util/List;", "", "MAX_CAUSE_DEPTH", "I", "MAX_FRAMES", "MAX_FRAMES_TO_KEEP_FROM_BOTTOM", "MAX_FRAMES_TO_KEEP_FROM_TOP", "MAX_THREADS_TO_KEEP", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, a aVar, d dVar, C8958b bVar) {
        C17542s.j(aVar, "appData");
        C17542s.j(dVar, "crashEventReporter");
        C17542s.j(bVar, "libraryInterface");
        this.f39291a = uncaughtExceptionHandler;
        this.f39292b = aVar;
        this.f39293c = dVar;
        this.f39294d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r5.getCause();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final b9.f.b a(java.lang.Thread r4, java.lang.Throwable r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            r0 = 8
            r1 = 0
            if (r7 >= r0) goto L_0x0012
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x0012
            int r7 = r7 + 1
            b9.f$b r6 = r3.a(r4, r0, r6, r7)
            goto L_0x0013
        L_0x0012:
            r6 = r1
        L_0x0013:
            r7 = 0
            if (r6 != 0) goto L_0x0021
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x0021
            r0 = 2
            int r7 = f(r3, r5, r7, r0, r1)
        L_0x0021:
            b9.f$b$a r0 = b9.f.b.p()
            long r1 = r4.getId()
            int r4 = (int) r1
            b9.f$b$a r4 = r0.K(r4)
            b9.f$b$a r4 = r4.I(r7)
            b9.f$b$b$a r7 = b9.f.b.C0788b.k()
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = ""
        L_0x003e:
            b9.f$b$b$a r7 = r7.G(r0)
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            b9.f$b$b$a r7 = r7.E(r0)
            com.google.protobuf.GeneratedMessageLite r7 = r7.g()
            b9.f$b$b r7 = (b9.f.b.C0788b) r7
            b9.f$b$a r4 = r4.H(r7)
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            java.lang.String r7 = "throwable.stackTrace"
            kotlin.jvm.internal.C17542s.i(r5, r7)
            java.util.List r5 = r3.k(r5)
            b9.f$b$a r4 = r4.E(r5)
            if (r6 == 0) goto L_0x006e
            r4.G(r6)
        L_0x006e:
            com.google.protobuf.GeneratedMessageLite r4 = r4.g()
            java.lang.String r5 = "builder.build()"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            b9.f$b r4 = (b9.f.b) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O8.f.a(java.lang.Thread, java.lang.Throwable, java.lang.String, int):b9.f$b");
    }

    public static /* synthetic */ f.b b(f fVar, Thread thread, Throwable th2, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return fVar.a(thread, th2, str, i10);
    }

    private final boolean c(f.c cVar, f.c cVar2) {
        return C17542s.e(cVar.j().r(), cVar2.j().r()) && C17542s.e(cVar.j().o(), cVar2.j().o()) && C17542s.e(cVar.j().t(), cVar2.j().t()) && cVar.j().s() == cVar2.j().s();
    }

    private final List<f.e> d() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        C17542s.i(allStackTraces, "getAllStackTraces()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : allStackTraces.entrySet()) {
            Object value = next.getValue();
            C17542s.i(value, "stackTrace.value");
            if (!(((Object[]) value).length == 0)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry key : linkedHashMap.entrySet()) {
            arrayList.add((Thread) key.getKey());
        }
        List<Thread> k12 = C16877v.k1(arrayList, 64);
        ArrayList arrayList2 = new ArrayList(C16877v.y(k12, 10));
        for (Thread thread : k12) {
            C17542s.i(thread, "it");
            arrayList2.add(l(thread));
        }
        return arrayList2;
    }

    private final int e(Throwable th2, int i10) {
        while (true) {
            if ((th2 != null ? th2.getCause() : null) == null) {
                return i10;
            }
            th2 = th2.getCause();
            i10++;
        }
    }

    public static /* synthetic */ int f(f fVar, Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return fVar.e(th2, i10);
    }

    private final void h(Thread thread, Throwable th2) {
        try {
            if (f39290g.contains(th2.getClass().getName())) {
                this.f39295e.f("Discarding crash of type ".concat(th2.getClass().getName()));
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            b bVar = b.f39270a;
            C8958b bVar2 = this.f39294d;
            GeneratedMessageLite o10 = n.k().E((b9.f) b9.f.p().K(this.f39292b.b()).G(this.f39292b.c()).I(this.f39292b.a()).H(b(this, thread, th2, this.f39292b.b(), 0, 8, (Object) null)).E(d()).g()).g();
            C17542s.i(o10, "newBuilder().setAndroid(…                ).build()");
            this.f39293c.f(new C8992a(currentTimeMillis, bVar.a(bVar2, (n) o10, "native", currentTimeMillis)));
        } catch (Throwable th3) {
            this.f39295e.i(th3, "Failed to deal with crash");
        }
    }

    private final f.c i(f.c cVar) {
        C7079a.C0787a aVar = C7079a.f45633b;
        GeneratedMessageLite.a builder = cVar.toBuilder();
        C17542s.i(builder, "this.toBuilder()");
        C7079a a10 = aVar.a((f.c.a) builder);
        f.d j10 = cVar.j();
        C17542s.i(j10, "frame.javaFrame");
        C7080b.a aVar2 = C7080b.f45635b;
        GeneratedMessageLite.a builder2 = j10.toBuilder();
        C17542s.i(builder2, "this.toBuilder()");
        C7080b a11 = aVar2.a((f.d.a) builder2);
        a11.b(cVar.j().u() + 1);
        a10.b(a11.a());
        return a10.a();
    }

    private final List<f.c> j(List<f.c> list) {
        if (list.size() <= 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f.c cVar = list.get(0);
        int size = list.size();
        for (int i10 = 1; i10 < size; i10++) {
            f.c cVar2 = list.get(i10);
            if (c(cVar, cVar2)) {
                cVar = i(cVar);
            } else {
                arrayList.add(cVar);
                cVar = cVar2;
            }
        }
        arrayList.add(cVar);
        return arrayList;
    }

    private final List<f.c> k(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        int length = stackTraceElementArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            int i12 = i11 + 1;
            f.d.a H10 = f.d.v().H(i11);
            String fileName = stackTraceElement.getFileName();
            String str = "";
            if (fileName == null) {
                fileName = str;
            }
            f.d.a G10 = H10.G(fileName);
            String className = stackTraceElement.getClassName();
            if (className == null) {
                className = str;
            }
            f.d.a E10 = G10.E(className);
            String methodName = stackTraceElement.getMethodName();
            if (methodName != null) {
                str = methodName;
            }
            arrayList.add((f.c) f.c.k().E((f.d) E10.K(str).I(stackTraceElement.getLineNumber()).L(0).g()).g());
            i10++;
            i11 = i12;
        }
        return m(j(arrayList));
    }

    private final f.e l(Thread thread) {
        f.e.a H10 = f.e.n().G((int) thread.getId()).H(thread.getName());
        StackTraceElement[] stackTrace = thread.getStackTrace();
        C17542s.i(stackTrace, "thread.stackTrace");
        GeneratedMessageLite o10 = H10.E(k(stackTrace)).g();
        C17542s.i(o10, "newBuilder()\n           …ce))\n            .build()");
        return (f.e) o10;
    }

    private final List<f.c> m(List<f.c> list) {
        return list.size() <= 30 ? list : C16877v.V0(C16877v.k1(list, 15), C16877v.l1(list, 15));
    }

    public final Thread.UncaughtExceptionHandler g() {
        return this.f39291a;
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        C17542s.j(thread, "thread");
        C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
        h(thread, th2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f39291a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
