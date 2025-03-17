package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.g;
import com.android.volley.h;
import com.android.volley.k;
import com.android.volley.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public class b implements h {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected final g f46249a;

    /* renamed from: b  reason: collision with root package name */
    private final a f46250b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f46251c;

    public b(a aVar) {
        this(aVar, new c(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    public k a(n<?> nVar) {
        byte[] bArr;
        f fVar;
        IOException iOException;
        f a10;
        int d10;
        List<g> c10;
        n<?> nVar2 = nVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                a10 = this.f46250b.a(nVar2, e.c(nVar.getCacheEntry()));
                try {
                    d10 = a10.d();
                    c10 = a10.c();
                    break;
                } catch (IOException e10) {
                    bArr = null;
                    fVar = a10;
                    iOException = e10;
                }
            } catch (IOException e11) {
                iOException = e11;
                fVar = null;
                bArr = null;
            }
            l.a(nVar2, l.e(nVar, iOException, elapsedRealtime, fVar, bArr));
        }
        if (d10 == 304) {
            return l.b(nVar2, SystemClock.elapsedRealtime() - elapsedRealtime, c10);
        }
        InputStream a11 = a10.a();
        byte[] c11 = a11 != null ? l.c(a11, a10.b(), this.f46251c) : new byte[0];
        l.d(SystemClock.elapsedRealtime() - elapsedRealtime, nVar2, c11, d10);
        if (d10 < 200 || d10 > 299) {
            throw new IOException();
        }
        return new k(d10, c11, false, SystemClock.elapsedRealtime() - elapsedRealtime, c10);
    }

    public b(a aVar, c cVar) {
        this.f46250b = aVar;
        this.f46249a = aVar;
        this.f46251c = cVar;
    }
}
