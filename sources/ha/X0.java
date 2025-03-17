package ha;

import fc.C9703d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class X0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f52347a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f52348b;

    /* renamed from: c  reason: collision with root package name */
    private final C9703d f52349c;

    X0(Map map, Map map2, C9703d dVar) {
        this.f52347a = map;
        this.f52348b = map2;
        this.f52349c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new U0(byteArrayOutputStream, this.f52347a, this.f52348b, this.f52349c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
