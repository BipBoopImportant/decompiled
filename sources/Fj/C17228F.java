package fJ;

import HJ.C15854t;
import com.optimizely.ab.config.FeatureVariable;
import fI.C17221b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fJ.F  reason: case insensitive filesystem */
public enum C17228F {
    ;

    /* renamed from: fJ.F$a */
    static final class a extends C17228F {
        a(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public String b(String str) {
            C17542s.j(str, FeatureVariable.STRING_TYPE);
            return C15854t.Q(C15854t.Q(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* renamed from: fJ.F$b */
    static final class b extends C17228F {
        b(String str, int i10) {
            super(str, i10, (DefaultConstructorMarker) null);
        }

        public String b(String str) {
            C17542s.j(str, FeatureVariable.STRING_TYPE);
            return str;
        }
    }

    static {
        C17228F[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public abstract String b(String str);
}
