package com.ingka.ikea.app.auth.policies;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/auth/policies/c;", "", "<init>", "()V", "a", "b", "Lcom/ingka/ikea/app/auth/policies/c$a;", "Lcom/ingka/ikea/app/auth/policies/c$b;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/app/auth/policies/c$b;", "Lcom/ingka/ikea/app/auth/policies/c;", "", "Lif/a;", "links", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final List<p000if.a> f70193a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<p000if.a> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "links");
            this.f70193a = list;
        }

        public final List<p000if.a> a() {
            return this.f70193a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f70193a, ((b) obj).f70193a);
        }

        public int hashCode() {
            return this.f70193a.hashCode();
        }

        public String toString() {
            List<p000if.a> list = this.f70193a;
            return "TermsAndConditions(links=" + list + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/app/auth/policies/c$a;", "Lcom/ingka/ikea/app/auth/policies/c;", "", "LCp/c;", "ethicsData", "", "privacyPolicyLink", "", "title", "description", "linkText", "<init>", "(Ljava/util/List;Ljava/lang/String;III)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "d", "c", "I", "e", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        private final List<Cp.c> f70188a;

        /* renamed from: b  reason: collision with root package name */
        private final String f70189b;

        /* renamed from: c  reason: collision with root package name */
        private final int f70190c;

        /* renamed from: d  reason: collision with root package name */
        private final int f70191d;

        /* renamed from: e  reason: collision with root package name */
        private final int f70192e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(List list, String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, (i13 & 4) != 0 ? We.c.f64729k : i10, (i13 & 8) != 0 ? We.c.f64728j : i11, (i13 & 16) != 0 ? We.c.f64727i : i12);
        }

        public final int a() {
            return this.f70191d;
        }

        public final List<Cp.c> b() {
            return this.f70188a;
        }

        public final int c() {
            return this.f70192e;
        }

        public final String d() {
            return this.f70189b;
        }

        public final int e() {
            return this.f70190c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f70188a, aVar.f70188a) && C17542s.e(this.f70189b, aVar.f70189b) && this.f70190c == aVar.f70190c && this.f70191d == aVar.f70191d && this.f70192e == aVar.f70192e;
        }

        public int hashCode() {
            return (((((((this.f70188a.hashCode() * 31) + this.f70189b.hashCode()) * 31) + Integer.hashCode(this.f70190c)) * 31) + Integer.hashCode(this.f70191d)) * 31) + Integer.hashCode(this.f70192e);
        }

        public String toString() {
            List<Cp.c> list = this.f70188a;
            String str = this.f70189b;
            int i10 = this.f70190c;
            int i11 = this.f70191d;
            int i12 = this.f70192e;
            return "DataEthics(ethicsData=" + list + ", privacyPolicyLink=" + str + ", title=" + i10 + ", description=" + i11 + ", linkText=" + i12 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<Cp.c> list, String str, int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "ethicsData");
            C17542s.j(str, "privacyPolicyLink");
            this.f70188a = list;
            this.f70189b = str;
            this.f70190c = i10;
            this.f70191d = i11;
            this.f70192e = i12;
        }
    }
}
