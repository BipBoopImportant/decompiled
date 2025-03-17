package uq;

import XH.C16824o;
import XH.C16825p;
import gL.C17295a;
import hL.C17342a;
import hL.C17343b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;
import qL.C17844a;
import vL.C18207b;
import xq.C12333b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Luq/c;", "", "Luq/e;", "config", "Luq/f;", "contract", "Luq/h;", "logger", "Lxq/b;", "sqlDriverFactory", "<init>", "(Luq/e;Luq/f;Luq/h;Lxq/b;)V", "Luq/d;", "a", "Luq/d;", "()Luq/d;", "episodAnalytics", "Luq/b;", "b", "Luq/b;", "()Luq/b;", "episodLifecycleHooks", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uq.c  reason: case insensitive filesystem */
public final class C12077c {

    /* renamed from: a  reason: collision with root package name */
    private final C12078d f103988a;

    /* renamed from: b  reason: collision with root package name */
    private final C12076b f103989b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Luq/c$a;", "LhL/a;", "<init>", "(Luq/c;)V", "Luq/b;", "a", "LXH/o;", "d", "()Luq/b;", "episodLifecycleHooks", "Luq/d;", "b", "()Luq/d;", "episodAnalytics", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uq.c$a */
    private final class a implements C17342a {

        /* renamed from: a  reason: collision with root package name */
        private final C16824o f103990a;

        /* renamed from: b  reason: collision with root package name */
        private final C16824o f103991b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: uq.c$a$a  reason: collision with other inner class name */
        public static final class C2480a extends C17544u implements C17631a<C12076b> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17342a f103993c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17844a f103994d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17631a f103995e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2480a(C17342a aVar, C17844a aVar2, C17631a aVar3) {
                super(0);
                this.f103993c = aVar;
                this.f103994d = aVar2;
                this.f103995e = aVar3;
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [uq.b, java.lang.Object] */
            public final C12076b invoke() {
                C17342a aVar = this.f103993c;
                return (aVar instanceof C17343b ? ((C17343b) aVar).a() : aVar.c().d().b()).b(P.b(C12076b.class), this.f103994d, this.f103995e);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: uq.c$a$b */
        public static final class b extends C17544u implements C17631a<C12078d> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17342a f103996c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17844a f103997d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17631a f103998e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17342a aVar, C17844a aVar2, C17631a aVar3) {
                super(0);
                this.f103996c = aVar;
                this.f103997d = aVar2;
                this.f103998e = aVar3;
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [uq.d, java.lang.Object] */
            public final C12078d invoke() {
                C17342a aVar = this.f103996c;
                return (aVar instanceof C17343b ? ((C17343b) aVar).a() : aVar.c().d().b()).b(P.b(C12078d.class), this.f103997d, this.f103998e);
            }
        }

        public a() {
            C18207b bVar = C18207b.f149085a;
            this.f103990a = C16825p.a(bVar.b(), new C2480a(this, (C17844a) null, (C17631a) null));
            this.f103991b = C16825p.a(bVar.b(), new b(this, (C17844a) null, (C17631a) null));
        }

        public final C12078d b() {
            return (C12078d) this.f103991b.getValue();
        }

        public C17295a c() {
            return C17342a.C3500a.a(this);
        }

        public final C12076b d() {
            return (C12076b) this.f103990a.getValue();
        }
    }

    public C12077c(C12079e eVar, f fVar, h hVar, C12333b bVar) {
        C17542s.j(eVar, "config");
        C17542s.j(fVar, "contract");
        C17542s.j(hVar, "logger");
        C17542s.j(bVar, "sqlDriverFactory");
        Fq.a.b(eVar.d(), hVar, eVar, fVar, bVar.a());
        a aVar = new a();
        this.f103989b = aVar.d();
        this.f103988a = aVar.b();
    }

    public final C12078d a() {
        return this.f103988a;
    }

    public final C12076b b() {
        return this.f103989b;
    }
}
