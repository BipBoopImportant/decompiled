package qL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"LqL/c;", "LqL/a;", "", "Lorg/koin/core/qualifier/QualifierValue;", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qL.c  reason: case insensitive filesystem */
public final class C17846c implements C17844a {

    /* renamed from: a  reason: collision with root package name */
    private final String f146655a;

    public C17846c(String str) {
        C17542s.j(str, "value");
        this.f146655a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17846c) && C17542s.e(this.f146655a, ((C17846c) obj).f146655a);
    }

    public String getValue() {
        return this.f146655a;
    }

    public int hashCode() {
        return this.f146655a.hashCode();
    }

    public String toString() {
        return getValue();
    }
}
