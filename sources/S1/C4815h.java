package S1;

import QJ.Q;
import S1.Y;
import U0.A1;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"LS1/h;", "LU0/A1;", "", "", "LS1/l;", "fontList", "initialType", "LS1/W;", "typefaceRequest", "LS1/i;", "asyncTypefaceCache", "Lkotlin/Function1;", "LS1/Y$b;", "LXH/N;", "onCompletion", "LS1/J;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;LS1/W;LS1/i;LnI/l;LS1/J;)V", "m", "(LdI/e;)Ljava/lang/Object;", "p", "(LS1/l;LdI/e;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "LS1/W;", "c", "LS1/i;", "d", "LnI/l;", "e", "LS1/J;", "<set-?>", "f", "LU0/r0;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "i", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.h  reason: case insensitive filesystem */
public final class C4815h implements A1<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<C4819l> f13378a;

    /* renamed from: b  reason: collision with root package name */
    private final W f13379b;

    /* renamed from: c  reason: collision with root package name */
    private final C4816i f13380c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<Y.b, C16807N> f13381d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final J f13382e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f13383f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13384g = true;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
    /* renamed from: S1.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f13385c;

        /* renamed from: d  reason: collision with root package name */
        Object f13386d;

        /* renamed from: e  reason: collision with root package name */
        Object f13387e;

        /* renamed from: f  reason: collision with root package name */
        int f13388f;

        /* renamed from: g  reason: collision with root package name */
        int f13389g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f13390h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4815h f13391i;

        /* renamed from: j  reason: collision with root package name */
        int f13392j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4815h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f13391i = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13390h = obj;
            this.f13392j |= Integer.MIN_VALUE;
            return this.f13391i.m(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: S1.h$b */
    static final class b extends l implements C17642l<C17164e<? super Object>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f13393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4815h f13394d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4819l f13395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4815h hVar, C4819l lVar, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f13394d = hVar;
            this.f13395e = lVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f13394d, this.f13395e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<Object> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f13393c;
            if (i10 == 0) {
                y.b(obj);
                C4815h hVar = this.f13394d;
                C4819l lVar = this.f13395e;
                this.f13393c = 1;
                obj = hVar.p(lVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* renamed from: S1.h$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f13396c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f13397d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4815h f13398e;

        /* renamed from: f  reason: collision with root package name */
        int f13399f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4815h hVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f13398e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13397d = obj;
            this.f13399f |= Integer.MIN_VALUE;
            return this.f13398e.p((C4819l) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
    /* renamed from: S1.h$d */
    static final class d extends l implements p<Q, C17164e<? super Object>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f13400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4815h f13401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4819l f13402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4815h hVar, C4819l lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f13401d = hVar;
            this.f13402e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f13401d, this.f13402e, eVar);
        }

        public final Object invoke(Q q10, C17164e<Object> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f13400c;
            if (i10 == 0) {
                y.b(obj);
                J d10 = this.f13401d.f13382e;
                C4819l lVar = this.f13402e;
                this.f13400c = 1;
                obj = d10.b(lVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public C4815h(List<? extends C4819l> list, Object obj, W w10, C4816i iVar, C17642l<? super Y.b, C16807N> lVar, J j10) {
        this.f13378a = list;
        this.f13379b = w10;
        this.f13380c = iVar;
        this.f13381d = lVar;
        this.f13382e = j10;
        this.f13383f = u1.e(obj, (o1) null, 2, (Object) null);
    }

    private void setValue(Object obj) {
        this.f13383f.setValue(obj);
    }

    public Object getValue() {
        return this.f13383f.getValue();
    }

    public final boolean i() {
        return this.f13384g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5 A[SYNTHETIC, Splitter:B:40:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof S1.C4815h.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            S1.h$a r2 = (S1.C4815h.a) r2
            int r3 = r2.f13392j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f13392j = r3
            goto L_0x001c
        L_0x0017:
            S1.h$a r2 = new S1.h$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f13390h
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r2.f13392j
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.f13389g
            int r9 = r2.f13388f
            java.lang.Object r10 = r2.f13386d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.f13385c
            S1.h r11 = (S1.C4815h) r11
            XH.y.b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0109
        L_0x003f:
            r0 = move-exception
            goto L_0x012f
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.f13389g
            int r9 = r2.f13388f
            java.lang.Object r10 = r2.f13387e
            S1.l r10 = (S1.C4819l) r10
            java.lang.Object r11 = r2.f13386d
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.f13385c
            S1.h r12 = (S1.C4815h) r12
            XH.y.b(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00bc
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x012f
        L_0x0068:
            XH.y.b(r0)
            java.util.List<S1.l> r0 = r1.f13378a     // Catch:{ all -> 0x012d }
            int r4 = r0.size()     // Catch:{ all -> 0x012d }
            r15 = r1
            r14 = r8
        L_0x0073:
            if (r14 >= r4) goto L_0x0112
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x00f2 }
            r13 = r9
            S1.l r13 = (S1.C4819l) r13     // Catch:{ all -> 0x00f2 }
            int r9 = r13.a()     // Catch:{ all -> 0x00f2 }
            S1.v$a r10 = S1.C4828v.f13445a     // Catch:{ all -> 0x00f2 }
            int r10 = r10.a()     // Catch:{ all -> 0x00f2 }
            boolean r9 = S1.C4828v.e(r9, r10)     // Catch:{ all -> 0x00f2 }
            if (r9 == 0) goto L_0x010d
            S1.i r9 = r15.f13380c     // Catch:{ all -> 0x00f2 }
            S1.J r11 = r15.f13382e     // Catch:{ all -> 0x00f2 }
            S1.h$b r12 = new S1.h$b     // Catch:{ all -> 0x00f2 }
            r12.<init>(r15, r13, r5)     // Catch:{ all -> 0x00f2 }
            r2.f13385c = r15     // Catch:{ all -> 0x00f2 }
            r2.f13386d = r0     // Catch:{ all -> 0x00f2 }
            r2.f13387e = r13     // Catch:{ all -> 0x00f2 }
            r2.f13388f = r14     // Catch:{ all -> 0x00f2 }
            r2.f13389g = r4     // Catch:{ all -> 0x00f2 }
            r2.f13392j = r7     // Catch:{ all -> 0x00f2 }
            r16 = 0
            r10 = r13
            r17 = r12
            r12 = r16
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r2
            java.lang.Object r9 = r9.g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00f2 }
            if (r9 != r3) goto L_0x00b6
            return r3
        L_0x00b6:
            r10 = r0
            r0 = r9
            r11 = r16
            r9 = r17
        L_0x00bc:
            if (r0 == 0) goto L_0x00f5
            S1.W r3 = r15.f13379b     // Catch:{ all -> 0x00f2 }
            int r3 = r3.e()     // Catch:{ all -> 0x00f2 }
            S1.W r4 = r15.f13379b     // Catch:{ all -> 0x00f2 }
            S1.C r4 = r4.f()     // Catch:{ all -> 0x00f2 }
            S1.W r5 = r15.f13379b     // Catch:{ all -> 0x00f2 }
            int r5 = r5.d()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = S1.z.a(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x00f2 }
            r15.setValue(r0)     // Catch:{ all -> 0x00f2 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00f2 }
            dI.i r2 = r2.getContext()
            boolean r2 = QJ.I0.p(r2)
            r15.f13384g = r8
            nI.l<S1.Y$b, XH.N> r3 = r15.f13381d
            S1.Y$b r4 = new S1.Y$b
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00f2:
            r0 = move-exception
            r11 = r15
            goto L_0x012f
        L_0x00f5:
            r2.f13385c = r15     // Catch:{ all -> 0x00f2 }
            r2.f13386d = r10     // Catch:{ all -> 0x00f2 }
            r2.f13387e = r5     // Catch:{ all -> 0x00f2 }
            r2.f13388f = r9     // Catch:{ all -> 0x00f2 }
            r2.f13389g = r4     // Catch:{ all -> 0x00f2 }
            r2.f13392j = r6     // Catch:{ all -> 0x00f2 }
            java.lang.Object r0 = QJ.s1.a(r2)     // Catch:{ all -> 0x00f2 }
            if (r0 != r3) goto L_0x0108
            return r3
        L_0x0108:
            r11 = r15
        L_0x0109:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x010f
        L_0x010d:
            r17 = r14
        L_0x010f:
            int r14 = r14 + r7
            goto L_0x0073
        L_0x0112:
            dI.i r0 = r2.getContext()
            boolean r0 = QJ.I0.p(r0)
            r15.f13384g = r8
            nI.l<S1.Y$b, XH.N> r2 = r15.f13381d
            S1.Y$b r3 = new S1.Y$b
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x012d:
            r0 = move-exception
            r11 = r1
        L_0x012f:
            dI.i r2 = r2.getContext()
            boolean r2 = QJ.I0.p(r2)
            r11.f13384g = r8
            nI.l<S1.Y$b, XH.N> r3 = r11.f13381d
            S1.Y$b r4 = new S1.Y$b
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C4815h.m(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(S1.C4819l r7, dI.C17164e<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof S1.C4815h.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            S1.h$c r0 = (S1.C4815h.c) r0
            int r1 = r0.f13399f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13399f = r1
            goto L_0x0018
        L_0x0013:
            S1.h$c r0 = new S1.h$c
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13397d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13399f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.f13396c
            S1.l r7 = (S1.C4819l) r7
            XH.y.b(r8)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            goto L_0x004f
        L_0x002e:
            r8 = move-exception
            goto L_0x0051
        L_0x0030:
            r7 = move-exception
            goto L_0x007d
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            XH.y.b(r8)
            S1.h$d r8 = new S1.h$d     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r8.<init>(r6, r7, r4)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r0.f13396c = r7     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r0.f13399f = r3     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = QJ.m1.e(r2, r8, r0)     // Catch:{ CancellationException -> 0x0030, Exception -> 0x002e }
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r8
            goto L_0x0087
        L_0x0051:
            dI.i r1 = r0.getContext()
            QJ.N$a r2 = QJ.N.f137593c0
            dI.i$b r1 = r1.get(r2)
            QJ.N r1 = (QJ.N) r1
            if (r1 == 0) goto L_0x0087
            dI.i r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L_0x0087
        L_0x007d:
            dI.i r8 = r0.getContext()
            boolean r8 = QJ.I0.p(r8)
            if (r8 == 0) goto L_0x0088
        L_0x0087:
            return r4
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.C4815h.p(S1.l, dI.e):java.lang.Object");
    }
}
