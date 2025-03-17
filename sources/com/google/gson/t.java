package com.google.gson;

import com.google.gson.internal.f;
import com.google.gson.internal.i;
import java.math.BigDecimal;

public enum t implements u {
    DOUBLE {
        /* renamed from: b */
        public Double a(Tc.a aVar) {
            return Double.valueOf(aVar.d2());
        }
    },
    LAZILY_PARSED_NUMBER {
        public Number a(Tc.a aVar) {
            return new f(aVar.C1());
        }
    },
    LONG_OR_DOUBLE {
        private Number b(String str, Tc.a aVar) {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!aVar.t()) {
                    throw new Tc.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.q());
                }
                return valueOf;
            } catch (NumberFormatException e10) {
                throw new l("Cannot parse " + str + "; at path " + aVar.q(), e10);
            }
        }

        public Number a(Tc.a aVar) {
            String C12 = aVar.C1();
            if (C12.indexOf(46) >= 0) {
                return b(C12, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(C12));
            } catch (NumberFormatException unused) {
                return b(C12, aVar);
            }
        }
    },
    BIG_DECIMAL {
        /* renamed from: b */
        public BigDecimal a(Tc.a aVar) {
            String C12 = aVar.C1();
            try {
                return i.b(C12);
            } catch (NumberFormatException e10) {
                throw new l("Cannot parse " + C12 + "; at path " + aVar.q(), e10);
            }
        }
    };
}
