package cucumberTestTask.api;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class BaseApi extends BaseEndpoints {

    public transient String pathWithQuery;
    //required parameters
    public String access_key;
    public String query;
    private transient String subdirectory;

    public String getPathWithQuery() {
        return pathWithQuery;
    }

    public void setPathWithQuery() throws IllegalAccessException {
        try {
            Map<String, Object> map = new HashMap<>();
            Field[] fields = getClass().getFields();
            for (Field f : fields) {
                if (!(f.get(this) == null || Modifier.toString(f.getModifiers()).contains("transient") || f.getName().contains("baseUrl"))) {
                    map.put(f.getName(), f.get(this));
                }
            }
            //getting all parameters from class
            int size = map.size();
            String url = "";
            if(size > 0) url += "?";
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                url = url.concat(key + "=" + value.toString());
                if (size > 1) {
                    url += "&";
                    size--;
                }
            }
            this.pathWithQuery = subdirectory + url;
        } catch (IllegalAccessException e) {
            throw new IllegalAccessException("Unable to create path: " + e.getMessage());
        }
    }

    public String getSubdirectory() {
        return subdirectory;
    }

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    public String getAccess_key() {
        return access_key;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
