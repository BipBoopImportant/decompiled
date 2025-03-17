package com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "", "<init>", "()V", "d", "c", "a", "b", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$a;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$b;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$c;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$d;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$a;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "", "contentUrl", "", "goBackToPurchase", "redirectToBrowserUrl", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        private final String f91035a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f91036b;

        /* renamed from: c  reason: collision with root package name */
        private final String f91037c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "contentUrl");
            this.f91035a = str;
            this.f91036b = z10;
            this.f91037c = str2;
        }

        public final String a() {
            return this.f91035a;
        }

        public final boolean b() {
            return this.f91036b;
        }

        public final String c() {
            return this.f91037c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f91035a, aVar.f91035a) && this.f91036b == aVar.f91036b && C17542s.e(this.f91037c, aVar.f91037c);
        }

        public int hashCode() {
            int hashCode = ((this.f91035a.hashCode() * 31) + Boolean.hashCode(this.f91036b)) * 31;
            String str = this.f91037c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f91035a;
            boolean z10 = this.f91036b;
            String str2 = this.f91037c;
            return "Content(contentUrl=" + str + ", goBackToPurchase=" + z10 + ", redirectToBrowserUrl=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$b;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "", "message", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final int f91038a;

        public b(int i10) {
            super((DefaultConstructorMarker) null);
            this.f91038a = i10;
        }

        public final int a() {
            return this.f91038a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f91038a == ((b) obj).f91038a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f91038a);
        }

        public String toString() {
            int i10 = this.f91038a;
            return "ErrorMessage(message=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$c;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f91039a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1221439275;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d$d;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d$d  reason: collision with other inner class name */
    public static final class C1991d extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final C1991d f91040a = new C1991d();

        private C1991d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1991d);
        }

        public int hashCode() {
            return 431374810;
        }

        public String toString() {
            return "MissingUrl";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
