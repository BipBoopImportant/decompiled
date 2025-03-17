package kA;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.C8742a;
import t7.C8836a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LkA/b;", "LkA/a;", "<init>", "()V", "", "clientId", "domain", "Ls7/a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ls7/a;", "auth", "Lt7/a;", "a", "(Ls7/a;)Lt7/a;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kA.b  reason: case insensitive filesystem */
public final class C14661b implements C14660a {
    public C8836a a(C8742a aVar) {
        C17542s.j(aVar, "auth");
        return new C8836a(aVar);
    }

    public C8742a b(String str, String str2) {
        C17542s.j(str, "clientId");
        C17542s.j(str2, "domain");
        return new C8742a(str, str2, (String) null, 4, (DefaultConstructorMarker) null);
    }
}
