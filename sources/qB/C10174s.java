package qb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: qb.s  reason: case insensitive filesystem */
public final class C10174s {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<C10173r> f75989a = new CopyOnWriteArrayList<>();

    public static C10173r a(String str) {
        Iterator<C10173r> it = f75989a.iterator();
        while (it.hasNext()) {
            C10173r next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
