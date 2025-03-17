package gj;

import HJ.C15854t;
import XH.x;
import XH.y;
import YH.C16877v;
import gj.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.O;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgj/b;", "", "<init>", "()V", "", "format", "", "rawValue", "LXH/x;", "Lgj/j$c;", "a", "(ILjava/lang/String;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.b  reason: case insensitive filesystem */
public final class C11291b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97530a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lgj/b$a;", "", "<init>", "()V", "", "CONTROL_GS", "C", "", "MIN_APPLICATION_IDENTIFIERS", "I", "LABEL_TYPE_INDEX", "", "LABEL_AS_IS_A", "Ljava/lang/String;", "LABEL_AS_IS_B", "LABEL_AS_IS_OFFER_INDEX", "AS_IS_OFFER_IDENTIFIER", "LABEL_ARTICLE_NUMBER_INDEX", "ARTICLE_NUMBER_FIELD_LENGTH", "PRICE_DATA_IDENTIFIER", "ARTICLE_NUMBER_IDENTIFIER", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final Object a(int i10, String str) {
        C17542s.j(str, "rawValue");
        try {
            x.a aVar = x.f139812b;
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator it = C15854t.X0(str, new char[]{29}, false, 0, 6, (Object) null).iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (str3.length() != 0) {
                    str2 = str3;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() >= 4) {
                String str4 = (String) C16877v.z0(arrayList, 0);
                if (str4 == null || (!C17542s.e(str4, "9100001") && !C17542s.e(str4, "9100007"))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String str5 = (String) C16877v.z0(arrayList, 1);
                if (str5 == null || !C15854t.W(str5, "21", false, 2, (Object) null)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String str6 = (String) C16877v.z0(arrayList, 2);
                if (str6 == null || !C15854t.W(str6, "240", false, 2, (Object) null) || str6.length() != 11) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (!arrayList.isEmpty()) {
                    for (String W10 : arrayList) {
                        if (C15854t.W(W10, "390", false, 2, (Object) null)) {
                            return x.b(new j.c(i10, str, str, (String) null, O.AS_IS, 8, (DefaultConstructorMarker) null));
                        }
                    }
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
