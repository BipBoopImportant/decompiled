package me.saket.telephoto.zoomable;

import E1.C4478k;
import IJ.C15906b;
import L1.v;
import L1.x;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import U0.T0;
import U0.o1;
import XH.C16807N;
import c2.r;
import c2.s;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import me.saket.telephoto.zoomable.o;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nK.C17678i;
import nK.C17680k;
import o1.C5667g;
import o1.C5673m;
import p1.C5749w0;
import pK.C17767l;
import pK.C17769n;
import t1.C5942c;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a­\u0001\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\"\u0018\u0010)\u001a\u00020&*\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0018\u0010-\u001a\u00020**\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00062²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u0002²\u0006\f\u00100\u001a\u00020\b8\nX\u0002²\u0006\u000e\u00101\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"Lme/saket/telephoto/zoomable/o;", "image", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "LpK/l;", "state", "", "alpha", "Lp1/w0;", "colorFilter", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "gesturesEnabled", "Lkotlin/Function1;", "Lo1/g;", "LXH/N;", "onClick", "onLongClick", "clipToBounds", "Lme/saket/telephoto/zoomable/c;", "onDoubleClick", "a", "(Lme/saket/telephoto/zoomable/o;Ljava/lang/String;Landroidx/compose/ui/d;LpK/l;FLp1/w0;Li1/c;LE1/k;ZLnI/l;LnI/l;ZLme/saket/telephoto/zoomable/c;LU0/m;III)V", "imageState", "l", "(Landroidx/compose/ui/d;LpK/l;Ljava/lang/String;)Landroidx/compose/ui/d;", "Lt1/c;", "painter", "k", "(Lt1/c;LU0/m;I)Lt1/c;", "o", "(LpK/l;)Z", "Lme/saket/telephoto/zoomable/o$d;", "", "m", "(Lme/saket/telephoto/zoomable/o$d;)I", "crossfadeDurationMs", "Lme/saket/telephoto/zoomable/j;", "n", "(LpK/l;)Lme/saket/telephoto/zoomable/j;", "realZoomableState", "Lo1/m;", "canvasSize", "animatedAlpha", "wasImageZoomedIn", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5673m> f144731c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4899r0<C5673m> r0Var) {
            super(1);
            this.f144731c = r0Var;
        }

        public final void a(long j10) {
            n.f(this.f144731c, s.d(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f144732c = new b();

        b() {
            super(1);
        }

        public final void a(x xVar) {
            C17542s.j(xVar, "$this$semantics");
            v.A0(xVar, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    static final class c extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17767l f144733c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f144734d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"me/saket/telephoto/zoomable/n$c$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17767l f144735a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0 f144736b;

            public a(C17767l lVar, C4899r0 r0Var) {
                this.f144735a = lVar;
                this.f144736b = r0Var;
            }

            public void b() {
                C4899r0 r0Var = this.f144736b;
                Float k10 = this.f144735a.b().k();
                n.c(r0Var, k10 != null && k10.floatValue() > 0.0f);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17767l lVar, C4899r0<Boolean> r0Var) {
            super(1);
            this.f144733c = lVar;
            this.f144734d = r0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            return new a(this.f144733c, this.f144734d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17767l f144737c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ rK.r f144738d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"me/saket/telephoto/zoomable/n$d$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17767l f144739a;

            public a(C17767l lVar) {
                this.f144739a = lVar;
            }

            public void b() {
                n.n(this.f144739a).Z((rK.r) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17767l lVar, rK.r rVar) {
            super(1);
            this.f144737c = lVar;
            this.f144738d = rVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            n.n(this.f144737c).Z(this.f144738d);
            return new a(this.f144737c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ rK.r f144740c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(rK.r rVar) {
            super(1);
            this.f144740c = rVar;
        }

        public final void a(long j10) {
            this.f144740c.c(r.b(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 9, 0})
    static final class f extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17767l f144741c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17680k f144742d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"me/saket/telephoto/zoomable/n$f$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17767l f144743a;

            public a(C17767l lVar) {
                this.f144743a = lVar;
            }

            public void b() {
                this.f144743a.g((C17680k) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17767l lVar, C17680k kVar) {
            super(1);
            this.f144741c = lVar;
            this.f144742d = kVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            this.f144741c.g(this.f144742d);
            return new a(this.f144741c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/r0;", "", "b", "()LU0/r0;"}, k = 3, mv = {1, 9, 0})
    static final class g extends C17544u implements C17631a<C4899r0<Boolean>> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f144744c = new g();

        g() {
            super(0);
        }

        /* renamed from: b */
        public final C4899r0<Boolean> invoke() {
            return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f144745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f144746d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f144747e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17767l f144748f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f144749g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5749w0 f144750h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5437c f144751i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C4478k f144752j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f144753k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f144754l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f144755m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f144756n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ c f144757o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f144758p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f144759q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f144760r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(o oVar, String str, androidx.compose.ui.d dVar, C17767l lVar, float f10, C5749w0 w0Var, C5437c cVar, C4478k kVar, boolean z10, C17642l<? super C5667g, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3, boolean z11, c cVar2, int i10, int i11, int i12) {
            super(2);
            this.f144745c = oVar;
            this.f144746d = str;
            this.f144747e = dVar;
            this.f144748f = lVar;
            this.f144749g = f10;
            this.f144750h = w0Var;
            this.f144751i = cVar;
            this.f144752j = kVar;
            this.f144753k = z10;
            this.f144754l = lVar2;
            this.f144755m = lVar3;
            this.f144756n = z11;
            this.f144757o = cVar2;
            this.f144758p = i10;
            this.f144759q = i11;
            this.f144760r = i12;
        }

        public final void a(C4889m mVar, int i10) {
            o oVar = this.f144745c;
            String str = this.f144746d;
            androidx.compose.ui.d dVar = this.f144747e;
            C17767l lVar = this.f144748f;
            float f10 = this.f144749g;
            C5749w0 w0Var = this.f144750h;
            C5437c cVar = this.f144751i;
            C4478k kVar = this.f144752j;
            boolean z10 = this.f144753k;
            C17642l<C5667g, C16807N> lVar2 = this.f144754l;
            C17642l<C5667g, C16807N> lVar3 = this.f144755m;
            boolean z11 = this.f144756n;
            c cVar2 = this.f144757o;
            o oVar2 = oVar;
            n.a(oVar2, str, dVar, lVar, f10, w0Var, cVar, kVar, z10, lVar2, lVar3, z11, cVar2, mVar, M0.a(this.f144758p | 1), M0.a(this.f144759q), this.f144760r);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements C16532g<C5673m> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f144761a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f144762a;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.ZoomableImageKt$ZoomableImage$lambda$5$$inlined$filter$1$2", f = "ZoomableImage.kt", l = {223}, m = "emit")
            /* renamed from: me.saket.telephoto.zoomable.n$i$a$a  reason: collision with other inner class name */
            public static final class C3530a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f144763c;

                /* renamed from: d  reason: collision with root package name */
                int f144764d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f144765e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3530a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f144765e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f144763c = obj;
                    this.f144764d |= Integer.MIN_VALUE;
                    return this.f144765e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f144762a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof me.saket.telephoto.zoomable.n.i.a.C3530a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    me.saket.telephoto.zoomable.n$i$a$a r0 = (me.saket.telephoto.zoomable.n.i.a.C3530a) r0
                    int r1 = r0.f144764d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f144764d = r1
                    goto L_0x0018
                L_0x0013:
                    me.saket.telephoto.zoomable.n$i$a$a r0 = new me.saket.telephoto.zoomable.n$i$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f144763c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f144764d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r10)
                    goto L_0x0056
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f144762a
                    r2 = r9
                    o1.m r2 = (o1.C5673m) r2
                    long r4 = r2.q()
                    o1.m$a r2 = o1.C5673m.f26722b
                    long r6 = r2.a()
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 == 0) goto L_0x0056
                    boolean r2 = o1.C5673m.n(r4)
                    if (r2 != 0) goto L_0x0056
                    r0.f144764d = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L_0x0056
                    return r1
                L_0x0056:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: me.saket.telephoto.zoomable.n.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f144761a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f144761a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/m;", "b", "()J"}, k = 3, mv = {1, 9, 0})
    static final class j extends C17544u implements C17631a<C5673m> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5673m> f144766c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C4899r0<C5673m> r0Var) {
            super(0);
            this.f144766c = r0Var;
        }

        public final long b() {
            return n.e(this.f144766c);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C5673m.c(b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06d6, code lost:
        if ((r2 & 3072) == 2048) goto L_0x06d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(me.saket.telephoto.zoomable.o r36, java.lang.String r37, androidx.compose.ui.d r38, pK.C17767l r39, float r40, p1.C5749w0 r41, i1.C5437c r42, E1.C4478k r43, boolean r44, nI.C17642l<? super o1.C5667g, XH.C16807N> r45, nI.C17642l<? super o1.C5667g, XH.C16807N> r46, boolean r47, me.saket.telephoto.zoomable.c r48, U0.C4889m r49, int r50, int r51, int r52) {
        /*
            r1 = r36
            r2 = r37
            r14 = r50
            r15 = r51
            r13 = r52
            r0 = 458752(0x70000, float:6.42848E-40)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = 32
            r8 = 16
            r9 = 48
            r10 = 6
            r11 = 8
            java.lang.String r12 = "image"
            kotlin.jvm.internal.C17542s.j(r1, r12)
            r12 = 1234640757(0x49971f75, float:1237998.6)
            r4 = r49
            U0.m r4 = r4.k(r12)
            r12 = 1
            r17 = r13 & 1
            r18 = 4
            r12 = 2
            if (r17 == 0) goto L_0x0032
            r17 = r14 | 6
            goto L_0x0046
        L_0x0032:
            r17 = r14 & 14
            if (r17 != 0) goto L_0x0044
            boolean r17 = r4.V(r1)
            if (r17 == 0) goto L_0x003f
            r17 = r18
            goto L_0x0041
        L_0x003f:
            r17 = r12
        L_0x0041:
            r17 = r14 | r17
            goto L_0x0046
        L_0x0044:
            r17 = r14
        L_0x0046:
            r19 = r13 & 2
            if (r19 == 0) goto L_0x004f
            r17 = r17 | 48
        L_0x004c:
            r12 = r17
            goto L_0x0061
        L_0x004f:
            r19 = r14 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x004c
            boolean r19 = r4.V(r2)
            if (r19 == 0) goto L_0x005c
            r19 = r7
            goto L_0x005e
        L_0x005c:
            r19 = r8
        L_0x005e:
            r17 = r17 | r19
            goto L_0x004c
        L_0x0061:
            r17 = r13 & 4
            if (r17 == 0) goto L_0x006a
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0067:
            r9 = r38
            goto L_0x007d
        L_0x006a:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r38
            boolean r19 = r4.V(r9)
            if (r19 == 0) goto L_0x0079
            r19 = r5
            goto L_0x007b
        L_0x0079:
            r19 = r6
        L_0x007b:
            r12 = r12 | r19
        L_0x007d:
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0097
            r10 = r13 & 8
            if (r10 != 0) goto L_0x0090
            r10 = r39
            boolean r19 = r4.V(r10)
            if (r19 == 0) goto L_0x0092
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x0094
        L_0x0090:
            r10 = r39
        L_0x0092:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x0094:
            r12 = r12 | r19
            goto L_0x0099
        L_0x0097:
            r10 = r39
        L_0x0099:
            r26 = r13 & 16
            r27 = 57344(0xe000, float:8.0356E-41)
            if (r26 == 0) goto L_0x00a5
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            r8 = r40
            goto L_0x00b8
        L_0x00a5:
            r19 = r14 & r27
            r8 = r40
            if (r19 != 0) goto L_0x00b8
            boolean r20 = r4.c(r8)
            if (r20 == 0) goto L_0x00b4
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b6
        L_0x00b4:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x00b6:
            r12 = r12 | r20
        L_0x00b8:
            r28 = r13 & 32
            if (r28 == 0) goto L_0x00c3
            r20 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 | r20
            r7 = r41
            goto L_0x00d6
        L_0x00c3:
            r20 = r14 & r0
            r7 = r41
            if (r20 != 0) goto L_0x00d6
            boolean r21 = r4.V(r7)
            if (r21 == 0) goto L_0x00d2
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d4
        L_0x00d2:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00d4:
            r12 = r12 | r21
        L_0x00d6:
            r29 = r13 & 64
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r29 == 0) goto L_0x00e3
            r21 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 | r21
            r0 = r42
            goto L_0x00f6
        L_0x00e3:
            r21 = r14 & r30
            r0 = r42
            if (r21 != 0) goto L_0x00f6
            boolean r21 = r4.V(r0)
            if (r21 == 0) goto L_0x00f2
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f4
        L_0x00f2:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00f4:
            r12 = r12 | r21
        L_0x00f6:
            r11 = r13 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0101
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r12 | r21
            r6 = r43
            goto L_0x0116
        L_0x0101:
            r21 = 29360128(0x1c00000, float:7.052966E-38)
            r21 = r14 & r21
            r6 = r43
            if (r21 != 0) goto L_0x0116
            boolean r22 = r4.V(r6)
            if (r22 == 0) goto L_0x0112
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0114
        L_0x0112:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0114:
            r12 = r12 | r22
        L_0x0116:
            r3 = r13 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0121
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 | r31
            r5 = r44
            goto L_0x0136
        L_0x0121:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r14 & r31
            r5 = r44
            if (r31 != 0) goto L_0x0136
            boolean r32 = r4.b(r5)
            if (r32 == 0) goto L_0x0132
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0134
        L_0x0132:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0134:
            r12 = r12 | r32
        L_0x0136:
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0141
            r32 = 805306368(0x30000000, float:4.656613E-10)
        L_0x013c:
            r12 = r12 | r32
        L_0x013e:
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x0155
        L_0x0141:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r14 & r32
            r5 = r45
            if (r32 != 0) goto L_0x013e
            boolean r32 = r4.F(r5)
            if (r32 == 0) goto L_0x0152
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x0152:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x013c
        L_0x0155:
            r5 = r5 & r13
            if (r5 == 0) goto L_0x015f
            r22 = 6
            r18 = r15 | 6
        L_0x015c:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0174
        L_0x015f:
            r22 = r15 & 14
            r6 = r46
            if (r22 != 0) goto L_0x0171
            boolean r22 = r4.F(r6)
            if (r22 == 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r18 = 2
        L_0x016e:
            r18 = r15 | r18
            goto L_0x015c
        L_0x0171:
            r18 = r15
            goto L_0x015c
        L_0x0174:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x017f
            r6 = 48
            r18 = r18 | 48
        L_0x017c:
            r6 = r18
            goto L_0x0196
        L_0x017f:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0193
            r6 = r47
            boolean r22 = r4.b(r6)
            if (r22 == 0) goto L_0x018e
            r19 = 32
            goto L_0x0190
        L_0x018e:
            r19 = 16
        L_0x0190:
            r18 = r18 | r19
            goto L_0x017c
        L_0x0193:
            r6 = r47
            goto L_0x017c
        L_0x0196:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x019f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x019c:
            r9 = r48
            goto L_0x01b2
        L_0x019f:
            r9 = r15 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x019c
            r9 = r48
            boolean r18 = r4.V(r9)
            if (r18 == 0) goto L_0x01ae
            r31 = 256(0x100, float:3.59E-43)
            goto L_0x01b0
        L_0x01ae:
            r31 = 128(0x80, float:1.794E-43)
        L_0x01b0:
            r6 = r6 | r31
        L_0x01b2:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r12 & r18
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x01e4
            r9 = r6 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x01e4
            boolean r9 = r4.l()
            if (r9 != 0) goto L_0x01c9
            goto L_0x01e4
        L_0x01c9:
            r4.L()
            r3 = r38
            r10 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r14 = r48
            goto L_0x074d
        L_0x01e4:
            r4.G()
            r9 = 1
            r10 = r14 & 1
            r9 = 0
            if (r10 == 0) goto L_0x01f3
            boolean r10 = r4.O()
            if (r10 == 0) goto L_0x01f6
        L_0x01f3:
            r10 = 8
            goto L_0x021a
        L_0x01f6:
            r4.L()
            r10 = 8
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0201
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0201:
            r0 = r38
            r10 = r39
            r17 = r40
            r18 = r41
            r3 = r42
            r11 = r43
            r5 = r44
            r7 = r45
            r8 = r46
            r9 = r47
            r13 = r12
            r12 = r48
            goto L_0x02a0
        L_0x021a:
            if (r17 == 0) goto L_0x0221
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r33 = r17
            goto L_0x0223
        L_0x0221:
            r33 = r38
        L_0x0223:
            r17 = r13 & 8
            if (r17 == 0) goto L_0x023e
            r21 = 0
            r22 = 7
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r4
            pK.n r10 = me.saket.telephoto.zoomable.s.a(r17, r18, r19, r20, r21, r22)
            pK.l r10 = pK.C17768m.a(r10, r4, r9, r9)
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0240
        L_0x023e:
            r10 = r39
        L_0x0240:
            if (r26 == 0) goto L_0x0245
            r17 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0247
        L_0x0245:
            r17 = r40
        L_0x0247:
            if (r28 == 0) goto L_0x024c
            r18 = 0
            goto L_0x024e
        L_0x024c:
            r18 = r41
        L_0x024e:
            if (r29 == 0) goto L_0x0257
            i1.c$a r19 = i1.C5437c.f24302a
            i1.c r19 = r19.e()
            goto L_0x0259
        L_0x0257:
            r19 = r42
        L_0x0259:
            if (r11 == 0) goto L_0x0262
            E1.k$a r11 = E1.C4478k.f5915a
            E1.k r11 = r11.e()
            goto L_0x0264
        L_0x0262:
            r11 = r43
        L_0x0264:
            if (r3 == 0) goto L_0x0268
            r3 = 1
            goto L_0x026a
        L_0x0268:
            r3 = r44
        L_0x026a:
            if (r0 == 0) goto L_0x026e
            r0 = 0
            goto L_0x0270
        L_0x026e:
            r0 = r45
        L_0x0270:
            if (r5 == 0) goto L_0x0274
            r5 = 0
            goto L_0x0276
        L_0x0274:
            r5 = r46
        L_0x0276:
            if (r7 == 0) goto L_0x027a
            r7 = 1
            goto L_0x027c
        L_0x027a:
            r7 = r47
        L_0x027c:
            if (r8 == 0) goto L_0x0294
            me.saket.telephoto.zoomable.c$a r8 = me.saket.telephoto.zoomable.c.f144590a
            r38 = r0
            r0 = 0
            r9 = 1
            me.saket.telephoto.zoomable.c r8 = me.saket.telephoto.zoomable.c.a.b(r8, r0, r9, r0)
            r9 = r7
            r13 = r12
            r0 = r33
            r7 = r38
            r12 = r8
            r8 = r5
        L_0x0290:
            r5 = r3
            r3 = r19
            goto L_0x02a0
        L_0x0294:
            r38 = r0
            r8 = r5
            r9 = r7
            r13 = r12
            r0 = r33
            r7 = r38
            r12 = r48
            goto L_0x0290
        L_0x02a0:
            r4.y()
            boolean r19 = U0.C4895p.J()
            if (r19 == 0) goto L_0x02b1
            java.lang.String r14 = "me.saket.telephoto.zoomable.ZoomableImage (ZoomableImage.kt:75)"
            r15 = 1234640757(0x49971f75, float:1237998.6)
            U0.C4895p.S(r15, r13, r6, r14)
        L_0x02b1:
            pK.n r6 = r10.b()
            r6.e(r3)
            r6.g(r11)
            r6 = 46950296(0x2cc6798, float:3.0034566E-37)
            r4.C(r6)
            java.lang.Object r6 = r4.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r15 = r14.a()
            if (r6 != r15) goto L_0x02e3
            o1.m$a r6 = o1.C5673m.f26722b
            long r21 = r6.a()
            o1.m r6 = o1.C5673m.c(r21)
            r48 = r5
            r5 = 0
            r15 = 2
            U0.r0 r6 = U0.u1.e(r6, r5, r15, r5)
            r4.u(r6)
            goto L_0x02e5
        L_0x02e3:
            r48 = r5
        L_0x02e5:
            U0.r0 r6 = (U0.C4899r0) r6
            r4.U()
            r5 = 46952425(0x2cc6fe9, float:3.003934E-37)
            r4.H(r5, r1)
            r5 = 46953996(0x2cc760c, float:3.0042862E-37)
            r4.C(r5)
            java.lang.Object r5 = r4.D()
            java.lang.Object r15 = r14.a()
            if (r5 != r15) goto L_0x0312
            me.saket.telephoto.zoomable.n$j r5 = new me.saket.telephoto.zoomable.n$j
            r5.<init>(r6)
            TJ.g r5 = U0.p1.r(r5)
            me.saket.telephoto.zoomable.n$i r15 = new me.saket.telephoto.zoomable.n$i
            r15.<init>(r5)
            r4.u(r15)
            r5 = r15
        L_0x0312:
            TJ.g r5 = (TJ.C16532g) r5
            r4.U()
            int r15 = r13 << 3
            r19 = r15 & 112(0x70, float:1.57E-43)
            r22 = r11
            r21 = 8
            r11 = r19 | 8
            me.saket.telephoto.zoomable.o$d r5 = r1.a(r5, r4, r11)
            r4.T()
            r11 = 46966376(0x2cca668, float:3.0070618E-37)
            r4.C(r11)
            java.lang.Object r11 = r4.D()
            java.lang.Object r1 = r14.a()
            if (r11 != r1) goto L_0x0340
            rK.i r11 = new rK.i
            r11.<init>()
            r4.u(r11)
        L_0x0340:
            rK.i r11 = (rK.C17874i) r11
            r4.U()
            r1 = 46969031(0x2ccb0c7, float:3.0076571E-37)
            r4.C(r1)
            java.lang.Object r1 = r4.D()
            r19 = r3
            java.lang.Object r3 = r14.a()
            if (r1 != r3) goto L_0x035f
            me.saket.telephoto.zoomable.n$a r1 = new me.saket.telephoto.zoomable.n$a
            r1.<init>(r6)
            r4.u(r1)
        L_0x035f:
            nI.l r1 = (nI.C17642l) r1
            r4.U()
            androidx.compose.ui.d r1 = androidx.compose.ui.layout.g.a(r0, r1)
            boolean r3 = o(r10)
            androidx.compose.ui.d r1 = rK.C17875j.a(r1, r11, r3)
            me.saket.telephoto.zoomable.n$b r3 = me.saket.telephoto.zoomable.n.b.f144732c
            r6 = 1
            androidx.compose.ui.d r1 = L1.o.c(r1, r6, r3)
            androidx.compose.ui.d r1 = l(r1, r10, r2)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r4.C(r3)
            i1.c$a r3 = i1.C5437c.f24302a
            r21 = r0
            i1.c r0 = r3.o()
            r2 = 48
            E1.I r0 = androidx.compose.foundation.layout.C5077h.j(r0, r6, r4, r2)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r4.C(r2)
            r2 = 0
            int r23 = U0.C4883j.a(r4, r2)
            U0.y r2 = r4.s()
            G1.g$a r24 = G1.C4504g.f6515W
            nI.a r6 = r24.a()
            nI.q r1 = E1.A.c(r1)
            U0.f r25 = r4.m()
            if (r25 != 0) goto L_0x03b1
            U0.C4883j.c()
        L_0x03b1:
            r4.I()
            boolean r25 = r4.i()
            if (r25 == 0) goto L_0x03be
            r4.p(r6)
            goto L_0x03c1
        L_0x03be:
            r4.t()
        L_0x03c1:
            U0.m r6 = U0.F1.a(r4)
            r25 = r3
            nI.p r3 = r24.c()
            U0.F1.c(r6, r0, r3)
            nI.p r0 = r24.e()
            U0.F1.c(r6, r2, r0)
            nI.p r0 = r24.b()
            boolean r2 = r6.i()
            if (r2 != 0) goto L_0x03ed
            java.lang.Object r2 = r6.D()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 != 0) goto L_0x03fb
        L_0x03ed:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r6.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r6.w(r2, r0)
        L_0x03fb:
            U0.m r0 = U0.C4859a1.b(r4)
            U0.a1 r0 = U0.C4859a1.a(r0)
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0, r4, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4.C(r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            me.saket.telephoto.zoomable.o$b r0 = r5.b()
            boolean r1 = r0 instanceof me.saket.telephoto.zoomable.o.c
            if (r1 == 0) goto L_0x042b
            me.saket.telephoto.zoomable.o$b r0 = r5.b()
            me.saket.telephoto.zoomable.o$c r0 = (me.saket.telephoto.zoomable.o.c) r0
            t1.c r0 = r0.f()
            if (r0 == 0) goto L_0x0429
            r0 = 1
            goto L_0x0439
        L_0x0429:
            r0 = 0
            goto L_0x0439
        L_0x042b:
            boolean r0 = r0 instanceof me.saket.telephoto.zoomable.o.e
            if (r0 == 0) goto L_0x0429
            nK.k r0 = r10.a()
            if (r0 == 0) goto L_0x0429
            boolean r0 = r0.a()
        L_0x0439:
            r10.e(r0)
            U0.I0 r0 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r0 = r4.Q(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0474
            r0 = -717756538(0xffffffffd537e786, float:-1.26378133E13)
            r4.C(r0)
            r0 = 808130798(0x302b18ee, float:6.2244865E-10)
            r4.C(r0)
            java.lang.Object r0 = r4.D()
            java.lang.Object r1 = r14.a()
            if (r0 != r1) goto L_0x046b
            r1 = 1065353216(0x3f800000, float:1.0)
            U0.n0 r0 = U0.D0.a(r1)
            r4.u(r0)
        L_0x046b:
            U0.n0 r0 = (U0.C4892n0) r0
            r4.U()
            r4.U()
            goto L_0x04af
        L_0x0474:
            r0 = -717696212(0xffffffffd538d32c, float:-1.27010697E13)
            r4.C(r0)
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x0483
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0484
        L_0x0483:
            r0 = 0
        L_0x0484:
            int r1 = m(r5)
            r2 = 0
            r3 = 0
            r6 = 6
            m0.y0 r1 = m0.C5548j.j(r1, r3, r2, r6, r2)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 20
            r6 = 0
            java.lang.String r23 = "Crossfade animation"
            r24 = 0
            r38 = r0
            r39 = r1
            r40 = r6
            r41 = r23
            r42 = r24
            r43 = r4
            r44 = r2
            r45 = r3
            U0.A1 r0 = m0.C5534c.d(r38, r39, r40, r41, r42, r43, r44, r45)
            r4.U()
        L_0x04af:
            t1.c r1 = r5.c()
            if (r1 == 0) goto L_0x04c1
            float r1 = d(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x04c1
            r1 = 1
            goto L_0x04c2
        L_0x04c1:
            r1 = 0
        L_0x04c2:
            r10.f(r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            me.saket.telephoto.zoomable.n$g r1 = me.saket.telephoto.zoomable.n.g.f144744c
            r3 = 3080(0xc08, float:4.316E-42)
            r6 = 6
            r23 = 0
            r24 = 0
            r38 = r2
            r39 = r23
            r40 = r24
            r41 = r1
            r42 = r4
            r43 = r3
            r44 = r6
            java.lang.Object r1 = f1.C5301c.e(r38, r39, r40, r41, r42, r43, r44)
            U0.r0 r1 = (U0.C4899r0) r1
            r2 = 808154642(0x302b7612, float:6.2377226E-10)
            r4.C(r2)
            boolean r2 = r4.V(r1)
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 ^ 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 <= r6) goto L_0x04fd
            boolean r16 = r4.V(r10)
            if (r16 != 0) goto L_0x0500
        L_0x04fd:
            r23 = r3
            goto L_0x0503
        L_0x0500:
            r23 = r3
            goto L_0x0507
        L_0x0503:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != r6) goto L_0x0509
        L_0x0507:
            r3 = 1
            goto L_0x050a
        L_0x0509:
            r3 = 0
        L_0x050a:
            r2 = r2 | r3
            java.lang.Object r3 = r4.D()
            if (r2 != 0) goto L_0x0517
            java.lang.Object r2 = r14.a()
            if (r3 != r2) goto L_0x051f
        L_0x0517:
            me.saket.telephoto.zoomable.n$c r3 = new me.saket.telephoto.zoomable.n$c
            r3.<init>(r10, r1)
            r4.u(r3)
        L_0x051f:
            nI.l r3 = (nI.C17642l) r3
            r4.U()
            int r2 = r13 >> 9
            r6 = r2 & 14
            U0.P.c(r10, r3, r4, r6)
            r3 = 808167717(0x302ba925, float:6.2449806E-10)
            r4.C(r3)
            boolean r3 = r10.d()
            if (r3 == 0) goto L_0x05e4
            boolean r1 = b(r1)
            if (r1 != 0) goto L_0x05e4
            t1.c r1 = r5.c()
            kotlin.jvm.internal.C17542s.g(r1)
            r3 = 8
            t1.c r1 = k(r1, r4, r3)
            pK.n r24 = r10.b()
            pK.j r24 = r24.f()
            r26 = r13
            r28 = r14
            long r13 = r24.g()
            t1.c r1 = rK.C17873h.a(r1, r13, r4, r3)
            rK.r r3 = new rK.r
            long r13 = r1.h()
            r24 = r0
            r0 = 0
            r3.<init>(r13, r0)
            me.saket.telephoto.zoomable.n$d r0 = new me.saket.telephoto.zoomable.n$d
            r0.<init>(r10, r3)
            r13 = r6 | 64
            U0.P.b(r10, r3, r0, r4, r13)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            me.saket.telephoto.zoomable.n$e r13 = new me.saket.telephoto.zoomable.n$e
            r13.<init>(r3)
            androidx.compose.ui.d r0 = androidx.compose.ui.layout.g.a(r0, r13)
            pK.i r3 = new pK.i
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r3.<init>(r13, r14)
            me.saket.telephoto.zoomable.h$a r13 = me.saket.telephoto.zoomable.h.f144605c
            me.saket.telephoto.zoomable.h r13 = r13.a()
            r20 = 54
            r29 = 0
            r31 = 0
            r38 = r3
            r39 = r31
            r40 = r13
            r41 = r4
            r42 = r20
            r43 = r29
            pK.n r3 = me.saket.telephoto.zoomable.s.a(r38, r39, r40, r41, r42, r43)
            r13 = 2
            r20 = 0
            r38 = r0
            r39 = r3
            r40 = r29
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r12
            r45 = r13
            r46 = r20
            androidx.compose.ui.d r0 = me.saket.telephoto.zoomable.q.b(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 56
            r2 = r2 & r27
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r15
            r2 = r2 | r3
            r3 = r15 & r30
            r2 = r2 | r3
            r3 = 0
            r13 = 0
            r38 = r1
            r39 = r13
            r40 = r0
            r41 = r19
            r42 = r22
            r43 = r17
            r44 = r18
            r45 = r4
            r46 = r2
            r47 = r3
            n0.C5583F.a(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            goto L_0x05eb
        L_0x05e4:
            r24 = r0
            r26 = r13
            r28 = r14
            r14 = 0
        L_0x05eb:
            r4.U()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r1 = rK.C17875j.b(r0, r11)
            pK.n r2 = r10.b()
            if (r48 == 0) goto L_0x0602
            boolean r3 = r10.d()
            if (r3 != 0) goto L_0x0602
            r3 = 1
            goto L_0x0603
        L_0x0602:
            r3 = r14
        L_0x0603:
            r38 = r1
            r39 = r2
            r40 = r3
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r12
            androidx.compose.ui.d r1 = me.saket.telephoto.zoomable.q.a(r38, r39, r40, r41, r42, r43, r44)
            me.saket.telephoto.zoomable.o$b r2 = r5.b()
            if (r2 != 0) goto L_0x062a
            r1 = -714551975(0xffffffffd568cd59, float:-1.59980412E13)
            r4.C(r1)
            r1 = 6
            androidx.compose.foundation.layout.C5077h.a(r0, r4, r1)
            r4.U()
            goto L_0x0728
        L_0x062a:
            boolean r0 = r2 instanceof me.saket.telephoto.zoomable.o.c
            if (r0 == 0) goto L_0x068d
            r0 = -714456309(0xffffffffd56a430b, float:-1.60983543E13)
            r4.C(r0)
            me.saket.telephoto.zoomable.o$c r2 = (me.saket.telephoto.zoomable.o.c) r2
            t1.c r0 = r2.f()
            if (r0 != 0) goto L_0x063e
            me.saket.telephoto.zoomable.d r0 = me.saket.telephoto.zoomable.d.f144592g
        L_0x063e:
            pK.n r2 = r10.b()
            me.saket.telephoto.zoomable.m$a r3 = me.saket.telephoto.zoomable.m.f144727a
            long r5 = r0.h()
            o1.m r5 = o1.C5673m.c(r5)
            me.saket.telephoto.zoomable.m r3 = r3.a(r5)
            r2.n(r3)
            r2 = 8
            t1.c r0 = k(r0, r4, r2)
            i1.c r2 = r25.e()
            E1.k$a r3 = E1.C4478k.f5915a
            E1.k r3 = r3.f()
            float r5 = d(r24)
            float r5 = r5 * r17
            r6 = r26 & 112(0x70, float:1.57E-43)
            r6 = r6 | 27656(0x6c08, float:3.8754E-41)
            r11 = r15 & r30
            r6 = r6 | r11
            r11 = 0
            r38 = r0
            r39 = r37
            r40 = r1
            r41 = r2
            r42 = r3
            r43 = r5
            r44 = r18
            r45 = r4
            r46 = r6
            r47 = r11
            n0.C5583F.a(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r4.U()
            goto L_0x0728
        L_0x068d:
            boolean r0 = r2 instanceof me.saket.telephoto.zoomable.o.e
            if (r0 == 0) goto L_0x071f
            r0 = -713878438(0xffffffffd573145a, float:-1.67042959E13)
            r4.C(r0)
            me.saket.telephoto.zoomable.o$e r2 = (me.saket.telephoto.zoomable.o.e) r2
            nK.j r0 = r2.b()
            pK.n r3 = r10.b()
            nK.d r2 = r2.a()
            r5 = 8
            r11 = 8
            r13 = 0
            r38 = r0
            r39 = r3
            r40 = r2
            r41 = r13
            r42 = r4
            r43 = r5
            r44 = r11
            nK.k r0 = nK.C17681l.i(r38, r39, r40, r41, r42, r43, r44)
            r2 = 808263445(0x302d1f15, float:6.2981204E-10)
            r4.C(r2)
            r2 = r23
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 <= r3) goto L_0x06ce
            boolean r2 = r4.V(r10)
            if (r2 != 0) goto L_0x06d1
        L_0x06ce:
            r2 = r26
            goto L_0x06d4
        L_0x06d1:
            r2 = r26
            goto L_0x06d8
        L_0x06d4:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            if (r5 != r3) goto L_0x06d9
        L_0x06d8:
            r14 = 1
        L_0x06d9:
            boolean r3 = r4.V(r0)
            r3 = r3 | r14
            java.lang.Object r5 = r4.D()
            if (r3 != 0) goto L_0x06ea
            java.lang.Object r3 = r28.a()
            if (r5 != r3) goto L_0x06f2
        L_0x06ea:
            me.saket.telephoto.zoomable.n$f r5 = new me.saket.telephoto.zoomable.n$f
            r5.<init>(r10, r0)
            r4.u(r5)
        L_0x06f2:
            nI.l r5 = (nI.C17642l) r5
            r4.U()
            U0.P.b(r10, r0, r5, r4, r6)
            float r3 = d(r24)
            float r3 = r3 * r17
            r5 = r2 & 112(0x70, float:1.57E-43)
            int r2 = r2 >> 3
            r2 = r2 & r27
            r2 = r2 | r5
            r5 = 0
            r38 = r0
            r39 = r37
            r40 = r1
            r41 = r3
            r42 = r18
            r43 = r4
            r44 = r2
            r45 = r5
            nK.C17678i.a(r38, r39, r40, r41, r42, r43, r44, r45)
            r4.U()
            goto L_0x0728
        L_0x071f:
            r0 = -713259368(0xffffffffd57c8698, float:-1.73534379E13)
            r4.C(r0)
            r4.U()
        L_0x0728:
            r4.U()
            r4.x()
            r4.U()
            r4.U()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x073d
            U0.C4895p.R()
        L_0x073d:
            r11 = r7
            r13 = r9
            r14 = r12
            r5 = r17
            r6 = r18
            r7 = r19
            r3 = r21
            r9 = r48
            r12 = r8
            r8 = r22
        L_0x074d:
            U0.Y0 r15 = r4.n()
            if (r15 == 0) goto L_0x0773
            me.saket.telephoto.zoomable.n$h r4 = new me.saket.telephoto.zoomable.n$h
            r0 = r4
            r1 = r36
            r2 = r37
            r34 = r4
            r4 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r50
            r35 = r15
            r15 = r51
            r16 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r34
            r0 = r35
            r0.a(r1)
        L_0x0773:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.saket.telephoto.zoomable.n.a(me.saket.telephoto.zoomable.o, java.lang.String, androidx.compose.ui.d, pK.l, float, p1.w0, i1.c, E1.k, boolean, nI.l, nI.l, boolean, me.saket.telephoto.zoomable.c, U0.m, int, int, int):void");
    }

    private static final boolean b(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void c(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final float d(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final long e(C4899r0<C5673m> r0Var) {
        return r0Var.getValue().q();
    }

    /* access modifiers changed from: private */
    public static final void f(C4899r0<C5673m> r0Var, long j10) {
        r0Var.setValue(C5673m.c(j10));
    }

    private static final C5942c k(C5942c cVar, C4889m mVar, int i10) {
        mVar.C(1602219301);
        if (C4895p.J()) {
            C4895p.S(1602219301, i10, -1, "me.saket.telephoto.zoomable.animatedPainter (ZoomableImage.kt:276)");
        }
        if (cVar instanceof T0) {
            mVar.C(435252706);
            boolean V10 = mVar.V(cVar);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                mVar.u(cVar);
            } else {
                cVar = D10;
            }
            C5942c cVar2 = cVar;
            mVar.U();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.U();
            return cVar2;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return cVar;
    }

    private static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, C17767l lVar, String str) {
        return lVar.c() ? dVar : C17678i.c(dVar, str);
    }

    private static final int m(o.d dVar) {
        return (int) C15906b.K(dVar.a());
    }

    /* access modifiers changed from: private */
    public static final j n(C17767l lVar) {
        C17769n b10 = lVar.b();
        C17542s.h(b10, "null cannot be cast to non-null type me.saket.telephoto.zoomable.RealZoomableState");
        return (j) b10;
    }

    private static final boolean o(C17767l lVar) {
        return n(lVar).M().b();
    }
}
