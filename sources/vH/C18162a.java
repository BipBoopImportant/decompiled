package vH;

import AH.C15412c;
import AH.C15415f;
import BH.C15457b;
import BH.C15458c;
import FH.d;
import JH.C15954a;
import NH.e;
import NH.h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import pH.C17746a;
import rH.C17850a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LvH/a;", "", "<init>", "()V", "LpH/a;", "scope", "LXH/N;", "c", "(LpH/a;)V", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.a  reason: case insensitive filesystem */
public final class C18162a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4288a f148845a = new C4288a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C15954a<C18162a> f148846b = new C15954a<>("BodyProgress");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LvH/a$a;", "LvH/m;", "LXH/N;", "LvH/a;", "<init>", "()V", "Lkotlin/Function1;", "block", "d", "(LnI/l;)LvH/a;", "plugin", "LpH/a;", "scope", "c", "(LvH/a;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.a$a  reason: collision with other inner class name */
    public static final class C4288a implements C18174m<C16807N, C18162a> {
        public /* synthetic */ C4288a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18162a aVar, C17746a aVar2) {
            C17542s.j(aVar, "plugin");
            C17542s.j(aVar2, "scope");
            aVar.c(aVar2);
        }

        /* renamed from: d */
        public C18162a a(C17642l<? super C16807N, C16807N> lVar) {
            C17542s.j(lVar, "block");
            return new C18162a();
        }

        public C15954a<C18162a> getKey() {
            return C18162a.f148846b;
        }

        private C4288a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "content", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: vH.a$b */
    static final class b extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f148847c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f148848d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f148849e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
            b bVar = new b(eVar2);
            bVar.f148848d = eVar;
            bVar.f148849e = obj;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f148847c;
            if (i10 == 0) {
                y.b(obj);
                e eVar = (e) this.f148848d;
                Object obj2 = this.f148849e;
                q qVar = (q) ((C15412c) eVar.b()).c().e(C18163b.f148853a);
                if (qVar == null) {
                    return C16807N.f139792a;
                }
                C17542s.h(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                C17850a aVar = new C17850a((d) obj2, ((C15412c) eVar.b()).g(), qVar);
                this.f148848d = null;
                this.f148847c = 1;
                if (eVar.f(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNH/e;", "LBH/c;", "LXH/N;", "response", "<anonymous>", "(LNH/e;LBH/c;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.BodyProgress$handle$2", f = "BodyProgress.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: vH.a$c */
    static final class c extends l implements q<e<C15458c, C16807N>, C15458c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f148850c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f148851d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f148852e;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e<C15458c, C16807N> eVar, C15458c cVar, C17164e<? super C16807N> eVar2) {
            c cVar2 = new c(eVar2);
            cVar2.f148851d = eVar;
            cVar2.f148852e = cVar;
            return cVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f148850c;
            if (i10 == 0) {
                y.b(obj);
                e eVar = (e) this.f148851d;
                C15458c cVar = (C15458c) this.f148852e;
                q qVar = (q) cVar.h0().e().getAttributes().e(C18163b.f148854b);
                if (qVar == null) {
                    return C16807N.f139792a;
                }
                C15458c c10 = C18163b.c(cVar, qVar);
                this.f148851d = null;
                this.f148850c = 1;
                if (eVar.f(c10, this) == f10) {
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

    /* access modifiers changed from: private */
    public final void c(C17746a aVar) {
        h hVar = new h("ObservableContent");
        aVar.i().j(C15415f.f132953h.b(), hVar);
        aVar.i().l(hVar, new b((C17164e<? super b>) null));
        aVar.h().l(C15457b.f133235h.a(), new c((C17164e<? super c>) null));
    }
}
