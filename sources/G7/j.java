package G7;

import C7.f;
import Y7.h;
import Y7.k;
import Y7.l;
import Z7.a;
import Z7.c;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final h<f, String> f36258a = new h<>(1000);

    /* renamed from: b  reason: collision with root package name */
    private final H2.f<b> f36259b = Z7.a.d(10, new a());

    class a implements a.d<b> {
        a() {
        }

        /* renamed from: b */
        public b a() {
            try {
                return new b(MessageDigest.getInstance(Constants.SHA256));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        final MessageDigest f36261a;

        /* renamed from: b  reason: collision with root package name */
        private final c f36262b = c.a();

        b(MessageDigest messageDigest) {
            this.f36261a = messageDigest;
        }

        public c j() {
            return this.f36262b;
        }
    }

    private String a(f fVar) {
        b bVar = (b) k.d(this.f36259b.b());
        try {
            fVar.b(bVar.f36261a);
            return l.x(bVar.f36261a.digest());
        } finally {
            this.f36259b.a(bVar);
        }
    }

    public String b(f fVar) {
        String g10;
        synchronized (this.f36258a) {
            g10 = this.f36258a.g(fVar);
        }
        if (g10 == null) {
            g10 = a(fVar);
        }
        synchronized (this.f36258a) {
            this.f36258a.k(fVar, g10);
        }
        return g10;
    }
}
