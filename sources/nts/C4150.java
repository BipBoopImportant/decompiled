package nts;

import android.content.Context;
import com.nsoftware.ipworks3ds.sdk.ThreeDS2Service;
import java.util.List;
import qE.C14944d;
import qE.C14945e;
import qE.C14951k;
import qE.C14952l;
import rE.C15001f;

/* renamed from: nts.ⲫ  reason: contains not printable characters */
public interface C4150 extends ThreeDS2Service {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final C4150 f3778 = C3734.f1057;

    /* synthetic */ void cleanup(Context context);

    /* synthetic */ C14952l createTransaction(String str, String str2);

    /* synthetic */ String getSDKVersion();

    /* synthetic */ List getWarnings();

    /* synthetic */ void initialize(Context context, C14945e eVar, String str, C15001f fVar, C14944d dVar, C14951k kVar);
}
