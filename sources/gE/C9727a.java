package ge;

import Sd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u000f\b\n\u000eB\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\rR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lge/a;", "", "", "title", "", "generalSetting", "<init>", "(IZ)V", "a", "I", "b", "()I", "Z", "()Z", "c", "d", "(Z)V", "isEnabled", "Lge/a$a;", "Lge/a$b;", "Lge/a$c;", "Lge/a$d;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ge.a  reason: case insensitive filesystem */
public abstract class C9727a {

    /* renamed from: a  reason: collision with root package name */
    private final int f73058a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f73059b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73060c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/a$a;", "Lge/a;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.a$a  reason: collision with other inner class name */
    public static final class C1272a extends C9727a {
        public C1272a() {
            super(f.f63383w, false, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/a$b;", "Lge/a;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.a$b */
    public static final class b extends C9727a {
        public b() {
            super(f.f63384x, false, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/a$c;", "Lge/a;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.a$c */
    public static final class c extends C9727a {
        public c() {
            super(f.f63370j, false, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/a$d;", "Lge/a;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.a$d */
    public static final class d extends C9727a {
        public d() {
            super(f.f63385y, false, 2, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C9727a(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final boolean a() {
        return this.f73059b;
    }

    public final int b() {
        return this.f73058a;
    }

    public final boolean c() {
        return this.f73060c;
    }

    public final void d(boolean z10) {
        this.f73060c = z10;
    }

    private C9727a(int i10, boolean z10) {
        this.f73058a = i10;
        this.f73059b = z10;
        this.f73060c = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9727a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10, (DefaultConstructorMarker) null);
    }
}
