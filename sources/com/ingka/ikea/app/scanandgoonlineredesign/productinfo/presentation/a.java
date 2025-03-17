package com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "", "<init>", "()V", "b", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "", "isInFavourites", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.a$a  reason: collision with other inner class name */
    public static final class C2022a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f91748a;

        public C2022a(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f91748a = z10;
        }

        public final boolean a() {
            return this.f91748a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2022a) && this.f91748a == ((C2022a) obj).f91748a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f91748a);
        }

        public String toString() {
            boolean z10 = this.f91748a;
            return "Allowed(isInFavourites=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/productinfo/presentation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f91749a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 487743191;
        }

        public String toString() {
            return "NotAllowed";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
