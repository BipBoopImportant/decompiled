package F3;

import W3.C6711a;
import X3.C6715b;
import Y3.C6731b;
import a4.C6740a;
import b4.h;
import d4.C7738c;
import q3.C5807s;

/* renamed from: F3.a  reason: case insensitive filesystem */
public interface C6468a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6468a f35346a = new C0567a();

    /* renamed from: F3.a$a  reason: collision with other inner class name */
    class C0567a implements C6468a {
        C0567a() {
        }

        public C6711a a(C5807s sVar) {
            String str = sVar.f28244o;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new C6715b();
                    case 1:
                        return new C6740a();
                    case 2:
                        return new h();
                    case 3:
                        return new C6731b();
                    case 4:
                        return new C7738c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        public boolean b(C5807s sVar) {
            String str = sVar.f28244o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    C6711a a(C5807s sVar);

    boolean b(C5807s sVar);
}
