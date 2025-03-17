package O8;

import b9.g;
import b9.h;
import b9.l;
import b9.n;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.google.protobuf.GeneratedMessageLite;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x8.C8958b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LO8/b;", "", "<init>", "()V", "Lx8/b;", "libraryInterface", "Lb9/n;", "threadReport", "", "errorSource", "", "timestamp", "Lb9/h;", "a", "(Lx8/b;Lb9/n;Ljava/lang/String;J)Lb9/h;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39270a = new b();

    private b() {
    }

    public final h a(C8958b bVar, n nVar, String str, long j10) {
        JsonConfig.ProjectConfiguration b10;
        C17542s.j(bVar, "libraryInterface");
        C17542s.j(nVar, "threadReport");
        C17542s.j(str, "errorSource");
        h.a G10 = h.r().G(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        v8.b d10 = bVar.d();
        h.a H10 = G10.I(j10 - (d10 != null ? d10.b() : 0)).K(nVar).H(l.OS_ANDROID);
        g.a t10 = g.t();
        A8.b a10 = bVar.a();
        int i10 = 0;
        g.a G11 = t10.G((a10 == null || (b10 = a10.b()) == null) ? 0 : b10.g());
        Integer b11 = bVar.b();
        g.a H11 = G11.H(b11 != null ? b11.intValue() : 0);
        v8.b d11 = bVar.d();
        if (d11 != null) {
            i10 = d11.a();
        }
        g.a E10 = H11.K(i10).E(str);
        String i11 = bVar.i();
        if (i11 == null) {
            i11 = "";
        }
        GeneratedMessageLite o10 = H10.E((g) E10.I(i11).g()).g();
        C17542s.i(o10, "newBuilder()\n           …   )\n            .build()");
        return (h) o10;
    }
}
