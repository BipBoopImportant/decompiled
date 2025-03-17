package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o3.b;

public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    public interface C0350a<D> {
        void a(b<D> bVar);

        b<D> b(int i10, Bundle bundle);

        void c(b<D> bVar, D d10);
    }

    public static <T extends C5221y & k0> a b(T t10) {
        return new b(t10, ((k0) t10).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> b<D> c(int i10, Bundle bundle, C0350a<D> aVar);

    public abstract void d();
}
