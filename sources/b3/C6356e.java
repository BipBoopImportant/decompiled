package B3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kb.C9967v;
import kb.C9968w;
import kb.C9970y;
import kb.e0;
import nb.C10076f;
import q3.A;
import q3.C5792c;
import q3.C5807s;
import t3.C5950a;
import t3.N;

/* renamed from: B3.e  reason: case insensitive filesystem */
public final class C6356e {

    /* renamed from: c  reason: collision with root package name */
    public static final C6356e f33039c = new C6356e(C9967v.F(C0505e.f33044d));
    @SuppressLint({"InlinedApi"})

    /* renamed from: d  reason: collision with root package name */
    private static final C9967v<Integer> f33040d = C9967v.H(2, 5, 6);

    /* renamed from: e  reason: collision with root package name */
    static final C9968w<Integer, Integer> f33041e = new C9968w.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<C0505e> f33042a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33043b;

    /* renamed from: B3.e$b */
    private static final class b {
        private static C9970y<Integer> a() {
            C9970y.a i10 = new C9970y.a().i(8, 7);
            int i11 = N.f29462a;
            if (i11 >= 31) {
                i10.i(26, 27);
            }
            if (i11 >= 33) {
                i10.a(30);
            }
            return i10.l();
        }

        public static boolean b(AudioManager audioManager, C6361j jVar) {
            AudioDeviceInfo[] devices = jVar == null ? ((AudioManager) C5950a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{jVar.f33063a};
            C9970y<Integer> a10 = a();
            for (AudioDeviceInfo type : devices) {
                if (a10.contains(Integer.valueOf(type.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: B3.e$c */
    private static final class c {
        public static C9967v<Integer> a(C5792c cVar) {
            C9967v.a t10 = C9967v.t();
            e0<Integer> q10 = C6356e.f33041e.keySet().iterator();
            while (q10.hasNext()) {
                Integer next = q10.next();
                int intValue = next.intValue();
                if (N.f29462a >= N.K(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), cVar.a().f28120a)) {
                    t10.a(next);
                }
            }
            t10.a(2);
            return t10.k();
        }

        public static int b(int i10, int i11, C5792c cVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int M10 = N.M(i12);
                if (M10 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(M10).build(), cVar.a().f28120a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* renamed from: B3.e$d */
    private static final class d {
        public static C6356e a(AudioManager audioManager, C5792c cVar) {
            return new C6356e(C6356e.c(audioManager.getDirectProfilesForAttributes(cVar.a().f28120a)));
        }

        public static C6361j b(AudioManager audioManager, C5792c cVar) {
            try {
                List a10 = ((AudioManager) C5950a.e(audioManager)).getAudioDevicesForAttributes(cVar.a().f28120a);
                if (a10.isEmpty()) {
                    return null;
                }
                return new C6361j((AudioDeviceInfo) a10.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = N.f29464c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static C9967v<C0505e> c(List<AudioProfile> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(C10076f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile a10 = C6352a.a(list.get(i10));
            if (a10.getEncapsulationType() != 1) {
                int a11 = a10.getFormat();
                if (N.E0(a11) || f33041e.containsKey(Integer.valueOf(a11))) {
                    if (hashMap.containsKey(Integer.valueOf(a11))) {
                        ((Set) C5950a.e((Set) hashMap.get(Integer.valueOf(a11)))).addAll(C10076f.c(a10.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(a11), new HashSet(C10076f.c(a10.getChannelMasks())));
                    }
                }
            }
        }
        C9967v.a t10 = C9967v.t();
        for (Map.Entry entry : hashMap.entrySet()) {
            t10.a(new C0505e(((Integer) entry.getKey()).intValue(), (Set<Integer>) (Set) entry.getValue()));
        }
        return t10.k();
    }

    private static C9967v<C0505e> d(int[] iArr, int i10) {
        C9967v.a t10 = C9967v.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int eVar : iArr) {
            t10.a(new C0505e(eVar, i10));
        }
        return t10.k();
    }

    public static C6356e e(Context context, C5792c cVar, AudioDeviceInfo audioDeviceInfo) {
        return g(context, cVar, (N.f29462a < 23 || audioDeviceInfo == null) ? null : new C6361j(audioDeviceInfo));
    }

    @SuppressLint({"InlinedApi"})
    static C6356e f(Context context, Intent intent, C5792c cVar, C6361j jVar) {
        AudioManager audioManager = (AudioManager) C5950a.e(context.getSystemService("audio"));
        if (jVar == null) {
            jVar = N.f29462a >= 33 ? d.b(audioManager, cVar) : null;
        }
        int i10 = N.f29462a;
        if (i10 >= 33 && (N.I0(context) || N.B0(context))) {
            return d.a(audioManager, cVar);
        }
        if (i10 >= 23 && b.b(audioManager, jVar)) {
            return f33039c;
        }
        C9970y.a aVar = new C9970y.a();
        aVar.a(2);
        if (i10 < 29 || (!N.I0(context) && !N.B0(context))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                aVar.j(f33040d);
            }
            if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new C6356e(d(C10076f.l(aVar.l()), 10));
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar.j(C10076f.c(intArrayExtra));
            }
            return new C6356e(d(C10076f.l(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        aVar.j(c.a(cVar));
        return new C6356e(d(C10076f.l(aVar.l()), 10));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static C6356e g(Context context, C5792c cVar, C6361j jVar) {
        return f(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), cVar, jVar);
    }

    private static int h(int i10) {
        int i11 = N.f29462a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(N.f29463b) && i10 == 1) {
            i10 = 2;
        }
        return N.M(i10);
    }

    static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6356e)) {
            return false;
        }
        C6356e eVar = (C6356e) obj;
        return N.t(this.f33042a, eVar.f33042a) && this.f33043b == eVar.f33043b;
    }

    public int hashCode() {
        return this.f33043b + (N.u(this.f33042a) * 31);
    }

    public Pair<Integer, Integer> i(C5807s sVar, C5792c cVar) {
        int f10 = A.f((String) C5950a.e(sVar.f28244o), sVar.f28240k);
        if (!f33041e.containsKey(Integer.valueOf(f10))) {
            return null;
        }
        if (f10 == 18 && !l(18)) {
            f10 = 6;
        } else if ((f10 == 8 && !l(8)) || (f10 == 30 && !l(30))) {
            f10 = 7;
        }
        if (!l(f10)) {
            return null;
        }
        C0505e eVar = (C0505e) C5950a.e(this.f33042a.get(f10));
        int i10 = sVar.f28219D;
        if (i10 == -1 || f10 == 18) {
            int i11 = sVar.f28220E;
            if (i11 == -1) {
                i11 = 48000;
            }
            i10 = eVar.b(i11, cVar);
        } else if (!sVar.f28244o.equals("audio/vnd.dts.uhd;profile=p2") || N.f29462a >= 33) {
            if (!eVar.c(i10)) {
                return null;
            }
        } else if (i10 > 10) {
            return null;
        }
        int h10 = h(i10);
        if (h10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f10), Integer.valueOf(h10));
    }

    public boolean k(C5807s sVar, C5792c cVar) {
        return i(sVar, cVar) != null;
    }

    public boolean l(int i10) {
        return N.r(this.f33042a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f33043b + ", audioProfiles=" + this.f33042a + "]";
    }

    private C6356e(List<C0505e> list) {
        this.f33042a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0505e eVar = list.get(i10);
            this.f33042a.put(eVar.f33045a, eVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33042a.size(); i12++) {
            i11 = Math.max(i11, this.f33042a.valueAt(i12).f33046b);
        }
        this.f33043b = i11;
    }

    /* renamed from: B3.e$e  reason: collision with other inner class name */
    private static final class C0505e {

        /* renamed from: d  reason: collision with root package name */
        public static final C0505e f33044d = (N.f29462a >= 33 ? new C0505e(2, (Set<Integer>) a(10)) : new C0505e(2, 10));

        /* renamed from: a  reason: collision with root package name */
        public final int f33045a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33046b;

        /* renamed from: c  reason: collision with root package name */
        private final C9970y<Integer> f33047c;

        public C0505e(int i10, Set<Integer> set) {
            this.f33045a = i10;
            C9970y<Integer> A10 = C9970y.A(set);
            this.f33047c = A10;
            e0<Integer> q10 = A10.iterator();
            int i11 = 0;
            while (q10.hasNext()) {
                i11 = Math.max(i11, Integer.bitCount(q10.next().intValue()));
            }
            this.f33046b = i11;
        }

        private static C9970y<Integer> a(int i10) {
            C9970y.a aVar = new C9970y.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(N.M(i11)));
            }
            return aVar.l();
        }

        public int b(int i10, C5792c cVar) {
            return this.f33047c != null ? this.f33046b : N.f29462a >= 29 ? c.b(this.f33045a, i10, cVar) : ((Integer) C5950a.e(C6356e.f33041e.getOrDefault(Integer.valueOf(this.f33045a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f33047c == null) {
                return i10 <= this.f33046b;
            }
            int M10 = N.M(i10);
            if (M10 == 0) {
                return false;
            }
            return this.f33047c.contains(Integer.valueOf(M10));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0505e)) {
                return false;
            }
            C0505e eVar = (C0505e) obj;
            return this.f33045a == eVar.f33045a && this.f33046b == eVar.f33046b && N.d(this.f33047c, eVar.f33047c);
        }

        public int hashCode() {
            int i10 = ((this.f33045a * 31) + this.f33046b) * 31;
            C9970y<Integer> yVar = this.f33047c;
            return i10 + (yVar == null ? 0 : yVar.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f33045a + ", maxChannelCount=" + this.f33046b + ", channelMasks=" + this.f33047c + "]";
        }

        public C0505e(int i10, int i11) {
            this.f33045a = i10;
            this.f33046b = i11;
            this.f33047c = null;
        }
    }
}
