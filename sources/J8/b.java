package J8;

import D8.c;
import G8.i;
import XH.C16807N;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\tJQ\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"LJ8/b;", "", "", "key", "initializationVector", "<init>", "([B[B)V", "value", "g", "([B)[B", "", "size", "d", "(I)[B", "data", "a", "", "gzip", "originalSize", "", "maxSize", "Lkotlin/Function1;", "LXH/N;", "onMaxSizeExceeded", "b", "([BZLjava/lang/Integer;Ljava/lang/Long;LnI/l;)[B", "Ljava/io/ByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "os", "Ljavax/crypto/spec/IvParameterSpec;", "Ljavax/crypto/spec/IvParameterSpec;", "e", "()Ljavax/crypto/spec/IvParameterSpec;", "ivSpec", "Ljavax/crypto/spec/SecretKeySpec;", "c", "Ljavax/crypto/spec/SecretKeySpec;", "f", "()Ljavax/crypto/spec/SecretKeySpec;", "keySpec", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f37406d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f37407a;

    /* renamed from: b  reason: collision with root package name */
    private final IvParameterSpec f37408b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f37409c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJ8/b$a;", "", "<init>", "()V", "", "RANDOM_BYTE_SIZE", "I", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(byte[] bArr, byte[] bArr2) {
        this.f37407a = new ByteArrayOutputStream();
        this.f37409c = new SecretKeySpec(bArr == null ? d(16) : bArr, "AES");
        this.f37408b = new IvParameterSpec(bArr2 == null ? d(16) : bArr2);
    }

    public static /* synthetic */ byte[] c(b bVar, byte[] bArr, boolean z10, Integer num, Long l10, C17642l lVar, int i10, Object obj) {
        return bVar.b(bArr, z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : lVar);
    }

    private final byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private final byte[] g(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr != null) {
            try {
                bArr2 = i.f36274a.a(bArr, this.f37407a);
            } catch (IOException e10) {
                c cVar = new c("NetworkEventCompressor");
                cVar.h("Error while gzipping api error details : " + e10);
            } catch (Throwable th2) {
                this.f37407a.reset();
                throw th2;
            }
        }
        this.f37407a.reset();
        return bArr2;
    }

    public final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
        instance.init(1, this.f37409c, this.f37408b);
        return instance.doFinal(bArr);
    }

    public final byte[] b(byte[] bArr, boolean z10, Integer num, Long l10, C17642l<? super Integer, C16807N> lVar) {
        if (bArr == null) {
            return null;
        }
        if ((l10 == null || ((long) bArr.length) <= l10.longValue()) && !Arrays.equals(bArr, I8.a.f37083a.d())) {
            if (z10) {
                bArr = g(bArr);
            }
            return a(bArr);
        }
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(num != null ? num.intValue() : bArr.length));
        }
        return I8.a.f37083a.d();
    }

    public final IvParameterSpec e() {
        return this.f37408b;
    }

    public final SecretKeySpec f() {
        return this.f37409c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(byte[] bArr, byte[] bArr2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bArr, (i10 & 2) != 0 ? null : bArr2);
    }
}
