package Ic;

import Fb.l;

public class i extends l {

    /* renamed from: a  reason: collision with root package name */
    private final a f61020a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int value;

        private a(int i10) {
            this.value = i10;
        }
    }

    public i(String str) {
        super(str);
        this.f61020a = a.UNKNOWN;
    }

    public i(String str, Throwable th2) {
        super(str, th2);
        this.f61020a = a.UNKNOWN;
    }

    public i(String str, a aVar) {
        super(str);
        this.f61020a = aVar;
    }

    public i(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f61020a = aVar;
    }
}
