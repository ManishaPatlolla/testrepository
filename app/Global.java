import models.CacheObject;
import play.Application;
import play.GlobalSettings;
import play.Logger;

/**
 * Created by manisha on 7/6/2015.
 */
public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app)
    {

        Logger.info("Hello App");
        CacheObject cacheObject=new CacheObject();
        /* CacheObject cacheObject=new CacheObject();
        cacheObject.setClientId(null);
        cacheObject.setClientSecret(null);
        cacheObject.setExpiryDate(null);
        cacheObject.setToken(null);*/

    }
    @Override
    public void onStop(Application app)
    {

        Logger.info("end.....");
    }

}
