package com.newcoder.forums.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("alphaDaoHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
