package com.ingka.ikea.app.sharedlist.impl.navigation;

import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/sharedlist/impl/navigation/a;", "LZl/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "c", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2048a f92348c = new C2048a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f92349d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final UriMatcher f92350b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/sharedlist/impl/navigation/a$a;", "", "<init>", "()V", "", "LEGACY_MATCH", "I", "MATCH", "", "listId", "Ljava/lang/String;", "sharedListPath", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.sharedlist.impl.navigation.a$a  reason: collision with other inner class name */
    public static final class C2048a {
        public /* synthetic */ C2048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2048a() {
        }
    }

    public a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("sharedlist", "/*", 1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/sharedlist", 2);
        this.f92350b = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f92350b, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        String queryParameter;
        int match = this.f92350b.match(uri);
        if (match == 1) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return SharedListRoutes$SharedList.Companion.a(lastPathSegment);
            }
        } else if (match == 2 && (queryParameter = uri.getQueryParameter("listId")) != null) {
            return SharedListRoutes$SharedList.Companion.a(queryParameter);
        }
        return a.C1929a.b(Zl.a.f89961a, (Integer) null, (String) null, 3, (Object) null);
    }
}
