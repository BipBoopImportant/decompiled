package x3;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t3.C5950a;
import t3.N;

final class s extends i {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f31964g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f31965h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f31966i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private s(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static s B(String str, long j10, long j11) {
        return new s(str, j10, j11, -9223372036854775807L, (File) null);
    }

    public static s C(String str, long j10) {
        return new s(str, j10, -1, -9223372036854775807L, (File) null);
    }

    public static File D(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    private static File E(File file, k kVar) {
        String str;
        String name = file.getName();
        Matcher matcher = f31965h.matcher(name);
        if (matcher.matches()) {
            str = N.p1((String) C5950a.e(matcher.group(1)));
        } else {
            matcher = f31964g.matcher(name);
            str = matcher.matches() ? (String) C5950a.e(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        File D10 = D((File) C5950a.i(file.getParentFile()), kVar.e(str), Long.parseLong((String) C5950a.e(matcher.group(2))), Long.parseLong((String) C5950a.e(matcher.group(3))));
        if (!file.renameTo(D10)) {
            return null;
        }
        return D10;
    }

    public static s n(File file, long j10, long j11, k kVar) {
        File file2;
        String i10;
        k kVar2 = kVar;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            File file3 = file;
            File E10 = E(file, kVar2);
            if (E10 == null) {
                return null;
            }
            file2 = E10;
            name = E10.getName();
        } else {
            file2 = file;
        }
        Matcher matcher = f31966i.matcher(name);
        if (!matcher.matches() || (i10 = kVar2.i(Integer.parseInt((String) C5950a.e(matcher.group(1))))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new s(i10, Long.parseLong((String) C5950a.e(matcher.group(2))), length, j11 == -9223372036854775807L ? Long.parseLong((String) C5950a.e(matcher.group(3))) : j11, file2);
    }

    public static s v(File file, long j10, k kVar) {
        return n(file, j10, -9223372036854775807L, kVar);
    }

    public s m(File file, long j10) {
        C5950a.g(this.f31913d);
        return new s(this.f31910a, this.f31911b, this.f31912c, j10, file);
    }
}
