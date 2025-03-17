package X5;

import android.content.res.AssetFileDescriptor;
import java.util.concurrent.Callable;

public final /* synthetic */ class M implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AssetFileDescriptor f40652a;

    public /* synthetic */ M(AssetFileDescriptor assetFileDescriptor) {
        this.f40652a = assetFileDescriptor;
    }

    public final Object call() {
        return N.c(this.f40652a);
    }
}
