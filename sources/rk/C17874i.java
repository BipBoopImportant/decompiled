package rK;

import TJ.C16533h;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import androidx.compose.ui.focus.m;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"LrK/i;", "", "<init>", "()V", "LXH/N;", "f", "(LdI/e;)Ljava/lang/Object;", "", "<set-?>", "a", "LU0/r0;", "c", "()Z", "e", "(Z)V", "isParentFocused", "b", "d", "isChildFocused", "Landroidx/compose/ui/focus/m;", "Landroidx/compose/ui/focus/m;", "()Landroidx/compose/ui/focus/m;", "childFocusRequester", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.i  reason: case insensitive filesystem */
public final class C17874i {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f146765a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f146766b;

    /* renamed from: c  reason: collision with root package name */
    private final m f146767c = new m();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rK.i$a */
    static final class a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17874i f146768c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17874i iVar) {
            super(0);
            this.f146768c = iVar;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(this.f146768c.c());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "c", "(ZLdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: rK.i$b */
    static final class b<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17874i f146769a;

        b(C17874i iVar) {
            this.f146769a = iVar;
        }

        public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
            if (this.f146769a.c()) {
                this.f146769a.a().f();
            }
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
            return c(((Boolean) obj).booleanValue(), eVar);
        }
    }

    public C17874i() {
        Boolean bool = Boolean.FALSE;
        this.f146765a = u1.e(bool, (o1) null, 2, (Object) null);
        this.f146766b = u1.e(bool, (o1) null, 2, (Object) null);
    }

    public final m a() {
        return this.f146767c;
    }

    public final boolean b() {
        return ((Boolean) this.f146766b.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f146765a.getValue()).booleanValue();
    }

    public final void d(boolean z10) {
        this.f146766b.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f146765a.setValue(Boolean.valueOf(z10));
    }

    public final Object f(C17164e<? super C16807N> eVar) {
        Object collect = p1.r(new a(this)).collect(new b(this), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }
}
