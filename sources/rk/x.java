package rK;

import A1.B;
import A1.C4336c;
import A1.C4350q;
import A1.K;
import A1.r;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5673m;
import p0.G;
import rK.t;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a|\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001H@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0019\u001a\u0004\u0018\u00010\f*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\u0003*\u00020\u0017H@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LA1/K;", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onPress", "onTap", "onLongPress", "onDoubleTap", "LrK/t;", "onQuickZoom", "l", "(LA1/K;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LdI/e;)Ljava/lang/Object;", "LA1/B;", "", "j", "(LA1/B;)F", "i", "(F)F", "first", "second", "", "g", "(LA1/K;LA1/B;LA1/B;)Z", "LA1/c;", "firstUp", "h", "(LA1/c;LA1/B;LdI/e;)Ljava/lang/Object;", "k", "(LA1/c;LdI/e;)Ljava/lang/Object;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LA1/B;", "<anonymous>", "(LA1/c;)LA1/B;"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableKt$awaitSecondDown$2", f = "tappableAndQuickZoomable.kt", l = {280}, m = "invokeSuspend")
    static final class a extends k implements p<C4336c, C17164e<? super B>, Object> {

        /* renamed from: d  reason: collision with root package name */
        long f146815d;

        /* renamed from: e  reason: collision with root package name */
        int f146816e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f146817f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ B f146818g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(B b10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f146818g = b10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f146818g, eVar);
            aVar.f146817f = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super B> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0042 A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f146816e
                r2 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                long r3 = r7.f146815d
                java.lang.Object r1 = r7.f146817f
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r8)
                goto L_0x0043
            L_0x0015:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001d:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f146817f
                A1.c r8 = (A1.C4336c) r8
                A1.B r1 = r7.f146818g
                long r3 = r1.o()
                androidx.compose.ui.platform.w1 r1 = r8.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r8
            L_0x0034:
                A1.r r8 = A1.r.Main
                r7.f146817f = r1
                r7.f146815d = r3
                r7.f146816e = r2
                java.lang.Object r8 = p0.G.d(r1, r2, r8, r7)
                if (r8 != r0) goto L_0x0043
                return r0
            L_0x0043:
                A1.B r8 = (A1.B) r8
                long r5 = r8.o()
                int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x0034
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rK.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableKt", f = "tappableAndQuickZoomable.kt", l = {293}, m = "consumeUntilUp")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146819c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f146820d;

        /* renamed from: e  reason: collision with root package name */
        int f146821e;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f146820d = obj;
            this.f146821e |= Integer.MIN_VALUE;
            return x.k((C4336c) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableKt$detectTapAndQuickZoomGestures$2", f = "tappableAndQuickZoomable.kt", l = {184, 193, 200, 204, 213, 221}, m = "invokeSuspend")
    static final class c extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f146822d;

        /* renamed from: e  reason: collision with root package name */
        long f146823e;

        /* renamed from: f  reason: collision with root package name */
        int f146824f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f146825g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f146826h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f146827i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f146828j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ K f146829k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<t, C16807N> f146830l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f146831m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LA1/B;", "<anonymous>", "(LA1/c;)LA1/B;"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.zoomable.internal.TappableAndQuickZoomableKt$detectTapAndQuickZoomGestures$2$1", f = "tappableAndQuickZoomable.kt", l = {194}, m = "invokeSuspend")
        static final class a extends k implements p<C4336c, C17164e<? super B>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f146832d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f146833e;

            a(C17164e<? super a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(eVar);
                aVar.f146833e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C4336c cVar, C17164e<? super B> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146832d;
                if (i10 == 0) {
                    y.b(obj);
                    this.f146832d = 1;
                    obj = G.l((C4336c) this.f146833e, (r) null, this, 1, (Object) null);
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "drag", "LXH/N;", "a", "(LA1/B;)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends C17544u implements C17642l<B, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<t, C16807N> f146834c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ B f146835d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C17642l<? super t, C16807N> lVar, B b10) {
                super(1);
                this.f146834c = lVar;
                this.f146835d = b10;
            }

            public final void a(B b10) {
                C17542s.j(b10, "drag");
                this.f146834c.invoke(new t.b(this.f146835d.h(), x.j(b10), (DefaultConstructorMarker) null));
                b10.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((B) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA1/B;", "change", "", "over", "LXH/N;", "a", "(LA1/B;F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: rK.x$c$c  reason: collision with other inner class name */
        static final class C4272c extends C17544u implements p<B, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<t, C16807N> f146836c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ B f146837d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4272c(C17642l<? super t, C16807N> lVar, B b10) {
                super(2);
                this.f146836c = lVar;
                this.f146837d = b10;
            }

            public final void a(B b10, float f10) {
                C17542s.j(b10, "change");
                this.f146836c.invoke(new t.b(this.f146837d.h(), x.i(f10), (DefaultConstructorMarker) null));
                b10.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((B) obj, ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3, K k10, C17642l<? super t, C16807N> lVar4, C17642l<? super C5667g, C16807N> lVar5, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f146826h = lVar;
            this.f146827i = lVar2;
            this.f146828j = lVar3;
            this.f146829k = k10;
            this.f146830l = lVar4;
            this.f146831m = lVar5;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f146826h, this.f146827i, this.f146828j, this.f146829k, this.f146830l, this.f146831m, eVar);
            cVar.f146825g = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
            r1 = (A1.B) r11;
            r1.a();
            r10.f146826h.invoke(o1.C5667g.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
            if (r10.f146827i == null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
            r4 = r3.getViewConfiguration().c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
            r4 = 4611686018427387903L;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r11 = new rK.x.c.a((dI.C17164e<? super rK.x.c.a>) null);
            r10.f146825g = r3;
            r10.f146822d = r1;
            r10.f146824f = 2;
            r11 = r3.S(r4, r11, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
            if (r11 != r0) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
            r11 = (A1.B) r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
            if (r11 == null) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r11.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
            r1 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
            r4 = r10.f146827i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
            if (r4 != null) goto L_0x00b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
            r4.invoke(o1.C5667g.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c3, code lost:
            r10.f146825g = r3;
            r10.f146822d = r11;
            r10.f146824f = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
            if (rK.x.e(r3, r10) == r0) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d1, code lost:
            if (r1 != null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
            r10.f146825g = r3;
            r10.f146822d = r1;
            r10.f146824f = 4;
            r11 = rK.x.b(r3, r1, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00de, code lost:
            if (r11 == r0) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
            r11 = (A1.B) r11;
            r3 = IJ.C15915k.a.f135505a.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e9, code lost:
            if (r11 != null) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
            r11.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
            if (r11 == null) goto L_0x00f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
            r11 = r10.f146828j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
            if (r11 != null) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
            r11.invoke(o1.C5667g.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
            if (rK.x.a(r10.f146829k, r1, r11) != false) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
            r6 = r11.f();
            r1 = new rK.x.c.C4272c(r10.f146830l, r11);
            r10.f146825g = r5;
            r10.f146822d = r11;
            r10.f146823e = r3;
            r10.f146824f = 5;
            r1 = p0.m.e(r5, r6, r1, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0121, code lost:
            if (r1 == r0) goto L_0x0123;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
            r9 = r1;
            r1 = r11;
            r11 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0129, code lost:
            if (((A1.B) r11) != null) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x012b, code lost:
            r3 = r1.f();
            r11 = new rK.x.c.b(r10.f146830l, r1);
            r10.f146825g = null;
            r10.f146822d = null;
            r10.f146824f = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
            if (p0.m.l(r5, r3, r11, r10) == r0) goto L_0x0143;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
            r10.f146830l.invoke(rK.t.a.f146799a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
            r2 = IJ.C15915k.a.C3333a.n(r3);
            r11 = IJ.C15906b.f135496b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
            if (IJ.C15906b.C(r2, IJ.C15908d.t(r5.getViewConfiguration().a(), IJ.C15909e.MILLISECONDS)) < 0) goto L_0x0166;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0166, code lost:
            r10.f146831m.invoke(o1.C5667g.d(r1.h()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0175, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
            r5 = r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f146824f
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0058;
                    case 1: goto L_0x004f;
                    case 2: goto L_0x0041;
                    case 3: goto L_0x0034;
                    case 4: goto L_0x0026;
                    case 5: goto L_0x0017;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0012:
                XH.y.b(r11)
                goto L_0x0144
            L_0x0017:
                long r3 = r10.f146823e
                java.lang.Object r1 = r10.f146822d
                A1.B r1 = (A1.B) r1
                java.lang.Object r5 = r10.f146825g
                A1.c r5 = (A1.C4336c) r5
                XH.y.b(r11)
                goto L_0x0127
            L_0x0026:
                java.lang.Object r1 = r10.f146822d
                A1.B r1 = (A1.B) r1
                java.lang.Object r3 = r10.f146825g
                A1.c r3 = (A1.C4336c) r3
                XH.y.b(r11)
            L_0x0031:
                r5 = r3
                goto L_0x00e1
            L_0x0034:
                java.lang.Object r1 = r10.f146822d
                A1.B r1 = (A1.B) r1
                java.lang.Object r3 = r10.f146825g
                A1.c r3 = (A1.C4336c) r3
                XH.y.b(r11)
                goto L_0x00d1
            L_0x0041:
                java.lang.Object r1 = r10.f146822d
                A1.B r1 = (A1.B) r1
                java.lang.Object r3 = r10.f146825g
                A1.c r3 = (A1.C4336c) r3
                XH.y.b(r11)     // Catch:{ s -> 0x004d }
                goto L_0x00ab
            L_0x004d:
                r11 = r2
                goto L_0x00b4
            L_0x004f:
                java.lang.Object r1 = r10.f146825g
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r11)
                r3 = r1
                goto L_0x0073
            L_0x0058:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f146825g
                A1.c r11 = (A1.C4336c) r11
                r10.f146825g = r11
                r1 = 1
                r10.f146824f = r1
                r4 = 0
                r5 = 0
                r7 = 3
                r8 = 0
                r3 = r11
                r6 = r10
                java.lang.Object r1 = p0.G.e(r3, r4, r5, r6, r7, r8)
                if (r1 != r0) goto L_0x0071
                return r0
            L_0x0071:
                r3 = r11
                r11 = r1
            L_0x0073:
                r1 = r11
                A1.B r1 = (A1.B) r1
                r1.a()
                nI.l<o1.g, XH.N> r11 = r10.f146826h
                long r4 = r1.h()
                o1.g r4 = o1.C5667g.d(r4)
                r11.invoke(r4)
                nI.l<o1.g, XH.N> r11 = r10.f146827i
                if (r11 == 0) goto L_0x0093
                androidx.compose.ui.platform.w1 r11 = r3.getViewConfiguration()
                long r4 = r11.c()
                goto L_0x0098
            L_0x0093:
                r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            L_0x0098:
                rK.x$c$a r11 = new rK.x$c$a     // Catch:{ s -> 0x004d }
                r11.<init>(r2)     // Catch:{ s -> 0x004d }
                r10.f146825g = r3     // Catch:{ s -> 0x004d }
                r10.f146822d = r1     // Catch:{ s -> 0x004d }
                r6 = 2
                r10.f146824f = r6     // Catch:{ s -> 0x004d }
                java.lang.Object r11 = r3.S(r4, r11, r10)     // Catch:{ s -> 0x004d }
                if (r11 != r0) goto L_0x00ab
                return r0
            L_0x00ab:
                A1.B r11 = (A1.B) r11     // Catch:{ s -> 0x004d }
                if (r11 == 0) goto L_0x00b2
                r11.a()     // Catch:{ s -> 0x00b4 }
            L_0x00b2:
                r1 = r11
                goto L_0x00d1
            L_0x00b4:
                nI.l<o1.g, XH.N> r4 = r10.f146827i
                if (r4 == 0) goto L_0x00c3
                long r5 = r1.h()
                o1.g r1 = o1.C5667g.d(r5)
                r4.invoke(r1)
            L_0x00c3:
                r10.f146825g = r3
                r10.f146822d = r11
                r1 = 3
                r10.f146824f = r1
                java.lang.Object r1 = rK.x.k(r3, r10)
                if (r1 != r0) goto L_0x00b2
                return r0
            L_0x00d1:
                if (r1 == 0) goto L_0x0173
                r10.f146825g = r3
                r10.f146822d = r1
                r11 = 4
                r10.f146824f = r11
                java.lang.Object r11 = rK.x.h(r3, r1, r10)
                if (r11 != r0) goto L_0x0031
                return r0
            L_0x00e1:
                A1.B r11 = (A1.B) r11
                IJ.k$a r3 = IJ.C15915k.a.f135505a
                long r3 = r3.b()
                if (r11 == 0) goto L_0x00ee
                r11.a()
            L_0x00ee:
                if (r11 != 0) goto L_0x0101
                nI.l<o1.g, XH.N> r11 = r10.f146828j
                if (r11 == 0) goto L_0x0173
                long r0 = r1.h()
                o1.g r0 = o1.C5667g.d(r0)
                r11.invoke(r0)
                goto L_0x0173
            L_0x0101:
                A1.K r6 = r10.f146829k
                boolean r1 = rK.x.g(r6, r1, r11)
                if (r1 == 0) goto L_0x0173
                long r6 = r11.f()
                rK.x$c$c r1 = new rK.x$c$c
                nI.l<rK.t, XH.N> r8 = r10.f146830l
                r1.<init>(r8, r11)
                r10.f146825g = r5
                r10.f146822d = r11
                r10.f146823e = r3
                r8 = 5
                r10.f146824f = r8
                java.lang.Object r1 = p0.m.e(r5, r6, r1, r10)
                if (r1 != r0) goto L_0x0124
                return r0
            L_0x0124:
                r9 = r1
                r1 = r11
                r11 = r9
            L_0x0127:
                A1.B r11 = (A1.B) r11
                if (r11 == 0) goto L_0x014c
                long r3 = r1.f()
                rK.x$c$b r11 = new rK.x$c$b
                nI.l<rK.t, XH.N> r6 = r10.f146830l
                r11.<init>(r6, r1)
                r10.f146825g = r2
                r10.f146822d = r2
                r1 = 6
                r10.f146824f = r1
                java.lang.Object r11 = p0.m.l(r5, r3, r11, r10)
                if (r11 != r0) goto L_0x0144
                return r0
            L_0x0144:
                nI.l<rK.t, XH.N> r11 = r10.f146830l
                rK.t$a r0 = rK.t.a.f146799a
                r11.invoke(r0)
                goto L_0x0173
            L_0x014c:
                long r2 = IJ.C15915k.a.C3333a.n(r3)
                IJ.b$a r11 = IJ.C15906b.f135496b
                androidx.compose.ui.platform.w1 r11 = r5.getViewConfiguration()
                long r4 = r11.a()
                IJ.e r11 = IJ.C15909e.MILLISECONDS
                long r4 = IJ.C15908d.t(r4, r11)
                int r11 = IJ.C15906b.C(r2, r4)
                if (r11 >= 0) goto L_0x0173
                nI.l<o1.g, XH.N> r11 = r10.f146831m
                long r0 = r1.h()
                o1.g r0 = o1.C5667g.d(r0)
                r11.invoke(r0)
            L_0x0173:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: rK.x.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean g(K k10, B b10, B b11) {
        long O10 = k10.O(k10.getViewConfiguration().e());
        long q10 = C5667g.q(b11.h(), b10.h());
        return Math.abs(C5667g.m(q10)) < C5673m.l(O10) && Math.abs(C5667g.n(q10)) < C5673m.i(O10);
    }

    /* access modifiers changed from: private */
    public static final Object h(C4336c cVar, B b10, C17164e<? super B> eVar) {
        return cVar.w1(cVar.getViewConfiguration().a(), new a(b10, (C17164e<? super a>) null), eVar);
    }

    /* access modifiers changed from: private */
    public static final float i(float f10) {
        return C17978n.l((f10 * 0.004f) + 1.0f, 0.1f, 2.0f);
    }

    /* access modifiers changed from: private */
    public static final float j(B b10) {
        return i(C5667g.n(C4350q.g(b10)));
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[LOOP:0: B:17:0x0050->B:18:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[SYNTHETIC] */
    public static final java.lang.Object k(A1.C4336c r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            boolean r0 = r9 instanceof rK.x.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rK.x$b r0 = (rK.x.b) r0
            int r1 = r0.f146821e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146821e = r1
            goto L_0x0018
        L_0x0013:
            rK.x$b r0 = new rK.x$b
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f146820d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f146821e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f146819c
            A1.c r8 = (A1.C4336c) r8
            XH.y.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            XH.y.b(r9)
        L_0x0038:
            r0.f146819c = r8
            r0.f146821e = r3
            r9 = 0
            java.lang.Object r9 = A1.C4336c.J1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            A1.p r9 = (A1.C4349p) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x0050:
            if (r6 >= r4) goto L_0x005e
            java.lang.Object r7 = r2.get(r6)
            A1.B r7 = (A1.B) r7
            r7.a()
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L_0x0066:
            if (r5 >= r2) goto L_0x0078
            java.lang.Object r4 = r9.get(r5)
            A1.B r4 = (A1.B) r4
            boolean r4 = r4.i()
            if (r4 == 0) goto L_0x0075
            goto L_0x0038
        L_0x0075:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x0078:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rK.x.k(A1.c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object l(K k10, C17642l<? super C5667g, C16807N> lVar, C17642l<? super C5667g, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3, C17642l<? super C5667g, C16807N> lVar4, C17642l<? super t, C16807N> lVar5, C17164e<? super C16807N> eVar) {
        Object c10 = p0.t.c(k10, new c(lVar, lVar3, lVar2, k10, lVar5, lVar4, (C17164e<? super c>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
