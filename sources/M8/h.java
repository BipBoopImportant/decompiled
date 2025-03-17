package M8;

import HJ.C15838d;
import XH.C16824o;
import XH.C16825p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import y8.C8993b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\u0010¨\u0006\u0013"}, d2 = {"LM8/h;", "", "Ly8/b;", "event", "LM8/d;", "telemetrySender", "<init>", "(Ly8/b;LM8/d;)V", "", "a", "LXH/o;", "c", "()Ljava/lang/String;", "responseBodyString", "LR8/b;", "b", "()LR8/b;", "responseBodyJSON", "requestBodyJSON", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f38655a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f38656b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f38657c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR8/b;", "b", "()LR8/b;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17631a<R8.b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8993b f38658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f38659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8993b bVar, d dVar) {
            super(0);
            this.f38658c = bVar;
            this.f38659d = dVar;
        }

        /* renamed from: b */
        public final R8.b invoke() {
            byte[] p10 = this.f38658c.p();
            String str = null;
            if (p10 == null) {
                return null;
            }
            C8993b bVar = this.f38658c;
            d dVar = this.f38659d;
            if (((long) p10.length) < 64000) {
                byte[] p11 = bVar.p();
                if (p11 != null) {
                    str = new String(p11, C15838d.f135279b);
                }
                return new R8.b(str);
            }
            Integer r10 = bVar.r();
            dVar.c("request_body_attribute_max_size_exceeded", (long) (r10 != null ? r10.intValue() : p10.length), 64000);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR8/b;", "b", "()LR8/b;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17631a<R8.b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8993b f38660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f38661d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f38662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C8993b bVar, h hVar, d dVar) {
            super(0);
            this.f38660c = bVar;
            this.f38661d = hVar;
            this.f38662e = dVar;
        }

        /* renamed from: b */
        public final R8.b invoke() {
            byte[] u10 = this.f38660c.u();
            if (u10 == null) {
                return null;
            }
            h hVar = this.f38661d;
            d dVar = this.f38662e;
            C8993b bVar = this.f38660c;
            if (((long) u10.length) < 64000) {
                return new R8.b(hVar.c());
            }
            Integer r10 = bVar.r();
            dVar.c("response_body_attribute_max_size_exceeded", (long) (r10 != null ? r10.intValue() : u10.length), 64000);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8993b f38663c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8993b bVar) {
            super(0);
            this.f38663c = bVar;
        }

        /* renamed from: b */
        public final String invoke() {
            byte[] u10 = this.f38663c.u();
            if (u10 != null) {
                return new String(u10, C15838d.f135279b);
            }
            return null;
        }
    }

    public h(C8993b bVar, d dVar) {
        C17542s.j(bVar, "event");
        C17542s.j(dVar, "telemetrySender");
        this.f38655a = C16825p.b(new c(bVar));
        this.f38656b = C16825p.b(new b(bVar, this, dVar));
        this.f38657c = C16825p.b(new a(bVar, dVar));
    }

    public final R8.b a() {
        return (R8.b) this.f38657c.getValue();
    }

    public final R8.b b() {
        return (R8.b) this.f38656b.getValue();
    }

    public final String c() {
        return (String) this.f38655a.getValue();
    }
}
