package ia;

import fc.C9703d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: ia.o  reason: case insensitive filesystem */
public final class C8318o {

    /* renamed from: a  reason: collision with root package name */
    private final Map f53734a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53735b;

    /* renamed from: c  reason: collision with root package name */
    private final C9703d f53736c;

    C8318o(Map map, Map map2, C9703d dVar) {
        this.f53734a = map;
        this.f53735b = map2;
        this.f53736c = dVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C8297l(byteArrayOutputStream, this.f53734a, this.f53735b, this.f53736c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
