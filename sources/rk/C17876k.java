package rK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5674n;
import pK.C17757b;
import pK.C17758c;
import pK.C17759d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"LrK/k;", "", "LE1/h0;", "oldFinalZoom", "Lo1/g;", "oldContentOffsetAtViewportCenter", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LpK/d;", "inputs", "Lkotlin/Function2;", "LpK/b;", "Lme/saket/telephoto/zoomable/a;", "coerceWithinBounds", "LpK/c;", "a", "(LpK/d;LnI/p;)LpK/c;", "J", "b", "c", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.k  reason: case insensitive filesystem */
public final class C17876k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f146774c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f146775a;

    /* renamed from: b  reason: collision with root package name */
    private final long f146776b;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LrK/k$a;", "", "<init>", "()V", "LpK/d;", "gestureStateInputs", "LpK/c;", "savedGestureState", "Lo1/m;", "viewportSize", "Lo1/g;", "a", "(LpK/d;LpK/c;J)J", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rK.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(C17759d dVar, C17758c cVar, long j10) {
            C17542s.j(dVar, "gestureStateInputs");
            C17542s.j(cVar, "savedGestureState");
            return C17868c.f146744a.a(C5674n.b(j10), dVar.e(), u.f146802h.a(dVar, cVar));
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo1/g;", "anchorInViewportSpace", "a", "(J)J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rK.k$b */
    static final class b extends C17544u implements C17642l<C5667g, C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17759d f146777c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17759d dVar) {
            super(1);
            this.f146777c = dVar;
        }

        public final long a(long j10) {
            return C5667g.q(j10, C5674n.b(this.f146777c.f()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5667g.d(a(((C5667g) obj).v()));
        }
    }

    public /* synthetic */ C17876k(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final C17758c a(C17759d dVar, p<? super C17757b, ? super me.saket.telephoto.zoomable.a, C17757b> pVar) {
        C17542s.j(dVar, "inputs");
        C17542s.j(pVar, "coerceWithinBounds");
        me.saket.telephoto.zoomable.a b10 = me.saket.telephoto.zoomable.a.f144586c.b(dVar.b(), this.f146775a);
        return new C17758c(pVar.invoke(C17757b.f146362c.a(dVar.a(), C17871f.y(this.f146776b, b10.f(), new b(dVar))), b10).d(), b10.g(), C5674n.b(dVar.f()), (DefaultConstructorMarker) null);
    }

    private C17876k(long j10, long j11) {
        this.f146775a = j10;
        this.f146776b = j11;
    }
}
