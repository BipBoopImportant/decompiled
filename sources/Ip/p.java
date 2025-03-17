package ip;

import QJ.Q;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0016¨\u0006\u0018"}, d2 = {"Lip/p;", "T", "LTJ/P;", "Lkotlin/Function0;", "getValue", "LTJ/g;", "flow", "<init>", "(LnI/a;LTJ/g;)V", "LTJ/h;", "collector", "", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "a", "LnI/a;", "b", "LTJ/g;", "", "c", "()Ljava/util/List;", "replayCache", "()Ljava/lang/Object;", "value", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p<T> implements C16519P<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<T> f98551a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16532g<T> f98552b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.core.extensions.common.TransformedStateFlow", f = "StateFlowExtensions.kt", l = {47}, m = "collect")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f98553c;

        /* renamed from: d  reason: collision with root package name */
        Object f98554d;

        /* renamed from: e  reason: collision with root package name */
        Object f98555e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f98556f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<T> f98557g;

        /* renamed from: h  reason: collision with root package name */
        int f98558h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f98557g = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98556f = obj;
            this.f98558h |= Integer.MIN_VALUE;
            return this.f98557g.collect((C16533h) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.core.extensions.common.TransformedStateFlow$collect$2", f = "StateFlowExtensions.kt", l = {47, 47}, m = "invokeSuspend")
    static final class b extends l implements nI.p<Q, C17164e<?>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98559c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f98560d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<T> f98561e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f98562f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<T> pVar, C16533h<? super T> hVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f98561e = pVar;
            this.f98562f = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f98561e, this.f98562f, eVar);
            bVar.f98560d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<?> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f98559c;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f98560d;
                C16532g g10 = this.f98561e.f98552b;
                this.f98560d = q10;
                this.f98559c = 1;
                obj = C16534i.d0(g10, q10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                q10 = (Q) this.f98560d;
                y.b(obj);
            } else if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Q q11 = (Q) this.f98560d;
                y.b(obj);
                throw new C16820k();
            }
            C16533h<T> hVar = this.f98562f;
            this.f98560d = q10;
            this.f98559c = 2;
            if (((C16519P) obj).collect(hVar, this) == f10) {
                return f10;
            }
            throw new C16820k();
        }
    }

    public p(C17631a<? extends T> aVar, C16532g<? extends T> gVar) {
        C17542s.j(aVar, "getValue");
        C17542s.j(gVar, "flow");
        this.f98551a = aVar;
        this.f98552b = gVar;
    }

    public List<T> c() {
        return C16877v.e(getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(TJ.C16533h<? super T> r6, dI.C17164e<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ip.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ip.p$a r0 = (ip.p.a) r0
            int r1 = r0.f98558h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98558h = r1
            goto L_0x0018
        L_0x0013:
            ip.p$a r0 = new ip.p$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f98556f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98558h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 == r4) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            java.lang.Object r6 = r0.f98555e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f98554d
            TJ.h r6 = (TJ.C16533h) r6
            java.lang.Object r6 = r0.f98553c
            ip.p r6 = (ip.p) r6
            XH.y.b(r1)
            goto L_0x0055
        L_0x003d:
            XH.y.b(r1)
            ip.p$b r1 = new ip.p$b
            r3 = 0
            r1.<init>(r5, r6, r3)
            r0.f98553c = r5
            r0.f98554d = r6
            r0.f98555e = r7
            r0.f98558h = r4
            java.lang.Object r6 = QJ.S.f(r1, r0)
            if (r6 != r2) goto L_0x0055
            return r2
        L_0x0055:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.p.collect(TJ.h, dI.e):java.lang.Object");
    }

    public T getValue() {
        return this.f98551a.invoke();
    }
}
