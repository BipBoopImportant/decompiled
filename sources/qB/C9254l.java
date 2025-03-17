package Qb;

import Wb.g;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: Qb.l  reason: case insensitive filesystem */
class C9254l {

    /* renamed from: d  reason: collision with root package name */
    private static final FilenameFilter f62985d = new C9252j();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<File> f62986e = new C9253k();

    /* renamed from: a  reason: collision with root package name */
    private final g f62987a;

    /* renamed from: b  reason: collision with root package name */
    private String f62988b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f62989c = null;

    C9254l(g gVar) {
        this.f62987a = gVar;
    }

    private static void f(g gVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                gVar.q(str, "aqs." + str2).createNewFile();
            } catch (IOException e10) {
                Nb.g.f().l("Failed to persist App Quality Sessions session id.", e10);
            }
        }
    }

    static String g(g gVar, String str) {
        List<File> r10 = gVar.r(str, f62985d);
        if (!r10.isEmpty()) {
            return ((File) Collections.min(r10, f62986e)).getName().substring(4);
        }
        Nb.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f62988b, str)) {
            return this.f62989c;
        }
        return g(this.f62987a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f62989c, str)) {
            f(this.f62987a, this.f62988b, str);
            this.f62989c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f62988b, str)) {
            f(this.f62987a, str, this.f62989c);
            this.f62988b = str;
        }
    }
}
