package C3;

import A3.v1;
import C3.C6422m;
import C3.t;
import android.os.Looper;
import q3.C5807s;

public interface u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f33682a = new a();

    class a implements u {
        a() {
        }

        public C6422m e(t.a aVar, C5807s sVar) {
            if (sVar.f28248s == null) {
                return null;
            }
            return new z(new C6422m.a(new O(1), 6001));
        }

        public int g(C5807s sVar) {
            return sVar.f28248s != null ? 1 : 0;
        }

        public void h(Looper looper, v1 v1Var) {
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33683a = new v();

        /* access modifiers changed from: private */
        static /* synthetic */ void a() {
        }

        void release();
    }

    void d() {
    }

    C6422m e(t.a aVar, C5807s sVar);

    b f(t.a aVar, C5807s sVar) {
        return b.f33683a;
    }

    int g(C5807s sVar);

    void h(Looper looper, v1 v1Var);

    void release() {
    }
}
