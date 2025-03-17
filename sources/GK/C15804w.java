package GK;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LGK/w;", "", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.w  reason: case insensitive filesystem */
public interface C15804w {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LGK/w$a;", "", "LGK/B;", "t", "()LGK/B;", "request", "LGK/D;", "b", "(LGK/B;)LGK/D;", "LGK/j;", "d", "()LGK/j;", "LGK/e;", "call", "()LGK/e;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "a", "(ILjava/util/concurrent/TimeUnit;)LGK/w$a;", "e", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.w$a */
    public interface a {
        a a(int i10, TimeUnit timeUnit);

        C15776D b(C15774B b10);

        a c(int i10, TimeUnit timeUnit);

        C15786e call();

        C15791j d();

        a e(int i10, TimeUnit timeUnit);

        C15774B t();
    }

    C15776D intercept(a aVar);
}
