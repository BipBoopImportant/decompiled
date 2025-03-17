package Cc;

import Ac.a;
import Gc.m;
import com.google.firebase.perf.util.b;
import java.util.Map;

final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final a f58969b = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final m f58970a;

    d(m mVar) {
        this.f58970a = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            try {
                e.d((String) next.getKey(), (String) next.getValue());
            } catch (IllegalArgumentException e10) {
                f58969b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f58969b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry next : mVar.A().entrySet()) {
            if (!l((String) next.getKey())) {
                a aVar = f58969b;
                aVar.j("invalid CounterId:" + ((String) next.getKey()));
                return false;
            } else if (!m((Long) next.getValue())) {
                a aVar2 = f58969b;
                aVar2.j("invalid CounterValue:" + next.getValue());
                return false;
            }
        }
        for (m i11 : mVar.I()) {
            if (!i(i11, i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        if (mVar.z() > 0) {
            return true;
        }
        for (m z10 : mVar.I()) {
            if (z10.z() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.G().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f58969b.j("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            f58969b.j("counterId exceeded max length 100");
            return false;
        }
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean n(m mVar) {
        Long l10 = mVar.A().get(b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo(0L) > 0;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f58969b.j("TraceMetric is null");
            return false;
        } else if (i10 > 1) {
            f58969b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(mVar.G())) {
            a aVar = f58969b;
            aVar.j("invalid TraceId:" + mVar.G());
            return false;
        } else if (!p(mVar)) {
            a aVar2 = f58969b;
            aVar2.j("invalid TraceDuration:" + mVar.D());
            return false;
        } else if (!mVar.J()) {
            f58969b.j("clientStartTimeUs is null.");
            return false;
        } else if (!k(mVar) || n(mVar)) {
            for (m o10 : mVar.I()) {
                if (!o(o10, i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.B());
        } else {
            a aVar3 = f58969b;
            aVar3.j("non-positive totalFrames in screen trace " + mVar.G());
            return false;
        }
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.D() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    public boolean c() {
        if (!o(this.f58970a, 0)) {
            a aVar = f58969b;
            aVar.j("Invalid Trace:" + this.f58970a.G());
            return false;
        } else if (!j(this.f58970a) || h(this.f58970a)) {
            return true;
        } else {
            a aVar2 = f58969b;
            aVar2.j("Invalid Counters for Trace:" + this.f58970a.G());
            return false;
        }
    }
}
