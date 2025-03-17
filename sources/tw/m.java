package tw;

import GK.C15784c;
import GK.C15804w;
import GK.z;
import QL.h;
import QL.y;
import YH.C16877v;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jm.C11429a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 \"2\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Ltw/m;", "Ltw/l;", "", "id", "LGK/c;", "cache", "", "timeout", "", "LGK/w;", "interceptors", "networkInterceptors", "Ljm/a;", "backendUrls", "LQL/h$a;", "converterFactory", "<init>", "(Ljava/lang/String;LGK/c;JLjava/util/List;Ljava/util/List;Ljm/a;LQL/h$a;)V", "LQL/y;", "b", "()LQL/y;", "LGK/z;", "a", "()LGK/z;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "LQL/h$a;", "c", "LGK/z;", "okHttpClient", "d", "LQL/y;", "retrofitClient", "e", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m implements l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f56779e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f56780a;

    /* renamed from: b  reason: collision with root package name */
    private final h.a f56781b;

    /* renamed from: c  reason: collision with root package name */
    private final z f56782c;

    /* renamed from: d  reason: collision with root package name */
    private y f56783d;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltw/m$a;", "", "<init>", "()V", "LQL/h$a;", "converterFactory", "", "baseUrl", "LGK/z;", "client", "LQL/y;", "a", "(LQL/h$a;Ljava/lang/String;LGK/z;)LQL/y;", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y a(h.a aVar, String str, z zVar) {
            C17542s.j(aVar, "converterFactory");
            C17542s.j(str, "baseUrl");
            C17542s.j(zVar, "client");
            y e10 = new y.b().d(str).g(zVar).b(aVar).e();
            C17542s.i(e10, "build(...)");
            return e10;
        }

        private a() {
        }
    }

    public m(String str, C15784c cVar, long j10, List<? extends C15804w> list, List<? extends C15804w> list2, C11429a aVar, h.a aVar2) {
        C17542s.j(str, "id");
        C17542s.j(cVar, "cache");
        C17542s.j(list, "interceptors");
        C17542s.j(list2, "networkInterceptors");
        C17542s.j(aVar, "backendUrls");
        C17542s.j(aVar2, "converterFactory");
        this.f56780a = str;
        this.f56781b = aVar2;
        z.a d10 = new z.a().d(cVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z.a U10 = d10.f(j10, timeUnit).R(j10, timeUnit).U(j10, timeUnit);
        for (C15804w a10 : list) {
            U10.a(a10);
        }
        for (C15804w b10 : list2) {
            U10.b(b10);
        }
        z c10 = U10.c();
        this.f56782c = c10;
        this.f56783d = f56779e.a(this.f56781b, aVar.a(), c10);
    }

    public z a() {
        return this.f56782c;
    }

    public y b() {
        return this.f56783d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, C15784c cVar, long j10, List list, List list2, C11429a aVar, h.a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, (i10 & 4) != 0 ? 60 : j10, (i10 & 8) != 0 ? C16877v.n() : list, (i10 & 16) != 0 ? C16877v.n() : list2, aVar, aVar2);
    }
}
