package com.ingka.ikea.app.productinformationpage.network;

import HJ.C15854t;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails;", "", "", "text", "fragment", "applyLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Remote", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinancialServicesDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f72082a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72083b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72084c;

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails$Remote;", "", "", "seen0", "", "text", "fragment", "applyLink", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails;", "a", "()Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "getFragment", "getFragment$annotations", "c", "getApplyLink", "getApplyLink$annotations", "Companion", "$serializer", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f72086a;

        /* renamed from: b  reason: collision with root package name */
        private final String f72087b;

        /* renamed from: c  reason: collision with root package name */
        private final String f72088c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return FinancialServicesDetails$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, FinancialServicesDetails$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f72086a = str;
            this.f72087b = str2;
            this.f72088c = str3;
        }

        public static final /* synthetic */ void b(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, remote.f72086a);
            dVar.B(serialDescriptor, 1, y02, remote.f72087b);
            dVar.B(serialDescriptor, 2, y02, remote.f72088c);
        }

        public final FinancialServicesDetails a() {
            String str;
            String str2;
            String str3 = this.f72086a;
            if (str3 != null && !C15854t.v0(str3) && (str = this.f72087b) != null && !C15854t.v0(str) && (str2 = this.f72088c) != null && !C15854t.v0(str2)) {
                return new FinancialServicesDetails(this.f72086a, this.f72087b, this.f72088c);
            }
            throw new IOException("Invalid data: " + this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return C17542s.e(this.f72086a, remote.f72086a) && C17542s.e(this.f72087b, remote.f72087b) && C17542s.e(this.f72088c, remote.f72088c);
        }

        public int hashCode() {
            String str = this.f72086a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f72087b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f72088c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f72086a;
            String str2 = this.f72087b;
            String str3 = this.f72088c;
            return "Remote(text=" + str + ", fragment=" + str2 + ", applyLink=" + str3 + ")";
        }
    }

    public FinancialServicesDetails(String str, String str2, String str3) {
        C17542s.j(str, "text");
        C17542s.j(str2, "fragment");
        C17542s.j(str3, "applyLink");
        this.f72082a = str;
        this.f72083b = str2;
        this.f72084c = str3;
    }

    public final String a() {
        return this.f72084c;
    }

    public final String b() {
        return this.f72083b;
    }

    public final String c() {
        return this.f72082a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialServicesDetails)) {
            return false;
        }
        FinancialServicesDetails financialServicesDetails = (FinancialServicesDetails) obj;
        return C17542s.e(this.f72082a, financialServicesDetails.f72082a) && C17542s.e(this.f72083b, financialServicesDetails.f72083b) && C17542s.e(this.f72084c, financialServicesDetails.f72084c);
    }

    public int hashCode() {
        return (((this.f72082a.hashCode() * 31) + this.f72083b.hashCode()) * 31) + this.f72084c.hashCode();
    }

    public String toString() {
        String str = this.f72082a;
        String str2 = this.f72083b;
        String str3 = this.f72084c;
        return "FinancialServicesDetails(text=" + str + ", fragment=" + str2 + ", applyLink=" + str3 + ")";
    }
}
