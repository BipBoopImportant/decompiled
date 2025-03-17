package com.ingka.ikea.app.shoppinglist.navigation;

import QA.C13349a;
import YH.C16877v;
import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/shoppinglist/navigation/a;", "LZl/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "c", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C2049a f92372c = new C2049a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f92373d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final UriMatcher f92374b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/shoppinglist/navigation/a$a;", "", "<init>", "()V", "", "MATCH_LIST_DETAILS", "I", "ALL_LISTS_MATCH", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.shoppinglist.navigation.a$a  reason: collision with other inner class name */
    public static final class C2049a {
        public /* synthetic */ C2049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2049a() {
        }
    }

    public a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("navigation", "/shoppingLists/details/*/*", 1);
        uriMatcher.addURI("shoppinglist", "lists/open", 2);
        this.f92374b = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f92374b, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        int match = this.f92374b.match(uri);
        if (match != 1) {
            return match != 2 ? a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null) : ShoppingListsRoutes$ShoppingListHost.Companion.a(C13349a.ONLINE, (Boolean) null, (String) null);
        }
        List<String> pathSegments = uri.getPathSegments();
        C17542s.g(pathSegments);
        return ShoppingListsRoutes$ShoppingListHost.Companion.a((C13349a) null, kotlin.coroutines.jvm.internal.b.a(false), pathSegments.get(C16877v.p(pathSegments) - 1));
    }
}
