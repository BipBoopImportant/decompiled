package UE;

import YH.C16877v;
import android.net.Uri;
import cF.C14041c;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.ui.gallery.h;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LUE/a;", "", "<init>", "()V", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "source", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "Landroid/net/Uri;", "b", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;Lcom/sugarcube/app/base/ui/gallery/h;)Landroid/net/Uri;", "Ljava/util/UUID;", "sceneUUID", "f", "(Ljava/util/UUID;Lcom/sugarcube/app/base/data/analytics/OpeningSource;)Landroid/net/Uri;", "compositionUUID", "g", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/app/base/data/analytics/OpeningSource;)Landroid/net/Uri;", "sceneUuid", "compositionUuid", "", "", "furniture", "d", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/sugarcube/app/base/data/analytics/OpeningSource;Ljava/util/List;)Landroid/net/Uri;", "a", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;)Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UE.a  reason: case insensitive filesystem */
public final class C13733a {

    /* renamed from: a  reason: collision with root package name */
    public static final C13733a f117059a = new C13733a();

    private C13733a() {
    }

    public static /* synthetic */ Uri c(C13733a aVar, OpeningSource openingSource, h hVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = null;
        }
        return aVar.b(openingSource, hVar);
    }

    public static /* synthetic */ Uri e(C13733a aVar, UUID uuid, UUID uuid2, OpeningSource openingSource, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uuid2 = null;
        }
        if ((i10 & 8) != 0) {
            list = null;
        }
        return aVar.d(uuid, uuid2, openingSource, list);
    }

    public static /* synthetic */ Uri h(C13733a aVar, UUID uuid, UUID uuid2, OpeningSource openingSource, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            uuid2 = null;
        }
        if ((i10 & 4) != 0) {
            openingSource = null;
        }
        return aVar.g(uuid, uuid2, openingSource);
    }

    public final Uri a(OpeningSource openingSource) {
        Uri.Builder a10 = C14041c.a("ikea://design-lab/scan");
        if (openingSource != null) {
            a10.appendQueryParameter("source", openingSource.getKey());
        }
        Uri build = a10.appendQueryParameter("scan", "true").build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri b(OpeningSource openingSource, h hVar) {
        C17542s.j(openingSource, "source");
        Uri.Builder appendQueryParameter = C14041c.c(Uri.parse("ikea://design-lab/gallery")).buildUpon().appendQueryParameter("source", openingSource.getKey());
        if (hVar != null) {
            appendQueryParameter.appendQueryParameter("tab", hVar.b());
        }
        Uri build = appendQueryParameter.build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri d(UUID uuid, UUID uuid2, OpeningSource openingSource, List<String> list) {
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(openingSource, "source");
        Uri.Builder appendQueryParameter = C14041c.a("ikea://design-lab/decorate").appendQueryParameter("sceneUuid", uuid.toString()).appendQueryParameter("source", openingSource.getKey());
        if (uuid2 != null) {
            appendQueryParameter.appendQueryParameter("compositionUuid", uuid2.toString());
        }
        if (list != null) {
            appendQueryParameter.appendQueryParameter("furniture", C16877v.G0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        }
        Uri build = appendQueryParameter.build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri f(UUID uuid, OpeningSource openingSource) {
        C17542s.j(uuid, "sceneUUID");
        C17542s.j(openingSource, "source");
        Uri build = C14041c.a("ikea://design-lab/decorate").appendQueryParameter("sceneUuid", uuid.toString()).appendQueryParameter("source", openingSource.getKey()).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public final Uri g(UUID uuid, UUID uuid2, OpeningSource openingSource) {
        C17542s.j(uuid, "sceneUUID");
        Uri.Builder appendQueryParameter = C14041c.a("ikea://design-lab/decorate").appendQueryParameter("sceneUuid", uuid.toString());
        if (uuid2 != null) {
            appendQueryParameter.appendQueryParameter("compositionUuid", uuid2.toString());
        }
        if (openingSource != null) {
            appendQueryParameter.appendQueryParameter("source", openingSource.getKey());
        }
        Uri build = appendQueryParameter.build();
        C17542s.i(build, "build(...)");
        return build;
    }
}
