package KF;

import com.sugarcube.app.base.upload.g;
import java.io.File;
import nI.C17642l;

/* renamed from: KF.v  reason: case insensitive filesystem */
public final /* synthetic */ class C13168v implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f111751a;

    public /* synthetic */ C13168v(File file) {
        this.f111751a = file;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(g.W(this.f111751a, (File) obj));
    }
}
