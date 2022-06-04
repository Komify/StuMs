package com.jkh.j2eedemo.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GxxsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GxxsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andJnmIsNull() {
            addCriterion("jnm is null");
            return (Criteria) this;
        }

        public Criteria andJnmIsNotNull() {
            addCriterion("jnm is not null");
            return (Criteria) this;
        }

        public Criteria andJnmEqualTo(String value) {
            addCriterion("jnm =", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmNotEqualTo(String value) {
            addCriterion("jnm <>", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmGreaterThan(String value) {
            addCriterion("jnm >", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmGreaterThanOrEqualTo(String value) {
            addCriterion("jnm >=", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmLessThan(String value) {
            addCriterion("jnm <", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmLessThanOrEqualTo(String value) {
            addCriterion("jnm <=", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmLike(String value) {
            addCriterion("jnm like", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmNotLike(String value) {
            addCriterion("jnm not like", value, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmIn(List<String> values) {
            addCriterion("jnm in", values, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmNotIn(List<String> values) {
            addCriterion("jnm not in", values, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmBetween(String value1, String value2) {
            addCriterion("jnm between", value1, value2, "jnm");
            return (Criteria) this;
        }

        public Criteria andJnmNotBetween(String value1, String value2) {
            addCriterion("jnm not between", value1, value2, "jnm");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andDwhIsNull() {
            addCriterion("dwh is null");
            return (Criteria) this;
        }

        public Criteria andDwhIsNotNull() {
            addCriterion("dwh is not null");
            return (Criteria) this;
        }

        public Criteria andDwhEqualTo(String value) {
            addCriterion("dwh =", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotEqualTo(String value) {
            addCriterion("dwh <>", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThan(String value) {
            addCriterion("dwh >", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThanOrEqualTo(String value) {
            addCriterion("dwh >=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThan(String value) {
            addCriterion("dwh <", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThanOrEqualTo(String value) {
            addCriterion("dwh <=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLike(String value) {
            addCriterion("dwh like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotLike(String value) {
            addCriterion("dwh not like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhIn(List<String> values) {
            addCriterion("dwh in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotIn(List<String> values) {
            addCriterion("dwh not in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhBetween(String value1, String value2) {
            addCriterion("dwh between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotBetween(String value1, String value2) {
            addCriterion("dwh not between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andYwxmIsNull() {
            addCriterion("ywxm is null");
            return (Criteria) this;
        }

        public Criteria andYwxmIsNotNull() {
            addCriterion("ywxm is not null");
            return (Criteria) this;
        }

        public Criteria andYwxmEqualTo(String value) {
            addCriterion("ywxm =", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotEqualTo(String value) {
            addCriterion("ywxm <>", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmGreaterThan(String value) {
            addCriterion("ywxm >", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmGreaterThanOrEqualTo(String value) {
            addCriterion("ywxm >=", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLessThan(String value) {
            addCriterion("ywxm <", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLessThanOrEqualTo(String value) {
            addCriterion("ywxm <=", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLike(String value) {
            addCriterion("ywxm like", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotLike(String value) {
            addCriterion("ywxm not like", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmIn(List<String> values) {
            addCriterion("ywxm in", values, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotIn(List<String> values) {
            addCriterion("ywxm not in", values, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmBetween(String value1, String value2) {
            addCriterion("ywxm between", value1, value2, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotBetween(String value1, String value2) {
            addCriterion("ywxm not between", value1, value2, "ywxm");
            return (Criteria) this;
        }

        public Criteria andXmpyIsNull() {
            addCriterion("xmpy is null");
            return (Criteria) this;
        }

        public Criteria andXmpyIsNotNull() {
            addCriterion("xmpy is not null");
            return (Criteria) this;
        }

        public Criteria andXmpyEqualTo(String value) {
            addCriterion("xmpy =", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotEqualTo(String value) {
            addCriterion("xmpy <>", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThan(String value) {
            addCriterion("xmpy >", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThanOrEqualTo(String value) {
            addCriterion("xmpy >=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThan(String value) {
            addCriterion("xmpy <", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThanOrEqualTo(String value) {
            addCriterion("xmpy <=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLike(String value) {
            addCriterion("xmpy like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotLike(String value) {
            addCriterion("xmpy not like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyIn(List<String> values) {
            addCriterion("xmpy in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotIn(List<String> values) {
            addCriterion("xmpy not in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyBetween(String value1, String value2) {
            addCriterion("xmpy between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotBetween(String value1, String value2) {
            addCriterion("xmpy not between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andCymIsNull() {
            addCriterion("cym is null");
            return (Criteria) this;
        }

        public Criteria andCymIsNotNull() {
            addCriterion("cym is not null");
            return (Criteria) this;
        }

        public Criteria andCymEqualTo(String value) {
            addCriterion("cym =", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotEqualTo(String value) {
            addCriterion("cym <>", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThan(String value) {
            addCriterion("cym >", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThanOrEqualTo(String value) {
            addCriterion("cym >=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThan(String value) {
            addCriterion("cym <", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThanOrEqualTo(String value) {
            addCriterion("cym <=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLike(String value) {
            addCriterion("cym like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotLike(String value) {
            addCriterion("cym not like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymIn(List<String> values) {
            addCriterion("cym in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotIn(List<String> values) {
            addCriterion("cym not in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymBetween(String value1, String value2) {
            addCriterion("cym between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotBetween(String value1, String value2) {
            addCriterion("cym not between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterionForJDBCDate("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterionForJDBCDate("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterionForJDBCDate("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterionForJDBCDate("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsdIsNull() {
            addCriterion("csd is null");
            return (Criteria) this;
        }

        public Criteria andCsdIsNotNull() {
            addCriterion("csd is not null");
            return (Criteria) this;
        }

        public Criteria andCsdEqualTo(String value) {
            addCriterion("csd =", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotEqualTo(String value) {
            addCriterion("csd <>", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThan(String value) {
            addCriterion("csd >", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThanOrEqualTo(String value) {
            addCriterion("csd >=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThan(String value) {
            addCriterion("csd <", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThanOrEqualTo(String value) {
            addCriterion("csd <=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLike(String value) {
            addCriterion("csd like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotLike(String value) {
            addCriterion("csd not like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdIn(List<String> values) {
            addCriterion("csd in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotIn(List<String> values) {
            addCriterion("csd not in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdBetween(String value1, String value2) {
            addCriterion("csd between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotBetween(String value1, String value2) {
            addCriterion("csd not between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("jg is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("jg is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("jg =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("jg <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("jg >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("jg >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("jg <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("jg <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("jg like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("jg not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("jg in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("jg not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("jg between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("jg not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(String value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(String value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(String value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(String value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(String value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(String value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(String value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(String value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<String> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<String> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(String value1, String value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(String value1, String value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("gj is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("gj is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("gj =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("gj <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("gj >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("gj >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("gj <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("gj <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLike(String value) {
            addCriterion("gj like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotLike(String value) {
            addCriterion("gj not like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("gj in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("gj not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("gj between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("gj not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andSfzjlxIsNull() {
            addCriterion("sfzjlx is null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxIsNotNull() {
            addCriterion("sfzjlx is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxEqualTo(String value) {
            addCriterion("sfzjlx =", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxNotEqualTo(String value) {
            addCriterion("sfzjlx <>", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxGreaterThan(String value) {
            addCriterion("sfzjlx >", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxGreaterThanOrEqualTo(String value) {
            addCriterion("sfzjlx >=", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxLessThan(String value) {
            addCriterion("sfzjlx <", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxLessThanOrEqualTo(String value) {
            addCriterion("sfzjlx <=", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxLike(String value) {
            addCriterion("sfzjlx like", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxNotLike(String value) {
            addCriterion("sfzjlx not like", value, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxIn(List<String> values) {
            addCriterion("sfzjlx in", values, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxNotIn(List<String> values) {
            addCriterion("sfzjlx not in", values, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxBetween(String value1, String value2) {
            addCriterion("sfzjlx between", value1, value2, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjlxNotBetween(String value1, String value2) {
            addCriterion("sfzjlx not between", value1, value2, "sfzjlx");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNull() {
            addCriterion("sfzjh is null");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNotNull() {
            addCriterion("sfzjh is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjhEqualTo(String value) {
            addCriterion("sfzjh =", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotEqualTo(String value) {
            addCriterion("sfzjh <>", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThan(String value) {
            addCriterion("sfzjh >", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThanOrEqualTo(String value) {
            addCriterion("sfzjh >=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThan(String value) {
            addCriterion("sfzjh <", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThanOrEqualTo(String value) {
            addCriterion("sfzjh <=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLike(String value) {
            addCriterion("sfzjh like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotLike(String value) {
            addCriterion("sfzjh not like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhIn(List<String> values) {
            addCriterion("sfzjh in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotIn(List<String> values) {
            addCriterion("sfzjh not in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhBetween(String value1, String value2) {
            addCriterion("sfzjh between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotBetween(String value1, String value2) {
            addCriterion("sfzjh not between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("hyzk is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("hyzk is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("hyzk =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("hyzk <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("hyzk >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("hyzk >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("hyzk <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("hyzk <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("hyzk like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("hyzk not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("hyzk in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("hyzk not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("hyzk between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("hyzk not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("zzmm is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("zzmm is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("zzmm =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("zzmm <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("zzmm >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("zzmm >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("zzmm <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("zzmm <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("zzmm like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("zzmm not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("zzmm in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("zzmm not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("zzmm between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("zzmm not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNull() {
            addCriterion("jkzk is null");
            return (Criteria) this;
        }

        public Criteria andJkzkIsNotNull() {
            addCriterion("jkzk is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkEqualTo(String value) {
            addCriterion("jkzk =", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotEqualTo(String value) {
            addCriterion("jkzk <>", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThan(String value) {
            addCriterion("jkzk >", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkGreaterThanOrEqualTo(String value) {
            addCriterion("jkzk >=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThan(String value) {
            addCriterion("jkzk <", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLessThanOrEqualTo(String value) {
            addCriterion("jkzk <=", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkLike(String value) {
            addCriterion("jkzk like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotLike(String value) {
            addCriterion("jkzk not like", value, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkIn(List<String> values) {
            addCriterion("jkzk in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotIn(List<String> values) {
            addCriterion("jkzk not in", values, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkBetween(String value1, String value2) {
            addCriterion("jkzk between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andJkzkNotBetween(String value1, String value2) {
            addCriterion("jkzk not between", value1, value2, "jkzk");
            return (Criteria) this;
        }

        public Criteria andXyzjIsNull() {
            addCriterion("xyzj is null");
            return (Criteria) this;
        }

        public Criteria andXyzjIsNotNull() {
            addCriterion("xyzj is not null");
            return (Criteria) this;
        }

        public Criteria andXyzjEqualTo(String value) {
            addCriterion("xyzj =", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjNotEqualTo(String value) {
            addCriterion("xyzj <>", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjGreaterThan(String value) {
            addCriterion("xyzj >", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjGreaterThanOrEqualTo(String value) {
            addCriterion("xyzj >=", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjLessThan(String value) {
            addCriterion("xyzj <", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjLessThanOrEqualTo(String value) {
            addCriterion("xyzj <=", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjLike(String value) {
            addCriterion("xyzj like", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjNotLike(String value) {
            addCriterion("xyzj not like", value, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjIn(List<String> values) {
            addCriterion("xyzj in", values, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjNotIn(List<String> values) {
            addCriterion("xyzj not in", values, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjBetween(String value1, String value2) {
            addCriterion("xyzj between", value1, value2, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXyzjNotBetween(String value1, String value2) {
            addCriterion("xyzj not between", value1, value2, "xyzj");
            return (Criteria) this;
        }

        public Criteria andXxIsNull() {
            addCriterion("xx is null");
            return (Criteria) this;
        }

        public Criteria andXxIsNotNull() {
            addCriterion("xx is not null");
            return (Criteria) this;
        }

        public Criteria andXxEqualTo(String value) {
            addCriterion("xx =", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotEqualTo(String value) {
            addCriterion("xx <>", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxGreaterThan(String value) {
            addCriterion("xx >", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxGreaterThanOrEqualTo(String value) {
            addCriterion("xx >=", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxLessThan(String value) {
            addCriterion("xx <", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxLessThanOrEqualTo(String value) {
            addCriterion("xx <=", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxLike(String value) {
            addCriterion("xx like", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotLike(String value) {
            addCriterion("xx not like", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIn(List<String> values) {
            addCriterion("xx in", values, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotIn(List<String> values) {
            addCriterion("xx not in", values, "xx");
            return (Criteria) this;
        }

        public Criteria andXxBetween(String value1, String value2) {
            addCriterion("xx between", value1, value2, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotBetween(String value1, String value2) {
            addCriterion("xx not between", value1, value2, "xx");
            return (Criteria) this;
        }

        public Criteria andZjyxqIsNull() {
            addCriterion("zjyxq is null");
            return (Criteria) this;
        }

        public Criteria andZjyxqIsNotNull() {
            addCriterion("zjyxq is not null");
            return (Criteria) this;
        }

        public Criteria andZjyxqEqualTo(Date value) {
            addCriterionForJDBCDate("zjyxq =", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotEqualTo(Date value) {
            addCriterionForJDBCDate("zjyxq <>", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqGreaterThan(Date value) {
            addCriterionForJDBCDate("zjyxq >", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zjyxq >=", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqLessThan(Date value) {
            addCriterionForJDBCDate("zjyxq <", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zjyxq <=", value, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqIn(List<Date> values) {
            addCriterionForJDBCDate("zjyxq in", values, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotIn(List<Date> values) {
            addCriterionForJDBCDate("zjyxq not in", values, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zjyxq between", value1, value2, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andZjyxqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zjyxq not between", value1, value2, "zjyxq");
            return (Criteria) this;
        }

        public Criteria andSsbmIsNull() {
            addCriterion("ssbm is null");
            return (Criteria) this;
        }

        public Criteria andSsbmIsNotNull() {
            addCriterion("ssbm is not null");
            return (Criteria) this;
        }

        public Criteria andSsbmEqualTo(String value) {
            addCriterion("ssbm =", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotEqualTo(String value) {
            addCriterion("ssbm <>", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmGreaterThan(String value) {
            addCriterion("ssbm >", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmGreaterThanOrEqualTo(String value) {
            addCriterion("ssbm >=", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLessThan(String value) {
            addCriterion("ssbm <", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLessThanOrEqualTo(String value) {
            addCriterion("ssbm <=", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLike(String value) {
            addCriterion("ssbm like", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotLike(String value) {
            addCriterion("ssbm not like", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmIn(List<String> values) {
            addCriterion("ssbm in", values, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotIn(List<String> values) {
            addCriterion("ssbm not in", values, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmBetween(String value1, String value2) {
            addCriterion("ssbm between", value1, value2, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotBetween(String value1, String value2) {
            addCriterion("ssbm not between", value1, value2, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbjIsNull() {
            addCriterion("ssbj is null");
            return (Criteria) this;
        }

        public Criteria andSsbjIsNotNull() {
            addCriterion("ssbj is not null");
            return (Criteria) this;
        }

        public Criteria andSsbjEqualTo(String value) {
            addCriterion("ssbj =", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotEqualTo(String value) {
            addCriterion("ssbj <>", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjGreaterThan(String value) {
            addCriterion("ssbj >", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjGreaterThanOrEqualTo(String value) {
            addCriterion("ssbj >=", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLessThan(String value) {
            addCriterion("ssbj <", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLessThanOrEqualTo(String value) {
            addCriterion("ssbj <=", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjLike(String value) {
            addCriterion("ssbj like", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotLike(String value) {
            addCriterion("ssbj not like", value, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjIn(List<String> values) {
            addCriterion("ssbj in", values, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotIn(List<String> values) {
            addCriterion("ssbj not in", values, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjBetween(String value1, String value2) {
            addCriterion("ssbj between", value1, value2, "ssbj");
            return (Criteria) this;
        }

        public Criteria andSsbjNotBetween(String value1, String value2) {
            addCriterion("ssbj not between", value1, value2, "ssbj");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}