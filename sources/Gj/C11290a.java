package gj;

import HJ.C15854t;
import XH.x;
import XH.y;
import gj.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.O;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgj/a;", "", "<init>", "()V", "", "format", "", "rawValue", "LXH/x;", "Lgj/j$c;", "a", "(ILjava/lang/String;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.a  reason: case insensitive filesystem */
public final class C11290a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2179a f97529a = new C2179a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgj/a$a;", "", "<init>", "()V", "", "CONTROL_GS", "C", "", "LABEL_AS_IS_A", "Ljava/lang/String;", "LABEL_AS_IS_B", "ARTICLE_NUMBER_IDENTIFIER", "", "ARTICLE_NUMBER_LENGTH", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.a$a  reason: collision with other inner class name */
    public static final class C2179a {
        public /* synthetic */ C2179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2179a() {
        }
    }

    public final Object a(int i10, String str) {
        Object obj;
        String O02;
        C17542s.j(str, "rawValue");
        try {
            x.a aVar = x.f139812b;
            String str2 = null;
            if (C15854t.W(str, 29 + "240", false, 2, (Object) null)) {
                if (!C15854t.d0(str, 29 + "9100001", false, 2, (Object) null)) {
                    if (!C15854t.d0(str, 29 + "9100007", false, 2, (Object) null)) {
                        Iterator it = C15854t.X0(str, new char[]{29}, false, 0, 6, (Object) null).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C15854t.W((String) obj, "240", false, 2, (Object) null)) {
                                break;
                            }
                        }
                        String str3 = (String) obj;
                        if (!(str3 == null || (O02 = C15854t.O0(str3, "240")) == null)) {
                            str2 = C15854t.K1(O02, 8);
                        }
                        String str4 = str2;
                        C17542s.g(str4);
                        if (str4.length() == 8) {
                            return x.b(new j.c(i10, str, str4, (String) null, O.DATA_MATRIX, 8, (DefaultConstructorMarker) null));
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            return x.b(y.a(th2));
        }
    }
}
