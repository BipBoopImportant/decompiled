package o7;

import HJ.C15854t;
import k7.C8460B;
import k7.C8461a;
import k7.g;
import k7.h;
import k7.o;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8536e;
import o7.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lo7/a;", "", "Lk7/x;", "sequence", "<init>", "(Lk7/x;)V", "", "toString", "()Ljava/lang/String;", "a", "Lk7/x;", "Lo7/l;", "b", "()Lo7/l;", "tbsCertificate", "Lk7/a;", "()Lk7/a;", "signatureValue", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: o7.a  reason: case insensitive filesystem */
public final class C8608a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0886a f55249b = new C0886a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final x f55250a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo7/a$a;", "", "<init>", "()V", "", "byteArray", "Lk7/h;", "logger", "Lo7/a;", "a", "([BLk7/h;)Lo7/a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: o7.a$a  reason: collision with other inner class name */
    public static final class C0886a {
        public /* synthetic */ C0886a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C8608a b(C0886a aVar, byte[] bArr, h hVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                hVar = C8460B.f54288a;
            }
            return aVar.a(bArr, hVar);
        }

        public final C8608a a(byte[] bArr, h hVar) {
            C17542s.j(bArr, "byteArray");
            C17542s.j(hVar, "logger");
            o d10 = g.d(C8536e.b(bArr), hVar);
            C17542s.h(d10, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
            return new C8608a((x) d10, (DefaultConstructorMarker) null);
        }

        private C0886a() {
        }
    }

    public /* synthetic */ C8608a(x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar);
    }

    public final C8461a a() {
        o oVar = this.f55250a.q().get(2);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1BitString");
        return (C8461a) oVar;
    }

    public final l b() {
        l.a aVar = l.f55274k;
        o oVar = this.f55250a.q().get(0);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return aVar.a((x) oVar);
    }

    public String toString() {
        String str;
        String str2;
        String jVar;
        String qVar;
        String i10 = C15854t.i(b().x().toString(), "    ");
        String i11 = C15854t.i(b().s().toString(), "    ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate\n  Subject Name\n");
        sb2.append(i10);
        sb2.append("\n\n  Issuer Name\n");
        sb2.append(i11);
        sb2.append("\n\n");
        sb2.append(C15854t.i(b().v().toString(), "  "));
        sb2.append(10);
        q B10 = b().B();
        if (B10 == null || (qVar = B10.toString()) == null || (str = C15854t.i(qVar, "  ")) == null) {
            str = "  Version 1";
        }
        sb2.append(str);
        sb2.append("\n\n");
        sb2.append(C15854t.i(b().A().toString(), "  "));
        sb2.append("\n\n  Signature ");
        sb2.append(a().g().a() - 1);
        sb2.append(" bytes\n\n");
        j r10 = b().r();
        if (r10 == null || (jVar = r10.toString()) == null || (str2 = C15854t.i(jVar, "  ")) == null) {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    private C8608a(x xVar) {
        this.f55250a = xVar;
    }
}
