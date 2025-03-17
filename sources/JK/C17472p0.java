package jK;

import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LjK/p0;", "LjK/b1;", "", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "h0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "nestedName", "i0", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "g0", "parentName", "childName", "f0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "j0", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.p0  reason: case insensitive filesystem */
public abstract class C17472p0 extends b1<String> {
    /* access modifiers changed from: protected */
    public abstract String f0(String str, String str2);

    /* access modifiers changed from: protected */
    public String g0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        return serialDescriptor.e(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final String a0(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "<this>");
        return i0(g0(serialDescriptor, i10));
    }

    /* access modifiers changed from: protected */
    public final String i0(String str) {
        C17542s.j(str, "nestedName");
        String str2 = (String) Z();
        if (str2 == null) {
            str2 = "";
        }
        return f0(str2, str);
    }

    /* access modifiers changed from: protected */
    public final String j0() {
        return b0().isEmpty() ? "$" : C16877v.G0(b0(), ".", "$.", (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 60, (Object) null);
    }
}
