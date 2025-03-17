package a0;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class g0 implements h0 {
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
