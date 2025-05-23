
package com.mypackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SimpleInterestService", targetNamespace = "http://MyPackage.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SimpleInterestService {


    /**
     * 
     * @param prin
     * @param rat
     * @param numb
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculateSI", targetNamespace = "http://MyPackage.com/", className = "com.mypackage.CalculateSI")
    @ResponseWrapper(localName = "calculateSIResponse", targetNamespace = "http://MyPackage.com/", className = "com.mypackage.CalculateSIResponse")
    @Action(input = "http://MyPackage.com/SimpleInterestService/calculateSIRequest", output = "http://MyPackage.com/SimpleInterestService/calculateSIResponse")
    public double calculateSI(
        @WebParam(name = "prin", targetNamespace = "")
        double prin,
        @WebParam(name = "numb", targetNamespace = "")
        double numb,
        @WebParam(name = "rat", targetNamespace = "")
        double rat);

}
