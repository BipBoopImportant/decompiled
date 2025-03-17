package com.sugarcube.core.network.models;

import XH.C16796C;
import YH.X;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.g;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.network.models.UploadKt;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackableKt;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.api.NetworkAPIs;
import com.sugarcube.core.network.models.FurnitureType;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b=\u0010>J)\u0010\u0001\u001a\"\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u00050\u0001j\u0010\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\u0005`\u0001H\u0016J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010@J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010¥\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010©\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0011\u0010ª\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010­\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010¯\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010´\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\u0012\u0010µ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0012\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010º\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010SJ\f\u0010½\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0011\u0010¾\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\f\u0010¿\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0011\u0010Á\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0011\u0010Â\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0011\u0010Å\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010\\J\u0005\u0010Æ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0003\u0010Ç\u0001J\u0016\u0010È\u0001\u001a\u00020\u001d2\n\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u0001HÖ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010Ì\u0001\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u0010CR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010IR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010IR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bU\u0010SR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bV\u0010SR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bW\u0010SR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bX\u0010SR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bY\u0010SR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010A\u001a\u0004\bZ\u0010@R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\b[\u0010\\R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\b^\u0010\\R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\b_\u0010\\R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010CR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010CR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bc\u0010LR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bd\u0010LR\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\be\u0010LR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010LR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bg\u0010LR\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bh\u0010LR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bi\u0010LR\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010LR\u0013\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010CR\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bl\u0010LR\u0013\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u0019\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bn\u0010LR\u0015\u0010/\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bo\u0010SR\u0015\u00100\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010T\u001a\u0004\bp\u0010SR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0015\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\bs\u0010\\R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0015\u00106\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\bv\u0010\\R\u0015\u00107\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\bw\u0010\\R\u0015\u00108\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\bx\u0010\\R\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0015\u0010;\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\b{\u0010\\R\u0015\u0010<\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010]\u001a\u0004\b<\u0010\\R\u0013\u0010|\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b}\u0010IR\u0013\u0010~\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010CR\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010CR\u0014\u0010\u0001\u001a\u00020\u001d¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0001\u0010LR\u0014\u0010\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0014\u0010\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u0001\u0010\\R\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0007\u001a\u0005\b\u0001\u0010\\R\u0014\u0010\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006Í\u0001"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/sugarcube/core/analytics/Trackable;", "id", "", "region", "", "name", "description", "price", "priceNumeral", "thumbUrl", "Landroid/net/Uri;", "ecommerceUrl", "imageUrls", "", "modelUrl", "createdAt", "Ljava/time/Instant;", "lastModifiedTs", "qaStatus", "maxX", "", "maxY", "maxZ", "minX", "minY", "minZ", "uncompressedModelSize", "availableInRegion", "", "nest", "stacks", "businessName", "globalProductId", "localItemNumber", "subCatalogs", "categories", "subCategories", "rootCategories", "collections", "features", "swappableItems", "alternatives", "geometryType", "geometryTypes", "configurabilityType", "wallartImageUrls", "displayWidthCm", "displayHeightCm", "stackables", "Lcom/sugarcube/core/network/models/Stackables;", "hidden", "metadata", "Lcom/sugarcube/core/network/models/CatalogItemMetadata;", "availableForHomeDelivery", "availableForCashCarry", "availableForClickCollect", "buyingOption", "Lcom/sugarcube/core/network/models/ProductBuyingOption;", "hasGoesWell", "isSupportedAutodecorate", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lcom/sugarcube/core/network/models/Stackables;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/CatalogItemMetadata;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/ProductBuyingOption;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegion", "()Ljava/lang/String;", "getName", "getDescription", "getPrice", "getPriceNumeral", "getThumbUrl", "()Landroid/net/Uri;", "getEcommerceUrl", "getImageUrls", "()Ljava/util/List;", "getModelUrl", "getCreatedAt", "()Ljava/time/Instant;", "getLastModifiedTs", "getQaStatus", "getMaxX", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxY", "getMaxZ", "getMinX", "getMinY", "getMinZ", "getUncompressedModelSize", "getAvailableInRegion", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNest", "getStacks", "getBusinessName", "getGlobalProductId", "getLocalItemNumber", "getSubCatalogs", "getCategories", "getSubCategories", "getRootCategories", "getCollections", "getFeatures", "getSwappableItems", "getAlternatives", "getGeometryType", "getGeometryTypes", "getConfigurabilityType", "getWallartImageUrls", "getDisplayWidthCm", "getDisplayHeightCm", "getStackables", "()Lcom/sugarcube/core/network/models/Stackables;", "getHidden", "getMetadata", "()Lcom/sugarcube/core/network/models/CatalogItemMetadata;", "getAvailableForHomeDelivery", "getAvailableForCashCarry", "getAvailableForClickCollect", "getBuyingOption", "()Lcom/sugarcube/core/network/models/ProductBuyingOption;", "getHasGoesWell", "assetUrl", "getAssetUrl", "combinableSize", "getCombinableSize", "combinableVariant", "getCombinableVariant", "isCombinable", "()Z", "combinableNodesMeta", "Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "getCombinableNodesMeta", "isCombinableParent", "isStackableChild", "isWallPlaceable2D", "isWallPlaceable3D", "hasCombinableSockets", "getHasCombinableSockets", "furnitureType", "Lcom/sugarcube/core/network/models/FurnitureType;", "getFurnitureType", "()Lcom/sugarcube/core/network/models/FurnitureType;", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lcom/sugarcube/core/network/models/Stackables;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/CatalogItemMetadata;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/ProductBuyingOption;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sugarcube/core/network/models/CatalogItem;", "equals", "other", "", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogItem implements Trackable {
    private final List<Integer> alternatives;
    private final Boolean availableForCashCarry;
    private final Boolean availableForClickCollect;
    private final Boolean availableForHomeDelivery;
    private final Boolean availableInRegion;
    private final String businessName;
    private final ProductBuyingOption buyingOption;
    private final List<String> categories;
    private final List<String> collections;
    private final String combinableSize;
    private final String combinableVariant;
    private final String configurabilityType;
    private final Instant createdAt;
    private final String description;
    private final Double displayHeightCm;
    private final Double displayWidthCm;
    private final Uri ecommerceUrl;
    private final List<String> features;
    private final String geometryType;
    private final List<String> geometryTypes;
    private final String globalProductId;
    private final Boolean hasGoesWell;
    private final Boolean hidden;

    /* renamed from: id  reason: collision with root package name */
    private final Integer f126066id;
    private final List<Uri> imageUrls;
    private final boolean isCombinable;
    private final Boolean isSupportedAutodecorate;
    private final Instant lastModifiedTs;
    private final String localItemNumber;
    private final Double maxX;
    private final Double maxY;
    private final Double maxZ;
    private final CatalogItemMetadata metadata;
    private final Double minX;
    private final Double minY;
    private final Double minZ;
    private final Uri modelUrl;
    private final String name;
    private final Boolean nest;
    private final String price;
    private final String priceNumeral;
    private final String qaStatus;
    private final String region;
    private final List<String> rootCategories;
    private final Stackables stackables;
    private final Boolean stacks;
    private final List<String> subCatalogs;
    private final List<String> subCategories;
    private final List<Integer> swappableItems;
    private final Uri thumbUrl;
    private final Integer uncompressedModelSize;
    private final List<Uri> wallartImageUrls;

    public CatalogItem() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Uri) null, (Uri) null, (List) null, (Uri) null, (Instant) null, (Instant) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (List) null, (String) null, (List) null, (Double) null, (Double) null, (Stackables) null, (Boolean) null, (CatalogItemMetadata) null, (Boolean) null, (Boolean) null, (Boolean) null, (ProductBuyingOption) null, (Boolean) null, (Boolean) null, -1, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogItem copy$default(CatalogItem catalogItem, Integer num, String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, List list, Uri uri3, Instant instant, Instant instant2, String str6, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str7, String str8, String str9, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, String str10, List list10, String str11, List list11, Double d16, Double d17, Stackables stackables2, Boolean bool4, CatalogItemMetadata catalogItemMetadata, Boolean bool5, Boolean bool6, Boolean bool7, ProductBuyingOption productBuyingOption, Boolean bool8, Boolean bool9, int i10, int i11, Object obj) {
        CatalogItem catalogItem2 = catalogItem;
        int i12 = i10;
        int i13 = i11;
        return catalogItem.copy((i12 & 1) != 0 ? catalogItem2.f126066id : num, (i12 & 2) != 0 ? catalogItem2.region : str, (i12 & 4) != 0 ? catalogItem2.name : str2, (i12 & 8) != 0 ? catalogItem2.description : str3, (i12 & 16) != 0 ? catalogItem2.price : str4, (i12 & 32) != 0 ? catalogItem2.priceNumeral : str5, (i12 & 64) != 0 ? catalogItem2.thumbUrl : uri, (i12 & 128) != 0 ? catalogItem2.ecommerceUrl : uri2, (i12 & 256) != 0 ? catalogItem2.imageUrls : list, (i12 & 512) != 0 ? catalogItem2.modelUrl : uri3, (i12 & 1024) != 0 ? catalogItem2.createdAt : instant, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? catalogItem2.lastModifiedTs : instant2, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? catalogItem2.qaStatus : str6, (i12 & 8192) != 0 ? catalogItem2.maxX : d10, (i12 & 16384) != 0 ? catalogItem2.maxY : d11, (i12 & 32768) != 0 ? catalogItem2.maxZ : d12, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? catalogItem2.minX : d13, (i12 & 131072) != 0 ? catalogItem2.minY : d14, (i12 & 262144) != 0 ? catalogItem2.minZ : d15, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? catalogItem2.uncompressedModelSize : num2, (i12 & ImageMetadata.SHADING_MODE) != 0 ? catalogItem2.availableInRegion : bool, (i12 & UploadKt.MAX_CHUNK_SIZE) != 0 ? catalogItem2.nest : bool2, (i12 & 4194304) != 0 ? catalogItem2.stacks : bool3, (i12 & 8388608) != 0 ? catalogItem2.businessName : str7, (i12 & 16777216) != 0 ? catalogItem2.globalProductId : str8, (i12 & 33554432) != 0 ? catalogItem2.localItemNumber : str9, (i12 & 67108864) != 0 ? catalogItem2.subCatalogs : list2, (i12 & 134217728) != 0 ? catalogItem2.categories : list3, (i12 & 268435456) != 0 ? catalogItem2.subCategories : list4, (i12 & 536870912) != 0 ? catalogItem2.rootCategories : list5, (i12 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? catalogItem2.collections : list6, (i12 & Integer.MIN_VALUE) != 0 ? catalogItem2.features : list7, (i13 & 1) != 0 ? catalogItem2.swappableItems : list8, (i13 & 2) != 0 ? catalogItem2.alternatives : list9, (i13 & 4) != 0 ? catalogItem2.geometryType : str10, (i13 & 8) != 0 ? catalogItem2.geometryTypes : list10, (i13 & 16) != 0 ? catalogItem2.configurabilityType : str11, (i13 & 32) != 0 ? catalogItem2.wallartImageUrls : list11, (i13 & 64) != 0 ? catalogItem2.displayWidthCm : d16, (i13 & 128) != 0 ? catalogItem2.displayHeightCm : d17, (i13 & 256) != 0 ? catalogItem2.stackables : stackables2, (i13 & 512) != 0 ? catalogItem2.hidden : bool4, (i13 & 1024) != 0 ? catalogItem2.metadata : catalogItemMetadata, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? catalogItem2.availableForHomeDelivery : bool5, (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? catalogItem2.availableForCashCarry : bool6, (i13 & 8192) != 0 ? catalogItem2.availableForClickCollect : bool7, (i13 & 16384) != 0 ? catalogItem2.buyingOption : productBuyingOption, (i13 & 32768) != 0 ? catalogItem2.hasGoesWell : bool8, (i13 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? catalogItem2.isSupportedAutodecorate : bool9);
    }

    public final Integer component1() {
        return this.f126066id;
    }

    public final Uri component10() {
        return this.modelUrl;
    }

    public final Instant component11() {
        return this.createdAt;
    }

    public final Instant component12() {
        return this.lastModifiedTs;
    }

    public final String component13() {
        return this.qaStatus;
    }

    public final Double component14() {
        return this.maxX;
    }

    public final Double component15() {
        return this.maxY;
    }

    public final Double component16() {
        return this.maxZ;
    }

    public final Double component17() {
        return this.minX;
    }

    public final Double component18() {
        return this.minY;
    }

    public final Double component19() {
        return this.minZ;
    }

    public final String component2() {
        return this.region;
    }

    public final Integer component20() {
        return this.uncompressedModelSize;
    }

    public final Boolean component21() {
        return this.availableInRegion;
    }

    public final Boolean component22() {
        return this.nest;
    }

    public final Boolean component23() {
        return this.stacks;
    }

    public final String component24() {
        return this.businessName;
    }

    public final String component25() {
        return this.globalProductId;
    }

    public final String component26() {
        return this.localItemNumber;
    }

    public final List<String> component27() {
        return this.subCatalogs;
    }

    public final List<String> component28() {
        return this.categories;
    }

    public final List<String> component29() {
        return this.subCategories;
    }

    public final String component3() {
        return this.name;
    }

    public final List<String> component30() {
        return this.rootCategories;
    }

    public final List<String> component31() {
        return this.collections;
    }

    public final List<String> component32() {
        return this.features;
    }

    public final List<Integer> component33() {
        return this.swappableItems;
    }

    public final List<Integer> component34() {
        return this.alternatives;
    }

    public final String component35() {
        return this.geometryType;
    }

    public final List<String> component36() {
        return this.geometryTypes;
    }

    public final String component37() {
        return this.configurabilityType;
    }

    public final List<Uri> component38() {
        return this.wallartImageUrls;
    }

    public final Double component39() {
        return this.displayWidthCm;
    }

    public final String component4() {
        return this.description;
    }

    public final Double component40() {
        return this.displayHeightCm;
    }

    public final Stackables component41() {
        return this.stackables;
    }

    public final Boolean component42() {
        return this.hidden;
    }

    public final CatalogItemMetadata component43() {
        return this.metadata;
    }

    public final Boolean component44() {
        return this.availableForHomeDelivery;
    }

    public final Boolean component45() {
        return this.availableForCashCarry;
    }

    public final Boolean component46() {
        return this.availableForClickCollect;
    }

    public final ProductBuyingOption component47() {
        return this.buyingOption;
    }

    public final Boolean component48() {
        return this.hasGoesWell;
    }

    public final Boolean component49() {
        return this.isSupportedAutodecorate;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.priceNumeral;
    }

    public final Uri component7() {
        return this.thumbUrl;
    }

    public final Uri component8() {
        return this.ecommerceUrl;
    }

    public final List<Uri> component9() {
        return this.imageUrls;
    }

    public final CatalogItem copy(Integer num, String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, List<? extends Uri> list, Uri uri3, Instant instant, Instant instant2, String str6, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str7, String str8, String str9, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<Integer> list8, List<Integer> list9, String str10, List<String> list10, String str11, List<? extends Uri> list11, Double d16, Double d17, Stackables stackables2, Boolean bool4, CatalogItemMetadata catalogItemMetadata, Boolean bool5, Boolean bool6, Boolean bool7, ProductBuyingOption productBuyingOption, Boolean bool8, Boolean bool9) {
        return new CatalogItem(num, str, str2, str3, str4, str5, uri, uri2, list, uri3, instant, instant2, str6, d10, d11, d12, d13, d14, d15, num2, bool, bool2, bool3, str7, str8, str9, list2, list3, list4, list5, list6, list7, list8, list9, str10, list10, str11, list11, d16, d17, stackables2, bool4, catalogItemMetadata, bool5, bool6, bool7, productBuyingOption, bool8, bool9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogItem)) {
            return false;
        }
        CatalogItem catalogItem = (CatalogItem) obj;
        return C17542s.e(this.f126066id, catalogItem.f126066id) && C17542s.e(this.region, catalogItem.region) && C17542s.e(this.name, catalogItem.name) && C17542s.e(this.description, catalogItem.description) && C17542s.e(this.price, catalogItem.price) && C17542s.e(this.priceNumeral, catalogItem.priceNumeral) && C17542s.e(this.thumbUrl, catalogItem.thumbUrl) && C17542s.e(this.ecommerceUrl, catalogItem.ecommerceUrl) && C17542s.e(this.imageUrls, catalogItem.imageUrls) && C17542s.e(this.modelUrl, catalogItem.modelUrl) && C17542s.e(this.createdAt, catalogItem.createdAt) && C17542s.e(this.lastModifiedTs, catalogItem.lastModifiedTs) && C17542s.e(this.qaStatus, catalogItem.qaStatus) && C17542s.e(this.maxX, catalogItem.maxX) && C17542s.e(this.maxY, catalogItem.maxY) && C17542s.e(this.maxZ, catalogItem.maxZ) && C17542s.e(this.minX, catalogItem.minX) && C17542s.e(this.minY, catalogItem.minY) && C17542s.e(this.minZ, catalogItem.minZ) && C17542s.e(this.uncompressedModelSize, catalogItem.uncompressedModelSize) && C17542s.e(this.availableInRegion, catalogItem.availableInRegion) && C17542s.e(this.nest, catalogItem.nest) && C17542s.e(this.stacks, catalogItem.stacks) && C17542s.e(this.businessName, catalogItem.businessName) && C17542s.e(this.globalProductId, catalogItem.globalProductId) && C17542s.e(this.localItemNumber, catalogItem.localItemNumber) && C17542s.e(this.subCatalogs, catalogItem.subCatalogs) && C17542s.e(this.categories, catalogItem.categories) && C17542s.e(this.subCategories, catalogItem.subCategories) && C17542s.e(this.rootCategories, catalogItem.rootCategories) && C17542s.e(this.collections, catalogItem.collections) && C17542s.e(this.features, catalogItem.features) && C17542s.e(this.swappableItems, catalogItem.swappableItems) && C17542s.e(this.alternatives, catalogItem.alternatives) && C17542s.e(this.geometryType, catalogItem.geometryType) && C17542s.e(this.geometryTypes, catalogItem.geometryTypes) && C17542s.e(this.configurabilityType, catalogItem.configurabilityType) && C17542s.e(this.wallartImageUrls, catalogItem.wallartImageUrls) && C17542s.e(this.displayWidthCm, catalogItem.displayWidthCm) && C17542s.e(this.displayHeightCm, catalogItem.displayHeightCm) && C17542s.e(this.stackables, catalogItem.stackables) && C17542s.e(this.hidden, catalogItem.hidden) && C17542s.e(this.metadata, catalogItem.metadata) && C17542s.e(this.availableForHomeDelivery, catalogItem.availableForHomeDelivery) && C17542s.e(this.availableForCashCarry, catalogItem.availableForCashCarry) && C17542s.e(this.availableForClickCollect, catalogItem.availableForClickCollect) && C17542s.e(this.buyingOption, catalogItem.buyingOption) && C17542s.e(this.hasGoesWell, catalogItem.hasGoesWell) && C17542s.e(this.isSupportedAutodecorate, catalogItem.isSupportedAutodecorate);
    }

    public final List<Integer> getAlternatives() {
        return this.alternatives;
    }

    public final Uri getAssetUrl() {
        List<Uri> list;
        List<String> list2;
        String queryParamVal = NetworkAPIs.GeometryType.WallArt.getQueryParamVal();
        boolean z10 = true;
        if (!C17542s.e(this.geometryType, queryParamVal) && ((list2 = this.geometryTypes) == null || !list2.contains(queryParamVal))) {
            z10 = false;
        }
        Uri uri = this.modelUrl;
        if (uri != null && !C17542s.e(uri, Uri.EMPTY)) {
            return uri;
        }
        if (!z10 || (list = this.wallartImageUrls) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final Boolean getAvailableForCashCarry() {
        return this.availableForCashCarry;
    }

    public final Boolean getAvailableForClickCollect() {
        return this.availableForClickCollect;
    }

    public final Boolean getAvailableForHomeDelivery() {
        return this.availableForHomeDelivery;
    }

    public final Boolean getAvailableInRegion() {
        return this.availableInRegion;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final ProductBuyingOption getBuyingOption() {
        return this.buyingOption;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final List<String> getCollections() {
        return this.collections;
    }

    public final List<CatalogCombinableNodeMeta> getCombinableNodesMeta() {
        CatalogCombinableMetadata combinables;
        CatalogItemMetadata catalogItemMetadata = this.metadata;
        if (catalogItemMetadata == null || (combinables = catalogItemMetadata.getCombinables()) == null) {
            return null;
        }
        return combinables.getNodesMeta();
    }

    public final String getCombinableSize() {
        return this.combinableSize;
    }

    public final String getCombinableVariant() {
        return this.combinableVariant;
    }

    public final String getConfigurabilityType() {
        return this.configurabilityType;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Double getDisplayHeightCm() {
        return this.displayHeightCm;
    }

    public final Double getDisplayWidthCm() {
        return this.displayWidthCm;
    }

    public final Uri getEcommerceUrl() {
        return this.ecommerceUrl;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final FurnitureType getFurnitureType() {
        return FurnitureType.Companion.getFurnitureType$default(FurnitureType.Companion, this, false, 2, (Object) null);
    }

    public final String getGeometryType() {
        return this.geometryType;
    }

    public final List<String> getGeometryTypes() {
        return this.geometryTypes;
    }

    public final String getGlobalProductId() {
        return this.globalProductId;
    }

    public final boolean getHasCombinableSockets() {
        return false;
    }

    public final Boolean getHasGoesWell() {
        return this.hasGoesWell;
    }

    public final Boolean getHidden() {
        return this.hidden;
    }

    public final Integer getId() {
        return this.f126066id;
    }

    public final List<Uri> getImageUrls() {
        return this.imageUrls;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final String getLocalItemNumber() {
        return this.localItemNumber;
    }

    public final Double getMaxX() {
        return this.maxX;
    }

    public final Double getMaxY() {
        return this.maxY;
    }

    public final Double getMaxZ() {
        return this.maxZ;
    }

    public final CatalogItemMetadata getMetadata() {
        return this.metadata;
    }

    public final Double getMinX() {
        return this.minX;
    }

    public final Double getMinY() {
        return this.minY;
    }

    public final Double getMinZ() {
        return this.minZ;
    }

    public final Uri getModelUrl() {
        return this.modelUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNest() {
        return this.nest;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPriceNumeral() {
        return this.priceNumeral;
    }

    public final String getQaStatus() {
        return this.qaStatus;
    }

    public final String getRegion() {
        return this.region;
    }

    public final List<String> getRootCategories() {
        return this.rootCategories;
    }

    public final Stackables getStackables() {
        return this.stackables;
    }

    public final Boolean getStacks() {
        return this.stacks;
    }

    public final List<String> getSubCatalogs() {
        return this.subCatalogs;
    }

    public final List<String> getSubCategories() {
        return this.subCategories;
    }

    public final List<Integer> getSwappableItems() {
        return this.swappableItems;
    }

    public final Uri getThumbUrl() {
        return this.thumbUrl;
    }

    public final Integer getUncompressedModelSize() {
        return this.uncompressedModelSize;
    }

    public HashMap<TrackingKey, String> getValues() {
        return X.l(C16796C.a(TrackingKey.ProductId, TrackableKt.toTrackableValue(this.globalProductId)), C16796C.a(TrackingKey.ProductTitle, TrackableKt.toTrackableValue(this.name)), C16796C.a(TrackingKey.ProductType, TrackableKt.toTrackableValue(this.geometryType)), C16796C.a(TrackingKey.FurnitureType, TrackableKt.toTrackableValue(getFurnitureType())), C16796C.a(TrackingKey.LocalItemNumber, TrackableKt.toTrackableValue(this.localItemNumber)), C16796C.a(TrackingKey.URL, TrackableKt.toTrackableValue(this.thumbUrl)));
    }

    public final List<Uri> getWallartImageUrls() {
        return this.wallartImageUrls;
    }

    public int hashCode() {
        Integer num = this.f126066id;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.region;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.price;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceNumeral;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Uri uri = this.thumbUrl;
        int hashCode7 = (hashCode6 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.ecommerceUrl;
        int hashCode8 = (hashCode7 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        List<Uri> list = this.imageUrls;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Uri uri3 = this.modelUrl;
        int hashCode10 = (hashCode9 + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        Instant instant = this.createdAt;
        int hashCode11 = (hashCode10 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.lastModifiedTs;
        int hashCode12 = (hashCode11 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        String str6 = this.qaStatus;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d10 = this.maxX;
        int hashCode14 = (hashCode13 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.maxY;
        int hashCode15 = (hashCode14 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.maxZ;
        int hashCode16 = (hashCode15 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.minX;
        int hashCode17 = (hashCode16 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.minY;
        int hashCode18 = (hashCode17 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.minZ;
        int hashCode19 = (hashCode18 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num2 = this.uncompressedModelSize;
        int hashCode20 = (hashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.availableInRegion;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.nest;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.stacks;
        int hashCode23 = (hashCode22 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str7 = this.businessName;
        int hashCode24 = (hashCode23 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.globalProductId;
        int hashCode25 = (hashCode24 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.localItemNumber;
        int hashCode26 = (hashCode25 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list2 = this.subCatalogs;
        int hashCode27 = (hashCode26 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.categories;
        int hashCode28 = (hashCode27 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.subCategories;
        int hashCode29 = (hashCode28 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.rootCategories;
        int hashCode30 = (hashCode29 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.collections;
        int hashCode31 = (hashCode30 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.features;
        int hashCode32 = (hashCode31 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Integer> list8 = this.swappableItems;
        int hashCode33 = (hashCode32 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<Integer> list9 = this.alternatives;
        int hashCode34 = (hashCode33 + (list9 == null ? 0 : list9.hashCode())) * 31;
        String str10 = this.geometryType;
        int hashCode35 = (hashCode34 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list10 = this.geometryTypes;
        int hashCode36 = (hashCode35 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str11 = this.configurabilityType;
        int hashCode37 = (hashCode36 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<Uri> list11 = this.wallartImageUrls;
        int hashCode38 = (hashCode37 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Double d16 = this.displayWidthCm;
        int hashCode39 = (hashCode38 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.displayHeightCm;
        int hashCode40 = (hashCode39 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Stackables stackables2 = this.stackables;
        int hashCode41 = (hashCode40 + (stackables2 == null ? 0 : stackables2.hashCode())) * 31;
        Boolean bool4 = this.hidden;
        int hashCode42 = (hashCode41 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        CatalogItemMetadata catalogItemMetadata = this.metadata;
        int hashCode43 = (hashCode42 + (catalogItemMetadata == null ? 0 : catalogItemMetadata.hashCode())) * 31;
        Boolean bool5 = this.availableForHomeDelivery;
        int hashCode44 = (hashCode43 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.availableForCashCarry;
        int hashCode45 = (hashCode44 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.availableForClickCollect;
        int hashCode46 = (hashCode45 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        ProductBuyingOption productBuyingOption = this.buyingOption;
        int hashCode47 = (hashCode46 + (productBuyingOption == null ? 0 : productBuyingOption.hashCode())) * 31;
        Boolean bool8 = this.hasGoesWell;
        int hashCode48 = (hashCode47 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isSupportedAutodecorate;
        if (bool9 != null) {
            i10 = bool9.hashCode();
        }
        return hashCode48 + i10;
    }

    public final boolean isCombinable() {
        return this.isCombinable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = getCombinableNodesMeta();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCombinableParent() {
        /*
            r2 = this;
            boolean r0 = r2.isCombinable
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = r2.getCombinableNodesMeta()
            if (r0 == 0) goto L_0x0015
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CatalogItem.isCombinableParent():boolean");
    }

    public final boolean isStackableChild() {
        return C17542s.e(this.stacks, Boolean.TRUE);
    }

    public final Boolean isSupportedAutodecorate() {
        return this.isSupportedAutodecorate;
    }

    public final Boolean isWallPlaceable2D() {
        List<String> list = this.geometryTypes;
        if (list != null) {
            return Boolean.valueOf(list.contains(NetworkAPIs.GeometryType.WallArt.getQueryParamVal()));
        }
        return null;
    }

    public final Boolean isWallPlaceable3D() {
        List<String> list = this.geometryTypes;
        if (list != null) {
            return Boolean.valueOf(list.contains(NetworkAPIs.GeometryType.WallPlaceable.getQueryParamVal()));
        }
        return null;
    }

    public String toString() {
        Integer num = this.f126066id;
        String str = this.region;
        String str2 = this.name;
        String str3 = this.description;
        String str4 = this.price;
        String str5 = this.priceNumeral;
        Uri uri = this.thumbUrl;
        Uri uri2 = this.ecommerceUrl;
        List<Uri> list = this.imageUrls;
        Uri uri3 = this.modelUrl;
        Instant instant = this.createdAt;
        Instant instant2 = this.lastModifiedTs;
        String str6 = this.qaStatus;
        Double d10 = this.maxX;
        Double d11 = this.maxY;
        Double d12 = this.maxZ;
        Double d13 = this.minX;
        Double d14 = this.minY;
        Double d15 = this.minZ;
        Integer num2 = this.uncompressedModelSize;
        Boolean bool = this.availableInRegion;
        Boolean bool2 = this.nest;
        Boolean bool3 = this.stacks;
        String str7 = this.businessName;
        String str8 = this.globalProductId;
        String str9 = this.localItemNumber;
        List<String> list2 = this.subCatalogs;
        List<String> list3 = this.categories;
        List<String> list4 = this.subCategories;
        List<String> list5 = this.rootCategories;
        List<String> list6 = this.collections;
        List<String> list7 = this.features;
        List<Integer> list8 = this.swappableItems;
        List<Integer> list9 = this.alternatives;
        String str10 = this.geometryType;
        List<String> list10 = this.geometryTypes;
        String str11 = this.configurabilityType;
        List<Uri> list11 = this.wallartImageUrls;
        Double d16 = this.displayWidthCm;
        Double d17 = this.displayHeightCm;
        Stackables stackables2 = this.stackables;
        Boolean bool4 = this.hidden;
        CatalogItemMetadata catalogItemMetadata = this.metadata;
        Boolean bool5 = this.availableForHomeDelivery;
        Boolean bool6 = this.availableForCashCarry;
        Boolean bool7 = this.availableForClickCollect;
        ProductBuyingOption productBuyingOption = this.buyingOption;
        Boolean bool8 = this.hasGoesWell;
        Boolean bool9 = this.isSupportedAutodecorate;
        return "CatalogItem(id=" + num + ", region=" + str + ", name=" + str2 + ", description=" + str3 + ", price=" + str4 + ", priceNumeral=" + str5 + ", thumbUrl=" + uri + ", ecommerceUrl=" + uri2 + ", imageUrls=" + list + ", modelUrl=" + uri3 + ", createdAt=" + instant + ", lastModifiedTs=" + instant2 + ", qaStatus=" + str6 + ", maxX=" + d10 + ", maxY=" + d11 + ", maxZ=" + d12 + ", minX=" + d13 + ", minY=" + d14 + ", minZ=" + d15 + ", uncompressedModelSize=" + num2 + ", availableInRegion=" + bool + ", nest=" + bool2 + ", stacks=" + bool3 + ", businessName=" + str7 + ", globalProductId=" + str8 + ", localItemNumber=" + str9 + ", subCatalogs=" + list2 + ", categories=" + list3 + ", subCategories=" + list4 + ", rootCategories=" + list5 + ", collections=" + list6 + ", features=" + list7 + ", swappableItems=" + list8 + ", alternatives=" + list9 + ", geometryType=" + str10 + ", geometryTypes=" + list10 + ", configurabilityType=" + str11 + ", wallartImageUrls=" + list11 + ", displayWidthCm=" + d16 + ", displayHeightCm=" + d17 + ", stackables=" + stackables2 + ", hidden=" + bool4 + ", metadata=" + catalogItemMetadata + ", availableForHomeDelivery=" + bool5 + ", availableForCashCarry=" + bool6 + ", availableForClickCollect=" + bool7 + ", buyingOption=" + productBuyingOption + ", hasGoesWell=" + bool8 + ", isSupportedAutodecorate=" + bool9 + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00c6, code lost:
        r3 = (r3 = r47.getCombinables()).getSelfMeta();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CatalogItem(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, android.net.Uri r11, android.net.Uri r12, java.util.List<? extends android.net.Uri> r13, android.net.Uri r14, java.time.Instant r15, java.time.Instant r16, java.lang.String r17, java.lang.Double r18, java.lang.Double r19, java.lang.Double r20, java.lang.Double r21, java.lang.Double r22, java.lang.Double r23, java.lang.Integer r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.List<java.lang.String> r31, java.util.List<java.lang.String> r32, java.util.List<java.lang.String> r33, java.util.List<java.lang.String> r34, java.util.List<java.lang.String> r35, java.util.List<java.lang.String> r36, java.util.List<java.lang.Integer> r37, java.util.List<java.lang.Integer> r38, java.lang.String r39, java.util.List<java.lang.String> r40, java.lang.String r41, java.util.List<? extends android.net.Uri> r42, java.lang.Double r43, java.lang.Double r44, com.sugarcube.core.network.models.Stackables r45, java.lang.Boolean r46, com.sugarcube.core.network.models.CatalogItemMetadata r47, java.lang.Boolean r48, java.lang.Boolean r49, java.lang.Boolean r50, com.sugarcube.core.network.models.ProductBuyingOption r51, java.lang.Boolean r52, java.lang.Boolean r53) {
        /*
            r4 = this;
            r0 = r4
            r1 = r47
            r4.<init>()
            r2 = r5
            r0.f126066id = r2
            r2 = r6
            r0.region = r2
            r2 = r7
            r0.name = r2
            r2 = r8
            r0.description = r2
            r2 = r9
            r0.price = r2
            r2 = r10
            r0.priceNumeral = r2
            r2 = r11
            r0.thumbUrl = r2
            r2 = r12
            r0.ecommerceUrl = r2
            r2 = r13
            r0.imageUrls = r2
            r2 = r14
            r0.modelUrl = r2
            r2 = r15
            r0.createdAt = r2
            r2 = r16
            r0.lastModifiedTs = r2
            r2 = r17
            r0.qaStatus = r2
            r2 = r18
            r0.maxX = r2
            r2 = r19
            r0.maxY = r2
            r2 = r20
            r0.maxZ = r2
            r2 = r21
            r0.minX = r2
            r2 = r22
            r0.minY = r2
            r2 = r23
            r0.minZ = r2
            r2 = r24
            r0.uncompressedModelSize = r2
            r2 = r25
            r0.availableInRegion = r2
            r2 = r26
            r0.nest = r2
            r2 = r27
            r0.stacks = r2
            r2 = r28
            r0.businessName = r2
            r2 = r29
            r0.globalProductId = r2
            r2 = r30
            r0.localItemNumber = r2
            r2 = r31
            r0.subCatalogs = r2
            r2 = r32
            r0.categories = r2
            r2 = r33
            r0.subCategories = r2
            r2 = r34
            r0.rootCategories = r2
            r2 = r35
            r0.collections = r2
            r2 = r36
            r0.features = r2
            r2 = r37
            r0.swappableItems = r2
            r2 = r38
            r0.alternatives = r2
            r2 = r39
            r0.geometryType = r2
            r2 = r40
            r0.geometryTypes = r2
            r2 = r41
            r0.configurabilityType = r2
            r2 = r42
            r0.wallartImageUrls = r2
            r2 = r43
            r0.displayWidthCm = r2
            r2 = r44
            r0.displayHeightCm = r2
            r2 = r45
            r0.stackables = r2
            r2 = r46
            r0.hidden = r2
            r0.metadata = r1
            r2 = r48
            r0.availableForHomeDelivery = r2
            r2 = r49
            r0.availableForCashCarry = r2
            r2 = r50
            r0.availableForClickCollect = r2
            r2 = r51
            r0.buyingOption = r2
            r2 = r52
            r0.hasGoesWell = r2
            r2 = r53
            r0.isSupportedAutodecorate = r2
            r2 = 0
            if (r1 == 0) goto L_0x00d1
            com.sugarcube.core.network.models.CatalogCombinableMetadata r3 = r47.getCombinables()
            if (r3 == 0) goto L_0x00d1
            com.sugarcube.core.network.models.CatalogCombinableSelfMeta r3 = r3.getSelfMeta()
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = r3.getSize()
            goto L_0x00d2
        L_0x00d1:
            r3 = r2
        L_0x00d2:
            r0.combinableSize = r3
            if (r1 == 0) goto L_0x00e7
            com.sugarcube.core.network.models.CatalogCombinableMetadata r3 = r47.getCombinables()
            if (r3 == 0) goto L_0x00e7
            com.sugarcube.core.network.models.CatalogCombinableSelfMeta r3 = r3.getSelfMeta()
            if (r3 == 0) goto L_0x00e7
            java.lang.String r3 = r3.getVariant()
            goto L_0x00e8
        L_0x00e7:
            r3 = r2
        L_0x00e8:
            r0.combinableVariant = r3
            if (r1 == 0) goto L_0x00f6
            com.sugarcube.core.network.models.CatalogCombinableMetadata r1 = r47.getCombinables()
            if (r1 == 0) goto L_0x00f6
            com.sugarcube.core.network.models.CatalogCombinableSelfMeta r2 = r1.getSelfMeta()
        L_0x00f6:
            if (r2 == 0) goto L_0x00fa
            r1 = 1
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            r0.isCombinable = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CatalogItem.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, android.net.Uri, java.util.List, android.net.Uri, java.time.Instant, java.time.Instant, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Double, java.lang.Double, com.sugarcube.core.network.models.Stackables, java.lang.Boolean, com.sugarcube.core.network.models.CatalogItemMetadata, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.sugarcube.core.network.models.ProductBuyingOption, java.lang.Boolean, java.lang.Boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogItem(java.lang.Integer r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, android.net.Uri r55, android.net.Uri r56, java.util.List r57, android.net.Uri r58, java.time.Instant r59, java.time.Instant r60, java.lang.String r61, java.lang.Double r62, java.lang.Double r63, java.lang.Double r64, java.lang.Double r65, java.lang.Double r66, java.lang.Double r67, java.lang.Integer r68, java.lang.Boolean r69, java.lang.Boolean r70, java.lang.Boolean r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.util.List r75, java.util.List r76, java.util.List r77, java.util.List r78, java.util.List r79, java.util.List r80, java.util.List r81, java.util.List r82, java.lang.String r83, java.util.List r84, java.lang.String r85, java.util.List r86, java.lang.Double r87, java.lang.Double r88, com.sugarcube.core.network.models.Stackables r89, java.lang.Boolean r90, com.sugarcube.core.network.models.CatalogItemMetadata r91, java.lang.Boolean r92, java.lang.Boolean r93, java.lang.Boolean r94, com.sugarcube.core.network.models.ProductBuyingOption r95, java.lang.Boolean r96, java.lang.Boolean r97, int r98, int r99, kotlin.jvm.internal.DefaultConstructorMarker r100) {
        /*
            r48 = this;
            r0 = r98
            r1 = r99
            r2 = r0 & 1
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0011
        L_0x000f:
            r2 = r49
        L_0x0011:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0019
        L_0x0017:
            r4 = r50
        L_0x0019:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x001f
            r6 = 0
            goto L_0x0021
        L_0x001f:
            r6 = r51
        L_0x0021:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0027
            r7 = 0
            goto L_0x0029
        L_0x0027:
            r7 = r52
        L_0x0029:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002f
            r8 = 0
            goto L_0x0031
        L_0x002f:
            r8 = r53
        L_0x0031:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0037
            r9 = 0
            goto L_0x0039
        L_0x0037:
            r9 = r54
        L_0x0039:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0040
            android.net.Uri r10 = android.net.Uri.EMPTY
            goto L_0x0042
        L_0x0040:
            r10 = r55
        L_0x0042:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0049
            android.net.Uri r11 = android.net.Uri.EMPTY
            goto L_0x004b
        L_0x0049:
            r11 = r56
        L_0x004b:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0056
            android.net.Uri r12 = android.net.Uri.EMPTY
            java.util.List r12 = YH.C16877v.e(r12)
            goto L_0x0058
        L_0x0056:
            r12 = r57
        L_0x0058:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x005f
            android.net.Uri r13 = android.net.Uri.EMPTY
            goto L_0x0061
        L_0x005f:
            r13 = r58
        L_0x0061:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0067
            r14 = 0
            goto L_0x0069
        L_0x0067:
            r14 = r59
        L_0x0069:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x006f
            r15 = 0
            goto L_0x0071
        L_0x006f:
            r15 = r60
        L_0x0071:
            r5 = r0 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0077
            r5 = 0
            goto L_0x0079
        L_0x0077:
            r5 = r61
        L_0x0079:
            r100 = r3
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0081
            r3 = 0
            goto L_0x0083
        L_0x0081:
            r3 = r62
        L_0x0083:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            goto L_0x008d
        L_0x008b:
            r3 = r63
        L_0x008d:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0097
            r18 = 0
            goto L_0x0099
        L_0x0097:
            r18 = r64
        L_0x0099:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x00a2
            r20 = 0
            goto L_0x00a4
        L_0x00a2:
            r20 = r65
        L_0x00a4:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ad
            r21 = 0
            goto L_0x00af
        L_0x00ad:
            r21 = r66
        L_0x00af:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00b8
            r22 = 0
            goto L_0x00ba
        L_0x00b8:
            r22 = r67
        L_0x00ba:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00c3
            r23 = r100
            goto L_0x00c5
        L_0x00c3:
            r23 = r68
        L_0x00c5:
            r24 = 1048576(0x100000, float:1.469368E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00ce
            java.lang.Boolean r24 = java.lang.Boolean.TRUE
            goto L_0x00d0
        L_0x00ce:
            r24 = r69
        L_0x00d0:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00d9
            java.lang.Boolean r25 = java.lang.Boolean.FALSE
            goto L_0x00db
        L_0x00d9:
            r25 = r70
        L_0x00db:
            r26 = 4194304(0x400000, float:5.877472E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00e4
            java.lang.Boolean r26 = java.lang.Boolean.FALSE
            goto L_0x00e6
        L_0x00e4:
            r26 = r71
        L_0x00e6:
            r27 = 8388608(0x800000, float:1.17549435E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00ef
            r27 = 0
            goto L_0x00f1
        L_0x00ef:
            r27 = r72
        L_0x00f1:
            r28 = 16777216(0x1000000, float:2.3509887E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00fa
            r28 = 0
            goto L_0x00fc
        L_0x00fa:
            r28 = r73
        L_0x00fc:
            r29 = 33554432(0x2000000, float:9.403955E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0105
            r29 = 0
            goto L_0x0107
        L_0x0105:
            r29 = r74
        L_0x0107:
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x0110
            r30 = 0
            goto L_0x0112
        L_0x0110:
            r30 = r75
        L_0x0112:
            r31 = 134217728(0x8000000, float:3.85186E-34)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x011b
            r31 = 0
            goto L_0x011d
        L_0x011b:
            r31 = r76
        L_0x011d:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0126
            r32 = 0
            goto L_0x0128
        L_0x0126:
            r32 = r77
        L_0x0128:
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0131
            r33 = 0
            goto L_0x0133
        L_0x0131:
            r33 = r78
        L_0x0133:
            r34 = 1073741824(0x40000000, float:2.0)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x013c
            r34 = 0
            goto L_0x013e
        L_0x013c:
            r34 = r79
        L_0x013e:
            r35 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r35
            if (r0 == 0) goto L_0x0146
            r0 = 0
            goto L_0x0148
        L_0x0146:
            r0 = r80
        L_0x0148:
            r35 = r1 & 1
            if (r35 == 0) goto L_0x014f
            r35 = 0
            goto L_0x0151
        L_0x014f:
            r35 = r81
        L_0x0151:
            r36 = r1 & 2
            if (r36 == 0) goto L_0x0158
            r36 = 0
            goto L_0x015a
        L_0x0158:
            r36 = r82
        L_0x015a:
            r37 = r1 & 4
            if (r37 == 0) goto L_0x0161
            r37 = 0
            goto L_0x0163
        L_0x0161:
            r37 = r83
        L_0x0163:
            r38 = r1 & 8
            if (r38 == 0) goto L_0x016a
            r38 = 0
            goto L_0x016c
        L_0x016a:
            r38 = r84
        L_0x016c:
            r39 = r1 & 16
            if (r39 == 0) goto L_0x0173
            r39 = 0
            goto L_0x0175
        L_0x0173:
            r39 = r85
        L_0x0175:
            r40 = r1 & 32
            if (r40 == 0) goto L_0x017c
            r40 = 0
            goto L_0x017e
        L_0x017c:
            r40 = r86
        L_0x017e:
            r41 = r1 & 64
            if (r41 == 0) goto L_0x0185
            r41 = 0
            goto L_0x0187
        L_0x0185:
            r41 = r87
        L_0x0187:
            r98 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018f
            r0 = 0
            goto L_0x0191
        L_0x018f:
            r0 = r88
        L_0x0191:
            r100 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0199
            r0 = 0
            goto L_0x019b
        L_0x0199:
            r0 = r89
        L_0x019b:
            r42 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x01a6
        L_0x01a4:
            r0 = r90
        L_0x01a6:
            r43 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01ae
            r0 = 0
            goto L_0x01b0
        L_0x01ae:
            r0 = r91
        L_0x01b0:
            r44 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01b8
            r0 = 0
            goto L_0x01ba
        L_0x01b8:
            r0 = r92
        L_0x01ba:
            r45 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01c2
            r0 = 0
            goto L_0x01c4
        L_0x01c2:
            r0 = r93
        L_0x01c4:
            r46 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01cc
            r0 = 0
            goto L_0x01ce
        L_0x01cc:
            r0 = r94
        L_0x01ce:
            r47 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01d6
            r0 = 0
            goto L_0x01d8
        L_0x01d6:
            r0 = r95
        L_0x01d8:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01df
            java.lang.Boolean r17 = java.lang.Boolean.FALSE
            goto L_0x01e1
        L_0x01df:
            r17 = r96
        L_0x01e1:
            r1 = r1 & r19
            if (r1 == 0) goto L_0x01e8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x01ea
        L_0x01e8:
            r1 = r97
        L_0x01ea:
            r49 = r48
            r50 = r2
            r51 = r4
            r52 = r6
            r53 = r7
            r54 = r8
            r55 = r9
            r56 = r10
            r57 = r11
            r58 = r12
            r59 = r13
            r60 = r14
            r61 = r15
            r62 = r5
            r63 = r16
            r64 = r3
            r65 = r18
            r66 = r20
            r67 = r21
            r68 = r22
            r69 = r23
            r70 = r24
            r71 = r25
            r72 = r26
            r73 = r27
            r74 = r28
            r75 = r29
            r76 = r30
            r77 = r31
            r78 = r32
            r79 = r33
            r80 = r34
            r81 = r98
            r82 = r35
            r83 = r36
            r84 = r37
            r85 = r38
            r86 = r39
            r87 = r40
            r88 = r41
            r89 = r100
            r90 = r42
            r91 = r43
            r92 = r44
            r93 = r45
            r94 = r46
            r95 = r47
            r96 = r0
            r97 = r17
            r98 = r1
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CatalogItem.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, android.net.Uri, java.util.List, android.net.Uri, java.time.Instant, java.time.Instant, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Double, java.lang.Double, com.sugarcube.core.network.models.Stackables, java.lang.Boolean, com.sugarcube.core.network.models.CatalogItemMetadata, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.sugarcube.core.network.models.ProductBuyingOption, java.lang.Boolean, java.lang.Boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
