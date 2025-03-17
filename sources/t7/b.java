package T7;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f40114a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f40114a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f40114a;
    }
}
