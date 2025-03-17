package bD;

import G3.C6497q;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import w3.m;
import x3.c;
import x3.r;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/media3/exoplayer/ExoPlayer$b;", "Landroid/content/Context;", "context", "Lx3/r;", "cache", "a", "(Landroidx/media3/exoplayer/ExoPlayer$b;Landroid/content/Context;Lx3/r;)Landroidx/media3/exoplayer/ExoPlayer$b;", "video_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bD.a  reason: case insensitive filesystem */
public final class C14007a {
    public static final ExoPlayer.b a(ExoPlayer.b bVar, Context context, r rVar) {
        C17542s.j(bVar, "<this>");
        C17542s.j(context, "context");
        C17542s.j(rVar, "cache");
        c.C0495c e10 = new c.C0495c().d(rVar).e(new m.b());
        C17542s.i(e10, "setUpstreamDataSourceFactory(...)");
        bVar.l(new C6497q(context).q(e10));
        return bVar;
    }
}
