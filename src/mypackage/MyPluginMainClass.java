package mypackage;

import http.server.serviceloader.ARGOPlugin;
import http.server.serviceloader.PluginType;

/**
 * PluginType-tag should be what the html object sends as URL in HTTP-request.
 */
@PluginType("tag")
public class MyPluginMainClass implements ARGOPlugin {

    @Override
    public void doSomething(String doThis, String[] params) {

    }
}
