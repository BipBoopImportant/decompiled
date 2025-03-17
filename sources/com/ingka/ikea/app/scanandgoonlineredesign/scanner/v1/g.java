package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\nB\u0013\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final String f92217a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends g {

        /* renamed from: b  reason: collision with root package name */
        private final String f92218b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super("Permission not granted: " + str, (DefaultConstructorMarker) null);
            C17542s.j(str, "permission");
            this.f92218b = str;
        }

        public final String a() {
            return this.f92218b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f92218b, ((a) obj).f92218b);
        }

        public int hashCode() {
            return this.f92218b.hashCode();
        }

        public String toString() {
            String str = this.f92218b;
            return "PermissionRequired(permission=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/g;", "", "permission", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final String f92219b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super("Request permission rationale: " + str, (DefaultConstructorMarker) null);
            C17542s.j(str, "permission");
            this.f92219b = str;
        }

        public final String a() {
            return this.f92219b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f92219b, ((b) obj).f92219b);
        }

        public int hashCode() {
            return this.f92219b.hashCode();
        }

        public String toString() {
            String str = this.f92219b;
            return "RequestPermissionRationale(permission=" + str + ")";
        }
    }

    public /* synthetic */ g(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getMessage() {
        return this.f92217a;
    }

    private g(String str) {
        super(str);
        this.f92217a = str;
    }
}
