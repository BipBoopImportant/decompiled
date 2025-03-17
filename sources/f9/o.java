package F9;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import xa.C8971l;
import xa.C8974o;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f35583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6469a f35584b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f35585c;

    public /* synthetic */ o(Context context, C6469a aVar, CountDownLatch countDownLatch) {
        this.f35583a = context;
        this.f35584b = aVar;
        this.f35585c = countDownLatch;
    }

    public final void run() {
        C8971l lVar;
        C6469a aVar = this.f35584b;
        if (TextUtils.isEmpty(aVar.B())) {
            lVar = C8974o.f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", aVar.B());
            Integer F10 = aVar.F();
            if (F10 != null) {
                bundle.putInt("google.product_id", F10.intValue());
            }
            Context context = this.f35583a;
            bundle.putBoolean("supports_message_handled", true);
            lVar = D.b(context).c(2, bundle);
        }
        lVar.b(m.f35581a, new n(this.f35585c));
    }
}
