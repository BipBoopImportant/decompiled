package DE;

import CE.C12699f;
import FE.C12869a;
import FE.C12871c;
import com.optimizely.ab.config.ProjectConfig;
import com.optimizely.ab.event.internal.payload.Attribute;
import com.optimizely.ab.event.internal.payload.Decision;
import com.optimizely.ab.event.internal.payload.Event;
import com.optimizely.ab.event.internal.payload.EventBatch;
import com.optimizely.ab.event.internal.payload.Snapshot;
import com.optimizely.ab.event.internal.payload.Visitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: DE.e  reason: case insensitive filesystem */
public class C12750e {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f108624a = LoggerFactory.getLogger((Class<?>) C12750e.class);

    private static List<Attribute> a(ProjectConfig projectConfig, Map<String, ?> map) {
        String attributeId;
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!((String) next.getKey()).isEmpty() && next.getValue() != null) {
                    if (((next.getValue() instanceof String) || (next.getValue() instanceof Boolean) || C12869a.a(next.getValue())) && (attributeId = projectConfig.getAttributeId(projectConfig, (String) next.getKey())) != null) {
                        arrayList.add(new Attribute.Builder().setEntityId(attributeId).setKey((String) next.getKey()).setType("custom").setValue(next.getValue()).build());
                    }
                }
            }
        }
        if (projectConfig.getBotFiltering() != null) {
            Attribute.Builder builder = new Attribute.Builder();
            C12871c cVar = C12871c.BOT_FILTERING_ATTRIBUTE;
            arrayList.add(builder.setEntityId(cVar.toString()).setKey(cVar.toString()).setType("custom").setValue(projectConfig.getBotFiltering()).build());
        }
        return arrayList;
    }

    public static C12699f b(h hVar) {
        return c(Collections.singletonList(hVar));
    }

    public static C12699f c(List<h> list) {
        EventBatch.Builder builder = new EventBatch.Builder();
        ArrayList arrayList = new ArrayList(list.size());
        for (h next : list) {
            if (next != null) {
                if (next instanceof C12751f) {
                    arrayList.add(e((C12751f) next));
                }
                if (next instanceof C12749d) {
                    arrayList.add(d((C12749d) next));
                }
                ProjectConfig b10 = next.a().b();
                builder.setClientName(C12748c.a().getClientEngineValue()).setClientVersion(C12747b.a()).setAccountId(b10.getAccountId()).setAnonymizeIp(Boolean.valueOf(b10.getAnonymizeIP())).setProjectId(b10.getProjectId()).setRevision(b10.getRevision());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        builder.setVisitors(arrayList);
        return new C12699f(C12699f.a.POST, "https://logx.optimizely.com/v1/events", Collections.emptyMap(), builder.build());
    }

    private static Visitor d(C12749d dVar) {
        if (dVar == null) {
            return null;
        }
        g a10 = dVar.a();
        return new Visitor.Builder().setVisitorId(a10.c()).setAttributes(a(a10.b(), a10.a())).setSnapshots(Collections.singletonList(new Snapshot.Builder().setEvents(Collections.singletonList(new Event.Builder().setTimestamp(dVar.b()).setUuid(dVar.c()).setEntityId(dVar.d()).setKey(dVar.e()).setRevenue(dVar.f()).setTags(dVar.g()).setType(dVar.e()).setValue(dVar.h()).build())).build())).build();
    }

    private static Visitor e(C12751f fVar) {
        if (fVar == null) {
            return null;
        }
        g a10 = fVar.a();
        return new Visitor.Builder().setVisitorId(a10.c()).setAttributes(a(a10.b(), a10.a())).setSnapshots(Collections.singletonList(new Snapshot.Builder().setDecisions(Collections.singletonList(new Decision.Builder().setCampaignId(fVar.e()).setExperimentId(fVar.d()).setVariationId(fVar.g()).setMetadata(fVar.f()).setIsCampaignHoldback(false).build())).setEvents(Collections.singletonList(new Event.Builder().setTimestamp(fVar.b()).setUuid(fVar.c()).setEntityId(fVar.e()).setKey("campaign_activated").setType("campaign_activated").build())).build())).build();
    }
}
