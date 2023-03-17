/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.people.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Loans}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Loans
 * @generated
 */
public class LoansWrapper
	extends BaseModelWrapper<Loans> implements Loans, ModelWrapper<Loans> {

	public LoansWrapper(Loans loans) {
		super(loans);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("peopleId", getPeopleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("birth", getBirth());
		attributes.put("total_loan", getTotal_loan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long peopleId = (Long)attributes.get("peopleId");

		if (peopleId != null) {
			setPeopleId(peopleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		Date birth = (Date)attributes.get("birth");

		if (birth != null) {
			setBirth(birth);
		}

		Float total_loan = (Float)attributes.get("total_loan");

		if (total_loan != null) {
			setTotal_loan(total_loan);
		}
	}

	@Override
	public Loans cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the birth of this loans.
	 *
	 * @return the birth of this loans
	 */
	@Override
	public Date getBirth() {
		return model.getBirth();
	}

	/**
	 * Returns the company ID of this loans.
	 *
	 * @return the company ID of this loans
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this loans.
	 *
	 * @return the create date of this loans
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this loans.
	 *
	 * @return the group ID of this loans
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this loans.
	 *
	 * @return the modified date of this loans
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this loans.
	 *
	 * @return the name of this loans
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the people ID of this loans.
	 *
	 * @return the people ID of this loans
	 */
	@Override
	public long getPeopleId() {
		return model.getPeopleId();
	}

	/**
	 * Returns the primary key of this loans.
	 *
	 * @return the primary key of this loans
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surname of this loans.
	 *
	 * @return the surname of this loans
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the total_loan of this loans.
	 *
	 * @return the total_loan of this loans
	 */
	@Override
	public float getTotal_loan() {
		return model.getTotal_loan();
	}

	/**
	 * Returns the user ID of this loans.
	 *
	 * @return the user ID of this loans
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this loans.
	 *
	 * @return the user name of this loans
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this loans.
	 *
	 * @return the user uuid of this loans
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this loans.
	 *
	 * @return the uuid of this loans
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birth of this loans.
	 *
	 * @param birth the birth of this loans
	 */
	@Override
	public void setBirth(Date birth) {
		model.setBirth(birth);
	}

	/**
	 * Sets the company ID of this loans.
	 *
	 * @param companyId the company ID of this loans
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this loans.
	 *
	 * @param createDate the create date of this loans
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this loans.
	 *
	 * @param groupId the group ID of this loans
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this loans.
	 *
	 * @param modifiedDate the modified date of this loans
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this loans.
	 *
	 * @param name the name of this loans
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the people ID of this loans.
	 *
	 * @param peopleId the people ID of this loans
	 */
	@Override
	public void setPeopleId(long peopleId) {
		model.setPeopleId(peopleId);
	}

	/**
	 * Sets the primary key of this loans.
	 *
	 * @param primaryKey the primary key of this loans
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surname of this loans.
	 *
	 * @param surname the surname of this loans
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the total_loan of this loans.
	 *
	 * @param total_loan the total_loan of this loans
	 */
	@Override
	public void setTotal_loan(float total_loan) {
		model.setTotal_loan(total_loan);
	}

	/**
	 * Sets the user ID of this loans.
	 *
	 * @param userId the user ID of this loans
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this loans.
	 *
	 * @param userName the user name of this loans
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this loans.
	 *
	 * @param userUuid the user uuid of this loans
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this loans.
	 *
	 * @param uuid the uuid of this loans
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected LoansWrapper wrap(Loans loans) {
		return new LoansWrapper(loans);
	}

}