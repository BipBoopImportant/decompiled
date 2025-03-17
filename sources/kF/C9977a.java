package kf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0007B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lkf/a;", "", "", "title", "description", "<init>", "(II)V", "a", "I", "b", "()I", "Lkf/a$a;", "Lkf/a$b;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kf.a  reason: case insensitive filesystem */
public abstract class C9977a {

    /* renamed from: a  reason: collision with root package name */
    private final int f75065a;

    /* renamed from: b  reason: collision with root package name */
    private final int f75066b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkf/a$a;", "Lkf/a;", "<init>", "()V", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kf.a$a  reason: collision with other inner class name */
    public static final class C1360a extends C9977a {

        /* renamed from: c  reason: collision with root package name */
        public static final C1360a f75067c = new C1360a();

        private C1360a() {
            super(Oo.b.f84370F2, Oo.b.f84360E2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkf/a$b;", "Lkf/a;", "<init>", "()V", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kf.a$b */
    public static final class b extends C9977a {

        /* renamed from: c  reason: collision with root package name */
        public static final b f75068c = new b();

        private b() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C9977a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int a() {
        return this.f75066b;
    }

    public final int b() {
        return this.f75065a;
    }

    private C9977a(int i10, int i11) {
        this.f75065a = i10;
        this.f75066b = i11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9977a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Oo.b.f84526U8 : i10, (i12 & 2) != 0 ? Oo.b.f84822w2 : i11, (DefaultConstructorMarker) null);
    }
}
