package G1;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LG1/j0;", "LG1/n0;", "LG1/h0;", "observerNode", "<init>", "(LG1/h0;)V", "a", "LG1/h0;", "b", "()LG1/h0;", "", "f1", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j0 implements n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f6538b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f6539c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C17642l<j0, C16807N> f6540d = a.f6542c;

    /* renamed from: a  reason: collision with root package name */
    private final h0 f6541a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/j0;", "it", "LXH/N;", "a", "(LG1/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<j0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6542c = new a();

        a() {
            super(1);
        }

        public final void a(j0 j0Var) {
            if (j0Var.f1()) {
                j0Var.b().H0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LG1/j0$b;", "", "<init>", "()V", "Lkotlin/Function1;", "LG1/j0;", "LXH/N;", "OnObserveReadsChanged", "LnI/l;", "a", "()LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17642l<j0, C16807N> a() {
            return j0.f6540d;
        }

        private b() {
        }
    }

    public j0(h0 h0Var) {
        this.f6541a = h0Var;
    }

    public final h0 b() {
        return this.f6541a;
    }

    public boolean f1() {
        return this.f6541a.E0().j2();
    }
}
