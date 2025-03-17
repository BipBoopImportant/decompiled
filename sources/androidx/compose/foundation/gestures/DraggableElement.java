package androidx.compose.foundation.gestures;

import A1.B;
import G1.V;
import QJ.Q;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import o1.C5667g;
import p0.r;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010'R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010'¨\u00061"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LG1/V;", "Landroidx/compose/foundation/gestures/e;", "Lp0/r;", "state", "Lp0/v;", "orientation", "", "enabled", "Lr0/m;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LQJ/Q;", "Lo1/g;", "LdI/e;", "LXH/N;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lp0/r;Lp0/v;ZLr0/m;ZLnI/q;LnI/q;Z)V", "c", "()Landroidx/compose/foundation/gestures/e;", "node", "f", "(Landroidx/compose/foundation/gestures/e;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lp0/r;", "e", "Lp0/v;", "Z", "g", "Lr0/m;", "h", "i", "LnI/q;", "j", "k", "l", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DraggableElement extends V<e> {

    /* renamed from: l  reason: collision with root package name */
    public static final b f17648l = new b((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private static final C17642l<B, Boolean> f17649m = a.f17658c;

    /* renamed from: d  reason: collision with root package name */
    private final r f17650d;

    /* renamed from: e  reason: collision with root package name */
    private final v f17651e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f17652f;

    /* renamed from: g  reason: collision with root package name */
    private final m f17653g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17654h;

    /* renamed from: i  reason: collision with root package name */
    private final q<Q, C5667g, C17164e<? super C16807N>, Object> f17655i;

    /* renamed from: j  reason: collision with root package name */
    private final q<Q, Float, C17164e<? super C16807N>, Object> f17656j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f17657k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "it", "", "a", "(LA1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<B, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f17658c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(B b10) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public DraggableElement(r rVar, v vVar, boolean z10, m mVar, boolean z11, q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> qVar, q<? super Q, ? super Float, ? super C17164e<? super C16807N>, ? extends Object> qVar2, boolean z12) {
        this.f17650d = rVar;
        this.f17651e = vVar;
        this.f17652f = z10;
        this.f17653g = mVar;
        this.f17654h = z11;
        this.f17655i = qVar;
        this.f17656j = qVar2;
        this.f17657k = z12;
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f17650d, f17649m, this.f17651e, this.f17652f, this.f17653g, this.f17654h, this.f17655i, this.f17656j, this.f17657k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return C17542s.e(this.f17650d, draggableElement.f17650d) && this.f17651e == draggableElement.f17651e && this.f17652f == draggableElement.f17652f && C17542s.e(this.f17653g, draggableElement.f17653g) && this.f17654h == draggableElement.f17654h && C17542s.e(this.f17655i, draggableElement.f17655i) && C17542s.e(this.f17656j, draggableElement.f17656j) && this.f17657k == draggableElement.f17657k;
    }

    /* renamed from: f */
    public void b(e eVar) {
        eVar.l3(this.f17650d, f17649m, this.f17651e, this.f17652f, this.f17653g, this.f17654h, this.f17655i, this.f17656j, this.f17657k);
    }

    public int hashCode() {
        int hashCode = ((((this.f17650d.hashCode() * 31) + this.f17651e.hashCode()) * 31) + Boolean.hashCode(this.f17652f)) * 31;
        m mVar = this.f17653g;
        return ((((((((hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17654h)) * 31) + this.f17655i.hashCode()) * 31) + this.f17656j.hashCode()) * 31) + Boolean.hashCode(this.f17657k);
    }
}
