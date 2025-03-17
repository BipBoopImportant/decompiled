package M8;

import XH.C16796C;
import XH.v;
import YH.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17970f;
import tI.C17978n;
import x8.C8958b;
import y8.C8993b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LM8/d;", "", "Lx8/b;", "errorAnalysisLibraryInterface", "<init>", "(Lx8/b;)V", "", "name", "", "size", "maxSize", "LXH/N;", "c", "(Ljava/lang/String;JJ)V", "Ly8/b;", "event", "processingTime", "b", "(Ly8/b;J)V", "LM8/b;", "data", "a", "(LM8/b;)V", "Lx8/b;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38641b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C17970f<Double> f38642c = C17978n.b(Double.NEGATIVE_INFINITY, 0.4d);

    /* renamed from: d  reason: collision with root package name */
    private static final C17970f<Double> f38643d = C17978n.b(0.4d, 1.0d);

    /* renamed from: a  reason: collision with root package name */
    private final C8958b f38644a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006¨\u0006\u001c"}, d2 = {"LM8/d$a;", "", "<init>", "()V", "", "API_ERROR_COLLECTION_DURATION", "Ljava/lang/String;", "", "DURATION_LEVEL_1", "I", "DURATION_LEVEL_1_THRESHOLD", "DURATION_LEVEL_2", "DURATION_LEVEL_2_THRESHOLD", "DURATION_LEVEL_3", "ENCRYPTED_REQUEST_HEADERS_TOO_LARGE", "ENCRYPTED_RESPONSE_HEADERS_TOO_LARGE", "PLAIN_REQUEST_HEADERS_TOO_LARGE", "PLAIN_RESPONSE_HEADERS_TOO_LARGE", "QUERY_PARAMS_TOO_LARGE", "RANGE_1_VALUE", "RANGE_2_VALUE", "RANGE_3_VALUE", "REQUEST_BODY_ATTR_TOO_LARGE", "REQUEST_BODY_ATTR_VALUE_TOO_LARGE", "REQUEST_BODY_TOO_LARGE", "RESPONSE_BODY_ATTR_TOO_LARGE", "RESPONSE_BODY_ATTR_VALUE_TOO_LARGE", "RESPONSE_BODY_TOO_LARGE", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(C8958b bVar) {
        C17542s.j(bVar, "errorAnalysisLibraryInterface");
        this.f38644a = bVar;
    }

    public final void a(b bVar) {
        C17542s.j(bVar, "data");
        this.f38644a.e("api_error_collection_duration", bVar);
    }

    public final void b(C8993b bVar, long j10) {
        C17542s.j(bVar, "event");
        int i10 = j10 < 70 ? 1 : j10 < 100 ? 2 : 3;
        C8958b bVar2 = this.f38644a;
        C8958b.c cVar = C8958b.c.WARN;
        v a10 = C16796C.a("endpoint", bVar.E());
        v a11 = C16796C.a("processDuration", Long.valueOf(j10));
        byte[] p10 = bVar.p();
        int i11 = 0;
        v a12 = C16796C.a("requestBodySize", Integer.valueOf(p10 != null ? p10.length : 0));
        byte[] u10 = bVar.u();
        if (u10 != null) {
            i11 = u10.length;
        }
        C8958b.C0930b.a(bVar2, cVar, "Disabling body attributes collection due to high impact", (String) null, (String) null, (String) null, X.m(a10, a11, a12, C16796C.a("responseBodySize", Integer.valueOf(i11)), C16796C.a("durationLevel", Integer.valueOf(i10))), 28, (Object) null);
    }

    public final void c(String str, long j10, long j11) {
        C17542s.j(str, "name");
        float f10 = j11 == 0 ? 0.0f : ((float) (j10 - j11)) / ((float) j11);
        this.f38644a.e(str, Integer.valueOf(C17978n.r(f38642c, f10) ? 1 : C17978n.r(f38643d, f10) ? 2 : 3));
    }
}
