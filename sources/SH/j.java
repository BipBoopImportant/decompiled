package sH;

import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"LsH/j;", "LdI/i$b;", "LdI/i;", "callContext", "<init>", "(LdI/i;)V", "a", "LdI/i;", "()LdI/i;", "LdI/i$c;", "getKey", "()LdI/i$c;", "key", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements C17168i.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f146996b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f146997a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LsH/j$a;", "LdI/i$c;", "LsH/j;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C17168i.c<j> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(C17168i iVar) {
        C17542s.j(iVar, "callContext");
        this.f146997a = iVar;
    }

    public final C17168i a() {
        return this.f146997a;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C17168i.b.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C17168i.b.a.b(this, cVar);
    }

    public C17168i.c<?> getKey() {
        return f146996b;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17168i.b.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C17168i.b.a.d(this, iVar);
    }
}
