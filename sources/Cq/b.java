package Cq;

import YH.C16877v;
import com.ingka.ikea.episod.datalayer.network.models.ClientDetails;
import com.ingka.ikea.episod.datalayer.network.models.Consent;
import com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload;
import com.ingka.ikea.episod.datalayer.network.models.EventDetails;
import com.ingka.ikea.episod.datalayer.network.models.Item;
import gL.C17295a;
import hL.C17342a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uq.C12079e;
import uq.f;
import uq.g;
import uq.j;
import vq.C12202a;
import xq.C12334c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u0015B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"LCq/b;", "LCq/a;", "LhL/a;", "Luq/f;", "episodContract", "Luq/e;", "episodConfig", "Lvq/a;", "timeRepository", "Lxq/c;", "deviceInfoDataSource", "<init>", "(Luq/f;Luq/e;Lvq/a;Lxq/c;)V", "Luq/g;", "Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "d", "(Luq/g;)Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "event", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "b", "(Luq/g;)Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "a", "Luq/f;", "Luq/e;", "c", "Lvq/a;", "Lxq/c;", "e", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a, C17342a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f79660e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f79661a;

    /* renamed from: b  reason: collision with root package name */
    private final C12079e f79662b;

    /* renamed from: c  reason: collision with root package name */
    private final C12202a f79663c;

    /* renamed from: d  reason: collision with root package name */
    private final C12334c f79664d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LCq/b$a;", "", "<init>", "()V", "", "EVENT_ORIGIN", "Ljava/lang/String;", "SCHEMA_VERSION", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(f fVar, C12079e eVar, C12202a aVar, C12334c cVar) {
        C17542s.j(fVar, "episodContract");
        C17542s.j(eVar, "episodConfig");
        C17542s.j(aVar, "timeRepository");
        C17542s.j(cVar, "deviceInfoDataSource");
        this.f79661a = fVar;
        this.f79662b = eVar;
        this.f79663c = aVar;
        this.f79664d = cVar;
    }

    private final EventDetails d(g gVar) {
        if (gVar instanceof g.j) {
            g.j jVar = (g.j) gVar;
            return new EventDetails(C16877v.e(new Item(jVar.c(), (Integer) null, 2, (DefaultConstructorMarker) null)), jVar.c(), (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.a) {
            g.a aVar = (g.a) gVar;
            return new EventDetails(C16877v.e(new Item(aVar.c(), Integer.valueOf(aVar.d()))), gVar.b(), (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.C2481g) {
            g.C2481g gVar2 = (g.C2481g) gVar;
            return new EventDetails(C16877v.e(new Item(gVar2.c(), Integer.valueOf(gVar2.d()))), gVar.b(), (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.b) {
            g.b bVar = (g.b) gVar;
            return new EventDetails(C16877v.e(new Item(bVar.c(), Integer.valueOf(bVar.d()))), gVar.b(), (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.h) {
            g.h hVar = (g.h) gVar;
            return new EventDetails(C16877v.e(new Item(hVar.c(), Integer.valueOf(hVar.d()))), gVar.b(), (String) null, (String) null, (String) null, (String) null, (String) null, 124, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.f) {
            g.f fVar = (g.f) gVar;
            return new EventDetails((List) null, (String) null, (String) null, (String) null, fVar.e(), fVar.d(), fVar.c(), 15, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.e) {
            g.e eVar = (g.e) gVar;
            return new EventDetails((List) null, eVar.f(), (String) null, (String) null, eVar.e(), eVar.d(), eVar.c(), 13, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.i) {
            g.i iVar = (g.i) gVar;
            return new EventDetails((List) null, (String) null, (String) null, (String) null, iVar.e(), iVar.d(), iVar.c(), 15, (DefaultConstructorMarker) null);
        } else if (gVar instanceof g.c) {
            return new EventDetails((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        } else {
            String a10 = gVar.a();
            throw new IllegalArgumentException(a10 + " is not supported. Add the mapping to the function.");
        }
    }

    public EpisodEventPayload b(g gVar) {
        C17542s.j(gVar, "event");
        return new EpisodEventPayload("2.3.1", this.f79662b.c(), this.f79661a.b(), this.f79661a.c(), this.f79661a.a(), this.f79663c.b(), gVar.a(), gVar.b(), "app", j.a().f(), d(gVar), new ClientDetails(this.f79661a.d(), new Consent(this.f79661a.e().a(), this.f79661a.e().b(), this.f79661a.e().c()), this.f79662b.f(), this.f79664d.b(), this.f79664d.a()));
    }

    public C17295a c() {
        return C17342a.C3500a.a(this);
    }
}
