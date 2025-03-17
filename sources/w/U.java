package w;

import C.C4391e0;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import z.m;

public class U {

    /* renamed from: a  reason: collision with root package name */
    private final a f31060a;

    /* renamed from: b  reason: collision with root package name */
    private final m f31061b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, Size[]> f31062c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, Size[]> f31063d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, Size[]> f31064e = new HashMap();

    interface a {
        StreamConfigurationMap a();

        Size[] b(int i10);

        int[] c();

        Size[] d(int i10);
    }

    private U(StreamConfigurationMap streamConfigurationMap, m mVar) {
        this.f31060a = new V(streamConfigurationMap);
        this.f31061b = mVar;
    }

    static U e(StreamConfigurationMap streamConfigurationMap, m mVar) {
        return new U(streamConfigurationMap, mVar);
    }

    public Size[] a(int i10) {
        if (!this.f31063d.containsKey(Integer.valueOf(i10))) {
            Size[] d10 = this.f31060a.d(i10);
            if (d10 != null && d10.length > 0) {
                d10 = this.f31061b.b(d10, i10);
            }
            this.f31063d.put(Integer.valueOf(i10), d10);
            if (d10 != null) {
                return (Size[]) d10.clone();
            }
            return null;
        } else if (this.f31063d.get(Integer.valueOf(i10)) == null) {
            return null;
        } else {
            return (Size[]) this.f31063d.get(Integer.valueOf(i10)).clone();
        }
    }

    public int[] b() {
        int[] c10 = this.f31060a.c();
        if (c10 == null) {
            return null;
        }
        return (int[]) c10.clone();
    }

    public Size[] c(int i10) {
        if (!this.f31062c.containsKey(Integer.valueOf(i10))) {
            Size[] b10 = this.f31060a.b(i10);
            if (b10 == null || b10.length == 0) {
                C4391e0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i10);
                return b10;
            }
            Size[] b11 = this.f31061b.b(b10, i10);
            this.f31062c.put(Integer.valueOf(i10), b11);
            return (Size[]) b11.clone();
        } else if (this.f31062c.get(Integer.valueOf(i10)) == null) {
            return null;
        } else {
            return (Size[]) this.f31062c.get(Integer.valueOf(i10)).clone();
        }
    }

    public StreamConfigurationMap d() {
        return this.f31060a.a();
    }
}
