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

package com.liferay.training.people.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.training.people.model.Loans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Loans in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LoansCacheModel implements CacheModel<Loans>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LoansCacheModel)) {
			return false;
		}

		LoansCacheModel loansCacheModel = (LoansCacheModel)object;

		if (peopleId == loansCacheModel.peopleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, peopleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", peopleId=");
		sb.append(peopleId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", birth=");
		sb.append(birth);
		sb.append(", total_loan=");
		sb.append(total_loan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Loans toEntityModel() {
		LoansImpl loansImpl = new LoansImpl();

		if (uuid == null) {
			loansImpl.setUuid("");
		}
		else {
			loansImpl.setUuid(uuid);
		}

		loansImpl.setPeopleId(peopleId);
		loansImpl.setGroupId(groupId);
		loansImpl.setCompanyId(companyId);
		loansImpl.setUserId(userId);

		if (userName == null) {
			loansImpl.setUserName("");
		}
		else {
			loansImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			loansImpl.setCreateDate(null);
		}
		else {
			loansImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			loansImpl.setModifiedDate(null);
		}
		else {
			loansImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			loansImpl.setName("");
		}
		else {
			loansImpl.setName(name);
		}

		if (surname == null) {
			loansImpl.setSurname("");
		}
		else {
			loansImpl.setSurname(surname);
		}

		if (birth == Long.MIN_VALUE) {
			loansImpl.setBirth(null);
		}
		else {
			loansImpl.setBirth(new Date(birth));
		}

		loansImpl.setTotal_loan(total_loan);

		loansImpl.resetOriginalValues();

		return loansImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		peopleId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		birth = objectInput.readLong();

		total_loan = objectInput.readFloat();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(peopleId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		objectOutput.writeLong(birth);

		objectOutput.writeFloat(total_loan);
	}

	public String uuid;
	public long peopleId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String surname;
	public long birth;
	public float total_loan;

}