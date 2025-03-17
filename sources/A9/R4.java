package a9;

import E8.c;
import F8.g;
import XH.C16824o;
import XH.C16825p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class R4 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42246a;

    /* renamed from: b  reason: collision with root package name */
    public final g f42247b;

    /* renamed from: c  reason: collision with root package name */
    public final C16824o f42248c = C16825p.b(new a(this));

    /* renamed from: d  reason: collision with root package name */
    public final C16824o f42249d = C16825p.b(new b(this));

    public static final class a extends C17544u implements C17631a<P6> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ R4 f42250c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(R4 r42) {
            super(0);
            this.f42250c = r42;
        }

        public final Object invoke() {
            R4 r42 = this.f42250c;
            return new P6(r42.f42246a, r42.f42247b);
        }
    }

    public static final class b extends C17544u implements C17631a<C6814e0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ R4 f42251c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(R4 r42) {
            super(0);
            this.f42251c = r42;
        }

        public final Object invoke() {
            return new C6814e0(this.f42251c.f42246a);
        }
    }

    public R4(c cVar, g gVar) {
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(gVar, "deviceInfo");
        this.f42246a = cVar;
        this.f42247b = gVar;
    }
}
