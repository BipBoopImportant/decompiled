package y6;

import I6.j;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: y6.b  reason: case insensitive filesystem */
public class C8985b {

    /* renamed from: a  reason: collision with root package name */
    private final List<u> f57853a = new ArrayList();

    /* access modifiers changed from: package-private */
    public void a(u uVar) {
        this.f57853a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f57853a.size() - 1; size >= 0; size--) {
            j.b(path, this.f57853a.get(size));
        }
    }
}
