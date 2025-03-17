package p0;

import A1.A;
import A1.B;
import A1.C4336c;
import A1.C4349p;
import A1.K;
import A1.P;
import XH.C16807N;
import androidx.compose.ui.platform.w1;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001ad\u0010\u0016\u001a\u00020\u0006*\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0001\u0010\u001c\u001a\u00020\u0006*\u00020\u00112\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H@¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00060\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\t\u001a3\u0010 \u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\nH@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000e\u001a!\u0010!\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0010\u001a\u001e\u0010#\u001a\u00020\f*\u00020\"2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010(\u001a\u00020\u001e*\u00020%2\u0006\u0010'\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010.\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,\"\u0014\u0010/\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010,\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"LA1/c;", "LA1/A;", "pointerId", "Lkotlin/Function2;", "LA1/B;", "Lo1/g;", "LXH/N;", "onTouchSlopReached", "d", "(LA1/c;JLnI/p;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "onDrag", "", "i", "(LA1/c;JLnI/l;LdI/e;)Ljava/lang/Object;", "b", "(LA1/c;JLdI/e;)Ljava/lang/Object;", "LA1/K;", "onDragStart", "Lkotlin/Function0;", "onDragEnd", "onDragCancel", "f", "(LA1/K;LnI/l;LnI/a;LnI/a;LnI/p;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "shouldAwaitTouchSlop", "Lp0/v;", "orientationLock", "g", "(LA1/K;LnI/q;LnI/l;LnI/a;LnI/a;Lp0/v;LnI/p;LdI/e;)Ljava/lang/Object;", "", "e", "l", "c", "LA1/p;", "j", "(LA1/p;J)Z", "Landroidx/compose/ui/platform/w1;", "LA1/P;", "pointerType", "k", "(Landroidx/compose/ui/platform/w1;I)F", "Lc2/h;", "a", "F", "mouseSlop", "defaultTouchSlop", "mouseToTouchSlopRatio", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final float f27077a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f27078b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f27079c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {967}, m = "awaitDragOrCancellation-rnUCldI")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27080c;

        /* renamed from: d  reason: collision with root package name */
        Object f27081d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f27082e;

        /* renamed from: f  reason: collision with root package name */
        int f27083f;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27082e = obj;
            this.f27083f |= Integer.MIN_VALUE;
            return m.b((C4336c) null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {898}, m = "awaitLongPressOrCancellation-rnUCldI")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27084c;

        /* renamed from: d  reason: collision with root package name */
        Object f27085d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f27086e;

        /* renamed from: f  reason: collision with root package name */
        int f27087f;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27086e = obj;
            this.f27087f |= Integer.MIN_VALUE;
            return m.c((C4336c) null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {901, 918}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f27088d;

        /* renamed from: e  reason: collision with root package name */
        int f27089e;

        /* renamed from: f  reason: collision with root package name */
        int f27090f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f27091g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ O<B> f27092h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ O<B> f27093i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(O<B> o10, O<B> o11, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f27092h = o10;
            this.f27093i = o11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f27092h, this.f27093i, eVar);
            cVar.f27091g = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x006f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009b A[EDGE_INSN: B:63:0x009b->B:27:0x009b ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd A[EDGE_INSN: B:65:0x00cd->B:37:0x00cd ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f27090f
                r3 = 2
                r4 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0036
                if (r2 == r6) goto L_0x002a
                if (r2 != r3) goto L_0x0022
                int r2 = r0.f27089e
                java.lang.Object r7 = r0.f27088d
                A1.p r7 = (A1.C4349p) r7
                java.lang.Object r8 = r0.f27091g
                A1.c r8 = (A1.C4336c) r8
                XH.y.b(r17)
                r4 = r17
                goto L_0x00af
            L_0x0022:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002a:
                int r2 = r0.f27089e
                java.lang.Object r7 = r0.f27091g
                A1.c r7 = (A1.C4336c) r7
                XH.y.b(r17)
                r8 = r17
                goto L_0x0052
            L_0x0036:
                XH.y.b(r17)
                java.lang.Object r2 = r0.f27091g
                A1.c r2 = (A1.C4336c) r2
                r7 = r2
                r2 = 0
            L_0x003f:
                if (r2 != 0) goto L_0x0145
                A1.r r8 = A1.r.Main
                r0.f27091g = r7
                r0.f27088d = r4
                r0.f27089e = r2
                r0.f27090f = r6
                java.lang.Object r8 = r7.B1(r8, r0)
                if (r8 != r1) goto L_0x0052
                return r1
            L_0x0052:
                A1.p r8 = (A1.C4349p) r8
                java.util.List r9 = r8.c()
                int r10 = r9.size()
                r11 = 0
            L_0x005d:
                if (r11 >= r10) goto L_0x006f
                java.lang.Object r12 = r9.get(r11)
                A1.B r12 = (A1.B) r12
                boolean r12 = A1.C4350q.d(r12)
                if (r12 != 0) goto L_0x006c
                goto L_0x0070
            L_0x006c:
                int r11 = r11 + 1
                goto L_0x005d
            L_0x006f:
                r2 = r6
            L_0x0070:
                java.util.List r9 = r8.c()
                int r10 = r9.size()
                r11 = 0
            L_0x0079:
                if (r11 >= r10) goto L_0x009b
                java.lang.Object r12 = r9.get(r11)
                A1.B r12 = (A1.B) r12
                boolean r13 = r12.p()
                if (r13 != 0) goto L_0x009a
                long r13 = r7.a()
                long r4 = r7.G0()
                boolean r4 = A1.C4350q.f(r12, r13, r4)
                if (r4 == 0) goto L_0x0096
                goto L_0x009a
            L_0x0096:
                int r11 = r11 + 1
                r4 = 0
                goto L_0x0079
            L_0x009a:
                r2 = r6
            L_0x009b:
                A1.r r4 = A1.r.Final
                r0.f27091g = r7
                r0.f27088d = r8
                r0.f27089e = r2
                r0.f27090f = r3
                java.lang.Object r4 = r7.B1(r4, r0)
                if (r4 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                r15 = r8
                r8 = r7
                r7 = r15
            L_0x00af:
                A1.p r4 = (A1.C4349p) r4
                java.util.List r4 = r4.c()
                int r5 = r4.size()
                r9 = 0
            L_0x00ba:
                if (r9 >= r5) goto L_0x00cd
                java.lang.Object r10 = r4.get(r9)
                A1.B r10 = (A1.B) r10
                boolean r10 = r10.p()
                if (r10 == 0) goto L_0x00ca
                r2 = r6
                goto L_0x00cd
            L_0x00ca:
                int r9 = r9 + 1
                goto L_0x00ba
            L_0x00cd:
                kotlin.jvm.internal.O<A1.B> r4 = r0.f27092h
                T r4 = r4.f144348a
                A1.B r4 = (A1.B) r4
                long r4 = r4.f()
                boolean r4 = p0.m.j(r7, r4)
                if (r4 == 0) goto L_0x010c
                java.util.List r4 = r7.c()
                int r5 = r4.size()
                r7 = 0
            L_0x00e6:
                if (r7 >= r5) goto L_0x00f9
                java.lang.Object r9 = r4.get(r7)
                r10 = r9
                A1.B r10 = (A1.B) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x00f6
                goto L_0x00fa
            L_0x00f6:
                int r7 = r7 + 1
                goto L_0x00e6
            L_0x00f9:
                r9 = 0
            L_0x00fa:
                A1.B r9 = (A1.B) r9
                if (r9 == 0) goto L_0x0107
                kotlin.jvm.internal.O<A1.B> r4 = r0.f27092h
                r4.f144348a = r9
                kotlin.jvm.internal.O<A1.B> r4 = r0.f27093i
                r4.f144348a = r9
                goto L_0x0140
            L_0x0107:
                r2 = r6
                r7 = r8
                r4 = 0
                goto L_0x003f
            L_0x010c:
                kotlin.jvm.internal.O<A1.B> r4 = r0.f27093i
                java.util.List r5 = r7.c()
                kotlin.jvm.internal.O<A1.B> r7 = r0.f27092h
                int r9 = r5.size()
                r10 = 0
            L_0x0119:
                if (r10 >= r9) goto L_0x013d
                java.lang.Object r11 = r5.get(r10)
                r12 = r11
                A1.B r12 = (A1.B) r12
                long r12 = r12.f()
                T r14 = r7.f144348a
                A1.B r14 = (A1.B) r14
                r17 = r7
                long r6 = r14.f()
                boolean r6 = A1.A.d(r12, r6)
                if (r6 == 0) goto L_0x0137
                goto L_0x013e
            L_0x0137:
                int r10 = r10 + 1
                r7 = r17
                r6 = 1
                goto L_0x0119
            L_0x013d:
                r11 = 0
            L_0x013e:
                r4.f144348a = r11
            L_0x0140:
                r7 = r8
                r4 = 0
                r6 = 1
                goto L_0x003f
            L_0x0145:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitTouchSlopOrCancellation-jO51t88")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27094c;

        /* renamed from: d  reason: collision with root package name */
        Object f27095d;

        /* renamed from: e  reason: collision with root package name */
        Object f27096e;

        /* renamed from: f  reason: collision with root package name */
        Object f27097f;

        /* renamed from: g  reason: collision with root package name */
        Object f27098g;

        /* renamed from: h  reason: collision with root package name */
        float f27099h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f27100i;

        /* renamed from: j  reason: collision with root package name */
        int f27101j;

        d(C17164e<? super d> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27100i = obj;
            this.f27101j |= Integer.MIN_VALUE;
            return m.d((C4336c) null, 0, (p<? super B, ? super C5667g, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {972, 1014}, m = "awaitVerticalTouchSlopOrCancellation-jO51t88")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27102c;

        /* renamed from: d  reason: collision with root package name */
        Object f27103d;

        /* renamed from: e  reason: collision with root package name */
        Object f27104e;

        /* renamed from: f  reason: collision with root package name */
        Object f27105f;

        /* renamed from: g  reason: collision with root package name */
        Object f27106g;

        /* renamed from: h  reason: collision with root package name */
        float f27107h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f27108i;

        /* renamed from: j  reason: collision with root package name */
        int f27109j;

        e(C17164e<? super e> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27108i = obj;
            this.f27109j |= Integer.MIN_VALUE;
            return m.e((C4336c) null, 0, (p<? super B, ? super Float, C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f27110c = new f();

        f() {
            super(1);
        }

        public final void a(long j10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f27111c = new g();

        g() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f27112c = new h();

        h() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LA1/B;", "<anonymous parameter 0>", "slopTriggerChange", "Lo1/g;", "<anonymous parameter 2>", "LXH/N;", "a", "(LA1/B;LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements q<B, B, C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f27113c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C17642l<? super C5667g, C16807N> lVar) {
            super(3);
            this.f27113c = lVar;
        }

        public final void a(B b10, B b11, long j10) {
            this.f27113c.invoke(C5667g.d(b11.h()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((B) obj, (B) obj2, ((C5667g) obj3).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<B, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f27114c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C17631a<C16807N> aVar) {
            super(1);
            this.f27114c = aVar;
        }

        public final void a(B b10) {
            this.f27114c.invoke();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final k f27115c = new k();

        k() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f27116d;

        /* renamed from: e  reason: collision with root package name */
        Object f27117e;

        /* renamed from: f  reason: collision with root package name */
        Object f27118f;

        /* renamed from: g  reason: collision with root package name */
        Object f27119g;

        /* renamed from: h  reason: collision with root package name */
        Object f27120h;

        /* renamed from: i  reason: collision with root package name */
        Object f27121i;

        /* renamed from: j  reason: collision with root package name */
        boolean f27122j;

        /* renamed from: k  reason: collision with root package name */
        float f27123k;

        /* renamed from: l  reason: collision with root package name */
        int f27124l;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f27125m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17631a<Boolean> f27126n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ N f27127o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v f27128p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q<B, B, C5667g, C16807N> f27129q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ p<B, C5667g, C16807N> f27130r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f27131s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C17642l<B, C16807N> f27132t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C17631a<Boolean> aVar, N n10, v vVar, q<? super B, ? super B, ? super C5667g, C16807N> qVar, p<? super B, ? super C5667g, C16807N> pVar, C17631a<C16807N> aVar2, C17642l<? super B, C16807N> lVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f27126n = aVar;
            this.f27127o = n10;
            this.f27128p = vVar;
            this.f27129q = qVar;
            this.f27130r = pVar;
            this.f27131s = aVar2;
            this.f27132t = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f27126n, this.f27127o, this.f27128p, this.f27129q, this.f27130r, this.f27131s, this.f27132t, eVar);
            lVar.f27125m = obj;
            return lVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((l) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: A1.B} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: A1.B} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: A1.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: A1.r} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: A1.B} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: A1.r} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0316  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x031e  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0326  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x017e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x02a6 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0151 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x015f  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x027c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x028a  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x02ab  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02ad  */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r6 = r22
                java.lang.Object r7 = eI.C17187b.f()
                int r0 = r6.f27124l
                r8 = 5
                r9 = 4
                r10 = 3
                r1 = 2
                r11 = 0
                r12 = 1
                r13 = 0
                if (r0 == 0) goto L_0x00b7
                if (r0 == r12) goto L_0x00ac
                if (r0 == r1) goto L_0x009a
                if (r0 == r10) goto L_0x006f
                if (r0 == r9) goto L_0x0040
                if (r0 != r8) goto L_0x0038
                java.lang.Object r0 = r6.f27119g
                kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
                java.lang.Object r1 = r6.f27118f
                A1.c r1 = (A1.C4336c) r1
                java.lang.Object r2 = r6.f27117e
                p0.v r2 = (p0.v) r2
                java.lang.Object r3 = r6.f27116d
                nI.p r3 = (nI.p) r3
                java.lang.Object r4 = r6.f27125m
                A1.c r4 = (A1.C4336c) r4
                XH.y.b(r23)
                r10 = r23
                r9 = r12
                r5 = r13
                goto L_0x027d
            L_0x0038:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0040:
                float r0 = r6.f27123k
                java.lang.Object r1 = r6.f27121i
                A1.B r1 = (A1.B) r1
                java.lang.Object r2 = r6.f27120h
                p0.J r2 = (p0.J) r2
                java.lang.Object r3 = r6.f27119g
                kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
                java.lang.Object r4 = r6.f27118f
                kotlin.jvm.internal.N r4 = (kotlin.jvm.internal.N) r4
                java.lang.Object r5 = r6.f27117e
                A1.c r5 = (A1.C4336c) r5
                java.lang.Object r14 = r6.f27116d
                A1.B r14 = (A1.B) r14
                java.lang.Object r15 = r6.f27125m
                A1.c r15 = (A1.C4336c) r15
                XH.y.b(r23)
                r20 = r2
                r2 = r0
                r0 = r14
                r14 = r4
                r4 = r20
                r21 = r15
                r15 = r3
                r3 = r21
                goto L_0x020b
            L_0x006f:
                float r0 = r6.f27123k
                java.lang.Object r1 = r6.f27120h
                p0.J r1 = (p0.J) r1
                java.lang.Object r2 = r6.f27119g
                kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
                java.lang.Object r3 = r6.f27118f
                kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
                java.lang.Object r4 = r6.f27117e
                A1.c r4 = (A1.C4336c) r4
                java.lang.Object r5 = r6.f27116d
                A1.B r5 = (A1.B) r5
                java.lang.Object r14 = r6.f27125m
                A1.c r14 = (A1.C4336c) r14
                XH.y.b(r23)
                r15 = r2
                r2 = r4
                r4 = r1
                r1 = r0
                r0 = r5
                r5 = r23
                r20 = r14
                r14 = r3
                r3 = r20
                goto L_0x0152
            L_0x009a:
                boolean r0 = r6.f27122j
                java.lang.Object r1 = r6.f27116d
                A1.B r1 = (A1.B) r1
                java.lang.Object r2 = r6.f27125m
                A1.c r2 = (A1.C4336c) r2
                XH.y.b(r23)
                r17 = r0
                r0 = r23
                goto L_0x00fc
            L_0x00ac:
                java.lang.Object r0 = r6.f27125m
                A1.c r0 = (A1.C4336c) r0
                XH.y.b(r23)
                r2 = r23
            L_0x00b5:
                r14 = r0
                goto L_0x00cb
            L_0x00b7:
                XH.y.b(r23)
                java.lang.Object r0 = r6.f27125m
                A1.c r0 = (A1.C4336c) r0
                A1.r r2 = A1.r.Initial
                r6.f27125m = r0
                r6.f27124l = r12
                java.lang.Object r2 = p0.G.d(r0, r11, r2, r6)
                if (r2 != r7) goto L_0x00b5
                return r7
            L_0x00cb:
                r15 = r2
                A1.B r15 = (A1.B) r15
                nI.a<java.lang.Boolean> r0 = r6.f27126n
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r5 = r0.booleanValue()
                if (r5 != 0) goto L_0x00df
                r15.a()
            L_0x00df:
                r6.f27125m = r14
                r6.f27116d = r15
                r6.f27122j = r5
                r6.f27124l = r1
                r1 = 0
                r2 = 0
                r4 = 2
                r16 = 0
                r0 = r14
                r3 = r22
                r17 = r5
                r5 = r16
                java.lang.Object r0 = p0.G.e(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x00fa
                return r7
            L_0x00fa:
                r2 = r14
                r1 = r15
            L_0x00fc:
                A1.B r0 = (A1.B) r0
                kotlin.jvm.internal.N r3 = r6.f27127o
                o1.g$a r4 = o1.C5667g.f26701b
                long r4 = r4.c()
                r3.f144347a = r4
                if (r17 == 0) goto L_0x0227
            L_0x010a:
                long r3 = r0.f()
                int r1 = r0.n()
                p0.v r5 = r6.f27128p
                kotlin.jvm.internal.N r14 = r6.f27127o
                A1.p r15 = r2.b1()
                boolean r15 = p0.m.j(r15, r3)
                if (r15 == 0) goto L_0x0123
                r1 = r13
                goto L_0x0213
            L_0x0123:
                androidx.compose.ui.platform.w1 r15 = r2.getViewConfiguration()
                float r1 = p0.m.k(r15, r1)
                kotlin.jvm.internal.N r15 = new kotlin.jvm.internal.N
                r15.<init>()
                r15.f144347a = r3
                p0.J r3 = new p0.J
                r3.<init>(r5)
                r4 = r3
                r3 = r2
            L_0x0139:
                r6.f27125m = r3
                r6.f27116d = r0
                r6.f27117e = r2
                r6.f27118f = r14
                r6.f27119g = r15
                r6.f27120h = r4
                r6.f27121i = r13
                r6.f27123k = r1
                r6.f27124l = r10
                java.lang.Object r5 = A1.C4336c.J1(r2, r13, r6, r12, r13)
                if (r5 != r7) goto L_0x0152
                return r7
            L_0x0152:
                A1.p r5 = (A1.C4349p) r5
                java.util.List r10 = r5.c()
                int r11 = r10.size()
                r12 = 0
            L_0x015d:
                if (r12 >= r11) goto L_0x017e
                java.lang.Object r18 = r10.get(r12)
                r19 = r18
                A1.B r19 = (A1.B) r19
                long r8 = r19.f()
                r23 = r14
                long r13 = r15.f144347a
                boolean r8 = A1.A.d(r8, r13)
                if (r8 == 0) goto L_0x0176
                goto L_0x0182
            L_0x0176:
                int r12 = r12 + 1
                r14 = r23
                r8 = 5
                r9 = 4
                r13 = 0
                goto L_0x015d
            L_0x017e:
                r23 = r14
                r18 = 0
            L_0x0182:
                r8 = r18
                A1.B r8 = (A1.B) r8
                if (r8 != 0) goto L_0x018d
            L_0x0188:
                r2 = r3
                r1 = 0
            L_0x018a:
                r9 = 4
                goto L_0x0213
            L_0x018d:
                boolean r9 = r8.p()
                if (r9 == 0) goto L_0x0194
                goto L_0x0188
            L_0x0194:
                boolean r9 = A1.C4350q.d(r8)
                if (r9 == 0) goto L_0x01c5
                java.util.List r5 = r5.c()
                int r8 = r5.size()
                r9 = 0
            L_0x01a3:
                if (r9 >= r8) goto L_0x01b6
                java.lang.Object r10 = r5.get(r9)
                r11 = r10
                A1.B r11 = (A1.B) r11
                boolean r11 = r11.i()
                if (r11 == 0) goto L_0x01b3
                goto L_0x01b7
            L_0x01b3:
                int r9 = r9 + 1
                goto L_0x01a3
            L_0x01b6:
                r10 = 0
            L_0x01b7:
                A1.B r10 = (A1.B) r10
                if (r10 != 0) goto L_0x01bc
                goto L_0x0188
            L_0x01bc:
                long r8 = r10.f()
                r15.f144347a = r8
                r14 = r23
                goto L_0x01e2
            L_0x01c5:
                o1.g r5 = r4.a(r8, r1)
                if (r5 == 0) goto L_0x01ea
                long r9 = r5.v()
                r8.a()
                r14 = r23
                r14.f144347a = r9
                boolean r5 = r8.p()
                if (r5 == 0) goto L_0x01df
                r2 = r3
                r1 = r8
                goto L_0x018a
            L_0x01df:
                r4.e()
            L_0x01e2:
                r8 = 5
                r9 = 4
            L_0x01e4:
                r10 = 3
                r11 = 0
                r12 = 1
                r13 = 0
                goto L_0x0139
            L_0x01ea:
                r14 = r23
                A1.r r5 = A1.r.Final
                r6.f27125m = r3
                r6.f27116d = r0
                r6.f27117e = r2
                r6.f27118f = r14
                r6.f27119g = r15
                r6.f27120h = r4
                r6.f27121i = r8
                r6.f27123k = r1
                r9 = 4
                r6.f27124l = r9
                java.lang.Object r5 = r2.B1(r5, r6)
                if (r5 != r7) goto L_0x0208
                return r7
            L_0x0208:
                r5 = r2
                r2 = r1
                r1 = r8
            L_0x020b:
                boolean r1 = r1.p()
                if (r1 == 0) goto L_0x0223
                r2 = r3
                r1 = 0
            L_0x0213:
                if (r1 == 0) goto L_0x0227
                boolean r3 = r1.p()
                if (r3 == 0) goto L_0x021c
                goto L_0x0227
            L_0x021c:
                r8 = 5
                r10 = 3
                r11 = 0
                r12 = 1
                r13 = 0
                goto L_0x010a
            L_0x0223:
                r1 = r2
                r2 = r5
                r8 = 5
                goto L_0x01e4
            L_0x0227:
                if (r1 == 0) goto L_0x0345
                nI.q<A1.B, A1.B, o1.g, XH.N> r3 = r6.f27129q
                kotlin.jvm.internal.N r4 = r6.f27127o
                long r4 = r4.f144347a
                o1.g r4 = o1.C5667g.d(r4)
                r3.invoke(r0, r1, r4)
                nI.p<A1.B, o1.g, XH.N> r0 = r6.f27130r
                kotlin.jvm.internal.N r3 = r6.f27127o
                long r3 = r3.f144347a
                o1.g r3 = o1.C5667g.d(r3)
                r0.invoke(r1, r3)
                long r0 = r1.f()
                nI.p<A1.B, o1.g, XH.N> r3 = r6.f27130r
                p0.v r4 = r6.f27128p
                A1.p r5 = r2.b1()
                boolean r5 = p0.m.j(r5, r0)
                if (r5 == 0) goto L_0x0258
            L_0x0255:
                r13 = 0
                goto L_0x0314
            L_0x0258:
                kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
                r5.<init>()
                r5.f144347a = r0
                r1 = r2
                r0 = r5
                r2 = r4
                r4 = r1
            L_0x0263:
                r6.f27125m = r4
                r6.f27116d = r3
                r6.f27117e = r2
                r6.f27118f = r1
                r6.f27119g = r0
                r5 = 0
                r6.f27120h = r5
                r6.f27121i = r5
                r8 = 5
                r6.f27124l = r8
                r9 = 1
                java.lang.Object r10 = A1.C4336c.J1(r1, r5, r6, r9, r5)
                if (r10 != r7) goto L_0x027d
                return r7
            L_0x027d:
                A1.p r10 = (A1.C4349p) r10
                java.util.List r11 = r10.c()
                int r12 = r11.size()
                r13 = 0
            L_0x0288:
                if (r13 >= r12) goto L_0x02a6
                java.lang.Object r14 = r11.get(r13)
                r15 = r14
                A1.B r15 = (A1.B) r15
                long r8 = r15.f()
                long r5 = r0.f144347a
                boolean r5 = A1.A.d(r8, r5)
                if (r5 == 0) goto L_0x029e
                goto L_0x02a7
            L_0x029e:
                int r13 = r13 + 1
                r5 = 0
                r8 = 5
                r9 = 1
                r6 = r22
                goto L_0x0288
            L_0x02a6:
                r14 = 0
            L_0x02a7:
                A1.B r14 = (A1.B) r14
                if (r14 != 0) goto L_0x02ad
                r14 = 0
                goto L_0x0301
            L_0x02ad:
                boolean r5 = A1.C4350q.d(r14)
                if (r5 == 0) goto L_0x02df
                java.util.List r5 = r10.c()
                int r6 = r5.size()
                r8 = 0
            L_0x02bc:
                if (r8 >= r6) goto L_0x02cf
                java.lang.Object r9 = r5.get(r8)
                r10 = r9
                A1.B r10 = (A1.B) r10
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x02cc
                goto L_0x02d0
            L_0x02cc:
                int r8 = r8 + 1
                goto L_0x02bc
            L_0x02cf:
                r9 = 0
            L_0x02d0:
                A1.B r9 = (A1.B) r9
                if (r9 != 0) goto L_0x02d5
                goto L_0x0301
            L_0x02d5:
                long r5 = r9.f()
                r0.f144347a = r5
            L_0x02db:
                r5 = r22
                goto L_0x0342
            L_0x02df:
                long r5 = A1.C4350q.h(r14)
                if (r2 != 0) goto L_0x02ea
                float r5 = o1.C5667g.k(r5)
                goto L_0x02f7
            L_0x02ea:
                p0.v r8 = p0.v.Vertical
                if (r2 != r8) goto L_0x02f3
                float r5 = o1.C5667g.n(r5)
                goto L_0x02f7
            L_0x02f3:
                float r5 = o1.C5667g.m(r5)
            L_0x02f7:
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x02fe
                r5 = 1
                goto L_0x02ff
            L_0x02fe:
                r5 = 0
            L_0x02ff:
                if (r5 != 0) goto L_0x02db
            L_0x0301:
                if (r14 != 0) goto L_0x0305
                goto L_0x0255
            L_0x0305:
                boolean r0 = r14.p()
                if (r0 == 0) goto L_0x030d
                goto L_0x0255
            L_0x030d:
                boolean r0 = A1.C4350q.d(r14)
                if (r0 == 0) goto L_0x0326
                r13 = r14
            L_0x0314:
                if (r13 != 0) goto L_0x031e
                r5 = r22
                nI.a<XH.N> r0 = r5.f27131s
                r0.invoke()
                goto L_0x0346
            L_0x031e:
                r5 = r22
                nI.l<A1.B, XH.N> r0 = r5.f27132t
                r0.invoke(r13)
                goto L_0x0346
            L_0x0326:
                r5 = r22
                long r0 = A1.C4350q.g(r14)
                o1.g r0 = o1.C5667g.d(r0)
                r3.invoke(r14, r0)
                r14.a()
                long r0 = r14.f()
                r6 = r5
                r20 = r4
                r4 = r2
                r2 = r20
                goto L_0x0258
            L_0x0342:
                r6 = r5
                goto L_0x0263
            L_0x0345:
                r5 = r6
            L_0x0346:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.m.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {108}, m = "drag-jO51t88")
    /* renamed from: p0.m$m  reason: collision with other inner class name */
    static final class C0442m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27133c;

        /* renamed from: d  reason: collision with root package name */
        Object f27134d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f27135e;

        /* renamed from: f  reason: collision with root package name */
        int f27136f;

        C0442m(C17164e<? super C0442m> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27135e = obj;
            this.f27136f |= Integer.MIN_VALUE;
            return m.i((C4336c) null, 0, (C17642l<? super B, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {973}, m = "verticalDrag-jO51t88")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27137c;

        /* renamed from: d  reason: collision with root package name */
        Object f27138d;

        /* renamed from: e  reason: collision with root package name */
        Object f27139e;

        /* renamed from: f  reason: collision with root package name */
        Object f27140f;

        /* renamed from: g  reason: collision with root package name */
        Object f27141g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f27142h;

        /* renamed from: i  reason: collision with root package name */
        int f27143i;

        n(C17164e<? super n> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27142h = obj;
            this.f27143i |= Integer.MIN_VALUE;
            return m.l((C4336c) null, 0, (C17642l<? super B, C16807N>) null, this);
        }
    }

    static {
        float B10 = c2.h.B((float) 0.125d);
        f27077a = B10;
        float B11 = c2.h.B((float) 18);
        f27078b = B11;
        f27079c = B10 / B11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (A1.C4350q.k(r11) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(A1.C4336c r17, long r18, dI.C17164e<? super A1.B> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof p0.m.a
            if (r3 == 0) goto L_0x0017
            r3 = r2
            p0.m$a r3 = (p0.m.a) r3
            int r4 = r3.f27083f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f27083f = r4
            goto L_0x001c
        L_0x0017:
            p0.m$a r3 = new p0.m$a
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f27082e
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f27083f
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.f27081d
            kotlin.jvm.internal.N r0 = (kotlin.jvm.internal.N) r0
            java.lang.Object r1 = r3.f27080c
            A1.c r1 = (A1.C4336c) r1
            XH.y.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            XH.y.b(r2)
            A1.p r2 = r17.b1()
            boolean r2 = j(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.N r2 = new kotlin.jvm.internal.N
            r2.<init>()
            r2.f144347a = r0
            r0 = r17
        L_0x005a:
            r3.f27080c = r0
            r3.f27081d = r2
            r3.f27083f = r6
            java.lang.Object r1 = A1.C4336c.J1(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            A1.p r2 = (A1.C4349p) r2
            java.util.List r5 = r2.c()
            int r8 = r5.size()
            r9 = 0
            r10 = r9
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            A1.B r12 = (A1.B) r12
            long r12 = r12.f()
            long r14 = r1.f144347a
            boolean r12 = A1.A.d(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r7
        L_0x0092:
            A1.B r11 = (A1.B) r11
            if (r11 != 0) goto L_0x0098
            r11 = r7
            goto L_0x00cc
        L_0x0098:
            boolean r5 = A1.C4350q.d(r11)
            if (r5 == 0) goto L_0x00c6
            java.util.List r2 = r2.c()
            int r5 = r2.size()
        L_0x00a6:
            if (r9 >= r5) goto L_0x00b9
            java.lang.Object r8 = r2.get(r9)
            r10 = r8
            A1.B r10 = (A1.B) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            int r9 = r9 + 1
            goto L_0x00a6
        L_0x00b9:
            r8 = r7
        L_0x00ba:
            A1.B r8 = (A1.B) r8
            if (r8 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00bf:
            long r8 = r8.f()
            r1.f144347a = r8
            goto L_0x00d6
        L_0x00c6:
            boolean r2 = A1.C4350q.k(r11)
            if (r2 == 0) goto L_0x00d6
        L_0x00cc:
            if (r11 == 0) goto L_0x00d5
            boolean r0 = r11.p()
            if (r0 != 0) goto L_0x00d5
            r7 = r11
        L_0x00d5:
            return r7
        L_0x00d6:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.b(A1.c, long, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(A1.C4336c r9, long r10, dI.C17164e<? super A1.B> r12) {
        /*
            boolean r0 = r12 instanceof p0.m.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            p0.m$b r0 = (p0.m.b) r0
            int r1 = r0.f27087f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27087f = r1
            goto L_0x0018
        L_0x0013:
            p0.m$b r0 = new p0.m$b
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f27086e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27087f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r9 = r0.f27085d
            kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
            java.lang.Object r10 = r0.f27084c
            A1.B r10 = (A1.B) r10
            XH.y.b(r12)     // Catch:{ s -> 0x009b }
            goto L_0x00a4
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            XH.y.b(r12)
            A1.p r12 = r9.b1()
            boolean r12 = j(r12, r10)
            if (r12 == 0) goto L_0x0049
            return r4
        L_0x0049:
            A1.p r12 = r9.b1()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L_0x0056:
            if (r5 >= r2) goto L_0x006d
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            A1.B r7 = (A1.B) r7
            long r7 = r7.f()
            boolean r7 = A1.A.d(r7, r10)
            if (r7 == 0) goto L_0x006a
            goto L_0x006e
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0056
        L_0x006d:
            r6 = r4
        L_0x006e:
            r10 = r6
            A1.B r10 = (A1.B) r10
            if (r10 != 0) goto L_0x0074
            return r4
        L_0x0074:
            kotlin.jvm.internal.O r11 = new kotlin.jvm.internal.O
            r11.<init>()
            kotlin.jvm.internal.O r12 = new kotlin.jvm.internal.O
            r12.<init>()
            r12.f144348a = r10
            androidx.compose.ui.platform.w1 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            p0.m$c r2 = new p0.m$c     // Catch:{ s -> 0x009a }
            r2.<init>(r12, r11, r4)     // Catch:{ s -> 0x009a }
            r0.f27084c = r10     // Catch:{ s -> 0x009a }
            r0.f27085d = r11     // Catch:{ s -> 0x009a }
            r0.f27087f = r3     // Catch:{ s -> 0x009a }
            java.lang.Object r9 = r9.S(r5, r2, r0)     // Catch:{ s -> 0x009a }
            if (r9 != r1) goto L_0x00a4
            return r1
        L_0x009a:
            r9 = r11
        L_0x009b:
            T r9 = r9.f144348a
            A1.B r9 = (A1.B) r9
            if (r9 != 0) goto L_0x00a3
            r4 = r10
            goto L_0x00a4
        L_0x00a3:
            r4 = r9
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.c(A1.c, long, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(A1.C4336c r18, long r19, nI.p<? super A1.B, ? super o1.C5667g, XH.C16807N> r21, dI.C17164e<? super A1.B> r22) {
        /*
            r0 = r19
            r2 = r22
            boolean r3 = r2 instanceof p0.m.d
            if (r3 == 0) goto L_0x0017
            r3 = r2
            p0.m$d r3 = (p0.m.d) r3
            int r4 = r3.f27101j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f27101j = r4
            goto L_0x001c
        L_0x0017:
            p0.m$d r3 = new p0.m$d
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f27100i
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f27101j
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r7) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            float r0 = r3.f27099h
            java.lang.Object r1 = r3.f27098g
            A1.B r1 = (A1.B) r1
            java.lang.Object r5 = r3.f27097f
            p0.J r5 = (p0.J) r5
            java.lang.Object r9 = r3.f27096e
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            java.lang.Object r10 = r3.f27095d
            A1.c r10 = (A1.C4336c) r10
            java.lang.Object r11 = r3.f27094c
            nI.p r11 = (nI.p) r11
            XH.y.b(r2)
            r2 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L_0x0162
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.f27099h
            java.lang.Object r1 = r3.f27097f
            p0.J r1 = (p0.J) r1
            java.lang.Object r5 = r3.f27096e
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            java.lang.Object r9 = r3.f27095d
            A1.c r9 = (A1.C4336c) r9
            java.lang.Object r10 = r3.f27094c
            nI.p r10 = (nI.p) r10
            XH.y.b(r2)
            r17 = r5
            r5 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r10
            r10 = r17
            goto L_0x00c1
        L_0x0073:
            XH.y.b(r2)
            A1.P$a r2 = A1.P.f4356a
            int r2 = r2.d()
            A1.p r5 = r18.b1()
            boolean r5 = j(r5, r0)
            if (r5 == 0) goto L_0x0088
            goto L_0x0169
        L_0x0088:
            androidx.compose.ui.platform.w1 r5 = r18.getViewConfiguration()
            float r2 = k(r5, r2)
            kotlin.jvm.internal.N r5 = new kotlin.jvm.internal.N
            r5.<init>()
            r5.f144347a = r0
            p0.J r0 = new p0.J
            r0.<init>(r8)
            r1 = r21
            r9 = r5
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r18
        L_0x00a4:
            r5.f27094c = r1
            r5.f27095d = r0
            r5.f27096e = r9
            r5.f27097f = r2
            r5.f27098g = r8
            r5.f27099h = r3
            r5.f27101j = r7
            java.lang.Object r10 = A1.C4336c.J1(r0, r8, r5, r7, r8)
            if (r10 != r4) goto L_0x00b9
            return r4
        L_0x00b9:
            r17 = r3
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
            r5 = r17
        L_0x00c1:
            A1.p r2 = (A1.C4349p) r2
            java.util.List r11 = r2.c()
            int r12 = r11.size()
            r14 = 0
        L_0x00cc:
            if (r14 >= r12) goto L_0x00ea
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            A1.B r16 = (A1.B) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r10.f144347a
            boolean r7 = A1.A.d(r7, r13)
            if (r7 == 0) goto L_0x00e5
            goto L_0x00eb
        L_0x00e5:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00cc
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            r7 = r15
            A1.B r7 = (A1.B) r7
            if (r7 != 0) goto L_0x00f3
        L_0x00f0:
            r8 = 0
            goto L_0x0169
        L_0x00f3:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x00fa
            goto L_0x00f0
        L_0x00fa:
            boolean r8 = A1.C4350q.d(r7)
            if (r8 == 0) goto L_0x0129
            java.util.List r2 = r2.c()
            int r7 = r2.size()
            r13 = 0
        L_0x0109:
            if (r13 >= r7) goto L_0x011c
            java.lang.Object r8 = r2.get(r13)
            r11 = r8
            A1.B r11 = (A1.B) r11
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            int r13 = r13 + 1
            goto L_0x0109
        L_0x011c:
            r8 = 0
        L_0x011d:
            A1.B r8 = (A1.B) r8
            if (r8 != 0) goto L_0x0122
            goto L_0x00f0
        L_0x0122:
            long r7 = r8.f()
            r10.f144347a = r7
            goto L_0x013d
        L_0x0129:
            o1.g r2 = r3.a(r7, r5)
            if (r2 == 0) goto L_0x0145
            r1.invoke(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x013a
            r8 = r7
            goto L_0x0169
        L_0x013a:
            r3.e()
        L_0x013d:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r10
        L_0x0141:
            r7 = 1
            r8 = 0
            goto L_0x00a4
        L_0x0145:
            A1.r r2 = A1.r.Final
            r9.f27094c = r1
            r9.f27095d = r0
            r9.f27096e = r10
            r9.f27097f = r3
            r9.f27098g = r7
            r9.f27099h = r5
            r9.f27101j = r6
            java.lang.Object r2 = r0.B1(r2, r9)
            if (r2 != r4) goto L_0x015c
            return r4
        L_0x015c:
            r11 = r1
            r2 = r3
            r3 = r5
            r1 = r7
            r5 = r9
            r9 = r10
        L_0x0162:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x016a
            goto L_0x00f0
        L_0x0169:
            return r8
        L_0x016a:
            r1 = r11
            goto L_0x0141
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.d(A1.c, long, nI.p, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(A1.C4336c r18, long r19, nI.p<? super A1.B, ? super java.lang.Float, XH.C16807N> r21, dI.C17164e<? super A1.B> r22) {
        /*
            r0 = r19
            r2 = r22
            boolean r3 = r2 instanceof p0.m.e
            if (r3 == 0) goto L_0x0017
            r3 = r2
            p0.m$e r3 = (p0.m.e) r3
            int r4 = r3.f27109j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f27109j = r4
            goto L_0x001c
        L_0x0017:
            p0.m$e r3 = new p0.m$e
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f27108i
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f27109j
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r7) goto L_0x0054
            if (r5 != r6) goto L_0x004c
            float r0 = r3.f27107h
            java.lang.Object r1 = r3.f27106g
            A1.B r1 = (A1.B) r1
            java.lang.Object r5 = r3.f27105f
            p0.J r5 = (p0.J) r5
            java.lang.Object r9 = r3.f27104e
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            java.lang.Object r10 = r3.f27103d
            A1.c r10 = (A1.C4336c) r10
            java.lang.Object r11 = r3.f27102c
            nI.p r11 = (nI.p) r11
            XH.y.b(r2)
            r2 = r5
            r5 = r3
            r3 = r0
            r0 = r10
            goto L_0x016f
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0054:
            float r0 = r3.f27107h
            java.lang.Object r1 = r3.f27105f
            p0.J r1 = (p0.J) r1
            java.lang.Object r5 = r3.f27104e
            kotlin.jvm.internal.N r5 = (kotlin.jvm.internal.N) r5
            java.lang.Object r9 = r3.f27103d
            A1.c r9 = (A1.C4336c) r9
            java.lang.Object r10 = r3.f27102c
            nI.p r10 = (nI.p) r10
            XH.y.b(r2)
            r17 = r5
            r5 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r10
            r10 = r17
            goto L_0x00c2
        L_0x0073:
            XH.y.b(r2)
            A1.P$a r2 = A1.P.f4356a
            int r2 = r2.d()
            p0.v r5 = p0.v.Vertical
            A1.p r9 = r18.b1()
            boolean r9 = j(r9, r0)
            if (r9 == 0) goto L_0x008a
            goto L_0x0177
        L_0x008a:
            androidx.compose.ui.platform.w1 r9 = r18.getViewConfiguration()
            float r2 = k(r9, r2)
            kotlin.jvm.internal.N r9 = new kotlin.jvm.internal.N
            r9.<init>()
            r9.f144347a = r0
            p0.J r0 = new p0.J
            r0.<init>(r5)
            r1 = r21
            r5 = r3
            r3 = r2
            r2 = r0
            r0 = r18
        L_0x00a5:
            r5.f27102c = r1
            r5.f27103d = r0
            r5.f27104e = r9
            r5.f27105f = r2
            r5.f27106g = r8
            r5.f27107h = r3
            r5.f27109j = r7
            java.lang.Object r10 = A1.C4336c.J1(r0, r8, r5, r7, r8)
            if (r10 != r4) goto L_0x00ba
            return r4
        L_0x00ba:
            r17 = r3
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
            r5 = r17
        L_0x00c2:
            A1.p r2 = (A1.C4349p) r2
            java.util.List r11 = r2.c()
            int r12 = r11.size()
            r14 = 0
        L_0x00cd:
            if (r14 >= r12) goto L_0x00eb
            java.lang.Object r15 = r11.get(r14)
            r16 = r15
            A1.B r16 = (A1.B) r16
            long r7 = r16.f()
            r16 = r14
            long r13 = r10.f144347a
            boolean r7 = A1.A.d(r7, r13)
            if (r7 == 0) goto L_0x00e6
            goto L_0x00ec
        L_0x00e6:
            int r14 = r16 + 1
            r7 = 1
            r8 = 0
            goto L_0x00cd
        L_0x00eb:
            r15 = 0
        L_0x00ec:
            r7 = r15
            A1.B r7 = (A1.B) r7
            if (r7 != 0) goto L_0x00f4
        L_0x00f1:
            r8 = 0
            goto L_0x0177
        L_0x00f4:
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x00fb
            goto L_0x00f1
        L_0x00fb:
            boolean r8 = A1.C4350q.d(r7)
            if (r8 == 0) goto L_0x012a
            java.util.List r2 = r2.c()
            int r7 = r2.size()
            r13 = 0
        L_0x010a:
            if (r13 >= r7) goto L_0x011d
            java.lang.Object r8 = r2.get(r13)
            r11 = r8
            A1.B r11 = (A1.B) r11
            boolean r11 = r11.i()
            if (r11 == 0) goto L_0x011a
            goto L_0x011e
        L_0x011a:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x011d:
            r8 = 0
        L_0x011e:
            A1.B r8 = (A1.B) r8
            if (r8 != 0) goto L_0x0123
            goto L_0x00f1
        L_0x0123:
            long r7 = r8.f()
            r10.f144347a = r7
            goto L_0x014a
        L_0x012a:
            o1.g r2 = r3.a(r7, r5)
            if (r2 == 0) goto L_0x0152
            long r11 = r2.v()
            float r2 = o1.C5667g.n(r11)
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.d(r2)
            r1.invoke(r7, r2)
            boolean r2 = r7.p()
            if (r2 == 0) goto L_0x0147
            r8 = r7
            goto L_0x0177
        L_0x0147:
            r3.e()
        L_0x014a:
            r2 = r3
            r3 = r5
            r5 = r9
            r9 = r10
        L_0x014e:
            r7 = 1
            r8 = 0
            goto L_0x00a5
        L_0x0152:
            A1.r r2 = A1.r.Final
            r9.f27102c = r1
            r9.f27103d = r0
            r9.f27104e = r10
            r9.f27105f = r3
            r9.f27106g = r7
            r9.f27107h = r5
            r9.f27109j = r6
            java.lang.Object r2 = r0.B1(r2, r9)
            if (r2 != r4) goto L_0x0169
            return r4
        L_0x0169:
            r11 = r1
            r2 = r3
            r3 = r5
            r1 = r7
            r5 = r9
            r9 = r10
        L_0x016f:
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x0178
            goto L_0x00f1
        L_0x0177:
            return r8
        L_0x0178:
            r1 = r11
            goto L_0x014e
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.e(A1.c, long, nI.p, dI.e):java.lang.Object");
    }

    public static final Object f(K k10, C17642l<? super C5667g, C16807N> lVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, p<? super B, ? super C5667g, C16807N> pVar, C17164e<? super C16807N> eVar) {
        Object g10 = g(k10, new i(lVar), new j(aVar), aVar2, k.f27115c, (v) null, pVar, eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public static final Object g(K k10, q<? super B, ? super B, ? super C5667g, C16807N> qVar, C17642l<? super B, C16807N> lVar, C17631a<C16807N> aVar, C17631a<Boolean> aVar2, v vVar, p<? super B, ? super C5667g, C16807N> pVar, C17164e<? super C16807N> eVar) {
        K k11 = k10;
        Object c10 = t.c(k10, new l(aVar2, new N(), vVar, qVar, pVar, aVar, lVar, (C17164e<? super l>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object h(K k10, C17642l lVar, C17631a aVar, C17631a aVar2, p pVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f.f27110c;
        }
        C17642l lVar2 = lVar;
        if ((i10 & 2) != 0) {
            aVar = g.f27111c;
        }
        C17631a aVar3 = aVar;
        if ((i10 & 4) != 0) {
            aVar2 = h.f27112c;
        }
        return f(k10, lVar2, aVar3, aVar2, pVar, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object i(A1.C4336c r4, long r5, nI.C17642l<? super A1.B, XH.C16807N> r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof p0.m.C0442m
            if (r0 == 0) goto L_0x0013
            r0 = r8
            p0.m$m r0 = (p0.m.C0442m) r0
            int r1 = r0.f27136f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27136f = r1
            goto L_0x0018
        L_0x0013:
            p0.m$m r0 = new p0.m$m
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f27135e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27136f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f27134d
            nI.l r4 = (nI.C17642l) r4
            java.lang.Object r5 = r0.f27133c
            A1.c r5 = (A1.C4336c) r5
            XH.y.b(r8)
            r7 = r4
            r4 = r5
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            XH.y.b(r8)
        L_0x003e:
            r0.f27133c = r4
            r0.f27134d = r7
            r0.f27136f = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            A1.B r8 = (A1.B) r8
            if (r8 != 0) goto L_0x0055
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L_0x0055:
            boolean r5 = A1.C4350q.d(r8)
            if (r5 == 0) goto L_0x0060
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L_0x0060:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.i(A1.c, long, nI.l, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean j(C4349p pVar, long j10) {
        B b10;
        List<B> c10 = pVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                b10 = null;
                break;
            }
            b10 = c10.get(i10);
            if (A.d(b10.f(), j10)) {
                break;
            }
            i10++;
        }
        B b11 = b10;
        if (b11 != null && b11.i()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float k(w1 w1Var, int i10) {
        return P.g(i10, P.f4356a.b()) ? w1Var.g() * f27079c : w1Var.g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: A1.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: A1.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: A1.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: A1.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (((r8 != null ? r8 == p0.v.Vertical ? o1.C5667g.n(r4) : o1.C5667g.m(r4) : o1.C5667g.k(r4)) == 0.0f) == false) goto L_0x010d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(A1.C4336c r18, long r19, nI.C17642l<? super A1.B, XH.C16807N> r21, dI.C17164e<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof p0.m.n
            if (r1 == 0) goto L_0x0015
            r1 = r0
            p0.m$n r1 = (p0.m.n) r1
            int r2 = r1.f27143i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f27143i = r2
            goto L_0x001a
        L_0x0015:
            p0.m$n r1 = new p0.m$n
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f27142h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r1.f27143i
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004d
            if (r3 != r5) goto L_0x0045
            java.lang.Object r3 = r1.f27141g
            kotlin.jvm.internal.N r3 = (kotlin.jvm.internal.N) r3
            java.lang.Object r7 = r1.f27140f
            A1.c r7 = (A1.C4336c) r7
            java.lang.Object r8 = r1.f27139e
            p0.v r8 = (p0.v) r8
            java.lang.Object r9 = r1.f27138d
            A1.c r9 = (A1.C4336c) r9
            java.lang.Object r10 = r1.f27137c
            nI.l r10 = (nI.C17642l) r10
            XH.y.b(r0)
            r16 = r10
            r10 = r1
            r1 = r16
            goto L_0x0089
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            XH.y.b(r0)
            p0.v r0 = p0.v.Vertical
            A1.p r3 = r18.b1()
            r7 = r19
            boolean r3 = j(r3, r7)
            if (r3 == 0) goto L_0x0060
            goto L_0x011f
        L_0x0060:
            r3 = r0
            r9 = r1
            r0 = r18
            r1 = r21
        L_0x0066:
            kotlin.jvm.internal.N r10 = new kotlin.jvm.internal.N
            r10.<init>()
            r10.f144347a = r7
            r7 = r0
            r8 = r3
            r3 = r10
        L_0x0070:
            r9.f27137c = r1
            r9.f27138d = r0
            r9.f27139e = r8
            r9.f27140f = r7
            r9.f27141g = r3
            r9.f27143i = r5
            java.lang.Object r10 = A1.C4336c.J1(r7, r6, r9, r5, r6)
            if (r10 != r2) goto L_0x0083
            return r2
        L_0x0083:
            r16 = r9
            r9 = r0
            r0 = r10
            r10 = r16
        L_0x0089:
            A1.p r0 = (A1.C4349p) r0
            java.util.List r11 = r0.c()
            int r12 = r11.size()
            r13 = 0
        L_0x0094:
            if (r13 >= r12) goto L_0x00b3
            java.lang.Object r14 = r11.get(r13)
            r15 = r14
            A1.B r15 = (A1.B) r15
            long r4 = r15.f()
            r18 = r7
            long r6 = r3.f144347a
            boolean r4 = A1.A.d(r4, r6)
            if (r4 == 0) goto L_0x00ac
            goto L_0x00b6
        L_0x00ac:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            r7 = r18
            goto L_0x0094
        L_0x00b3:
            r18 = r7
            r14 = 0
        L_0x00b6:
            A1.B r14 = (A1.B) r14
            if (r14 != 0) goto L_0x00bc
            r14 = 0
            goto L_0x010d
        L_0x00bc:
            boolean r4 = A1.C4350q.d(r14)
            if (r4 == 0) goto L_0x00eb
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = 0
        L_0x00cb:
            if (r5 >= r4) goto L_0x00de
            java.lang.Object r6 = r0.get(r5)
            r7 = r6
            A1.B r7 = (A1.B) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x00db
            goto L_0x00df
        L_0x00db:
            int r5 = r5 + 1
            goto L_0x00cb
        L_0x00de:
            r6 = 0
        L_0x00df:
            A1.B r6 = (A1.B) r6
            if (r6 != 0) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            long r4 = r6.f()
            r3.f144347a = r4
            goto L_0x013b
        L_0x00eb:
            long r4 = A1.C4350q.h(r14)
            if (r8 != 0) goto L_0x00f6
            float r0 = o1.C5667g.k(r4)
            goto L_0x0103
        L_0x00f6:
            p0.v r0 = p0.v.Vertical
            if (r8 != r0) goto L_0x00ff
            float r0 = o1.C5667g.n(r4)
            goto L_0x0103
        L_0x00ff:
            float r0 = o1.C5667g.m(r4)
        L_0x0103:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x010a
            r0 = 1
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            if (r0 != 0) goto L_0x013b
        L_0x010d:
            if (r14 != 0) goto L_0x0111
        L_0x010f:
            r6 = 0
            goto L_0x011f
        L_0x0111:
            boolean r0 = r14.p()
            if (r0 == 0) goto L_0x0118
            goto L_0x010f
        L_0x0118:
            boolean r0 = A1.C4350q.d(r14)
            if (r0 == 0) goto L_0x0129
            r6 = r14
        L_0x011f:
            if (r6 == 0) goto L_0x0123
            r4 = 1
            goto L_0x0124
        L_0x0123:
            r4 = 0
        L_0x0124:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r0
        L_0x0129:
            r1.invoke(r14)
            long r3 = r14.f()
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            r16 = r3
            r3 = r8
            r7 = r16
            goto L_0x0066
        L_0x013b:
            r7 = r18
            r0 = r9
            r9 = r10
            r5 = 1
            r6 = 0
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.m.l(A1.c, long, nI.l, dI.e):java.lang.Object");
    }
}
