package wv;

import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import kK.C17514c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwv/d;", "", "<init>", "()V", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "config", "", "a", "(Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;)Ljava/lang/String;", "serializedObject", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wv.d  reason: case insensitive filesystem */
public final class C12307d {
    public final String a(EmployeeDiscountConfig employeeDiscountConfig) {
        if (employeeDiscountConfig != null) {
            return C17514c.f144280d.b(EmployeeDiscountConfig.Companion.serializer(), employeeDiscountConfig);
        }
        return null;
    }

    public final EmployeeDiscountConfig b(String str) {
        if (str != null) {
            return (EmployeeDiscountConfig) C17514c.f144280d.c(EmployeeDiscountConfig.Companion.serializer(), str);
        }
        return null;
    }
}
