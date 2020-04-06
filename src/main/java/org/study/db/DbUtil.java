package org.study.db;

import org.study.model.Ne;
import org.study.model.Site;

import java.util.List;

public class DbUtil {
    public static List<Site> listSite() {
        Site site1 = new Site(1, "Site1", null);
        new Ne(1, 1, "Ne1", "950");
        return null;
    }

    public static List<Ne> listNe() {
        new Ne(1, 1, "Ne1", "950");
        return null;
    }
}
