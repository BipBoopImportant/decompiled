package a9;

import G8.h;
import android.content.Context;
import java.io.File;

public final class Y1 {

    /* renamed from: a  reason: collision with root package name */
    public final h f42400a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42401b;

    public Y1(Context context) {
        h hVar = new h();
        String absolutePath = context.getFilesDir().getAbsolutePath();
        this.f42400a = hVar;
        this.f42401b = absolutePath + File.separator + "cs";
    }
}
