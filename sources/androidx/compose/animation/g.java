package androidx.compose.animation;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C5505A;
import m0.B0;
import m0.C5548j;
import m0.C5556n;
import m0.C5559o0;
import m0.N;
import m0.P0;
import m0.v0;
import m0.w0;
import m0.z0;
import nI.C17631a;
import nI.C17642l;
import p1.p1;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0017\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b!\u0010\"\u001aI\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b%\u0010&\u001aI\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b*\u0010+\u001aI\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b.\u0010/\u001aI\u00101\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b1\u00102\u001aI\u00104\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b4\u00105\u001a5\u00107\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b7\u0010\u0010\u001a5\u00109\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b9\u0010\u0010\u001a5\u0010;\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b;\u0010\u0013\u001a5\u0010=\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b=\u0010\u0013\u001a\u0013\u0010>\u001a\u00020\u001c*\u00020'H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010@\u001a\u00020\u001c*\u00020,H\u0002¢\u0006\u0004\b@\u0010A\u001aA\u0010K\u001a\u00020J*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\b2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010L\u001a!\u0010M\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0004\bM\u0010N\u001a!\u0010O\u001a\u00020\b*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010E\u001a\u00020\bH\u0001¢\u0006\u0004\bO\u0010P\u001a1\u0010R\u001a\u00020Q*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\b2\u0006\u0010I\u001a\u00020HH\u0003¢\u0006\u0004\bR\u0010S\" \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020U0T8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010W\"\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\"\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010[\"\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\r0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010[\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c²\u0006\u000e\u0010a\u001a\u00020\u00048\n@\nX\u0002²\u0006\u000e\u0010b\u001a\u00020\b8\n@\nX\u0002"}, d2 = {"Lm0/N;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/i;", "n", "(Lm0/N;F)Landroidx/compose/animation/i;", "targetAlpha", "Landroidx/compose/animation/k;", "p", "(Lm0/N;F)Landroidx/compose/animation/k;", "Lc2/n;", "Lkotlin/Function1;", "Lc2/r;", "initialOffset", "B", "(Lm0/N;LnI/l;)Landroidx/compose/animation/i;", "targetOffset", "G", "(Lm0/N;LnI/l;)Landroidx/compose/animation/k;", "initialScale", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "r", "(Lm0/N;FJ)Landroidx/compose/animation/i;", "targetScale", "t", "(Lm0/N;FJ)Landroidx/compose/animation/k;", "Li1/c;", "expandFrom", "", "clip", "initialSize", "j", "(Lm0/N;Li1/c;ZLnI/l;)Landroidx/compose/animation/i;", "shrinkTowards", "targetSize", "x", "(Lm0/N;Li1/c;ZLnI/l;)Landroidx/compose/animation/k;", "Li1/c$b;", "", "initialWidth", "h", "(Lm0/N;Li1/c$b;ZLnI/l;)Landroidx/compose/animation/i;", "Li1/c$c;", "initialHeight", "l", "(Lm0/N;Li1/c$c;ZLnI/l;)Landroidx/compose/animation/i;", "targetWidth", "v", "(Lm0/N;Li1/c$b;ZLnI/l;)Landroidx/compose/animation/k;", "targetHeight", "z", "(Lm0/N;Li1/c$c;ZLnI/l;)Landroidx/compose/animation/k;", "initialOffsetX", "C", "initialOffsetY", "E", "targetOffsetX", "H", "targetOffsetY", "J", "L", "(Li1/c$b;)Li1/c;", "M", "(Li1/c$c;)Li1/c;", "Lm0/v0;", "Ll0/k;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/d;", "g", "(Lm0/v0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;LnI/a;Ljava/lang/String;LU0/m;II)Landroidx/compose/ui/d;", "N", "(Lm0/v0;Landroidx/compose/animation/i;LU0/m;I)Landroidx/compose/animation/i;", "Q", "(Lm0/v0;Landroidx/compose/animation/k;LU0/m;I)Landroidx/compose/animation/k;", "Ll0/p;", "e", "(Lm0/v0;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;LU0/m;I)Ll0/p;", "Lm0/z0;", "Lm0/n;", "a", "Lm0/z0;", "TransformOriginVectorConverter", "Lm0/o0;", "b", "Lm0/o0;", "DefaultAlphaAndScaleSpring", "c", "DefaultOffsetAnimationSpec", "d", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final z0<androidx.compose.ui.graphics.f, C5556n> f17374a = B0.a(C5067a.f17381c, C5068b.f17382c);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5559o0<Float> f17375b = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C5559o0<c2.n> f17376c = C5548j.h(0.0f, 400.0f, c2.n.b(P0.c(c2.n.f23044b)), 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C5559o0<c2.r> f17377d = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "Lc2/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class A extends C17544u implements C17642l<c2.r, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17378c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17378c = lVar;
        }

        public final long a(long j10) {
            return c2.o.a(this.f17378c.invoke(Integer.valueOf(c2.r.h(j10))).intValue(), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class B extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final B f17379c = new B();

        B() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "Lc2/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class C extends C17544u implements C17642l<c2.r, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17380c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17380c = lVar;
        }

        public final long a(long j10) {
            return c2.o.a(0, this.f17380c.invoke(Integer.valueOf(c2.r.g(j10))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/f;", "it", "Lm0/n;", "a", "(J)Lm0/n;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.g$a  reason: case insensitive filesystem */
    static final class C5067a extends C17544u implements C17642l<androidx.compose.ui.graphics.f, C5556n> {

        /* renamed from: c  reason: collision with root package name */
        public static final C5067a f17381c = new C5067a();

        C5067a() {
            super(1);
        }

        public final C5556n a(long j10) {
            return new C5556n(androidx.compose.ui.graphics.f.f(j10), androidx.compose.ui.graphics.f.g(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.graphics.f) obj).j());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/n;", "it", "Landroidx/compose/ui/graphics/f;", "a", "(Lm0/n;)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.g$b  reason: case insensitive filesystem */
    static final class C5068b extends C17544u implements C17642l<C5556n, androidx.compose.ui.graphics.f> {

        /* renamed from: c  reason: collision with root package name */
        public static final C5068b f17382c = new C5068b();

        C5068b() {
            super(1);
        }

        public final long a(C5556n nVar) {
            return p1.a(nVar.f(), nVar.g());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((C5556n) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.g$c  reason: case insensitive filesystem */
    static final class C5069c extends C17544u implements C17642l<v0.b<l0.k>, N<Float>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f17384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5069c(i iVar, k kVar) {
            super(1);
            this.f17383c = iVar;
            this.f17384d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
            r3 = r3.b();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final m0.N<java.lang.Float> invoke(m0.v0.b<l0.k> r3) {
            /*
                r2 = this;
                l0.k r0 = l0.k.PreEnter
                l0.k r1 = l0.k.Visible
                boolean r0 = r3.h(r0, r1)
                if (r0 == 0) goto L_0x0021
                androidx.compose.animation.i r3 = r2.f17383c
                l0.A r3 = r3.b()
                l0.m r3 = r3.c()
                if (r3 == 0) goto L_0x001c
                m0.N r3 = r3.b()
                if (r3 != 0) goto L_0x0044
            L_0x001c:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
                goto L_0x0044
            L_0x0021:
                l0.k r0 = l0.k.PostExit
                boolean r3 = r3.h(r1, r0)
                if (r3 == 0) goto L_0x0040
                androidx.compose.animation.k r3 = r2.f17384d
                l0.A r3 = r3.b()
                l0.m r3 = r3.c()
                if (r3 == 0) goto L_0x003b
                m0.N r3 = r3.b()
                if (r3 != 0) goto L_0x0044
            L_0x003b:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
                goto L_0x0044
            L_0x0040:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
            L_0x0044:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.C5069c.invoke(m0.v0$b):m0.N");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "", "a", "(Ll0/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<l0.k, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17385c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f17386d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17387a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    l0.k[] r0 = l0.k.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    l0.k r1 = l0.k.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    l0.k r1 = l0.k.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    l0.k r1 = l0.k.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f17387a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.d.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, k kVar) {
            super(1);
            this.f17385c = iVar;
            this.f17386d = kVar;
        }

        /* renamed from: a */
        public final Float invoke(l0.k kVar) {
            int i10 = a.f17387a[kVar.ordinal()];
            float f10 = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    l0.m c10 = this.f17385c.b().c();
                    if (c10 != null) {
                        f10 = c10.a();
                    }
                } else if (i10 == 3) {
                    l0.m c11 = this.f17386d.b().c();
                    if (c11 != null) {
                        f10 = c11.a();
                    }
                } else {
                    throw new XH.t();
                }
            }
            return Float.valueOf(f10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Float> f17388c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<Float> f17389d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<androidx.compose.ui.graphics.f> f17390e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(A1<Float> a12, A1<Float> a13, A1<androidx.compose.ui.graphics.f> a14) {
            super(1);
            this.f17388c = a12;
            this.f17389d = a13;
            this.f17390e = a14;
        }

        public final void a(c cVar) {
            A1<Float> a12 = this.f17388c;
            float f10 = 1.0f;
            cVar.d(a12 != null ? a12.getValue().floatValue() : 1.0f);
            A1<Float> a13 = this.f17389d;
            cVar.g(a13 != null ? a13.getValue().floatValue() : 1.0f);
            A1<Float> a14 = this.f17389d;
            if (a14 != null) {
                f10 = a14.getValue().floatValue();
            }
            cVar.m(f10);
            A1<androidx.compose.ui.graphics.f> a15 = this.f17390e;
            cVar.L0(a15 != null ? a15.getValue().j() : androidx.compose.ui.graphics.f.f18947b.a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<v0.b<l0.k>, N<Float>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f17392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar, k kVar) {
            super(1);
            this.f17391c = iVar;
            this.f17392d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
            r3 = r3.a();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final m0.N<java.lang.Float> invoke(m0.v0.b<l0.k> r3) {
            /*
                r2 = this;
                l0.k r0 = l0.k.PreEnter
                l0.k r1 = l0.k.Visible
                boolean r0 = r3.h(r0, r1)
                if (r0 == 0) goto L_0x0021
                androidx.compose.animation.i r3 = r2.f17391c
                l0.A r3 = r3.b()
                l0.t r3 = r3.e()
                if (r3 == 0) goto L_0x001c
                m0.N r3 = r3.a()
                if (r3 != 0) goto L_0x0044
            L_0x001c:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
                goto L_0x0044
            L_0x0021:
                l0.k r0 = l0.k.PostExit
                boolean r3 = r3.h(r1, r0)
                if (r3 == 0) goto L_0x0040
                androidx.compose.animation.k r3 = r2.f17392d
                l0.A r3 = r3.b()
                l0.t r3 = r3.e()
                if (r3 == 0) goto L_0x003b
                m0.N r3 = r3.a()
                if (r3 != 0) goto L_0x0044
            L_0x003b:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
                goto L_0x0044
            L_0x0040:
                m0.o0 r3 = androidx.compose.animation.g.f17375b
            L_0x0044:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.f.invoke(m0.v0$b):m0.N");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "", "a", "(Ll0/k;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.g$g  reason: collision with other inner class name */
    static final class C0242g extends C17544u implements C17642l<l0.k, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f17393c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f17394d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.g$g$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17395a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    l0.k[] r0 = l0.k.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    l0.k r1 = l0.k.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    l0.k r1 = l0.k.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    l0.k r1 = l0.k.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f17395a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.C0242g.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0242g(i iVar, k kVar) {
            super(1);
            this.f17393c = iVar;
            this.f17394d = kVar;
        }

        /* renamed from: a */
        public final Float invoke(l0.k kVar) {
            int i10 = a.f17395a[kVar.ordinal()];
            float f10 = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    l0.t e10 = this.f17393c.b().e();
                    if (e10 != null) {
                        f10 = e10.b();
                    }
                } else if (i10 == 3) {
                    l0.t e11 = this.f17394d.b().e();
                    if (e11 != null) {
                        f10 = e11.b();
                    }
                } else {
                    throw new XH.t();
                }
            }
            return Float.valueOf(f10);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "Ll0/k;", "Lm0/N;", "Landroidx/compose/ui/graphics/f;", "a", "(Lm0/v0$b;)Lm0/N;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<v0.b<l0.k>, N<androidx.compose.ui.graphics.f>> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f17396c = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final N<androidx.compose.ui.graphics.f> invoke(v0.b<l0.k> bVar) {
            return C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/k;", "it", "Landroidx/compose/ui/graphics/f;", "a", "(Ll0/k;)J"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<l0.k, androidx.compose.ui.graphics.f> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.f f17397c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17398d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f17399e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17400a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    l0.k[] r0 = l0.k.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    l0.k r1 = l0.k.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    l0.k r1 = l0.k.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    l0.k r1 = l0.k.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f17400a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.i.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.f fVar, i iVar, k kVar) {
            super(1);
            this.f17397c = fVar;
            this.f17398d = iVar;
            this.f17399e = kVar;
        }

        public final long a(l0.k kVar) {
            androidx.compose.ui.graphics.f fVar;
            int i10 = a.f17400a[kVar.ordinal()];
            if (i10 != 1) {
                fVar = null;
                if (i10 == 2) {
                    l0.t e10 = this.f17398d.b().e();
                    if (!(e10 == null && (e10 = this.f17399e.b().e()) == null)) {
                        fVar = androidx.compose.ui.graphics.f.b(e10.c());
                    }
                } else if (i10 == 3) {
                    l0.t e11 = this.f17399e.b().e();
                    if (!(e11 == null && (e11 = this.f17398d.b().e()) == null)) {
                        fVar = androidx.compose.ui.graphics.f.b(e11.c());
                    }
                } else {
                    throw new XH.t();
                }
            } else {
                fVar = this.f17397c;
            }
            return fVar != null ? fVar.j() : androidx.compose.ui.graphics.f.f18947b.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.f.b(a((l0.k) obj));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f17401c = new j();

        j() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<Boolean> f17403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(boolean z10, C17631a<Boolean> aVar) {
            super(1);
            this.f17402c = z10;
            this.f17403d = aVar;
        }

        public final void a(c cVar) {
            cVar.A(!this.f17402c && this.f17403d.invoke().booleanValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f17404c = new l();

        l() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17405c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17405c = lVar;
        }

        public final long a(long j10) {
            return c2.s.a(this.f17405c.invoke(Integer.valueOf(c2.r.h(j10))).intValue(), c2.r.g(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class n extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f17406c = new n();

        n() {
            super(1);
        }

        public final long a(long j10) {
            return c2.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class o extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f17407c = new o();

        o() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class p extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17408c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17408c = lVar;
        }

        public final long a(long j10) {
            return c2.s.a(c2.r.h(j10), this.f17408c.invoke(Integer.valueOf(c2.r.g(j10))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class q extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f17409c = new q();

        q() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class r extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17410c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17410c = lVar;
        }

        public final long a(long j10) {
            return c2.s.a(this.f17410c.invoke(Integer.valueOf(c2.r.h(j10))).intValue(), c2.r.g(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class s extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        public static final s f17411c = new s();

        s() {
            super(1);
        }

        public final long a(long j10) {
            return c2.s.a(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class t extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final t f17412c = new t();

        t() {
            super(1);
        }

        public final Integer a(int i10) {
            return 0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc2/r;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class u extends C17544u implements C17642l<c2.r, c2.r> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17413c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17413c = lVar;
        }

        public final long a(long j10) {
            return c2.s.a(c2.r.h(j10), this.f17413c.invoke(Integer.valueOf(c2.r.g(j10))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.r.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class v extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final v f17414c = new v();

        v() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "Lc2/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class w extends C17544u implements C17642l<c2.r, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17415c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17415c = lVar;
        }

        public final long a(long j10) {
            return c2.o.a(this.f17415c.invoke(Integer.valueOf(c2.r.h(j10))).intValue(), 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class x extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final x f17416c = new x();

        x() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "Lc2/n;", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class y extends C17544u implements C17642l<c2.r, c2.n> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Integer, Integer> f17417c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(C17642l<? super Integer, Integer> lVar) {
            super(1);
            this.f17417c = lVar;
        }

        public final long a(long j10) {
            return c2.o.a(0, this.f17417c.invoke(Integer.valueOf(c2.r.g(j10))).intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return c2.n.b(a(((c2.r) obj).k()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class z extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final z f17418c = new z();

        z() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static /* synthetic */ k A(N n10, C5437c.C0386c cVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = C5437c.f24302a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = t.f17412c;
        }
        return z(n10, cVar, z10, lVar);
    }

    public static final i B(N<c2.n> n10, C17642l<? super c2.r, c2.n> lVar) {
        return new j(new C5505A((l0.m) null, new l0.w(lVar, n10), (l0.g) null, (l0.t) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }

    public static final i C(N<c2.n> n10, C17642l<? super Integer, Integer> lVar) {
        return B(n10, new w(lVar));
    }

    public static /* synthetic */ i D(N n10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.n.b(P0.c(c2.n.f23044b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = v.f17414c;
        }
        return C(n10, lVar);
    }

    public static final i E(N<c2.n> n10, C17642l<? super Integer, Integer> lVar) {
        return B(n10, new y(lVar));
    }

    public static /* synthetic */ i F(N n10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.n.b(P0.c(c2.n.f23044b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = x.f17416c;
        }
        return E(n10, lVar);
    }

    public static final k G(N<c2.n> n10, C17642l<? super c2.r, c2.n> lVar) {
        return new l(new C5505A((l0.m) null, new l0.w(lVar, n10), (l0.g) null, (l0.t) null, false, (Map) null, 61, (DefaultConstructorMarker) null));
    }

    public static final k H(N<c2.n> n10, C17642l<? super Integer, Integer> lVar) {
        return G(n10, new A(lVar));
    }

    public static /* synthetic */ k I(N n10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.n.b(P0.c(c2.n.f23044b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = z.f17418c;
        }
        return H(n10, lVar);
    }

    public static final k J(N<c2.n> n10, C17642l<? super Integer, Integer> lVar) {
        return G(n10, new C(lVar));
    }

    public static /* synthetic */ k K(N n10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.n.b(P0.c(c2.n.f23044b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            lVar = B.f17379c;
        }
        return J(n10, lVar);
    }

    private static final C5437c L(C5437c.b bVar) {
        C5437c.a aVar = C5437c.f24302a;
        return C17542s.e(bVar, aVar.k()) ? aVar.h() : C17542s.e(bVar, aVar.j()) ? aVar.f() : aVar.e();
    }

    private static final C5437c M(C5437c.C0386c cVar) {
        C5437c.a aVar = C5437c.f24302a;
        return C17542s.e(cVar, aVar.l()) ? aVar.m() : C17542s.e(cVar, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final i N(v0<l0.k> v0Var, i iVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(v0Var)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = u1.e(iVar, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        if (v0Var.i() == v0Var.p() && v0Var.i() == l0.k.Visible) {
            if (v0Var.u()) {
                P(r0Var, iVar);
            } else {
                P(r0Var, i.f17449a.a());
            }
        } else if (v0Var.p() == l0.k.Visible) {
            P(r0Var, O(r0Var).c(iVar));
        }
        i O10 = O(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        return O10;
    }

    private static final i O(C4899r0<i> r0Var) {
        return r0Var.getValue();
    }

    private static final void P(C4899r0<i> r0Var, i iVar) {
        r0Var.setValue(iVar);
    }

    public static final k Q(v0<l0.k> v0Var, k kVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(v0Var)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = u1.e(kVar, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        if (v0Var.i() == v0Var.p() && v0Var.i() == l0.k.Visible) {
            if (v0Var.u()) {
                S(r0Var, kVar);
            } else {
                S(r0Var, k.f17452a.a());
            }
        } else if (v0Var.p() != l0.k.Visible) {
            S(r0Var, R(r0Var).c(kVar));
        }
        k R10 = R(r0Var);
        if (C4895p.J()) {
            C4895p.R();
        }
        return R10;
    }

    private static final k R(C4899r0<k> r0Var) {
        return r0Var.getValue();
    }

    private static final void S(C4899r0<k> r0Var, k kVar) {
        r0Var.setValue(kVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: m0.v0<l0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: l0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: l0.l} */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        if (r7.V(r21) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if (r7.V(r22) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        if (r7.V(r20) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0170, code lost:
        if (r4 == U0.C4889m.f14007a.a()) goto L_0x0172;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final l0.p e(m0.v0<l0.k> r20, androidx.compose.animation.i r21, androidx.compose.animation.k r22, java.lang.String r23, U0.C4889m r24, int r25) {
        /*
            r0 = r23
            r7 = r24
            r8 = r25
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0015
            r1 = -1
            java.lang.String r2 = "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)"
            r3 = 642253525(0x264802d5, float:6.9392777E-16)
            U0.C4895p.S(r3, r8, r1, r2)
        L_0x0015:
            l0.A r1 = r21.b()
            l0.m r1 = r1.c()
            r9 = 1
            r10 = 0
            if (r1 != 0) goto L_0x002e
            l0.A r1 = r22.b()
            l0.m r1 = r1.c()
            if (r1 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = r10
            goto L_0x002f
        L_0x002e:
            r1 = r9
        L_0x002f:
            l0.A r2 = r21.b()
            l0.t r2 = r2.e()
            if (r2 != 0) goto L_0x0046
            l0.A r2 = r22.b()
            l0.t r2 = r2.e()
            if (r2 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r11 = r10
            goto L_0x0047
        L_0x0046:
            r11 = r9
        L_0x0047:
            r12 = 0
            if (r1 == 0) goto L_0x008b
            r1 = -675389204(0xffffffffd7be60ec, float:-4.18646971E14)
            r7.W(r1)
            kotlin.jvm.internal.l r1 = kotlin.jvm.internal.C17536l.f144385a
            m0.z0 r2 = m0.B0.f(r1)
            java.lang.Object r1 = r24.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = " alpha"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.u(r1)
        L_0x0076:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = r8 & 14
            r5 = r1 | 384(0x180, float:5.38E-43)
            r6 = 0
            r1 = r20
            r4 = r24
            m0.v0$a r1 = m0.w0.c(r1, r2, r3, r4, r5, r6)
            r24.P()
            r14 = r1
            goto L_0x0095
        L_0x008b:
            r1 = -675252433(0xffffffffd7c0772f, float:-4.23236244E14)
            r7.W(r1)
            r24.P()
            r14 = r12
        L_0x0095:
            if (r11 == 0) goto L_0x00d7
            r1 = -675193780(0xffffffffd7c15c4c, float:-4.25204312E14)
            r7.W(r1)
            kotlin.jvm.internal.l r1 = kotlin.jvm.internal.C17536l.f144385a
            m0.z0 r1 = m0.B0.f(r1)
            java.lang.Object r2 = r24.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x00c3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " scale"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r7.u(r2)
        L_0x00c3:
            java.lang.String r2 = (java.lang.String) r2
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            r0 = r20
            r3 = r24
            m0.v0$a r0 = m0.w0.c(r0, r1, r2, r3, r4, r5)
            r24.P()
            r15 = r0
            goto L_0x00e1
        L_0x00d7:
            r0 = -675057009(0xffffffffd7c3728f, float:-4.29793586E14)
            r7.W(r0)
            r24.P()
            r15 = r12
        L_0x00e1:
            if (r11 == 0) goto L_0x00fe
            r0 = -674987940(0xffffffffd7c4805c, float:-4.32111157E14)
            r7.W(r0)
            m0.z0<androidx.compose.ui.graphics.f, m0.n> r1 = f17374a
            r0 = r8 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 0
            java.lang.String r2 = "TransformOriginInterruptionHandling"
            r0 = r20
            r3 = r24
            m0.v0$a r12 = m0.w0.c(r0, r1, r2, r3, r4, r5)
            r24.P()
            goto L_0x0107
        L_0x00fe:
            r0 = -674835793(0xffffffffd7c6d2af, float:-4.37216363E14)
            r7.W(r0)
            r24.P()
        L_0x0107:
            boolean r0 = r7.F(r14)
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 32
            if (r1 <= r2) goto L_0x011c
            r1 = r21
            boolean r3 = r7.V(r1)
            if (r3 != 0) goto L_0x0122
            goto L_0x011e
        L_0x011c:
            r1 = r21
        L_0x011e:
            r3 = r8 & 48
            if (r3 != r2) goto L_0x0124
        L_0x0122:
            r2 = r9
            goto L_0x0125
        L_0x0124:
            r2 = r10
        L_0x0125:
            r0 = r0 | r2
            r2 = r8 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 <= r3) goto L_0x0137
            r2 = r22
            boolean r4 = r7.V(r2)
            if (r4 != 0) goto L_0x013d
            goto L_0x0139
        L_0x0137:
            r2 = r22
        L_0x0139:
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != r3) goto L_0x013f
        L_0x013d:
            r3 = r9
            goto L_0x0140
        L_0x013f:
            r3 = r10
        L_0x0140:
            r0 = r0 | r3
            boolean r3 = r7.F(r15)
            r0 = r0 | r3
            r3 = r8 & 14
            r3 = r3 ^ 6
            r4 = 4
            if (r3 <= r4) goto L_0x0156
            r3 = r20
            boolean r5 = r7.V(r3)
            if (r5 != 0) goto L_0x015e
            goto L_0x0158
        L_0x0156:
            r3 = r20
        L_0x0158:
            r5 = r8 & 6
            if (r5 != r4) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r9 = r10
        L_0x015e:
            r0 = r0 | r9
            boolean r4 = r7.F(r12)
            r0 = r0 | r4
            java.lang.Object r4 = r24.D()
            if (r0 != 0) goto L_0x0172
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0183
        L_0x0172:
            l0.l r4 = new l0.l
            r13 = r4
            r16 = r20
            r17 = r21
            r18 = r22
            r19 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.u(r4)
        L_0x0183:
            l0.p r4 = (l0.p) r4
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x018e
            U0.C4895p.R()
        L_0x018e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.e(m0.v0, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, U0.m, int):l0.p");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final nI.C17642l f(m0.v0.a r3, m0.v0.a r4, m0.v0 r5, androidx.compose.animation.i r6, androidx.compose.animation.k r7, m0.v0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0012
            androidx.compose.animation.g$c r1 = new androidx.compose.animation.g$c
            r1.<init>(r6, r7)
            androidx.compose.animation.g$d r2 = new androidx.compose.animation.g$d
            r2.<init>(r6, r7)
            U0.A1 r3 = r3.a(r1, r2)
            goto L_0x0013
        L_0x0012:
            r3 = r0
        L_0x0013:
            if (r4 == 0) goto L_0x0024
            androidx.compose.animation.g$f r1 = new androidx.compose.animation.g$f
            r1.<init>(r6, r7)
            androidx.compose.animation.g$g r2 = new androidx.compose.animation.g$g
            r2.<init>(r6, r7)
            U0.A1 r4 = r4.a(r1, r2)
            goto L_0x0025
        L_0x0024:
            r4 = r0
        L_0x0025:
            java.lang.Object r5 = r5.i()
            l0.k r1 = l0.k.PreEnter
            if (r5 != r1) goto L_0x004d
            l0.A r5 = r6.b()
            l0.t r5 = r5.e()
            if (r5 == 0) goto L_0x0040
        L_0x0037:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L_0x006b
        L_0x0040:
            l0.A r5 = r7.b()
            l0.t r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0037
        L_0x004b:
            r5 = r0
            goto L_0x006b
        L_0x004d:
            l0.A r5 = r7.b()
            l0.t r5 = r5.e()
            if (r5 == 0) goto L_0x0060
        L_0x0057:
            long r1 = r5.c()
            androidx.compose.ui.graphics.f r5 = androidx.compose.ui.graphics.f.b(r1)
            goto L_0x006b
        L_0x0060:
            l0.A r5 = r6.b()
            l0.t r5 = r5.e()
            if (r5 == 0) goto L_0x004b
            goto L_0x0057
        L_0x006b:
            if (r8 == 0) goto L_0x0078
            androidx.compose.animation.g$h r0 = androidx.compose.animation.g.h.f17396c
            androidx.compose.animation.g$i r1 = new androidx.compose.animation.g$i
            r1.<init>(r5, r6, r7)
            U0.A1 r0 = r8.a(r0, r1)
        L_0x0078:
            androidx.compose.animation.g$e r5 = new androidx.compose.animation.g$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.g.f(m0.v0$a, m0.v0$a, m0.v0, androidx.compose.animation.i, androidx.compose.animation.k, m0.v0$a):nI.l");
    }

    public static final androidx.compose.ui.d g(v0<l0.k> v0Var, i iVar, k kVar, C17631a<Boolean> aVar, String str, C4889m mVar, int i10, int i11) {
        v0.a<c2.n, C5556n> aVar2;
        v0.a<c2.r, C5556n> aVar3;
        l0.g a10;
        v0<l0.k> v0Var2 = v0Var;
        String str2 = str;
        C4889m mVar2 = mVar;
        int i12 = i10;
        j jVar = (i11 & 4) != 0 ? j.f17401c : aVar;
        if (C4895p.J()) {
            C4895p.S(28261782, i12, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i13 = i12 & 14;
        i N10 = N(v0Var2, iVar, mVar2, i12 & 126);
        int i14 = i12 >> 3;
        k Q10 = Q(v0Var2, kVar, mVar2, (i14 & 112) | i13);
        boolean z10 = true;
        boolean z11 = (N10.b().f() == null && Q10.b().f() == null) ? false : true;
        boolean z12 = (N10.b().a() == null && Q10.b().a() == null) ? false : true;
        v0.a<c2.n, C5556n> aVar4 = null;
        if (z11) {
            mVar2.W(-821375963);
            z0<c2.n, C5556n> d10 = B0.d(c2.n.f23044b);
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = str2 + " slide";
                mVar2.u(D10);
            }
            v0.a<c2.n, C5556n> c10 = w0.c(v0Var, d10, (String) D10, mVar, i13 | 384, 0);
            mVar.P();
            aVar2 = c10;
        } else {
            mVar2.W(-821278096);
            mVar.P();
            aVar2 = null;
        }
        if (z12) {
            mVar2.W(-821202177);
            z0<c2.r, C5556n> e10 = B0.e(c2.r.f23053b);
            Object D11 = mVar.D();
            if (D11 == C4889m.f14007a.a()) {
                D11 = str2 + " shrink/expand";
                mVar2.u(D11);
            }
            v0.a<c2.r, C5556n> c11 = w0.c(v0Var, e10, (String) D11, mVar, i13 | 384, 0);
            mVar.P();
            aVar3 = c11;
        } else {
            mVar2.W(-821099041);
            mVar.P();
            aVar3 = null;
        }
        if (z12) {
            mVar2.W(-821034002);
            z0<c2.n, C5556n> d11 = B0.d(c2.n.f23044b);
            Object D12 = mVar.D();
            if (D12 == C4889m.f14007a.a()) {
                D12 = str2 + " InterruptionHandlingOffset";
                mVar2.u(D12);
            }
            v0.a<c2.n, C5556n> c12 = w0.c(v0Var, d11, (String) D12, mVar, i13 | 384, 0);
            mVar.P();
            aVar4 = c12;
        } else {
            mVar2.W(-820883777);
            mVar.P();
        }
        l0.g a11 = N10.b().a();
        boolean z13 = (a11 != null && !a11.c()) || ((a10 = Q10.b().a()) != null && !a10.c()) || !z12;
        l0.p e11 = e(v0Var, N10, Q10, str, mVar, i13 | (i14 & 7168));
        d.a aVar5 = androidx.compose.ui.d.f18749a;
        boolean b10 = mVar2.b(z13);
        if ((((i12 & 7168) ^ 3072) <= 2048 || !mVar2.V(jVar)) && (i12 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = b10 | z10;
        Object D13 = mVar.D();
        if (z14 || D13 == C4889m.f14007a.a()) {
            D13 = new k(z13, jVar);
            mVar2.u(D13);
        }
        androidx.compose.ui.d s10 = b.a(aVar5, (C17642l) D13).s(new EnterExitTransitionElement(v0Var, aVar3, aVar4, aVar2, N10, Q10, jVar, e11));
        if (C4895p.J()) {
            C4895p.R();
        }
        return s10;
    }

    public static final i h(N<c2.r> n10, C5437c.b bVar, boolean z10, C17642l<? super Integer, Integer> lVar) {
        return j(n10, L(bVar), z10, new m(lVar));
    }

    public static /* synthetic */ i i(N n10, C5437c.b bVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            bVar = C5437c.f24302a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = l.f17404c;
        }
        return h(n10, bVar, z10, lVar);
    }

    public static final i j(N<c2.r> n10, C5437c cVar, boolean z10, C17642l<? super c2.r, c2.r> lVar) {
        return new j(new C5505A((l0.m) null, (l0.w) null, new l0.g(cVar, lVar, n10, z10), (l0.t) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i k(N n10, C5437c cVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = C5437c.f24302a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = n.f17406c;
        }
        return j(n10, cVar, z10, lVar);
    }

    public static final i l(N<c2.r> n10, C5437c.C0386c cVar, boolean z10, C17642l<? super Integer, Integer> lVar) {
        return j(n10, M(cVar), z10, new p(lVar));
    }

    public static /* synthetic */ i m(N n10, C5437c.C0386c cVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = C5437c.f24302a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = o.f17407c;
        }
        return l(n10, cVar, z10, lVar);
    }

    public static final i n(N<Float> n10, float f10) {
        return new j(new C5505A(new l0.m(f10, n10), (l0.w) null, (l0.g) null, (l0.t) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i o(N n10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(n10, f10);
    }

    public static final k p(N<Float> n10, float f10) {
        return new l(new C5505A(new l0.m(f10, n10), (l0.w) null, (l0.g) null, (l0.t) null, false, (Map) null, 62, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ k q(N n10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return p(n10, f10);
    }

    public static final i r(N<Float> n10, float f10, long j10) {
        return new j(new C5505A((l0.m) null, (l0.w) null, (l0.g) null, new l0.t(f10, j10, n10, (DefaultConstructorMarker) null), false, (Map) null, 55, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ i s(N n10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.f.f18947b.a();
        }
        return r(n10, f10, j10);
    }

    public static final k t(N<Float> n10, float f10, long j10) {
        return new l(new C5505A((l0.m) null, (l0.w) null, (l0.g) null, new l0.t(f10, j10, n10, (DefaultConstructorMarker) null), false, (Map) null, 55, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ k u(N n10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.f.f18947b.a();
        }
        return t(n10, f10, j10);
    }

    public static final k v(N<c2.r> n10, C5437c.b bVar, boolean z10, C17642l<? super Integer, Integer> lVar) {
        return x(n10, L(bVar), z10, new r(lVar));
    }

    public static /* synthetic */ k w(N n10, C5437c.b bVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            bVar = C5437c.f24302a.j();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = q.f17409c;
        }
        return v(n10, bVar, z10, lVar);
    }

    public static final k x(N<c2.r> n10, C5437c cVar, boolean z10, C17642l<? super c2.r, c2.r> lVar) {
        return new l(new C5505A((l0.m) null, (l0.w) null, new l0.g(cVar, lVar, n10, z10), (l0.t) null, false, (Map) null, 59, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ k y(N n10, C5437c cVar, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n10 = C5548j.h(0.0f, 400.0f, c2.r.b(P0.d(c2.r.f23053b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            cVar = C5437c.f24302a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = s.f17411c;
        }
        return x(n10, cVar, z10, lVar);
    }

    public static final k z(N<c2.r> n10, C5437c.C0386c cVar, boolean z10, C17642l<? super Integer, Integer> lVar) {
        return x(n10, M(cVar), z10, new u(lVar));
    }
}
