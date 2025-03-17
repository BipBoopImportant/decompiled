package yE;

import android.content.Context;
import androidx.work.B;
import androidx.work.C;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7054x;
import androidx.work.C7056z;
import androidx.work.I;
import androidx.work.S;
import androidx.work.T;
import java.util.AbstractMap;
import java.util.concurrent.TimeUnit;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f132222a = true;

    public static AbstractMap.SimpleEntry<T, C> a(Context context, String str, Class cls, C7037f fVar, long j10) {
        c(context, str);
        if (j10 < 15) {
            j10 = 15;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        T.a m10 = ((I.a) ((I.a) new I.a((Class<? extends C7054x>) cls, j10, timeUnit).a(str)).n(fVar)).m(j10, timeUnit);
        if (f132222a) {
            m10.j(new C7036e.a().b(C7056z.CONNECTED).a());
        }
        T b10 = m10.b();
        return new AbstractMap.SimpleEntry<>(b10, S.i(context).d(b10));
    }

    public static AbstractMap.SimpleEntry<T, C> b(Context context, String str, Class cls, C7037f fVar, Long l10) {
        T.a a10 = ((B.a) new B.a(cls).n(fVar)).a(str);
        if (f132222a) {
            a10.j(new C7036e.a().b(C7056z.CONNECTED).a());
        }
        if (l10.longValue() > 0) {
            a10.i(C7032a.LINEAR, l10.longValue(), TimeUnit.MILLISECONDS);
        }
        T b10 = a10.b();
        return new AbstractMap.SimpleEntry<>(b10, S.i(context).d(b10));
    }

    public static void c(Context context, String str) {
        S.i(context).a(str);
    }
}
