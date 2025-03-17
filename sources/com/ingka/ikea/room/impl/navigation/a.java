package com.ingka.ikea.room.impl.navigation;

import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ug.k;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/room/impl/navigation/a;", "LZl/a;", "Lug/k;", "labsFeatures", "<init>", "(Lug/k;)V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Lug/k;", "Landroid/content/UriMatcher;", "c", "Landroid/content/UriMatcher;", "uriMatcher", "d", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: d  reason: collision with root package name */
    private static final C2990a f119771d = new C2990a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f119772e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final k f119773b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f119774c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/room/impl/navigation/a$a;", "", "<init>", "()V", "", "ROOM_AUTHORITY", "Ljava/lang/String;", "ROOM_INTENT", "", "MATCH_ROOM", "I", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.room.impl.navigation.a$a  reason: collision with other inner class name */
    private static final class C2990a {
        public /* synthetic */ C2990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2990a() {
        }
    }

    public a(k kVar) {
        C17542s.j(kVar, "labsFeatures");
        this.f119773b = kVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(PlaceTypes.ROOM, "open/*", 1);
        this.f119774c = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return this.f119773b.j() && b.a(this.f119774c, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        Uri a10;
        if ((this.f119773b.j() ? this.f119774c.match(uri) : -1) != 1) {
            return a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null);
        }
        String lastPathSegment = uri.getLastPathSegment();
        return (lastPathSegment == null || (a10 = RoomRoute.Companion.a(lastPathSegment)) == null) ? a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null) : a10;
    }
}
