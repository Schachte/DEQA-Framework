package Servlet;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class activator implements BundleActivator {
    ServiceReference serviceReference;
    ServiceRegistration<activator> register;

    @Override
    public void start(BundleContext bundleContext) throws Exception {

        activator act = new activator();

        try {
            register = (ServiceRegistration<activator>) bundleContext.registerService(activator.class.getTypeName(), act, null);
            System.out.println("We are registering the client to use the greeter");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        register.unregister();
    }
}
