package androidx.compose.ui.input.nestedscroll;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import z1.C6271a;
import z1.C6272b;
import z1.C6273c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LG1/V;", "Lz1/c;", "Lz1/a;", "connection", "Lz1/b;", "dispatcher", "<init>", "(Lz1/a;Lz1/b;)V", "c", "()Lz1/c;", "node", "LXH/N;", "f", "(Lz1/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lz1/a;", "getConnection", "()Lz1/a;", "e", "Lz1/b;", "getDispatcher", "()Lz1/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class NestedScrollElement extends V<C6273c> {

    /* renamed from: d  reason: collision with root package name */
    private final C6271a f18972d;

    /* renamed from: e  reason: collision with root package name */
    private final C6272b f18973e;

    public NestedScrollElement(C6271a aVar, C6272b bVar) {
        this.f18972d = aVar;
        this.f18973e = bVar;
    }

    /* renamed from: c */
    public C6273c a() {
        return new C6273c(this.f18972d, this.f18973e);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return C17542s.e(nestedScrollElement.f18972d, this.f18972d) && C17542s.e(nestedScrollElement.f18973e, this.f18973e);
    }

    /* renamed from: f */
    public void b(C6273c cVar) {
        cVar.J2(this.f18972d, this.f18973e);
    }

    public int hashCode() {
        int hashCode = this.f18972d.hashCode() * 31;
        C6272b bVar = this.f18973e;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
