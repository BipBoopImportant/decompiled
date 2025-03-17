package TJ;

import UJ.C16627t;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LTJ/e;", "T", "LTJ/g;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(LTJ/g;LnI/l;LnI/p;)V", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "a", "LTJ/g;", "b", "LnI/l;", "c", "LnI/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.e  reason: case insensitive filesystem */
final class C16530e<T> implements C16532g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<T> f138629a;

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<T, Object> f138630b;

    /* renamed from: c  reason: collision with root package name */
    public final p<Object, Object, Boolean> f138631c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.e$a */
    static final class a<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16530e<T> f138632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<Object> f138633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f138634c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        /* renamed from: TJ.e$a$a  reason: collision with other inner class name */
        static final class C3386a extends d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138635c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a<T> f138636d;

            /* renamed from: e  reason: collision with root package name */
            int f138637e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3386a(a<? super T> aVar, C17164e<? super C3386a> eVar) {
                super(eVar);
                this.f138636d = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138635c = obj;
                this.f138637e |= Integer.MIN_VALUE;
                return this.f138636d.emit(null, this);
            }
        }

        a(C16530e<T> eVar, O<Object> o10, C16533h<? super T> hVar) {
            this.f138632a = eVar;
            this.f138633b = o10;
            this.f138634c = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof TJ.C16530e.a.C3386a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                TJ.e$a$a r0 = (TJ.C16530e.a.C3386a) r0
                int r1 = r0.f138637e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138637e = r1
                goto L_0x0018
            L_0x0013:
                TJ.e$a$a r0 = new TJ.e$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f138635c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138637e
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                XH.y.b(r7)
                TJ.e<T> r7 = r5.f138632a
                nI.l<T, java.lang.Object> r7 = r7.f138630b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.O<java.lang.Object> r2 = r5.f138633b
                T r2 = r2.f144348a
                WJ.D r4 = UJ.C16627t.f139163a
                if (r2 == r4) goto L_0x0058
                TJ.e<T> r4 = r5.f138632a
                nI.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f138631c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x0058:
                kotlin.jvm.internal.O<java.lang.Object> r2 = r5.f138633b
                r2.f144348a = r7
                TJ.h<T> r7 = r5.f138634c
                r0.f138637e = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16530e.a.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public C16530e(C16532g<? extends T> gVar, C17642l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        this.f138629a = gVar;
        this.f138630b = lVar;
        this.f138631c = pVar;
    }

    public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        O o10 = new O();
        o10.f144348a = C16627t.f139163a;
        Object collect = this.f138629a.collect(new a(this, o10, hVar), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
