package jG;

import XH.C16816g;
import XH.t;
import YH.C16877v;
import android.net.Uri;
import android.util.Log;
import com.sugarcube.app.base.data.AssetItem;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.Manifest;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/data/AssetItem;", "a", "(Lcom/sugarcube/app/base/data/AssetItem;)Lcom/sugarcube/app/base/data/AssetItem;", "Lcom/sugarcube/app/base/data/database/Scene;", "", "Landroid/net/Uri;", "b", "(Lcom/sugarcube/app/base/data/database/Scene;)Ljava/util/List;", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jG.e  reason: case insensitive filesystem */
public final class C17403e {
    public static final AssetItem a(AssetItem assetItem) {
        C17542s.j(assetItem, "<this>");
        try {
            assetItem.fetch();
            return assetItem;
        } catch (IOException e10) {
            Priority priority = Priority.ERROR;
            String message = e10.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(e10);
            if (b10 != null) {
                str = b10;
            }
            int i10 = C17402d.f143943a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new t();
            }
            return null;
        }
    }

    public static final List<Uri> b(Scene scene) {
        List<Uri> e10;
        C17542s.j(scene, "<this>");
        Uri glbUrl = scene.getGlbUrl();
        if (glbUrl != null && (e10 = C16877v.e(glbUrl)) != null) {
            return e10;
        }
        Manifest manifest = scene.getManifest();
        return manifest != null ? manifest.getAllValidUris() : C16877v.n();
    }
}
