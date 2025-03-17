package C;

import androidx.camera.core.impl.U;
import androidx.camera.core.impl.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: C.y  reason: case insensitive filesystem */
public final class C4416y {

    /* renamed from: C.y$a */
    static final class a implements U {

        /* renamed from: a  reason: collision with root package name */
        final List<W> f5461a;

        a(List<W> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f5461a = Collections.unmodifiableList(new ArrayList(list));
        }

        public List<W> a() {
            return this.f5461a;
        }
    }

    static U a(W... wArr) {
        return new a(Arrays.asList(wArr));
    }

    public static U b() {
        return a(new W.a());
    }
}
