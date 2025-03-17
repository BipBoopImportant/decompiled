package J2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8863a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final u f8864a;

        a(u uVar) {
            this.f8864a = uVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            t b10 = this.f8864a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.Z0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<t> c10 = this.f8864a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(c10.get(i11).Z0());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int i10) {
            t d10 = this.f8864a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.Z0();
        }

        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f8864a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(u uVar) {
            super(uVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f8864a.a(i10, t.a1(accessibilityNodeInfo), str, bundle);
        }
    }

    public u() {
        this.f8863a = new b(this);
    }

    public void a(int i10, t tVar, String str, Bundle bundle) {
    }

    public t b(int i10) {
        return null;
    }

    public List<t> c(String str, int i10) {
        return null;
    }

    public t d(int i10) {
        return null;
    }

    public Object e() {
        return this.f8863a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public u(Object obj) {
        this.f8863a = obj;
    }
}
