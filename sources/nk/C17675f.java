package nK;

import KJ.C15985a;
import KJ.C15987c;
import KJ.C15988d;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import bI.C17035a;
import c2.r;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5669i;
import oK.C17709b;
import oK.C17712e;
import oK.C17715h;
import oK.C17717j;
import oK.C17718k;
import oK.C17719l;
import oK.s;
import oK.t;
import oK.u;
import p1.J0;
import pK.C17765j;
import t1.C5940a;
import t1.C5942c;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R/\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188@@@X\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR5\u0010'\u001a\u0004\u0018\u00010!2\b\u0010\u0019\u001a\u0004\u0018\u00010!8@@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010,RC\u00105\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.8B@BX\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u0010\u0015R\u001d\u0010=\u001a\u0004\u0018\u0001098BX\u0002¢\u0006\f\n\u0004\b:\u0010\u0014\u001a\u0004\b;\u0010<R!\u0010C\u001a\b\u0012\u0004\u0012\u00020?0>8BX\u0002¢\u0006\f\n\u0004\b@\u0010\u0014\u001a\u0004\bA\u0010BR!\u0010F\u001a\b\u0012\u0004\u0012\u00020D0>8@X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\bE\u0010BR\u001c\u0010G\u001a\u0004\u0018\u00010!8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010$\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"LnK/f;", "LnK/k;", "LnK/j;", "imageSource", "Lkotlin/Function0;", "LpK/j;", "contentTransformation", "<init>", "(LnK/j;LnI/a;)V", "LXH/N;", "d", "(LU0/m;I)V", "a", "LnI/a;", "Lt1/c;", "b", "Lt1/c;", "imagePreview", "", "c", "LU0/A1;", "()Z", "isImageDisplayed", "isImageDisplayedInFullQuality", "LoK/h;", "<set-?>", "e", "LU0/r0;", "l", "()LoK/h;", "t", "(LoK/h;)V", "imageRegionDecoder", "Lc2/r;", "f", "q", "()Lc2/r;", "v", "(Lc2/r;)V", "viewportSize", "g", "Z", "n", "setShowTileBounds$sub_sampling_image_release", "(Z)V", "showTileBounds", "LKJ/d;", "LoK/j;", "h", "m", "()LKJ/d;", "u", "(LKJ/d;)V", "loadedImages", "i", "s", "isReadyToBeDisplayed", "LoK/k;", "j", "o", "()LoK/k;", "tileGrid", "LKJ/c;", "LoK/u;", "k", "r", "()LKJ/c;", "viewportTiles", "LoK/t;", "p", "viewportImageTiles", "imageSize", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.f  reason: case insensitive filesystem */
public final class C17675f implements C17680k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<C17765j> f144895a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5942c f144896b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f144897c;

    /* renamed from: d  reason: collision with root package name */
    private final A1 f144898d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f144899e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f144900f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f144901g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f144902h;

    /* renamed from: i  reason: collision with root package name */
    private final A1 f144903i;

    /* renamed from: j  reason: collision with root package name */
    private final A1 f144904j;

    /* renamed from: k  reason: collision with root package name */
    private final A1 f144905k;

    /* renamed from: l  reason: collision with root package name */
    private final A1 f144906l;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.f$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f144908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17675f fVar, int i10) {
            super(2);
            this.f144907c = fVar;
            this.f144908d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f144907c.d(mVar, M0.a(this.f144908d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.RealSubSamplingImageState$LoadImageTilesEffect$2", f = "RealSubSamplingImageState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nK.f$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144909c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17712e f144910d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17675f f144911e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17712e eVar, C17675f fVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f144910d = eVar;
            this.f144911e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f144910d, this.f144911e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f144909c == 0) {
                y.b(obj);
                C17712e eVar = this.f144910d;
                C15987c i10 = this.f144911e.r();
                ArrayList arrayList = new ArrayList(i10.size());
                int size = i10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    u uVar = (u) i10.get(i11);
                    C17717j b10 = uVar.d() ? uVar.b() : null;
                    if (b10 != null) {
                        kotlin.coroutines.jvm.internal.b.a(arrayList.add(b10));
                    }
                }
                eVar.f(arrayList);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.RealSubSamplingImageState$LoadImageTilesEffect$3", f = "RealSubSamplingImageState.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: nK.f$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f144912c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17712e f144913d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17675f f144914e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LKJ/d;", "LoK/j;", "Lt1/c;", "it", "LXH/N;", "c", "(LKJ/d;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: nK.f$c$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17675f f144915a;

            a(C17675f fVar) {
                this.f144915a = fVar;
            }

            /* renamed from: c */
            public final Object emit(C15988d<C17717j, ? extends C5942c> dVar, C17164e<? super C16807N> eVar) {
                this.f144915a.u(dVar);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17712e eVar, C17675f fVar, C17164e<? super c> eVar2) {
            super(2, eVar2);
            this.f144913d = eVar;
            this.f144914e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f144913d, this.f144914e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f144912c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<C15988d<C17717j, C5942c>> g10 = this.f144913d.g();
                a aVar = new a(this.f144914e);
                this.f144912c = 1;
                if (g10.collect(aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.f$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144916c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f144917d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17675f fVar, int i10) {
            super(2);
            this.f144916c = fVar;
            this.f144917d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f144916c.d(mVar, M0.a(this.f144917d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.f$e */
    static final class e extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144918c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17675f fVar) {
            super(0);
            this.f144918c = fVar;
        }

        public final Boolean invoke() {
            boolean z10 = false;
            if (this.f144918c.s() && !this.f144918c.p().isEmpty()) {
                C15987c<t> p10 = this.f144918c.p();
                int size = p10.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        C15987c<t> p11 = this.f144918c.p();
                        int size2 = p11.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size2) {
                                if (p11.get(i11).b() == null) {
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                    } else if (p10.get(i10).c()) {
                        break;
                    } else {
                        i10++;
                    }
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.f$f  reason: collision with other inner class name */
    static final class C3534f extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144919c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3534f(C17675f fVar) {
            super(0);
            this.f144919c = fVar;
        }

        public final Boolean invoke() {
            boolean z10 = false;
            if (this.f144919c.a()) {
                C15987c<t> p10 = this.f144919c.p();
                int size = p10.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        if (p10.get(i10).b() == null) {
                            break;
                        }
                        i10++;
                    } else {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.f$g */
    static final class g extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144920c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17675f fVar) {
            super(0);
            this.f144920c = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            if (oK.C17709b.i(r1.k()) == true) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke() {
            /*
                r4 = this;
                nK.f r0 = r4.f144920c
                c2.r r0 = r0.q()
                nK.f r1 = r4.f144920c
                oK.h r1 = r1.l()
                if (r1 == 0) goto L_0x0017
                long r1 = r1.a()
                c2.r r1 = c2.r.b(r1)
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                if (r0 == 0) goto L_0x0032
                long r2 = r0.k()
                boolean r0 = oK.C17709b.i(r2)
                r2 = 1
                if (r0 != r2) goto L_0x0032
                if (r1 == 0) goto L_0x0032
                long r0 = r1.k()
                boolean r0 = oK.C17709b.i(r0)
                if (r0 != r2) goto L_0x0032
                goto L_0x0033
            L_0x0032:
                r2 = 0
            L_0x0033:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nK.C17675f.g.invoke():java.lang.Boolean");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LoK/k;", "b", "()LoK/k;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.f$h */
    static final class h extends C17544u implements C17631a<C17718k> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144921c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17675f fVar) {
            super(0);
            this.f144921c = fVar;
        }

        /* renamed from: b */
        public final C17718k invoke() {
            if (!this.f144921c.s()) {
                return null;
            }
            C17718k.a aVar = C17718k.f145384c;
            r q10 = this.f144921c.q();
            C17542s.g(q10);
            long k10 = q10.k();
            r b10 = this.f144921c.b();
            C17542s.g(b10);
            return s.f(aVar, k10, b10.k(), 0, 4, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKJ/c;", "LoK/t;", "b", "()LKJ/c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.f$i */
    static final class i extends C17544u implements C17631a<C15987c<? extends t>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144922c;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: nK.f$i$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17675f f144923c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17675f fVar) {
                super(0);
                this.f144923c = fVar;
            }

            public final Boolean invoke() {
                C15987c i10 = this.f144923c.r();
                C17675f fVar = this.f144923c;
                int size = i10.size();
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    u uVar = (u) i10.get(i11);
                    if (!uVar.c() && uVar.d() && !fVar.m().containsKey(uVar.b())) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C17675f fVar) {
            super(0);
            this.f144922c = fVar;
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [oK.t] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final KJ.C15987c<oK.t> invoke() {
            /*
                r11 = this;
                nK.f r0 = r11.f144922c
                KJ.c r0 = r0.r()
                int r1 = r0.size()
                r2 = 0
                r3 = r2
            L_0x000c:
                r4 = 1
                if (r3 >= r1) goto L_0x0020
                java.lang.Object r5 = r0.get(r3)
                oK.u r5 = (oK.u) r5
                boolean r5 = r5.c()
                if (r5 != 0) goto L_0x001d
                r0 = r2
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000c
            L_0x0020:
                r0 = r4
            L_0x0021:
                nK.f$i$a r1 = new nK.f$i$a
                nK.f r3 = r11.f144922c
                r1.<init>(r3)
                if (r0 != 0) goto L_0x0038
                java.lang.Object r0 = r1.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r4 = r2
            L_0x0038:
                nK.f r0 = r11.f144922c
                KJ.c r0 = r0.r()
                nK.f r1 = r11.f144922c
                java.util.ArrayList r3 = new java.util.ArrayList
                int r5 = r0.size()
                r3.<init>(r5)
                int r5 = r0.size()
            L_0x004d:
                if (r2 >= r5) goto L_0x008e
                java.lang.Object r6 = r0.get(r2)
                oK.u r6 = (oK.u) r6
                boolean r7 = r6.d()
                r8 = 0
                if (r7 == 0) goto L_0x0086
                boolean r7 = r6.c()
                if (r7 == 0) goto L_0x0064
                if (r4 == 0) goto L_0x0086
            L_0x0064:
                oK.t r7 = new oK.t
                KJ.d r9 = r1.m()
                oK.j r10 = r6.b()
                java.lang.Object r9 = r9.get(r10)
                t1.c r9 = (t1.C5942c) r9
                if (r9 != 0) goto L_0x0081
                boolean r9 = r6.c()
                if (r9 == 0) goto L_0x0082
                t1.c r8 = r1.f144896b
                goto L_0x0082
            L_0x0081:
                r8 = r9
            L_0x0082:
                r7.<init>(r6, r8)
                r8 = r7
            L_0x0086:
                if (r8 == 0) goto L_0x008b
                r3.add(r8)
            L_0x008b:
                int r2 = r2 + 1
                goto L_0x004d
            L_0x008e:
                KJ.c r0 = KJ.C15985a.h(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nK.C17675f.i.invoke():KJ.c");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKJ/c;", "LoK/u;", "b", "()LKJ/c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: nK.f$j */
    static final class j extends C17544u implements C17631a<C15987c<? extends u>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17675f f144924c;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: nK.f$j$a */
        public static final class a<T> implements Comparator {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17765j f144925a;

            public a(C17765j jVar) {
                this.f144925a = jVar;
            }

            public final int compare(T t10, T t11) {
                return C17035a.e(Boolean.valueOf(C17709b.c(((C17717j) t11).a(), this.f144925a.b())), Boolean.valueOf(C17709b.c(((C17717j) t10).a(), this.f144925a.b())));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C17675f fVar) {
            super(0);
            this.f144924c = fVar;
        }

        /* renamed from: b */
        public final C15987c<u> invoke() {
            List list;
            C17718k h10 = this.f144924c.o();
            if (h10 == null) {
                return C15985a.a();
            }
            C17765j jVar = (C17765j) this.f144924c.f144895a.invoke();
            int b10 = h10.a().b();
            int b11 = C17719l.b(s.b(C17719l.f145388b, C17709b.g(jVar.e())), b10);
            if (C17719l.e(b11, b10)) {
                list = C16877v.n();
            } else {
                List<C17717j> list2 = h10.b().get(C17719l.a(b11));
                C17542s.g(list2);
                list = list2;
            }
            List g12 = C16877v.g1(C16877v.V0(C16877v.e(h10.a()), list), new a(jVar));
            C17675f fVar = this.f144924c;
            ArrayList arrayList = new ArrayList(g12.size());
            int size = g12.size();
            for (int i10 = 0; i10 < size; i10++) {
                C17717j jVar2 = (C17717j) g12.get(i10);
                boolean e10 = C17542s.e(jVar2, h10.a());
                C5669i k10 = C17709b.k(jVar2.a(), jVar.e(), jVar.c());
                r q10 = fVar.q();
                C17542s.g(q10);
                arrayList.add(new u(jVar2, k10, C17709b.j(k10, q10.k()), e10));
            }
            return C15985a.h(arrayList);
        }
    }

    public C17675f(C17679j jVar, C17631a<? extends C17765j> aVar) {
        C17542s.j(jVar, "imageSource");
        C17542s.j(aVar, "contentTransformation");
        this.f144895a = aVar;
        J0 q22 = jVar.q2();
        this.f144896b = q22 != null ? new C5940a(q22, 0, 0, 6, (DefaultConstructorMarker) null) : null;
        this.f144897c = p1.e(new e(this));
        this.f144898d = p1.e(new C3534f(this));
        this.f144899e = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f144900f = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f144902h = u1.e(C15985a.c(), (o1) null, 2, (Object) null);
        this.f144903i = p1.e(new g(this));
        this.f144904j = p1.e(new h(this));
        this.f144905k = p1.e(new j(this));
        this.f144906l = p1.e(new i(this));
    }

    /* access modifiers changed from: private */
    public final C15988d<C17717j, C5942c> m() {
        return (C15988d) this.f144902h.getValue();
    }

    /* access modifiers changed from: private */
    public final C17718k o() {
        return (C17718k) this.f144904j.getValue();
    }

    /* access modifiers changed from: private */
    public final C15987c<u> r() {
        return (C15987c) this.f144905k.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean s() {
        return ((Boolean) this.f144903i.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void u(C15988d<C17717j, ? extends C5942c> dVar) {
        this.f144902h.setValue(dVar);
    }

    public boolean a() {
        return ((Boolean) this.f144897c.getValue()).booleanValue();
    }

    public r b() {
        C17715h l10 = l();
        if (l10 != null) {
            return r.b(l10.a());
        }
        return null;
    }

    public boolean c() {
        return ((Boolean) this.f144898d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: oK.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: oK.e} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r1 == r2.a()) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(U0.C4889m r12, int r13) {
        /*
            r11 = this;
            r0 = 1914919499(0x72235a4b, float:3.2355337E30)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 14
            r2 = 2
            r3 = 4
            if (r1 != 0) goto L_0x0018
            boolean r1 = r12.V(r11)
            if (r1 == 0) goto L_0x0015
            r1 = r3
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            r1 = r1 | r13
            goto L_0x0019
        L_0x0018:
            r1 = r13
        L_0x0019:
            r4 = r1 & 11
            if (r4 != r2) goto L_0x0029
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r12.L()
            goto L_0x00da
        L_0x0029:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0035
            r2 = -1
            java.lang.String r4 = "me.saket.telephoto.subsamplingimage.RealSubSamplingImageState.LoadImageTilesEffect (RealSubSamplingImageState.kt:144)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0035:
            boolean r0 = r11.s()
            if (r0 != 0) goto L_0x0053
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0044
            U0.C4895p.R()
        L_0x0044:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x0052
            nK.f$a r0 = new nK.f$a
            r0.<init>(r11, r13)
            r12.a(r0)
        L_0x0052:
            return
        L_0x0053:
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r12.C(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.C(r0)
            java.lang.Object r0 = r12.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r4 = r2.a()
            if (r0 != r4) goto L_0x007a
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r12)
            U0.B r4 = new U0.B
            r4.<init>(r0)
            r12.u(r4)
            r0 = r4
        L_0x007a:
            r12.U()
            U0.B r0 = (U0.B) r0
            QJ.Q r5 = r0.a()
            r12.U()
            r0 = -1909930416(0xffffffff8e28c650, float:-2.0803083E-30)
            r12.C(r0)
            r0 = r1 & 14
            if (r0 != r3) goto L_0x0092
            r0 = 1
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            java.lang.Object r1 = r12.D()
            if (r0 != 0) goto L_0x009f
            java.lang.Object r0 = r2.a()
            if (r1 != r0) goto L_0x00b3
        L_0x009f:
            oK.e r1 = new oK.e
            oK.h r6 = r11.l()
            kotlin.jvm.internal.C17542s.g(r6)
            r9 = 4
            r10 = 0
            r7 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r9, r10)
            r12.u(r1)
        L_0x00b3:
            oK.e r1 = (oK.C17712e) r1
            r12.U()
            KJ.c r0 = r11.r()
            nK.f$b r2 = new nK.f$b
            r3 = 0
            r2.<init>(r1, r11, r3)
            r4 = 520(0x208, float:7.29E-43)
            U0.P.f(r1, r0, r2, r12, r4)
            nK.f$c r0 = new nK.f$c
            r0.<init>(r1, r11, r3)
            r2 = 72
            U0.P.g(r1, r0, r12, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00da
            U0.C4895p.R()
        L_0x00da:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x00e8
            nK.f$d r0 = new nK.f$d
            r0.<init>(r11, r13)
            r12.a(r0)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nK.C17675f.d(U0.m, int):void");
    }

    public final C17715h l() {
        return (C17715h) this.f144899e.getValue();
    }

    public final boolean n() {
        return this.f144901g;
    }

    public final C15987c<t> p() {
        return (C15987c) this.f144906l.getValue();
    }

    public final r q() {
        return (r) this.f144900f.getValue();
    }

    public final void t(C17715h hVar) {
        this.f144899e.setValue(hVar);
    }

    public final void v(r rVar) {
        this.f144900f.setValue(rVar);
    }
}
