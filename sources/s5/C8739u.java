package s5;

import YH.C16877v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7055y;
import androidx.work.H;
import androidx.work.Q;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q.C5759a;
import tI.C17978n;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b3\b\b\u0018\u0000 \\2\u00020\u0001:\u0003<>0Bõ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b#\u0010&B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0000¢\u0006\u0004\b#\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b-\u0010,J\u001d\u0010.\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b6\u0010=R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\n\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b2\u0010KR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bM\u0010DR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b+\u0010DR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0016\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b-\u0010QR\"\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010J\u001a\u0004\bF\u00109\"\u0004\bR\u0010SR\u001a\u0010\u001e\u001a\u00020\u00118\u0006X\u0004¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bB\u00109R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010D\u001a\u0004\bC\u00101\"\u0004\bN\u0010,R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010J\u001a\u0004\bE\u00109\"\u0004\bO\u0010SR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0004¢\u0006\f\n\u0004\bW\u0010J\u001a\u0004\bG\u00109R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010=\u001a\u0004\bI\u00105\"\u0004\bT\u0010YR\u0011\u0010Z\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bM\u00103R\u0011\u0010[\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bL\u00103¨\u0006]"}, d2 = {"Ls5/u;", "", "", "id", "Landroidx/work/Q$c;", "state", "workerClassName", "inputMergerClassName", "Landroidx/work/f;", "input", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/e;", "constraints", "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "", "expedited", "Landroidx/work/H;", "outOfQuotaPolicy", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "<init>", "(Ljava/lang/String;Landroidx/work/Q$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/f;Landroidx/work/f;JJJLandroidx/work/e;ILandroidx/work/a;JJJJZLandroidx/work/H;IIJIILjava/lang/String;)V", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Ls5/u;)V", "LXH/N;", "o", "(J)V", "r", "s", "(JJ)V", "c", "()J", "l", "()Z", "toString", "()Ljava/lang/String;", "d", "(Ljava/lang/String;Landroidx/work/Q$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/f;Landroidx/work/f;JJJLandroidx/work/e;ILandroidx/work/a;JJJJZLandroidx/work/H;IIJIILjava/lang/String;)Ls5/u;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroidx/work/Q$c;", "e", "Landroidx/work/f;", "f", "g", "J", "h", "i", "j", "Landroidx/work/e;", "k", "I", "Landroidx/work/a;", "m", "n", "p", "q", "Z", "Landroidx/work/H;", "setPeriodCount", "(I)V", "t", "u", "v", "w", "x", "(Ljava/lang/String;)V", "isPeriodic", "isBackedOff", "y", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s5.u  reason: case insensitive filesystem */
public final class C8739u {

    /* renamed from: A  reason: collision with root package name */
    public static final C5759a<List<c>, List<Q>> f55907A = new C8738t();

    /* renamed from: y  reason: collision with root package name */
    public static final a f55908y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    private static final String f55909z;

    /* renamed from: a  reason: collision with root package name */
    public final String f55910a;

    /* renamed from: b  reason: collision with root package name */
    public Q.c f55911b;

    /* renamed from: c  reason: collision with root package name */
    public String f55912c;

    /* renamed from: d  reason: collision with root package name */
    public String f55913d;

    /* renamed from: e  reason: collision with root package name */
    public C7037f f55914e;

    /* renamed from: f  reason: collision with root package name */
    public C7037f f55915f;

    /* renamed from: g  reason: collision with root package name */
    public long f55916g;

    /* renamed from: h  reason: collision with root package name */
    public long f55917h;

    /* renamed from: i  reason: collision with root package name */
    public long f55918i;

    /* renamed from: j  reason: collision with root package name */
    public C7036e f55919j;

    /* renamed from: k  reason: collision with root package name */
    public int f55920k;

    /* renamed from: l  reason: collision with root package name */
    public C7032a f55921l;

    /* renamed from: m  reason: collision with root package name */
    public long f55922m;

    /* renamed from: n  reason: collision with root package name */
    public long f55923n;

    /* renamed from: o  reason: collision with root package name */
    public long f55924o;

    /* renamed from: p  reason: collision with root package name */
    public long f55925p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f55926q;

    /* renamed from: r  reason: collision with root package name */
    public H f55927r;

    /* renamed from: s  reason: collision with root package name */
    private int f55928s;

    /* renamed from: t  reason: collision with root package name */
    private final int f55929t;

    /* renamed from: u  reason: collision with root package name */
    private long f55930u;

    /* renamed from: v  reason: collision with root package name */
    private int f55931v;

    /* renamed from: w  reason: collision with root package name */
    private final int f55932w;

    /* renamed from: x  reason: collision with root package name */
    private String f55933x;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R,\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ls5/u$a;", "", "<init>", "()V", "", "isBackedOff", "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "a", "(ZILandroidx/work/a;JJIZJJJJ)J", "SCHEDULE_NOT_REQUESTED_YET", "J", "", "TAG", "Ljava/lang/String;", "Lq/a;", "", "Ls5/u$c;", "Landroidx/work/Q;", "WORK_INFO_MAPPER", "Lq/a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s5.u$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(boolean z10, int i10, C7032a aVar, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            int i12 = i10;
            C7032a aVar2 = aVar;
            long j16 = j10;
            long j17 = j15;
            C17542s.j(aVar, "backoffPolicy");
            if (j17 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j17 : C17978n.f(j17, 900000 + j11);
            }
            if (z10) {
                return j11 + C17978n.j(aVar2 == C7032a.LINEAR ? ((long) i12) * j16 : (long) Math.scalb((float) j16, i12 - 1), 18000000);
            } else if (z11) {
                long j18 = i11 == 0 ? j11 + j12 : j11 + j14;
                if (j13 != j14 && i11 == 0) {
                    j18 += j14 - j13;
                }
                return j18;
            } else if (j11 == -1) {
                return Long.MAX_VALUE;
            } else {
                return j11 + j12;
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls5/u$b;", "", "", "id", "Landroidx/work/Q$c;", "state", "<init>", "(Ljava/lang/String;Landroidx/work/Q$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroidx/work/Q$c;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s5.u$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f55934a;

        /* renamed from: b  reason: collision with root package name */
        public Q.c f55935b;

        public b(String str, Q.c cVar) {
            C17542s.j(str, "id");
            C17542s.j(cVar, "state");
            this.f55934a = str;
            this.f55935b = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f55934a, bVar.f55934a) && this.f55935b == bVar.f55935b;
        }

        public int hashCode() {
            return (this.f55934a.hashCode() * 31) + this.f55935b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f55934a + ", state=" + this.f55935b + ')';
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b9\b\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b.\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b9\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010LR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u0010!\"\u0004\bO\u0010LR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010A\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0004¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010(R\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0004¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010!R\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0004¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010(R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006X\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0006X\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u0011\u0010a\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010`R\u0011\u0010b\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b2\u0010`¨\u0006c"}, d2 = {"Ls5/u$c;", "", "", "id", "Landroidx/work/Q$c;", "state", "Landroidx/work/f;", "output", "", "initialDelay", "intervalDuration", "flexDuration", "Landroidx/work/e;", "constraints", "", "runAttemptCount", "Landroidx/work/a;", "backoffPolicy", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "", "tags", "progress", "<init>", "(Ljava/lang/String;Landroidx/work/Q$c;Landroidx/work/f;JJJLandroidx/work/e;ILandroidx/work/a;JJIIJILjava/util/List;Ljava/util/List;)V", "Landroidx/work/Q$b;", "b", "()Landroidx/work/Q$b;", "a", "()J", "Landroidx/work/Q;", "e", "()Landroidx/work/Q;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Landroidx/work/Q$c;", "getState", "()Landroidx/work/Q$c;", "c", "Landroidx/work/f;", "getOutput", "()Landroidx/work/f;", "d", "J", "getInitialDelay", "getIntervalDuration", "f", "getFlexDuration", "g", "Landroidx/work/e;", "getConstraints", "()Landroidx/work/e;", "h", "I", "getRunAttemptCount", "i", "Landroidx/work/a;", "getBackoffPolicy", "()Landroidx/work/a;", "setBackoffPolicy", "(Landroidx/work/a;)V", "j", "getBackoffDelayDuration", "setBackoffDelayDuration", "(J)V", "k", "getLastEnqueueTime", "setLastEnqueueTime", "l", "getPeriodCount", "setPeriodCount", "(I)V", "m", "getGeneration", "n", "getNextScheduleTimeOverride", "o", "getStopReason", "p", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "q", "getProgress", "()Z", "isPeriodic", "isBackedOff", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s5.u$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f55936a;

        /* renamed from: b  reason: collision with root package name */
        private final Q.c f55937b;

        /* renamed from: c  reason: collision with root package name */
        private final C7037f f55938c;

        /* renamed from: d  reason: collision with root package name */
        private final long f55939d;

        /* renamed from: e  reason: collision with root package name */
        private final long f55940e;

        /* renamed from: f  reason: collision with root package name */
        private final long f55941f;

        /* renamed from: g  reason: collision with root package name */
        private final C7036e f55942g;

        /* renamed from: h  reason: collision with root package name */
        private final int f55943h;

        /* renamed from: i  reason: collision with root package name */
        private C7032a f55944i;

        /* renamed from: j  reason: collision with root package name */
        private long f55945j;

        /* renamed from: k  reason: collision with root package name */
        private long f55946k;

        /* renamed from: l  reason: collision with root package name */
        private int f55947l;

        /* renamed from: m  reason: collision with root package name */
        private final int f55948m;

        /* renamed from: n  reason: collision with root package name */
        private final long f55949n;

        /* renamed from: o  reason: collision with root package name */
        private final int f55950o;

        /* renamed from: p  reason: collision with root package name */
        private final List<String> f55951p;

        /* renamed from: q  reason: collision with root package name */
        private final List<C7037f> f55952q;

        public c(String str, Q.c cVar, C7037f fVar, long j10, long j11, long j12, C7036e eVar, int i10, C7032a aVar, long j13, long j14, int i11, int i12, long j15, int i13, List<String> list, List<C7037f> list2) {
            C7036e eVar2 = eVar;
            C7032a aVar2 = aVar;
            List<String> list3 = list;
            List<C7037f> list4 = list2;
            C17542s.j(str, "id");
            C17542s.j(cVar, "state");
            C17542s.j(fVar, "output");
            C17542s.j(eVar2, "constraints");
            C17542s.j(aVar2, "backoffPolicy");
            C17542s.j(list3, "tags");
            C17542s.j(list4, "progress");
            this.f55936a = str;
            this.f55937b = cVar;
            this.f55938c = fVar;
            this.f55939d = j10;
            this.f55940e = j11;
            this.f55941f = j12;
            this.f55942g = eVar2;
            this.f55943h = i10;
            this.f55944i = aVar2;
            this.f55945j = j13;
            this.f55946k = j14;
            this.f55947l = i11;
            this.f55948m = i12;
            this.f55949n = j15;
            this.f55950o = i13;
            this.f55951p = list3;
            this.f55952q = list4;
        }

        private final long a() {
            if (this.f55937b == Q.c.ENQUEUED) {
                return C8739u.f55908y.a(c(), this.f55943h, this.f55944i, this.f55945j, this.f55946k, this.f55947l, d(), this.f55939d, this.f55941f, this.f55940e, this.f55949n);
            }
            return Long.MAX_VALUE;
        }

        private final Q.b b() {
            long j10 = this.f55940e;
            if (j10 != 0) {
                return new Q.b(j10, this.f55941f);
            }
            return null;
        }

        public final boolean c() {
            return this.f55937b == Q.c.ENQUEUED && this.f55943h > 0;
        }

        public final boolean d() {
            return this.f55940e != 0;
        }

        public final Q e() {
            C7037f fVar = !this.f55952q.isEmpty() ? this.f55952q.get(0) : C7037f.f45197c;
            UUID fromString = UUID.fromString(this.f55936a);
            C17542s.i(fromString, "fromString(id)");
            return new Q(fromString, this.f55937b, new HashSet(this.f55951p), this.f55938c, fVar, this.f55943h, this.f55948m, this.f55942g, this.f55939d, b(), a(), this.f55950o);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f55936a, cVar.f55936a) && this.f55937b == cVar.f55937b && C17542s.e(this.f55938c, cVar.f55938c) && this.f55939d == cVar.f55939d && this.f55940e == cVar.f55940e && this.f55941f == cVar.f55941f && C17542s.e(this.f55942g, cVar.f55942g) && this.f55943h == cVar.f55943h && this.f55944i == cVar.f55944i && this.f55945j == cVar.f55945j && this.f55946k == cVar.f55946k && this.f55947l == cVar.f55947l && this.f55948m == cVar.f55948m && this.f55949n == cVar.f55949n && this.f55950o == cVar.f55950o && C17542s.e(this.f55951p, cVar.f55951p) && C17542s.e(this.f55952q, cVar.f55952q);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f55936a.hashCode() * 31) + this.f55937b.hashCode()) * 31) + this.f55938c.hashCode()) * 31) + Long.hashCode(this.f55939d)) * 31) + Long.hashCode(this.f55940e)) * 31) + Long.hashCode(this.f55941f)) * 31) + this.f55942g.hashCode()) * 31) + Integer.hashCode(this.f55943h)) * 31) + this.f55944i.hashCode()) * 31) + Long.hashCode(this.f55945j)) * 31) + Long.hashCode(this.f55946k)) * 31) + Integer.hashCode(this.f55947l)) * 31) + Integer.hashCode(this.f55948m)) * 31) + Long.hashCode(this.f55949n)) * 31) + Integer.hashCode(this.f55950o)) * 31) + this.f55951p.hashCode()) * 31) + this.f55952q.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f55936a + ", state=" + this.f55937b + ", output=" + this.f55938c + ", initialDelay=" + this.f55939d + ", intervalDuration=" + this.f55940e + ", flexDuration=" + this.f55941f + ", constraints=" + this.f55942g + ", runAttemptCount=" + this.f55943h + ", backoffPolicy=" + this.f55944i + ", backoffDelayDuration=" + this.f55945j + ", lastEnqueueTime=" + this.f55946k + ", periodCount=" + this.f55947l + ", generation=" + this.f55948m + ", nextScheduleTimeOverride=" + this.f55949n + ", stopReason=" + this.f55950o + ", tags=" + this.f55951p + ", progress=" + this.f55952q + ')';
        }
    }

    static {
        String i10 = C7055y.i("WorkSpec");
        C17542s.i(i10, "tagWithPrefix(\"WorkSpec\")");
        f55909z = i10;
    }

    public C8739u(String str, Q.c cVar, String str2, String str3, C7037f fVar, C7037f fVar2, long j10, long j11, long j12, C7036e eVar, int i10, C7032a aVar, long j13, long j14, long j15, long j16, boolean z10, H h10, int i11, int i12, long j17, int i13, int i14, String str4) {
        C7037f fVar3 = fVar;
        C7037f fVar4 = fVar2;
        C7036e eVar2 = eVar;
        C7032a aVar2 = aVar;
        H h11 = h10;
        C17542s.j(str, "id");
        C17542s.j(cVar, "state");
        C17542s.j(str2, "workerClassName");
        C17542s.j(str3, "inputMergerClassName");
        C17542s.j(fVar3, "input");
        C17542s.j(fVar4, "output");
        C17542s.j(eVar2, "constraints");
        C17542s.j(aVar2, "backoffPolicy");
        C17542s.j(h11, "outOfQuotaPolicy");
        this.f55910a = str;
        this.f55911b = cVar;
        this.f55912c = str2;
        this.f55913d = str3;
        this.f55914e = fVar3;
        this.f55915f = fVar4;
        this.f55916g = j10;
        this.f55917h = j11;
        this.f55918i = j12;
        this.f55919j = eVar2;
        this.f55920k = i10;
        this.f55921l = aVar2;
        this.f55922m = j13;
        this.f55923n = j14;
        this.f55924o = j15;
        this.f55925p = j16;
        this.f55926q = z10;
        this.f55927r = h11;
        this.f55928s = i11;
        this.f55929t = i12;
        this.f55930u = j17;
        this.f55931v = i13;
        this.f55932w = i14;
        this.f55933x = str4;
    }

    /* access modifiers changed from: private */
    public static final List b(List list) {
        if (list == null) {
            return null;
        }
        Iterable<c> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (c e10 : iterable) {
            arrayList.add(e10.e());
        }
        return arrayList;
    }

    public static /* synthetic */ C8739u e(C8739u uVar, String str, Q.c cVar, String str2, String str3, C7037f fVar, C7037f fVar2, long j10, long j11, long j12, C7036e eVar, int i10, C7032a aVar, long j13, long j14, long j15, long j16, boolean z10, H h10, int i11, int i12, long j17, int i13, int i14, String str4, int i15, Object obj) {
        C8739u uVar2 = uVar;
        int i16 = i15;
        String str5 = (i16 & 1) != 0 ? uVar2.f55910a : str;
        Q.c cVar2 = (i16 & 2) != 0 ? uVar2.f55911b : cVar;
        String str6 = (i16 & 4) != 0 ? uVar2.f55912c : str2;
        String str7 = (i16 & 8) != 0 ? uVar2.f55913d : str3;
        C7037f fVar3 = (i16 & 16) != 0 ? uVar2.f55914e : fVar;
        C7037f fVar4 = (i16 & 32) != 0 ? uVar2.f55915f : fVar2;
        long j18 = (i16 & 64) != 0 ? uVar2.f55916g : j10;
        long j19 = (i16 & 128) != 0 ? uVar2.f55917h : j11;
        long j20 = (i16 & 256) != 0 ? uVar2.f55918i : j12;
        C7036e eVar2 = (i16 & 512) != 0 ? uVar2.f55919j : eVar;
        return uVar.d(str5, cVar2, str6, str7, fVar3, fVar4, j18, j19, j20, eVar2, (i16 & 1024) != 0 ? uVar2.f55920k : i10, (i16 & RecyclerView.n.FLAG_MOVED) != 0 ? uVar2.f55921l : aVar, (i16 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? uVar2.f55922m : j13, (i16 & 8192) != 0 ? uVar2.f55923n : j14, (i16 & 16384) != 0 ? uVar2.f55924o : j15, (i16 & 32768) != 0 ? uVar2.f55925p : j16, (i16 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uVar2.f55926q : z10, (131072 & i16) != 0 ? uVar2.f55927r : h10, (i16 & 262144) != 0 ? uVar2.f55928s : i11, (i16 & ImageMetadata.LENS_APERTURE) != 0 ? uVar2.f55929t : i12, (i16 & ImageMetadata.SHADING_MODE) != 0 ? uVar2.f55930u : j17, (i16 & UploadKt.MAX_CHUNK_SIZE) != 0 ? uVar2.f55931v : i13, (4194304 & i16) != 0 ? uVar2.f55932w : i14, (i16 & 8388608) != 0 ? uVar2.f55933x : str4);
    }

    public final long c() {
        a aVar = f55908y;
        return aVar.a(m(), this.f55920k, this.f55921l, this.f55922m, this.f55923n, this.f55928s, n(), this.f55916g, this.f55918i, this.f55917h, this.f55930u);
    }

    public final C8739u d(String str, Q.c cVar, String str2, String str3, C7037f fVar, C7037f fVar2, long j10, long j11, long j12, C7036e eVar, int i10, C7032a aVar, long j13, long j14, long j15, long j16, boolean z10, H h10, int i11, int i12, long j17, int i13, int i14, String str4) {
        String str5 = str;
        C17542s.j(str5, "id");
        C17542s.j(cVar, "state");
        C17542s.j(str2, "workerClassName");
        C17542s.j(str3, "inputMergerClassName");
        C17542s.j(fVar, "input");
        C17542s.j(fVar2, "output");
        C17542s.j(eVar, "constraints");
        C17542s.j(aVar, "backoffPolicy");
        C17542s.j(h10, "outOfQuotaPolicy");
        return new C8739u(str5, cVar, str2, str3, fVar, fVar2, j10, j11, j12, eVar, i10, aVar, j13, j14, j15, j16, z10, h10, i11, i12, j17, i13, i14, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8739u)) {
            return false;
        }
        C8739u uVar = (C8739u) obj;
        return C17542s.e(this.f55910a, uVar.f55910a) && this.f55911b == uVar.f55911b && C17542s.e(this.f55912c, uVar.f55912c) && C17542s.e(this.f55913d, uVar.f55913d) && C17542s.e(this.f55914e, uVar.f55914e) && C17542s.e(this.f55915f, uVar.f55915f) && this.f55916g == uVar.f55916g && this.f55917h == uVar.f55917h && this.f55918i == uVar.f55918i && C17542s.e(this.f55919j, uVar.f55919j) && this.f55920k == uVar.f55920k && this.f55921l == uVar.f55921l && this.f55922m == uVar.f55922m && this.f55923n == uVar.f55923n && this.f55924o == uVar.f55924o && this.f55925p == uVar.f55925p && this.f55926q == uVar.f55926q && this.f55927r == uVar.f55927r && this.f55928s == uVar.f55928s && this.f55929t == uVar.f55929t && this.f55930u == uVar.f55930u && this.f55931v == uVar.f55931v && this.f55932w == uVar.f55932w && C17542s.e(this.f55933x, uVar.f55933x);
    }

    public final int f() {
        return this.f55929t;
    }

    public final long g() {
        return this.f55930u;
    }

    public final int h() {
        return this.f55931v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.f55910a.hashCode() * 31) + this.f55911b.hashCode()) * 31) + this.f55912c.hashCode()) * 31) + this.f55913d.hashCode()) * 31) + this.f55914e.hashCode()) * 31) + this.f55915f.hashCode()) * 31) + Long.hashCode(this.f55916g)) * 31) + Long.hashCode(this.f55917h)) * 31) + Long.hashCode(this.f55918i)) * 31) + this.f55919j.hashCode()) * 31) + Integer.hashCode(this.f55920k)) * 31) + this.f55921l.hashCode()) * 31) + Long.hashCode(this.f55922m)) * 31) + Long.hashCode(this.f55923n)) * 31) + Long.hashCode(this.f55924o)) * 31) + Long.hashCode(this.f55925p)) * 31) + Boolean.hashCode(this.f55926q)) * 31) + this.f55927r.hashCode()) * 31) + Integer.hashCode(this.f55928s)) * 31) + Integer.hashCode(this.f55929t)) * 31) + Long.hashCode(this.f55930u)) * 31) + Integer.hashCode(this.f55931v)) * 31) + Integer.hashCode(this.f55932w)) * 31;
        String str = this.f55933x;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final int i() {
        return this.f55928s;
    }

    public final int j() {
        return this.f55932w;
    }

    public final String k() {
        return this.f55933x;
    }

    public final boolean l() {
        return !C17542s.e(C7036e.f45175k, this.f55919j);
    }

    public final boolean m() {
        return this.f55911b == Q.c.ENQUEUED && this.f55920k > 0;
    }

    public final boolean n() {
        return this.f55917h != 0;
    }

    public final void o(long j10) {
        if (j10 > 18000000) {
            C7055y.e().k(f55909z, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < 10000) {
            C7055y.e().k(f55909z, "Backoff delay duration less than minimum value");
        }
        this.f55922m = C17978n.o(j10, 10000, 18000000);
    }

    public final void p(long j10) {
        this.f55930u = j10;
    }

    public final void q(int i10) {
        this.f55931v = i10;
    }

    public final void r(long j10) {
        if (j10 < 900000) {
            C7055y.e().k(f55909z, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        s(C17978n.f(j10, 900000), C17978n.f(j10, 900000));
    }

    public final void s(long j10, long j11) {
        if (j10 < 900000) {
            C7055y.e().k(f55909z, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f55917h = C17978n.f(j10, 900000);
        if (j11 < 300000) {
            C7055y.e().k(f55909z, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.f55917h) {
            C7055y e10 = C7055y.e();
            String str = f55909z;
            e10.k(str, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.f55918i = C17978n.o(j11, 300000, this.f55917h);
    }

    public final void t(String str) {
        this.f55933x = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.f55910a + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8739u(java.lang.String r36, androidx.work.Q.c r37, java.lang.String r38, java.lang.String r39, androidx.work.C7037f r40, androidx.work.C7037f r41, long r42, long r44, long r46, androidx.work.C7036e r48, int r49, androidx.work.C7032a r50, long r51, long r53, long r55, long r57, boolean r59, androidx.work.H r60, int r61, int r62, long r63, int r65, int r66, java.lang.String r67, int r68, kotlin.jvm.internal.DefaultConstructorMarker r69) {
        /*
            r35 = this;
            r0 = r68
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.Q$c r1 = androidx.work.Q.c.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r37
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            java.lang.Class<androidx.work.OverwritingInputMerger> r1 = androidx.work.OverwritingInputMerger.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OverwritingInputMerger::class.java.name"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            r6 = r1
            goto L_0x001f
        L_0x001d:
            r6 = r39
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0027
            androidx.work.f r1 = androidx.work.C7037f.f45197c
            r7 = r1
            goto L_0x0029
        L_0x0027:
            r7 = r40
        L_0x0029:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            androidx.work.f r1 = androidx.work.C7037f.f45197c
            r8 = r1
            goto L_0x0033
        L_0x0031:
            r8 = r41
        L_0x0033:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x003b
            r9 = r2
            goto L_0x003d
        L_0x003b:
            r9 = r42
        L_0x003d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0043
            r11 = r2
            goto L_0x0045
        L_0x0043:
            r11 = r44
        L_0x0045:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004b
            r13 = r2
            goto L_0x004d
        L_0x004b:
            r13 = r46
        L_0x004d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0055
            androidx.work.e r1 = androidx.work.C7036e.f45175k
            r15 = r1
            goto L_0x0057
        L_0x0055:
            r15 = r48
        L_0x0057:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005f
            r16 = r5
            goto L_0x0061
        L_0x005f:
            r16 = r49
        L_0x0061:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x006a
            androidx.work.a r1 = androidx.work.C7032a.EXPONENTIAL
            r17 = r1
            goto L_0x006c
        L_0x006a:
            r17 = r50
        L_0x006c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0073
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0075
        L_0x0073:
            r18 = r51
        L_0x0075:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r20 = -1
            if (r1 == 0) goto L_0x007e
            r22 = r20
            goto L_0x0080
        L_0x007e:
            r22 = r53
        L_0x0080:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0087
            r24 = r2
            goto L_0x0089
        L_0x0087:
            r24 = r55
        L_0x0089:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r26 = r20
            goto L_0x0094
        L_0x0092:
            r26 = r57
        L_0x0094:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            r1 = r5
            goto L_0x009d
        L_0x009b:
            r1 = r59
        L_0x009d:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00a7
            androidx.work.H r2 = androidx.work.H.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r28 = r2
            goto L_0x00a9
        L_0x00a7:
            r28 = r60
        L_0x00a9:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b1
            r29 = r5
            goto L_0x00b3
        L_0x00b1:
            r29 = r61
        L_0x00b3:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00bb
            r30 = r5
            goto L_0x00bd
        L_0x00bb:
            r30 = r62
        L_0x00bd:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00ca
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = r2
            goto L_0x00cc
        L_0x00ca:
            r31 = r63
        L_0x00cc:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d4
            r33 = r5
            goto L_0x00d6
        L_0x00d4:
            r33 = r65
        L_0x00d6:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00e0
            r2 = -256(0xffffffffffffff00, float:NaN)
            r34 = r2
            goto L_0x00e2
        L_0x00e0:
            r34 = r66
        L_0x00e2:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00e9
            r0 = 0
            goto L_0x00eb
        L_0x00e9:
            r0 = r67
        L_0x00eb:
            r2 = r35
            r3 = r36
            r5 = r38
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r1
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r32 = r33
            r33 = r34
            r34 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29, r30, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8739u.<init>(java.lang.String, androidx.work.Q$c, java.lang.String, java.lang.String, androidx.work.f, androidx.work.f, long, long, long, androidx.work.e, int, androidx.work.a, long, long, long, long, boolean, androidx.work.H, int, int, long, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8739u(String str, String str2) {
        this(str, (Q.c) null, str2, (String) null, (C7037f) null, (C7037f) null, 0, 0, 0, (C7036e) null, 0, (C7032a) null, 0, 0, 0, 0, false, (H) null, 0, 0, 0, 0, 0, (String) null, 16777210, (DefaultConstructorMarker) null);
        C17542s.j(str, "id");
        C17542s.j(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8739u(java.lang.String r39, s5.C8739u r40) {
        /*
            r38 = this;
            r0 = r40
            r1 = r38
            r2 = r39
            java.lang.String r3 = "newId"
            r4 = r39
            kotlin.jvm.internal.C17542s.j(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r4 = r0.f55912c
            androidx.work.Q$c r3 = r0.f55911b
            java.lang.String r5 = r0.f55913d
            androidx.work.f r7 = new androidx.work.f
            r6 = r7
            androidx.work.f r8 = r0.f55914e
            r7.<init>((androidx.work.C7037f) r8)
            androidx.work.f r8 = new androidx.work.f
            r7 = r8
            androidx.work.f r9 = r0.f55915f
            r8.<init>((androidx.work.C7037f) r9)
            long r8 = r0.f55916g
            long r10 = r0.f55917h
            long r12 = r0.f55918i
            androidx.work.e r15 = new androidx.work.e
            r14 = r15
            r36 = r1
            androidx.work.e r1 = r0.f55919j
            r15.<init>(r1)
            int r15 = r0.f55920k
            androidx.work.a r1 = r0.f55921l
            r16 = r1
            r37 = r2
            long r1 = r0.f55922m
            r17 = r1
            long r1 = r0.f55923n
            r19 = r1
            long r1 = r0.f55924o
            r21 = r1
            long r1 = r0.f55925p
            r23 = r1
            boolean r1 = r0.f55926q
            r25 = r1
            androidx.work.H r1 = r0.f55927r
            r26 = r1
            int r1 = r0.f55928s
            r27 = r1
            long r1 = r0.f55930u
            r29 = r1
            int r1 = r0.f55931v
            r31 = r1
            int r1 = r0.f55932w
            r32 = r1
            java.lang.String r0 = r0.f55933x
            r33 = r0
            r34 = 524288(0x80000, float:7.34684E-40)
            r35 = 0
            r28 = 0
            r1 = r36
            r2 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.C8739u.<init>(java.lang.String, s5.u):void");
    }
}
