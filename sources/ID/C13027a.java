package ID;

import HJ.C15854t;
import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"LID/a;", "LZl/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "c", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ID.a  reason: case insensitive filesystem */
public final class C13027a implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2679a f110947c = new C2679a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f110948d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final UriMatcher f110949b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LID/a$a;", "", "<init>", "()V", "", "FAMILY_CARD", "I", "WALLET_OPEN", "WALLET_ADD", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ID.a$a  reason: collision with other inner class name */
    public static final class C2679a {
        public /* synthetic */ C2679a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2679a() {
        }
    }

    public C13027a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/profile/familycard", 1);
        uriMatcher.addURI("membership", "wallet/open", 2);
        uriMatcher.addURI("membership", "wallet/add", 3);
        this.f110949b = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f110949b, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        int match = this.f110949b.match(uri);
        if (match == 1) {
            return C13028b.f110950a.a();
        }
        if (match == 2) {
            return C13028b.f110950a.c();
        }
        if (match != 3) {
            return a.C1929a.b(a.f89961a, (Integer) null, uri.toString(), 1, (Object) null);
        }
        String queryParameter = uri.getQueryParameter("redemptionCode");
        if (queryParameter != null) {
            return C13028b.f110950a.b(queryParameter);
        }
        e eVar2 = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Request to redeem card to wallet was made without redemption code", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            if (str2 == null) {
                String name = C13027a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str3 = str2;
            bVar.a(eVar2, str3, false, (Throwable) null, str);
            str2 = str3;
        }
        return C13028b.f110950a.c();
    }
}
