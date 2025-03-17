package mg;

import Il.a;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import oe.C10117g;
import tf.C10253a;
import ug.k;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Lmg/a;", "Loe/g;", "LIl/a;", "appConfigApi", "LGo/a;", "clientIdentityProvider", "Ltf/a;", "killSwitchRepository", "Lug/k;", "labsFeatures", "Lup/d;", "userConsentRepository", "<init>", "(LIl/a;LGo/a;Ltf/a;Lug/k;Lup/d;)V", "", "a", "()Ljava/lang/String;", "c", "LIl/a;", "b", "LGo/a;", "LTJ/g;", "", "LTJ/g;", "()LTJ/g;", "isAdjustEnabled", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mg.a  reason: case insensitive filesystem */
public final class C10044a implements C10117g {

    /* renamed from: a  reason: collision with root package name */
    private final a f75397a;

    /* renamed from: b  reason: collision with root package name */
    private final Go.a f75398b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f75399c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "killSwitchConfig", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "personalizedAdsEnabled"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.di.AdjustTrackerContractImpl$isAdjustEnabled$1", f = "AdjustModule.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mg.a$a  reason: collision with other inner class name */
    static final class C1381a extends l implements q<KillSwitchConfig, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75400c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f75401d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f75402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f75403f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1381a(k kVar, C17164e<? super C1381a> eVar) {
            super(3, eVar);
            this.f75403f = kVar;
        }

        public final Object i(KillSwitchConfig killSwitchConfig, boolean z10, C17164e<? super Boolean> eVar) {
            C1381a aVar = new C1381a(this.f75403f, eVar);
            aVar.f75401d = killSwitchConfig;
            aVar.f75402e = z10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((KillSwitchConfig) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f75400c == 0) {
                y.b(obj);
                KillSwitchConfig killSwitchConfig = (KillSwitchConfig) this.f75401d;
                boolean z10 = this.f75402e;
                boolean z11 = false;
                boolean c10 = killSwitchConfig != null ? killSwitchConfig.c() : false;
                if (this.f75403f.p() || (c10 && z10)) {
                    z11 = true;
                }
                return b.a(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10044a(a aVar, Go.a aVar2, C10253a aVar3, k kVar, C12074d dVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "clientIdentityProvider");
        C17542s.j(aVar3, "killSwitchRepository");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(dVar, "userConsentRepository");
        this.f75397a = aVar;
        this.f75398b = aVar2;
        this.f75399c = C16534i.n(aVar3.I(), dVar.c(C12071a.d.f103982e), new C1381a(kVar, (C17164e<? super C1381a>) null));
    }

    public String a() {
        return this.f75397a.s().b();
    }

    public C16532g<Boolean> b() {
        return this.f75399c;
    }

    public String c() {
        return this.f75398b.c();
    }
}
