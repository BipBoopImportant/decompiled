package g3;

import WH.C16729a;
import android.content.Context;
import androidx.work.C7054x;
import androidx.work.V;
import androidx.work.WorkerParameters;
import java.util.Map;

public final class a extends V {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C16729a<b<? extends C7054x>>> f23765a;

    a(Map<String, C16729a<b<? extends C7054x>>> map) {
        this.f23765a = map;
    }

    public C7054x a(Context context, String str, WorkerParameters workerParameters) {
        C16729a aVar = this.f23765a.get(str);
        if (aVar == null) {
            return null;
        }
        return ((b) aVar.get()).create(context, workerParameters);
    }
}
