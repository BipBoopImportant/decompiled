package ny;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sl.d;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import ny.C14856b;
import ny.C14861g;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001WB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010\u001eJ&\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0014H@¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020(*\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J7\u00103\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020-2\u001c\u00102\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001600\u0012\u0006\u0012\u0004\u0018\u0001010/H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u0010\u001aJ\u001d\u00107\u001a\u00020\u0014*\u00020\u001f2\b\u00106\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0016¢\u0006\u0004\b9\u0010\u001aJ\u0015\u0010:\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0016¢\u0006\u0004\b>\u0010\u001aJ\r\u0010?\u001a\u00020\u0016¢\u0006\u0004\b?\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020M0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lny/c;", "Landroidx/lifecycle/f0;", "Lsf/c;", "appUserDataRepository", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "LSl/d;", "getMarketsUseCase", "LZo/a;", "applicationLocale", "LRz/a;", "randomPromoImageUseCase", "<init>", "(Lsf/c;Ltf/a;LIl/a;LSl/d;LZo/a;LRz/a;)V", "", "LRl/d;", "availableMarkets", "selectedMarket", "LRl/f;", "selectedLanguage", "LXH/N;", "Q", "(Ljava/util/List;LRl/d;LRl/f;)V", "L", "()V", "", "throwable", "P", "(Ljava/lang/Throwable;)V", "LSl/d$a;", "markets", "O", "(LSl/d$a;LdI/e;)Ljava/lang/Object;", "error", "N", "market", "language", "LXH/x;", "", "U", "(LRl/d;LRl/f;LdI/e;)Ljava/lang/Object;", "I", "(LRl/f;)Z", "", "errorMessage", "Lkotlin/Function1;", "LdI/e;", "", "block", "K", "(Ljava/lang/String;LnI/l;)V", "J", "userLanguage", "H", "(LSl/d$a;Ljava/lang/String;)LRl/f;", "V", "T", "(LRl/d;)V", "S", "(LRl/f;)V", "M", "G", "m", "Lsf/c;", "n", "Ltf/a;", "o", "LIl/a;", "p", "LSl/d;", "q", "LZo/a;", "r", "LRz/a;", "LTJ/B;", "Lny/c$a;", "s", "LTJ/B;", "_state", "LTJ/P;", "t", "LTJ/P;", "getState", "()LTJ/P;", "state", "a", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ny.c  reason: case insensitive filesystem */
public final class C14857c extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C10242c f129845m;

    /* renamed from: n  reason: collision with root package name */
    private final C10253a f129846n;

    /* renamed from: o  reason: collision with root package name */
    private final Il.a f129847o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Sl.d f129848p;

    /* renamed from: q  reason: collision with root package name */
    private final Zo.a f129849q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Rz.a f129850r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<a> f129851s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<a> f129852t;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\b\u0018\u00002\u00020\u0001Bc\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jl\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b1\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b'\u00103R\u0011\u00104\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0011\u00105\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0011\u00107\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010*R\u0011\u00109\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0011\u0010;\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0011\u0010=\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010*¨\u0006>"}, d2 = {"Lny/c$a;", "", "", "LRl/d;", "markets", "selectedMarket", "LRl/f;", "selectedLanguage", "", "isLoading", "isConfigurationValid", "Lny/b;", "status", "isDone", "Lny/g;", "promoImage", "<init>", "(Ljava/util/List;LRl/d;LRl/f;ZZLny/b;ZLny/g;)V", "a", "(Ljava/util/List;LRl/d;LRl/f;ZZLny/b;ZLny/g;)Lny/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "LRl/d;", "h", "()LRl/d;", "LRl/f;", "g", "()LRl/f;", "d", "Z", "n", "()Z", "e", "k", "f", "Lny/b;", "i", "()Lny/b;", "l", "Lny/g;", "()Lny/g;", "requireLanguage", "requireMarket", "p", "isMultiLanguageMarket", "j", "isButtonContainerVisible", "o", "isLoadingBallVisible", "m", "isImageLoadingOverlayVisible", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<Rl.d> f129853a;

        /* renamed from: b  reason: collision with root package name */
        private final Rl.d f129854b;

        /* renamed from: c  reason: collision with root package name */
        private final Rl.f f129855c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f129856d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f129857e;

        /* renamed from: f  reason: collision with root package name */
        private final C14856b f129858f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f129859g;

        /* renamed from: h  reason: collision with root package name */
        private final C14861g f129860h;

        public a() {
            this((List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, (C14861g) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ a b(a aVar, List list, Rl.d dVar, Rl.f fVar, boolean z10, boolean z11, C14856b bVar, boolean z12, C14861g gVar, int i10, Object obj) {
            a aVar2 = aVar;
            int i11 = i10;
            return aVar.a((i11 & 1) != 0 ? aVar2.f129853a : list, (i11 & 2) != 0 ? aVar2.f129854b : dVar, (i11 & 4) != 0 ? aVar2.f129855c : fVar, (i11 & 8) != 0 ? aVar2.f129856d : z10, (i11 & 16) != 0 ? aVar2.f129857e : z11, (i11 & 32) != 0 ? aVar2.f129858f : bVar, (i11 & 64) != 0 ? aVar2.f129859g : z12, (i11 & 128) != 0 ? aVar2.f129860h : gVar);
        }

        public final a a(List<Rl.d> list, Rl.d dVar, Rl.f fVar, boolean z10, boolean z11, C14856b bVar, boolean z12, C14861g gVar) {
            C17542s.j(list, "markets");
            C14861g gVar2 = gVar;
            C17542s.j(gVar2, "promoImage");
            return new a(list, dVar, fVar, z10, z11, bVar, z12, gVar2);
        }

        public final List<Rl.d> c() {
            return this.f129853a;
        }

        public final C14861g d() {
            return this.f129860h;
        }

        public final Rl.f e() {
            Rl.f fVar = this.f129855c;
            C17542s.g(fVar);
            return fVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f129853a, aVar.f129853a) && C17542s.e(this.f129854b, aVar.f129854b) && C17542s.e(this.f129855c, aVar.f129855c) && this.f129856d == aVar.f129856d && this.f129857e == aVar.f129857e && C17542s.e(this.f129858f, aVar.f129858f) && this.f129859g == aVar.f129859g && C17542s.e(this.f129860h, aVar.f129860h);
        }

        public final Rl.d f() {
            Rl.d dVar = this.f129854b;
            C17542s.g(dVar);
            return dVar;
        }

        public final Rl.f g() {
            return this.f129855c;
        }

        public final Rl.d h() {
            return this.f129854b;
        }

        public int hashCode() {
            int hashCode = this.f129853a.hashCode() * 31;
            Rl.d dVar = this.f129854b;
            int i10 = 0;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Rl.f fVar = this.f129855c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f129856d)) * 31) + Boolean.hashCode(this.f129857e)) * 31;
            C14856b bVar = this.f129858f;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return ((((hashCode3 + i10) * 31) + Boolean.hashCode(this.f129859g)) * 31) + this.f129860h.hashCode();
        }

        public final C14856b i() {
            return this.f129858f;
        }

        public final boolean j() {
            return !this.f129856d && !m();
        }

        public final boolean k() {
            return this.f129857e;
        }

        public final boolean l() {
            return this.f129859g;
        }

        public final boolean m() {
            return C17542s.e(this.f129860h, C14861g.b.f129919a);
        }

        public final boolean n() {
            return this.f129856d;
        }

        public final boolean o() {
            return !j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p() {
            /*
                r2 = this;
                Rl.d r0 = r2.f129854b
                if (r0 == 0) goto L_0x0013
                java.util.List r0 = r0.b()
                if (r0 == 0) goto L_0x0013
                int r0 = r0.size()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L_0x0014
            L_0x0013:
                r0 = 0
            L_0x0014:
                r1 = 1
                boolean r0 = ip.i.c(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ny.C14857c.a.p():boolean");
        }

        public String toString() {
            List<Rl.d> list = this.f129853a;
            Rl.d dVar = this.f129854b;
            Rl.f fVar = this.f129855c;
            boolean z10 = this.f129856d;
            boolean z11 = this.f129857e;
            C14856b bVar = this.f129858f;
            boolean z12 = this.f129859g;
            C14861g gVar = this.f129860h;
            return "UIState(markets=" + list + ", selectedMarket=" + dVar + ", selectedLanguage=" + fVar + ", isLoading=" + z10 + ", isConfigurationValid=" + z11 + ", status=" + bVar + ", isDone=" + z12 + ", promoImage=" + gVar + ")";
        }

        public a(List<Rl.d> list, Rl.d dVar, Rl.f fVar, boolean z10, boolean z11, C14856b bVar, boolean z12, C14861g gVar) {
            C17542s.j(list, "markets");
            C17542s.j(gVar, "promoImage");
            this.f129853a = list;
            this.f129854b = dVar;
            this.f129855c = fVar;
            this.f129856d = z10;
            this.f129857e = z11;
            this.f129858f = bVar;
            this.f129859g = z12;
            this.f129860h = gVar;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.util.List r10, Rl.d r11, Rl.f r12, boolean r13, boolean r14, ny.C14856b r15, boolean r16, ny.C14861g r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000b
                java.util.List r1 = YH.C16877v.n()
                goto L_0x000c
            L_0x000b:
                r1 = r10
            L_0x000c:
                r2 = r0 & 2
                r3 = 0
                if (r2 == 0) goto L_0x0013
                r2 = r3
                goto L_0x0014
            L_0x0013:
                r2 = r11
            L_0x0014:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001a
                r4 = r3
                goto L_0x001b
            L_0x001a:
                r4 = r12
            L_0x001b:
                r5 = r0 & 8
                r6 = 0
                if (r5 == 0) goto L_0x0022
                r5 = r6
                goto L_0x0023
            L_0x0022:
                r5 = r13
            L_0x0023:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0029
                r7 = r6
                goto L_0x002a
            L_0x0029:
                r7 = r14
            L_0x002a:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = r15
            L_0x0030:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0035
                goto L_0x0037
            L_0x0035:
                r6 = r16
            L_0x0037:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x003e
                ny.g$b r0 = ny.C14861g.b.f129919a
                goto L_0x0040
            L_0x003e:
                r0 = r17
            L_0x0040:
                r10 = r9
                r11 = r1
                r12 = r2
                r13 = r4
                r14 = r5
                r15 = r7
                r16 = r3
                r17 = r6
                r18 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ny.C14857c.a.<init>(java.util.List, Rl.d, Rl.f, boolean, boolean, ny.b, boolean, ny.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ny/c$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.c$b */
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14857c f129861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f129862b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, C14857c cVar, String str) {
            super(aVar);
            this.f129861a = cVar;
            this.f129862b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C16505B j10 = this.f129861a.f129851s;
            do {
                value = j10.getValue();
            } while (!j10.e(value, a.b((a) value, (List) null, (Rl.d) null, (Rl.f) null, false, false, new C14856b.a(th2), false, (C14861g) null, 215, (Object) null)));
            C14857c cVar = this.f129861a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a(this.f129862b, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$launch$2", f = "FteRegionViewModel.kt", l = {295}, m = "invokeSuspend")
    /* renamed from: ny.c$c  reason: collision with other inner class name */
    static final class C3198c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f129864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3198c(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super C3198c> eVar) {
            super(2, eVar);
            this.f129864d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3198c(this.f129864d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3198c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f129863c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f129864d;
                this.f129863c = 1;
                if (lVar.invoke(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ny/c$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.c$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14857c f129865a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C14857c cVar) {
            super(aVar);
            this.f129865a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C16505B j10 = this.f129865a.f129851s;
            do {
                value = j10.getValue();
            } while (!j10.e(value, a.b((a) value, (List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, C14861g.a.f129918a, 127, (Object) null)));
            C14857c cVar = this.f129865a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to fetch promo image", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$loadPromoImage$2", f = "FteRegionViewModel.kt", l = {162}, m = "invokeSuspend")
    /* renamed from: ny.c$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f129866c;

        /* renamed from: d  reason: collision with root package name */
        Object f129867d;

        /* renamed from: e  reason: collision with root package name */
        Object f129868e;

        /* renamed from: f  reason: collision with root package name */
        Object f129869f;

        /* renamed from: g  reason: collision with root package name */
        Object f129870g;

        /* renamed from: h  reason: collision with root package name */
        int f129871h;

        /* renamed from: i  reason: collision with root package name */
        int f129872i;

        /* renamed from: j  reason: collision with root package name */
        int f129873j;

        /* renamed from: k  reason: collision with root package name */
        int f129874k;

        /* renamed from: l  reason: collision with root package name */
        int f129875l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C14857c f129876m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14857c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f129876m = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f129876m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object value2;
            Object value3;
            a aVar;
            a b10;
            Object f10 = C17187b.f();
            int i10 = this.f129875l;
            if (i10 == 0) {
                y.b(obj);
                C16505B j10 = this.f129876m.f129851s;
                while (true) {
                    value3 = j10.getValue();
                    a aVar2 = (a) value3;
                    aVar = aVar2;
                    b10 = a.b(aVar2, (List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, C14861g.b.f129919a, 127, (Object) null);
                    if (j10.e(value3, b10)) {
                        break;
                    }
                }
                Rz.a i11 = this.f129876m.f129850r;
                this.f129866c = j10;
                this.f129867d = j10;
                this.f129868e = value3;
                this.f129869f = b10;
                this.f129870g = aVar;
                this.f129871h = 0;
                this.f129872i = 0;
                this.f129873j = 0;
                this.f129874k = 0;
                this.f129875l = 1;
                Object r22 = i11.m17invokeIoAF18A(this);
                if (r22 == f10) {
                    return f10;
                }
                obj2 = r22;
            } else if (i10 == 1) {
                a aVar3 = (a) this.f129870g;
                a aVar4 = (a) this.f129869f;
                C16505B b11 = (C16505B) this.f129867d;
                C16505B b12 = (C16505B) this.f129866c;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14857c cVar = this.f129876m;
            if (x.e(obj2) == null) {
                Qz.b bVar = (Qz.b) obj2;
                C16505B j11 = cVar.f129851s;
                do {
                    value2 = j11.getValue();
                } while (!j11.e(value2, a.b((a) value2, (List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, new C14861g.c(bVar.b()), 127, (Object) null)));
            } else {
                C16505B j12 = cVar.f129851s;
                do {
                    value = j12.getValue();
                } while (!j12.e(value, a.b((a) value, (List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, C14861g.a.f129918a, 127, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel", f = "FteRegionViewModel.kt", l = {193}, m = "onGetMarketsSuccess")
    /* renamed from: ny.c$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129877c;

        /* renamed from: d  reason: collision with root package name */
        Object f129878d;

        /* renamed from: e  reason: collision with root package name */
        Object f129879e;

        /* renamed from: f  reason: collision with root package name */
        Object f129880f;

        /* renamed from: g  reason: collision with root package name */
        Object f129881g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f129882h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14857c f129883i;

        /* renamed from: j  reason: collision with root package name */
        int f129884j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14857c cVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f129883i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129882h = obj;
            this.f129884j |= Integer.MIN_VALUE;
            return this.f129883i.O((d.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$selectLanguage$1", f = "FteRegionViewModel.kt", l = {274}, m = "invokeSuspend")
    /* renamed from: ny.c$g */
    static final class g extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14857c f129886d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Rl.f f129887e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14857c cVar, Rl.f fVar, C17164e<? super g> eVar) {
            super(1, eVar);
            this.f129886d = cVar;
            this.f129887e = fVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new g(this.f129886d, this.f129887e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((g) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f129885c;
            if (i10 == 0) {
                y.b(obj);
                C14857c cVar = this.f129886d;
                Rl.d f11 = ((a) cVar.f129851s.getValue()).f();
                Rl.f fVar = this.f129887e;
                this.f129885c = 1;
                obj2 = cVar.U(f11, fVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14857c cVar2 = this.f129886d;
            Rl.f fVar2 = this.f129887e;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                ((Boolean) obj2).booleanValue();
                C14857c.R(cVar2, (List) null, (Rl.d) null, fVar2, 3, (Object) null);
            } else {
                cVar2.P(e10);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$selectMarket$1", f = "FteRegionViewModel.kt", l = {255}, m = "invokeSuspend")
    /* renamed from: ny.c$h */
    static final class h extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f129888c;

        /* renamed from: d  reason: collision with root package name */
        int f129889d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Rl.d f129890e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14857c f129891f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Rl.d dVar, C14857c cVar, C17164e<? super h> eVar) {
            super(1, eVar);
            this.f129890e = dVar;
            this.f129891f = cVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new h(this.f129890e, this.f129891f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((h) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Rl.f fVar;
            Object f10 = C17187b.f();
            int i10 = this.f129889d;
            if (i10 == 0) {
                y.b(obj);
                Rl.f fVar2 = (Rl.f) C16877v.w0(this.f129890e.b());
                C14857c cVar = this.f129891f;
                Rl.d dVar = this.f129890e;
                this.f129888c = fVar2;
                this.f129889d = 1;
                Object F10 = cVar.U(dVar, fVar2, this);
                if (F10 == f10) {
                    return f10;
                }
                fVar = fVar2;
                obj2 = F10;
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
                fVar = (Rl.f) this.f129888c;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14857c cVar2 = this.f129891f;
            Rl.d dVar2 = this.f129890e;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                ((Boolean) obj2).booleanValue();
                C14857c.R(cVar2, (List) null, dVar2, fVar, 1, (Object) null);
            } else {
                cVar2.P(e10);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lny/c$a;", "it", "LXH/N;", "<anonymous>", "(Lny/c$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$state$1", f = "FteRegionViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ny.c$i */
    static final class i extends l implements p<a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129892c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f129893d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14857c f129894e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C14857c cVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f129894e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f129894e, eVar);
            iVar.f129893d = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, C17164e<? super C16807N> eVar) {
            return ((i) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C14857c cVar;
            C17187b.f();
            if (this.f129892c == 0) {
                y.b(obj);
                a aVar = (a) this.f129893d;
                C14857c cVar2 = this.f129894e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList arrayList = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                String str2 = null;
                String str3 = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = DslKt.INDICATOR_BACKGROUND;
                    if (!hasNext) {
                        break;
                    }
                    C11819b bVar = (C11819b) it.next();
                    if (str2 == null) {
                        String a10 = C11818a.a("FTE status = " + aVar.i(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = cVar2.getClass().getName();
                        C17542s.g(name);
                        cVar = cVar2;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                            str = DslKt.INDICATOR_MAIN;
                        }
                        str3 = str + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        cVar = cVar2;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, (Throwable) null, str4);
                    str3 = str5;
                    str2 = str4;
                    cVar2 = cVar;
                }
                C14857c cVar3 = this.f129894e;
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        String a11 = C11818a.a("FTE isLoading = " + aVar.n(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str6 == null) {
                        String name2 = cVar3.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str6, false, (Throwable) null, str7);
                }
                C14857c cVar4 = this.f129894e;
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str8 == null) {
                        String a12 = C11818a.a("FTE isConfigurationValid = " + aVar.k(), (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str8 = C11820c.a(a12);
                    }
                    if (str9 == null) {
                        String name3 = cVar4.getClass().getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    bVar3.a(eVar3, str9, false, (Throwable) null, str8);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel", f = "FteRegionViewModel.kt", l = {223, 228, 242}, m = "updateConfiguration-0E7RQCE")
    /* renamed from: ny.c$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129895c;

        /* renamed from: d  reason: collision with root package name */
        Object f129896d;

        /* renamed from: e  reason: collision with root package name */
        Object f129897e;

        /* renamed from: f  reason: collision with root package name */
        Object f129898f;

        /* renamed from: g  reason: collision with root package name */
        Object f129899g;

        /* renamed from: h  reason: collision with root package name */
        Object f129900h;

        /* renamed from: i  reason: collision with root package name */
        Object f129901i;

        /* renamed from: j  reason: collision with root package name */
        int f129902j;

        /* renamed from: k  reason: collision with root package name */
        int f129903k;

        /* renamed from: l  reason: collision with root package name */
        boolean f129904l;

        /* renamed from: m  reason: collision with root package name */
        boolean f129905m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f129906n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C14857c f129907o;

        /* renamed from: p  reason: collision with root package name */
        int f129908p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C14857c cVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f129907o = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129906n = obj;
            this.f129908p |= Integer.MIN_VALUE;
            Object F10 = this.f129907o.U((Rl.d) null, (Rl.f) null, this);
            return F10 == C17187b.f() ? F10 : x.a(F10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.regionsettings.impl.viewmodel.FteRegionViewModel$updateData$1", f = "FteRegionViewModel.kt", l = {118, 119}, m = "invokeSuspend")
    /* renamed from: ny.c$k */
    static final class k extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f129909c;

        /* renamed from: d  reason: collision with root package name */
        Object f129910d;

        /* renamed from: e  reason: collision with root package name */
        Object f129911e;

        /* renamed from: f  reason: collision with root package name */
        Object f129912f;

        /* renamed from: g  reason: collision with root package name */
        int f129913g;

        /* renamed from: h  reason: collision with root package name */
        int f129914h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14857c f129915i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C14857c cVar, C17164e<? super k> eVar) {
            super(1, eVar);
            this.f129915i = cVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new k(this.f129915i, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((k) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f129914h;
            if (i10 == 0) {
                y.b(obj);
                this.f129915i.J();
                Sl.d h10 = this.f129915i.f129848p;
                this.f129914h = 1;
                obj2 = h10.m8invokeIoAF18A(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else if (i10 == 2) {
                d.a aVar = (d.a) this.f129912f;
                C14857c cVar = (C14857c) this.f129911e;
                C14857c cVar2 = (C14857c) this.f129910d;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14857c cVar3 = this.f129915i;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                d.a aVar2 = (d.a) obj2;
                this.f129909c = obj2;
                this.f129910d = cVar3;
                this.f129911e = cVar3;
                this.f129912f = aVar2;
                this.f129913g = 0;
                this.f129914h = 2;
                if (cVar3.O(aVar2, this) == f10) {
                    return f10;
                }
            } else {
                cVar3.N(e10);
            }
            return C16807N.f139792a;
        }
    }

    public C14857c(C10242c cVar, C10253a aVar, Il.a aVar2, Sl.d dVar, Zo.a aVar3, Rz.a aVar4) {
        C10242c cVar2 = cVar;
        C10253a aVar5 = aVar;
        Il.a aVar6 = aVar2;
        Sl.d dVar2 = dVar;
        Zo.a aVar7 = aVar3;
        Rz.a aVar8 = aVar4;
        C17542s.j(cVar2, "appUserDataRepository");
        C17542s.j(aVar5, "killSwitchRepository");
        C17542s.j(aVar6, "appConfigApi");
        C17542s.j(dVar2, "getMarketsUseCase");
        C17542s.j(aVar7, "applicationLocale");
        C17542s.j(aVar8, "randomPromoImageUseCase");
        this.f129845m = cVar2;
        this.f129846n = aVar5;
        this.f129847o = aVar6;
        this.f129848p = dVar2;
        this.f129849q = aVar7;
        this.f129850r = aVar8;
        C16505B<a> a10 = C16521S.a(new a((List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, (C14861g) null, 255, (DefaultConstructorMarker) null));
        this.f129851s = a10;
        this.f129852t = C16534i.c0(C16534i.R(a10, new i(this, (C17164e<? super i>) null)), g0.a(this), ip.f.a(), a10.getValue());
        V();
    }

    private final Rl.f H(d.a aVar, String str) {
        Object obj;
        Iterator it = aVar.c().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((Rl.f) obj).a(), str)) {
                break;
            }
        }
        Rl.f fVar = (Rl.f) obj;
        return fVar == null ? (Rl.f) C16877v.w0(aVar.c().b()) : fVar;
    }

    private final boolean I(Rl.f fVar) {
        Rl.i c10 = fVar.c();
        return !C15854t.v0(c10.b()) && !C15854t.v0(c10.a());
    }

    /* access modifiers changed from: private */
    public final void J() {
        a value;
        C16505B<a> b10 = this.f129851s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, (List) null, (Rl.d) null, (Rl.f) null, true, false, (C14856b) null, false, (C14861g) null, 231, (Object) null)));
    }

    private final void K(String str, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this, str), (T) null, new C3198c(lVar, (C17164e<? super C3198c>) null), 2, (Object) null);
    }

    private final void L() {
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void N(Throwable th2) {
        a value;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Failed to get current market configuration", th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14857c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
        C16505B<a> b10 = this.f129851s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, (List) null, (Rl.d) null, (Rl.f) null, false, false, new C14856b.a(th2), false, (C14861g) null, 199, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(Sl.d.a r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ny.C14857c.f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ny.c$f r0 = (ny.C14857c.f) r0
            int r1 = r0.f129884j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129884j = r1
            goto L_0x0018
        L_0x0013:
            ny.c$f r0 = new ny.c$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f129882h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129884j
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r7 = r0.f129881g
            Rl.f r7 = (Rl.f) r7
            java.lang.Object r8 = r0.f129880f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f129879e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f129878d
            Sl.d$a r8 = (Sl.d.a) r8
            java.lang.Object r0 = r0.f129877c
            ny.c r0 = (ny.C14857c) r0
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            r3 = r7
            r7 = r8
            goto L_0x008a
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004d:
            XH.y.b(r1)
            sf.c r1 = r6.f129845m
            java.lang.String r1 = r1.a()
            if (r1 == 0) goto L_0x0066
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            sf.c r1 = r6.f129845m
            java.lang.String r1 = r1.a()
            goto L_0x006e
        L_0x0066:
            Rl.f r1 = r7.b()
            java.lang.String r1 = r1.a()
        L_0x006e:
            Rl.f r3 = r6.H(r7, r1)
            Rl.d r5 = r7.c()
            r0.f129877c = r6
            r0.f129878d = r7
            r0.f129879e = r8
            r0.f129880f = r1
            r0.f129881g = r3
            r0.f129884j = r4
            java.lang.Object r1 = r6.U(r5, r3, r0)
            if (r1 != r2) goto L_0x0089
            return r2
        L_0x0089:
            r0 = r6
        L_0x008a:
            java.lang.Throwable r8 = XH.x.e(r1)
            if (r8 != 0) goto L_0x00a1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.util.List r8 = r7.a()
            Rl.d r7 = r7.c()
            r0.Q(r8, r7, r3)
            goto L_0x00a4
        L_0x00a1:
            r0.P(r8)
        L_0x00a4:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ny.C14857c.O(Sl.d$a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void P(Throwable th2) {
        a value;
        qv.e eVar = qv.e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Failed to update configuration", th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14857c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
        C16505B<a> b10 = this.f129851s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, (List) null, (Rl.d) null, (Rl.f) null, false, false, new C14856b.a(th2), false, (C14861g) null, 199, (Object) null)));
    }

    private final void Q(List<Rl.d> list, Rl.d dVar, Rl.f fVar) {
        a value;
        a aVar;
        Rl.d f10;
        List<Rl.d> c10;
        C14856b.C3197b bVar;
        L();
        C16505B<a> b10 = this.f129851s;
        do {
            value = b10.getValue();
            aVar = value;
            f10 = dVar == null ? aVar.f() : dVar;
            Locale locale = new Locale(fVar.a(), f10.a());
            c10 = list == null ? aVar.c() : list;
            if (!this.f129849q.c(locale)) {
                bVar = new C14856b.C3197b(f10, fVar);
            } else {
                Rl.f fVar2 = fVar;
                bVar = null;
            }
        } while (!b10.e(value, a.b(aVar, c10, f10, fVar, false, true, bVar, false, (C14861g) null, 192, (Object) null)));
    }

    static /* synthetic */ void R(C14857c cVar, List list, Rl.d dVar, Rl.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = null;
        }
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        cVar.Q(list, dVar, fVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108 A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109 A[Catch:{ CancellationException -> 0x0053, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U(Rl.d r18, Rl.f r19, dI.C17164e<? super XH.x<java.lang.Boolean>> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof ny.C14857c.j
            if (r2 == 0) goto L_0x0017
            r2 = r0
            ny.c$j r2 = (ny.C14857c.j) r2
            int r3 = r2.f129908p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f129908p = r3
            goto L_0x001c
        L_0x0017:
            ny.c$j r2 = new ny.c$j
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f129906n
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f129908p
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x00a9
            if (r5 == r8) goto L_0x0081
            if (r5 == r7) goto L_0x005e
            if (r5 != r6) goto L_0x0056
            java.lang.Object r0 = r2.f129901i
            com.ingka.ikea.killswitch.model.KillSwitchConfig r0 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r0
            java.lang.Object r0 = r2.f129900h
            ny.c r0 = (ny.C14857c) r0
            java.lang.Object r0 = r2.f129899g
            ny.c r0 = (ny.C14857c) r0
            java.lang.Object r0 = r2.f129898f
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f129897e
            Rl.f r0 = (Rl.f) r0
            java.lang.Object r0 = r2.f129896d
            Rl.d r0 = (Rl.d) r0
            java.lang.Object r0 = r2.f129895c
            ny.c r0 = (ny.C14857c) r0
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x0142
        L_0x0050:
            r0 = move-exception
            goto L_0x0193
        L_0x0053:
            r0 = move-exception
            goto L_0x019e
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005e:
            boolean r0 = r2.f129904l
            int r5 = r2.f129903k
            int r7 = r2.f129902j
            java.lang.Object r8 = r2.f129900h
            ny.c r8 = (ny.C14857c) r8
            java.lang.Object r9 = r2.f129899g
            ny.c r9 = (ny.C14857c) r9
            java.lang.Object r10 = r2.f129898f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f129897e
            Rl.f r11 = (Rl.f) r11
            java.lang.Object r12 = r2.f129896d
            Rl.d r12 = (Rl.d) r12
            java.lang.Object r13 = r2.f129895c
            ny.c r13 = (ny.C14857c) r13
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x0112
        L_0x0081:
            int r0 = r2.f129903k
            int r5 = r2.f129902j
            java.lang.Object r9 = r2.f129900h
            ny.c r9 = (ny.C14857c) r9
            java.lang.Object r10 = r2.f129899g
            ny.c r10 = (ny.C14857c) r10
            java.lang.Object r11 = r2.f129898f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r2.f129897e
            Rl.f r12 = (Rl.f) r12
            java.lang.Object r13 = r2.f129896d
            Rl.d r13 = (Rl.d) r13
            java.lang.Object r14 = r2.f129895c
            ny.c r14 = (ny.C14857c) r14
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r16 = r5
            r5 = r0
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r16
            goto L_0x00dd
        L_0x00a9:
            XH.y.b(r3)
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            Il.a r3 = r1.f129847o     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r5 = r18.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r9 = r19.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129895c = r1     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r10 = r18
            r2.f129896d = r10     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r11 = r19
            r2.f129897e = r11     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129898f = r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129899g = r1     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129900h = r1     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r12 = 0
            r2.f129902j = r12     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129903k = r12     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129908p = r8     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.Object r3 = r3.y(r5, r9, r2)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            if (r3 != r4) goto L_0x00d6
            return r4
        L_0x00d6:
            r14 = r1
            r13 = r10
            r5 = r12
            r9 = r5
            r10 = r14
            r12 = r11
            r11 = r10
        L_0x00dd:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            boolean r3 = r3.booleanValue()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            tf.a r15 = r10.f129846n     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r6 = r13.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r8 = r12.a()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129895c = r14     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129896d = r13     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129897e = r12     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129898f = r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129899g = r11     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129900h = r10     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129902j = r9     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129903k = r5     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129904l = r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129908p = r7     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r7 = 1
            java.lang.Object r6 = r15.B(r6, r8, r7, r2)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            if (r6 != r4) goto L_0x0109
            return r4
        L_0x0109:
            r7 = r9
            r8 = r10
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r10 = r0
            r0 = r3
            r3 = r6
        L_0x0112:
            com.ingka.ikea.killswitch.model.KillSwitchConfig r3 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r6 = "/"
            if (r0 == 0) goto L_0x0172
            if (r3 == 0) goto L_0x0172
            boolean r14 = r8.I(r11)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            if (r14 == 0) goto L_0x0151
            tf.a r6 = r8.f129846n     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129895c = r13     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129896d = r12     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129897e = r11     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129898f = r10     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129899g = r9     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129900h = r8     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129901i = r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129902j = r7     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129903k = r5     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129904l = r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.f129905m = r14     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0 = 3
            r2.f129908p = r0     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.Object r3 = r6.F(r3, r2)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            if (r3 != r4) goto L_0x0142
            return r4
        L_0x0142:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            boolean r0 = r3.booleanValue()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            goto L_0x019d
        L_0x0151:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.<init>()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r2 = "Valid privacy policy missing for "
            r0.append(r2)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r12)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r6)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r11)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.<init>(r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            throw r2     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
        L_0x0172:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.<init>()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r2 = "No killSwitch config available for "
            r0.append(r2)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r12)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r6)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r0.append(r11)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            r2.<init>(r0)     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
            throw r2     // Catch:{ CancellationException -> 0x0053, all -> 0x0050 }
        L_0x0193:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x019d:
            return r0
        L_0x019e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ny.C14857c.U(Rl.d, Rl.f, dI.e):java.lang.Object");
    }

    public final void G() {
        a value;
        C16505B<a> b10 = this.f129851s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, a.b(value, (List) null, (Rl.d) null, (Rl.f) null, false, false, (C14856b) null, false, (C14861g) null, 223, (Object) null)));
    }

    public final void M() {
        a value;
        a aVar;
        if (this.f129851s.getValue().k()) {
            C10242c cVar = this.f129845m;
            cVar.B(this.f129851s.getValue().f().a());
            cVar.p(this.f129851s.getValue().e().a());
            cVar.A(true);
            C16505B<a> b10 = this.f129851s;
            do {
                value = b10.getValue();
                aVar = value;
            } while (!b10.e(value, a.b(aVar, (List) null, (Rl.d) null, (Rl.f) null, false, false, new C14856b.c(aVar.f(), aVar.e()), true, (C14861g) null, 159, (Object) null)));
        }
    }

    public final void S(Rl.f fVar) {
        C17542s.j(fVar, "language");
        J();
        K("Failed to select language", new g(this, fVar, (C17164e<? super g>) null));
    }

    public final void T(Rl.d dVar) {
        C17542s.j(dVar, "market");
        J();
        K("Failed to select market", new h(dVar, this, (C17164e<? super h>) null));
    }

    public final void V() {
        K("Failed to init fte region view model.", new k(this, (C17164e<? super k>) null));
    }

    public final C16519P<a> getState() {
        return this.f129852t;
    }
}
