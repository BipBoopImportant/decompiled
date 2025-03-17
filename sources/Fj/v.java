package fJ;

import YH.C16870n;
import YH.C16877v;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum v {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<v> ALL = null;
    public static final Set<v> ALL_EXCEPT_ANNOTATIONS = null;
    public static final a Companion = null;
    private final boolean includeByDefault;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        int i10;
        v[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        v[] values = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : values) {
            if (vVar.includeByDefault) {
                arrayList.add(vVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = C16877v.y1(arrayList);
        ALL = C16870n.o1(values());
    }

    private v(boolean z10) {
        this.includeByDefault = z10;
    }
}
