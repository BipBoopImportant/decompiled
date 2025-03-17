package x0;

import U0.C4899r0;
import U0.o1;
import YH.C16877v;
import f1.C5299a;
import f1.C5309k;
import f1.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lx0/b;", "Lx0/C;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLnI/a;)V", "LU0/r0;", "K", "LU0/r0;", "p0", "()LU0/r0;", "setPageCountState", "(LU0/r0;)V", "pageCountState", "G", "()I", "pageCount", "L", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x0.b  reason: case insensitive filesystem */
final class C6234b extends C6230C {

    /* renamed from: L  reason: collision with root package name */
    public static final c f31643L = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public static final C5309k<C6234b, ?> f31644M = C5299a.a(a.f31646c, C0486b.f31647c);

    /* renamed from: K  reason: collision with root package name */
    private C4899r0<C17631a<Integer>> f31645K;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf1/m;", "Lx0/b;", "it", "", "", "a", "(Lf1/m;Lx0/b;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.b$a */
    static final class a extends C17544u implements p<m, C6234b, List<? extends Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f31646c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final List<Object> invoke(m mVar, C6234b bVar) {
            return C16877v.q(Integer.valueOf(bVar.v()), Float.valueOf(C17978n.l(bVar.w(), -0.5f, 0.5f)), Integer.valueOf(bVar.G()));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lx0/b;", "a", "(Ljava/util/List;)Lx0/b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x0.b$b  reason: collision with other inner class name */
    static final class C0486b extends C17544u implements C17642l<List, C6234b> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0486b f31647c = new C0486b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x0.b$b$a */
        static final class a extends C17544u implements C17631a<Integer> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<Object> f31648c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<? extends Object> list) {
                super(0);
                this.f31648c = list;
            }

            /* renamed from: b */
            public final Integer invoke() {
                Object obj = this.f31648c.get(2);
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C0486b() {
            super(1);
        }

        /* renamed from: a */
        public final C6234b invoke(List<? extends Object> list) {
            Object obj = list.get(0);
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C6234b(intValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx0/b$c;", "", "<init>", "()V", "Lf1/k;", "Lx0/b;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x0.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<C6234b, ?> a() {
            return C6234b.f31644M;
        }

        private c() {
        }
    }

    public C6234b(int i10, float f10, C17631a<Integer> aVar) {
        super(i10, f10);
        this.f31645K = u1.e(aVar, (o1) null, 2, (Object) null);
    }

    public int G() {
        return ((Number) this.f31645K.getValue().invoke()).intValue();
    }

    public final C4899r0<C17631a<Integer>> p0() {
        return this.f31645K;
    }
}
