package Y3;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: Y3.c  reason: case insensitive filesystem */
public final class C6732c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f40818a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f40819b;

    public C6732c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f40818a = byteArrayOutputStream;
        this.f40819b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(C6730a aVar) {
        this.f40818a.reset();
        try {
            b(this.f40819b, aVar.f40812a);
            String str = aVar.f40813b;
            if (str == null) {
                str = "";
            }
            b(this.f40819b, str);
            this.f40819b.writeLong(aVar.f40814c);
            this.f40819b.writeLong(aVar.f40815d);
            this.f40819b.write(aVar.f40816e);
            this.f40819b.flush();
            return this.f40818a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
