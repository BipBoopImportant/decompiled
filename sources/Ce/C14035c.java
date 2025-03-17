package cE;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YD.C13861a;
import YD.C13865e;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cE.C14033a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LcE/c;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LYD/a;", "getWhatsNewMessagesUseCase", "LYD/e;", "reportWhatsNewMessageDisplayedUseCase", "<init>", "(Landroidx/lifecycle/U;LYD/a;LYD/e;)V", "", "", "messagesIds", "LXH/N;", "D", "(Ljava/util/List;)V", "m", "LYD/e;", "n", "Ljava/lang/String;", "argAppLink", "LTJ/g;", "LcE/b;", "o", "LTJ/g;", "whatsNewMessageFlow", "LTJ/B;", "LcE/a;", "p", "LTJ/B;", "_whatsNewMessageState", "LTJ/P;", "q", "LTJ/P;", "C", "()LTJ/P;", "whatsNewMessageState", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cE.c  reason: case insensitive filesystem */
public final class C14035c extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C13865e f119127m;

    /* renamed from: n  reason: collision with root package name */
    private final String f119128n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16532g<List<C14034b>> f119129o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<C14033a> f119130p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<C14033a> f119131q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.whatsnew.impl.presentation.viewmodel.WhatsNewViewModel$1", f = "WhatsNewViewModel.kt", l = {39}, m = "invokeSuspend")
    /* renamed from: cE.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119132c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14035c f119133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14035c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f119133d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f119133d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f119132c;
            if (i10 == 0) {
                y.b(obj);
                C16532g i11 = this.f119133d.f119129o;
                this.f119132c = 1;
                obj = C16534i.B(i11, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            this.f119133d.f119130p.setValue(list.isEmpty() ? C14033a.C2978a.f119118a : new C14033a.c(list));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.whatsnew.impl.presentation.viewmodel.WhatsNewViewModel$markMessagesAsSeen$1", f = "WhatsNewViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cE.c$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f119134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14035c f119135d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f119136e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14035c cVar, List<String> list, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f119135d = cVar;
            this.f119136e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f119135d, this.f119136e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f119134c == 0) {
                y.b(obj);
                this.f119135d.f119127m.a(this.f119136e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14035c(U u10, C13861a aVar, C13865e eVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "getWhatsNewMessagesUseCase");
        C17542s.j(eVar, "reportWhatsNewMessageDisplayedUseCase");
        this.f119127m = eVar;
        String str = (String) u10.f("applink");
        this.f119128n = str;
        this.f119129o = aVar.a(str);
        C16505B<C14033a> a10 = C16521S.a(C14033a.b.f119119a);
        this.f119130p = a10;
        this.f119131q = a10;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final C16519P<C14033a> C() {
        return this.f119131q;
    }

    public final void D(List<String> list) {
        C17542s.j(list, "messagesIds");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, list, (C17164e<? super b>) null), 3, (Object) null);
    }
}
