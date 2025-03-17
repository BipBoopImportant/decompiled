package a9;

import G8.f;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.o  reason: case insensitive filesystem */
public final class C6893o extends H3<RecyclerView> {

    /* renamed from: g  reason: collision with root package name */
    public final b f42744g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    public int f42745h;

    /* renamed from: i  reason: collision with root package name */
    public int f42746i;

    /* renamed from: a9.o$a */
    public static final class a extends C17544u implements C17642l<RecyclerView, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C6893o f42747c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6893o oVar) {
            super(1);
            this.f42747c = oVar;
        }

        public final Object invoke(Object obj) {
            RecyclerView recyclerView = (RecyclerView) obj;
            C17542s.j(recyclerView, "$this$forView");
            recyclerView.n1(this.f42747c.f42744g);
            return C16807N.f139792a;
        }
    }

    /* renamed from: a9.o$b */
    public static final class b extends RecyclerView.v {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C6893o f42748a;

        public b(C6893o oVar) {
            this.f42748a = oVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            C17542s.j(recyclerView, "recyclerView");
            C6893o oVar = this.f42748a;
            oVar.f42745h += i10;
            oVar.f42746i += i11;
            oVar.b(new B3(oVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6893o(RecyclerView recyclerView, f fVar) {
        super(recyclerView, fVar);
        C17542s.j(recyclerView, "recyclerView");
        C17542s.j(fVar, "debouncer");
        recyclerView.post(new C6885n(recyclerView, this));
    }

    public static final void d(RecyclerView recyclerView, C6893o oVar) {
        C17542s.j(recyclerView, "$recyclerView");
        C17542s.j(oVar, "this$0");
        recyclerView.n(oVar.f42744g);
        oVar.b(new B3(oVar));
    }

    public final int a() {
        return this.f42745h;
    }

    public final int c() {
        return this.f42746i;
    }

    public final void clear() {
        b(new a(this));
    }
}
