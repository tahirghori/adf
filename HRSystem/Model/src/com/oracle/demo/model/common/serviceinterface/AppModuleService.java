package com.oracle.demo.model.common.serviceinterface;

import com.oracle.demo.model.common.DepartmentsViewSDO;
import com.oracle.demo.model.common.EmpDetailsSDO;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 05 12:19:19 CST 2013
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace="/com/oracle/demo/model/common/", name="AppModuleService", wsdlLocation="com/oracle/demo/model/common/serviceinterface/AppModuleService.wsdl")
@SDODatabinding(schemaLocation="com/oracle/demo/model/common/serviceinterface/AppModuleService.xsd")
public interface AppModuleService {


    public static final String NAME = "{/com/oracle/demo/model/common/}AppModuleService";

    /**
     * Exported method getDepartments from AppModule.
     */
    @WebMethod(action="/com/oracle/demo/model/common/getDepartments", operationName="getDepartments")
    @RequestWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getDepartments")
    @ResponseWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getDepartmentsResponse")
    @WebResult(name="result")
    List<DepartmentsViewSDO> getDepartments() throws ServiceException;

    /**
     * Exported method getEmployee from AppModule.
     */
    @WebMethod(action="/com/oracle/demo/model/common/getEmployee", operationName="getEmployee")
    @RequestWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getEmployee")
    @ResponseWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getEmployeeResponse")
    @WebResult(name="result")
    EmpDetailsSDO getEmployee(@WebParam(mode = WebParam.Mode.IN, name="empId")
        Integer empId) throws ServiceException;

    /**
     * Exported method getEmployees from AppModule.
     */
    @WebMethod(action="/com/oracle/demo/model/common/getEmployees", operationName="getEmployees")
    @RequestWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getEmployees")
    @ResponseWrapper(targetNamespace="/com/oracle/demo/model/common/types/", localName="getEmployeesResponse")
    @WebResult(name="result")
    List<EmpDetailsSDO> getEmployees() throws ServiceException;
}
