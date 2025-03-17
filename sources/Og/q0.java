package OG;

import A1.B;
import A1.C4336c;
import A1.K;
import A1.U;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.ui.viewinterop.e;
import com.sugarcube.decorate.v2.internal.DecorateEngineController;
import com.sugarcube.decorate.v2.internal.manager.touch.TouchManager;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.s;
import o1.C5667g;
import p0.t;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;", "decorateEngineController", "Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "touchManager", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(Lcom/sugarcube/decorate/v2/internal/DecorateEngineController;Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;Landroidx/compose/ui/d;LU0/m;II)V", "f", "(Landroidx/compose/ui/d;Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;)Landroidx/compose/ui/d;", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapperKt$pointerInputsForDecorate$1", f = "DecorateViewWrapper.kt", l = {66}, m = "invokeSuspend")
    static final class a extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f136835c;

        /* renamed from: d  reason: collision with root package name */
        Object f136836d;

        /* renamed from: e  reason: collision with root package name */
        Object f136837e;

        /* renamed from: f  reason: collision with root package name */
        Object f136838f;

        /* renamed from: g  reason: collision with root package name */
        Object f136839g;

        /* renamed from: h  reason: collision with root package name */
        Object f136840h;

        /* renamed from: i  reason: collision with root package name */
        int f136841i;

        /* renamed from: j  reason: collision with root package name */
        int f136842j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f136843k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ TouchManager f136844l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: OG.q0$a$a  reason: collision with other inner class name */
        /* synthetic */ class C3361a extends C17540p implements C17642l<C5667g, C16807N> {
            C3361a(Object obj) {
                super(1, obj, TouchManager.class, "onTap", "onTap-k-4lQ0M(J)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t(((C5667g) obj).v());
                return C16807N.f139792a;
            }

            public final void t(long j10) {
                ((TouchManager) this.receiver).m69onTapk4lQ0M(j10);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17642l<C5667g, C16807N> {
            b(Object obj) {
                super(1, obj, TouchManager.class, "onDoubleTap", "onDoubleTap-k-4lQ0M(J)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t(((C5667g) obj).v());
                return C16807N.f139792a;
            }

            public final void t(long j10) {
                ((TouchManager) this.receiver).m65onDoubleTapk4lQ0M(j10);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class c extends C17540p implements C17642l<C5667g, C16807N> {
            c(Object obj) {
                super(1, obj, TouchManager.class, "onLongPress", "onLongPress-k-4lQ0M(J)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                t(((C5667g) obj).v());
                return C16807N.f139792a;
            }

            public final void t(long j10) {
                ((TouchManager) this.receiver).m67onLongPressk4lQ0M(j10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TouchManager touchManager, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f136844l = touchManager;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f136844l, eVar);
            aVar.f136843k = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((a) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
            if (r13 != null) goto L_0x008b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f136842j
                java.lang.String r2 = "DecorateViewWrapper"
                r3 = 1
                if (r1 == 0) goto L_0x0035
                if (r1 != r3) goto L_0x002d
                java.lang.Object r0 = r12.f136840h
                uI.h r0 = (uI.C18059h) r0
                java.lang.Object r0 = r12.f136839g
                uI.h r0 = (uI.C18059h) r0
                java.lang.Object r0 = r12.f136838f
                uI.h r0 = (uI.C18059h) r0
                java.lang.Object r0 = r12.f136837e
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r0 = r12.f136836d
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r1 = r12.f136835c
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r1 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r1
                java.lang.Object r1 = r12.f136843k
                A1.K r1 = (A1.K) r1
                XH.y.b(r13)
                goto L_0x0075
            L_0x002d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0035:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f136843k
                r4 = r13
                A1.K r4 = (A1.K) r4
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r13 = r12.f136844l
                if (r13 == 0) goto L_0x0082
                boolean r1 = r13.isTapGesturesEnabled()
                if (r1 == 0) goto L_0x0077
                OG.q0$a$a r8 = new OG.q0$a$a
                r8.<init>(r13)
                OG.q0$a$b r5 = new OG.q0$a$b
                r5.<init>(r13)
                OG.q0$a$c r6 = new OG.q0$a$c
                r6.<init>(r13)
                r12.f136843k = r4
                r12.f136835c = r13
                r12.f136836d = r13
                r12.f136837e = r13
                r12.f136838f = r8
                r12.f136839g = r5
                r12.f136840h = r6
                r1 = 0
                r12.f136841i = r1
                r12.f136842j = r3
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r1 = p0.G.j(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r1 != r0) goto L_0x0074
                return r0
            L_0x0074:
                r0 = r13
            L_0x0075:
                r13 = r0
                goto L_0x0080
            L_0x0077:
                java.lang.String r0 = "tap gestures are not enabled"
                int r0 = android.util.Log.w(r2, r0)
                kotlin.coroutines.jvm.internal.b.e(r0)
            L_0x0080:
                if (r13 != 0) goto L_0x008b
            L_0x0082:
                java.lang.String r13 = "touchManager is null"
                int r13 = android.util.Log.w(r2, r13)
                kotlin.coroutines.jvm.internal.b.e(r13)
            L_0x008b:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.q0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapperKt$pointerInputsForDecorate$2", f = "DecorateViewWrapper.kt", l = {80}, m = "invokeSuspend")
    static final class b extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f136845c;

        /* renamed from: d  reason: collision with root package name */
        Object f136846d;

        /* renamed from: e  reason: collision with root package name */
        Object f136847e;

        /* renamed from: f  reason: collision with root package name */
        Object f136848f;

        /* renamed from: g  reason: collision with root package name */
        Object f136849g;

        /* renamed from: h  reason: collision with root package name */
        int f136850h;

        /* renamed from: i  reason: collision with root package name */
        int f136851i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f136852j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ TouchManager f136853k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements p<B, C5667g, C16807N> {
            a(Object obj) {
                super(2, obj, TouchManager.class, "onDrag", "onDrag-Uv8p0NA(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                t((B) obj, ((C5667g) obj2).v());
                return C16807N.f139792a;
            }

            public final void t(B b10, long j10) {
                C17542s.j(b10, "p0");
                ((TouchManager) this.receiver).m66onDragUv8p0NA(b10, j10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TouchManager touchManager, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f136853k = touchManager;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(TouchManager touchManager) {
            touchManager.isTransforming(false);
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f136853k, eVar);
            bVar.f136852j = obj;
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
            if (r13 != null) goto L_0x0081;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f136851i
                java.lang.String r2 = "DecorateViewWrapper"
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 != r3) goto L_0x0029
                java.lang.Object r0 = r12.f136849g
                uI.h r0 = (uI.C18059h) r0
                java.lang.Object r0 = r12.f136848f
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r0 = r12.f136847e
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r0 = r12.f136846d
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r1 = r12.f136845c
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r1 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r1
                java.lang.Object r1 = r12.f136852j
                A1.K r1 = (A1.K) r1
                XH.y.b(r13)
                goto L_0x006b
            L_0x0029:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0031:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f136852j
                r4 = r13
                A1.K r4 = (A1.K) r4
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r13 = r12.f136853k
                if (r13 == 0) goto L_0x0078
                boolean r1 = r13.isDragGestureEnabled()
                if (r1 == 0) goto L_0x006d
                OG.q0$b$a r8 = new OG.q0$b$a
                r8.<init>(r13)
                OG.r0 r6 = new OG.r0
                r6.<init>(r13)
                r12.f136852j = r4
                r12.f136845c = r13
                r12.f136846d = r13
                r12.f136847e = r13
                r12.f136848f = r13
                r12.f136849g = r8
                r1 = 0
                r12.f136850h = r1
                r12.f136851i = r3
                r5 = 0
                r7 = 0
                r10 = 5
                r11 = 0
                r9 = r12
                java.lang.Object r1 = p0.m.h(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r1 != r0) goto L_0x006a
                return r0
            L_0x006a:
                r0 = r13
            L_0x006b:
                r13 = r0
                goto L_0x0076
            L_0x006d:
                java.lang.String r0 = "drag gestures are not enabled"
                int r0 = android.util.Log.w(r2, r0)
                kotlin.coroutines.jvm.internal.b.e(r0)
            L_0x0076:
                if (r13 != 0) goto L_0x0081
            L_0x0078:
                java.lang.String r13 = "touchManager is null"
                int r13 = android.util.Log.w(r2, r13)
                kotlin.coroutines.jvm.internal.b.e(r13)
            L_0x0081:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.q0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: j */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((b) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapperKt$pointerInputsForDecorate$3", f = "DecorateViewWrapper.kt", l = {93}, m = "invokeSuspend")
    static final class c extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f136854c;

        /* renamed from: d  reason: collision with root package name */
        Object f136855d;

        /* renamed from: e  reason: collision with root package name */
        Object f136856e;

        /* renamed from: f  reason: collision with root package name */
        int f136857f;

        /* renamed from: g  reason: collision with root package name */
        int f136858g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f136859h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ TouchManager f136860i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements s<C5667g, C5667g, Float, Float, Float, C16807N> {
            a(Object obj) {
                super(5, obj, TouchManager.class, "onMultiTouchTransformGesture", "onMultiTouchTransformGesture-IUXd7x4(JJFFF)V", 0);
            }

            public final void t(long j10, long j11, float f10, float f11, float f12) {
                ((TouchManager) this.receiver).m68onMultiTouchTransformGestureIUXd7x4(j10, j11, f10, f11, f12);
            }

            public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                t(((C5667g) obj).v(), ((C5667g) obj2).v(), ((Number) obj3).floatValue(), ((Number) obj4).floatValue(), ((Number) obj5).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TouchManager touchManager, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f136860i = touchManager;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f136860i, eVar);
            cVar.f136859h = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((c) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
            if (r12 != null) goto L_0x0070;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f136858g
                java.lang.String r2 = "DecorateViewWrapper"
                r3 = 1
                if (r1 == 0) goto L_0x0029
                if (r1 != r3) goto L_0x0021
                java.lang.Object r0 = r11.f136856e
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r0 = r11.f136855d
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r0 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r0
                java.lang.Object r1 = r11.f136854c
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r1 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r1
                java.lang.Object r1 = r11.f136859h
                A1.K r1 = (A1.K) r1
                XH.y.b(r12)
                goto L_0x005a
            L_0x0021:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0029:
                XH.y.b(r12)
                java.lang.Object r12 = r11.f136859h
                r4 = r12
                A1.K r4 = (A1.K) r4
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r12 = r11.f136860i
                if (r12 == 0) goto L_0x0067
                boolean r1 = r12.isMultiTouchTransformGesturesEnabled()
                if (r1 == 0) goto L_0x005c
                OG.q0$c$a r7 = new OG.q0$c$a
                r7.<init>(r12)
                r11.f136859h = r4
                r11.f136854c = r12
                r11.f136855d = r12
                r11.f136856e = r12
                r1 = 0
                r11.f136857f = r1
                r11.f136858g = r3
                r5 = 0
                r6 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r1 = sF.g.c(r4, r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L_0x0059
                return r0
            L_0x0059:
                r0 = r12
            L_0x005a:
                r12 = r0
                goto L_0x0065
            L_0x005c:
                java.lang.String r0 = "tap gestures are not enabled"
                int r0 = android.util.Log.w(r2, r0)
                kotlin.coroutines.jvm.internal.b.e(r0)
            L_0x0065:
                if (r12 != 0) goto L_0x0070
            L_0x0067:
                java.lang.String r12 = "touchManager is null"
                int r12 = android.util.Log.w(r2, r12)
                kotlin.coroutines.jvm.internal.b.e(r12)
            L_0x0070:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: OG.q0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapperKt$pointerInputsForDecorate$4", f = "DecorateViewWrapper.kt", l = {103}, m = "invokeSuspend")
    static final class d extends l implements p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f136861c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f136862d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TouchManager f136863e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapperKt$pointerInputsForDecorate$4$1", f = "DecorateViewWrapper.kt", l = {104, 106}, m = "invokeSuspend")
        static final class a extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

            /* renamed from: d  reason: collision with root package name */
            int f136864d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f136865e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ TouchManager f136866f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(TouchManager touchManager, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f136866f = touchManager;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f136866f, eVar);
                aVar.f136865e = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: A1.c} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3 A[EDGE_INSN: B:37:0x00a3->B:32:0x00a3 ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x0078 A[EDGE_INSN: B:38:0x0078->B:23:0x0078 ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3 A[EDGE_INSN: B:40:0x00a3->B:32:0x00a3 ?: BREAK  , SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r10.f136864d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0026
                    if (r1 == r3) goto L_0x001e
                    if (r1 != r2) goto L_0x0016
                    java.lang.Object r1 = r10.f136865e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r11)
                    goto L_0x004b
                L_0x0016:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x001e:
                    java.lang.Object r1 = r10.f136865e
                    A1.c r1 = (A1.C4336c) r1
                    XH.y.b(r11)
                    goto L_0x003f
                L_0x0026:
                    XH.y.b(r11)
                    java.lang.Object r11 = r10.f136865e
                    r1 = r11
                    A1.c r1 = (A1.C4336c) r1
                    r10.f136865e = r1
                    r10.f136864d = r3
                    r5 = 0
                    r6 = 0
                    r8 = 2
                    r9 = 0
                    r4 = r1
                    r7 = r10
                    java.lang.Object r11 = p0.G.e(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L_0x003f
                    return r0
                L_0x003f:
                    r10.f136865e = r1
                    r10.f136864d = r2
                    r11 = 0
                    java.lang.Object r11 = A1.C4336c.J1(r1, r11, r10, r3, r11)
                    if (r11 != r0) goto L_0x004b
                    return r0
                L_0x004b:
                    A1.p r11 = (A1.C4349p) r11
                    java.util.List r4 = r11.c()
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    boolean r5 = r4 instanceof java.util.Collection
                    if (r5 == 0) goto L_0x0061
                    r5 = r4
                    java.util.Collection r5 = (java.util.Collection) r5
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L_0x0061
                    goto L_0x0078
                L_0x0061:
                    java.util.Iterator r4 = r4.iterator()
                L_0x0065:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L_0x0078
                    java.lang.Object r5 = r4.next()
                    A1.B r5 = (A1.B) r5
                    boolean r5 = r5.p()
                    if (r5 == 0) goto L_0x0065
                    goto L_0x00a3
                L_0x0078:
                    java.util.List r11 = r11.c()
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    boolean r4 = r11 instanceof java.util.Collection
                    if (r4 == 0) goto L_0x008c
                    r4 = r11
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L_0x008c
                    goto L_0x00a3
                L_0x008c:
                    java.util.Iterator r11 = r11.iterator()
                L_0x0090:
                    boolean r4 = r11.hasNext()
                    if (r4 == 0) goto L_0x00a3
                    java.lang.Object r4 = r11.next()
                    A1.B r4 = (A1.B) r4
                    boolean r4 = r4.i()
                    if (r4 == 0) goto L_0x0090
                    goto L_0x003f
                L_0x00a3:
                    com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r11 = r10.f136866f
                    if (r11 == 0) goto L_0x00ab
                    r0 = 0
                    r11.isTransforming(r0)
                L_0x00ab:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: OG.q0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TouchManager touchManager, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f136863e = touchManager;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f136863e, eVar);
            dVar.f136862d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((d) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f136861c;
            if (i10 == 0) {
                y.b(obj);
                K k10 = (K) this.f136862d;
                a aVar = new a(this.f136863e, (C17164e<? super a>) null);
                this.f136862d = k10;
                this.f136861c = 1;
                if (t.c(k10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                K k11 = (K) this.f136862d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final void c(DecorateEngineController decorateEngineController, TouchManager touchManager, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(decorateEngineController, "decorateEngineController");
        C4889m k10 = mVar.k(158758940);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(decorateEngineController) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? k10.V(touchManager) : k10.F(touchManager) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(158758940, i12, -1, "com.sugarcube.decorate.v2.internal.ui.surface.composable.DecorateViewWrapper (DecorateViewWrapper.kt:40)");
            }
            androidx.compose.ui.d f10 = f(dVar, touchManager);
            k10.W(-995524515);
            boolean F10 = k10.F(decorateEngineController);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new o0(decorateEngineController);
                k10.u(D10);
            }
            k10.P();
            e.a((C17642l) D10, f10, (C17642l) null, k10, 0, 4);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p0(decorateEngineController, touchManager, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final TextureView d(DecorateEngineController decorateEngineController, Context context) {
        C17542s.j(context, "context");
        TextureView textureView = new TextureView(context);
        SurfaceTexture g10 = decorateEngineController.g();
        if (g10 != null) {
            textureView.setSurfaceTexture(g10);
        }
        textureView.setSurfaceTextureListener(decorateEngineController);
        return textureView;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(DecorateEngineController decorateEngineController, TouchManager touchManager, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(decorateEngineController, touchManager, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, TouchManager touchManager) {
        C16807N n10 = C16807N.f139792a;
        return U.d(U.d(U.d(U.d(dVar, n10, new a(touchManager, (C17164e<? super a>) null)), n10, new b(touchManager, (C17164e<? super b>) null)), n10, new c(touchManager, (C17164e<? super c>) null)), n10, new d(touchManager, (C17164e<? super d>) null));
    }
}
