package com.github.luisacpaim.citiesapi.cities;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface PointType2 {
    int[] sqlTypes();

    Class returnedClass();

    boolean equals(Object x, Object y) throws HibernateException;

    int hashCode(Object x) throws HibernateException;

    Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session,
                       Object owner) throws HibernateException, SQLException;

    void nullSafeSet(PreparedStatement st, Object value, int index,
                     SharedSessionContractImplementor session)
            throws HibernateException, SQLException;

    Object deepCopy(Object value) throws HibernateException;

    boolean isMutable();

    Serializable disassemble(Object value) throws HibernateException;

    Object assemble(Serializable cached, Object owner) throws HibernateException;

    Object replace(Object original, Object target, Object owner) throws HibernateException;
}
