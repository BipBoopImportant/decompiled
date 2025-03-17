package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import YH.C16877v;
import YH.X;
import com.contentsquare.android.sdk.C7162y0;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class W extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47195m;

    /* renamed from: n  reason: collision with root package name */
    public final String f47196n;

    /* renamed from: o  reason: collision with root package name */
    public final Long f47197o;

    /* renamed from: p  reason: collision with root package name */
    public final Map<String, String> f47198p;

    public static final class a extends C7162y0.a<W> {

        /* renamed from: k  reason: collision with root package name */
        public String f47199k;

        /* renamed from: l  reason: collision with root package name */
        public String f47200l;

        /* renamed from: m  reason: collision with root package name */
        public Long f47201m;

        /* renamed from: n  reason: collision with root package name */
        public Map<String, String> f47202n = X.j();

        public a() {
            super(25);
        }

        public final C7162y0 a() {
            return new W(this);
        }
    }

    public static final class b extends C17544u implements C17642l<Map.Entry<? extends String, ? extends String>, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f47203c = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            C17542s.j(entry, "<name for destructuring parameter 0>");
            return ((String) entry.getKey()) + ':' + ((String) entry.getValue());
        }
    }

    public W(a aVar) {
        super(aVar);
        this.f47195m = aVar.f47199k;
        this.f47196n = aVar.f47200l;
        this.f47197o = aVar.f47201m;
        this.f47198p = aVar.f47202n;
    }

    public final void a() {
        String G02 = C16877v.G0(C16877v.k1(this.f47198p.entrySet(), 10), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.f47203c, 30, (Object) null);
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("Custom Error (from ");
        sb2.append(this.f47196n);
        sb2.append(") : ");
        String str = this.f47195m;
        sb2.append(str != null ? C15854t.K1(str, 100) : null);
        sb2.append(" - Attributes: [");
        sb2.append(G02);
        sb2.append(']');
        cVar.j(sb2.toString());
    }
}
