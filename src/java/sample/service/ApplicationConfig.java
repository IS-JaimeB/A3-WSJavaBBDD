/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author entrar
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(sample.service.CustomerFacadeREST.class);
        resources.add(sample.service.DiscountCodeFacadeREST.class);
        resources.add(sample.service.ManufacturerFacadeREST.class);
        resources.add(sample.service.MicroMarketFacadeREST.class);
        resources.add(sample.service.ProductCodeFacadeREST.class);
        resources.add(sample.service.ProductFacadeREST.class);
        resources.add(sample.service.PurchaseOrderFacadeREST.class);
    }
    
}
