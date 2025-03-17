package Hp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0007B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0001\u0001\u000b¨\u0006\f"}, d2 = {"LHp/b;", "", "", "title", "description", "<init>", "(II)V", "a", "I", "b", "()I", "LHp/b$a;", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f81666a;

    /* renamed from: b  reason: collision with root package name */
    private final int f81667b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/b$a;", "LHp/b;", "<init>", "()V", "dataethics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public static final a f81668c = new a();

        private a() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int a() {
        return this.f81667b;
    }

    public final int b() {
        return this.f81666a;
    }

    private b(int i10, int i11) {
        this.f81666a = i10;
        this.f81667b = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Oo.b.f84526U8 : i10, (i12 & 2) != 0 ? Oo.b.f84822w2 : i11, (DefaultConstructorMarker) null);
    }
}
