package vA;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oA.C14867a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"LvA/c;", "", "LvA/b;", "selected", "LKJ/c;", "modes", "LIC/e;", "screenTitle", "", "navigateBack", "<init>", "(LvA/b;LKJ/c;LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LvA/b;", "d", "()LvA/b;", "b", "LKJ/c;", "()LKJ/c;", "c", "LIC/e;", "()LIC/e;", "Z", "()Z", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vA.c  reason: case insensitive filesystem */
public final class C15126c {

    /* renamed from: e  reason: collision with root package name */
    public static final int f131405e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C15125b f131406a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<C15125b> f131407b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f131408c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f131409d;

    public C15126c(C15125b bVar, C15987c<? extends C15125b> cVar, C13023e eVar, boolean z10) {
        C17542s.j(bVar, "selected");
        C17542s.j(cVar, "modes");
        C17542s.j(eVar, "screenTitle");
        this.f131406a = bVar;
        this.f131407b = cVar;
        this.f131408c = eVar;
        this.f131409d = z10;
    }

    public final C15987c<C15125b> a() {
        return this.f131407b;
    }

    public final boolean b() {
        return this.f131409d;
    }

    public final C13023e c() {
        return this.f131408c;
    }

    public final C15125b d() {
        return this.f131406a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15126c)) {
            return false;
        }
        C15126c cVar = (C15126c) obj;
        return this.f131406a == cVar.f131406a && C17542s.e(this.f131407b, cVar.f131407b) && C17542s.e(this.f131408c, cVar.f131408c) && this.f131409d == cVar.f131409d;
    }

    public int hashCode() {
        return (((((this.f131406a.hashCode() * 31) + this.f131407b.hashCode()) * 31) + this.f131408c.hashCode()) * 31) + Boolean.hashCode(this.f131409d);
    }

    public String toString() {
        C15125b bVar = this.f131406a;
        C15987c<C15125b> cVar = this.f131407b;
        C13023e eVar = this.f131408c;
        boolean z10 = this.f131409d;
        return "UiState(selected=" + bVar + ", modes=" + cVar + ", screenTitle=" + eVar + ", navigateBack=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15126c(C15125b bVar, C15987c<T> cVar, C13023e eVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? C15985a.h(C15125b.j()) : cVar, (i10 & 4) != 0 ? C13026h.a(C14867a.f129971e) : eVar, (i10 & 8) != 0 ? false : z10);
    }
}
