package OB;

import MB.C13194a;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.store.datalayer.StorageType;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import rw.g;
import x4.C;
import x4.C8951o;
import x4.y;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LOB/c;", "LMB/a;", "<init>", "()V", "Lx4/o;", "navController", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storage", "", "itemNo", "", "forScanAndGo", "requestKey", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/store/datalayer/StorageType;Ljava/lang/String;ZLjava/lang/String;Lx4/C;)V", "Lx4/y;", "navGraphBuilder", "b", "(Lx4/y;)V", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OB.c  reason: case insensitive filesystem */
public final class C13298c implements C13194a {
    public void a(C8951o oVar, StorageType storageType, String str, boolean z10, String str2, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(storageType, PlaceTypes.STORAGE);
        C17542s.j(str2, "requestKey");
        C17542s.j(c10, "navOptions");
        Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/storePicker/select?storage={storage}&itemNo={itemNo}&requestKey={requestKey}&scanAndGo={scanAndGo}")).buildUpon().appendQueryParameter("scanAndGo", String.valueOf(z10)).appendQueryParameter(PlaceTypes.STORAGE, storageType.name()).appendQueryParameter("requestKey", str2);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = g.a(appendQueryParameter, "itemNo", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void b(y yVar) {
        C17542s.j(yVar, "navGraphBuilder");
        C13297b.b(yVar);
    }
}
