package androidx.work;

import androidx.work.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0002\u0007\bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/work/B;", "Landroidx/work/T;", "Landroidx/work/B$a;", "builder", "<init>", "(Landroidx/work/B$a;)V", "e", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B extends T {

    /* renamed from: e  reason: collision with root package name */
    public static final b f45055e = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008PX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/work/B$a;", "Landroidx/work/T$a;", "Landroidx/work/B;", "Ljava/lang/Class;", "Landroidx/work/x;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "o", "()Landroidx/work/B;", "p", "()Landroidx/work/B$a;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends T.a<a, B> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<? extends C7054x> cls) {
            super(cls);
            C17542s.j(cls, "workerClass");
        }

        /* renamed from: o */
        public B c() {
            if (!d() || !h().f55919j.j()) {
                return new B(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: p */
        public a g() {
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/work/B$b;", "", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/work/x;", "workerClass", "Landroidx/work/B;", "a", "(Ljava/lang/Class;)Landroidx/work/B;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B a(Class<? extends C7054x> cls) {
            C17542s.j(cls, "workerClass");
            return (B) new a(cls).b();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        C17542s.j(aVar, "builder");
    }

    public static final B e(Class<? extends C7054x> cls) {
        return f45055e.a(cls);
    }
}
