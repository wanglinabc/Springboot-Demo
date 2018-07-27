package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause( String orderByClause ) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct( boolean distinct ) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or( Criteria criteria ) {
        oredCriteria.add( criteria );
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add( criteria );
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add( criteria );
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

        protected void addCriterion( String condition ) {
            if (condition == null) {
                throw new RuntimeException( "Value for condition cannot be null" );
            }
            criteria.add( new Criterion( condition ) );
        }

        protected void addCriterion( String condition, Object value, String property ) {
            if (value == null) {
                throw new RuntimeException( "Value for " + property + " cannot be null" );
            }
            criteria.add( new Criterion( condition, value ) );
        }

        protected void addCriterion( String condition, Object value1, Object value2, String property ) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException( "Between values for " + property + " cannot be null" );
            }
            criteria.add( new Criterion( condition, value1, value2 ) );
        }

        public Criteria andUseridIsNull() {
            addCriterion( "userid is null" );
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion( "userid is not null" );
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo( Integer value ) {
            addCriterion( "userid =", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo( Integer value ) {
            addCriterion( "userid <>", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan( Integer value ) {
            addCriterion( "userid >", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "userid >=", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridLessThan( Integer value ) {
            addCriterion( "userid <", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo( Integer value ) {
            addCriterion( "userid <=", value, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridIn( List<Integer> values ) {
            addCriterion( "userid in", values, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridNotIn( List<Integer> values ) {
            addCriterion( "userid not in", values, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridBetween( Integer value1, Integer value2 ) {
            addCriterion( "userid between", value1, value2, "userid" );
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "userid not between", value1, value2, "userid" );
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion( "phone is null" );
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion( "phone is not null" );
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo( String value ) {
            addCriterion( "phone =", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo( String value ) {
            addCriterion( "phone <>", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan( String value ) {
            addCriterion( "phone >", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo( String value ) {
            addCriterion( "phone >=", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan( String value ) {
            addCriterion( "phone <", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo( String value ) {
            addCriterion( "phone <=", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneLike( String value ) {
            addCriterion( "phone like", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike( String value ) {
            addCriterion( "phone not like", value, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneIn( List<String> values ) {
            addCriterion( "phone in", values, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn( List<String> values ) {
            addCriterion( "phone not in", values, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneBetween( String value1, String value2 ) {
            addCriterion( "phone between", value1, value2, "phone" );
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween( String value1, String value2 ) {
            addCriterion( "phone not between", value1, value2, "phone" );
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion( "password is null" );
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion( "password is not null" );
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo( String value ) {
            addCriterion( "password =", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo( String value ) {
            addCriterion( "password <>", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan( String value ) {
            addCriterion( "password >", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo( String value ) {
            addCriterion( "password >=", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan( String value ) {
            addCriterion( "password <", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo( String value ) {
            addCriterion( "password <=", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordLike( String value ) {
            addCriterion( "password like", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike( String value ) {
            addCriterion( "password not like", value, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordIn( List<String> values ) {
            addCriterion( "password in", values, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn( List<String> values ) {
            addCriterion( "password not in", values, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordBetween( String value1, String value2 ) {
            addCriterion( "password between", value1, value2, "password" );
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween( String value1, String value2 ) {
            addCriterion( "password not between", value1, value2, "password" );
            return (Criteria) this;
        }

        public Criteria andTradepwdIsNull() {
            addCriterion( "tradepwd is null" );
            return (Criteria) this;
        }

        public Criteria andTradepwdIsNotNull() {
            addCriterion( "tradepwd is not null" );
            return (Criteria) this;
        }

        public Criteria andTradepwdEqualTo( String value ) {
            addCriterion( "tradepwd =", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdNotEqualTo( String value ) {
            addCriterion( "tradepwd <>", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdGreaterThan( String value ) {
            addCriterion( "tradepwd >", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdGreaterThanOrEqualTo( String value ) {
            addCriterion( "tradepwd >=", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdLessThan( String value ) {
            addCriterion( "tradepwd <", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdLessThanOrEqualTo( String value ) {
            addCriterion( "tradepwd <=", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdLike( String value ) {
            addCriterion( "tradepwd like", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdNotLike( String value ) {
            addCriterion( "tradepwd not like", value, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdIn( List<String> values ) {
            addCriterion( "tradepwd in", values, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdNotIn( List<String> values ) {
            addCriterion( "tradepwd not in", values, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdBetween( String value1, String value2 ) {
            addCriterion( "tradepwd between", value1, value2, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andTradepwdNotBetween( String value1, String value2 ) {
            addCriterion( "tradepwd not between", value1, value2, "tradepwd" );
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion( "name is null" );
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion( "name is not null" );
            return (Criteria) this;
        }

        public Criteria andNameEqualTo( String value ) {
            addCriterion( "name =", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo( String value ) {
            addCriterion( "name <>", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan( String value ) {
            addCriterion( "name >", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo( String value ) {
            addCriterion( "name >=", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLessThan( String value ) {
            addCriterion( "name <", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo( String value ) {
            addCriterion( "name <=", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameLike( String value ) {
            addCriterion( "name like", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotLike( String value ) {
            addCriterion( "name not like", value, "name" );
            return (Criteria) this;
        }

        public Criteria andNameIn( List<String> values ) {
            addCriterion( "name in", values, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotIn( List<String> values ) {
            addCriterion( "name not in", values, "name" );
            return (Criteria) this;
        }

        public Criteria andNameBetween( String value1, String value2 ) {
            addCriterion( "name between", value1, value2, "name" );
            return (Criteria) this;
        }

        public Criteria andNameNotBetween( String value1, String value2 ) {
            addCriterion( "name not between", value1, value2, "name" );
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion( "logo is null" );
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion( "logo is not null" );
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo( String value ) {
            addCriterion( "logo =", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo( String value ) {
            addCriterion( "logo <>", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan( String value ) {
            addCriterion( "logo >", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo( String value ) {
            addCriterion( "logo >=", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoLessThan( String value ) {
            addCriterion( "logo <", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo( String value ) {
            addCriterion( "logo <=", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoLike( String value ) {
            addCriterion( "logo like", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoNotLike( String value ) {
            addCriterion( "logo not like", value, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoIn( List<String> values ) {
            addCriterion( "logo in", values, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoNotIn( List<String> values ) {
            addCriterion( "logo not in", values, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoBetween( String value1, String value2 ) {
            addCriterion( "logo between", value1, value2, "logo" );
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween( String value1, String value2 ) {
            addCriterion( "logo not between", value1, value2, "logo" );
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion( "type is null" );
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion( "type is not null" );
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo( Integer value ) {
            addCriterion( "type =", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo( Integer value ) {
            addCriterion( "type <>", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan( Integer value ) {
            addCriterion( "type >", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "type >=", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeLessThan( Integer value ) {
            addCriterion( "type <", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo( Integer value ) {
            addCriterion( "type <=", value, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeIn( List<Integer> values ) {
            addCriterion( "type in", values, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeNotIn( List<Integer> values ) {
            addCriterion( "type not in", values, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeBetween( Integer value1, Integer value2 ) {
            addCriterion( "type between", value1, value2, "type" );
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "type not between", value1, value2, "type" );
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion( "templateId is null" );
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion( "templateId is not null" );
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo( Integer value ) {
            addCriterion( "templateId =", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo( Integer value ) {
            addCriterion( "templateId <>", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan( Integer value ) {
            addCriterion( "templateId >", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "templateId >=", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan( Integer value ) {
            addCriterion( "templateId <", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo( Integer value ) {
            addCriterion( "templateId <=", value, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidIn( List<Integer> values ) {
            addCriterion( "templateId in", values, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn( List<Integer> values ) {
            addCriterion( "templateId not in", values, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween( Integer value1, Integer value2 ) {
            addCriterion( "templateId between", value1, value2, "templateid" );
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "templateId not between", value1, value2, "templateid" );
            return (Criteria) this;
        }

        public Criteria andAuthstateIsNull() {
            addCriterion( "authState is null" );
            return (Criteria) this;
        }

        public Criteria andAuthstateIsNotNull() {
            addCriterion( "authState is not null" );
            return (Criteria) this;
        }

        public Criteria andAuthstateEqualTo( Integer value ) {
            addCriterion( "authState =", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateNotEqualTo( Integer value ) {
            addCriterion( "authState <>", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThan( Integer value ) {
            addCriterion( "authState >", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "authState >=", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThan( Integer value ) {
            addCriterion( "authState <", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThanOrEqualTo( Integer value ) {
            addCriterion( "authState <=", value, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateIn( List<Integer> values ) {
            addCriterion( "authState in", values, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateNotIn( List<Integer> values ) {
            addCriterion( "authState not in", values, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateBetween( Integer value1, Integer value2 ) {
            addCriterion( "authState between", value1, value2, "authstate" );
            return (Criteria) this;
        }

        public Criteria andAuthstateNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "authState not between", value1, value2, "authstate" );
            return (Criteria) this;
        }

        public Criteria andIdnumIsNull() {
            addCriterion( "idNum is null" );
            return (Criteria) this;
        }

        public Criteria andIdnumIsNotNull() {
            addCriterion( "idNum is not null" );
            return (Criteria) this;
        }

        public Criteria andIdnumEqualTo( String value ) {
            addCriterion( "idNum =", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumNotEqualTo( String value ) {
            addCriterion( "idNum <>", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThan( String value ) {
            addCriterion( "idNum >", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThanOrEqualTo( String value ) {
            addCriterion( "idNum >=", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumLessThan( String value ) {
            addCriterion( "idNum <", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumLessThanOrEqualTo( String value ) {
            addCriterion( "idNum <=", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumLike( String value ) {
            addCriterion( "idNum like", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumNotLike( String value ) {
            addCriterion( "idNum not like", value, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumIn( List<String> values ) {
            addCriterion( "idNum in", values, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumNotIn( List<String> values ) {
            addCriterion( "idNum not in", values, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumBetween( String value1, String value2 ) {
            addCriterion( "idNum between", value1, value2, "idnum" );
            return (Criteria) this;
        }

        public Criteria andIdnumNotBetween( String value1, String value2 ) {
            addCriterion( "idNum not between", value1, value2, "idnum" );
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion( "realName is null" );
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion( "realName is not null" );
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo( String value ) {
            addCriterion( "realName =", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo( String value ) {
            addCriterion( "realName <>", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan( String value ) {
            addCriterion( "realName >", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo( String value ) {
            addCriterion( "realName >=", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan( String value ) {
            addCriterion( "realName <", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo( String value ) {
            addCriterion( "realName <=", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameLike( String value ) {
            addCriterion( "realName like", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike( String value ) {
            addCriterion( "realName not like", value, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameIn( List<String> values ) {
            addCriterion( "realName in", values, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn( List<String> values ) {
            addCriterion( "realName not in", values, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameBetween( String value1, String value2 ) {
            addCriterion( "realName between", value1, value2, "realname" );
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween( String value1, String value2 ) {
            addCriterion( "realName not between", value1, value2, "realname" );
            return (Criteria) this;
        }

        public Criteria andFrontimgIsNull() {
            addCriterion( "frontImg is null" );
            return (Criteria) this;
        }

        public Criteria andFrontimgIsNotNull() {
            addCriterion( "frontImg is not null" );
            return (Criteria) this;
        }

        public Criteria andFrontimgEqualTo( String value ) {
            addCriterion( "frontImg =", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgNotEqualTo( String value ) {
            addCriterion( "frontImg <>", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgGreaterThan( String value ) {
            addCriterion( "frontImg >", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgGreaterThanOrEqualTo( String value ) {
            addCriterion( "frontImg >=", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgLessThan( String value ) {
            addCriterion( "frontImg <", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgLessThanOrEqualTo( String value ) {
            addCriterion( "frontImg <=", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgLike( String value ) {
            addCriterion( "frontImg like", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgNotLike( String value ) {
            addCriterion( "frontImg not like", value, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgIn( List<String> values ) {
            addCriterion( "frontImg in", values, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgNotIn( List<String> values ) {
            addCriterion( "frontImg not in", values, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgBetween( String value1, String value2 ) {
            addCriterion( "frontImg between", value1, value2, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andFrontimgNotBetween( String value1, String value2 ) {
            addCriterion( "frontImg not between", value1, value2, "frontimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgIsNull() {
            addCriterion( "reverseImg is null" );
            return (Criteria) this;
        }

        public Criteria andReverseimgIsNotNull() {
            addCriterion( "reverseImg is not null" );
            return (Criteria) this;
        }

        public Criteria andReverseimgEqualTo( String value ) {
            addCriterion( "reverseImg =", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgNotEqualTo( String value ) {
            addCriterion( "reverseImg <>", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgGreaterThan( String value ) {
            addCriterion( "reverseImg >", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgGreaterThanOrEqualTo( String value ) {
            addCriterion( "reverseImg >=", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgLessThan( String value ) {
            addCriterion( "reverseImg <", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgLessThanOrEqualTo( String value ) {
            addCriterion( "reverseImg <=", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgLike( String value ) {
            addCriterion( "reverseImg like", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgNotLike( String value ) {
            addCriterion( "reverseImg not like", value, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgIn( List<String> values ) {
            addCriterion( "reverseImg in", values, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgNotIn( List<String> values ) {
            addCriterion( "reverseImg not in", values, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgBetween( String value1, String value2 ) {
            addCriterion( "reverseImg between", value1, value2, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andReverseimgNotBetween( String value1, String value2 ) {
            addCriterion( "reverseImg not between", value1, value2, "reverseimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgIsNull() {
            addCriterion( "fullImg is null" );
            return (Criteria) this;
        }

        public Criteria andFullimgIsNotNull() {
            addCriterion( "fullImg is not null" );
            return (Criteria) this;
        }

        public Criteria andFullimgEqualTo( String value ) {
            addCriterion( "fullImg =", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgNotEqualTo( String value ) {
            addCriterion( "fullImg <>", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgGreaterThan( String value ) {
            addCriterion( "fullImg >", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgGreaterThanOrEqualTo( String value ) {
            addCriterion( "fullImg >=", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgLessThan( String value ) {
            addCriterion( "fullImg <", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgLessThanOrEqualTo( String value ) {
            addCriterion( "fullImg <=", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgLike( String value ) {
            addCriterion( "fullImg like", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgNotLike( String value ) {
            addCriterion( "fullImg not like", value, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgIn( List<String> values ) {
            addCriterion( "fullImg in", values, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgNotIn( List<String> values ) {
            addCriterion( "fullImg not in", values, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgBetween( String value1, String value2 ) {
            addCriterion( "fullImg between", value1, value2, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andFullimgNotBetween( String value1, String value2 ) {
            addCriterion( "fullImg not between", value1, value2, "fullimg" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkIsNull() {
            addCriterion( "authRemark is null" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkIsNotNull() {
            addCriterion( "authRemark is not null" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkEqualTo( String value ) {
            addCriterion( "authRemark =", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkNotEqualTo( String value ) {
            addCriterion( "authRemark <>", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkGreaterThan( String value ) {
            addCriterion( "authRemark >", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkGreaterThanOrEqualTo( String value ) {
            addCriterion( "authRemark >=", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkLessThan( String value ) {
            addCriterion( "authRemark <", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkLessThanOrEqualTo( String value ) {
            addCriterion( "authRemark <=", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkLike( String value ) {
            addCriterion( "authRemark like", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkNotLike( String value ) {
            addCriterion( "authRemark not like", value, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkIn( List<String> values ) {
            addCriterion( "authRemark in", values, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkNotIn( List<String> values ) {
            addCriterion( "authRemark not in", values, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkBetween( String value1, String value2 ) {
            addCriterion( "authRemark between", value1, value2, "authremark" );
            return (Criteria) this;
        }

        public Criteria andAuthremarkNotBetween( String value1, String value2 ) {
            addCriterion( "authRemark not between", value1, value2, "authremark" );
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion( "state is null" );
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion( "state is not null" );
            return (Criteria) this;
        }

        public Criteria andStateEqualTo( Integer value ) {
            addCriterion( "state =", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo( Integer value ) {
            addCriterion( "state <>", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan( Integer value ) {
            addCriterion( "state >", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "state >=", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateLessThan( Integer value ) {
            addCriterion( "state <", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo( Integer value ) {
            addCriterion( "state <=", value, "state" );
            return (Criteria) this;
        }

        public Criteria andStateIn( List<Integer> values ) {
            addCriterion( "state in", values, "state" );
            return (Criteria) this;
        }

        public Criteria andStateNotIn( List<Integer> values ) {
            addCriterion( "state not in", values, "state" );
            return (Criteria) this;
        }

        public Criteria andStateBetween( Integer value1, Integer value2 ) {
            addCriterion( "state between", value1, value2, "state" );
            return (Criteria) this;
        }

        public Criteria andStateNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "state not between", value1, value2, "state" );
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion( "referrer is null" );
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion( "referrer is not null" );
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo( Integer value ) {
            addCriterion( "referrer =", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo( Integer value ) {
            addCriterion( "referrer <>", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan( Integer value ) {
            addCriterion( "referrer >", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "referrer >=", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan( Integer value ) {
            addCriterion( "referrer <", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo( Integer value ) {
            addCriterion( "referrer <=", value, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerIn( List<Integer> values ) {
            addCriterion( "referrer in", values, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn( List<Integer> values ) {
            addCriterion( "referrer not in", values, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerBetween( Integer value1, Integer value2 ) {
            addCriterion( "referrer between", value1, value2, "referrer" );
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "referrer not between", value1, value2, "referrer" );
            return (Criteria) this;
        }

        public Criteria andFrozendayIsNull() {
            addCriterion( "frozenday is null" );
            return (Criteria) this;
        }

        public Criteria andFrozendayIsNotNull() {
            addCriterion( "frozenday is not null" );
            return (Criteria) this;
        }

        public Criteria andFrozendayEqualTo( Integer value ) {
            addCriterion( "frozenday =", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayNotEqualTo( Integer value ) {
            addCriterion( "frozenday <>", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayGreaterThan( Integer value ) {
            addCriterion( "frozenday >", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "frozenday >=", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayLessThan( Integer value ) {
            addCriterion( "frozenday <", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayLessThanOrEqualTo( Integer value ) {
            addCriterion( "frozenday <=", value, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayIn( List<Integer> values ) {
            addCriterion( "frozenday in", values, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayNotIn( List<Integer> values ) {
            addCriterion( "frozenday not in", values, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayBetween( Integer value1, Integer value2 ) {
            addCriterion( "frozenday between", value1, value2, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andFrozendayNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "frozenday not between", value1, value2, "frozenday" );
            return (Criteria) this;
        }

        public Criteria andXcodeIsNull() {
            addCriterion( "xcode is null" );
            return (Criteria) this;
        }

        public Criteria andXcodeIsNotNull() {
            addCriterion( "xcode is not null" );
            return (Criteria) this;
        }

        public Criteria andXcodeEqualTo( String value ) {
            addCriterion( "xcode =", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeNotEqualTo( String value ) {
            addCriterion( "xcode <>", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeGreaterThan( String value ) {
            addCriterion( "xcode >", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeGreaterThanOrEqualTo( String value ) {
            addCriterion( "xcode >=", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeLessThan( String value ) {
            addCriterion( "xcode <", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeLessThanOrEqualTo( String value ) {
            addCriterion( "xcode <=", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeLike( String value ) {
            addCriterion( "xcode like", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeNotLike( String value ) {
            addCriterion( "xcode not like", value, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeIn( List<String> values ) {
            addCriterion( "xcode in", values, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeNotIn( List<String> values ) {
            addCriterion( "xcode not in", values, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeBetween( String value1, String value2 ) {
            addCriterion( "xcode between", value1, value2, "xcode" );
            return (Criteria) this;
        }

        public Criteria andXcodeNotBetween( String value1, String value2 ) {
            addCriterion( "xcode not between", value1, value2, "xcode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNull() {
            addCriterion( "inviteCode is null" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNotNull() {
            addCriterion( "inviteCode is not null" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeEqualTo( String value ) {
            addCriterion( "inviteCode =", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotEqualTo( String value ) {
            addCriterion( "inviteCode <>", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThan( String value ) {
            addCriterion( "inviteCode >", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThanOrEqualTo( String value ) {
            addCriterion( "inviteCode >=", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThan( String value ) {
            addCriterion( "inviteCode <", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThanOrEqualTo( String value ) {
            addCriterion( "inviteCode <=", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeLike( String value ) {
            addCriterion( "inviteCode like", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotLike( String value ) {
            addCriterion( "inviteCode not like", value, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeIn( List<String> values ) {
            addCriterion( "inviteCode in", values, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotIn( List<String> values ) {
            addCriterion( "inviteCode not in", values, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeBetween( String value1, String value2 ) {
            addCriterion( "inviteCode between", value1, value2, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotBetween( String value1, String value2 ) {
            addCriterion( "inviteCode not between", value1, value2, "invitecode" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion( "createtime is null" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion( "createtime is not null" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo( Date value ) {
            addCriterion( "createtime =", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo( Date value ) {
            addCriterion( "createtime <>", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan( Date value ) {
            addCriterion( "createtime >", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo( Date value ) {
            addCriterion( "createtime >=", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan( Date value ) {
            addCriterion( "createtime <", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo( Date value ) {
            addCriterion( "createtime <=", value, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn( List<Date> values ) {
            addCriterion( "createtime in", values, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn( List<Date> values ) {
            addCriterion( "createtime not in", values, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween( Date value1, Date value2 ) {
            addCriterion( "createtime between", value1, value2, "createtime" );
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween( Date value1, Date value2 ) {
            addCriterion( "createtime not between", value1, value2, "createtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion( "endtime is null" );
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion( "endtime is not null" );
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo( Date value ) {
            addCriterion( "endtime =", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo( Date value ) {
            addCriterion( "endtime <>", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan( Date value ) {
            addCriterion( "endtime >", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo( Date value ) {
            addCriterion( "endtime >=", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan( Date value ) {
            addCriterion( "endtime <", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo( Date value ) {
            addCriterion( "endtime <=", value, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeIn( List<Date> values ) {
            addCriterion( "endtime in", values, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn( List<Date> values ) {
            addCriterion( "endtime not in", values, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween( Date value1, Date value2 ) {
            addCriterion( "endtime between", value1, value2, "endtime" );
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween( Date value1, Date value2 ) {
            addCriterion( "endtime not between", value1, value2, "endtime" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnIsNull() {
            addCriterion( "switchbtn is null" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnIsNotNull() {
            addCriterion( "switchbtn is not null" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnEqualTo( Integer value ) {
            addCriterion( "switchbtn =", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnNotEqualTo( Integer value ) {
            addCriterion( "switchbtn <>", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnGreaterThan( Integer value ) {
            addCriterion( "switchbtn >", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnGreaterThanOrEqualTo( Integer value ) {
            addCriterion( "switchbtn >=", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnLessThan( Integer value ) {
            addCriterion( "switchbtn <", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnLessThanOrEqualTo( Integer value ) {
            addCriterion( "switchbtn <=", value, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnIn( List<Integer> values ) {
            addCriterion( "switchbtn in", values, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnNotIn( List<Integer> values ) {
            addCriterion( "switchbtn not in", values, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnBetween( Integer value1, Integer value2 ) {
            addCriterion( "switchbtn between", value1, value2, "switchbtn" );
            return (Criteria) this;
        }

        public Criteria andSwitchbtnNotBetween( Integer value1, Integer value2 ) {
            addCriterion( "switchbtn not between", value1, value2, "switchbtn" );
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

        protected Criterion( String condition ) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion( String condition, Object value, String typeHandler ) {
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

        protected Criterion( String condition, Object value ) {
            this( condition, value, null );
        }

        protected Criterion( String condition, Object value, Object secondValue, String typeHandler ) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion( String condition, Object value, Object secondValue ) {
            this( condition, value, secondValue, null );
        }
    }
}