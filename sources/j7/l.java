package j7;

import YH.C16877v;
import i7.C8215a;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import k7.g;
import k7.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import q7.C8683e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/security/cert/X509Certificate;", "", "Lq7/e;", "b", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "", "extensionValue", "a", "([B)Ljava/util/List;", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    private static final List<C8683e> a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        k.c(byteArrayInputStream);
        while (byteArrayInputStream.available() > 2) {
            arrayList.add(C8215a.f53152a.c(new ByteArrayInputStream(k.b(byteArrayInputStream))));
        }
        return C16877v.t1(arrayList);
    }

    public static final List<C8683e> b(X509Certificate x509Certificate) {
        C17542s.j(x509Certificate, "<this>");
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.4.2");
        C17542s.g(extensionValue);
        return a(g.c(extensionValue, 2, (h) null, 2, (Object) null));
    }
}
