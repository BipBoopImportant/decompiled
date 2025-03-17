package xH;

import EH.C15618c;
import EH.C15627l;
import EH.C15638w;
import FH.d;
import io.ktor.utils.io.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000f\u0010\u001f¨\u0006!"}, d2 = {"LxH/d;", "LFH/d$c;", "LFH/d;", "originalContent", "Lio/ktor/utils/io/g;", "channel", "<init>", "(LFH/d;Lio/ktor/utils/io/g;)V", "e", "()Lio/ktor/utils/io/g;", "a", "LFH/d;", "b", "Lio/ktor/utils/io/g;", "LEH/c;", "c", "LEH/c;", "()LEH/c;", "contentType", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contentLength", "LEH/w;", "LEH/w;", "()LEH/w;", "status", "LEH/l;", "f", "LEH/l;", "()LEH/l;", "headers", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.d  reason: case insensitive filesystem */
public final class C18590d extends d.c {

    /* renamed from: a  reason: collision with root package name */
    private final d f152206a;

    /* renamed from: b  reason: collision with root package name */
    private final g f152207b;

    /* renamed from: c  reason: collision with root package name */
    private final C15618c f152208c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f152209d;

    /* renamed from: e  reason: collision with root package name */
    private final C15638w f152210e;

    /* renamed from: f  reason: collision with root package name */
    private final C15627l f152211f;

    public C18590d(d dVar, g gVar) {
        C17542s.j(dVar, "originalContent");
        C17542s.j(gVar, "channel");
        this.f152206a = dVar;
        this.f152207b = gVar;
        this.f152208c = dVar.b();
        this.f152209d = dVar.a();
        this.f152210e = dVar.d();
        this.f152211f = dVar.c();
    }

    public Long a() {
        return this.f152209d;
    }

    public C15618c b() {
        return this.f152208c;
    }

    public C15627l c() {
        return this.f152211f;
    }

    public C15638w d() {
        return this.f152210e;
    }

    public g e() {
        return this.f152207b;
    }
}
