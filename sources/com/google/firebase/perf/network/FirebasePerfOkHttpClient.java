package com.google.firebase.perf.network;

import Bc.g;
import Dc.d;
import Fc.k;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15786e;
import GK.C15787f;
import GK.C15803v;
import GK.C15805x;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import java.io.IOException;

public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    static void a(C15776D d10, g gVar, long j10, long j11) {
        C15774B z10 = d10.z();
        if (z10 != null) {
            gVar.t(z10.k().v().toString());
            gVar.j(z10.h());
            if (z10.a() != null) {
                long a10 = z10.a().a();
                if (a10 != -1) {
                    gVar.m(a10);
                }
            }
            C15777E c10 = d10.c();
            if (c10 != null) {
                long g10 = c10.g();
                if (g10 != -1) {
                    gVar.p(g10);
                }
                C15805x h10 = c10.h();
                if (h10 != null) {
                    gVar.o(h10.toString());
                }
            }
            gVar.k(d10.g());
            gVar.n(j10);
            gVar.r(j11);
            gVar.b();
        }
    }

    @Keep
    public static void enqueue(C15786e eVar, C15787f fVar) {
        l lVar = new l();
        C15787f fVar2 = fVar;
        eVar.N0(new d(fVar2, k.k(), lVar, lVar.e()));
    }

    @Keep
    public static C15776D execute(C15786e eVar) {
        g c10 = g.c(k.k());
        l lVar = new l();
        long e10 = lVar.e();
        try {
            C15776D execute = eVar.execute();
            a(execute, c10, e10, lVar.c());
            return execute;
        } catch (IOException e11) {
            C15774B t10 = eVar.t();
            if (t10 != null) {
                C15803v k10 = t10.k();
                if (k10 != null) {
                    c10.t(k10.v().toString());
                }
                if (t10.h() != null) {
                    c10.j(t10.h());
                }
            }
            c10.n(e10);
            c10.r(lVar.c());
            d.d(c10);
            throw e11;
        }
    }
}
