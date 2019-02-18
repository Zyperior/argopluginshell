package mypackage;

import http.server.response.HttpResponse;
import http.server.serviceloader.ARGOPlugin;
import http.server.serviceloader.PluginType;

import java.util.List;
import java.util.Map;

/**
 * PluginType-tag should be what the html object sends as URL in HTTP-request.
 */
@PluginType("tag")
public class MyPluginMainClass implements ARGOPlugin {

    @Override
    public HttpResponse doSomething(String doThis, Map<String, List<String>> params) {
        return null;
    }
}
