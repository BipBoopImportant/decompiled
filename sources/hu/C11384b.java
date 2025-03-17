package hu;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nt.C11674a;
import pu.C11780d;
import tf.C10253a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhu/b;", "Lpu/d;", "Ltf/a;", "killSwitchRepository", "Lnt/a;", "storeModeLocalDataSource", "<init>", "(Ltf/a;Lnt/a;)V", "LTJ/g;", "", "a", "LTJ/g;", "isEnabled", "()LTJ/g;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hu.b  reason: case insensitive filesystem */
public final class C11384b implements C11780d {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<Boolean> f98252a;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "storeModeEnabled", "config", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.storemode.StoreModeIntegrationImpl$isEnabled$1", f = "StoreModeIntegrationImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hu.b$a */
    static final class a extends l implements q<Boolean, KillSwitchConfig, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98253c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f98254d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f98255e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, KillSwitchConfig killSwitchConfig, C17164e<? super Boolean> eVar) {
            a aVar = new a(eVar);
            aVar.f98254d = z10;
            aVar.f98255e = killSwitchConfig;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (KillSwitchConfig) obj2, (C17164e) obj3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r2 == true) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            /*
                r1 = this;
                eI.C17187b.f()
                int r0 = r1.f98253c
                if (r0 != 0) goto L_0x0022
                XH.y.b(r2)
                boolean r2 = r1.f98254d
                java.lang.Object r0 = r1.f98255e
                com.ingka.ikea.killswitch.model.KillSwitchConfig r0 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r0
                if (r2 == 0) goto L_0x001c
                if (r0 == 0) goto L_0x001c
                boolean r2 = r0.F()
                r0 = 1
                if (r2 != r0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r0 = 0
            L_0x001d:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r0)
                return r2
            L_0x0022:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hu.C11384b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C11384b(C10253a aVar, C11674a aVar2) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "storeModeLocalDataSource");
        this.f98252a = C16534i.n(aVar2.c(), aVar.I(), new a((C17164e<? super a>) null));
    }

    public C16532g<Boolean> isEnabled() {
        return this.f98252a;
    }
}
