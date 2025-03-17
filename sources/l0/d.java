package l0;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.G0;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import c2.r;
import c2.s;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.C5537d0;
import m0.v0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5842M;
import s0.C5861g;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0011\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0014\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ac\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0001\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00000\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b$\u0010%\u001a;\u0010'\u001a\u00020 \"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010&\u001a\u00028\u0000H\u0003¢\u0006\u0004\b'\u0010(\"\u001e\u0010+\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020 0\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006.²\u0006$\u0010,\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00000\u001f\"\u0004\b\u0000\u0010\u001a8\nX\u0002²\u0006\u0012\u0010-\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001a8\nX\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "", "label", "Lkotlin/Function1;", "Ll0/e;", "LXH/N;", "content", "g", "(ZLandroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LnI/q;LU0/m;II)V", "Ls0/M;", "f", "(Ls0/M;ZLandroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LnI/q;LU0/m;II)V", "Ls0/g;", "e", "(Ls0/g;ZLandroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LnI/q;LU0/m;II)V", "Lm0/d0;", "visibleState", "d", "(Lm0/d0;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LnI/q;LU0/m;II)V", "T", "Lm0/v0;", "transition", "h", "(Lm0/v0;LnI/l;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;LnI/q;LU0/m;I)V", "Lkotlin/Function2;", "Ll0/k;", "shouldDisposeBlock", "Ll0/s;", "onLookaheadMeasured", "a", "(Lm0/v0;LnI/l;Landroidx/compose/ui/d;Landroidx/compose/animation/i;Landroidx/compose/animation/k;LnI/p;Ll0/s;LnI/q;LU0/m;II)V", "targetState", "l", "(Lm0/v0;LnI/l;Ljava/lang/Object;LU0/m;I)Ll0/k;", "k", "(Lm0/v0;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/K;LE1/H;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<K, H, C5267b, J> {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: l0.d$a$a  reason: collision with other inner class name */
        static final class C0403a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f25316c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0403a(a0 a0Var) {
                super(1);
                this.f25316c = a0Var;
            }

            public final void a(a0.a aVar) {
                a0.a.i(aVar, this.f25316c, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        a(s sVar) {
            super(3);
        }

        public final J a(K k10, H h10, long j10) {
            a0 i02 = h10.i0(j10);
            if (!k10.A0()) {
                return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new C0403a(i02), 4, (Object) null);
            }
            s.a(i02.E0(), i02.z0());
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((K) obj, (H) obj2, ((C5267b) obj3).r());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<T> f25317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<T, Boolean> f25318d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25319e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25320f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25321g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<k, k, Boolean> f25322h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25323i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f25324j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f25325k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v0<T> v0Var, C17642l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, p<? super k, ? super k, Boolean> pVar, s sVar, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f25317c = v0Var;
            this.f25318d = lVar;
            this.f25319e = dVar;
            this.f25320f = iVar;
            this.f25321g = kVar;
            this.f25322h = pVar;
            this.f25323i = qVar;
            this.f25324j = i10;
            this.f25325k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            d.a(this.f25317c, this.f25318d, this.f25319e, this.f25320f, this.f25321g, this.f25322h, (s) null, this.f25323i, mVar, M0.a(this.f25324j | 1), this.f25325k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LU0/G0;", "", "LXH/N;", "<anonymous>", "(LU0/G0;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {756}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<G0<Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25326c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f25327d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v0<k> f25328e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<p<k, k, Boolean>> f25329f;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v0<k> f25330c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(v0<k> v0Var) {
                super(0);
                this.f25330c = v0Var;
            }

            public final Boolean invoke() {
                return Boolean.valueOf(d.k(this.f25330c));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "c", "(ZLdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G0<Boolean> f25331a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v0<k> f25332b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<p<k, k, Boolean>> f25333c;

            b(G0<Boolean> g02, v0<k> v0Var, A1<? extends p<? super k, ? super k, Boolean>> a12) {
                this.f25331a = g02;
                this.f25332b = v0Var;
                this.f25333c = a12;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                this.f25331a.setValue(kotlin.coroutines.jvm.internal.b.a(z10 ? ((Boolean) d.b(this.f25333c).invoke(this.f25332b.i(), this.f25332b.p())).booleanValue() : false));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(v0<k> v0Var, A1<? extends p<? super k, ? super k, Boolean>> a12, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f25328e = v0Var;
            this.f25329f = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f25328e, this.f25329f, eVar);
            cVar.f25327d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(G0<Boolean> g02, C17164e<? super C16807N> eVar) {
            return ((c) create(g02, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f25326c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new a(this.f25328e));
                b bVar = new b((G0) this.f25327d, this.f25328e, this.f25329f);
                this.f25326c = 1;
                if (r10.collect(bVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: l0.d$d  reason: collision with other inner class name */
    static final class C0404d extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0404d f25334c = new C0404d();

        C0404d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f25335c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25336d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25337e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25338f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f25339g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25340h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f25341i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f25342j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z10, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f25335c = z10;
            this.f25336d = dVar;
            this.f25337e = iVar;
            this.f25338f = kVar;
            this.f25339g = str;
            this.f25340h = qVar;
            this.f25341i = i10;
            this.f25342j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            d.g(this.f25335c, this.f25336d, this.f25337e, this.f25338f, this.f25339g, this.f25340h, mVar, M0.a(this.f25341i | 1), this.f25342j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f25343c = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5842M f25344c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f25345d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25346e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25347f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25348g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f25349h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25350i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f25351j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f25352k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5842M m10, boolean z10, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f25344c = m10;
            this.f25345d = z10;
            this.f25346e = dVar;
            this.f25347f = iVar;
            this.f25348g = kVar;
            this.f25349h = str;
            this.f25350i = qVar;
            this.f25351j = i10;
            this.f25352k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            d.f(this.f25344c, this.f25345d, this.f25346e, this.f25347f, this.f25348g, this.f25349h, this.f25350i, mVar, M0.a(this.f25351j | 1), this.f25352k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f25353c = new h();

        h() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5861g f25354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f25355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25357f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25358g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f25359h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25360i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f25361j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f25362k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C5861g gVar, boolean z10, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f25354c = gVar;
            this.f25355d = z10;
            this.f25356e = dVar;
            this.f25357f = iVar;
            this.f25358g = kVar;
            this.f25359h = str;
            this.f25360i = qVar;
            this.f25361j = i10;
            this.f25362k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            d.e(this.f25354c, this.f25355d, this.f25356e, this.f25357f, this.f25358g, this.f25359h, this.f25360i, mVar, M0.a(this.f25361j | 1), this.f25362k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f25363c = new j();

        j() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5537d0<Boolean> f25364c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25365d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25366e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25367f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f25368g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25369h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f25370i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f25371j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5537d0<Boolean> d0Var, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f25364c = d0Var;
            this.f25365d = dVar;
            this.f25366e = iVar;
            this.f25367f = kVar;
            this.f25368g = str;
            this.f25369h = qVar;
            this.f25370i = i10;
            this.f25371j = i11;
        }

        public final void a(C4889m mVar, int i10) {
            d.d(this.f25364c, this.f25365d, this.f25366e, this.f25367f, this.f25368g, this.f25369h, mVar, M0.a(this.f25370i | 1), this.f25371j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/K;LE1/H;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements q<K, H, C5267b, J> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<T, Boolean> f25372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<T> f25373d;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a0 f25374c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a0 a0Var) {
                super(1);
                this.f25374c = a0Var;
            }

            public final void a(a0.a aVar) {
                a0.a.i(aVar, this.f25374c, 0, 0, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C17642l<? super T, Boolean> lVar, v0<T> v0Var) {
            super(3);
            this.f25372c = lVar;
            this.f25373d = v0Var;
        }

        public final J a(K k10, H h10, long j10) {
            a0 i02 = h10.i0(j10);
            long a10 = (!k10.A0() || this.f25372c.invoke(this.f25373d.p()).booleanValue()) ? s.a(i02.E0(), i02.z0()) : r.f23053b.a();
            return K.v0(k10, r.h(a10), r.g(a10), (Map) null, new a(i02), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((K) obj, (H) obj2, ((C5267b) obj3).r());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/k;", "current", "target", "", "a", "(Ll0/k;Ll0/k;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements p<k, k, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f25375c = new m();

        m() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(k kVar, k kVar2) {
            return Boolean.valueOf(kVar == kVar2 && kVar2 == k.PostExit);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v0<T> f25376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<T, Boolean> f25377d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f25378e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f25379f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f25380g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<e, C4889m, Integer, C16807N> f25381h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f25382i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(v0<T> v0Var, C17642l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, int i10) {
            super(2);
            this.f25376c = v0Var;
            this.f25377d = lVar;
            this.f25378e = dVar;
            this.f25379f = iVar;
            this.f25380g = kVar;
            this.f25381h = qVar;
            this.f25382i = i10;
        }

        public final void a(C4889m mVar, int i10) {
            d.h(this.f25376c, this.f25377d, this.f25378e, this.f25379f, this.f25380g, this.f25381h, mVar, M0.a(this.f25382i | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void a(m0.v0<T> r24, nI.C17642l<? super T, java.lang.Boolean> r25, androidx.compose.ui.d r26, androidx.compose.animation.i r27, androidx.compose.animation.k r28, nI.p<? super l0.k, ? super l0.k, java.lang.Boolean> r29, l0.s r30, nI.q<? super l0.e, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r29
            r0 = r30
            r10 = r31
            r11 = r33
            r12 = r34
            r1 = -891967166(0xffffffffcad5a942, float:-7001249.0)
            r2 = r32
            U0.m r15 = r2.k(r1)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r15.V(r6)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x0047
        L_0x0037:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r15.F(r7)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x005e
            boolean r3 = r15.V(r8)
            if (r3 == 0) goto L_0x005b
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r3
        L_0x005e:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r14 = r27
            goto L_0x0079
        L_0x0067:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            r14 = r27
            if (r3 != 0) goto L_0x0079
            boolean r3 = r15.V(r14)
            if (r3 == 0) goto L_0x0076
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r3
        L_0x0079:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0082
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r5 = r28
            goto L_0x0094
        L_0x0082:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            r5 = r28
            if (r3 != 0) goto L_0x0094
            boolean r3 = r15.V(r5)
            if (r3 == 0) goto L_0x0091
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r2 = r2 | r3
        L_0x0094:
            r3 = r12 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x009c
            r2 = r2 | r4
            goto L_0x00ac
        L_0x009c:
            r3 = r11 & r4
            if (r3 != 0) goto L_0x00ac
            boolean r3 = r15.F(r9)
            if (r3 == 0) goto L_0x00a9
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r3
        L_0x00ac:
            r3 = r12 & 64
            r21 = 2097152(0x200000, float:2.938736E-39)
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00b7
        L_0x00b4:
            r2 = r2 | r16
            goto L_0x00d0
        L_0x00b7:
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00d0
            r16 = r11 & r21
            if (r16 != 0) goto L_0x00c4
            boolean r16 = r15.V(r0)
            goto L_0x00c8
        L_0x00c4:
            boolean r16 = r15.F(r0)
        L_0x00c8:
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b4
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b4
        L_0x00d0:
            r4 = r12 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00da
            r2 = r2 | r16
        L_0x00d8:
            r4 = r2
            goto L_0x00eb
        L_0x00da:
            r4 = r11 & r16
            if (r4 != 0) goto L_0x00d8
            boolean r4 = r15.F(r10)
            if (r4 == 0) goto L_0x00e7
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r2 = r2 | r4
            goto L_0x00d8
        L_0x00eb:
            r2 = 4793491(0x492493, float:6.717112E-39)
            r2 = r2 & r4
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r13) goto L_0x0102
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x00fb
            goto L_0x0102
        L_0x00fb:
            r15.L()
            r11 = r0
            r0 = r15
            goto L_0x0380
        L_0x0102:
            if (r3 == 0) goto L_0x0106
            r3 = 0
            goto L_0x0107
        L_0x0106:
            r3 = r0
        L_0x0107:
            boolean r0 = U0.C4895p.J()
            r2 = -1
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)"
            U0.C4895p.S(r1, r4, r2, r0)
        L_0x0113:
            java.lang.Object r0 = r24.p()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014d
            java.lang.Object r0 = r24.i()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r24.u()
            if (r0 != 0) goto L_0x014d
            boolean r0 = r24.j()
            if (r0 == 0) goto L_0x0140
            goto L_0x014d
        L_0x0140:
            r0 = 1790262234(0x6ab53bda, float:1.0954911E26)
            r15.W(r0)
            r15.P()
            r2 = r3
            r0 = r15
            goto L_0x0376
        L_0x014d:
            r0 = 1787977937(0x6a9260d1, float:8.848019E25)
            r15.W(r0)
            r1 = r4 & 14
            r0 = r1 | 48
            r13 = r0 & 14
            r2 = r13 ^ 6
            r22 = 1
            r11 = 4
            if (r2 <= r11) goto L_0x0166
            boolean r2 = r15.V(r6)
            if (r2 != 0) goto L_0x016a
        L_0x0166:
            r0 = r0 & 6
            if (r0 != r11) goto L_0x016d
        L_0x016a:
            r0 = r22
            goto L_0x016e
        L_0x016d:
            r0 = 0
        L_0x016e:
            java.lang.Object r2 = r15.D()
            if (r0 != 0) goto L_0x017c
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0183
        L_0x017c:
            java.lang.Object r2 = r24.i()
            r15.u(r2)
        L_0x0183:
            boolean r0 = r24.u()
            if (r0 == 0) goto L_0x018d
            java.lang.Object r2 = r24.i()
        L_0x018d:
            r0 = -466616829(0xffffffffe42ffe03, float:-1.2985935E22)
            r15.W(r0)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x01a5
            java.lang.String r11 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"
            r18 = r1
            r19 = r3
            r1 = -1
            r3 = 0
            U0.C4895p.S(r0, r3, r1, r11)
            goto L_0x01a9
        L_0x01a5:
            r18 = r1
            r19 = r3
        L_0x01a9:
            r1 = r4 & 126(0x7e, float:1.77E-43)
            l0.k r2 = l(r6, r7, r2, r15, r1)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01b8
            U0.C4895p.R()
        L_0x01b8:
            r15.P()
            java.lang.Object r3 = r24.p()
            r15.W(r0)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)"
            r20 = r4
            r4 = -1
            r5 = 0
            U0.C4895p.S(r0, r5, r4, r11)
            goto L_0x01d4
        L_0x01d2:
            r20 = r4
        L_0x01d4:
            l0.k r3 = l(r6, r7, r3, r15, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e1
            U0.C4895p.R()
        L_0x01e1:
            r15.P()
            r5 = r13 | 3072(0xc00, float:4.305E-42)
            java.lang.String r4 = "EnterExitTransition"
            r0 = r24
            r11 = r18
            r1 = r2
            r2 = r3
            r13 = r19
            r3 = r4
            r23 = r20
            r6 = 1048576(0x100000, float:1.469368E-39)
            r4 = r15
            m0.v0 r0 = m0.w0.b(r0, r1, r2, r3, r4, r5)
            int r1 = r23 >> 15
            r1 = r1 & 14
            U0.A1 r1 = U0.p1.q(r9, r15, r1)
            java.lang.Object r2 = r0.i()
            java.lang.Object r3 = r0.p()
            java.lang.Object r2 = r9.invoke(r2, r3)
            boolean r3 = r15.V(r0)
            boolean r4 = r15.V(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x0225
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x022e
        L_0x0225:
            l0.d$c r4 = new l0.d$c
            r3 = 0
            r4.<init>(r0, r1, r3)
            r15.u(r4)
        L_0x022e:
            nI.p r4 = (nI.p) r4
            r1 = 0
            U0.A1 r2 = U0.p1.n(r2, r4, r15, r1)
            boolean r1 = k(r0)
            if (r1 == 0) goto L_0x024f
            boolean r1 = c(r2)
            if (r1 != 0) goto L_0x0242
            goto L_0x024f
        L_0x0242:
            r0 = 1790256282(0x6ab5249a, float:1.0949421E26)
            r15.W(r0)
            r15.P()
            r2 = r13
            r0 = r15
            goto L_0x0373
        L_0x024f:
            r1 = 1788869559(0x6a9ffbb7, float:9.670395E25)
            r15.W(r1)
            r1 = 4
            if (r11 != r1) goto L_0x025b
            r3 = r22
            goto L_0x025c
        L_0x025b:
            r3 = 0
        L_0x025c:
            java.lang.Object r1 = r15.D()
            if (r3 != 0) goto L_0x026a
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0272
        L_0x026a:
            l0.f r1 = new l0.f
            r1.<init>(r0)
            r15.u(r1)
        L_0x0272:
            l0.f r1 = (l0.f) r1
            int r2 = r23 >> 6
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r2 = r2 & 896(0x380, float:1.256E-42)
            r19 = r3 | r2
            r20 = 4
            r16 = 0
            java.lang.String r17 = "Built-in"
            r2 = r13
            r13 = r0
            r14 = r27
            r0 = r15
            r15 = r28
            r18 = r0
            androidx.compose.ui.d r3 = androidx.compose.animation.g.g(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x02ce
            r4 = 1789227361(0x6aa57161, float:1.0000409E26)
            r0.W(r4)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r23 & r5
            if (r5 == r6) goto L_0x02ae
            r5 = r23 & r21
            if (r5 == 0) goto L_0x02ac
            boolean r5 = r0.F(r2)
            if (r5 == 0) goto L_0x02ac
            goto L_0x02ae
        L_0x02ac:
            r22 = 0
        L_0x02ae:
            java.lang.Object r5 = r0.D()
            if (r22 != 0) goto L_0x02bc
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x02c4
        L_0x02bc:
            l0.d$a r5 = new l0.d$a
            r5.<init>(r2)
            r0.u(r5)
        L_0x02c4:
            nI.q r5 = (nI.q) r5
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.b.a(r4, r5)
            r0.P()
            goto L_0x02d9
        L_0x02ce:
            r4 = 1581766416(0x5e47d710, float:3.59999898E18)
            r0.W(r4)
            r0.P()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
        L_0x02d9:
            androidx.compose.ui.d r3 = r3.s(r4)
            androidx.compose.ui.d r3 = r8.s(r3)
            java.lang.Object r4 = r0.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x02f5
            l0.c r4 = new l0.c
            r4.<init>(r1)
            r0.u(r4)
        L_0x02f5:
            l0.c r4 = (l0.c) r4
            r5 = 0
            int r5 = U0.C4883j.a(r0, r5)
            U0.y r6 = r0.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r0, r3)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r13 = r11.a()
            U0.f r14 = r0.m()
            if (r14 != 0) goto L_0x0313
            U0.C4883j.c()
        L_0x0313:
            r0.I()
            boolean r14 = r0.i()
            if (r14 == 0) goto L_0x0320
            r0.p(r13)
            goto L_0x0323
        L_0x0320:
            r0.t()
        L_0x0323:
            U0.m r13 = U0.F1.a(r0)
            nI.p r14 = r11.c()
            U0.F1.c(r13, r4, r14)
            nI.p r4 = r11.e()
            U0.F1.c(r13, r6, r4)
            nI.p r4 = r11.b()
            boolean r6 = r13.i()
            if (r6 != 0) goto L_0x034d
            java.lang.Object r6 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r14)
            if (r6 != 0) goto L_0x035b
        L_0x034d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r13.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13.w(r5, r4)
        L_0x035b:
            nI.p r4 = r11.d()
            U0.F1.c(r13, r3, r4)
            int r3 = r23 >> 18
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.invoke(r1, r0, r3)
            r0.x()
            r0.P()
        L_0x0373:
            r0.P()
        L_0x0376:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x037f
            U0.C4895p.R()
        L_0x037f:
            r11 = r2
        L_0x0380:
            U0.Y0 r13 = r0.n()
            if (r13 == 0) goto L_0x03a2
            l0.d$b r14 = new l0.d$b
            r0 = r14
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r11
            r8 = r31
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13.a(r14)
        L_0x03a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.a(m0.v0, nI.l, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, nI.p, l0.s, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p<k, k, Boolean> b(A1<? extends p<? super k, ? super k, Boolean>> a12) {
        return (p) a12.getValue();
    }

    private static final boolean c(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(m0.C5537d0<java.lang.Boolean> r22, androidx.compose.ui.d r23, androidx.compose.animation.i r24, androidx.compose.animation.k r25, java.lang.String r26, nI.q<? super l0.e, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r22
            r7 = r29
            r0 = -222898426(0xfffffffff2b6d706, float:-7.243036E30)
            r2 = r28
            U0.m r2 = r2.k(r0)
            r3 = r30 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r7 | 6
            goto L_0x002d
        L_0x0014:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r7 & 8
            if (r3 != 0) goto L_0x0021
            boolean r3 = r2.V(r1)
            goto L_0x0025
        L_0x0021:
            boolean r3 = r2.F(r1)
        L_0x0025:
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r7
            goto L_0x002d
        L_0x002c:
            r3 = r7
        L_0x002d:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r23
            goto L_0x0048
        L_0x0036:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r23
            boolean r6 = r2.V(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r24
            goto L_0x0063
        L_0x0051:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r24
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r9
        L_0x0063:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r25
            goto L_0x007e
        L_0x006c:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r25
            boolean r11 = r2.V(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r11
        L_0x007e:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0087
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r12 = r26
            goto L_0x0099
        L_0x0087:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0084
            r12 = r26
            boolean r13 = r2.V(r12)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
        L_0x0099:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a3
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b5
        L_0x00a3:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b5
            boolean r13 = r2.F(r15)
            if (r13 == 0) goto L_0x00b2
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r3 = r3 | r13
        L_0x00b5:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00cd
            boolean r13 = r2.l()
            if (r13 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            r2.L()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x015b
        L_0x00cd:
            if (r4 == 0) goto L_0x00d2
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00d3
        L_0x00d2:
            r4 = r5
        L_0x00d3:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f1
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r8 = androidx.compose.animation.g.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r8)
            goto L_0x00f2
        L_0x00f1:
            r6 = r8
        L_0x00f2:
            if (r9 == 0) goto L_0x010d
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r8 = androidx.compose.animation.g.y(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = r5.c(r8)
            goto L_0x010e
        L_0x010d:
            r5 = r10
        L_0x010e:
            if (r11 == 0) goto L_0x0114
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x0115
        L_0x0114:
            r14 = r12
        L_0x0115:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0121
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x0121:
            int r0 = m0.C5537d0.f25738d
            r8 = r3 & 14
            r0 = r0 | r8
            int r8 = r3 >> 9
            r8 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = 0
            m0.v0 r8 = m0.w0.f(r1, r14, r2, r0, r8)
            l0.d$j r9 = l0.d.j.f25363c
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r2
            r15 = r0
            h(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0158
            U0.C4895p.R()
        L_0x0158:
            r10 = r5
            r5 = r3
            r3 = r6
        L_0x015b:
            U0.Y0 r9 = r2.n()
            if (r9 == 0) goto L_0x0174
            l0.d$k r11 = new l0.d$k
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.d(m0.d0, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(s0.C5861g r22, boolean r23, androidx.compose.ui.d r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, nI.q<? super l0.e, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r8 = r30
            r0 = 1766503102(0x694ab2be, float:1.5315444E25)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 48
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0015:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0024
            r3 = 32
            goto L_0x0026
        L_0x0024:
            r3 = 16
        L_0x0026:
            r3 = r3 | r8
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r8
        L_0x002b:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r5 = r24
            goto L_0x0046
        L_0x0034:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r24
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r7 = r25
            goto L_0x0061
        L_0x004f:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r25
            boolean r9 = r1.V(r7)
            if (r9 == 0) goto L_0x005e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r3 = r3 | r9
        L_0x0061:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r10 = r26
            goto L_0x007c
        L_0x006a:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r26
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r31 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x0086
            r3 = r3 | r12
        L_0x0083:
            r12 = r27
            goto L_0x0097
        L_0x0086:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0083
            r12 = r27
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r31 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
            r15 = r28
            goto L_0x00b3
        L_0x00a1:
            r13 = r8 & r14
            r15 = r28
            if (r13 != 0) goto L_0x00b3
            boolean r13 = r1.F(r15)
            if (r13 == 0) goto L_0x00b0
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b2
        L_0x00b0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b2:
            r3 = r3 | r13
        L_0x00b3:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            if (r13 != r14) goto L_0x00cc
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            r1.L()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
            goto L_0x015a
        L_0x00cc:
            if (r4 == 0) goto L_0x00d1
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f0
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r7 = androidx.compose.animation.g.m(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r7)
            goto L_0x00f1
        L_0x00f0:
            r6 = r7
        L_0x00f1:
            if (r9 == 0) goto L_0x010c
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r7 = androidx.compose.animation.g.A(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = r5.c(r7)
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0113
        L_0x0112:
            r7 = r12
        L_0x0113:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x011f
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)"
            U0.C4895p.S(r0, r3, r9, r10)
        L_0x011f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            int r9 = r3 >> 3
            r10 = r9 & 14
            int r11 = r3 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            m0.v0 r0 = m0.w0.g(r0, r7, r1, r10, r11)
            l0.d$h r10 = l0.d.h.f25353c
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r11
            r16 = r3 | r9
            r9 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r28
            r15 = r1
            h(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0157
            U0.C4895p.R()
        L_0x0157:
            r3 = r4
            r4 = r6
            r6 = r7
        L_0x015a:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0173
            l0.d$i r11 = new l0.d$i
            r0 = r11
            r1 = r22
            r2 = r23
            r7 = r28
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.e(s0.g, boolean, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(s0.C5842M r22, boolean r23, androidx.compose.ui.d r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, nI.q<? super l0.e, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r8 = r30
            r0 = -1741346906(0xffffffff983527a6, float:-2.341372E-24)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 48
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0015:
            r2 = r8 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0024
            r3 = 32
            goto L_0x0026
        L_0x0024:
            r3 = 16
        L_0x0026:
            r3 = r3 | r8
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r8
        L_0x002b:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0031:
            r5 = r24
            goto L_0x0046
        L_0x0034:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0031
            r5 = r24
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0043
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r3 = r3 | r6
        L_0x0046:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x004f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r7 = r25
            goto L_0x0061
        L_0x004f:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x004c
            r7 = r25
            boolean r9 = r1.V(r7)
            if (r9 == 0) goto L_0x005e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0060
        L_0x005e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r3 = r3 | r9
        L_0x0061:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x006a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r10 = r26
            goto L_0x007c
        L_0x006a:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r26
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007b
        L_0x0079:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            r3 = r3 | r11
        L_0x007c:
            r11 = r31 & 16
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x0086
            r3 = r3 | r12
        L_0x0083:
            r12 = r27
            goto L_0x0097
        L_0x0086:
            r12 = r12 & r8
            if (r12 != 0) goto L_0x0083
            r12 = r27
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0096
        L_0x0094:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r31 & 32
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
            r15 = r28
            goto L_0x00b3
        L_0x00a1:
            r13 = r8 & r14
            r15 = r28
            if (r13 != 0) goto L_0x00b3
            boolean r13 = r1.F(r15)
            if (r13 == 0) goto L_0x00b0
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b2
        L_0x00b0:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00b2:
            r3 = r3 | r13
        L_0x00b3:
            r13 = 599185(0x92491, float:8.39637E-40)
            r13 = r13 & r3
            r14 = 599184(0x92490, float:8.39636E-40)
            if (r13 != r14) goto L_0x00cc
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00c3
            goto L_0x00cc
        L_0x00c3:
            r1.L()
            r3 = r5
            r4 = r7
            r5 = r10
            r6 = r12
            goto L_0x015a
        L_0x00cc:
            if (r4 == 0) goto L_0x00d1
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00f0
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r7 = androidx.compose.animation.g.i(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r7)
            goto L_0x00f1
        L_0x00f0:
            r6 = r7
        L_0x00f1:
            if (r9 == 0) goto L_0x010c
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r7 = androidx.compose.animation.g.w(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = r5.c(r7)
            goto L_0x010d
        L_0x010c:
            r5 = r10
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            java.lang.String r7 = "AnimatedVisibility"
            goto L_0x0113
        L_0x0112:
            r7 = r12
        L_0x0113:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x011f
            r9 = -1
            java.lang.String r10 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)"
            U0.C4895p.S(r0, r3, r9, r10)
        L_0x011f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            int r9 = r3 >> 3
            r10 = r9 & 14
            int r11 = r3 >> 12
            r11 = r11 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            r11 = 0
            m0.v0 r0 = m0.w0.g(r0, r7, r1, r10, r11)
            l0.d$f r10 = l0.d.f.f25343c
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 | 48
            r12 = r3 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r12
            r3 = r3 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r11
            r16 = r3 | r9
            r9 = r0
            r11 = r4
            r12 = r6
            r13 = r5
            r14 = r28
            r15 = r1
            h(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0157
            U0.C4895p.R()
        L_0x0157:
            r3 = r4
            r4 = r6
            r6 = r7
        L_0x015a:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0173
            l0.d$g r11 = new l0.d$g
            r0 = r11
            r1 = r22
            r2 = r23
            r7 = r28
            r8 = r30
            r9 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.f(s0.M, boolean, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(boolean r22, androidx.compose.ui.d r23, androidx.compose.animation.i r24, androidx.compose.animation.k r25, java.lang.String r26, nI.q<? super l0.e, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r7 = r29
            r0 = 2088733774(0x7c7f8c4e, float:5.3075257E36)
            r1 = r28
            U0.m r1 = r1.k(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r22
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r22
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r22
            r3 = r7
        L_0x0029:
            r4 = r30 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r23
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r23
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r24
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r24
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r30 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r25
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r25
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r30 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r26
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r26
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r30 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r3 = r3 | r14
            r15 = r27
            goto L_0x00b1
        L_0x009f:
            r13 = r7 & r14
            r15 = r27
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.F(r15)
            if (r13 == 0) goto L_0x00ae
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r13
        L_0x00b1:
            r13 = 74899(0x12493, float:1.04956E-40)
            r13 = r13 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00c9
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            r1.L()
            r4 = r5
            r3 = r8
            r5 = r12
            goto L_0x0158
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00cf
        L_0x00ce:
            r4 = r5
        L_0x00cf:
            r5 = 0
            r13 = 3
            r14 = 0
            if (r6 == 0) goto L_0x00ed
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r14, r5, r13, r14)
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.i r8 = androidx.compose.animation.g.k(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.i r6 = r6.c(r8)
            goto L_0x00ee
        L_0x00ed:
            r6 = r8
        L_0x00ee:
            if (r9 == 0) goto L_0x0109
            r20 = 15
            r21 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.animation.k r8 = androidx.compose.animation.g.y(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.k r5 = androidx.compose.animation.g.q(r14, r5, r13, r14)
            androidx.compose.animation.k r5 = r8.c(r5)
            goto L_0x010a
        L_0x0109:
            r5 = r10
        L_0x010a:
            if (r11 == 0) goto L_0x0110
            java.lang.String r8 = "AnimatedVisibility"
            r14 = r8
            goto L_0x0111
        L_0x0110:
            r14 = r12
        L_0x0111:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x011d
            r8 = -1
            java.lang.String r9 = "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x011d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r8 = r3 & 14
            int r9 = r3 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r8 = r8 | r9
            r9 = 0
            m0.v0 r8 = m0.w0.g(r0, r14, r1, r8, r9)
            l0.d$d r9 = l0.d.C0404d.f25334c
            int r0 = r3 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r10 = r10 | 48
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r0 = r0 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r10
            r0 = r0 | r3
            r10 = r4
            r11 = r6
            r12 = r5
            r13 = r27
            r3 = r14
            r14 = r1
            r15 = r0
            h(r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0155
            U0.C4895p.R()
        L_0x0155:
            r10 = r5
            r5 = r3
            r3 = r6
        L_0x0158:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0171
            l0.d$e r11 = new l0.d$e
            r0 = r11
            r1 = r22
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.g(boolean, androidx.compose.ui.d, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, nI.q, U0.m, int, int):void");
    }

    public static final <T> void h(v0<T> v0Var, C17642l<? super T, Boolean> lVar, androidx.compose.ui.d dVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, q<? super e, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        v0<T> v0Var2 = v0Var;
        C17642l<? super T, Boolean> lVar2 = lVar;
        androidx.compose.ui.d dVar2 = dVar;
        int i12 = i10;
        C4889m k10 = mVar.k(429978603);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(v0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(dVar2) ? 256 : 128;
        }
        androidx.compose.animation.i iVar2 = iVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(iVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        androidx.compose.animation.k kVar2 = kVar;
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(kVar2) ? 16384 : 8192;
        }
        q<? super e, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        if ((i12 & ImageMetadata.EDGE_MODE) == 0) {
            i11 |= k10.F(qVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i13 = i11 & 112;
            boolean z10 = false;
            boolean z11 = i13 == 32;
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new l(lVar2, v0Var2);
                k10.u(D10);
            }
            a(v0Var, lVar, androidx.compose.ui.layout.b.a(dVar2, (q) D10), iVar, kVar, m.f25375c, (s) null, qVar, k10, i13 | 196608 | i14 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new n(v0Var, lVar, dVar, iVar, kVar, qVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean k(v0<k> v0Var) {
        k i10 = v0Var.i();
        k kVar = k.PostExit;
        return i10 == kVar && v0Var.p() == kVar;
    }

    private static final <T> k l(v0<T> v0Var, C17642l<? super T, Boolean> lVar, T t10, C4889m mVar, int i10) {
        k kVar;
        if (C4895p.J()) {
            C4895p.S(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        mVar.H(-902048200, v0Var);
        if (v0Var.u()) {
            mVar.W(2101296683);
            mVar.P();
            kVar = lVar.invoke(t10).booleanValue() ? k.Visible : lVar.invoke(v0Var.i()).booleanValue() ? k.PostExit : k.PreEnter;
        } else {
            mVar.W(2101530516);
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                mVar.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            if (lVar.invoke(v0Var.i()).booleanValue()) {
                r0Var.setValue(Boolean.TRUE);
            }
            kVar = lVar.invoke(t10).booleanValue() ? k.Visible : ((Boolean) r0Var.getValue()).booleanValue() ? k.PostExit : k.PreEnter;
            mVar.P();
        }
        mVar.T();
        if (C4895p.J()) {
            C4895p.R();
        }
        return kVar;
    }
}
