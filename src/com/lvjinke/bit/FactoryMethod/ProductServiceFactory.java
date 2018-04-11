package com.lvjinke.bit.FactoryMethod;

public class ProductServiceFactory extends ServiceFactory {
    Service service = null;
    @Override
    public <T extends Service> T creatService(Class<T> c) {
        try{
            service = (Service) Class.forName(c.getName()).newInstance();
            //service.getClass();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return (T) service;
    }
}
