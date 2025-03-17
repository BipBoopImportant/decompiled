package kF;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"LkF/K;", "", "", "currentStep", "totalSteps", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.K  reason: case insensitive filesystem */
public final class C14690K {

    /* renamed from: c  reason: collision with root package name */
    public static final a f128701c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f128702a;

    /* renamed from: b  reason: collision with root package name */
    private final int f128703b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkF/K$a;", "", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kF.K$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14690K(int i10, int i11) {
        this.f128702a = i10;
        this.f128703b = i11;
    }

    public final int a() {
        return this.f128702a;
    }

    public final int b() {
        return this.f128703b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14690K)) {
            return false;
        }
        C14690K k10 = (C14690K) obj;
        return this.f128702a == k10.f128702a && this.f128703b == k10.f128703b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f128702a) * 31) + Integer.hashCode(this.f128703b);
    }

    public String toString() {
        int i10 = this.f128702a;
        int i11 = this.f128703b;
        return "StepIndicatorInformation(currentStep=" + i10 + ", totalSteps=" + i11 + ")";
    }
}
