package H3;

import java.util.Objects;
import k4.C8424h;
import k4.C8428l;
import k4.s;
import l4.C8491a;
import l4.C8493c;
import q3.C5807s;

public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f36378a = new a();

    class a implements g {

        /* renamed from: b  reason: collision with root package name */
        private final C8424h f36379b = new C8424h();

        a() {
        }

        public C8428l a(C5807s sVar) {
            String str = sVar.f28244o;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                        return new C8491a(str, sVar.f28224I, 16000);
                    case 2:
                        return new C8493c(sVar.f28224I, sVar.f28247r);
                }
            }
            if (this.f36379b.b(sVar)) {
                s a10 = this.f36379b.a(sVar);
                return new C6524b(a10.getClass().getSimpleName() + "Decoder", a10);
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        public boolean b(C5807s sVar) {
            String str = sVar.f28244o;
            return this.f36379b.b(sVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    C8428l a(C5807s sVar);

    boolean b(C5807s sVar);
}
