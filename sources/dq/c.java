package Dq;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import pH.C17746a;
import pH.C17747b;
import pH.C17749d;
import uq.C12079e;
import uq.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDq/c;", "", "Luq/e;", "config", "Luq/h;", "episodLogger", "<init>", "(Luq/e;Luq/h;)V", "LpH/a;", "c", "()LpH/a;", "a", "Luq/e;", "b", "Luq/h;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12079e f80142a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f80143b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LpH/b;", "LXH/N;", "a", "(LpH/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<C17747b<?>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f80144c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f80144c = cVar;
        }

        public final void a(C17747b<?> bVar) {
            C17542s.j(bVar, "$this$HttpClient");
            d.a(bVar, this.f80144c.f80143b, this.f80144c.f80142a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17747b) obj);
            return C16807N.f139792a;
        }
    }

    public c(C12079e eVar, h hVar) {
        C17542s.j(eVar, "config");
        C17542s.j(hVar, "episodLogger");
        this.f80142a = eVar;
        this.f80143b = hVar;
    }

    public final C17746a c() {
        return C17749d.a(new a(this));
    }
}
