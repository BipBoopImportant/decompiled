package gj;

import HJ.C15854t;
import YH.C16877v;
import gj.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.O;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u00020\u000b*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lgj/c;", "", "<init>", "()V", "", "format", "", "rawValue", "Lgj/j$a;", "c", "(ILjava/lang/String;)Lgj/j$a;", "", "b", "(Ljava/lang/String;)Z", "isRegularBarcode", "a", "isMetricBarcode", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.c  reason: case insensitive filesystem */
public final class C11292c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97531a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C17974j f97532b = C17978n.w(0, 8);

    /* renamed from: c  reason: collision with root package name */
    private static final List<Character> f97533c = C16877v.q('9', '1');

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgj/c$a;", "", "<init>", "()V", "", "ITF_BARCODE_LENGTH", "I", "ITF_ID_LENGTH", "LtI/j;", "ITF_ID_RANGE", "LtI/j;", "", "SIGNIFICANT_DIGIT_RECOVERED", "C", "SIGNIFICANT_DIGIT_METRIC", "SIGNIFICANT_DIGIT_REGULAR", "", "SIGNIFICANT_DIGITS_FOR_PRODUCT", "Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        return str.length() == 14 && C15854t.H1(str) == '7';
    }

    private final boolean b(String str) {
        int length = str.length();
        if (length == 8) {
            return true;
        }
        if (length != 14) {
            return false;
        }
        return f97533c.contains(Character.valueOf(C15854t.H1(str)));
    }

    public final j.a c(int i10, String str) {
        C17542s.j(str, "rawValue");
        if (!b(str)) {
            return a(str) ? new j.a.C2181a(i10, str, (String) null, (O) null, 12, (DefaultConstructorMarker) null) : new j.a.b(i10, str, (String) null, (O) null, 12, (DefaultConstructorMarker) null);
        }
        return new j.a.c(i10, str, C15854t.h1(str, f97532b), (String) null, (O) null, 24, (DefaultConstructorMarker) null);
    }
}
