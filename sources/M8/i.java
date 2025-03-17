package M8;

import I8.f;
import N8.c;
import N8.e;
import N8.g;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import x8.C8958b;
import y8.C8993b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"LM8/i;", "LI8/f;", "Lx8/b;", "libraryInterface", "LJ8/a;", "asymmetricCryptor", "LJ8/b;", "symmetricCryptor", "Lkotlin/Function0;", "", "msTimer", "<init>", "(Lx8/b;LJ8/a;LJ8/b;LnI/a;)V", "Ly8/b;", "rawEvent", "a", "(Ly8/b;)Ly8/b;", "Lx8/b;", "b", "LJ8/a;", "c", "LJ8/b;", "LM8/d;", "d", "LM8/d;", "telemetrySender", "", "", "e", "Ljava/util/List;", "urlMaskingPatterns", "LM8/g;", "f", "LM8/g;", "performanceManager", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C8958b f38664a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final J8.a f38665b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final J8.b f38666c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d f38667d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f38668e;

    /* renamed from: f  reason: collision with root package name */
    private final g f38669f;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17631a<Long> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f38670c = new a();

        public a() {
            super(0);
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly8/b;", "event", "", "isBodyAttributeCollectionEnabled", "a", "(Ly8/b;Z)Ly8/b;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements p<C8993b, Boolean, C8993b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f38671c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(2);
            this.f38671c = iVar;
        }

        public final C8993b a(C8993b bVar, boolean z10) {
            C8993b a10;
            C17542s.j(bVar, "event");
            h hVar = new h(bVar, this.f38671c.f38667d);
            A8.b a11 = this.f38671c.f38664a.a();
            JsonConfig.ProjectConfiguration b10 = a11 != null ? a11.b() : null;
            a a12 = c.f38639a.a(bVar, b10 != null ? b10.c() : null, hVar);
            if (a12 == null) {
                return null;
            }
            i iVar = this.f38671c;
            synchronized (iVar.f38668e) {
                a10 = g.a(bVar, iVar.f38668e);
            }
            return f.a(N8.a.b(c.a(e.a(N8.b.d(a10, a12, iVar.f38666c, iVar.f38667d), a12, iVar.f38666c, iVar.f38667d), a12, iVar.f38666c, iVar.f38665b, b10), z10, a12, iVar.f38666c, hVar, iVar.f38667d), a12, iVar.f38666c, iVar.f38667d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C8993b) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public i(C8958b bVar, J8.a aVar, J8.b bVar2, C17631a<Long> aVar2) {
        C17542s.j(bVar, "libraryInterface");
        C17542s.j(aVar, "asymmetricCryptor");
        C17542s.j(bVar2, "symmetricCryptor");
        C17542s.j(aVar2, "msTimer");
        this.f38664a = bVar;
        this.f38665b = aVar;
        this.f38666c = bVar2;
        d dVar = new d(bVar);
        this.f38667d = dVar;
        this.f38668e = new ArrayList();
        this.f38669f = new g(aVar2, dVar);
    }

    public C8993b a(C8993b bVar) {
        C17542s.j(bVar, "rawEvent");
        return this.f38669f.c(bVar, new b(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(C8958b bVar, J8.a aVar, J8.b bVar2, C17631a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, aVar, bVar2, (i10 & 8) != 0 ? a.f38670c : aVar2);
    }
}
