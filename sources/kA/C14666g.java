package kA;

import XH.C16796C;
import YC.C13857b;
import YC.C13860e;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LkA/g;", "LkA/f;", "Lup/d;", "dataConsent", "LGo/a;", "clientIdentityProvider", "LYC/b;", "uiMode", "<init>", "(Lup/d;LGo/a;LYC/b;)V", "", "", "a", "()Ljava/util/Map;", "Lup/d;", "b", "LGo/a;", "c", "LYC/b;", "d", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kA.g  reason: case insensitive filesystem */
public final class C14666g implements C14665f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f128572d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f128573e = "episodId";

    /* renamed from: a  reason: collision with root package name */
    private final C12074d f128574a;

    /* renamed from: b  reason: collision with root package name */
    private final Go.a f128575b;

    /* renamed from: c  reason: collision with root package name */
    private final C13857b f128576c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkA/g$a;", "", "<init>", "()V", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kA.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14666g(C12074d dVar, Go.a aVar, C13857b bVar) {
        C17542s.j(dVar, "dataConsent");
        C17542s.j(aVar, "clientIdentityProvider");
        C17542s.j(bVar, "uiMode");
        this.f128574a = dVar;
        this.f128575b = aVar;
        this.f128576c = bVar;
    }

    public Map<String, String> a() {
        return X.s((this.f128574a.b(C12071a.b.f103980e) || this.f128574a.b(C12071a.c.f103981e) || this.f128574a.b(C12071a.d.f103982e)) ? X.f(C16796C.a(f128573e, this.f128575b.c())) : X.j(), C13857b.a.b(this.f128576c, (C13860e) null, 1, (Object) null));
    }
}
