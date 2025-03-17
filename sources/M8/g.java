package M8;

import D8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import tI.C17970f;
import tI.C17978n;
import y8.C8993b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0013B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"LM8/g;", "", "Lkotlin/Function0;", "", "msTimer", "LM8/d;", "telemetrySender", "<init>", "(LnI/a;LM8/d;)V", "Ly8/b;", "event", "processedEvent", "processingTime", "LXH/N;", "b", "(Ly8/b;Ly8/b;J)V", "", "threshold", "", "a", "(Ljava/lang/Number;J)I", "Lkotlin/Function2;", "", "process", "c", "(Ly8/b;LnI/p;)Ly8/b;", "LnI/a;", "LM8/d;", "Z", "isBodyAttributeCollectionEnabled", "LD8/c;", "d", "LD8/c;", "logger", "e", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38647e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C17970f<Double> f38648f = C17978n.b(Double.NEGATIVE_INFINITY, 1.0d);

    /* renamed from: g  reason: collision with root package name */
    private static final C17970f<Double> f38649g = C17978n.b(1.0d, 2.0d);

    /* renamed from: h  reason: collision with root package name */
    private static final C17970f<Double> f38650h = C17978n.b(2.0d, 4.0d);

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<Long> f38651a;

    /* renamed from: b  reason: collision with root package name */
    private final d f38652b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f38653c = true;

    /* renamed from: d  reason: collision with root package name */
    private final c f38654d = new c("EventProcessorPerformanceManager");

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"LM8/g$a;", "", "<init>", "()V", "", "BODY_SIZE_THRESHOLD", "J", "", "LOG_EVENT_DURATION_LEVEL", "Ljava/lang/String;", "LOG_EVENT_ENDPOINT", "LOG_EVENT_PROCESS_DURATION", "LOG_EVENT_REQUEST_BODY_SIZE", "LOG_EVENT_RESPONSE_BODY_SIZE", "", "METRIC_LEVEL_0", "I", "METRIC_LEVEL_1", "METRIC_LEVEL_2", "METRIC_LEVEL_3", "LtI/f;", "", "METRIC_RANGE_1", "LtI/f;", "METRIC_RANGE_2", "METRIC_RANGE_3", "PROCESSING_TIME_THRESHOLD_MS", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(C17631a<Long> aVar, d dVar) {
        C17542s.j(aVar, "msTimer");
        C17542s.j(dVar, "telemetrySender");
        this.f38651a = aVar;
        this.f38652b = dVar;
    }

    private final int a(Number number, long j10) {
        double doubleValue = j10 == 0 ? 0.0d : number.doubleValue() / ((double) j10);
        if (f38648f.b(Double.valueOf(doubleValue))) {
            return 0;
        }
        if (f38649g.b(Double.valueOf(doubleValue))) {
            return 1;
        }
        return f38650h.b(Double.valueOf(doubleValue)) ? 2 : 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r3 = r9.r();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(y8.C8993b r8, y8.C8993b r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.f38653c
            if (r0 == 0) goto L_0x0013
            r0 = 0
            r7.f38653c = r0
            D8.c r0 = r7.f38654d
            java.lang.String r1 = "API Processing disabling body attribute collection"
            r0.j(r1)
            M8.d r0 = r7.f38652b
            r0.b(r8, r10)
        L_0x0013:
            M8.b r8 = new M8.b
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r1 = 50
            int r4 = r7.a(r0, r1)
            r0 = 0
            r1 = 20000(0x4e20, double:9.8813E-320)
            if (r9 == 0) goto L_0x0034
            java.lang.Integer r3 = r9.r()
            if (r3 == 0) goto L_0x0034
            int r3 = r7.a(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = r3
            goto L_0x0035
        L_0x0034:
            r5 = r0
        L_0x0035:
            if (r9 == 0) goto L_0x0047
            java.lang.Integer r9 = r9.w()
            if (r9 == 0) goto L_0x0047
            int r9 = r7.a(r9, r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6 = r9
            goto L_0x0048
        L_0x0047:
            r6 = r0
        L_0x0048:
            r1 = r8
            r2 = r10
            r1.<init>(r2, r4, r5, r6)
            M8.d r9 = r7.f38652b
            r9.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M8.g.b(y8.b, y8.b, long):void");
    }

    public final C8993b c(C8993b bVar, p<? super C8993b, ? super Boolean, C8993b> pVar) {
        C17542s.j(bVar, "event");
        C17542s.j(pVar, "process");
        long longValue = this.f38651a.invoke().longValue();
        C8993b invoke = pVar.invoke(bVar, Boolean.valueOf(this.f38653c));
        long longValue2 = this.f38651a.invoke().longValue() - longValue;
        c cVar = this.f38654d;
        cVar.j("API Processing took " + longValue2 + "ms");
        if (longValue2 > 50) {
            b(bVar, invoke, longValue2);
        }
        return invoke;
    }
}
