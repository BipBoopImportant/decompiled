package Rn;

import GK.z;
import L6.b;
import Ve.b;
import java.util.Arrays;
import java.util.Locale;
import jm.C11429a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import tw.h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\fB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"LRn/a;", "LRn/d;", "Ljm/a;", "backendUrls", "Ltw/h;", "networkService", "<init>", "(Ljm/a;Ltw/h;)V", "", "retailCode", "languageCode", "LVe/b;", "a", "(Ljava/lang/String;Ljava/lang/String;)LVe/b;", "Ljm/a;", "LGK/z;", "b", "LGK/z;", "okHttpClient", "c", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final C1793a f86593c = new C1793a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C11429a f86594a;

    /* renamed from: b  reason: collision with root package name */
    private final z f86595b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRn/a$a;", "", "<init>", "()V", "", "CHECKOUT_PATH", "Ljava/lang/String;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rn.a$a  reason: collision with other inner class name */
    public static final class C1793a {
        public /* synthetic */ C1793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1793a() {
        }
    }

    public a(C11429a aVar, h hVar) {
        C17542s.j(aVar, "backendUrls");
        C17542s.j(hVar, "networkService");
        this.f86594a = aVar;
        this.f86595b = hVar.a().H().c();
    }

    public b a(String str, String str2) {
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "languageCode");
        V v10 = V.f144353a;
        String format = String.format(Locale.US, "/checkout/v6/%s/%s/graphql", Arrays.copyOf(new Object[]{str, str2}, 2));
        C17542s.i(format, "format(...)");
        b.a aVar = new b.a();
        String a10 = this.f86594a.a();
        return new Ve.a(W6.b.a(aVar.j(a10 + format), this.f86595b).a());
    }
}
