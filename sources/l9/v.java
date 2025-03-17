package l9;

import android.content.Context;
import java.io.Closeable;
import t9.C8856d;

abstract class v implements Closeable {

    interface a {
        a a(Context context);

        v g();
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public abstract C8856d c();

    public void close() {
        c().close();
    }

    /* access modifiers changed from: package-private */
    public abstract u d();
}
