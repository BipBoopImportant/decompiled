package S1;

import U0.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0002\t\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"LS1/Y;", "LU0/A1;", "", "", "f", "()Z", "cacheable", "a", "b", "LS1/Y$a;", "LS1/Y$b;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Y extends A1<Object> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LS1/Y$a;", "LS1/Y;", "LU0/A1;", "", "LS1/h;", "current", "<init>", "(LS1/h;)V", "a", "LS1/h;", "getCurrent$ui_text_release", "()LS1/h;", "getValue", "()Ljava/lang/Object;", "value", "", "f", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Y, A1<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final C4815h f13364a;

        public a(C4815h hVar) {
            this.f13364a = hVar;
        }

        public boolean f() {
            return this.f13364a.i();
        }

        public Object getValue() {
            return this.f13364a.getValue();
        }
    }

    boolean f();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LS1/Y$b;", "LS1/Y;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "b", "Z", "f", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Y {

        /* renamed from: a  reason: collision with root package name */
        private final Object f13365a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13366b;

        public b(Object obj, boolean z10) {
            this.f13365a = obj;
            this.f13366b = z10;
        }

        public boolean f() {
            return this.f13366b;
        }

        public Object getValue() {
            return this.f13365a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
