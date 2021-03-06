package com.oracle.demo.model;

import java.math.BigDecimal;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 05 12:16:51 CST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpDetailsRowImpl extends ViewRowImpl {
    public static final int ENTITY_EMPLOYEES = 0;
    public static final int ENTITY_DEPARTMENTS = 1;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EmployeeId {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setEmployeeId((Integer)value);
            }
        }
        ,
        FirstName {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getFirstName();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getLastName();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        Email {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getEmail();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        Salary {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getSalary();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setSalary((BigDecimal)value);
            }
        }
        ,
        HireDate {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getHireDate();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setHireDate((Timestamp)value);
            }
        }
        ,
        JobId {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getJobId();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setJobId((String)value);
            }
        }
        ,
        DepartmentId {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setDepartmentId((Integer)value);
            }
        }
        ,
        DepartmentName {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        AnnualSalary {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getAnnualSalary();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setAnnualSalary((Number)value);
            }
        }
        ,
        JobsView1 {
            public Object get(EmpDetailsRowImpl obj) {
                return obj.getJobsView1();
            }

            public void put(EmpDetailsRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(EmpDetailsRowImpl object);

        public abstract void put(EmpDetailsRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int ANNUALSALARY = AttributesEnum.AnnualSalary.index();
    public static final int JOBSVIEW1 = AttributesEnum.JobsView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmpDetailsRowImpl() {
    }

    /**
     * Gets Employees entity object.
     * @return the Employees
     */
    public EntityImpl getEmployees() {
        return (EntityImpl)getEntity(ENTITY_EMPLOYEES);
    }

    /**
     * Gets Departments entity object.
     * @return the Departments
     */
    public EntityImpl getDepartments() {
        return (EntityImpl)getEntity(ENTITY_DEPARTMENTS);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return the FIRST_NAME
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value value to set the FIRST_NAME
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return the LAST_NAME
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value value to set the LAST_NAME
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for EMAIL using the alias name Email.
     * @return the EMAIL
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value value to set the EMAIL
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for SALARY using the alias name Salary.
     * @return the SALARY
     */
    public BigDecimal getSalary() {
        return (BigDecimal) getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as attribute value for SALARY using the alias name Salary.
     * @param value value to set the SALARY
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for HIRE_DATE using the alias name HireDate.
     * @return the HIRE_DATE
     */
    public Timestamp getHireDate() {
        return (Timestamp) getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for HIRE_DATE using the alias name HireDate.
     * @param value value to set the HIRE_DATE
     */
    public void setHireDate(Timestamp value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for JOB_ID using the alias name JobId.
     * @return the JOB_ID
     */
    public String getJobId() {
        return (String) getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_ID using the alias name JobId.
     * @param value value to set the JOB_ID
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @return the DEPARTMENT_ID
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @param value value to set the DEPARTMENT_ID
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @return the DEPARTMENT_NAME
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @param value value to set the DEPARTMENT_NAME
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AnnualSalary.
     * @return the AnnualSalary
     */
    public Number getAnnualSalary() {
        return (Number) getAttributeInternal(ANNUALSALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AnnualSalary.
     * @param value value to set the  AnnualSalary
     */
    public void setAnnualSalary(Number value) {
        setAttributeInternal(ANNUALSALARY, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> JobsView1.
     */
    public RowSet getJobsView1() {
        return (RowSet)getAttributeInternal(JOBSVIEW1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
